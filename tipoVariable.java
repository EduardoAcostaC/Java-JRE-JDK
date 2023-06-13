public class tipoVariable {
    public static void main(String[] args) {
        System.out.println("Hola Mundo!!!");

        // Tipo de dato "int"
        int edad = 21;
        System.out.println(edad);

        //Reasignacion de valores a variables (Una vez declarados no es necesario poner el tipo de dato)
        edad = 28;
        System.out.println(edad);

        edad = 28 + 45;
        System.out.println("Mi edad es: " + edad); //Concatenacion con ayuda de '+'

        //Tipo de dato "double"

        double salario = 1250.50;
        System.out.println(salario);  //Tambien se puede usar double para declarar valores enteros

        double salarioMitad = salario/2;
        System.out.println(salarioMitad);  //El resultado de una division entera siempre sera redondeada

        //Conversion de datos
        double variable1 = 230.89;
        int variable1Entero = (int) variable1; //Conversion de double a entero
        System.out.println(variable1Entero);

        //long para valores de 64bits (2^63)
        long prueba = 122222222222222222L;
        //System.out.println(prueba);

        //short para valores pequeno (2^16)
        short numeroPequeno = 13555;
        //System.out.println(numeroPequeno);

        //byte numeros aun mas pequenos 
        byte numeroMasPequeno = 15;  
        //System.out.println(numeroMasPequeno);

        //float numero decimal pequeno
        float numeroDecimal = 2.5F;
        //System.out.println(numeroDecimal);

        int resultado = (int) variable1 + variable1Entero;
        System.out.println(resultado);
        





    }
}
