public class OOPS4 {
    public static void main(String[] args) {
        // Horse h = new Horse();
        // h.eat();
        // h.walk();
        // System.out.println(h.color);

        // chicken c = new chicken();
        // c.eat();
        // c.walk();

        // queen q = new queen();
        // q.moves();

        // beer b = new beer();
        // b.black();
        // b.green();

        // stu s1 = new stu();
        // s1.schoolname = "JNV";
        
        // stu s2 = new stu();
        // System.out.println(s2.schoolname);

        jan j = new jan();
        System.out.println(j.color);


    }
}
//Abstraction
abstract class Animall {
    String color;
    Animall() {
        color = "brown";
    } 
    void eat() {
        System.out.println("animal eats");
    }
    abstract void walk();
}

class Horse extends Animall {
    void changecolor() {
        color = "dark brown";
    }
    void walk() {
        System.out.println("walks on 4 legs");
    }
}

class chicken extends Animall {
    void changecolor() {
        color = "dark brown";
    }
    void walk() {
        System.out.println("walks on 2 legs");
    }
}

//interface
interface chesspayer {
    void moves();
}

class queen implements chesspayer {
    public void moves() {
        System.out.println("moves in L R T B");
    }
}

class king implements chesspayer {
    public void moves() {
        System.out.println("moves in L R T B D");
    }
}

interface herbivor {
    void green();
}
interface carnivore {
    void black();
}

class beer implements herbivor , carnivore {
    public void green() {
        System.out.println("green");
    }
    public void black() {
        System.out.println("black");
    }
}

//static keyword
class stu {
    String name;
    static String schoolname;
    
}

// super keyword
class month {
    String color;
    month() {
        System.out.println("this is a month");
    }
}

class jan extends month {
    jan() {
        // super(); 
        super.color = "brown";
        System.out.println("this is a january month");
    }
}