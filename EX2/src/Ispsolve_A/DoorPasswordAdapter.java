package Ispsolve_A;

public class DoorPasswordAdapter implements IPasswordClient{
    ProtectedDoor door;
    PasswordProtector protector;

    public DoorPasswordAdapter(ProtectedDoor door){
        this.door = door;
    }

    public ProtectedDoor getDoor(){
        return door;
    }

    public void check(int number){
        protector.check(number);
    }

    @Override
    public void alarm() {
        door.alarm();
    }

    @Override
    public void setMyProtector(PasswordProtector protector) {
        this.protector = protector;
    }
}
