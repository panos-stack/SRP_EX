package Ispsolve_B;
import java.util.Scanner;

public class ProtectedDoor extends Door implements PasswordClient {
    private boolean locked;
    private PasswordProtector protector;

    @Override
    public void alarm() {
        System.out.println("ALARM: Someone is trying to enter without code!!");
    }

    @Override
    public void setMyProtector(PasswordProtector protector) {
        this.protector = protector;
    }

    @Override
    public void lock(){
        locked = true;
    }

    @Override
    public void unlock(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter code: ");
        int number = scanner.nextInt();
        protector.check(number);
    }
}