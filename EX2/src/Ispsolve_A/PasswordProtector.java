package Ispsolve_A;

public class PasswordProtector {
    private int safeNumber;
    IPasswordClient client;

    public void register(int code, IPasswordClient client){
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