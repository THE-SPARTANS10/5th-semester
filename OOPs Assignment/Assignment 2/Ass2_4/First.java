class First {
    int x;
    First(int x) {
        this.x=x;
    }

    void show() {
        System.out.println("Value of x using method: "+x);
    }

    public static void main(String[] args) {
        First f=new First(123);
        System.out.println("Value of x using instance variable: "+f.x);
        f.show();
    }
}