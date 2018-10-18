
public abstract class MenuItem
{
    protected String name;
    protected float price;
    
    public MenuItem(String n, float p)
    {
        this.name = n;
        this.price = p;
    }
    
    public String getName()
    {
        return name;
    }
    
    public float getPrice()
    {
        return price;
    }
    
    @Override
    public String toString()
    {
        return name + price;
    }
    
    
}