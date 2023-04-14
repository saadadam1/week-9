//Write a Java class called Rectangle that has fields for the rectangle's width and height. Write a custom Comparator implementation called AreaComparator that sorts Rectangle objects in ascending order based on their area (i.e., width x height). Then, modify the Rectangle class to implement the Comparable interface, so that Rectangle objects are sorted in ascending order based on their perimeter (i.e., 2 x width + 2 x height). Test your implementation by creating a list of Rectangle objects and sorting them using both the AreaComparator and the Comparable implementation.

import java.util.*;

class Rectangle implements Comparable<Rectangle> {
    int width;
    int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }

    public int getPerimeter() {
        return 2 * width + 2 * height;
    }

    @Override
    public int compareTo(Rectangle r) {
       if(getPerimeter()>r.getPerimeter()){
         return -1;
       }
      else if(getPerimeter()<r.getPerimeter()){
        return 1;
      }
      else{
        return 0;
      }
    }
}

  class AreaComparator implements Comparator<Rectangle> {
        @Override
        public int compare(Rectangle rect1, Rectangle rect2) {
            if(rect1.getArea()>rect2.getArea()){
              return 1;
            }
          else if(rect1.getArea()<rect2.getArea()){
            return -1;
          }
          else{
            return 0;
          }
        }
    }

class RectangleTest {
    public static void main(String[] args) {
        ArrayList<Rectangle> rectangles = new ArrayList<>();
      Scanner sc=new Scanner(System.in);
      for(int i=0;i<3;i++){
        rectangles.add(new Rectangle(sc.nextInt(),sc.nextInt()));
      }
      
      System.out.println("For Area Ascending order");
      Collections.sort(rectangles,new AreaComparator());
      for(Rectangle r : rectangles){
        System.out.println(r.getArea());
      }

      System.out.println("For perimeter Descending order");
      Collections.sort(rectangles);
      for(Rectangle r : rectangles){
        System.out.println(r.getPerimeter());
      }
    }
}