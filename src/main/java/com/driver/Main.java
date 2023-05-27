package com.driver;

   class A{
    public String meth(){
        return "Invoking method from class A";
    }
}
   class B extends A{
    public String meth(){
        return "Invoking method from class A";
    }
}
public class Main {
    public static void main(String[] args) {
        B b=new B();
        System.out.println(b.meth());

    }
  
}