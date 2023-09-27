/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.registrocivil;
import com.mycompany.registrocivil.Clases.ConjuntoRegiones;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;




public class VentanaListar extends javax.swing.JFrame {
    
    ConjuntoRegiones conjuntoRegiones;
    
    public VentanaListar(ConjuntoRegiones conjunto){
        this.conjuntoRegiones = conjunto;
        initComponents();
        String [] nombres = conjuntoRegiones.obtenerNombresRegiones();
        for(String nombre : nombres)
            comboBoxRegiones.addItem(nombre);
        tablaPersonas.setEnabled(false);
        tablaPersonas.getTableHeader().setReorderingAllowed(false);
        Listar.setEnabled(false);
        lblMostrarListado.setEnabled(false);
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
        EstadoCivil = new javax.swing.JLabel();
        lblEditar = new javax.swing.JLabel();
        lblEliminar = new javax.swing.JLabel();
        Eliminar = new javax.swing.JLabel();
        PanelGobierno = new javax.swing.JPanel();
        Gobierno = new javax.swing.JLabel();
        Cuadro = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPersonas = new javax.swing.JTable();
        panelEliminar = new javax.swing.JPanel();
        lblTituloEliminar = new javax.swing.JLabel();
        comboBoxRegiones = new javax.swing.JComboBox<>();
        lblRegion1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        lblRegion2 = new javax.swing.JLabel();

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

        EstadoCivil.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        EstadoCivil.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") + "/src/com/mycompany/iconos/estado.png"));
        EstadoCivil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                EstadoCivilMousePressed(evt);
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
                            .addComponent(EstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(MenuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAgregarPersona)
                            .addComponent(lblMostrarListado)
                            .addComponent(lblInicio)
                            .addComponent(lblEditar)
                            .addComponent(lblEliminar))))
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
                    .addComponent(EstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(369, Short.MAX_VALUE))
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

        tablaPersonas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tablaPersonas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Rut", "Fecha de nacimiento", "Defunción", "Estado civil"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaPersonas);

        panelEliminar.setBackground(new java.awt.Color(241, 241, 241));
        panelEliminar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblTituloEliminar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTituloEliminar.setText("Seleecionar Región");

        comboBoxRegiones.setPreferredSize(new java.awt.Dimension(72, 25));

        lblRegion1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblRegion1.setText("Región:");

        jButton4.setText("Buscar");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton4MousePressed(evt);
            }
        });

        jButton2.setText("Filtrar");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre", "Fecha de nacimiento", "Defunción", "Estado civil" }));

        lblRegion2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblRegion2.setText("Filtrar:");

        javax.swing.GroupLayout panelEliminarLayout = new javax.swing.GroupLayout(panelEliminar);
        panelEliminar.setLayout(panelEliminarLayout);
        panelEliminarLayout.setHorizontalGroup(
            panelEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEliminarLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(panelEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEliminarLayout.createSequentialGroup()
                        .addComponent(lblRegion2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addGroup(panelEliminarLayout.createSequentialGroup()
                        .addComponent(lblRegion1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(comboBoxRegiones, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(231, 231, 231)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(panelEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelEliminarLayout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(lblTituloEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(495, Short.MAX_VALUE)))
        );
        panelEliminarLayout.setVerticalGroup(
            panelEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEliminarLayout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addGroup(panelEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRegion1)
                    .addComponent(comboBoxRegiones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)
                    .addComponent(lblRegion2))
                .addGap(36, 36, 36))
            .addGroup(panelEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelEliminarLayout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(lblTituloEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(109, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout CuadroLayout = new javax.swing.GroupLayout(Cuadro);
        Cuadro.setLayout(CuadroLayout);
        CuadroLayout.setHorizontalGroup(
            CuadroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CuadroLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(CuadroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        CuadroLayout.setVerticalGroup(
            CuadroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CuadroLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(panelEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
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
        }
        
        Timer timer = new Timer(10, new ActionListener() {
            int desplazamientoActual = desplazamientoInicial;

            @Override
            public void actionPerformed(ActionEvent e) {
                if (desplazamientoActual != desplazamientoObjetivo) {
                    MenuLateral.setLocation(desplazamientoActual, MenuLateral.getY());
                    Agregar.setLocation(-desplazamientoActual, Agregar.getY());
                    Inicio.setLocation(-desplazamientoActual, Inicio.getY());
                    Listar.setLocation(-desplazamientoActual, Listar.getY());
                    Eliminar.setLocation(-desplazamientoActual, Eliminar.getY());
                    EstadoCivil.setLocation(-desplazamientoActual, EstadoCivil.getY());
                    if (menuDesplegado == false) {               
                        Cuadro.setLocation(Cuadro.getX() - velocidadAnimacion, Cuadro.getY());
                        Cuadro.setSize(Cuadro.getWidth() + velocidadAnimacion, Cuadro.getHeight());
                        PanelGobierno.setLocation(PanelGobierno.getX() - velocidadAnimacion, PanelGobierno.getY());
                    } else {
                        Cuadro.setLocation(Cuadro.getX() + velocidadAnimacion, Cuadro.getY());
                        Cuadro.setSize(Cuadro.getWidth() - velocidadAnimacion, Cuadro.getHeight());
                        PanelGobierno.setLocation(PanelGobierno.getX() + velocidadAnimacion, PanelGobierno.getY());
                        PanelGobierno.setSize(PanelGobierno.getWidth(), PanelGobierno.getHeight());
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
                            lblEditar.setText("Cambiar E. Civil"); 
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
        VentanaAgregar ven = new VentanaAgregar(conjuntoRegiones);
        ven.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_AgregarMousePressed

    private void ListarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListarMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_ListarMousePressed

    private void lblMostrarListadoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMostrarListadoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblMostrarListadoMousePressed

    private void lblInicioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInicioMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblInicioMousePressed

    private void InicioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InicioMousePressed
        VentanaPrincipal ven = new VentanaPrincipal(conjuntoRegiones);
        ven.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_InicioMousePressed

    private void EliminarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarMousePressed
        VentanaEliminar ven = new VentanaEliminar(conjuntoRegiones);
        ven.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_EliminarMousePressed

    private void EstadoCivilMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EstadoCivilMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_EstadoCivilMousePressed

    private void lblEliminarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEliminarMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblEliminarMousePressed

    private void lblEditarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEditarMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblEditarMousePressed

    private void GobiernoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GobiernoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_GobiernoMousePressed

    private void jButton4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MousePressed
        Object selectedItem = comboBoxRegiones.getSelectedItem();
        String selectedRegion = selectedItem.toString();
        String []nada = {"","","","",""}; 
        if (!selectedRegion.equals("Seleccione")) {
            String[][] arr = conjuntoRegiones.mostrarDatosPoblacionEnRegion(selectedRegion);

            DefaultTableModel model = (DefaultTableModel) tablaPersonas.getModel();

            // Limpiar la tabla antes de agregar nuevos datos
            model.setRowCount(0);

            // Agregar las filas del arreglo a la tabla
            for (String[] fila : arr) {
                model.addRow(fila);
            }

            // Completar con filas vacías si es necesario
            int rowCount = model.getRowCount();
            while (rowCount < 17) {
                model.addRow(nada); // Agrega una fila vacía con la misma cantidad de columnas que en el arreglo 'arr'
                rowCount++;
            }
        }
    }//GEN-LAST:event_jButton4MousePressed

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
            java.util.logging.Logger.getLogger(VentanaListar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaListar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaListar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaListar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ConjuntoRegiones conjunto = new ConjuntoRegiones();
                new VentanaListar(conjunto).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Agregar;
    private javax.swing.JPanel Cuadro;
    private javax.swing.JLabel Eliminar;
    private javax.swing.JLabel EstadoCivil;
    private javax.swing.JPanel Fondo;
    private javax.swing.JLabel Gobierno;
    private javax.swing.JLabel IconoMenu;
    private javax.swing.JLabel Inicio;
    private javax.swing.JLabel Listar;
    private javax.swing.JPanel MenuLateral;
    private javax.swing.JPanel PanelGobierno;
    private javax.swing.JComboBox<String> comboBoxRegiones;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAgregarPersona;
    private javax.swing.JLabel lblEditar;
    private javax.swing.JLabel lblEliminar;
    private javax.swing.JLabel lblInicio;
    private javax.swing.JLabel lblMostrarListado;
    private javax.swing.JLabel lblRegion1;
    private javax.swing.JLabel lblRegion2;
    private javax.swing.JLabel lblTituloEliminar;
    private javax.swing.JPanel panelEliminar;
    private javax.swing.JTable tablaPersonas;
    // End of variables declaration//GEN-END:variables
}
