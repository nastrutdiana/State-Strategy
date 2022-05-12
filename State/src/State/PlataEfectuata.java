package State;

public class PlataEfectuata implements State{

    @Override
    public void updateState(ComandaMancare comanda) {
        comanda.setS(new MancareInPreparare());
        System.out.println("Plata a fost efectuata, mancarea a trecut in starea de preparare");
    }
}
