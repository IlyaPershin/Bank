package bankpershinid;

import java.util.ArrayList;

public class AllClients {
    ArrayList<Client> Clients = new ArrayList<>();
    
    public ArrayList<Client> add(Client newClient){
        this.Clients.add(newClient);
        return this.Clients;
    }
}
