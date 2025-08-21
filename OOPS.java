class Pen{
    String type;
    String color;


    public void write(){
        System.out.println("Writing with a " + this.type);
    }

    public void printColor(){
        System.out.println("The color of the pen is: " + color);
    }
}


public class OOPS{


    public static void main(String args[]){
        Pen pen1= new Pen();
        Pen pen2= new Pen();

        pen1.type ="gel pen";
        pen1.color = "blue";

        pen2.type= "ball pen";
        pen2.color = "black";

        pen1.write();
        pen1.printColor();

        pen2.write();

        pen2.printColor();

        
    
    }

}