interface aa{
    void ok();
}
class A implements aa{

    void run(){
        System.out.println("Lets run A");
    }

    public void ok(){
        System.out.println("This is interface");
    }
}

class B extends A{

    void run(){
        System.out.println("Lets run B");
    }

}




public class overriding {

    public static void main(String[] args) {
        A obj=new B();
        obj.run();
        A obj1=new A();
        obj1.run();

        // B obj2=new A();

    }
    
}
