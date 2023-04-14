import java.io.FileWriter;
class FileDemo{
  public static void main(String args[]){
     try{
       FileWriter newFile=new FileWriter("abc.txt");
       newFile.write("hi hello how are you");
       newFile.close();
     }
     catch(Exception e){
       System.out.println(e);
     }
    
  }
}