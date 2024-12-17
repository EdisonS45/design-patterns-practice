class Student{
    int rollno;
    String name;
    float marks;
     Student(int rno, String name, float marks){
        this.rollno=rno;
        this.name=name;
        this.marks=marks;
    }
}//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Student student1=new Student(107,"Edison",77.89f);
        System.out.println(student1.rollno+" "+student1.name+" "+student1.marks);
        try{

        }catch(Exception e){

        }
    }
}