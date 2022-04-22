public class encapsulation {

    private int a=25;
    private int b=24;

    public int geta(){
        return a;
    }

    public int getb(){
        return b;
    }

    public int seta(int newa){
        a=newa;
        return newa;
    }

    public int setb(int newb){
        b=newb;
        return newb;
    }
    
}

class en{
    public static void main(String[] args) {
        encapsulation obj=new encapsulation();
        int x=obj.geta();
        int y=obj.getb();
        System.out.println(x+y);
        int i=obj.seta(96);
        int j=obj.setb(48);
        System.out.println(i+j);

    }
}
