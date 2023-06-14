public class condicionales {
    public static void main(String[] args) {

        int edad = 21;
        int cantidad = 2;

        if (edad >= 18) {
            System.out.println("Usted puede entrar");
        } else {
            if (cantidad >= 2){
                System.out.println("Usted es menor de edad pero puede pasar");
            } else {
                System.out.println("Usted no puede entrar");
            }
        }
        
    }
}
