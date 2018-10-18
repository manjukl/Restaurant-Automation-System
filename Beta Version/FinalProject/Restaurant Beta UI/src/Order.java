
import java.util.ArrayList;

public class Order
{
    private ArrayList<MenuItem> orderItems;
    private Status status;
    private int orderNumber;
    public static int numofOrders = 0;
    public int Totalorders = 0;
    public Order()
    {
        if (numofOrders > 300)
        {
            numofOrders = 0;
        }
        numofOrders++;
        Totalorders++;
        orderItems = new ArrayList<MenuItem>();
        this.orderNumber = numofOrders;
    }
    
    public void addItem(MenuItem item)
    {
        orderItems.add(item);
    }
    
    public int getOrderNumber()
    {
        return orderNumber;
    }
    
    public ArrayList<MenuItem> getOrderItems()
    {
        return orderItems;
    }
    
    public Status getStatus()
    {
        return status;
    }
    
    public void setStatus(Status s)
    {
        status = s;
    }
    
    public float getTotalPrice()
    {
        float total = 0.00f;
        for(int i = 0; i < orderItems.size(); i++)
        {
            total += orderItems.get(i).getPrice();
        }
        return total;
    }
    
}