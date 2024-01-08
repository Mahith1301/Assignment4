package Oops_General;


//overloading means same method diff datatype of arguments passed
//both methods implemented are different but the name of method is same 
//based on number of arguments and datatype of arguments diff methods are implemented this is over loading 
class sum1{
    public Integer add(int x,int y){
        System.out.println("addition of two number ");
        return x+y;
    }
        public Integer add(int x,int y,int z){
        System.out.println("addition of three number ");
        return x+y+z;
    }
}



public class q8_overloading {
    public static void main(String[] args) {
        sum1 a=new sum1();
        System.out.println( a.add(1,2,3));
        System.out.println(a.add(1,2));

    }
}


