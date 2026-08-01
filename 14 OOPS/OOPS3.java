public class OOPS3 {
    public static void main(String[] args) {
        // Elephant E = new Elephant();
        // E.eat();
        // E.breathe();

        // dog d = new dog();
        // d.eat();
        // d.legs = 4;
        // System.out.println(d.legs);

        //overloading
        // calculator calc = new calculator();
        // System.out.println(calc.sum(1, 2));
        // System.out.println(calc.sum((float)1.5, (float)2.5));
        // System.out.println(calc.sum(1, 2 , 4));

        //overriding
        child c = new child();
        c.eat();


    }
}
//BAse class
class Animal {
    void eat() {
        System.out.println("animal eats:");
    }
    void breathe() {
        System.out.println("ANimal is breathing");
    }
}

//multilevel inheritance
class mammal extends Animal {
    int legs;
}
//hierarchical inheritance
class fish extends Animal {
    void swim() {
        System.out.println("swiming");
    }
}

class dog extends mammal {
    void bark() {
        System.out.println("dog barks");
    }
}
//derived class //single level
// class Elephant extends Animal {
//     void name() {
//         System.out.println("This is an Animal");
//     }
// }

//polymorphism
//Method oveloading
class calculator {
    int sum(int a , int b) {
        return a+b;
    }
    float sum(float a , float b) {
        return a+b;
    }
    int sum(int a , int b , int c) {
        return a+b+c;
    }
}

//method oveeriding
class parent {
    void eat() {
        System.out.println("eating grass");
    }
}
class child extends parent {
    void eat() {
        System.out.println("eating food");
    }
}