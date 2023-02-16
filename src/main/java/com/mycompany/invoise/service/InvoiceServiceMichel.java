package com.mycompany.invoise.service;

import com.mycompany.invoise.entity.Invoice;
import com.mycompany.invoise.repository.InvoiceRepositoryInterface;

public class InvoiceServiceMichel implements InvoiceServiceInterface{
    private static long lastNumber = 112L;

    public InvoiceRepositoryInterface getInvoiceRepositoryMichel() {
        return invoiceRepositoryMichel;
    }

    public void setInvoiceRepositoryMichel(InvoiceRepositoryInterface invoiceRepositoryMichel) {
        this.invoiceRepositoryMichel = invoiceRepositoryMichel;
    }

    private InvoiceRepositoryInterface invoiceRepositoryMichel;

    @Override
    public void createInvoice(Invoice invoice) {

        invoice.setNumber("INV_"+ (++lastNumber));
        invoiceRepositoryMichel.create(invoice);
    }
}
