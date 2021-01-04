class Main{
  public static void main(String[] args){
    int numero = 10;
    int numero1 = 10;
    double num = 10;
    double num2 = 10;
    imprimirEnConsola("Lleva tu codigo a otro nivel");
    int resultado = 0;
    resultado = suma(numero,numero1);
    imprimirEnConsola(Integer.toString(resultado));
    double r1 = Math.pow(num, num2);
    imprimirEnConsola(Double.toString(r1));

  
  }
  public static void imprimirEnConsola(String Var){
    System.out.println(Var);
  }
  public static int suma(int b, int c){
    int suma = b + c;
    return suma;
  }
  //elevar un numero a la n potencia
  public static double potencia(double n1, double n2){
    double res = Math.pow(n1,n2);
    return res;
  }
}

