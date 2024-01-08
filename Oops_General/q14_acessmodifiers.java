package Oops_General;
//private public protected default
//only protected public are acceed private members are not accessed
//access specifiers

class a{
    protected void msg(){
        System.out.println("hello protected");
    }
    public void msg1(){
        System.out.println("hello public");
    }
    private void msg2(){
        System.out.println("hello private");
    }
    
}

public class q14_acessmodifiers {
    public static void main(String[] args) {
        a a1=new a();
        a1.msg();
        a1.msg1();
        //a1.msg2();    //cant acess
    }
}
