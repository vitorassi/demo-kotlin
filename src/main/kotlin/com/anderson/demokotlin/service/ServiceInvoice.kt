package com.anderson.demokotlin.service

import com.anderson.demokotlin.model.Invoice
import org.springframework.stereotype.Service

@Service
interface ServiceInvoice {

    fun getAllInvoice(description: String): List<Invoice>

    fun addInvoice(invoice: Invoice): Invoice

    fun removeInvoice(id: Int)

    fun getInvoice(id: Int): Invoice?

    fun putInvoice(invoice: Invoice)

}