package com.mycompany.invoise.repository;

import com.mycompany.invoise.entity.Invoice;

public class InvoiceRepositoryMichel {

    public void create (Invoice invoice) {
        System.out.println("FACTURE N° "+ invoice.getNumber() + "\nCLIENT: " + invoice.getCustomerName()+ "\nInsertion en BDD OK");
    }
}
