//Write a Java class called Movie that has fields for the movie's title, director, and release year

import java.util.ArrayList;
import java.util.*;

class Movie implements Comparable<Movie>{
   String title;
   String director;
   int year;

  public Movie(String title,String director,int year){
    this.title=title;
    this.director=director;
    this.year=year;
  }
   public int compareTo(Movie mo){
     if(year>mo.year){
       return -1;
     }
     else if(year<mo.year){
       return 1;
     }
     else{
       return 0;
     }
   }
  
}

class MovieSort{
  public static void main(String[] args){
    ArrayList<Movie> movies = new ArrayList<Movie>();
    Scanner sc= new Scanner(System.in);
    for(int i=0;i<3;i++){
      movies.add(new Movie(sc.next(),sc.next(),sc.nextInt()));
    }
    Collections.sort(movies);
    for(Movie mo : movies){
      System.out.println(mo.title+" "+mo.director+" "+mo.year);
    }
  }
}
