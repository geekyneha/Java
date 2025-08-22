class Student{

    int age;
    String name;
   
    void printInfo(){
        System.out.println("Age:" + age + ", Name:" + name);
        
    }

}
public class OOP {

    public static void main(String args[]){

        Student s1 = new Student();
        s1.age= 20;
        s1.name="John";


      

        Student s2= new Student();
        s2.age=25;
        s2.name="Khan";  

        s1.printInfo();
        s2.printInfo();
        

    }
    
}
