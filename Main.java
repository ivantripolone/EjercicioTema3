public class Main {
    public static void main (String [ ] args) {

        int a = 1;
        int b = 2;
        int c = 3;
        System.out.println( a + " + " + b + " + " + c +" = " + suma(1,2,3));
        System.out.println("------------------------");
        Coche myCoche= new Coche( 2 );
        myCoche.addPuertas(1);
        System.out.println("El numero de puestas de myCoche es de: " + myCoche.getNumeroDePuertas());
    }

    public static int suma(int a, int b, int c){
        return a+b+c;
    }


}
