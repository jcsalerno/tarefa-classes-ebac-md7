// Classe que representa uma Caneta no mundo real
public class Caneta {
    // Propriedades da caneta
    private String cor;
    private String marca;
    private double comprimento;
    private boolean tampada;

    // Construtor para inicializar uma nova caneta
    public Caneta(String cor, String marca, double comprimento) {
        this.cor = cor;
        this.marca = marca;
        this.comprimento = comprimento;
        this.tampada = true; // A caneta começa tampada
    }

    // Método para obter a cor da caneta
    public String getCor() {
        return cor;
    }

    // Método para definir a cor da caneta
    public void setCor(String cor) {
        this.cor = cor;
    }

    // Método para obter a marca da caneta
    public String getMarca() {
        return marca;
    }

    // Método para definir a marca da caneta
    public void setMarca(String marca) {
        this.marca = marca;
    }

    // Método para obter o comprimento da caneta
    public double getComprimento() {
        return comprimento;
    }

    // Método para definir o comprimento da caneta
    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    // Método para verificar se a caneta está tampada
    public boolean isTampada() {
        return tampada;
    }

    // Método para tampar a caneta
    public void tampar() {
        tampada = true;
    }

    // Método para destampar a caneta
    public void destampar() {
        tampada = false;
    }

    // Método para escrever usando a caneta
    public void escrever(String texto) {
        if (tampada) {
            System.out.println("A caneta está tampada. Destampe-a para escrever.");
        } else {
            System.out.println("Escrevendo: " + texto);
        }
    }
}