package org.example;

@FunctionalInterface
public interface MyFunIterface {

    public void functionInterface();

    public static void hello(){};

   default void sayHello(){
       System.out.println("Say Hello Avadhut");
   };
}
