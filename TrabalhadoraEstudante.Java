public class PessoaTrabalhadoraEstudante extends Pessoa implements Trabalhador, Estudante {
    private double salario;
    private int nota;

    public PessoaTrabalhadoraEstudante(String nome, int idade, double salario) {
        super(nome, idade);
        this.salario = salario;
    }

    @Override
    public void trabalhar() {
        System.out.println(getNome() + " está trabalhando.");
    }

    @Override
    public double receberSalario() {
        return salario;
    }

    @Override
    public void estudar() {
        System.out.println(getNome() + " está estudando.");
    }

    @Override
    public int tirarNota() {
        nota = (int) (Math.random() * 100); // Gera uma nota aleatória
        return nota;
    }

    public int tirarNota(String comentario) {
        int notaComComentario = tirarNota();
        System.out.println("Comentário sobre a nota: " + comentario);
        return notaComComentario;
    }
}
