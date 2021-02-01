package com.company.poo.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ClientOrder {
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private ClientOrderStatus status;
    private final Date moment = new Date();

    private List<OrderItem> orderItemList = new ArrayList();
    private Client client;

    public ClientOrder(ClientOrderStatus status, Client client) {
        this.status = status;
        this.client = client;
    }

    public ClientOrderStatus getStatus() {
        return status;
    }

    public void setStatus(ClientOrderStatus status) {
        this.status = status;
    }

    public Date getMoment() {
        return moment;
    }

    public List<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void addItem(int quantity, double price, String productName){
        orderItemList.add(new OrderItem(quantity, new ProductItem(productName, price)));
    }
    public void removeItem(OrderItem orderItem){
        orderItemList.removeIf(x -> x.equals(orderItem));
    }
    public double total(){
       double sum = 0.00;
        for(OrderItem orderItem : orderItemList){
            sum+= orderItem.subTotal();
        }
        return sum;
    }
 @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Order Summary:").append("\n").append("Order Moment: ").append(getMoment())
                .append("\n").append("OrderStatus: ").append(status).append("\n")
                .append(client).append("\n")
                .append("Order Items:").append("\n");;
        for(OrderItem orderItem : orderItemList){
            sb.append(orderItem).append("\n");
        }
        sb.append("\n").append("Total Price: ").append(total()).append(" $");

        return sb.toString();
    }
}
