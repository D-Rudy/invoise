package com.mycompany.invoise;

import com.mycompany.invoise.controller.InvoiceController;
import com.mycompany.invoise.controller.InvoiceControllerChambouletoutMagasin2;
import com.mycompany.invoise.controller.InvoiceControllerMichel;
import com.mycompany.invoise.repository.InvoiceRepository;
import com.mycompany.invoise.repository.InvoiceRepositoryMichel;
import com.mycompany.invoise.service.InvoiceService;
import com.mycompany.invoise.service.InvoiceServiceMichel;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        System.out.println("Dans quelle configuration êtes-vous?");
        Scanner sc = new Scanner(System.in);
        int configuration = sc.nextInt();

        if(configuration == 1){
            InvoiceController invoiceController = new InvoiceController();
            InvoiceService invoiceService = new InvoiceService();
            invoiceController.setInvoiceService(invoiceService);
            InvoiceRepository invoiceRepository = new InvoiceRepository();
            invoiceService.setInvoiceRepository(invoiceRepository);
            invoiceController.createInvoice();
        }
        else if (configuration==2) {
            InvoiceControllerMichel invoiceControllerMichel = new InvoiceControllerMichel();
            InvoiceServiceMichel invoiceServiceMichel = new InvoiceServiceMichel();
            invoiceControllerMichel.setInvoiceService(invoiceServiceMichel);
            InvoiceRepositoryMichel invoiceRepositoryMichel = new InvoiceRepositoryMichel();
            invoiceServiceMichel.setInvoiceRepositoryMichel(invoiceRepositoryMichel);
            invoiceControllerMichel.createInvoice();
        }
        else if (configuration==3) {
            InvoiceControllerMichel invoiceControllerMichel = new InvoiceControllerMichel();
            InvoiceService invoiceServiceMichel = new InvoiceService();
            invoiceControllerMichel.setInvoiceService(invoiceServiceMichel);
            InvoiceRepositoryMichel invoiceRepositoryMichel = new InvoiceRepositoryMichel();
            invoiceServiceMichel.setInvoiceRepository(invoiceRepositoryMichel);
            invoiceControllerMichel.createInvoice();
        }
        else if (configuration==4) {
            InvoiceControllerChambouletoutMagasin2 invoiceController = new InvoiceControllerChambouletoutMagasin2();
            InvoiceService invoiceService = new InvoiceService();
            invoiceController.setInvoiceService(invoiceService);
            InvoiceRepositoryMichel invoiceRepositoryMichel = new InvoiceRepositoryMichel();
            invoiceService.setInvoiceRepository(invoiceRepositoryMichel);
            invoiceController.createInvoice();
        }
    }
}
