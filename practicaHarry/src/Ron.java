public class Ron {
    public static void main(String[] args) {
        def();
    }
    public static void def( ) {
        Personaje harry = new Personaje(
                "Ron Weasley",
                "Gryffindor",
                "Masculino",
                "Acromántula",
                "Jack Russel Terrier"
        );
        String msg = harry.printState();
        System.out.print(msg);
    }
}
