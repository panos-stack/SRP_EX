package Srpsolve_B;

public class ModemImplementation implements Data_channel,Connection{
    @Override
    public void send(char c) {

    }

    @Override
    public char recv() {
        return ' ';
    }

    @Override
    public void dial(String pno) {

    }

    @Override
    public void hangup() {

    }
}