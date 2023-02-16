package com.mycompany.invoise.repository;

import com.mycompany.invoise.entity.Invoice;

import java.util.ArrayList;
import java.util.List;

public class InvoiceRepositoryMichel {
    private static List<Invoice> invoices = new ArrayList<Invoice>();
    public void create (Invoice invoice) {
        System.out.println("FACTURE N° "+ invoice.getNumber() + "\nCLIENT: " + invoice.getCustomerName()+ "\nInsertion en BDD OK");
    }
}
