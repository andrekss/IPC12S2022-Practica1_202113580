package practica1;
import java.util.Scanner;

public class Practica1 {
  public static int Signo(int signo, int n) {  
 for (int i = 0; i <= n; i++) { 
      signo = -1*signo;           
   }
    return signo;
  }
     public static double dividendo(double potencia, double potencia1, int n, double x1) {
      for ( int j = 0; j <= 2*n+1; j++) {
        potencia = x1*potencia; 
        if (j%2 == 0) {
          potencia1 = potencia;
        }
    }
    return potencia1;
     }
      
      public static int factorial(int factorial,int BaseFactorial) {
        while (BaseFactorial != 0) {
           factorial = factorial*BaseFactorial;
          BaseFactorial--;
        }
        return factorial;
      }

      public static double dividendoCos(double potencia2, double potencia3, int n, double x2) {
        for ( int j = 0; j <= 2*n; j++) {
          if (j == 0) {
            potencia2 = 1;
          } else {
          potencia2 = x2*potencia2; 
          }
          if (j%2 == 0) {
            potencia3 = potencia2;
          }
      }
        return potencia3;
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in); // definimos el objeto con una variable sc
       int opcion = 0;
       do {
        System.out.println("MENU");
        System.out.println("1) Aritmeticas");
        System.out.println("2) Trigonometricas");
        System.out.println("3) Estadísticas");
        System.out.println("4) Cálculo");
        System.out.println("5) Salir");
        System.out.print("Ingrese un número: "); // quitamos el ln porque evitamos el salto de linea
          opcion = sc.nextInt(); // Permitimos la entrada en consola 
      switch(opcion) { // declaramos la sentencia switch
            // cada case es una opcion del menu
              
            case 1: new Scanner(System.in); // llevar el objeto
            //nuevo menu para aritmetica
            int opcion1 = 0;
            do {
             System.out.println("Aritmeticas");
             System.out.println("1) Suma");
             System.out.println("2) Resta");
             System.out.println("3) Multiplicacion");
             System.out.println("4) Division");
             System.out.println("5) Potencia");
             System.out.println("6) Salir");
             System.out.print("Ingrese un numero: "); // quitamos el ln porque evitamos el salto de linea
             
             
              opcion1 = sc.nextInt(); // Permitimos la entrada de la consola con una nueva variable "opcion1"
             
            switch (opcion1) {
                 case 1: new Scanner(System.in);
                Scanner sc2 = new Scanner (System.in); //declaramos un input para colocar dos numeros para la suma pedida
                
                 // al definir la variable para permitir entrada en la consola; usamos vara para que el tipo de dato sea libre
                System.out.println("ingrese dos numeros a sumar sucesivamente:");
                double numero1 = sc2.nextDouble();
                double numero2 = sc2.nextDouble();
                System.out.print("La suma es: ");
                  System.out.println(numero2+numero1); // el ln separó con la frase de que se termino el programa
                 break;
                 case 2: new Scanner(System.in);
                 Scanner sc3 = new Scanner (System.in);
                 System.out.println("ingrese dos numeros sucesivamente; el segundo será el que se restará:");
                  double numero3 = sc3.nextDouble();
                  double numero4 = sc3.nextDouble();
                    System.out.print("La resta es: ");
                     System.out.println(numero3-numero4);
                      break;
                 case 3: new Scanner(System.in);
                 Scanner sc4 = new Scanner (System.in);
                 System.out.println("ingrese dos numeros sucesivamente:");
                   double numero5 = sc4.nextDouble();
                   double numero6 = sc4.nextDouble();
                   System.out.print("El producto es: ");
                     System.out.println(numero5*numero6); 
                   break;
                 case 4: new Scanner(System.in);
                 Scanner sc5 = new Scanner (System.in);
                 System.out.println("ingrese dos numeros sucesivamente; el segundo será el divisor: ");
                  double numero7 = sc5.nextDouble();
                  double numero8 = sc5.nextDouble();
                  if (numero8 == 0){ //error cuando el divisor es 0
                      System.out.print("La división es: ");
                     System.out.println("Error de cálculo");    
                  }
                  else {
                  System.out.print("La división es: ");
                     System.out.println(numero7/numero8);  
                  } 
                  break;
                 case 5: new Scanner(System.in);
                 Scanner sc6 = new Scanner (System.in);
                  System.out.println("ingrese dos numeros sucesivamente; el segundo será el exponente: ");
                  int numero9 = sc6.nextInt();
                  int numero10 = sc6.nextInt();
                   int total = numero9; //iniciamos con un valor inicial que sera igual a la base 
                
                  if(numero10 > 0) {
                    for (int i=1; i < numero10; i++){
                        total = numero9*total; // e iremos iterando para ir cambiando el valor inicial el numero de veces segun el exponente
                        System.out.println(total); //imprimimos el ciclo for de la variable total ya iterada
                    }
                  }
                  else {
                     System.out.println("No es posible"); // si es menor que 0 el exponente no es posible
                  }
                    break;
            }
          }while (opcion1 < 6);
             break;



              
              




                
              case 2: new Scanner(System.in);
              System.out.println("Trigonometricas");
                System.out.println("1) seno");   
                System.out.println("2) coseno");
                System.out.println("3) Tangente");
                System.out.println("4) Salir");
                System.out.print("ingrese un número: ");
              int opcion2 = sc.nextInt();
              switch (opcion2) {
                case 1: new Scanner(System.in);
                Scanner sc8 = new Scanner(System.in);
                System.out.println("ingrese la iteración final ó precisión:");
                 int n = sc8.nextInt();
                 System.out.println("ingrese los grados: ");
              Scanner sc9 = new Scanner(System.in);
              double x = sc9.nextInt(); // grados
             // signo: int signo, int n
              // dividendo: int potencia, int potencia1, int n, int x
           //factorial: int factorial,int BaseFactorial, int n
               double seno = 0;
              for (int i = 0; i <= n; i++) { // for que recorre todas las iteraciones y las va sumando por métodos
                seno += Signo(-1,i)*dividendo(1,0,i,(x*3.141592654)/180)/(factorial(1,2*i+1));
              }
              System.out.println("seno("+x+")= "+seno);
                break;

                 case 2: new Scanner(System.in);
                 Scanner sc10 = new Scanner(System.in);
                 System.out.println("ingrese la iteración final ó precisión:");
                  n = sc10.nextInt();
                  System.out.println("ingrese los grados: ");
                  x = sc10.nextInt(); // grados
               double coseno = 0;
              for (int i = 0; i <= n; i++) { // for que recorre todas las iteraciones y las va sumando por métodos
                coseno += Signo(-1,i)*dividendoCos(1,0,i,(x*3.141592654)/180)/(factorial(1,2*i));
              }
              System.out.println("coseno("+x+")= "+coseno);
                 break;
                 case 3: new Scanner(System.in);
                 Scanner sc11 = new Scanner(System.in);
                 System.out.println("ingrese la iteración final ó precisión:");
                  n = sc11.nextInt();
                  System.out.println("ingrese los grados: ");
                  x = sc11.nextInt(); // grados
                  double seno1 = 0;
                  double coseno1 = 0;
                  for (int i = 0; i <= n; i++) { // for que recorre todas las iteraciones y las va sumando por métodos
                    seno1 += Signo(-1,i)*dividendo(1,0,i,(x*3.141592654)/180)/(factorial(1,2*i+1));
                  }
                  for (int i = 0; i <= n; i++) { // for que recorre todas las iteraciones y las va sumando por métodos
                    coseno1 += Signo(-1,i)*dividendoCos(1,0,i,(x*3.141592654)/180)/(factorial(1,2*i));
                  }
                  System.out.println("tangente("+x+")= "+seno1/coseno1);


                 break;
              }
               break;




               









              case 3: new Scanner(System.in); 
              System.out.println("Estadísticas");
              System.out.println("1) promedio");
              System.out.println("2) moda");
              System.out.println("3) varianza");
              System.out.println("4) desviacion estandar");
              System.out.println("5) salir"); 
              System.out.print("ingrese un número: ");
          Scanner sc9 = new Scanner(System.in);
            int opcion3 = sc9.nextInt();
            switch (opcion3) { 
              case 1: new Scanner(System.in);
              System.out.print("ingrese el tamaño del vector: ");
              Scanner sc10 = new Scanner(System.in);
              int numero11 = sc10.nextInt();
              System.out.println("ingrese los datos:");

                double ArreglodeDatos[] = new double[numero11]; // el tamaño no interfiere con la numeracion del array
                Scanner sc11 = new Scanner(System.in);
                String coma = sc11.nextLine();
                String[] Acomas = coma.split(","); // creamos el arreglo para agregar las comas
                 for (int i = 0; i < ArreglodeDatos.length; i++) {
                  ArreglodeDatos[i] = Double.parseDouble(Acomas[i]); // permite ir almacenando los datos, y convirtió el array de Acomas de string a double
                 }
  
                  double sumaDatos = ArreglodeDatos[0];
                 for (int i = 1; i < ArreglodeDatos.length; i++) {
                    sumaDatos =sumaDatos+ArreglodeDatos[i]; // realiza la suma de todos los datos
                 }
               System.out.println("el promedio es: "+sumaDatos/numero11);
                break;

                case 2: new Scanner(System.in); 
                System.out.print("ingrese el tamaño del vector: ");
              Scanner sc12 = new Scanner(System.in);
              int numero12 = sc12.nextInt();
              System.out.println("ingrese los datos:");
                double ArreglodeDatos1[] = new double[numero12]; // el tamaño no interfiere con la numeracion del array
                Scanner sc13 = new Scanner(System.in);
                String comas = sc13.nextLine();
                String[] Acomas1 = comas.split(",");
                 for (int i = 0; i < ArreglodeDatos1.length; i++) {
                  ArreglodeDatos1[i] = Double.parseDouble(Acomas1[i]); // permite ir almacenando los datos
                 }
                 int repMax = 0;
                 double MayorDato = 0;
                 int j = 0;
                for (int i = 0; i < ArreglodeDatos1.length; i++) {
                  int Rep = 0;
                  while (j < ArreglodeDatos1.length) {
                   if (ArreglodeDatos1[i] == ArreglodeDatos1[j]) {
                    Rep++;
                   }
                  else if (Rep > repMax) {
                    MayorDato = ArreglodeDatos1 [i]; //
                    repMax = Rep;
                   }
                   j++;
                  }
                }   // los contadores ayudan a 
                    System.out.println("la moda es: "+MayorDato);
                  break;
                  case 3: new Scanner(System.in);
                  System.out.print("ingrese el tamaño del vector: ");
                  Scanner s = new Scanner(System.in);
                  int num = s.nextInt();
                  System.out.println("ingrese los datos:");
                    double ArreglodeDatos3[] = new double[num]; // el tamaño no interfiere con la numeracion del array
                    Scanner s11 = new Scanner(System.in);
                    String coma2 = s11.nextLine();
                    String[] Acomas2 = coma2.split(","); // creamos el arreglo para agregar las comas
                     for (int i = 0; i < ArreglodeDatos3.length; i++) {
                      ArreglodeDatos3[i] = Double.parseDouble(Acomas2[i]); // permite ir almacenando los datos, y convirtió el array de Acomas de string a double
                     }
      
                      double sumaDatos1 = 0;
                     for (int i = 0; i < ArreglodeDatos3.length; i++) {
                        sumaDatos1 =sumaDatos1+ArreglodeDatos3[i]; // realiza la suma de todos los datos
                     }
                     double promed = sumaDatos1/num;
                  double sumaFinal =0;
                   double ArraySuma [] = new double[ArreglodeDatos3.length];
                   for (int i = 0; i < ArreglodeDatos3.length; i++) {
                    double varianzaBase = 1;
                    for (int k = 1; k <= 2; k++) {
                    varianzaBase = (ArreglodeDatos3[i]-promed)*varianzaBase;
                  }
                  ArraySuma[i] = varianzaBase;
                    }
                   
                   for (int i = 0; i < ArraySuma.length; i++) {
                    sumaFinal = sumaFinal+ArraySuma[i];                  
                   }
                   System.out.println("varianza es: "+sumaFinal/(num-1));
                  break; 

                  case 4: new Scanner(System.in);
                  System.out.print("ingrese el tamaño del vector: ");
                  Scanner st = new Scanner(System.in);
                  int num1 = st.nextInt();
                  System.out.println("ingrese los datos:");
                    double ArreglodeDatos4[] = new double[num1]; // el tamaño no interfiere con la numeracion del array
                    Scanner s12 = new Scanner(System.in);
                    String coma3 = s12.nextLine();
                    String[] Acomas3 = coma3.split(","); // creamos el arreglo para agregar las comas
                     for (int i = 0; i < ArreglodeDatos4.length; i++) {
                      ArreglodeDatos4[i] = Double.parseDouble(Acomas3[i]); // permite ir almacenando los datos, y convirtió el array de Acomas de string a double
                     }
      
                      double sumaDatos2 = 0;
                     for (int i = 0; i < ArreglodeDatos4.length; i++) {
                        sumaDatos2 =sumaDatos2+ArreglodeDatos4[i]; // realiza la suma de todos los datos
                     }
                     double promedi = sumaDatos2/num1;
                  double sumaFinal1 =0;
                   double ArraySuma1 [] = new double[ArreglodeDatos4.length];
                   for (int i = 0; i < ArreglodeDatos4.length; i++) {
                    double varianzaBase1 = 1;
                    for (int k = 1; k <= 2; k++) {
                    varianzaBase1 = (ArreglodeDatos4[i]-promedi)*varianzaBase1;
                  }
                  ArraySuma1[i] = varianzaBase1;
                    }
                   
                   for (int i = 0; i < ArraySuma1.length; i++) {
                    sumaFinal1 = sumaFinal1+ArraySuma1[i];                  
                   }
                   double varianza = sumaFinal1/(num1-1);
                   double x = 1;
                   for (int i = 1; i < 10; i++) { // secuencia para sacar la raíz cuadrada
                    x = (x+varianza/x)/2; 
                   }
                   System.out.println("desviación estandar es: "+x);


                  break;


            }
               break;










              case 4: new Scanner(System.in);
              System.out.println("Cálculo");
              System.out.println("1) Resolver sistema de ecuaciones lineales NxN con Gauss Jordan");
              System.out.println("2) salir");
              System.out.print("ingrese un numero: ");
               Scanner sc15 = new Scanner(System.in);
               int op = sc15.nextInt();

              switch (op){
                case 1: new Scanner(System.in);
                MetodoGaussJordan();
                break;
              }
               break;              
            default:new Scanner(System.in);
             System.out.println("Saliste");
              break;       
       }
      } while (opcion < 5);
    }
   




static void Imprimirmatriz(double matriz[][], int top) {
  for (int i = 0; i < top; i++) {
      for (int j = 0; j < top+1; j++) {
          System.out.print(" "+matriz[i][j]+"|");
      }
  
  }
}

static void pivot(double matriz[][], int pivot, int tope) {
  double temp = 0;
  temp = matriz[pivot][pivot];
  for (int j = 0; j < tope + 1; j++) {

      matriz[pivot][j] = matriz[pivot][j]/temp;
  }
}



static void ceros(double matriz[][], int pivot, int top1) {
  for (int i = 0; i < top1; i++) {
      if (i != pivot) {
          double c = matriz[i][pivot];
          for (int j= 0; j < (top1 + 1); j++) {
              matriz[i][j] = ((-1 * c) * matriz[pivot][j]) + matriz[i][j];
          }
      }
  }
}


static void MetodoGaussJordan(){  // en un solo método mandamos a llamar a todos los metodos para crear la funcion definitiva
 
 int piv = 0;

  Scanner sc = new Scanner(System.in);
  System.out.println("numrero de filas: ");
  int filas = sc.nextInt();

  System.out.println("numero de columnas: ");
  int columnas = sc.nextInt();

  double[][] Matriz = new double[filas][columnas+1];

  Scanner sc14 = new Scanner(System.in);

  for (int i=0; i<filas ; i++) {

      System.out.println("ingrese los coeficientes de la fila: "+(i+1));
      String Comas1 = sc14.nextLine();
      String[] comas2 = Comas1.split(",");
      for (int j = 0; j <columnas+1 ; j++) {
          Matriz[i][j] = Double.parseDouble(comas2[j]);
      }
  }




  for (int i = 0; i < filas; i++) {
      pivot(Matriz, piv, filas);

      System.out.println("Renglon " + (i + 1) + " entre el pivote");
      Imprimirmatriz(Matriz, filas);

      System.out.println("");

      System.out.println("haciendo ceros");
      ceros(Matriz, piv, filas);

      Imprimirmatriz(Matriz, filas);
      System.out.println("");
      piv++;
  }
  for (int i = 0; i < filas; i++) {
      System.out.println("X" + (i + 1) + " = " + Matriz[i][filas]);
  }
 }
}