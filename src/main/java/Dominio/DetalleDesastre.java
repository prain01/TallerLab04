package Dominio;

import java.util.ArrayList;

public class DetalleDesastre {

    private String tipoDesastre;
    private String personasAfectadas;
    private ArrayList<Desastre> listaDesastres;

    public DetalleDesastre(String tipoDesastre, String personasAfectadas, ArrayList<Desastre> listaDesastres) {
        this.tipoDesastre = tipoDesastre;
        this.personasAfectadas = personasAfectadas;
        this.listaDesastres = listaDesastres;
    }
}
