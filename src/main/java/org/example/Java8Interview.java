package org.example;

public class Java8Interview implements ChildInterface {

    @Override
    public void functionInterface() {

    }

    @Override
    public void sayHello() {
        ChildInterface.super.sayHello();
    }
}
