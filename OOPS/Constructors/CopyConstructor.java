package OOPS.Constructors;
public class CopyConstructor {
  public static void main(String[] args) {
    Student s1=new Student();
    s1.name="Sarthak";
    s1.roll=123;
    s1.pass="abc";
    s1.marks[0]=100;
    s1.marks[1]=90;
    s1.marks[2]=80;

    Student s2=new Student(s1);
    s2.pass="xyz";
    s1.marks[2]=3;

    for(int i=0; i< 3; i++){
      System.out.println(s2.marks[i]);
    }
    
  }
}
 class Student{
    String name;
    int roll;
    String pass;
    int marks[];

//Shallow Copy constructor
//     Student (Student s1){
//     marks = new int[3];
//     this.name=s1.name;
//     this.roll=s1.roll;
// this.marks=s1.marks;
//     }  

//Deep copy
Student (Student s1){
  marks = new int[3];
  this.name=s1.name;
  this.roll=s1.roll;
  for(int i=0; i<3; i++){
    this.marks[i]=s1.marks[i];  
  }
}
    




    Student() {
      marks = new int[3];
      System.out.println("Non parameterized constructor"); // Non Parameterized constructor
    }
    Student(String name) {
      marks = new int[3];
      this.name = name;
    }
  
    Student(int roll) {
      marks = new int[3];
      this.roll = roll;
    }
 }