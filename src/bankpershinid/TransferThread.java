package bankpershinid;

import java.util.ArrayList;

public class TransferThread {
    Client clientFrom;
    Client clientTo;
    
    /** Creates a new instance of TestSynchronized */ 
    public TransferThread(){} 

    public void TranferFromClientToClient(Client cf, Client ct, int sum) 
    { 
        String name = Thread.currentThread().getName();
        
        //synchronized(cf){
            cf.SetSum(cf.GetSum() - sum);
            System.out.println(name + ": " + cf.GetName() + " after transfer is: " + cf.GetSum());
        //}
        
        //synchronized(ct){
            ct.SetSum(ct.GetSum() + sum);
            System.out.println(name + ": " + ct.GetName() + " after transfer is: " + ct.GetSum());
        //}
//        
//        System.out.println(name + ": " + clientFrom.GetName() + " befor transfer was: " + sum1);
//        System.out.println(name + ": " + clientTo.GetName() + " befor transfer was: " + sum2);
//        x
    } 
}
