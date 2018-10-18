

public class Food extends MenuItem
{
    
    public Food(String name, float price)
    {
        super(name, price);
    }
    
    
    @Override
    public String toString()
    {
        return name + " " + price + "\n";
    }
}