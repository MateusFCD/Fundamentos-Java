package pessoa;

public class TesteDePessoa {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("João");
        pessoa1.setIdade(20);
        pessoa1.setCpf("123.456.789-00");

        Professor pessoa2 = new Professor();
        pessoa2.setNome("Maria");
        pessoa2.setIdade(30);
        pessoa2.setCpf("123.123.123-123");
        pessoa2.setSalario(1000);

        Aluno pessoa3 = new Aluno();
        pessoa3.setNome("José");
        pessoa3.setIdade(18);
        pessoa3.setCpf("321.321.321-321");
        pessoa3.setMatricula("123456");

        System.out.println(pessoa2.imprimirDadosDaPessoa());

    }
}
