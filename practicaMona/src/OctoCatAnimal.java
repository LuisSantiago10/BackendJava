public class OctoCatCat extends OctoCat{
    public int cola;

    public OctoCatCat(String nombre, int tentaculos, int orejas, int bigote, String genero, String tipo, int cola) {
        super(nombre, tentaculos, orejas, bigote, genero, tipo);
        this.cola = cola;
    }
    @Override
    public String printState(){
        return  "Nombre: "+ nombre +" \n "+
                "Genero: "+ genero +" \n "+
                "Tentaculo: "+ tentaculos +" \n "+
                "Orejas: "+ orejas +" \n "+
                "Bigotes: "+ bigote +" \n "+
                "Tipo: "+ tipo +" \n "+
                "Colas: "+ cola +" \n ";
    }
}
