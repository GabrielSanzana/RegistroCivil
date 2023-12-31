/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.registrocivil;
import com.mycompany.registrocivil.Clases.ConjuntoRegiones;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.chart.ChartPanel;
import java.awt.Dimension;
import java.awt.BorderLayout;

public class VentanaPrincipal extends javax.swing.JFrame {
    
    ConjuntoRegiones conjuntoRegiones;
    
    public VentanaPrincipal(ConjuntoRegiones conjunto){
        this.conjuntoRegiones = conjunto;
        initComponents();
        DefaultCategoryDataset datosTabla = new DefaultCategoryDataset();
        String [] nombres = conjuntoRegiones.obtenerNombresRegiones();
        for(String nombre : nombres)
            datosTabla.addValue(conjuntoRegiones.buscarRegion(nombre).getCant(), nombre, "");
        JFreeChart grafico = ChartFactory.createBarChart3D("Total de personas por región","Región","Total",datosTabla);
        ChartPanel panel = new ChartPanel(grafico);
        panel.setMouseWheelEnabled(true);
        panel.setPreferredSize(new Dimension(panelGrafico.getWidth(), panelGrafico.getHeight()));
        panelGrafico.setLayout(new BorderLayout());
        panelGrafico.add(panel,BorderLayout.NORTH);
        Inicio.setEnabled(false);
        lblInicio.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Fondo = new javax.swing.JPanel();
        MenuLateral = new javax.swing.JPanel();
        IconoMenu = new javax.swing.JLabel();
        Agregar = new javax.swing.JLabel();
        lblMostrarListado = new javax.swing.JLabel();
        lblAgregarPersona = new javax.swing.JLabel();
        lblInicio = new javax.swing.JLabel();
        Inicio = new javax.swing.JLabel();
        Listar = new javax.swing.JLabel();
        Editar = new javax.swing.JLabel();
        lblEditar = new javax.swing.JLabel();
        lblEliminar = new javax.swing.JLabel();
        Eliminar = new javax.swing.JLabel();
        AgregarRegion = new javax.swing.JLabel();
        EditarRegion = new javax.swing.JLabel();
        EliminarRegion = new javax.swing.JLabel();
        lblAgregarRegion = new javax.swing.JLabel();
        lblEliminarRegion = new javax.swing.JLabel();
        lblEditarRegion = new javax.swing.JLabel();
        PanelGobierno = new javax.swing.JPanel();
        Gobierno = new javax.swing.JLabel();
        Cuadro = new javax.swing.JPanel();
        Mensaje = new javax.swing.JLabel();
        panelGrafico = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusable(false);
        setMinimumSize(new java.awt.Dimension(1000, 625));
        setName(""); // NOI18N

        Fondo.setBackground(new java.awt.Color(231, 231, 231));
        Fondo.setPreferredSize(new java.awt.Dimension(1000, 625));
        Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MenuLateral.setBackground(new java.awt.Color(54, 70, 78));

        IconoMenu.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        IconoMenu.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") + "/src/com/mycompany/iconos/menu.png"));
        IconoMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                IconoMenuMousePressed(evt);
            }
        });

        Agregar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Agregar.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") + "/src/com/mycompany/iconos/agregar.png"));
        Agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AgregarMousePressed(evt);
            }
        });

        lblMostrarListado.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblMostrarListado.setForeground(new java.awt.Color(255, 255, 255));
        lblMostrarListado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMostrarListado.setText("Mostrar Listado");
        lblMostrarListado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblMostrarListadoMousePressed(evt);
            }
        });

        lblAgregarPersona.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblAgregarPersona.setForeground(new java.awt.Color(255, 255, 255));
        lblAgregarPersona.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAgregarPersona.setText("Agregar Persona");
        lblAgregarPersona.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblAgregarPersonaMousePressed(evt);
            }
        });

        lblInicio.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblInicio.setForeground(new java.awt.Color(255, 255, 255));
        lblInicio.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblInicio.setText("Inicio");
        lblInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblInicioMousePressed(evt);
            }
        });

        Inicio.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Inicio.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") + "/src/com/mycompany/iconos/inicio.png"));
        Inicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                InicioMousePressed(evt);
            }
        });

        Listar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Listar.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") + "/src/com/mycompany/iconos/mostrar.png"));
        Listar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ListarMousePressed(evt);
            }
        });

        Editar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Editar.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") + "/src/com/mycompany/iconos/estado.png"));
        Editar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                EditarMousePressed(evt);
            }
        });

        lblEditar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblEditar.setForeground(new java.awt.Color(255, 255, 255));
        lblEditar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEditar.setText("Editar Persona");
        lblEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblEditarMousePressed(evt);
            }
        });

        lblEliminar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblEliminar.setForeground(new java.awt.Color(255, 255, 255));
        lblEliminar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEliminar.setText("Eliminar Persona");
        lblEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblEliminarMousePressed(evt);
            }
        });

        Eliminar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Eliminar.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") + "/src/com/mycompany/iconos/eliminar.png"));
        Eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                EliminarMousePressed(evt);
            }
        });

        AgregarRegion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        AgregarRegion.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") + "/src/com/mycompany/iconos/agregarRegion.png"));
        AgregarRegion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AgregarRegionMousePressed(evt);
            }
        });

        EditarRegion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        EditarRegion.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") + "/src/com/mycompany/iconos/editarRegion.png"));
        EditarRegion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                EditarRegionMousePressed(evt);
            }
        });

        EliminarRegion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        EliminarRegion.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") + "/src/com/mycompany/iconos/eliminarRegion.png"));
        EliminarRegion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                EliminarRegionMousePressed(evt);
            }
        });

        lblAgregarRegion.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblAgregarRegion.setForeground(new java.awt.Color(255, 255, 255));
        lblAgregarRegion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAgregarRegion.setText("Agregar Región");
        lblAgregarRegion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblAgregarRegionMousePressed(evt);
            }
        });

        lblEliminarRegion.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblEliminarRegion.setForeground(new java.awt.Color(255, 255, 255));
        lblEliminarRegion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEliminarRegion.setText("Eliminar Región");
        lblEliminarRegion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblEliminarRegionMousePressed(evt);
            }
        });

        lblEditarRegion.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblEditarRegion.setForeground(new java.awt.Color(255, 255, 255));
        lblEditarRegion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEditarRegion.setText("Editar Región");
        lblEditarRegion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblEditarRegionMousePressed(evt);
            }
        });

        javax.swing.GroupLayout MenuLateralLayout = new javax.swing.GroupLayout(MenuLateral);
        MenuLateral.setLayout(MenuLateralLayout);
        MenuLateralLayout.setHorizontalGroup(
            MenuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLateralLayout.createSequentialGroup()
                .addGroup(MenuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuLateralLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(IconoMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MenuLateralLayout.createSequentialGroup()
                        .addGroup(MenuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Listar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AgregarRegion, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EliminarRegion, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EditarRegion, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(MenuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAgregarPersona)
                            .addComponent(lblMostrarListado)
                            .addComponent(lblInicio)
                            .addComponent(lblEditar)
                            .addComponent(lblEliminar)
                            .addComponent(lblAgregarRegion)
                            .addComponent(lblEliminarRegion)
                            .addComponent(lblEditarRegion))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MenuLateralLayout.setVerticalGroup(
            MenuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLateralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(IconoMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MenuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MenuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAgregarPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MenuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MenuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblMostrarListado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Listar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MenuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(MenuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AgregarRegion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAgregarRegion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MenuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EliminarRegion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEliminarRegion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MenuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EditarRegion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEditarRegion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(246, 246, 246))
        );

        Fondo.add(MenuLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 630));

        PanelGobierno.setBackground(new java.awt.Color(0, 0, 0));
        PanelGobierno.setPreferredSize(new java.awt.Dimension(380, 50));

        Gobierno.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Gobierno.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") + "/src/com/mycompany/iconos/gobierno.png"));
        Gobierno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                GobiernoMousePressed(evt);
            }
        });

        javax.swing.GroupLayout PanelGobiernoLayout = new javax.swing.GroupLayout(PanelGobierno);
        PanelGobierno.setLayout(PanelGobiernoLayout);
        PanelGobiernoLayout.setHorizontalGroup(
            PanelGobiernoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelGobiernoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Gobierno, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        PanelGobiernoLayout.setVerticalGroup(
            PanelGobiernoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelGobiernoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Gobierno, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Fondo.add(PanelGobierno, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, -1, -1));

        Cuadro.setBackground(new java.awt.Color(241, 241, 241));

        Mensaje.setFont(new java.awt.Font("Rockwell", 0, 40)); // NOI18N
        Mensaje.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Mensaje.setText("Sistema integrado de registro civil");
        Mensaje.setMaximumSize(new java.awt.Dimension(1000, 48));
        Mensaje.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MensajeMousePressed(evt);
            }
        });

        panelGrafico.setPreferredSize(new java.awt.Dimension(100, 394));

        javax.swing.GroupLayout panelGraficoLayout = new javax.swing.GroupLayout(panelGrafico);
        panelGrafico.setLayout(panelGraficoLayout);
        panelGraficoLayout.setHorizontalGroup(
            panelGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );
        panelGraficoLayout.setVerticalGroup(
            panelGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout CuadroLayout = new javax.swing.GroupLayout(Cuadro);
        Cuadro.setLayout(CuadroLayout);
        CuadroLayout.setHorizontalGroup(
            CuadroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CuadroLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(CuadroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CuadroLayout.createSequentialGroup()
                        .addComponent(Mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CuadroLayout.createSequentialGroup()
                        .addComponent(panelGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
        );
        CuadroLayout.setVerticalGroup(
            CuadroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CuadroLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(Mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(panelGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        Fondo.add(Cuadro, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 770, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private boolean menuDesplegado = false;
    private void IconoMenuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IconoMenuMousePressed
        int velocidadAnimacion = 4; // Velocidad de la animación (ajusta según tus necesidades)
        int desplazamientoFinal = -160; // La cantidad que quieres desplazar hacia la izquierda
        // Cambia la dirección de la animación en función del estado actual del menú
        int desplazamientoInicial = menuDesplegado ? desplazamientoFinal : 0;
        int desplazamientoObjetivo = menuDesplegado ? 0 : desplazamientoFinal;
        
        if(menuDesplegado == false)
        {
            lblAgregarPersona.setText(""); 
            lblMostrarListado.setText("");
            lblInicio.setText(""); 
            lblEliminar.setText(""); 
            lblEditar.setText("");
            lblAgregarRegion.setText(""); 
            lblEliminarRegion.setText(""); 
            lblEditarRegion.setText(""); 
        }
        
        Timer timer = new Timer(10, new ActionListener() {
            int desplazamientoActual = desplazamientoInicial;

            @Override
            public void actionPerformed(ActionEvent e) {
                if (desplazamientoActual != desplazamientoObjetivo) {
                    MenuLateral.setLocation(desplazamientoActual, MenuLateral.getY());
                    Agregar.setLocation(-desplazamientoActual, Agregar.getY());
                    AgregarRegion.setLocation(-desplazamientoActual, AgregarRegion.getY());
                    EliminarRegion.setLocation(-desplazamientoActual, EliminarRegion.getY());
                    EditarRegion.setLocation(-desplazamientoActual, EditarRegion.getY());
                    Inicio.setLocation(-desplazamientoActual, Inicio.getY());
                    Listar.setLocation(-desplazamientoActual, Listar.getY());
                    Eliminar.setLocation(-desplazamientoActual, Eliminar.getY());
                    Editar.setLocation(-desplazamientoActual, Editar.getY());
                    if (menuDesplegado == false) {               
                        Cuadro.setLocation(Cuadro.getX() - velocidadAnimacion, Cuadro.getY());
                        Cuadro.setSize(Cuadro.getWidth() + velocidadAnimacion, Cuadro.getHeight());
                        PanelGobierno.setLocation(PanelGobierno.getX() - 2, PanelGobierno.getY());
                        Mensaje.setLocation(Mensaje.getX() + 2, Mensaje.getY());
                        panelGrafico.setLocation(panelGrafico.getX() + 2, panelGrafico.getY());
                        
                    } else {
                        Cuadro.setLocation(Cuadro.getX() + velocidadAnimacion, Cuadro.getY());
                        Cuadro.setSize(Cuadro.getWidth() - velocidadAnimacion, Cuadro.getHeight());
                        PanelGobierno.setLocation(PanelGobierno.getX() +2, PanelGobierno.getY());
                        Mensaje.setLocation(Mensaje.getX() - 2, Mensaje.getY());
                        panelGrafico.setLocation(panelGrafico.getX() - 2, panelGrafico.getY());
                    }
                    if (menuDesplegado) {
                        desplazamientoActual += velocidadAnimacion;
                    } else {
                        desplazamientoActual -= velocidadAnimacion;
                    }
                    
                } else {
                    ((Timer) e.getSource()).stop();                  
                    if(menuDesplegado==true)
                    {
                        Timer textTimer = new Timer(100, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent evt) {
                            lblAgregarPersona.setText("Agregar Persona");
                            lblMostrarListado.setText("Mostrar Listado");
                            lblInicio.setText("Inicio");
                            lblEliminar.setText("Eliminar Persona"); 
                            lblEditar.setText("Editar Persona"); 
                            lblEditarRegion.setText("Editar Región");
                            lblAgregarRegion.setText("Agregar Región");
                            lblEliminarRegion.setText("EliminarRegión");  
                        }
                        });
                        textTimer.setRepeats(false); // Ejecutar una sola vez
                        textTimer.start();
                    }
                    menuDesplegado = !menuDesplegado;
                }
                
            }
        });
        timer.start();
    }//GEN-LAST:event_IconoMenuMousePressed
    
    private void AgregarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarMousePressed
        VentanaAgregarPersona ven = new VentanaAgregarPersona(conjuntoRegiones);
        ven.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_AgregarMousePressed

    private void ListarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListarMousePressed
        VentanaListarPersona ven = new VentanaListarPersona(conjuntoRegiones);
        ven.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ListarMousePressed

    private void lblMostrarListadoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMostrarListadoMousePressed
        VentanaListarPersona ven = new VentanaListarPersona(conjuntoRegiones);
        ven.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblMostrarListadoMousePressed

    private void lblInicioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInicioMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblInicioMousePressed

    private void InicioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InicioMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_InicioMousePressed

    private void EliminarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarMousePressed
        VentanaEliminarPersona ven = new VentanaEliminarPersona(conjuntoRegiones);
        ven.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_EliminarMousePressed

    private void EditarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditarMousePressed
        VentanaEditarPersona ven = new VentanaEditarPersona(conjuntoRegiones);
        ven.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_EditarMousePressed

    private void lblEliminarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEliminarMousePressed
        VentanaEliminarPersona ven = new VentanaEliminarPersona(conjuntoRegiones);
        ven.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblEliminarMousePressed

    private void lblEditarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEditarMousePressed
        VentanaEditarPersona ven = new VentanaEditarPersona(conjuntoRegiones);
        ven.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblEditarMousePressed

    private void GobiernoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GobiernoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_GobiernoMousePressed

    private void AgregarRegionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarRegionMousePressed
        VentanaAgregarRegion ven = new VentanaAgregarRegion(conjuntoRegiones);
        ven.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_AgregarRegionMousePressed

    private void EditarRegionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditarRegionMousePressed
        VentanaEditarRegion ven = new VentanaEditarRegion(conjuntoRegiones);
        ven.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_EditarRegionMousePressed

    private void EliminarRegionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarRegionMousePressed
        VentanaEliminarRegion ven = new VentanaEliminarRegion(conjuntoRegiones);
        ven.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_EliminarRegionMousePressed

    private void MensajeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MensajeMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_MensajeMousePressed

    private void lblAgregarRegionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgregarRegionMousePressed
        VentanaAgregarRegion ven = new VentanaAgregarRegion(conjuntoRegiones);
        ven.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblAgregarRegionMousePressed

    private void lblEliminarRegionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEliminarRegionMousePressed
        VentanaEliminarRegion ven = new VentanaEliminarRegion(conjuntoRegiones);
        ven.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblEliminarRegionMousePressed

    private void lblEditarRegionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEditarRegionMousePressed
        VentanaEditarRegion ven = new VentanaEditarRegion(conjuntoRegiones);
        ven.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblEditarRegionMousePressed

    private void lblAgregarPersonaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgregarPersonaMousePressed
        VentanaAgregarPersona ven = new VentanaAgregarPersona(conjuntoRegiones);
        ven.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblAgregarPersonaMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ConjuntoRegiones conjunto = new ConjuntoRegiones();
                new VentanaPrincipal(conjunto).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Agregar;
    private javax.swing.JLabel AgregarRegion;
    private javax.swing.JPanel Cuadro;
    private javax.swing.JLabel Editar;
    private javax.swing.JLabel EditarRegion;
    private javax.swing.JLabel Eliminar;
    private javax.swing.JLabel EliminarRegion;
    private javax.swing.JPanel Fondo;
    private javax.swing.JLabel Gobierno;
    private javax.swing.JLabel IconoMenu;
    private javax.swing.JLabel Inicio;
    private javax.swing.JLabel Listar;
    private javax.swing.JLabel Mensaje;
    private javax.swing.JPanel MenuLateral;
    private javax.swing.JPanel PanelGobierno;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAgregarPersona;
    private javax.swing.JLabel lblAgregarRegion;
    private javax.swing.JLabel lblEditar;
    private javax.swing.JLabel lblEditarRegion;
    private javax.swing.JLabel lblEliminar;
    private javax.swing.JLabel lblEliminarRegion;
    private javax.swing.JLabel lblInicio;
    private javax.swing.JLabel lblMostrarListado;
    private javax.swing.JPanel panelGrafico;
    // End of variables declaration//GEN-END:variables
}
