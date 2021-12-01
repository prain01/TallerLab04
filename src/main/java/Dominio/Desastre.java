package Dominio;

public class Desastre {

    protected String año;
    protected String lugar;
    protected String magnitud;
    protected String tipoDesastre;
    protected String personasAfectadas;

    public Desastre(String año, String lugar, String magnitud, String tipoDesastre, String personasAfectadas) {
        this.año = año;
        this.lugar = lugar;
        this.magnitud = magnitud;
        this.tipoDesastre = tipoDesastre;
        this.personasAfectadas = personasAfectadas;
    }

    public String getAño() {
        return año;
    }

    public String getTipoDesastre() {
        return tipoDesastre;
    }

    public void setTipoDesastre(String tipoDesastre) {
        this.tipoDesastre = tipoDesastre;
    }

    public String getPersonasAfectadas() {
        return personasAfectadas;
    }

    public void setPersonasAfectadas(String personasAfectadas) {
        this.personasAfectadas = personasAfectadas;
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
