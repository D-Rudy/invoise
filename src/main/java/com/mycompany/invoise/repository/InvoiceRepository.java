package com.mycompany.invoise.repository;

import com.mycompany.invoise.entity.Invoice;

import java.util.ArrayList;
import java.util.List;

public class InvoiceRepository implements InvoiceRepositoryInterface {
    private final static List<Invoice> invoices = new ArrayList<>();
    public void create (Invoice invoice) {
        invoices.add(invoice);
        System.out.println("Invoice created with number "+ invoice.getNumber() + " for " + invoice.getCustomerName());
    }
}
