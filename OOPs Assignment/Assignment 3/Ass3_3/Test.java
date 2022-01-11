class Box {
    float volume(float l) {
        return l*l*l;
    }

    float volume(float r,float h) {
        return (3.14f*r*r*h)/3;
    }
}

class test {
    public static void main(String[] args) {
        float cubeSide=4.5f;
        float coneRadius=3.3f;
        float coneHeight=6.7f;
        Box box=new Box();
        System.out.println("Volume of cube with side "+cubeSide+" is: "+box.volume(cubeSide));
        System.out.println("Volume of cone with radius "+coneRadius+" height "+coneHeight+" is: "+box.volume(coneRadius, coneHeight));
    }
}