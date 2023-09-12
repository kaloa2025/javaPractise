package Overloading;
public class OL_area
{
    int l,r,b;
    public OL_area(int l,int b)
    {
        this.r=5;
        this.l=l;
        this.b=b;
    }
    public int getcircle()
    {
        return (2*3*this.r);
    }
    public int getsquare()
    {
        return (this.l*this.l);
    }
    public int getrectangle()
    {
        return (this.l*this.b);
    }
}