package Structural.Facade;

import Structural.Facade.SubSystem.Invoice;
import Structural.Facade.SubSystem.Payment;
import Structural.Facade.SubSystem.ProductDAO;
import Structural.Facade.SubSystem.SendNotification;

public class OrderFacade {
    ProductDAO productDao;
    Payment payment;
    Invoice invoice;
    SendNotification sendNotification;

    public OrderFacade(){
        productDao = new ProductDAO();
        payment = new Payment();
        invoice = new Invoice();
        sendNotification = new SendNotification();
    }

    public void createOrder(){
        productDao.getProduct();
        payment.makePayment();
        invoice.generateInvoice();
        sendNotification.sendNotification();
    }
}
