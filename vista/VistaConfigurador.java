package vista;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class VistaConfigurador extends JFrame {

    private JPanel panelPrincipal;
    private JPanel panelSockets;
    private JPanel panelComponentes;
    private JScrollPane scrollSockets;

    private JLabel titulo;
    private JLabel etiquetaPrecio;
    private JButton botonGuardar;
    private JButton botonComprar;

    public ArrayList<JButton> botonesSocket;
    public JComboBox<String> listaPlacasBase;
    public JComboBox<String> listaCPU;
    public JComboBox<String> listaRAM;
    public JComboBox<String> listaGPU;
    public JComboBox<String> listaAlmacenamiento;
    public JComboBox<String> listaFuente;
    public JComboBox<String> listaCaja;
    public JComboBox<String> listaDisipador;

    public VistaConfigurador() {
        inicializarComponentes();
        construirLayout();
        configurarVentana();
        this.setVisible(true);
    }

    private void inicializarComponentes() {
        panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new BoxLayout(panelPrincipal, BoxLayout.Y_AXIS));
        panelPrincipal.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        titulo = new JLabel("<html><h2>Configura tu Ordenador</h2></html>");
        titulo.setAlignmentX(Component.CENTER_ALIGNMENT);

        panelSockets = new JPanel();
        panelSockets.setLayout(new FlowLayout(FlowLayout.LEFT));
        panelSockets.setBorder(BorderFactory.createTitledBorder("Selecciona un socket"));

        scrollSockets = new JScrollPane(panelSockets);
        scrollSockets.setPreferredSize(new Dimension(800, 100));

        botonesSocket = new ArrayList<>();

        // Componentes
        panelComponentes = new JPanel(new GridLayout(8, 2, 10, 10));
        panelComponentes.setBorder(BorderFactory.createTitledBorder("Selecciona componentes compatibles"));

        listaPlacasBase = new JComboBox<>();
        listaCPU = new JComboBox<>();
        listaRAM = new JComboBox<>();
        listaGPU = new JComboBox<>();
        listaAlmacenamiento = new JComboBox<>();
        listaFuente = new JComboBox<>();
        listaCaja = new JComboBox<>();
        listaDisipador = new JComboBox<>();

        panelComponentes.add(new JLabel("Placa Base:"));
        panelComponentes.add(listaPlacasBase);
        panelComponentes.add(new JLabel("Procesador (CPU):"));
        panelComponentes.add(listaCPU);
        panelComponentes.add(new JLabel("Memoria RAM:"));
        panelComponentes.add(listaRAM);
        panelComponentes.add(new JLabel("Tarjeta Gráfica (GPU):"));
        panelComponentes.add(listaGPU);
        panelComponentes.add(new JLabel("Almacenamiento:"));
        panelComponentes.add(listaAlmacenamiento);
        panelComponentes.add(new JLabel("Fuente de Alimentación:"));
        panelComponentes.add(listaFuente);
        panelComponentes.add(new JLabel("Caja:"));
        panelComponentes.add(listaCaja);
        panelComponentes.add(new JLabel("Disipador:"));
        panelComponentes.add(listaDisipador);

        // Precio
        etiquetaPrecio = new JLabel("Precio Total: 0€");
        etiquetaPrecio.setFont(new Font("Arial", Font.BOLD, 16));
        etiquetaPrecio.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Botones
        botonGuardar = new JButton("Guardar Configuración");
        botonGuardar.setBackground(new Color(128, 0, 32));
        botonGuardar.setForeground(Color.WHITE);

        botonComprar = new JButton("Comprar");
        botonComprar.setBackground(new Color(128, 0, 32).darker());
        botonComprar.setForeground(Color.WHITE);
    }

    private void construirLayout() {
        panelPrincipal.add(titulo);
        panelPrincipal.add(Box.createRigidArea(new Dimension(0, 10)));
        panelPrincipal.add(scrollSockets);
        panelPrincipal.add(Box.createRigidArea(new Dimension(0, 10)));
        panelPrincipal.add(panelComponentes);
        panelPrincipal.add(Box.createRigidArea(new Dimension(0, 10)));
        panelPrincipal.add(etiquetaPrecio);

        JPanel panelBotones = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        panelBotones.add(botonGuardar);
        panelBotones.add(botonComprar);

        this.setLayout(new BorderLayout());
        this.add(panelPrincipal, BorderLayout.CENTER);
        this.add(panelBotones, BorderLayout.SOUTH);
    }

    private void configurarVentana() {
        this.setTitle("Configurador de Ordenador");
        this.setSize(950, 750);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    // Método para añadir dinámicamente botones de socket desde el controlador
    public void agregarBotonSocket(String nombreSocket) {
        JButton boton = new JButton(nombreSocket);
        boton.setBackground(new Color(128, 0, 32));
        boton.setForeground(Color.WHITE);
        botonesSocket.add(boton);
        panelSockets.add(boton);
        panelSockets.revalidate();
        panelSockets.repaint();
    }

    public void actualizarPrecio(double precio) {
        etiquetaPrecio.setText("Precio Total: " + String.format("%.2f", precio) + "€");
    }

    // Getters
    public JButton getBotonGuardar() {
        return botonGuardar;
    }

    public JButton getBotonComprar() {
        return botonComprar;
    }
}
