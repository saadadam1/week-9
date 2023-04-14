//Write a Java class called Employee that has fields for the employee's name and salary. Write a custom Comparator implementation called SalaryComparator that sorts Employee objects in descending order based on their salary. Then, modify the Employee class to implement the Comparable interface, so that Employee objects are sorted in ascending order based on their name. Test your implementation by creating a list of Employee objects and sorting them using both the SalaryComparator and the Comparable implementation.

class Employee implements Comparable<Employee>{
  String name;
  int salary;
 
  Employee(String name,int salary){
    this.name=name;
    this.salary=salary;
  }
  public int compareTo(Employee e1){
    return name.compareTo(e1.name);
  }
}
class SalaryComparator implements Comparator<Employee>{
  public int compare(Employee e1,Employee e2){
    if(e1.salary>e2.salary){
      return -1;
    }
    else if(e1.salary<e2.salary){
      return 1;
    }
    else{
      return 0;
    }
  }
}
class EmployeeDemo{
  public static void main(String args[]){
    ArrayList<Employee> emp=new ArrayList<Employee>();
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<3;i++){
      emp.add(new Employee(sc.next(),sc.nextInt()));
    }
    System.out.println("Sorted based on salary");
    Collections.sort(emp,new SalaryComparator());
    for(Employee e:emp){
      System.out.print(e.name+" "+e.salary);
      
    }
    System.out.println("Sorted based on name");
    Collections.sort(emp);
    for(Employee e:emp){
      System.out.print(e.name+" "+e.salary);
      
    }
  }
}