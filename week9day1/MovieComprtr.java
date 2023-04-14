import java.util.Comparator;
 
class Movie{
  String title;
  String directorName;
  int releaseYear;
 
  Movie(String title,String directorName,int releaseYear){
    this.title=title;
    this.directorName=directorName;
    this.releaseYear=releaseYear;
  }
}
class ReleaseYearComparator implements Comparator<Movie>{
  public int compare(Movie m1,Movie m2){
    if(m1.releaseYear>m2.releaseYear){
      return 1;
    }
    else if(m1.releaseYear<m2.releaseYear){
      return -1;
    }
    else{
      return 0;
    }
  }
 
}
class TitleComparator implements Comparator<Movie>{
  public int compare(Movie m1,Movie m2){
    return m1.title.compareTo(m2.title);
  }
}
 
class MovieDemo{
  public static void main(string args[]){
    ArrayList<Movie> movies=new ArrayList<Movie>();
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<3;i++){
      movies.add(new Movie(sc.next(),sc.next(),sc.nextInt()));
    }
    ReleaseYearComparator ry=new ReleaseYearComparator();
    Collections.sort(movies,ry);
    for(Movie m:movies){
      System.out.println(m.title+" "+m.directorName+" "+m.releaseYear);
    }
  }
}