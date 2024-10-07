public class Funcionario {

    protected String nome;
    protected int nasc, idade, horasTrabalhadas;
    protected double valorHora, salario;

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public  void setIdade(int idade) {
        this.idade = idade;
    }
    public int getIdade() {
        return idade;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public void informarSalario(){
        salario = valorHora * horasTrabalhadas;
    }

    public void calcularIdade() {
        nasc = 2024 - idade;
    }

}
