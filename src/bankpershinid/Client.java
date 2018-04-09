package bankpershinid;

public class Client {
    String name;
    int sum;
    
    public void SetName(String _name){
        this.name = _name;
    }
    public String GetName(){
        return this.name;
    }
    
    public void SetSum(int _sum){
        this.sum = _sum;
    }
    public int GetSum(){
        return this.sum;
    }
    
    public Client(String _name, int _sum){
        name = _name;
        this.sum = _sum;
    }
}
