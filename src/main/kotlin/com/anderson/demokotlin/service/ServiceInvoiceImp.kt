package com.anderson.demokotlin.service

import com.anderson.demokotlin.model.Invoice
import org.springframework.stereotype.Service
import java.time.LocalDate

@Service
class ServiceInvoiceImp: ServiceInvoice {


    var invoices: MutableList<Invoice> = initList();

    private fun initList(): MutableList<Invoice> {
        return mutableListOf(
                Invoice(1, "Invoice one", LocalDate.now()),
                Invoice(2, "Invoice two", LocalDate.now()),
                Invoice(3, "Invoice three", LocalDate.now()),
        )
    }

    override fun getAllInvoice(description: String): List<Invoice> {
        return invoices;
    }

    override fun addInvoice(invoice: Invoice): Invoice {
        this.invoices.add(invoice);
        return invoice;
    }

    override fun removeInvoice(id: Int) {
        this.invoices.removeIf { t: Invoice -> t.id == id }
    }

    override fun putInvoice(invoice: Invoice){
        val ret = getInvoice(invoice.id);
        ret?.description = invoice.description
        ret?.id = invoice.id
    }

    override fun getInvoice(id: Int): Invoice? {
        return this.invoices.find { invoice -> invoice.id == id };
    }
}