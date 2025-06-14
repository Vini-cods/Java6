public class AlunoAcademia {
    String nome;
    double peso;     // em kg
    double altura;   // em metros

    public AlunoAcademia(String nome, double peso, double altura) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }

    public double calcularIMC() {
        return peso / (altura * altura);
    }

    public void exibirStatus() {
        double imc = calcularIMC();
        System.out.println("Nome: " + nome);
        System.out.println("IMC: " + imc);

        if (imc < 18.5) {
            System.out.println("Classificação: Abaixo do peso");
        } else if (imc < 25) {
            System.out.println("Classificação: Peso normal");
        } else if (imc < 30) {
            System.out.println("Classificação: Sobrepeso");
        } else {
            System.out.println("Classificação: Obesidade");
        }
    }
}