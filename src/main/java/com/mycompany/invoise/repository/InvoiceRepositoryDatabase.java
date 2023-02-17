package com.mycompany.invoise.repository;

import com.mycompany.invoise.entity.Invoice;
import com.mycompany.invoise.service.InvoiceServiceInterface;

public class InvoiceRepositoryDatabase implements InvoiceRepositoryInterface {

    private InvoiceServiceInterface invoiceService;

    public InvoiceServiceInterface getInvoiceService() {
        return invoiceService;
    }

    public void setInvoiceService(InvoiceServiceInterface invoiceService) {
        this.invoiceService = invoiceService;
    }

    @Override
    public void create(Invoice invoice) {
        System.out.println("FACTURE N° " + invoice.getNumber() + "\nCLIENT: " + invoice.getCustomerName() + "\nInsertion en BDD OK");
    }
}
