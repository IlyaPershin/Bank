/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankpershinid;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LocalUser
 */
public class CheckThread extends Thread {
    ArrayList<Client> Clients;
    int allSum;
    public CheckThread(ArrayList<Client> _Clients, int _allSum){
        this.Clients = _Clients;
        this.allSum = _allSum;
    }
    
    @Override
    public void run()
    { 
        //do{
            int checkSum = 0;
            for (int i = 0; i<Clients.size(); i++){
                checkSum += Clients.get(i).GetSum();
            }
            if (checkSum!=allSum){
                System.out.println("WARNING!!!  " + checkSum + "!=" + allSum);
            }
            else System.out.println("EVERYTHING IS FINE");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(CheckThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        //}while(true); 
    }

//    public synchronized void CheckAllSumm(ArrayList<Client> Clients, int allSum) throws InterruptedException 
//    { 
//        do{
//            int checkSum = 0;
//            for (int i = 0; i<Clients.size(); i++){
//                checkSum += Clients.get(i).GetSum();
//            }
//            if (checkSum!=allSum){
//                System.out.println("WARNING!!!");
//            }
//            Thread.sleep(1000);
//        }while(true);
//    } 
}
