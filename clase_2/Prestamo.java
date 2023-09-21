package clase_2;

public class Prestamo {
    
    public static void main(String[] args) {
    int capitalSolicitado = 1000;
    double intereses = 2;
    int cuotas = 12;

    int interesesAPagar = capitalSolicitado * (int) intereses * cuotas;
    int montoTotal = capitalSolicitado + interesesAPagar;
    System.out.println( "El interes a pagar es: " + montoTotal);
    }
}
