public class tablaMultiplicar {
    public static void main(String[] args) {
        for (int contador = 0; contador <= 10; contador++){
            for(int multi = 0; multi <=10; multi++){
                System.out.print(contador * multi);
                System.out.print(" ");
            }
            System.out.println();
        }


        System.out.println("Ejercicio de Matriz");
        for(int fila = 0; fila <=10; fila++){
            for(int columna = 0; columna < fila; columna++){
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
