package Ispsolve_B;

public class PasswordProtector {
    private int safeNumber;
    private PasswordClient client;

    public void register(int code, PasswordClient client){
        this.safeNumber = code;
        this.client = client;
        client.setMyProtector(this);
    }

    public void check(int code){
        if(code != safeNumber){
            client.alarm();
        }
    }
}