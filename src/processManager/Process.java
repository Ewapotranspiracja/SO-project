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
public class Process{

    public Process(PCB pcb) {
        this.pcb = pcb;
    }

    public Process() {
    }    

    public   PCB pcb;
   
}
