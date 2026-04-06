package herencia.canciones;

public class Clasica extends Cancion {

    private String instrumentos;

    public Clasica(int referencia, String titulo, String album, String grupo, String instrumentos) {
        super(referencia, titulo, album, grupo);
        this.instrumentos = instrumentos;
    }

    public String getInstrumentos() {
        return instrumentos;
    }

    public void setInstrumentos(String instrumentos) {
        this.instrumentos = instrumentos;
    }

    @Override
    public void imprimirCancion() {
        System.out.println("\n<<<<<<<<DATOS DE LA CANCION>>>>>>>>");
        System.out.printf(
            "Referencia: %d%n" +
            "Titulo: %s%n" +
            "Album: %s%n" +
            "Grupo: %s%n" +
            "Instrumentos: %s%n",
            this.getReferencia(),
            this.getTitulo(),
            this.getAlbum(),
            this.getGrupo(),
            this.instrumentos
        );
    }
}