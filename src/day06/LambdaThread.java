import java.security.SecureRandom;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LambdaThread {
  public static void main(String[] args) {
    ExecutorService threadpool = Executors.newFixedThreadPool(2);
    
    for(int i=0;i<3;i++){
      threadpool.submit(
      // Runnable - public void run()  
      ()->{
        Random ran = new SecureRandom();
        for(Integer j=0;j<10;j++){
          System.out.printf("[%d] Random: %d\n",j, ran.nextInt(100));
        }
      });
    } 

    //or 
    Runnable run = ()->{
      Random ran = new SecureRandom();
        for(Integer j=0;j<10;j++){
          System.out.printf("[%d] Random: %d\n",j, ran.nextInt(100));
        }
    };
      threadpool.submit(run);
  }
}
