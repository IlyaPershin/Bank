package bankpershinid;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BankPershinID {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Client> Clients = new ArrayList<>();
        int numberOfClients = 10;
        int clientsStartSum = 1000000 / numberOfClients;
        int allSum = clientsStartSum * numberOfClients;
        for (int i = 0; i<numberOfClients; i++){
            Clients.add(new Client("Клиент" + i, clientsStartSum));
        }
        
        Thread t = new CheckThread(Clients, allSum);
        //Thread t1 = new UnlimitedThread(Clients, allSum);
        
        
        ArrayList<Thread> threadList = new ArrayList();
        //t1.start();
        for (int i = 0; i<10; i++){
            Thread a = new UnlimitedThread(Clients, allSum);
            a.setName("Thread1");
            threadList.add(a);
        }
        for (int i = 0; i<threadList.size(); i++){
            threadList.get(i).start();
        }
        
        for (int i = 0; i<10; i++){
            threadList.get(i).join();
        }
        t.start();
    }
    
}