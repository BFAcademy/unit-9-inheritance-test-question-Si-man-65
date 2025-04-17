public class Money
{
    private double val;

    public Money(double v)
    {
       val = v;
    }

    public double getAmount()
    {
        return val;
    }
}

class Coin extends Money
{
    private String name;
    public Coin(String n, double v)
    {
        super(v);
        name = n;
    }
    public String toString()
    {
        return name;
    }
    public String getName()
    {
        return name;
    }

    public boolean equals(Coin a)
    {
        if(a == null)
        {
            return false;
        }
        else if(this.getName().equals(a.getName()) && this.getAmount() == a.getAmount())
        {
            return true;
        }
        
            return false;
        
    }

}

//Coin classes for different coins (nickel,dime, etc)

class Quarter extends Coin
{
    public Quarter()
    {
        super("quarter", 0.25);
    }
}
class Dime extends Coin
{
    public Dime()
    {
        super("dime", 0.10);
    }
}
class Nickel extends Coin
{
    public Nickel()
    {
        super("nickel", 0.05);
    }
}

class Bill extends Money
{
    public Bill(double v)
    {
        super(v);
    }

    public String toString()
    {
        return "$" + this.getAmount();
    }

}
