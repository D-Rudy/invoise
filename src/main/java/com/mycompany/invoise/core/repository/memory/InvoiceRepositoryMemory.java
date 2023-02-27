package com.mycompany.invoise.core.repository.memory;

import com.mycompany.invoise.core.entity.Invoice;
import com.mycompany.invoise.core.repository.InvoiceRepositoryInterface;

import java.util.ArrayList;
import java.util.List;
//@Repository

public class InvoiceRepositoryMemory implements InvoiceRepositoryInterface {
    private final static List<Invoice> invoices = new ArrayList<>();

    public void create(Invoice invoice) {
        invoices.add(invoice);
        System.out.println("Invoice created with number " + invoice.getNumber() + " for " + invoice.getCustomerName());
    }

    @Override
    public List<Invoice> list() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public Invoice getById(String number) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
