package azahara;
import java.util.Scanner;

/**
 * ejercicio de azahara
 *
 */
public class ejercicio_azahara {
    public static void main(String[] args) {

        boolean transferenciaCorrecta =false;

        // hacemos hasta que la transferencia sea correcta
        do {
            // pedimos datos

            System.out.println("Cantidad a transferir");
            float cantidadTransferida = pedirCantidad();
            System.out.println("Cantidad en tu cuenta");
            float dineroEnCuenta =pedirCantidad();
            String telefono = pedirTelefono();

            //comprobamos que son validos

            boolean cantidadAMandarPermitida = cantidadAMandarPermitida(cantidadTransferida);
            boolean cantidadAMandarMenorASaldo = cantidadAMandarMenorASaldo(cantidadTransferida,dineroEnCuenta);
            boolean primerNumero6 = primerNumero6(telefono);
            boolean largoEs9 = largoEs9(telefono);

            //damos respuesta

            if (cantidadAMandarPermitida && cantidadAMandarMenorASaldo && primerNumero6 && largoEs9){
                System.out.println("la transferencia esta correcta");
                transferenciaCorrecta=true;
            }else{
                if(!cantidadAMandarPermitida){System.out.println("la cantidad es mayor a la permitida");}
                if(!cantidadAMandarMenorASaldo){System.out.println("la cantidad es mayor a tu saldo");}
                if(!primerNumero6 || largoEs9){System.out.println("El telefono no es correcto");}
                System.out.println("intentemos una transferencia nueva");
            }

        }while (!transferenciaCorrecta);




    }

    private static String pedirTelefono() {
        Boolean cantidadOk = false;
        String telefono ="0";
        do {
            Scanner sc = new Scanner(System.in);
            try {
                System.out.println("dime el telefono");
                telefono = sc.next();
                cantidadOk = true;
            }catch (Exception e){
                System.err.println("no es un telefono valido");
                sc.next();
            }
        }while (!cantidadOk);

        return telefono ;

    }

    private static float pedirCantidad() {
        Boolean cantidadOk = false;
        float cantidad =0;
        do {
            Scanner sc = new Scanner(System.in);
            try {
                System.out.println("dime la cantidad");
                cantidad = sc.nextFloat();
                cantidadOk = true;
            }catch (Exception e){
                sc.next();
                System.err.println("no es una cantidad valida");
            }
        }while (!cantidadOk);

        return cantidad ;
    }

    public static boolean cantidadAMandarPermitida(float cantidad) {
       return (cantidad>=0.50f) && (cantidad<=500.00f);
    }

    public static boolean cantidadAMandarMenorASaldo(float cantidad,float saldoDisponible) {
        return cantidad<=saldoDisponible;

    }

    public static boolean primerNumero6(String telefono) {
        return (6==Character.getNumericValue(telefono.charAt(0)));

    }

    public static boolean largoEs9(String telefono) {
        return 9==telefono.length();

    }
}

