package multipalImplementation;

public interface A {
    default void sayHello(){
        System.out.println("Multiple implementation sayHello");
    }
}
