public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        //tipos primitivos
        //classe String representa texto na aplicação
        String meuNome = "Janine Teodoro";
        
        double salarioMinimo = 2500; //2.500 é igual a 2,5. O ponto é a vírgula.
    
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; //casting

        int numero = 5;
        numero = 10;

        System.out.print(numero);

        final double VALOR_DE_PI = 3.14; //constante
    }
}
