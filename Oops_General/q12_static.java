package Oops_General;
//static means shared object every object has acces to same refernce data members
//if you change in once then it will change in other object also
//it wont create new when other object created
//memory efficient  
class Test
{
    static int x=10;
    int y=20;
    
    void show()
    {
        System.out.println(x+" "+y);
    }

}

public class q12_static {
        public static void main(String[] args) {
        
            Test t2=new Test();
            t2.show();
          
   

        
    }
    
}
