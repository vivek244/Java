public class another {
    int a=15;
}

class classA extends another{
    // int a=20;
    void sum(){
        System.out.println(10+a);
        System.out.println(10+super.a);
    }
   
}

class main{

    public static void main(String[] args) {
        classA b=new classA();
        b.sum();
    }
}
