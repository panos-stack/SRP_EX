package Ispsolve_A;
import java.util.Scanner;

public class ProtectedDoor extends Door{
    private DoorPasswordAdapter adapter;
    boolean locked;

    public ProtectedDoor(){
        adapter = new DoorPasswordAdapter(this);
    }

    public DoorPasswordAdapter getAdapter() {
        return adapter;
    }

    @Override
    public void lock() {
        locked = true;
    }

    @Override
    public void unlock() {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter code: ");
        number = scanner.nextInt();
        adapter.check(number);
    }

    public void alarm(){
        System.out.println("ALARM: Someone is trying to enter without code!!");
    }
}
