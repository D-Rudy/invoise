package com.mycompany.invoise.service;

import com.mycompany.invoise.entity.Invoice;
import com.mycompany.invoise.repository.InvoiceRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;


public class InvoiceServicePrefix implements InvoiceServiceInterface {
    private long lastNumber = 112L;
    private String prefix;

    @Autowired
    private InvoiceRepositoryInterface invoiceRepositoryMichel;


    public long getLastNumber() {
        return lastNumber;
    }

    public void setLastNumber(long lastNumber) {
        this.lastNumber = lastNumber;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public void setInvoiceRepository(InvoiceRepositoryInterface invoiceRepositoryMichel) {
        this.invoiceRepositoryMichel = invoiceRepositoryMichel;
    }

    @Override
    public void createInvoice(Invoice invoice) {

        invoice.setNumber(prefix + (++lastNumber));
        invoiceRepositoryMichel.create(invoice);
    }
}
