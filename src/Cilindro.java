public class Cilindro extends Circulo{
    private double altura;

    public Cilindro (double Radio, double Altura){
        super(Radio );
        if(Altura <= 0){
            altura=0;
        }
        else {
            altura = Altura;
        }
    }

    public void setAltura (double Altura){
        if(Altura <= 0){
            altura=0;
        }
        else {
            altura = Altura;
        }
    }

    public double getAltura (){
        return altura;
    }


    public double getVolumen (){
        return  getArea()*altura;
    }

}
