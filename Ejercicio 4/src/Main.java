// para el Switch, debera crear la variable estacion y distintos case para las cuatro estaciones del ano. Dependiendo del valor de la variable estacion se debera mandar un mensaje por consola informando de la estacion en la que esta.
// tambien habra que poner un default para cuando el valor de la variable no sea una estacion
public class Main {
    public static void main(String[] args) {
        int numerolf = 0; // Condicion if, Positivo,Negativo o cero.

        if (numerolf > 0) {
            System.out.println("Es Positivo");
        } else if (numerolf < 0) {
            System.out.println("Es Negativo");
        } else if (numerolf == 0) {
            System.out.println("El numero es cero.");
        }
        int numeroWhile = 1;

        while (numeroWhile < 3) { //While siempre que sea menor que 3, suma 1.
            System.out.println(numeroWhile);
            numeroWhile++;
        }
        do { //Do while, que ejecuta el mismo procedimiento que el While de arriba pero una sola vez.
            System.out.println(numeroWhile);
            numeroWhile++;
        } while (numeroWhile < 3);
        System.out.println(numeroWhile);
        for (int numeroFor = 0; numeroFor <= 3; numeroFor = numeroFor+ 1) {
            System.out.println(numeroFor);
        }
        var  estacion = "Invierno" ;

        switch (estacion) {
            case "Verano":
                System.out.println("Es Verano");
            break;
            case "Invierno":
                System.out.println("Es Invierno");
            break;
            case "Primavera":
                System.out.println("Es Primavera.");
            break;
            case "Otono":
                System.out.println("Es Otono.");
            break;
            default:
                System.out.println(estacion);
            break;
        }


    }
}