package Dominio;

import java.util.ArrayList;

public class DetalleDesastre extends Desastre {

    private ArrayList<String> listaDesastres;

    public DetalleDesastre(String año, String lugar, String magnitud, String tipoDesastre, String personasAfectadas) {
        super(año, lugar, magnitud, tipoDesastre, personasAfectadas);

    }
}
