package com.mycompany.invoise.repository.database;

import com.mycompany.invoise.entity.Invoice;
import com.mycompany.invoise.repository.InvoiceRepositoryInterface;
import com.mycompany.invoise.service.InvoiceServiceInterface;
import org.springframework.stereotype.Repository;

@Repository
public class InvoiceRepositoryDatabase implements InvoiceRepositoryInterface {
    @Override
    public void create(Invoice invoice) {
        System.out.println("FACTURE N° " + invoice.getNumber() + "\nCLIENT: " + invoice.getCustomerName() + "\nInsertion en BDD OK");
    }
}
