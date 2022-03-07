import models.Customers;
import models.Devices;
import models.Order;

import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {
        ArrayList<Order> orderArrayList= new ArrayList<>();
        Customers customers = new Customers("Siam","U8434834","Khagan");
      Devices devices = new Devices("OnePlus 7","OnePlus");
//        Devices devices1= new Devices("Apple","Iphone 12");
        Order order= new Order("O239293","1/02/2022");
        Order order1 = new Order("O9323","03/03/2022");
        orderArrayList.add(order);
        orderArrayList.add(order1);
        customers.setDevices(devices);
        customers.setOrders(orderArrayList);
        System.out.println(customers);

    }
}
