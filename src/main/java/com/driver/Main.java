package com.driver;

import com.sun.jdi.PathSearchingVirtualMachine;
class A{
        void meth(){

            System.out.println("Invoking method from class A");
        }
    }
   class B extends A{
        void meth() {

            System.out.println("Method is overridden in Extended class B");
        }

    }
public class Main {
    public static void main(String[] args) {
        B bk=new B();
        bk.meth();

    }
  
}