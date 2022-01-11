import java.util.Scanner;

class Cylinder {
    float area,circ;
    Cylinder(float r, float h) {
        area=2*3.14f*r*h+2*3.14f*r*r;
        circ=2*3.14f*r;
    }

    float getArea() {
        return area;
    }

    float getCirc() {
        return circ;
    }
}

class Test {
    public static void main(String[] args) {
        float r,h;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter radius of cylinder: ");
        r=sc.nextFloat();
        System.out.print("Enter height of cylinder: ");
        h=sc.nextFloat();
        Cylinder cl=new Cylinder(r,h);
        System.out.println("Area of cyliner: "+cl.getArea()+" units");
        System.out.println("Circumference of cyliner: "+cl.getCirc()+" units");
    }
}