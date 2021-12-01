package Dominio;

public class Desastre {

    protected String año;
    protected String lugar;
    protected String magnitud;

    public Desastre(String año, String lugar, String magnitud) {
        this.año = año;
        this.lugar = lugar;
        this.magnitud = magnitud;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getMagnitud() {
        return magnitud;
    }

    public void setMagnitud(String magnitud) {
        this.magnitud = magnitud;
    }
}
