package Oops_General;
//thiis referece to current object reference when they both have same name

class student{
    public int id;
    public String name;
    public void setinfo(int id,String name){
        this.id=id;
        this.name=name;
    }
    public void getinfo(){
        System.out.println(id);
        System.out.println(name);
    }

}
public class q11_this {
public static void main(String[] args) {
    student s1=new student();
    s1.setinfo(123,"santosh" );
    s1.getinfo();
    
}
}


