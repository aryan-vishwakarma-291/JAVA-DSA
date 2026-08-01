public class OOPS1 {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Blue");
        // System.out.println(p1.color);
        System.out.println(p1.getColor());
        p1.setTip(5);
        // System.out.println(p1.tip);
        System.out.println(p1.getTip());
        
        // Bank b1 = new Bank();
        // b1.userName = "Aryan";
        // b1.setPass("arya");
        // System.out.println(b1.userName);

    }
}

class Pen {
    String color;
    int tip;

    String getColor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }

    void setColor(String newColor) {  //setters
        color = newColor;
    }
    void setTip(int newTip) {  //setters
        tip = newTip;
    }
}


// class Bank {
//     public String userName;
//     private String Password;
//     void setPass(String pwd) {
//         Password = pwd;
//     }
// }