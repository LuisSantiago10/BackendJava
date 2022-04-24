public class Harry {
    public static void main(String[] args) {
        def();
    }
    public static void def( ) {
        Personaje harry = new Personaje(
                "Harry Potter",
                "Gryffindor",
                "Masculino",
                "Dementor",
                "Ciervo"
        );
        String msg = harry.printState();
        System.out.print(msg);
    }
}
