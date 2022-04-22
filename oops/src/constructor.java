final class constructor {

    static int a=25;
    // int b=35;
    final void run(){
        System.out.println("this is final");
    }
    public static void main(String[] args) {
        car c=new car("XYZ",123);
        car d=new car();
        car e=new car(52, 27);
        System.out.println(a);
        // System.out.println(b);
    }
    
}

class car {
    car(String name,int age){
        System.out.println(name + " " + age);
    }
    car(){
        System.out.println("this is overloading");
    }
    car(int a,int b){
        System.out.println(a+b);
    }
    void runn(){
        System.out.println("this is in another class");
    }
    public static void main(String[] args) {
        
    }
}
