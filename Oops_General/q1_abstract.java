package Oops_General;
//abstract methods just declare we cant call in super class
//we have to overide the method of super class
abstract class Super
{
    public Super() { System.out.println("Super Constructor"); }
    
    public void meth1()
    {
        System.out.println("Meth1 of Super");
    }
    
    abstract public void meth2();
}

class Sub extends Super
{
    @Override
    public void meth2()
    {
        System.out.println("Sub meth2");
    }
}
public class  q1_abstract {
 
    public static void main(String[] args) 
    {
        Super s=new Sub();//constructor called
        s.meth1();
        s.meth2();
    }    
}
    

