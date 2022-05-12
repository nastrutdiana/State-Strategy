package State;

public class MancareInPreparare implements State{
    @Override
    public void updateState(ComandaMancare comanda) {
        System.out.println("Mancare in preparare");
    }
}
