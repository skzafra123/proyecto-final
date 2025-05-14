package vista;

import javax.swing.*;
import java.awt.*;

public class VistaInicioSesion extends JFrame {

    private JLabel TUsuario;
    public JTextField Usuario;
    private JLabel TContraseña;
    private JPasswordField Contraseña;
    public JButton Iniciosesion;
    public JButton NuevoUsuario;
    private JLabel textoAdministrador;
    private JLabel tituloEmpresa;

    private JPanel panelPrincipal;

    public VistaInicioSesion() {
        inicializarComponentes();
        construirLayout();
        configurarVentana();
        this.setVisible(true);
    }

    private void inicializarComponentes() {
        // Título grande Zafra.SL
        tituloEmpresa = new JLabel("Zafra.SL");
        tituloEmpresa.setFont(new Font("SansSerif", Font.BOLD, 32));
        tituloEmpresa.setHorizontalAlignment(SwingConstants.CENTER);

        // Componentes de usuario y contraseña
        TUsuario = new JLabel("Usuario:");
        Usuario = new JTextField(20);

        TContraseña = new JLabel("Contraseña:");
        Contraseña = new JPasswordField(20);

        // Botones
        Iniciosesion = new JButton("Iniciar Sesión");
        NuevoUsuario = new JButton("Nuevo Usuario");

        // Cambiar color de botones
        Iniciosesion.setBackground(new Color(128, 0, 32));
        Iniciosesion.setForeground(Color.WHITE);
        NuevoUsuario.setBackground(new Color(128, 0, 32));
        NuevoUsuario.setForeground(Color.WHITE);

        // Estilo y configuración del texto "Administrador"
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
        panelPrincipal.add(Box.createRigidArea(new Dimension(0, 15)));

        panelPrincipal.add(Iniciosesion);
        panelPrincipal.add(Box.createRigidArea(new Dimension(0, 10)));
        panelPrincipal.add(NuevoUsuario);
        panelPrincipal.setAlignmentX(Component.CENTER_ALIGNMENT);

        JPanel centerWrapper = new JPanel(new GridBagLayout());
        centerWrapper.add(panelPrincipal);

        // Panel inferior derecho
        JPanel bottomRightPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        bottomRightPanel.add(textoAdministrador);
        bottomRightPanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 10, 10));
        bottomRightPanel.setOpaque(false);

        // Panel superior con título
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new BorderLayout());
        topPanel.add(tituloEmpresa, BorderLayout.CENTER);
        topPanel.setBorder(BorderFactory.createEmptyBorder(20, 10, 10, 10));

        // Layout principal
        this.setLayout(new BorderLayout());
        this.add(topPanel, BorderLayout.NORTH);
        this.add(centerWrapper, BorderLayout.CENTER);
        this.add(bottomRightPanel, BorderLayout.SOUTH);
    }

    private void configurarVentana() {
        this.setTitle("Inicio de Sesión");
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

    public JButton getNuevoUsuario() {
        return NuevoUsuario;
    }
}
