import java.util.Scanner;

class Cone {
    double area,vol,l;
    Cone(double r, double h) {
        l=Math.sqrt(r*r+h*h);
        area=3.14*r*r+3.14*r*l;
        vol=(3.14*r*r*h)/3;
    }

    double getArea() {
        return area;
    }

    double getVol() {
        return vol;
    }
}

class Test {
    public static void main(String[] args) {
        double r,h;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter base radius of cone: ");
        r=sc.nextDouble();
        System.out.print("Enter height of cone: ");
        h=sc.nextDouble();
        Cone cl=new Cone(r,h);
        System.out.println("Area of cone: "+cl.getArea()+" units");
        System.out.println("Volume of cone: "+cl.getVol()+" units");
    }
}