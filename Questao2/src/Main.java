public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Rex", "Labrador");
        Gato gato = new Gato("Minhoca", "Siamês");

        System.out.println("O cachorro " + cachorro.getNome() + " da raça " + cachorro.getRaca()  + cachorro.getLatido());
        System.out.println("O gato " + gato.getNome() + " da raça " + gato.getRaca() +  gato.getMiado());
    }
}