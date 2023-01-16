public class Main {


    public static void main(String[] args) {
        Circulo Circulo1 = new Circulo(74);
        Circulo Circulo2 = new Circulo(-4);
        Cilindro Cilindro1 = new Cilindro(74 , 10);
        Cilindro Cilindro2 = new Cilindro(74 , -72);
        Cilindro Cilindro3 = new Cilindro(-74 , 17);

        System.out.println("El area del circulo 1 es " + Circulo1.getArea());
        System.out.println("El area del circulo 2 es " + Circulo2.getArea());
        System.out.println("El volumen del cilindro 1 es " + Cilindro1.getVolumen());
        System.out.println("El area de la base del Cilindro 1 es " + Cilindro1.getArea());
        System.out.println("El volumen del cilindro 2 es " + Cilindro2.getVolumen());
        System.out.println("El area de la base del Cilindro 2 es " + Cilindro2.getArea());
        System.out.println("El volumen del cilindro 3 es " + Cilindro3.getVolumen());
        System.out.println("El area de la base del Cilindro 3 es " + Cilindro3.getArea());
    }
}
