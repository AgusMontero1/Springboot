package clase_1;    

class Variable {
    public static void main(String[] args) {
      String nombre = "Pablo";
      int edad = 32;
      double peso = 85.5;
      float pesoanterior = 70.3f;
      boolean tieneLicencia = true;
      long cuentaBancaria = 100000000000000L;
      char inicial = 'P';
      String clubFutbol = "Boca Juniors";

      byte nuevoByte = -128;

      //Operadores aritmeticos
      int x = 5;
      int y = 2;

      float num1 = 5f;
      float num2 = 2f;

      //Suma 
      int suma = x + y; 
      System.out.println(suma);

      //Resta
      int resta = x + y;
      System.out.println(resta);

      //Multiplicacion
      int multiplicacion = x * y;
      System.out.println(multiplicacion);

      //Division 
      float division = num1 / num2;
      float division2 = x / y;
      System.out.println("Division 2: " + division2);
      System.out.println(division);

      //Modulo
      float modulo = num1 % num2;
      System.out.println(modulo);

      x++; // x = x + 1
      System.out.println(x);
      x--; // x = x - 1 
      System.out.println(x);
      System.out.println("Ultimo x: " + x--);
      System.out.println("Ultimo ultimo: " + x);

      //operadpres relacionales
      //igual
      boolean seLlamaPablo = nombre == "Pablo"; //el nombre es igual a pablo?

      //Mayor que 
      boolean esMayor2 = edad > 18;

      boolean esMenor = edad < 18;

      


            

               
      
      
      
      
      
      
      
      
  
       
      
     



    }
}

