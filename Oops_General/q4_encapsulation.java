package Oops_General;
//encapsulation means security datamember and methods to be private and protected so that other class cant acees the data member or methods
//data hiding we use access modifier for data type and 
//use setter and getter method instead of directly aceesing class members
//only inside class datamembers are accessible so we use getter and setter methods 
//below example user cannot directly access datmember through methods we can set get data members
class student{
    private int id;
    public void setid(int x){
        id =x;
    }
    public void getid(){
        System.out.println(id);
    }

}
public class q4_encapsulation {

    public static void main(String[] args) {
        student s1=new student();
        s1.setid(3456);
        s1.getid();
    }
}
