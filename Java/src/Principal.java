import java.util.Scanner;

public class Principal {

    public static void main (String [] args){
        boolean i = true;
        Conductor conductor = new Conductor("Carlos", 5555555, "Poblado" );
        Camion camion = new Camion(150.0, 32000, conductor);
        while(i){
            System.out.println("Ingrese la opción que desea ver");
            System.out.println("1. Obtener carga de camión");
            System.out.println("2. Obtener datos del conductor");
            System.out.println("3. Obtener kilometros recorridos");
            System.out.println("4. Salir del programa");

            Scanner scan = new Scanner(System.in);


            int numero = scan.nextInt();

            switch (numero){
                case 1:
                    System.out.println(camion.getCarga());
                    break;
                case 2:
                    System.out.println(camion.getConductor().getNombre() + " -- " + camion.getConductor().getDireccion() + " -- " + camion.getConductor().getTelefono() );
                    break;

                case 3:
                    System.out.println(camion.getKilometros());
                    break;
                case 4:
                    i = false;
                    break;
            }
        }
    }
}
