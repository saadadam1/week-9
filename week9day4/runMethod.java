class RunThread extends Thread{
  public void run(){
    System.out.println("running");
  }
}
class ThreadDemo{
  public static void main(String args[]){
    RunThread r=new RunThread();
    r.start();
  }
}