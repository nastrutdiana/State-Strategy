package Criptare;

public class MotorCriptare {
    ModCriptare m;


    public void ObtineMesajCriptat(String text){
        System.out.println(m.cripteaza(text));
    }

    public void setM(ModCriptare m) {
        this.m = m;
    }
}
