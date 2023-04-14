//Write a Java class called Person that has fields for the person's name and age. Write a custom Comparator implementation called AgeComparator that sorts Person objects in ascending order based on their age. Then, modify the Person class to implement the Comparable interface, so that Person objects are sorted first by age (ascending order), and then by name (alphabetical order). Test your implementation by creating a list of Person objects and sorting them using both the AgeComparator and the Comparable implementation.

import java.util.*;

public class Person implements Comparable<Person> {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
   
    @Override
    public int compareTo(Person p) {
        
        return name.compareTo(p.name);
    }
}
   
    class AgeComparator implements Comparator<Person> {
       // @Override
        public int compare(Person person1, Person person2) {
            if(person1.age>person2.age){
              return 1;
            }
           else if(person1.age<person2.age){
              return -1;
            }
          else {
            return 0;
          }
        }
    }


class PersonTest {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
      Scanner sc=new Scanner(System.in);
      for(int i=0;i<3;i++){
        persons.add(new Person(sc.next(),sc.nextInt()));
      }
      
      System.out.println("Ascending order For Age");
      Collections.sort(persons, new AgeComparator());
      for(Person p : persons){
        System.out.println(p.name+" "+p.age);
      }

      System.out.println("Ascending order For Name");
      Collections.sort(persons);
      for(Person p : persons){
        System.out.println(p.name+" "+p.age);
      }
    }
}