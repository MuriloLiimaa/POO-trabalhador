public class Main {
    public static void main(String[] args) {
        try {
            // Tentativa de instanciar com dados inválidos para validar exceções
            PessoaTrabalhadoraEstudante pessoaInvalida = new PessoaTrabalhadoraEstudante("Jo", -5, 1500.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao criar pessoa: " + e.getMessage());
        }

        // Instância válida
        PessoaTrabalhadoraEstudante pessoa = new PessoaTrabalhadoraEstudante("Carlos", 25, 2000.0);

        // Teste dos métodos
        pessoa.trabalhar();
        System.out.println("Salário: " + pessoa.receberSalario());

        pessoa.estudar();
        System.out.println("Nota sem comentário: " + pessoa.tirarNota());
        System.out.println("Nota com comentário: " + pessoa.tirarNota("Excelente desempenho!"));
    }
}
