package State;

import State.ComandaMancare;
import State.State;

public class main {
    public static void main(String[] args) {
        State s = new State() {
            @Override
            public void updateState(ComandaMancare comanda) {

            }
        };
        ComandaMancare comandaMancare = new ComandaMancare(s, 1);
        comandaMancare.setS(new comandaPlasata());
        comandaMancare.nextState();
        comandaMancare.nextState();
        comandaMancare.nextState();

    }
}
