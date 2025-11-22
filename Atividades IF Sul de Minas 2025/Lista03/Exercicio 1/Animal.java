
package Exercicio1;

public class Animal {
    private String nome;
    private String raca;
    private float peso;
    private float altura;
    private byte idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public byte getIdade() {
        return idade;
    }

    public void setIdade(byte idade) {
        this.idade = idade;
    }
    
    public void exibeDados(){
        System.out.println("Raça: " + getRaca());
        System.out.println("Nome: " + nome);
        System.out.println("idade: " + idade);
        System.out.println("Altura: " + nome);
        System.out.println("Peso: " + getPeso());
    }
  
}
