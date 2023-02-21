package com.mycompany.invoise.controller.web;

import com.mycompany.invoise.controller.InvoiceControllerInterface;
import com.mycompany.invoise.entity.Invoice;
import com.mycompany.invoise.service.InvoiceServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD:src/main/java/com/mycompany/invoise/controller/web/InvoiceControllerWeb.java
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
=======
>>>>>>> a3d5886c8e1b7cb078d6bedaa489647c5960e525:src/main/java/com/mycompany/invoise/controller/InvoiceControllerWeb.java

@Controller
public class InvoiceControllerWeb implements InvoiceControllerInterface {

    @Autowired
    private InvoiceServiceInterface invoiceService;

    public InvoiceServiceInterface getInvoiceService() {
        return invoiceService;
    }

    public void setInvoiceService(InvoiceServiceInterface invoiceService) {
        this.invoiceService = invoiceService;
    }

    public void createInvoice(){
        String customerName = "Michel";
        Invoice invoice = new Invoice();
        invoice.setCustomerName(customerName);

        invoiceService.createInvoice(invoice);
    }
    @RequestMapping("/invoice-home")
    public String displayHome(){
        System.out.println("Hello from displayHome");
    return "";
    }
}
