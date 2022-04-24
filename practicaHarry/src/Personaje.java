public class Personaje {
    public String nombre,casa,genero,boggart,patronus;

    public Personaje ( String nombre,String casa,String genero,String boggart,String patronus ){
        this.nombre = nombre;
        this.casa = casa;
        this.genero = genero;
        this.boggart = boggart;
        this.patronus = patronus;
    }

    public String printState(){
        return  "Nombre: "+ nombre +" \n "+
                "Casa: "+ casa +" \n "+
                "Genero: "+ genero +" \n "+
                "Boggart: "+ boggart +" \n "+
                "Patronus: "+ patronus +" \n ";
    }

}
