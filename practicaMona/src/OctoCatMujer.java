public class OctoCatMon extends OctoCat{
    public String vestido;
    public String peluca;
    public OctoCatMon(String nombre, int tentaculos, int orejas, int bigote, String genero, String tipo, String vestido,String peluca) {
        super(nombre, tentaculos, orejas, bigote, genero, tipo);
        this.vestido = vestido;
        this.peluca = peluca;
    }

    @Override
    public String printState(){
        return  "Nombre: "+ nombre +" \n "+
                "Genero: "+ genero +" \n "+
                "Tentaculo: "+ tentaculos +" \n "+
                "Orejas: "+ orejas +" \n "+
                "Bigotes: "+ bigote +" \n "+
                "Tipo: "+ tipo +" \n "+
                "Vestido: "+ vestido +" \n "+
                "Peluca: "+ peluca +" \n ";
    }
}
