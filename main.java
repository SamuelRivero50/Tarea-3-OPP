public class main {
    public static void main(String[] args) {
        Ave ave1 = new Ave("Paloma", true);
        Ave ave2 = new Ave("Pato", true);
        Ave ave3 = new Ave("Aguila", "Marron", true);
        Ave ave4 = new Ave("Gallina", "Blanco", false);
        Ave ave5 = new Ave("Loro", "Verde", true);

        ave1.volar();
        ave2.volar();
        ave3.volar();
        ave4.volar();
        ave5.volar();

        ave3.color();
        ave4.color();
        ave5.color();

    }
}
