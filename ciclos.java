public class ciclos {
    public static void main(String[] args) {
        
        int contador = 0;
        System.out.println("Impresion con ciclo while");
        while (contador <= 10){
            System.out.println(contador);
            //contador =  contador + 1;
            //contador += 1;
            contador ++;
        }

        System.out.println("Impresion con ciclo for");
            //variable      condicion       ejecutar al FINAL   
        for (int contar = 0; contar <= 10; contar++){
            System.out.println(contar);
        }


    }
}
