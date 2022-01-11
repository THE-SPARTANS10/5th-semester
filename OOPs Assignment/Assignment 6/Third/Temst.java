class Start {
    int i=21;
    
    int m2() {
        return i;
    }

    {
        System.out.println("Inside non static block 1 in Start class with i: "+m2());
    }

    Start() {
        System.out.println("Go harder");
    }

    {
        System.out.println("Inside non static block 2 in Start class with j: "+m1());
    }

    int j=10;
    
    int m1() {
        return j;
    }
}

public class Temst extends Start {

    int a = 69;

    int t2() {
        return a;
    }

    {
        System.out.println("Inside non static block 1 in Temst class with a: " + t2());
    }

    Temst() {
        System.out.println("Go harder boss");
    }

    {
        System.out.println("Inside non static block 2 in Temst class with b: " + t1());
    }

    int b = 26;

    int t1() {
        return b;
    }
    
    public static void main(String[] args) {
        //Temst t=new Temst();

        Temst tt=new Temst();
        System.out.println("Value of something: "+ tt.t1());
        System.out.println("Inside Temst main method");
    }    
}
