package Gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal extends  JFrame implements ActionListener {

    private VentanaModelo modelo = new VentanaModelo();

    private JPanel panelIngresarDatos, panelMostrarDatos;
    private JButton botonAgregar;
    private JLabel etiquetaPedirDatos, etiquetaAño, etiquetaLugar, etiquetaMagnitud, etiquetaTipoDesastre, etiquetaPersonasAfectadas;
    private JTextField cajaTextoAño, cajaTextoLugar, cajaTextoMagnitud, cajaTextoTipoDesastre, cajaTextoPersonasAfectadas;
    private JCheckBox checkBox;

    private final int ancho = 600;
    private final int alto = 600;
    private final int anchoEtiqueta =  140;
    private final int altoEtiqueta =  20;
    private final int anchoCajaTexto =  200;
    private final int altoCajaTexto =  20;

    public VentanaPrincipal() {
        setTitle("Desastres");
        setSize(ancho, alto);
        setLocationRelativeTo(null);
        setResizable(false);
        iniciarComponenetes();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void iniciarComponenetes() {
        crearPanel();
        crearBoton();
        crearEtiquetas();
        crearCajaTexto();
        panelIngresarDatos.updateUI();
    }

    private void crearPanel() {
        panelIngresarDatos = new JPanel();
        panelIngresarDatos.setLayout(null);
        add(panelIngresarDatos);

        panelMostrarDatos = new JPanel();
        panelMostrarDatos.setLayout(new FlowLayout());
        panelMostrarDatos.setBounds(0,300, 600, 300);
        panelMostrarDatos.setBackground(Color.blue);
        add(panelMostrarDatos);
    }

    private void crearBoton() {
        botonAgregar = modelo.crearBoton(botonAgregar, "Agregar");
        botonAgregar.setBounds(20, 175, 100, 20);
        botonAgregar.addActionListener(this);
        panelIngresarDatos.add(botonAgregar);
    }

    private void crearEtiquetas() {
        etiquetaPedirDatos = modelo.crearEtiqueta(etiquetaPedirDatos, "Ingresa una Desastre");
        etiquetaPedirDatos.setBounds(10, 10, 185, altoEtiqueta);
        panelIngresarDatos.add(etiquetaPedirDatos);

        etiquetaAño = modelo.crearEtiqueta(etiquetaAño, "Año: ");
        etiquetaAño.setBounds(20, 40, anchoEtiqueta, altoEtiqueta);
        panelIngresarDatos.add(etiquetaAño);

        etiquetaLugar = modelo.crearEtiqueta(etiquetaLugar, "Lugar : ");
        etiquetaLugar.setBounds(20, 65, anchoEtiqueta, altoEtiqueta);
        panelIngresarDatos.add(etiquetaLugar);

        etiquetaMagnitud = modelo.crearEtiqueta(etiquetaMagnitud, "Magnitud: ");
        etiquetaMagnitud.setBounds(20, 90, anchoEtiqueta, altoEtiqueta);
        panelIngresarDatos.add(etiquetaMagnitud);

        etiquetaTipoDesastre = modelo.crearEtiqueta(etiquetaTipoDesastre, "Tipo: ");
        etiquetaTipoDesastre.setBounds(20, 115, anchoEtiqueta, altoEtiqueta);
        panelIngresarDatos.add(etiquetaTipoDesastre);

        etiquetaPersonasAfectadas = modelo.crearEtiqueta(etiquetaPersonasAfectadas, "Cant. Afectados: ");
        etiquetaPersonasAfectadas.setBounds(20, 140, anchoEtiqueta, altoEtiqueta);
        panelIngresarDatos.add(etiquetaPersonasAfectadas);
    }

    private void crearCajaTexto() {
        cajaTextoAño = modelo.crearCajaTexto(cajaTextoAño);
        cajaTextoAño.setBounds(anchoEtiqueta + 30, (int) etiquetaAño.getLocation().getY(), anchoCajaTexto, altoCajaTexto);
        panelIngresarDatos.add(cajaTextoAño);

        cajaTextoLugar = modelo.crearCajaTexto(cajaTextoLugar);
        cajaTextoLugar.setBounds(anchoEtiqueta + 30, (int) etiquetaLugar.getLocation().getY(), anchoCajaTexto, altoCajaTexto);
        panelIngresarDatos.add(cajaTextoLugar);

        cajaTextoMagnitud = modelo.crearCajaTexto(cajaTextoMagnitud);
        cajaTextoMagnitud.setBounds(anchoEtiqueta + 30, (int) etiquetaMagnitud.getLocation().getY(), anchoCajaTexto, altoCajaTexto);
        panelIngresarDatos.add(cajaTextoMagnitud);

        cajaTextoTipoDesastre = modelo.crearCajaTexto(cajaTextoTipoDesastre);
        cajaTextoTipoDesastre.setBounds(anchoEtiqueta + 30, (int) etiquetaTipoDesastre.getLocation().getY(), anchoCajaTexto, altoCajaTexto);
        panelIngresarDatos.add(cajaTextoTipoDesastre);

        cajaTextoPersonasAfectadas = modelo.crearCajaTexto(cajaTextoPersonasAfectadas);
        cajaTextoPersonasAfectadas.setBounds(anchoEtiqueta + 30, (int) etiquetaPersonasAfectadas.getLocation().getY(), anchoCajaTexto, altoCajaTexto);
        panelIngresarDatos.add(cajaTextoPersonasAfectadas);
    }

    private void crearCheckbox() {
        checkBox = new JCheckBox(cajaTextoAño.getText());
        checkBox.setBounds(100, 250, 300, 20);
        checkBox.addActionListener(this);
        panelIngresarDatos.add(checkBox);
        panelIngresarDatos.updateUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.botonAgregar) {
            crearCheckbox();
        }
        if (e.getSource() == this.checkBox) {
            checkBox.setText("hecho" );
        }
    }
}
