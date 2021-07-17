package javaexamples;

class Student  // class 
{
   int rollno; // instance variable
   String name;
   static String College="MIET"; //static variable
 
   static void change()
{
   College="MIET";
}

   Student (int r, String n)
{
    rollno=r;
    name=n;
}
    void display()
{
    System.out.println(rollno+" "+name+" "+College);
}
 public class Static1
{
  public static void main(String []args)
  {
      Student.change();
      Student s1 = new Student(56,"Harsh");
      Student s2 = new Student(89,"Ravi");
  
      s1.display();
      s2.display();
  }
}