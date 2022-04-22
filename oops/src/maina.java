class parent{
    void intro(){
        System.out.println("I am the parent class");
    }
}

class childa extends parent{
    void intro1(){
        System.out.println("This is chaild A");
    }
}

class childb extends parent{
    void intro2(){
        System.out.println("This is child B");
    }
}

class grandchild extends childa{
    void intro3(){
        System.out.println("This is grandchild");
    }
}


public class maina {

    public static void main(String[] args) {
        childa obj=new childa();
        obj.intro();
        grandchild obj2=new grandchild();
        obj2.intro1();
        obj2.intro3();
        parent obj4=new parent();
        obj4.intro();
        // obj2.intro2();
    }
}
