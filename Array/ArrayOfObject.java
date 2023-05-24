package Array;

class Student{
    int rollno;
    String name;
    int marks;
}
public class ArrayOfObject {
       public static void main(String[] args) {
          Student s1=new Student();
          s1.rollno=1;
          s1.name="Binod";
          s1.marks=45;

          Student s2=new Student();
          s2.rollno=1;
          s2.name="Binod";
          s2.marks=45;

          Student s3=new Student();
          s3.rollno=1;
          s3.name="Binod";
          s3.marks=45;
         
          // array of object
          Student students []= new Student[3];
          students[0]=s1;
          students[1]=s2;
          students[2]= s3;

          for(int i=0;i<students.length;i++){
               System.out.println(students[i].name +" : " + students[i].marks);
          }

        // Enhance for loop
        for(Student stu:students){
            System.out.println(stu.name + ": "+ stu.marks);
        }
       }
}
