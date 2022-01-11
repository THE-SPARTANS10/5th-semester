class EMP {
    String name;
    int id;
    EMP(String name, int id) {
        this.name=name;
        this.id=id;
    }

    public String toString() {
        return "Name: "+name+", id: "+id;
    }
}

class Scientist extends EMP {
    int no_of_publication;
    int experience;
    Scientist(String name, int id, int no_of_publication, int experience) {
        super(name,id);
        this.no_of_publication=no_of_publication;
        this.experience=experience;
    }
    
    public String toString() {
        return "Name: "+name+", id: "+id+", no_of_publication: "+no_of_publication+", experience: "+experience;
    }
}

class Dscientist extends Scientist {
    int award;
    Dscientist(String name, int id, int no_of_publication, int experience, int award) {
        super(name,id,no_of_publication,experience);
        this.award=award;
    }

    public String toString() {
        return "Name: "+name+", id: "+id+", no_of_publication: "+no_of_publication+", experience: "+experience+", award: "+award;
    }
}

class Test {
    public static void main(String[] args) {
        EMP emp=new EMP("Sayan",123456);
        Scientist sc=new Scientist("Suhotra",987654,10,5);
        Dscientist ds=new Dscientist("Soumyadeep",264828,13,8,4);
        System.out.println(emp);
        System.out.println(sc);
        System.out.println(ds);
    }
}