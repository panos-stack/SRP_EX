package Ispsolve_A;

public class Main {
    public static void main(String[] args){
        PasswordProtector protector = new PasswordProtector();
        ProtectedDoor door = new ProtectedDoor();
        protector.register(2525, door.getAdapter());
        door.unlock();
    }
}
