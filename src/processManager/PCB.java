/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package processManager;

/**
 *
 * @author Cezary
 */
public class PCB {
     public int vruntime;// dla Procesu
      public int nice_value=0;//from -20 to +19 dla Procesu

    public PCB(int vruntime,int nice_value) {
        this.vruntime = vruntime;
        this.nice_value=nice_value;
        
    }
      
}
