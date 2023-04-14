import java.util.ArrayList;
import java.util.*;
class Student {
  private int id;
  private String name;
  private String dept;
  private int age;
  Student(int id,String name,String dept,int age){
    this.id=id;
    this.name=name;
    this.dept=dept;
    this.age=age;
  }
 
 
public int getId() {
    return id;
}
public void setId(int id) {
    this.id = id;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public String getDept() {
    return dept;
}
public void setDept(String dept) {
    this.dept = dept;
}
public int getAge() {
    return age;
}
public void setAge(int age) {
    this.age = age;
}
  
}
class IdComparator implements Comparator<Student>{
  @Override
public int compare(Student s1, Student s2) {
  if(s1.getId()>s2.getId()){
    return 1;
  }
  else if(s1.getId()<s2.getId()){
    return -1;
  }
  else{
    return 0;
  }
    
}
}
class NameComparator implements Comparator<Student>{
  @Override
public int compare(Student o1, Student o2) {
    return o1.getName().compareTo(o2.getName());
}
}
 
class StudentDemo{
  public static void main(String args[]){
    ArrayList<Student> students=new ArrayList<Student>();
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<3;i++){
      students.add(new Student(sc.nextInt(),sc.next(),sc.next(),sc.nextInt()));
    }
    Collections.sort(students,new NameComparator());
   
    for(Student st:students){
      System.out.println(st.getId()+" "+st.getName()+""+st.getDept()+" "+st.getAge());
    }
 
    Collections.sort(students,new IdComparator());
   
    for(Student st:students){
      System.out.println(st.getId()+" "+st.getName()+""+st.getDept()+" "+st.getAge());
    }
  }
}