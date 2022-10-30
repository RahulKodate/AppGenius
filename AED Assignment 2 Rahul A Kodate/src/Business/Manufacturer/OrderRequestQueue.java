/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Manufacturer;

import Business.Items.Item;
import Business.WorkQueue.WorkRequest;
import java.util.ArrayList;

/**
 *
 * @author srushtidesai
 */
public class OrderRequestQueue extends WorkRequest {
    ArrayList<Item> orderRequest ;
    Manufacturer manufacturer;
    static int id; 
  
    
    private static int cnt = 1;

    public OrderRequestQueue() 
    {
        this.orderRequest = new ArrayList();
        id = cnt;
        cnt++;
    }
    
    public Item addOrderedItem(Item item)
    {
        orderRequest.add(item);
        return item;
    }

    

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        OrderRequestQueue.id = id;
    }

    public ArrayList<Item> getOrderRequest() {
        return orderRequest;
    }

    public void setOrderRequest(ArrayList<Item> orderRequest) {
        this.orderRequest = orderRequest;
    }
    
    
    
    
    
   
}
