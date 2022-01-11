class Student {
    String name;
    int roll;
    String stream;
    String college;
    Student(String name, int roll, String stream, String college) {
        this.name=name;
        this.roll=roll;
        this.stream=stream;
        this.college=college;
    }

    String getName() {
        return name;
    }

    int getRoll() {
        return roll;
    }

    String getStream() {
        return stream;
    }

    String getCollege() {
        return college;
    }
}

class Test {
    public static void main(String[] args) {
        Student st=new Student("Supratim",62,"CSE","AOT");
        System.out.println("Student name: "+st.getName());
        System.out.println("Student roll: "+st.getRoll());
        System.out.println("Student stream: "+st.getStream());
        System.out.println("Student college: "+st.getCollege());
    }
}