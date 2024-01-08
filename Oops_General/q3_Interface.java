package Oops_General;
//interface use implements  in interface we can initilize methods but we can implement methods in subclass
//interface is like sytandariudization
//in sub class we can add extra methods and extra than interfaces 
interface Test
{

    public abstract void meth1();
    public abstract void meth2();
    public static void meth3()
    {
        System.out.println("Meth3 of Test");
    }
}

//we have to overide meth1 and meth 2
class My implements Test
{
    public void meth1(){System.out.println("Meth1");}
    public void meth2(){System.out.println("Meth2");}
    public void meth4(){System.out.println("Meth4");}
}
public class q3_Interface 
{
    public static void main(String[] args) 
    {
        My m=new My();
        m.meth1();
        m.meth2();
        m.meth4();
    
        Test.meth3();
        
    }
}
