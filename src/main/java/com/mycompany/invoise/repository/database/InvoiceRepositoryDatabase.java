package com.mycompany.invoise.repository.database;

import com.mycompany.invoise.entity.Invoice;
import com.mycompany.invoise.repository.InvoiceRepositoryInterface;
import com.mycompany.invoise.service.InvoiceServiceInterface;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class InvoiceRepositoryDatabase implements InvoiceRepositoryInterface {
    @Override
    public void create(Invoice invoice) {
        System.out.println("FACTURE N° " + invoice.getNumber() + "\nCLIENT: " + invoice.getCustomerName() + "\nInsertion en BDD OK");
    }

    @Override
    public List<Invoice> list() {
        Invoice invoice1 = new Invoice();
        invoice1.setNumber("INV-0001");
        invoice1.setCustomerName("Michel");
        Invoice invoice2 = new Invoice();
        invoice2.setNumber("INV-0002");
        invoice2.setCustomerName("Tesla");
        return List.of(invoice1, invoice2);
    }
}
