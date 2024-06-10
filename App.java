public class App {
    public static void main(String[] args) throws Exception {
        Relogio relogio = new Relogio (12, 60);

        System.out.println("hora:" + relogio.mostraHora());
        relogio.IncrementaMinuto();
        System.out.println("Hora:\n" + relogio.mostraHora());
    }
}
