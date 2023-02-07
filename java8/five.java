package java8;
  
interface interface_default {
       void display();
}
class derived_class{
 
    public void classMethod(){  
            System.out.println("Derived class Method");  
    }
}
class Main{
     public static void main(String[] args){
        derived_class obj1 = new derived_class();
        interface_default  ref = obj1::classMethod; 
        ref.display();
    }
}