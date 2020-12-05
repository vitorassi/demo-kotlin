package com.anderson.demokotlin.controller

import com.anderson.demokotlin.model.Invoice
import com.anderson.demokotlin.service.ServiceInvoice
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/invoice")
class ControllerIncoice {

    @Autowired
    private val serviceInvoice: ServiceInvoice? = null

    @GetMapping
    fun getList(): List<Invoice> {

        val allInvoice = serviceInvoice!!.getAllInvoice("teste")

        return allInvoice;
    }


    @PostMapping
    fun pos(@RequestBody invoice: Invoice): Invoice {

        val ret = serviceInvoice!!.addInvoice(invoice);

        return ret;
    }

    @DeleteMapping("/{id}")
    fun delete( @PathVariable id:Int ){
        serviceInvoice!!.removeInvoice(id)
    }

    @GetMapping("/{id}")
    fun get( @PathVariable id:Int ): Invoice?{
        return serviceInvoice!!.getInvoice(id)
    }

    @PutMapping("/{id}")
    fun put( @RequestBody invoice: Invoice){
        serviceInvoice!!.putInvoice(invoice)
    }

}