package com.mycompany.invoise.service;

import com.mycompany.invoise.entity.Invoice;
import com.mycompany.invoise.repository.InvoiceRepositoryInterface;

public class InvoiceServicePrefix implements InvoiceServiceInterface {
    private static long lastNumber = 112L;
    private InvoiceRepositoryInterface invoiceRepositoryMichel;

    public void setInvoiceRepository(InvoiceRepositoryInterface invoiceRepositoryMichel) {
        this.invoiceRepositoryMichel = invoiceRepositoryMichel;
    }

    @Override
    public void createInvoice(Invoice invoice) {

        invoice.setNumber("INV_" + (++lastNumber));
        invoiceRepositoryMichel.create(invoice);
    }
}
