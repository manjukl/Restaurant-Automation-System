
public class Drink extends MenuItem
{
    public Drink(String name, float price)
    {
        super(name, price);
    }
    
    @Override
    public String toString()
    {
        return name + " " + price + "\n";
    }
}