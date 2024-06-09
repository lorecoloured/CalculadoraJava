import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            boolean inputValido = false;
            double num1 = 0;
            double num2 = 0;
            char operacion = ' ';

            while (!inputValido) {
                try {
                    System.out.println("Introduce el primer número: ");
                    num1 = Double.parseDouble(scanner.nextLine());

                    System.out.println("Introduce el segundo número: ");
                    num2 = Double.parseDouble(scanner.nextLine());

                    System.out.println("Elige la operación: +, -, *, /");
                    operacion = scanner.nextLine().charAt(0);

                    inputValido = true;
                } catch (NumberFormatException e) {
                    System.out.println("Esto no es un número, introduce un valor numérico por favor.");
                } catch (StringIndexOutOfBoundsException e) {
                    System.out.println("Operación no válida. Introduce una operación válida por favor.");
                }
            }

            double resultado = 0;
            boolean operacionValida = true;

            switch (operacion) {
                case '+':
                    resultado = sumar(num1, num2);
                    break;
                case '-':
                    resultado = restar(num1, num2);
                    break;
              /*  case '*':
                    resultado = multiplicar(num1, num2);
                    break;
                case '/':
                    if (num2 != 0) {
                        resultado = dividir(num1, num2);
                    } else {
                        System.out.println("Error: No se puede dividir por cero.");
                        operacionValida = false;
                    }
                    break; */
                default:
                    System.out.println("Operación no válida.");
                    operacionValida = false;
                    break;
            }

            if (operacionValida) {
                System.out.println("El resultado es: " + resultado);
            }

            scanner.close();
        }

        public static double sumar(double a, double b) {
            return a + b;
        }

        public static double restar(double a, double b) {
            return a - b;
        }

       /* public static double multiplicar(double a, double b) {
            return a * b;
        }

        public static double dividir(double a, double b) {
            return a / b;
        } */
    }

