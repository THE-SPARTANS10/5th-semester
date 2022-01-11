import java.util.Scanner;

interface Shape {
    double pie=3.14;
}

class Circle implements Shape {
    double r;
    Circle(double r) {
        this.r=r;
    }

    double area() {
        double areaOfCircle=pie*r*r;
        return areaOfCircle;
    }
}

class Rectangle implements Shape {
    double l,b;
    Rectangle(double l, double b) {
        this.l=l;
        this.b=b;
    }

    double area() {
        double areaOfRectangle=l*b;
        return areaOfRectangle;
    }
}

class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double r;
        System.out.print("Enter radius of circle: ");
        r=sc.nextDouble();
        Circle c=new Circle(r);
        System.out.println("Area of circle: "+c.area());

        double l,b;
        System.out.print("Enter length of rectangle: ");
        l=sc.nextDouble();
        System.out.print("Enter breadth of rectangle: ");
        b=sc.nextDouble();
        Rectangle rc=new Rectangle(l,b);
        System.out.println("Area of rectange: "+rc.area());

        sc.close();
    }
}