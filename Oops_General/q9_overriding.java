package Oops_General;

//overriding is basically implemented in inheritance where child and parent both have same method name
//if both parent and child has same name child method will implement 
//we should write @override infront of method


class Super1
{
    Super1(){

    }
    public void display()
    {
        System.out.println("Super Display");
    }
}

class Sub1 extends Super1
{
    Sub1(){
        
    }
    @Override
    public void display()
    {
        System.out.println("Sub Display");
    }
}


public class q9_overriding {
    public static void main(String[] args) {

    Super1 s1=new Super1();
    s1.display();
    Sub1 s2=new Sub1();
    s2.display();
    Super1 s=new Sub1();
    s.display();
    }
}
