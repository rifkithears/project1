package s2;

public class MethodOverloading {
    public static void main(String[] args) {
        
        sayHello();
        sayHello("Muhammad");
        sayHello("Muhammad","Rifki");
    }

    static void sayHello(){
        System.out.println("Hello World");
    }

    static void sayHello(String firstname){
        System.out.println("Hello " + firstname);
    }
    static void sayHello(String firstname, String lastname){
        System.out.println("Hello " + firstname  +" "+lastname);
    }

}
