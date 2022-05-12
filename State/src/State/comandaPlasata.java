package State;

public class comandaPlasata implements State {

    @Override
    public void updateState(ComandaMancare comanda) {
        comanda.setS((State) new PlataEfectuata());
        System.out.println("Comanda plasata, plata va fi efectuata");
    }
}
