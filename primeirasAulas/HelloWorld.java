package primeirasAulas;

/*
 * HelloWorld -> nome da minha classe
 * public -> tipo de acesso da classe
 * class -> palavra reservada para definir uma classe
 * define o tipo do objeto
 */
public class HelloWorld {
    /*
     * método main -> ponto de entrada do programa
     * public -> modificador de acesso
     * static -> método estático
     * void -> tipo de retorno do método
     */
    public static void main(String[] args) {

        int dadoDoTipoInt = 10;
        double dadoDoTipoDouble = 10.0;
        float dadoDoTipoFloat = 10.0f;
        long dadoDoTipoLong = 10L;

        char dadoDoTipoChar = 'a';
        boolean dadoDoTipoBoolean = true;
        String dadoDoTipoString = "Hello World!";

        // if (dadoDoTipoInt == 10) {
        // System.out.println("O valor é 10");
        // } else if (dadoDoTipoInt == 20) {
        // System.out.println("O valor é 20");
        // } else {
        // System.out.println("O valor não é 10");
        // }

        // int valorInicial = 0;
        // while (valorInicial < 10) {
        // System.out.println("O valor é: " + valorInicial);
        // valorInicial++;

        // }

        for (int i = 0; i < 10; i++) {
            System.out.println("O valor é: " + i);
        }
    }

}