package Oops_General;
//abstraction hiding internal detaiuls showing only required data
//we can't directly asign values radius is private though methods we can give values 
//abstract is like concrete class for base class 

abstract class Shape
{
   abstract public double perimeter();
   abstract public double area();
}

class Circle extends Shape
{
    private double radius;
    public void setradius(int x){
        radius=x;
    }
    public double perimeter()
    {
        return 2*Math.PI*radius;
    }
    public double area()
    {
        return Math.PI*radius*radius;
    }
            
}

public class q6_abstraction {
public static void main(String[] args) {
    Circle c=new Circle();
    c.setradius(23);
    System.out.println(c.area());
    System.out.println(c.perimeter());

}
}
