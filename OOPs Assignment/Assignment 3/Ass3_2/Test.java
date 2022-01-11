class Box {
    float vol;
    Box(float l) {
        vol=l*l*l;
    }

    Box(float r, float h) {
        vol=(3.14f*r*r*h)/3;
    }

    float getVolume() {
        return vol;
    }
}

class test {
    public static void main(String[] args) {
        float cubeSide=4.5f;
        float coneRadius=3.3f;
        float coneHeight=6.7f;
        Box cube=new Box(cubeSide);
        System.out.println("Volume of cube with side "+cubeSide+" is: "+cube.getVolume());
        Box cone=new Box(coneRadius,coneHeight);
        System.out.println("Volume of cone with radius "+coneRadius+" height "+coneHeight+" is: "+cone.getVolume());
    }
}