package processor;

import java.util.PriorityQueue;
import processManager.PCB;

/**
 *
 * @author Cezary
 */
public class Processor {

   //public int nice_value=0;//from -20 to +19 dla Processu
   private int targeted_latency;//interval of time during which every runnable task should run at least once
   //public int vruntime dla Processu
   private RedBlackTree runnable_proces_tree=new RedBlackTree();//proces==task
   
   
   void scheduler(){ // the scheduler simply selects the task that has the smallest vruntime value
   
   
   
   };
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
