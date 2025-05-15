package vista;

import javax.swing.*;
import java.awt.*;

public class VistaUsuario extends JFrame {

    public JButton NuevaConfiguracion;
    public JButton VerConfiguraciones;
    private JLabel tituloUsuario;
    private JPanel panelPrincipal;

    private String nombre; // ← Nuevo campo para el nombre del usuario

    public VistaUsuario(String nombre) {
        this.nombre = nombre;
        inicializarComponentes();
        construirLayout();
        configurarVentana();
        this.setVisible(true);
    }

    private void inicializarComponentes() {
        NuevaConfiguracion = new JButton("Nueva Configuración");
        VerConfiguraciones = new JButton("Ver Mis Configuraciones");

        // Estética: granate oscuro y blanco (como en la vista de admin)
        Color granate = new Color(128, 0, 32);
        NuevaConfiguracion.setBackground(granate);
        NuevaConfiguracion.setForeground(Color.WHITE);

        VerConfiguraciones.setBackground(granate.darker());
        VerConfiguraciones.setForeground(Color.WHITE);

        tituloUsuario = new JLabel("<html><h2>Bienvenido, " + nombre + "</h2></html>");
        tituloUsuario.setAlignmentX(Component.CENTER_ALIGNMENT);

        panelPrincipal = new JPanel();
    }

    private void construirLayout() {
        panelPrincipal.setLayout(new BoxLayout(panelPrincipal, BoxLayout.Y_AXIS));
        panelPrincipal.setBorder(BorderFactory.createEmptyBorder(40, 40, 40, 40));

        panelPrincipal.add(tituloUsuario);
        panelPrincipal.add(Box.createRigidArea(new Dimension(0, 30)));
        panelPrincipal.add(NuevaConfiguracion);
        panelPrincipal.add(Box.createRigidArea(new Dimension(0, 20)));
        panelPrincipal.add(VerConfiguraciones);

        NuevaConfiguracion.setAlignmentX(Component.CENTER_ALIGNMENT);
        VerConfiguraciones.setAlignmentX(Component.CENTER_ALIGNMENT);

        JPanel centerWrapper = new JPanel(new GridBagLayout());
        centerWrapper.add(panelPrincipal);

        this.setLayout(new BorderLayout());
        this.add(centerWrapper, BorderLayout.CENTER);
    }

    private void configurarVentana() {
        this.setTitle("Panel de Usuario");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    // Getter opcional para el nombre del usuario
    public String getNombre() {
        return nombre;
    }
}
