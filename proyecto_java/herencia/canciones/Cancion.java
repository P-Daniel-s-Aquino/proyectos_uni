package herencia.canciones;

public abstract class Cancion {
    
    private int referencia;
    private String titulo;
    private String album;
    private String grupo;

    public Cancion(int referencia, String titulo, String album, String grupo) {
        this.referencia = referencia;
        this.titulo = titulo;
        this.album = album;
        this.grupo = grupo;
    }

    public int getReferencia() {
        return referencia;
    }

    public void setReferencia(int referencia) {
        this.referencia = referencia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }
    
    public abstract void imprimirCancion();
}