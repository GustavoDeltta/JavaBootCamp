public class MyClass {

    public static void main (String [] args){

        String primeroNome = "Gustavo";
        String segundoNome = "Sousa";

        // Variável que inicia e já recebe o resultado do método.
        String nomeCompleto = nomeCompleto(primeroNome, segundoNome);
        System.out.println(nomeCompleto);

    }

    // Método que concatena o meu primeiro e segundo nome.
    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
    }

}
