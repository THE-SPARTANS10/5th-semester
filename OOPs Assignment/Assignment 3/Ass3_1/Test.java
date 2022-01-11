class Demo {
    int met() {
        return 100;
    }

    String met() {
        return "Hello World!";
    } 
}

class Test {
    public static void main(String[] args) {
        Demo d=new Demo();
        System.out.println(d.met());
        /*This code will give error cause method overloading doesn't
        hold good for return type of method*/
    }
}