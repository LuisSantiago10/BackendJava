public class Voldemort {
    public static void main(String[] args) {
        def();
    }
    public static void def( ) {
        Personaje harry = new Personaje(
                "Minerva McGonagall",
                "Gryffindor",
                "Femenina",
                "Voldemort",
                "Gato"
        );
        String msg = harry.printState();
        System.out.print(msg);
    }
}
