package Oops_General;
//super will calll parents constructor
class Parent
{
    Parent()
    {
        System.out.println("Non-Param of parent");
    }

}

class Child extends Parent
{
    Child()
    {
        super();//super will call parent constructor
        System.out.println("Non-Param of child");
    }

}

public class q10_super {
    public static void main(String[] args) {
        Child ch=new Child();
        

    }
}
