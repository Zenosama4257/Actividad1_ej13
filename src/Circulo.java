public class Circulo {
    private double radio;

    public Circulo (double Radio){
        radio=Radio;
        if(Radio<= 0){
            radio = 0;
        }
        else {
            radio=Radio;
        }
    }

    public void setRadio (double Radio){
        if(Radio<= 0){
            radio = 0;
        }
        else {
            radio=Radio;
        }

    }

    public double getRadio (){
        return radio;
    }

    public double getArea (){
        return radio*radio*Math.PI;
    }

}