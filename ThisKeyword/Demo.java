package ThisKeyword;

public class Demo {
   public int age;

   // it assign itSelf not assign a instance variable 
    public void setAge(int age){
         age=age;                    // describe in figure
    }

   // solution 1
    public void setAge(int age, Demo obj){
        Demo obj1= obj;
        obj.age=age;
   }
 
// best solution using this keyword
      public void setAge(int age){
           this.age=age;
       }

    public int getAge(){
        return age;
    }
    public static void main(String[] args) {
        Demo obj= new Demo();
        // obj.setAge(5,obj);
        obj.setAge(7);
        System.out.println(obj.getAge());
    }
}
