package Criptare;

public class main {
    public static void main(String[] args) {
        MotorCriptare m = new MotorCriptare();
        m.setM(new Algoritm1());
        m.ObtineMesajCriptat("Algoritm1");

        MotorCriptare m2 = new MotorCriptare();
        MotorCriptare m3 = new MotorCriptare();

        m2.setM(new Algoritm2());
        m2.ObtineMesajCriptat("Algoritm2");

        m3.setM(new Algoritm3());
        m3.ObtineMesajCriptat("Algoritm3");
    }
}
