/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankpershinid;

import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LocalUser
 */
public class UnlimitedThread extends Thread {
    ArrayList<Client> Clients;
    int allSum;
    
    public UnlimitedThread(ArrayList<Client> _Clients, int _allSum){
        this.Clients = _Clients;
        this.allSum = _allSum;
    }
    
    //@Override
    public void run()//synchronized void run()
    { 
        for(int i = 0; i < 1000; i++){
            Random rand = new Random();
            int from = rand.nextInt(Clients.size());
            int to1 = 0;
            do{
                to1 = rand.nextInt(Clients.size());
            }while(to1 == from);
            int to = to1;
            int sum1 = 0;
            do{
                sum1 = rand.nextInt(Clients.size());
            }while (sum1 > Clients.get(from).GetSum());
            int sum = sum1;

//            final TransferThread tt1 = new TransferThread(); 
//            Runnable run1; 
//            run1 = new Runnable() { 
//                @Override
//                public void run() {
//                    tt1.TranferFromClientToClient(Clients.get(from), Clients.get(to), sum);
//                }
//            }; 
//            Thread ta1 = new Thread(run1);
//            ta1.start();
            String name = Thread.currentThread().getName();
        
            Client cf = Clients.get(from);
            Client ct = Clients.get(from);
            
        synchronized(cf){
            cf.SetSum(cf.GetSum() - sum);
            System.out.println(name + ": " + cf.GetName() + " after transfer is: " + cf.GetSum());
        }
        
        synchronized(ct){
            ct.SetSum(ct.GetSum() + sum);
            System.out.println(name + ": " + ct.GetName() + " after transfer is: " + ct.GetSum());
        }

//            try {
//                ta1.join();
//            } catch (InterruptedException ex) {
//                Logger.getLogger(UnlimitedThread.class.getName()).log(Level.SEVERE, null, ex);
//            }
            
        }
        
//            Transfer().start();
//            Transfer().start();
//            Transfer().start();
//            Transfer().start();
//            Transfer().start();
//            Transfer().start();
//            Transfer().start();
//            Transfer().start();
//            Transfer().start();
//            Transfer().start();
//            Thread ta1 = Transfer();
//            Thread ta2 = Transfer();
//            Thread ta3 = Transfer();
//            Thread ta4 = Transfer();
//            Thread ta5 = Transfer();
//            Thread ta6 = Transfer();
//            Thread ta7 = Transfer();
//            Thread ta8 = Transfer();
//            Thread ta9 = Transfer();
//            Thread ta10 = Transfer();
//            ta1.start();
//            ta2.start();
//            ta3.start();
//            ta4.start();
//            ta5.start();
//            ta6.start();
//            ta7.start();
//            ta8.start();
//            ta9.start();
//            ta10.start();
    }
    
//    public Thread Transfer(){
////        do{
////            Random rand = new Random();
////            int from = rand.nextInt(Clients.size());
////            int to1 = 0;
////            do{
////                to1 = rand.nextInt(Clients.size());
////            }while(to1 == from);
////            int to = to1;
////            int sum = rand.nextInt(Clients.get(from).GetSum());
////
////            final TransferThread tt1 = new TransferThread(); 
////            Runnable run1; 
////            run1 = new Runnable() { 
////                @Override
////                public void run() {
////                    tt1.TranferFromClientToClient(Clients.get(from), Clients.get(to), sum);
////                }
////            }; 
////            Thread ta1 = new Thread(run1);
////            return ta1;
////        }while(true); 
//            do{
//            Random rand = new Random();
//            int from = rand.nextInt(Clients.size());
//            int to1 = 0;
//            do{
//                to1 = rand.nextInt(Clients.size());
//            }while(to1 == from);
//            int to = to1;
//            int sum = rand.nextInt(Clients.get(from).GetSum());
//
//            final TransferThread tt1 = new TransferThread(); 
//            Runnable run1; 
//            run1 = new Runnable() { 
//                @Override
//                public void run() {
//                    tt1.TranferFromClientToClient(Clients.get(from), Clients.get(to), sum);
//                }
//            }; 
//            
//            try {
//                Thread.sleep(250);
//            } catch (InterruptedException ex) {
//                Logger.getLogger(UnlimitedThread.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            
//        }while(true);
//    }
    
//    public synchronized void UnlimitedTransfer(ArrayList<Client> Clients, int allSum) 
//    { 
//        do{
//            Random rand = new Random();
//            int from = rand.nextInt(Clients.size());
//            int to1 = 0;
//            do{
//                to1 = rand.nextInt(Clients.size());
//            }while(to1 == from);
//            int to = to1;
//            int sum = rand.nextInt(Clients.get(from).GetSum());
//
//            final TransferThread tt = new TransferThread(); 
//            Runnable run; 
//            run = new Runnable() { 
//                @Override
//                public void run() {
//                    tt.TranferFromClientToClient(Clients.get(from), Clients.get(to), sum);
//                }
//            }; 
//            Thread ta = new Thread(run);
//            ta.start();
//        }while(true);
//    } 
}
