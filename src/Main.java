// Método principal para testar a classe Caneta
public class Main {
    public static void main(String[] args) {
        Caneta minhaCaneta = new Caneta("Azul", "BIC", 14.5);
        minhaCaneta.destampar();
        minhaCaneta.escrever("Olá, mundo!");
        minhaCaneta.tampar();
    }
}