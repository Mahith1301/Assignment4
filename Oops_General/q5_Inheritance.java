package Oops_General;
//inheritance is like child acquries datamember nad mehods of parent
class parent{
    public int a=2;
    public void meth1(){
        System.out.println(" in parent class");
    }
}
class child extends parent{
    public void meth2(){
        System.out.println(" in child class");
    }

}
//child can call parent datamember and methods of parent
public class q5_Inheritance {
 public static void main(String[] args) {
    child ch=new child();
    System.out.println(ch.a);
    ch.meth1();
    ch.meth2();
 }


}
