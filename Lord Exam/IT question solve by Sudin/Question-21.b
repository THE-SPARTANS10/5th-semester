import java.util.Scanner;

interface Shape{
    float pie=3.14f;
}

class Rectangle implements Shape{
    public int length;
    public int breadth;
    Rectangle(int length,int breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
    public void Area()
    {
        float res=0.0f;
        res=(float)breadth*(float)length;
        System.out.println(res);

    }
}

class Circle implements Shape{
    public float radius;
    Circle(float radius)
    {
        this.radius=radius;
    }

    public void Area()
    {
        float res=0.0f;
        res=pie*radius*radius;
        System.out.println(res);

    }
}

public class CircleRectangle{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        float radius;
        int length,breadth;
        radius=sc.nextFloat();
        length=sc.nextInt();
        breadth=sc.nextInt();
        Circle c=new Circle(radius);
        Rectangle r=new Rectangle(length,breadth);
        c.Area();
        r.Area();
    }
}
