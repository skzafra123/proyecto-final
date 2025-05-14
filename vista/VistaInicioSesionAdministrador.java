package vista;

import javax.swing.*;
import java.awt.*;

public class VistaInicioSesionAdministrador extends JFrame {

    private JLabel TUsuario;
    public JTextField Usuario;
    private JLabel TContraseña;
    private JPasswordField Contraseña;
    public JButton Iniciosesion;
    private JLabel textoAdministrador;

    private JPanel panelPrincipal;

    public VistaInicioSesionAdministrador() {
        inicializarComponentes();
        construirLayout();
        configurarVentana();
        this.setVisible(true);
    }

    private void inicializarComponentes() {
        // Componentes de usuario y contraseña
        TUsuario = new JLabel("Usuario:");
        Usuario = new JTextField(20);

        TContraseña = new JLabel("Contraseña:");
        Contraseña = new JPasswordField(20);

        // Botón Iniciar Sesión
        Iniciosesion = new JButton("Iniciar Sesión");

        // Cambiar color del botón
        Iniciosesion.setBackground(new Color(128, 0, 32));
        Iniciosesion.setForeground(Color.WHITE);

        // Texto de "Administrador"
        textoAdministrador = new JLabel("<html><u>Administrador</u></html>");
        textoAdministrador.setForeground(Color.BLUE);
        textoAdministrador.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        panelPrincipal = new JPanel();
    }

    private void construirLayout() {
        // Layout vertical para campos
        panelPrincipal.setLayout(new BoxLayout(panelPrincipal, BoxLayout.Y_AXIS));
        panelPrincipal.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        panelPrincipal.add(TUsuario);
        panelPrincipal.add(Box.createRigidArea(new Dimension(0, 5)));
        panelPrincipal.add(Usuario);
        panelPrincipal.add(Box.createRigidArea(new Dimension(0, 15)));

        panelPrincipal.add(TContraseña);
        panelPrincipal.add(Box.createRigidArea(new Dimension(0, 5)));
        panelPrincipal.add(Contraseña);
        panelPrincipal.add(Box.createRigidArea(new Dimension(0, 20)));

        panelPrincipal.add(Iniciosesion);
        panelPrincipal.setAlignmentX(Component.CENTER_ALIGNMENT);

        JPanel centerWrapper = new JPanel(new GridBagLayout());
        centerWrapper.add(panelPrincipal);

        // Panel inferior derecho
        JPanel bottomRightPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        bottomRightPanel.add(textoAdministrador);
        bottomRightPanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 10, 10));
        bottomRightPanel.setOpaque(false);

        // Layout principal
        this.setLayout(new BorderLayout());
        this.add(centerWrapper, BorderLayout.CENTER);
        this.add(bottomRightPanel, BorderLayout.SOUTH);
    }

    private void configurarVentana() {
        this.setTitle("Inicio de Sesión - Administrador");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH); // Ventana maximizada con bordes
    }

    public String getContraseña() {
        return new String(Contraseña.getPassword());
    }

    public String getUsuario() {
        return Usuario.getText();
    }

    public JLabel getTextoAdministrador() {
        return textoAdministrador;
    }

    public JButton getIniciosesion() {
        return Iniciosesion;
    }
}
