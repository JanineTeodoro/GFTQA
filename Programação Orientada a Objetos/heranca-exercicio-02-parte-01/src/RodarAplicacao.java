public class RodarAplicacao {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        //Upcast - gerente, vendedor e faxineiro são subtipos de funcionário
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        //Downcast - precisa ser feito de forma explicita - evitar devido aos erros de compilação.
        Vendedor vendedor1 = (Vendedor) new Funcionario();

    }
}