public class Hermione {
    public static void main(String[] args) {
        def();
    }
    public static void def( ) {
        Personaje harry = new Personaje(
                "Hermione Granger",
                "Gryffindor",
                "Femenino",
                "Reprobar examenes",
                "Nutria"
        );
        String msg = harry.printState();
        System.out.print(msg);
    }
}
