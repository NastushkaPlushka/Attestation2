package wait.notify;

public class Main {
    public static void main(String agr[]){
        Store store = new Store();
        Produser produser = new Produser(store);
        Comsumer comsumer = new Comsumer(store);
        new Thread(produser).start();
        new Thread(comsumer).start();

    }
}
