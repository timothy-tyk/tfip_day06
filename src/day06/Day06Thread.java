import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Day06Thread {

  // MAIN THREAD
  public static void main(String[] args) {
    List<Integer> numList = new LinkedList<Integer>();
    ExecutorService threadpool = Executors.newFixedThreadPool(2);
    for(Integer i=0;i<3;i++){
      //create a thread
      RandomNumbers thr = new RandomNumbers("thr-%d".formatted(i), 100, numList);
      //submit thread to runnable
      threadpool.submit(thr);
    }
    System.out.println("All Done!");

    while(true){
      try{
        System.out.println(">>> numList:"+numList);
        Thread.sleep(5000);
      }catch(InterruptedException e){
      }
      
      
    }
  }
}
