import java.util.*;
class Student{
  String name,gender,major;
  int age,rollNum;
  long phoneNum;
  Student(String name,String gender,String major,int age,int rollNum,long phoneNum){
    this.name=name;
    this.age=age;
    this.rollNum=rollNum;
    this.gender=gender;
    this.major=major;
    this.phoneNum=phoneNum;
  }
}

class StudentHash{
  Scanner s=new Scanner(System.in);
  HashSet<Student> stu=new HashSet<Student>();
  
  public void addStudent(){
    System.out.println("Enter student name");
    String name=s.next();
    System.out.println("Enter student gender");
    String gender=s.next();
    System.out.println("Enter student major");
    String major=s.next();
    System.out.println("Enter student age");
    int age=s.nextInt();
    System.out.println("Enter student roll number");
    int rollNum=s.nextInt();
    System.out.println("Enter student phone number");
    long phoneNum=s.nextLong();
    stu.add(new Student(name,gender,major,age,rollNum,phoneNum));
  }

  public void viewList(){
    for(Student s:stu){
      System.out.println(s.name+"   "+s.major+"  "+s.age);
      System.out.println("*******");
    }
  }

  public int choices(){
    System.out.println("1. Add student");
    System.out.println("2. List of students");
    System.out.println("3, remove student");
    System.out.println("4, Exit");
    System.out.println("Enter choice");
    int opt=s.nextInt();
    return opt;
  }
  public static void main(String args[]){
    StudentHash obj=new StudentHash();
    
    int opt;
    do{
      opt=obj.choices();
      switch(opt){
        case 1:{
          obj.addStudent();
          break;
        }
        case 2:{
          obj.viewList();
        }
        case 4:{
          System.out.println("Thank you");
        }
      }
    }while(opt!=4);
  }
}