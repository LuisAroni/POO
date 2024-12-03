// AUTOR: Carol Rojas Moreno - DOCENTE Programación Orientada a Objetos
package ProyectoPlantilla;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormVentanaPrincipal extends javax.swing.JFrame {

    // --- VARIABLES GLOBALES para usar en otros formularios ---
    Calendar calend = new GregorianCalendar();
    String DatoUsuario=FormIniciarSesion.NombUsuario; // Dato public static del FormIniciarSesion
    String Comprobante;
    String ItemCmbDcto;
    double sumPago =0.0;
    
    
    
    public FormVentanaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null); //CENTRAR VENTANA PRINCIPAL
        this.setTitle("Menu Principal");
        
        txtUsuario.setText(DatoUsuario);  // Colcar en la caja de Texto, el valor del Inicio de Sesion
        txtUsuario.setEditable(false);
                

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        frmBuscarUsuario = new javax.swing.JFrame();
        jPanel7 = new javax.swing.JPanel();
        lblNombreUserBuscar = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtNombUserBuscar = new javax.swing.JTextField();
        btnBuscarUser = new javax.swing.JButton();
        btnSalirBuscarU = new javax.swing.JButton();
        JScrollPane3 = new javax.swing.JScrollPane();
        tblResultadoUsuario = new javax.swing.JTable();
        jSeparator6 = new javax.swing.JSeparator();
        frmIngreInvenMatPrim = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        lblUltimoP = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnRegistrarNuevoProducto = new javax.swing.JButton();
        btnCancelarMatPrim = new javax.swing.JButton();
        FechaIngreInveMatPrim = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        txtComprobanteEmpreIMatPrim = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tblProveedor = new javax.swing.JTable();
        btnBuscarIngrInve = new javax.swing.JButton();
        txtMatPrimBuscar = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtAgregarMatPrim = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        btnAgregarNuevoProducto = new javax.swing.JToggleButton();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        txtCodProv = new javax.swing.JTextField();
        jScrollPane10 = new javax.swing.JScrollPane();
        tblProdMatPrim = new javax.swing.JTable();
        btnListaProveedores = new javax.swing.JToggleButton();
        btnMostrarListaMatPrim = new javax.swing.JButton();
        btnAgregarProve = new javax.swing.JButton();
        jScrollPane33 = new javax.swing.JScrollPane();
        tblProdMatPrimRegis = new javax.swing.JTable();
        btnAgregarMatPrim = new javax.swing.JButton();
        btnQuitarProducto2 = new javax.swing.JButton();
        frmListaProveedores = new javax.swing.JFrame();
        jPanel11 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        tblProveedores = new javax.swing.JTable();
        btnSalirProv = new javax.swing.JButton();
        btnEditarProv = new javax.swing.JButton();
        frmNuevaMatPrima = new javax.swing.JFrame();
        jPanel10 = new javax.swing.JPanel();
        lblCodigoP = new javax.swing.JLabel();
        lblNombreP = new javax.swing.JLabel();
        lblSaldo = new javax.swing.JLabel();
        lblUltimoCodMatPrim = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        txtCodigoIngrMatPrim = new javax.swing.JTextField();
        txtNombreIngrMatPrim = new javax.swing.JTextField();
        txtCantidadIngrMatPrim = new javax.swing.JTextField();
        btnRegistrarMatPrim = new javax.swing.JButton();
        btnSalirIngrMatPrim = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtPresentacionIngreMatPrim = new javax.swing.JTextField();
        frmSalidaInvenMatPrim = new javax.swing.JFrame();
        jPanel9 = new javax.swing.JPanel();
        lblUltimoP1 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        btnRegistrarSalidaMatPrim = new javax.swing.JButton();
        btnSalirP1 = new javax.swing.JButton();
        fechaSalidaInventarioMatPrim = new com.toedter.calendar.JDateChooser();
        jLabel23 = new javax.swing.JLabel();
        txtGuiaRemision = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txtResponsableSalMatPrim = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tblSalidaInveMatPrim = new javax.swing.JTable();
        btnBuscarMatPrim = new javax.swing.JButton();
        txtCodProducto = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        tblProductosSalInveMatPrim = new javax.swing.JTable();
        btnAgregarSalMatPrim = new javax.swing.JButton();
        txtCantidadSalida = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        btnQuitarProducto = new javax.swing.JButton();
        btnListaProductosMateriaPrima = new javax.swing.JButton();
        frmListaMatPrimaGeren = new javax.swing.JFrame();
        jPanel12 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        btnSalirListMatPrim = new javax.swing.JButton();
        btnE = new javax.swing.JButton();
        frmListaMatPrimaPublic = new javax.swing.JFrame();
        jPanel25 = new javax.swing.JPanel();
        jLabel76 = new javax.swing.JLabel();
        jScrollPane30 = new javax.swing.JScrollPane();
        tblListMatPrima = new javax.swing.JTable();
        btnSalirListMatPrim1 = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JSeparator();
        frmIngreProdTerm = new javax.swing.JFrame();
        jPanel3 = new javax.swing.JPanel();
        lblUltimoP3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        btnRegistrarIngreInvenProdTerm = new javax.swing.JButton();
        btnCancelarP1 = new javax.swing.JButton();
        FechaIngreInvenProdTerm = new com.toedter.calendar.JDateChooser();
        jLabel35 = new javax.swing.JLabel();
        txtDocIngreInveProdTerm = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        btnBuscarIngreProdTerm = new javax.swing.JButton();
        jTextField7 = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        btnAgregarNuevoProducto1 = new javax.swing.JToggleButton();
        jScrollPane15 = new javax.swing.JScrollPane();
        tblIngreProdTermEleccion = new javax.swing.JTable();
        btnListProdTerm = new javax.swing.JButton();
        jScrollPane16 = new javax.swing.JScrollPane();
        tblIngreInveProdTerm = new javax.swing.JTable();
        btnAgregarIngreInveProdTerm = new javax.swing.JButton();
        btnQuitarProductoTerm = new javax.swing.JButton();
        frmNuevaProdTerm = new javax.swing.JFrame();
        jPanel18 = new javax.swing.JPanel();
        lblCodigoP2 = new javax.swing.JLabel();
        lblNombreP2 = new javax.swing.JLabel();
        lblSaldo2 = new javax.swing.JLabel();
        lblUltimoP8 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        txtCodigoProdTerm = new javax.swing.JTextField();
        txtNombreProdTerm = new javax.swing.JTextField();
        txtCantidadProdTerm = new javax.swing.JTextField();
        btnRegistrarNuevoProdTerm = new javax.swing.JButton();
        btnSalirP4 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtPresentacionProdTerm = new javax.swing.JTextField();
        frmSalidaProdTerm = new javax.swing.JFrame();
        jPanel13 = new javax.swing.JPanel();
        lblUltimoP4 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        btnRegistrarSalidaProdTerm = new javax.swing.JButton();
        btnCancelarP2 = new javax.swing.JButton();
        txtFechaSalProdTerm = new com.toedter.calendar.JDateChooser();
        jLabel43 = new javax.swing.JLabel();
        txtDocEmpreProdTerm = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        txtCodigoProd = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        txtCantSalProdTerm = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jScrollPane17 = new javax.swing.JScrollPane();
        tblEleccionSalidaProdTerm = new javax.swing.JTable();
        btnListaProdTerm = new javax.swing.JButton();
        jScrollPane18 = new javax.swing.JScrollPane();
        tblSalidaProdTerm = new javax.swing.JTable();
        btnAgregarSalProdTerm = new javax.swing.JButton();
        btnQuitarProductoTerm1 = new javax.swing.JButton();
        frmListaProdTermGeren = new javax.swing.JFrame();
        jPanel14 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        tblListProdTerm = new javax.swing.JTable();
        btnSalirProv2 = new javax.swing.JButton();
        btnEliminarProdTerm = new javax.swing.JButton();
        frmNuevoUser = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        lblCodigoU = new javax.swing.JLabel();
        lblNombreU = new javax.swing.JLabel();
        lblPaswordU = new javax.swing.JLabel();
        lblUltimoU = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCodigoU = new javax.swing.JTextField();
        txtNombreU = new javax.swing.JTextField();
        txtPasswordU = new javax.swing.JTextField();
        btnRegistrarNuevoUsuario = new javax.swing.JButton();
        btnSalirU = new javax.swing.JButton();
        frmListaProdTermPublic = new javax.swing.JFrame();
        jPanel26 = new javax.swing.JPanel();
        jLabel77 = new javax.swing.JLabel();
        jScrollPane31 = new javax.swing.JScrollPane();
        tblListProdTerm1 = new javax.swing.JTable();
        btnSalirProv4 = new javax.swing.JButton();
        jSeparator8 = new javax.swing.JSeparator();
        frmIngreInvenEmbalado = new javax.swing.JFrame();
        jPanel4 = new javax.swing.JPanel();
        lblUltimoP6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnRegistrarIngreEmbal = new javax.swing.JButton();
        btnCancelarP3 = new javax.swing.JButton();
        txtFechaIngreEmbal = new com.toedter.calendar.JDateChooser();
        jLabel52 = new javax.swing.JLabel();
        txtComproEmpresaIngreInveEmbal = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        jScrollPane19 = new javax.swing.JScrollPane();
        tblProvIngreEmbal = new javax.swing.JTable();
        btnBuscarIngreEmbalado = new javax.swing.JButton();
        txtCodProdEmbalado = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        txtCantIngreInveEmbal = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        btnAgregarNuevoProductoEmbalado = new javax.swing.JToggleButton();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        txtCodProvInveEmbal = new javax.swing.JTextField();
        jScrollPane20 = new javax.swing.JScrollPane();
        tblIngreInveEmbal = new javax.swing.JTable();
        btnListaProveedores1 = new javax.swing.JToggleButton();
        btnMostrarListaEmbalado = new javax.swing.JButton();
        txtAgregarProv = new javax.swing.JButton();
        frmNuevoEmbalado = new javax.swing.JFrame();
        jPanel15 = new javax.swing.JPanel();
        lblCodigoP1 = new javax.swing.JLabel();
        lblNombreP1 = new javax.swing.JLabel();
        lblSaldo1 = new javax.swing.JLabel();
        lblUltimoP5 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        txtCodigoEmbal = new javax.swing.JTextField();
        txtNombreEmbal = new javax.swing.JTextField();
        txtCantEmbal = new javax.swing.JTextField();
        btnRegistrarNuevoProducto3 = new javax.swing.JButton();
        btnSalirP2 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        txtPresentacionEmbal = new javax.swing.JTextField();
        frmListaEmbaladoGeren = new javax.swing.JFrame();
        jPanel16 = new javax.swing.JPanel();
        jLabel60 = new javax.swing.JLabel();
        jScrollPane21 = new javax.swing.JScrollPane();
        tblProdEmbal = new javax.swing.JTable();
        btnSalirProv3 = new javax.swing.JButton();
        btnEliminarProdEmbal = new javax.swing.JButton();
        frmListaEmbaladoPublic = new javax.swing.JFrame();
        jPanel27 = new javax.swing.JPanel();
        jLabel78 = new javax.swing.JLabel();
        jScrollPane32 = new javax.swing.JScrollPane();
        tblProdEmbal1 = new javax.swing.JTable();
        btnSalirProv5 = new javax.swing.JButton();
        frmSalidaInvenEmbalado = new javax.swing.JFrame();
        jPanel17 = new javax.swing.JPanel();
        lblUltimoP7 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        btnRegistrarSalidaMatPrim1 = new javax.swing.JButton();
        btnSalirP3 = new javax.swing.JButton();
        FechaSalidaInvenEmbalado = new com.toedter.calendar.JDateChooser();
        jLabel63 = new javax.swing.JLabel();
        txtComproEmpreSalEmbal = new javax.swing.JTextField();
        jLabel64 = new javax.swing.JLabel();
        jScrollPane22 = new javax.swing.JScrollPane();
        tblSalidaInventarioEmbal = new javax.swing.JTable();
        btnBuscarProd1 = new javax.swing.JButton();
        txtCodProductoEmbalado = new javax.swing.JTextField();
        jLabel66 = new javax.swing.JLabel();
        jScrollPane23 = new javax.swing.JScrollPane();
        jTable17 = new javax.swing.JTable();
        btnAgregarSalInve = new javax.swing.JButton();
        txtCantSalInveEmbal = new javax.swing.JTextField();
        jLabel67 = new javax.swing.JLabel();
        btnQuitarProducto1 = new javax.swing.JButton();
        btnListaProductosMateriaPrima1 = new javax.swing.JButton();
        jSeparator9 = new javax.swing.JSeparator();
        frmReportMatPrim = new javax.swing.JFrame();
        jPanel19 = new javax.swing.JPanel();
        lblReportar2 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        btnMostrarReporteMatPrim = new javax.swing.JButton();
        btSalirReport2 = new javax.swing.JButton();
        jScrollPane24 = new javax.swing.JScrollPane();
        tblResultadoReporteMatPrim = new javax.swing.JTable();
        fechaReportFinalMatPrim = new com.toedter.calendar.JDateChooser();
        jLabel70 = new javax.swing.JLabel();
        FechaReportInicialMatPrim = new com.toedter.calendar.JDateChooser();
        btnAlmacenMatPrim = new javax.swing.JButton();
        frmAlmacenMateriaPrima = new javax.swing.JFrame();
        jPanel22 = new javax.swing.JPanel();
        lblReportar5 = new javax.swing.JLabel();
        btSalirReport5 = new javax.swing.JButton();
        jScrollPane27 = new javax.swing.JScrollPane();
        tblMateriaPrima = new javax.swing.JTable();
        jSeparator4 = new javax.swing.JSeparator();
        frmReportProdTerm = new javax.swing.JFrame();
        jPanel20 = new javax.swing.JPanel();
        lblReportar3 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        btnReportar3 = new javax.swing.JButton();
        btSalirReport3 = new javax.swing.JButton();
        jScrollPane25 = new javax.swing.JScrollPane();
        tblResultadoReporte3 = new javax.swing.JTable();
        dateChFechaFinProdTerm = new com.toedter.calendar.JDateChooser();
        jLabel72 = new javax.swing.JLabel();
        dateChFechaInicioProdTerm = new com.toedter.calendar.JDateChooser();
        btnAlmacenProdTermina = new javax.swing.JButton();
        frmAlmacenProdTerm = new javax.swing.JFrame();
        jPanel23 = new javax.swing.JPanel();
        lblReportar6 = new javax.swing.JLabel();
        btSalirReport6 = new javax.swing.JButton();
        jScrollPane28 = new javax.swing.JScrollPane();
        tblProdTerminado = new javax.swing.JTable();
        jSeparator3 = new javax.swing.JSeparator();
        frmReportEmbal = new javax.swing.JFrame();
        jPanel21 = new javax.swing.JPanel();
        lblReportar4 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        btnReportarAlmaEmbal = new javax.swing.JButton();
        btSalirReport4 = new javax.swing.JButton();
        jScrollPane26 = new javax.swing.JScrollPane();
        tblReporteAlmacenEmbalado = new javax.swing.JTable();
        dateChFechaFinAlmaEmbal = new com.toedter.calendar.JDateChooser();
        jLabel74 = new javax.swing.JLabel();
        dateChFechaIniReporAlmaEmbal = new com.toedter.calendar.JDateChooser();
        btnAlmacenEmbal = new javax.swing.JButton();
        frmAlmacenEmbalado = new javax.swing.JFrame();
        jPanel24 = new javax.swing.JPanel();
        lblReportar7 = new javax.swing.JLabel();
        btSalirReport7 = new javax.swing.JButton();
        jScrollPane29 = new javax.swing.JScrollPane();
        tblAlmacenEmbal = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        txtUsuario = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        MenuBarraPrincipal = new javax.swing.JMenuBar();
        bmInicio = new javax.swing.JMenu();
        opNuevoUser = new javax.swing.JMenuItem();
        opBuscarUser = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        opSalir = new javax.swing.JMenuItem();
        bmInventario = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        opInveMatPrimIngreso = new javax.swing.JMenuItem();
        opInveMatPrimSalida = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        opInveProdTermIngreso = new javax.swing.JMenuItem();
        opInveProdTermSalida = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        opInveEmbalIngreso = new javax.swing.JMenuItem();
        opInveEmbalSalida = new javax.swing.JMenuItem();
        bmReportes = new javax.swing.JMenu();
        opReportMatPrim = new javax.swing.JMenuItem();
        opReportProdTermi = new javax.swing.JMenuItem();
        opReportEmbal = new javax.swing.JMenuItem();

        frmBuscarUsuario.setTitle("BUSCAR USUARIO");
        frmBuscarUsuario.setMinimumSize(new java.awt.Dimension(450, 450));

        jPanel7.setBackground(new java.awt.Color(153, 204, 255));
        jPanel7.setMinimumSize(new java.awt.Dimension(300, 300));

        lblNombreUserBuscar.setText("Ingrese Codigo Usuario a Buscar: ");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setText("BUSCAR USUARIO");

        txtNombUserBuscar.setPreferredSize(new java.awt.Dimension(200, 200));
        txtNombUserBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombUserBuscarActionPerformed(evt);
            }
        });

        btnBuscarUser.setText("BUSCAR");
        btnBuscarUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarUserActionPerformed(evt);
            }
        });

        btnSalirBuscarU.setText("Salir");
        btnSalirBuscarU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirBuscarUActionPerformed(evt);
            }
        });

        tblResultadoUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nombre Usuario", "Password Usuario"
            }
        ));
        JScrollPane3.setViewportView(tblResultadoUsuario);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(lblNombreUserBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombUserBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jLabel22))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(btnBuscarUser, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(JScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(btnSalirBuscarU, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel22)
                .addGap(35, 35, 35)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombUserBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombreUserBuscar))
                .addGap(27, 27, 27)
                .addComponent(btnBuscarUser)
                .addGap(18, 18, 18)
                .addComponent(JScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalirBuscarU, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout frmBuscarUsuarioLayout = new javax.swing.GroupLayout(frmBuscarUsuario.getContentPane());
        frmBuscarUsuario.getContentPane().setLayout(frmBuscarUsuarioLayout);
        frmBuscarUsuarioLayout.setHorizontalGroup(
            frmBuscarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        frmBuscarUsuarioLayout.setVerticalGroup(
            frmBuscarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        frmIngreInvenMatPrim.setTitle("REGISTRAR NUEVO PRODUCTO");
        frmIngreInvenMatPrim.setBounds(new java.awt.Rectangle(450, 300, 0, 0));
        frmIngreInvenMatPrim.setMinimumSize(new java.awt.Dimension(450, 435));

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.setMaximumSize(new java.awt.Dimension(800, 800));
        jPanel2.setMinimumSize(new java.awt.Dimension(500, 435));
        jPanel2.setPreferredSize(new java.awt.Dimension(427, 435));

        lblUltimoP.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblUltimoP.setText(".........");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Ultimo Codigo Registrado:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setText("Ingreso Inventario Materia Prima");

        btnRegistrarNuevoProducto.setText("Registrar");
        btnRegistrarNuevoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarNuevoProductoActionPerformed(evt);
            }
        });

        btnCancelarMatPrim.setText("Cancelar");
        btnCancelarMatPrim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarMatPrimActionPerformed(evt);
            }
        });

        jLabel1.setText("Fecha:");

        txtComprobanteEmpreIMatPrim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtComprobanteEmpreIMatPrimActionPerformed(evt);
            }
        });

        jLabel2.setText("Comprobante Empresa:");

        tblProveedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "Codigo", "Nombre de la empresa"
            }
        ));
        jScrollPane8.setViewportView(tblProveedor);

        btnBuscarIngrInve.setText("Buscar");
        btnBuscarIngrInve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarIngrInveActionPerformed(evt);
            }
        });

        txtMatPrimBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMatPrimBuscarActionPerformed(evt);
            }
        });

        jLabel13.setText("Nombre de Producto");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel14.setText("Cantidad:");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel18.setText("Cantidad a Agregar:");

        btnAgregarNuevoProducto.setText("Agregar Nuevo Producto");
        btnAgregarNuevoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarNuevoProductoActionPerformed(evt);
            }
        });

        jLabel31.setText("Datos Del Proovedor");

        jLabel32.setText("Ingrese el Codigo del Proveedor:");

        txtCodProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodProvActionPerformed(evt);
            }
        });

        tblProdMatPrim.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Producto", "Presentacion", "Cantidad"
            }
        ));
        jScrollPane10.setViewportView(tblProdMatPrim);

        btnListaProveedores.setText("Lista de Proveedores");
        btnListaProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaProveedoresActionPerformed(evt);
            }
        });

        btnMostrarListaMatPrim.setText("Lista Materia Prima");
        btnMostrarListaMatPrim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarListaMatPrimActionPerformed(evt);
            }
        });

        btnAgregarProve.setText("Buscar");
        btnAgregarProve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProveActionPerformed(evt);
            }
        });

        tblProdMatPrimRegis.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Codigo", "Producto", "Cantidad"
            }
        ));
        jScrollPane33.setViewportView(tblProdMatPrimRegis);

        btnAgregarMatPrim.setText("Agregar");

        btnQuitarProducto2.setText("Quitar Producto");
        btnQuitarProducto2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarProducto2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(txtMatPrimBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscarIngrInve))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel32)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtCodProv, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnAgregarProve)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnListaProveedores))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtComprobanteEmpreIMatPrim, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(27, 27, 27)
                                        .addComponent(lblUltimoP)
                                        .addGap(403, 403, 403)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(FechaIngreInveMatPrim, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel31))))
                        .addGap(0, 16, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(273, 273, 273))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane10)
                            .addComponent(jScrollPane33))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel14)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtAgregarMatPrim, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnAgregarMatPrim))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(btnMostrarListaMatPrim)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAgregarNuevoProducto)))
                            .addComponent(jLabel18)
                            .addComponent(btnQuitarProducto2))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(btnRegistrarNuevoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelarMatPrim, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(151, 151, 151))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(lblUltimoP)
                        .addComponent(jLabel1))
                    .addComponent(FechaIngreInveMatPrim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtComprobanteEmpreIMatPrim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(txtCodProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarProve)
                    .addComponent(btnListaProveedores))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtMatPrimBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarIngrInve))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAgregarNuevoProducto)
                            .addComponent(btnMostrarListaMatPrim))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txtAgregarMatPrim, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAgregarMatPrim)))
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane33, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(btnQuitarProducto2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrarNuevoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelarMatPrim, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout frmIngreInvenMatPrimLayout = new javax.swing.GroupLayout(frmIngreInvenMatPrim.getContentPane());
        frmIngreInvenMatPrim.getContentPane().setLayout(frmIngreInvenMatPrimLayout);
        frmIngreInvenMatPrimLayout.setHorizontalGroup(
            frmIngreInvenMatPrimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 867, Short.MAX_VALUE)
        );
        frmIngreInvenMatPrimLayout.setVerticalGroup(
            frmIngreInvenMatPrimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 645, Short.MAX_VALUE)
        );

        jPanel11.setBackground(new java.awt.Color(153, 204, 255));
        jPanel11.setForeground(new java.awt.Color(100, 100, 255));
        jPanel11.setToolTipText("");

        jLabel33.setText("Proveedores:");

        tblProveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Codigo", "Nombre de la empresa", "Contacto"
            }
        ));
        jScrollPane11.setViewportView(tblProveedores);

        btnSalirProv.setText("Salir");
        btnSalirProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirProvActionPerformed(evt);
            }
        });

        btnEditarProv.setText("Eliminar");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel33)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(btnEditarProv)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalirProv)
                .addGap(113, 113, 113))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel33)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalirProv)
                    .addComponent(btnEditarProv))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout frmListaProveedoresLayout = new javax.swing.GroupLayout(frmListaProveedores.getContentPane());
        frmListaProveedores.getContentPane().setLayout(frmListaProveedoresLayout);
        frmListaProveedoresLayout.setHorizontalGroup(
            frmListaProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmListaProveedoresLayout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        frmListaProveedoresLayout.setVerticalGroup(
            frmListaProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmListaProveedoresLayout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        frmNuevaMatPrima.setTitle("REGISTRAR NUEVO PRODUCTO");
        frmNuevaMatPrima.setBounds(new java.awt.Rectangle(450, 300, 0, 0));
        frmNuevaMatPrima.setMinimumSize(new java.awt.Dimension(450, 435));

        jPanel10.setBackground(new java.awt.Color(153, 204, 255));
        jPanel10.setMaximumSize(new java.awt.Dimension(800, 800));
        jPanel10.setMinimumSize(new java.awt.Dimension(500, 435));
        jPanel10.setPreferredSize(new java.awt.Dimension(427, 435));

        lblCodigoP.setText("Codigo:");

        lblNombreP.setText("Nombre:");

        lblSaldo.setText("Cantidad:");

        lblUltimoCodMatPrim.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblUltimoCodMatPrim.setText(".........");

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel29.setText("Ultimo Codigo Registrado:");

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel30.setText("Ingresar Datos de Producto Materia Prima");

        txtCodigoIngrMatPrim.setBackground(new java.awt.Color(255, 255, 204));
        txtCodigoIngrMatPrim.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtCodigoIngrMatPrim.setForeground(new java.awt.Color(0, 0, 255));

        btnRegistrarMatPrim.setText("Registrar");
        btnRegistrarMatPrim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarMatPrimActionPerformed(evt);
            }
        });

        btnSalirIngrMatPrim.setText("Cancelar");
        btnSalirIngrMatPrim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirIngrMatPrimActionPerformed(evt);
            }
        });

        jLabel11.setText("Presentacion:");

        txtPresentacionIngreMatPrim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPresentacionIngreMatPrimActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblSaldo)
                                    .addComponent(jLabel11)
                                    .addComponent(lblNombreP)
                                    .addComponent(lblCodigoP))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCodigoIngrMatPrim, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombreIngrMatPrim, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCantidadIngrMatPrim, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPresentacionIngreMatPrim, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel29)
                                .addGap(18, 18, 18)
                                .addComponent(lblUltimoCodMatPrim))))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(btnRegistrarMatPrim)
                        .addGap(104, 104, 104)
                        .addComponent(btnSalirIngrMatPrim))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel30)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel30)
                .addGap(29, 29, 29)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(lblUltimoCodMatPrim))
                .addGap(29, 29, 29)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoIngrMatPrim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodigoP))
                .addGap(23, 23, 23)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreP)
                    .addComponent(txtNombreIngrMatPrim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCantidadIngrMatPrim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSaldo))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtPresentacionIngreMatPrim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrarMatPrim)
                    .addComponent(btnSalirIngrMatPrim))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout frmNuevaMatPrimaLayout = new javax.swing.GroupLayout(frmNuevaMatPrima.getContentPane());
        frmNuevaMatPrima.getContentPane().setLayout(frmNuevaMatPrimaLayout);
        frmNuevaMatPrimaLayout.setHorizontalGroup(
            frmNuevaMatPrimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 387, Short.MAX_VALUE)
        );
        frmNuevaMatPrimaLayout.setVerticalGroup(
            frmNuevaMatPrimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        frmSalidaInvenMatPrim.setTitle("REGISTRAR NUEVO PRODUCTO");
        frmSalidaInvenMatPrim.setBounds(new java.awt.Rectangle(450, 300, 0, 0));
        frmSalidaInvenMatPrim.setMinimumSize(new java.awt.Dimension(450, 435));

        jPanel9.setBackground(new java.awt.Color(153, 204, 255));
        jPanel9.setMaximumSize(new java.awt.Dimension(800, 800));
        jPanel9.setMinimumSize(new java.awt.Dimension(500, 435));
        jPanel9.setPreferredSize(new java.awt.Dimension(427, 435));

        lblUltimoP1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblUltimoP1.setText(".........");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel19.setText("Ultimo Codigo Registrado:");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel20.setText("Salida Inventario Materia Prima");

        btnRegistrarSalidaMatPrim.setText("Registrar");
        btnRegistrarSalidaMatPrim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarSalidaMatPrimActionPerformed(evt);
            }
        });

        btnSalirP1.setText("Salir");
        btnSalirP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirP1ActionPerformed(evt);
            }
        });

        jLabel23.setText("Fecha:");

        txtGuiaRemision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGuiaRemisionActionPerformed(evt);
            }
        });

        jLabel24.setText("Comprobante de la empresa");

        txtResponsableSalMatPrim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResponsableSalMatPrimActionPerformed(evt);
            }
        });

        jLabel25.setText("Usuario Registrando:");

        tblSalidaInveMatPrim.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Producto", "Presentacion", "Cantidad"
            }
        ));
        jScrollPane9.setViewportView(tblSalidaInveMatPrim);

        btnBuscarMatPrim.setText("Buscar");

        txtCodProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodProductoActionPerformed(evt);
            }
        });

        jLabel26.setText("Codigo de producto");

        tblProductosSalInveMatPrim.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Producto", "Presentacion", "Cantidad"
            }
        ));
        jScrollPane12.setViewportView(tblProductosSalInveMatPrim);

        btnAgregarSalMatPrim.setText("Agregar");
        btnAgregarSalMatPrim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarSalMatPrimActionPerformed(evt);
            }
        });

        jLabel27.setText("Cantidad:");

        btnQuitarProducto.setText("Quitar Producto");
        btnQuitarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarProductoActionPerformed(evt);
            }
        });

        btnListaProductosMateriaPrima.setText("Lista Materias Primas");
        btnListaProductosMateriaPrima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaProductosMateriaPrimaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26)
                            .addComponent(btnListaProductosMateriaPrima))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCodProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscarMatPrim))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtGuiaRemision, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtResponsableSalMatPrim, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCantidadSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAgregarSalMatPrim)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel19)
                        .addGap(18, 18, 18)
                        .addComponent(lblUltimoP1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fechaSalidaInventarioMatPrim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnQuitarProducto))
                .addGap(98, 98, 98))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(btnRegistrarSalidaMatPrim)
                        .addGap(211, 211, 211)
                        .addComponent(btnSalirP1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(301, 301, 301)
                        .addComponent(jLabel20)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel20)
                .addGap(36, 36, 36)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblUltimoP1)
                        .addComponent(jLabel19)
                        .addComponent(jLabel23))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(fechaSalidaInventarioMatPrim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(txtGuiaRemision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtResponsableSalMatPrim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25))))
                .addGap(59, 59, 59)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCodProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBuscarMatPrim)
                            .addComponent(btnListaProductosMateriaPrima)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(txtCantidadSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregarSalMatPrim)))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(btnQuitarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrarSalidaMatPrim)
                    .addComponent(btnSalirP1))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout frmSalidaInvenMatPrimLayout = new javax.swing.GroupLayout(frmSalidaInvenMatPrim.getContentPane());
        frmSalidaInvenMatPrim.getContentPane().setLayout(frmSalidaInvenMatPrimLayout);
        frmSalidaInvenMatPrimLayout.setHorizontalGroup(
            frmSalidaInvenMatPrimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, 877, Short.MAX_VALUE)
        );
        frmSalidaInvenMatPrimLayout.setVerticalGroup(
            frmSalidaInvenMatPrimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
        );

        jPanel12.setBackground(new java.awt.Color(153, 204, 255));
        jPanel12.setForeground(new java.awt.Color(100, 100, 255));
        jPanel12.setToolTipText("");

        jLabel34.setText("Lista de Productos Materia Prima");

        jTable7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Codigo", "Nombre de la empresa", "Contacto"
            }
        ));
        jScrollPane13.setViewportView(jTable7);

        btnSalirListMatPrim.setText("Salir");
        btnSalirListMatPrim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirListMatPrimActionPerformed(evt);
            }
        });

        btnE.setText("Eliminar");
        btnE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel34)
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(btnE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalirListMatPrim)
                .addGap(113, 113, 113))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel34)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalirListMatPrim)
                    .addComponent(btnE))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout frmListaMatPrimaGerenLayout = new javax.swing.GroupLayout(frmListaMatPrimaGeren.getContentPane());
        frmListaMatPrimaGeren.getContentPane().setLayout(frmListaMatPrimaGerenLayout);
        frmListaMatPrimaGerenLayout.setHorizontalGroup(
            frmListaMatPrimaGerenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmListaMatPrimaGerenLayout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        frmListaMatPrimaGerenLayout.setVerticalGroup(
            frmListaMatPrimaGerenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmListaMatPrimaGerenLayout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel25.setBackground(new java.awt.Color(153, 204, 255));
        jPanel25.setForeground(new java.awt.Color(100, 100, 255));
        jPanel25.setToolTipText("");

        jLabel76.setText("Lista de Productos Materia Prima");

        tblListMatPrima.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Codigo", "Nombre de la empresa", "Contacto"
            }
        ));
        jScrollPane30.setViewportView(tblListMatPrima);

        btnSalirListMatPrim1.setText("Salir");
        btnSalirListMatPrim1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirListMatPrim1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel76)
                            .addComponent(jScrollPane30, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(btnSalirListMatPrim1)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel76)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane30, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalirListMatPrim1)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout frmListaMatPrimaPublicLayout = new javax.swing.GroupLayout(frmListaMatPrimaPublic.getContentPane());
        frmListaMatPrimaPublic.getContentPane().setLayout(frmListaMatPrimaPublicLayout);
        frmListaMatPrimaPublicLayout.setHorizontalGroup(
            frmListaMatPrimaPublicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmListaMatPrimaPublicLayout.createSequentialGroup()
                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        frmListaMatPrimaPublicLayout.setVerticalGroup(
            frmListaMatPrimaPublicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmListaMatPrimaPublicLayout.createSequentialGroup()
                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        frmIngreProdTerm.setTitle("REGISTRAR NUEVO PRODUCTO");
        frmIngreProdTerm.setBounds(new java.awt.Rectangle(450, 300, 0, 0));
        frmIngreProdTerm.setMinimumSize(new java.awt.Dimension(450, 435));

        jPanel3.setBackground(new java.awt.Color(153, 204, 255));
        jPanel3.setMaximumSize(new java.awt.Dimension(800, 800));
        jPanel3.setMinimumSize(new java.awt.Dimension(500, 435));
        jPanel3.setPreferredSize(new java.awt.Dimension(427, 435));

        lblUltimoP3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblUltimoP3.setText(".........");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Ultimo Codigo Registrado:");

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel28.setText("Ingreso Inventario Producto Terminado");

        btnRegistrarIngreInvenProdTerm.setText("Registrar");
        btnRegistrarIngreInvenProdTerm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarIngreInvenProdTermActionPerformed(evt);
            }
        });

        btnCancelarP1.setText("Cancelar");
        btnCancelarP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarP1ActionPerformed(evt);
            }
        });

        jLabel35.setText("Fecha:");

        txtDocIngreInveProdTerm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDocIngreInveProdTermActionPerformed(evt);
            }
        });

        jLabel36.setText("Comprobante Empresa:");

        btnBuscarIngreProdTerm.setText("Buscar");
        btnBuscarIngreProdTerm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarIngreProdTermActionPerformed(evt);
            }
        });

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        jLabel38.setText("Codigo de producto");

        jLabel39.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel39.setText("Cantidad:");

        jLabel40.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel40.setText("Cantidad a Agregar:");

        btnAgregarNuevoProducto1.setText("Agregar Nuevo Producto");
        btnAgregarNuevoProducto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarNuevoProducto1ActionPerformed(evt);
            }
        });

        tblIngreProdTermEleccion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Producto", "Presentacion", "Cantidad"
            }
        ));
        jScrollPane15.setViewportView(tblIngreProdTermEleccion);

        btnListProdTerm.setText("Lista Productos");
        btnListProdTerm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListProdTermActionPerformed(evt);
            }
        });

        tblIngreInveProdTerm.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Producto", "Presentacion", "Cantidad"
            }
        ));
        jScrollPane16.setViewportView(tblIngreInveProdTerm);

        btnAgregarIngreInveProdTerm.setText("Agregar");

        btnQuitarProductoTerm.setText("Quitar Producto");
        btnQuitarProductoTerm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarProductoTermActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(290, Short.MAX_VALUE)
                .addComponent(jLabel28)
                .addGap(273, 273, 273))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(jLabel38)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(btnListProdTerm)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnBuscarIngreProdTerm)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                        .addGap(153, 153, 153)
                                        .addComponent(btnRegistrarIngreInvenProdTerm, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(150, 150, 150)
                                        .addComponent(btnCancelarP1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(btnAgregarIngreInveProdTerm)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnAgregarNuevoProducto1))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel39)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jLabel40))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnQuitarProductoTerm))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(31, 31, 31)
                                .addComponent(lblUltimoP3)
                                .addGap(358, 358, 358)
                                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(FechaIngreInvenProdTerm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel36)
                                .addGap(18, 18, 18)
                                .addComponent(txtDocIngreInveProdTerm, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel28)
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(lblUltimoP3)
                        .addComponent(jLabel35))
                    .addComponent(FechaIngreInvenProdTerm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel36)
                            .addComponent(txtDocIngreInveProdTerm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel38))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnBuscarIngreProdTerm)
                                    .addComponent(btnListProdTerm)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel40)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel39)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAgregarIngreInveProdTerm)
                            .addComponent(btnAgregarNuevoProducto1))))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(btnQuitarProductoTerm)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrarIngreInvenProdTerm, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelarP1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout frmIngreProdTermLayout = new javax.swing.GroupLayout(frmIngreProdTerm.getContentPane());
        frmIngreProdTerm.getContentPane().setLayout(frmIngreProdTermLayout);
        frmIngreProdTermLayout.setHorizontalGroup(
            frmIngreProdTermLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 885, Short.MAX_VALUE)
        );
        frmIngreProdTermLayout.setVerticalGroup(
            frmIngreProdTermLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
        );

        frmNuevaProdTerm.setTitle("REGISTRAR NUEVO PRODUCTO");
        frmNuevaProdTerm.setBounds(new java.awt.Rectangle(450, 300, 0, 0));
        frmNuevaProdTerm.setMinimumSize(new java.awt.Dimension(450, 435));

        jPanel18.setBackground(new java.awt.Color(153, 204, 255));
        jPanel18.setMaximumSize(new java.awt.Dimension(800, 800));
        jPanel18.setMinimumSize(new java.awt.Dimension(500, 435));
        jPanel18.setPreferredSize(new java.awt.Dimension(427, 435));

        lblCodigoP2.setText("Codigo:");

        lblNombreP2.setText("Nombre:");

        lblSaldo2.setText("Cantidad:");

        lblUltimoP8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblUltimoP8.setText(".........");

        jLabel68.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel68.setText("Ultimo Codigo Registrado:");

        jLabel75.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel75.setText("Ingresar Datos de Producto");

        txtCodigoProdTerm.setBackground(new java.awt.Color(255, 255, 204));
        txtCodigoProdTerm.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtCodigoProdTerm.setForeground(new java.awt.Color(0, 0, 255));

        btnRegistrarNuevoProdTerm.setText("Registrar");
        btnRegistrarNuevoProdTerm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarNuevoProdTermActionPerformed(evt);
            }
        });

        btnSalirP4.setText("Cancelar");
        btnSalirP4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirP4ActionPerformed(evt);
            }
        });

        jLabel12.setText("Presentacion:");

        txtPresentacionProdTerm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPresentacionProdTermActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblSaldo2)
                                    .addComponent(jLabel12)
                                    .addComponent(lblNombreP2)
                                    .addComponent(lblCodigoP2))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCodigoProdTerm, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombreProdTerm, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCantidadProdTerm, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPresentacionProdTerm, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addComponent(jLabel68)
                                .addGap(18, 18, 18)
                                .addComponent(lblUltimoP8))
                            .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(btnRegistrarNuevoProdTerm)
                        .addGap(76, 76, 76)
                        .addComponent(btnSalirP4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel75)
                .addGap(35, 35, 35)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel68)
                    .addComponent(lblUltimoP8))
                .addGap(29, 29, 29)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoProdTerm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodigoP2))
                .addGap(23, 23, 23)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreP2)
                    .addComponent(txtNombreProdTerm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCantidadProdTerm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSaldo2))
                .addGap(18, 18, 18)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtPresentacionProdTerm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrarNuevoProdTerm)
                    .addComponent(btnSalirP4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout frmNuevaProdTermLayout = new javax.swing.GroupLayout(frmNuevaProdTerm.getContentPane());
        frmNuevaProdTerm.getContentPane().setLayout(frmNuevaProdTermLayout);
        frmNuevaProdTermLayout.setHorizontalGroup(
            frmNuevaProdTermLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        frmNuevaProdTermLayout.setVerticalGroup(
            frmNuevaProdTermLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        frmSalidaProdTerm.setTitle("REGISTRAR NUEVO PRODUCTO");
        frmSalidaProdTerm.setBounds(new java.awt.Rectangle(450, 300, 0, 0));
        frmSalidaProdTerm.setMinimumSize(new java.awt.Dimension(450, 435));

        jPanel13.setBackground(new java.awt.Color(153, 204, 255));
        jPanel13.setMaximumSize(new java.awt.Dimension(800, 800));
        jPanel13.setMinimumSize(new java.awt.Dimension(500, 435));
        jPanel13.setPreferredSize(new java.awt.Dimension(427, 435));

        lblUltimoP4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblUltimoP4.setText(".........");

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel41.setText("Ultimo Codigo Registrado:");

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel42.setText("Salida Inventario Producto Terminado");

        btnRegistrarSalidaProdTerm.setText("Registrar");
        btnRegistrarSalidaProdTerm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarSalidaProdTermActionPerformed(evt);
            }
        });

        btnCancelarP2.setText("Cancelar");
        btnCancelarP2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarP2ActionPerformed(evt);
            }
        });

        jLabel43.setText("Fecha:");

        txtDocEmpreProdTerm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDocEmpreProdTermActionPerformed(evt);
            }
        });

        jLabel44.setText("Guia de Remision");

        jButton6.setText("Buscar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        txtCodigoProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoProdActionPerformed(evt);
            }
        });

        jLabel46.setText("Codigo de producto");

        jLabel47.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel47.setText("Cantidad:");

        jLabel48.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel48.setText("Cantidad a Agregar:");

        tblEleccionSalidaProdTerm.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Producto", "Presentacion", "Cantidad"
            }
        ));
        jScrollPane17.setViewportView(tblEleccionSalidaProdTerm);

        btnListaProdTerm.setText("Lista Productos");
        btnListaProdTerm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaProdTermActionPerformed(evt);
            }
        });

        tblSalidaProdTerm.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Producto", "Presentacion", "Cantidad"
            }
        ));
        jScrollPane18.setViewportView(tblSalidaProdTerm);

        btnAgregarSalProdTerm.setText("Agregar");

        btnQuitarProductoTerm1.setText("Quitar Producto");
        btnQuitarProductoTerm1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarProductoTerm1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel42)
                .addGap(273, 273, 273))
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel13Layout.createSequentialGroup()
                                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel13Layout.createSequentialGroup()
                                                .addComponent(jLabel46)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtCodigoProd, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel13Layout.createSequentialGroup()
                                                .addComponent(btnListaProdTerm)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton6)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel13Layout.createSequentialGroup()
                                        .addGap(153, 153, 153)
                                        .addComponent(btnRegistrarSalidaProdTerm, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(150, 150, 150)
                                        .addComponent(btnCancelarP2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel13Layout.createSequentialGroup()
                                        .addComponent(jLabel47)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCantSalProdTerm, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel13Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jLabel48))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel13Layout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addComponent(btnAgregarSalProdTerm))))
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnQuitarProductoTerm1))))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(jLabel41)
                                .addGap(31, 31, 31)
                                .addComponent(lblUltimoP4)
                                .addGap(358, 358, 358)
                                .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtFechaSalProdTerm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(jLabel44)
                                .addGap(18, 18, 18)
                                .addComponent(txtDocEmpreProdTerm, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel42)
                .addGap(15, 15, 15)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel41)
                        .addComponent(lblUltimoP4)
                        .addComponent(jLabel43))
                    .addComponent(txtFechaSalProdTerm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel44)
                            .addComponent(txtDocEmpreProdTerm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCodigoProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel46))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton6)
                                    .addComponent(btnListaProdTerm)))))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel48)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel47)
                            .addComponent(txtCantSalProdTerm, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAgregarSalProdTerm)))
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(btnQuitarProductoTerm1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrarSalidaProdTerm, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelarP2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout frmSalidaProdTermLayout = new javax.swing.GroupLayout(frmSalidaProdTerm.getContentPane());
        frmSalidaProdTerm.getContentPane().setLayout(frmSalidaProdTermLayout);
        frmSalidaProdTermLayout.setHorizontalGroup(
            frmSalidaProdTermLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 804, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        frmSalidaProdTermLayout.setVerticalGroup(
            frmSalidaProdTermLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
        );

        jPanel14.setBackground(new java.awt.Color(153, 204, 255));
        jPanel14.setForeground(new java.awt.Color(100, 100, 255));
        jPanel14.setToolTipText("");

        jLabel49.setText("Productos Terminados:");

        tblListProdTerm.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "Codigo", "Nombre Del Producto"
            }
        ));
        jScrollPane14.setViewportView(tblListProdTerm);

        btnSalirProv2.setText("Salir");
        btnSalirProv2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirProv2ActionPerformed(evt);
            }
        });

        btnEliminarProdTerm.setText("Eliminar");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel49)
                    .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(btnEliminarProdTerm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalirProv2)
                .addGap(113, 113, 113))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel49)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalirProv2)
                    .addComponent(btnEliminarProdTerm))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout frmListaProdTermGerenLayout = new javax.swing.GroupLayout(frmListaProdTermGeren.getContentPane());
        frmListaProdTermGeren.getContentPane().setLayout(frmListaProdTermGerenLayout);
        frmListaProdTermGerenLayout.setHorizontalGroup(
            frmListaProdTermGerenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmListaProdTermGerenLayout.createSequentialGroup()
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        frmListaProdTermGerenLayout.setVerticalGroup(
            frmListaProdTermGerenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmListaProdTermGerenLayout.createSequentialGroup()
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        frmNuevoUser.setTitle("REGISTRAR NUEVO USUARIO");
        frmNuevoUser.setBounds(new java.awt.Rectangle(450, 300, 0, 0));
        frmNuevoUser.setMinimumSize(new java.awt.Dimension(450, 400));

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        lblCodigoU.setText("Codigo:");

        lblNombreU.setText("Nombre:");

        lblPaswordU.setText("Contraseña");

        lblUltimoU.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblUltimoU.setText(".........");
        lblUltimoU.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lblUltimoUKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Ultimo Codigo Registrado:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setText("Ingresar Datos de Usuario");

        txtCodigoU.setBackground(new java.awt.Color(255, 255, 204));
        txtCodigoU.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtCodigoU.setForeground(new java.awt.Color(0, 0, 255));
        txtCodigoU.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                txtCodigoUAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        txtCodigoU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoUActionPerformed(evt);
            }
        });
        txtCodigoU.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoUKeyTyped(evt);
            }
        });

        txtPasswordU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordUActionPerformed(evt);
            }
        });

        btnRegistrarNuevoUsuario.setText("Registrar");
        btnRegistrarNuevoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarNuevoUsuarioActionPerformed(evt);
            }
        });

        btnSalirU.setText("Salir");
        btnSalirU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirUActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnRegistrarNuevoUsuario)
                        .addGap(26, 26, 26)
                        .addComponent(btnSalirU, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblPaswordU)
                                .addGap(337, 337, 337))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblNombreU)
                                .addGap(215, 215, 215)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblCodigoU)
                                    .addGap(39, 39, 39)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtCodigoU, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtNombreU, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtPasswordU, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblUltimoU)
                            .addContainerGap()))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel5)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblUltimoU))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodigoU))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreU)
                    .addComponent(txtNombreU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPaswordU)
                    .addComponent(txtPasswordU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrarNuevoUsuario)
                    .addComponent(btnSalirU))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout frmNuevoUserLayout = new javax.swing.GroupLayout(frmNuevoUser.getContentPane());
        frmNuevoUser.getContentPane().setLayout(frmNuevoUserLayout);
        frmNuevoUserLayout.setHorizontalGroup(
            frmNuevoUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        frmNuevoUserLayout.setVerticalGroup(
            frmNuevoUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel26.setBackground(new java.awt.Color(153, 204, 255));
        jPanel26.setForeground(new java.awt.Color(100, 100, 255));
        jPanel26.setToolTipText("");

        jLabel77.setText("Productos Terminados:");

        tblListProdTerm1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "Codigo", "Nombre Del Producto"
            }
        ));
        jScrollPane31.setViewportView(tblListProdTerm1);

        btnSalirProv4.setText("Salir");
        btnSalirProv4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirProv4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel77)
                            .addComponent(jScrollPane31, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(btnSalirProv4)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel77)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane31, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(btnSalirProv4)
                .addContainerGap())
        );

        javax.swing.GroupLayout frmListaProdTermPublicLayout = new javax.swing.GroupLayout(frmListaProdTermPublic.getContentPane());
        frmListaProdTermPublic.getContentPane().setLayout(frmListaProdTermPublicLayout);
        frmListaProdTermPublicLayout.setHorizontalGroup(
            frmListaProdTermPublicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmListaProdTermPublicLayout.createSequentialGroup()
                .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        frmListaProdTermPublicLayout.setVerticalGroup(
            frmListaProdTermPublicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmListaProdTermPublicLayout.createSequentialGroup()
                .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        frmIngreInvenEmbalado.setTitle("REGISTRAR NUEVO PRODUCTO");
        frmIngreInvenEmbalado.setBounds(new java.awt.Rectangle(450, 300, 0, 0));
        frmIngreInvenEmbalado.setMinimumSize(new java.awt.Dimension(450, 435));

        jPanel4.setBackground(new java.awt.Color(153, 204, 255));
        jPanel4.setMaximumSize(new java.awt.Dimension(800, 800));
        jPanel4.setMinimumSize(new java.awt.Dimension(500, 435));
        jPanel4.setPreferredSize(new java.awt.Dimension(427, 435));

        lblUltimoP6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblUltimoP6.setText(".........");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Ultimo Codigo Registrado:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel10.setText("Ingreso Inventario Embalado");

        btnRegistrarIngreEmbal.setText("Registrar");
        btnRegistrarIngreEmbal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarIngreEmbalActionPerformed(evt);
            }
        });

        btnCancelarP3.setText("Cancelar");
        btnCancelarP3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarP3ActionPerformed(evt);
            }
        });

        jLabel52.setText("Fecha:");

        txtComproEmpresaIngreInveEmbal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtComproEmpresaIngreInveEmbalActionPerformed(evt);
            }
        });

        jLabel53.setText("Comprobante Empresa:");

        tblProvIngreEmbal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "Codigo", "Nombre de la empresa"
            }
        ));
        jScrollPane19.setViewportView(tblProvIngreEmbal);

        btnBuscarIngreEmbalado.setText("Buscar");
        btnBuscarIngreEmbalado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarIngreEmbaladoActionPerformed(evt);
            }
        });

        txtCodProdEmbalado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodProdEmbaladoActionPerformed(evt);
            }
        });

        jLabel55.setText("Codigo de producto");

        jLabel56.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel56.setText("Cantidad:");

        jLabel57.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel57.setText("Cantidad a Agregar:");

        btnAgregarNuevoProductoEmbalado.setText("Agregar Nuevo Producto");
        btnAgregarNuevoProductoEmbalado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarNuevoProductoEmbaladoActionPerformed(evt);
            }
        });

        jLabel58.setText("Datos Del Proovedor");

        jLabel59.setText("Ingrese el Codigo del Proveedor:");

        txtCodProvInveEmbal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodProvInveEmbalActionPerformed(evt);
            }
        });

        tblIngreInveEmbal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Producto", "Presentacion", "Cantidad"
            }
        ));
        jScrollPane20.setViewportView(tblIngreInveEmbal);

        btnListaProveedores1.setText("Lista de Proveedores");
        btnListaProveedores1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaProveedores1ActionPerformed(evt);
            }
        });

        btnMostrarListaEmbalado.setText("Lista Embalado");
        btnMostrarListaEmbalado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarListaEmbaladoActionPerformed(evt);
            }
        });

        txtAgregarProv.setText("Agregar");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(273, 273, 273))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(31, 31, 31)
                                .addComponent(lblUltimoP6)
                                .addGap(358, 358, 358)
                                .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtFechaIngreEmbal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel58)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel53)
                                .addGap(18, 18, 18)
                                .addComponent(txtComproEmpresaIngreInveEmbal, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnListaProveedores1)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel59)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtCodProvInveEmbal, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(335, 335, 335)
                                .addComponent(txtAgregarProv))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(btnRegistrarIngreEmbal, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(215, 215, 215)
                        .addComponent(btnCancelarP3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel55)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtCodProdEmbalado, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(btnBuscarIngreEmbalado)
                                        .addGap(60, 60, 60)))
                                .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAgregarNuevoProductoEmbalado)
                            .addComponent(btnMostrarListaEmbalado))))
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(258, 258, 258)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel56)
                        .addGap(18, 18, 18)
                        .addComponent(txtCantIngreInveEmbal, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(lblUltimoP6)
                        .addComponent(jLabel52))
                    .addComponent(txtFechaIngreEmbal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53)
                    .addComponent(txtComproEmpresaIngreInveEmbal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel58)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel59)
                    .addComponent(txtCodProvInveEmbal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnListaProveedores1))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel55)
                                    .addComponent(txtCodProdEmbalado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscarIngreEmbalado))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(btnAgregarNuevoProductoEmbalado)
                                        .addGap(19, 19, 19)
                                        .addComponent(btnMostrarListaEmbalado))
                                    .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel57)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel56)
                            .addComponent(txtCantIngreInveEmbal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCancelarP3, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                            .addComponent(btnRegistrarIngreEmbal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(txtAgregarProv))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout frmIngreInvenEmbaladoLayout = new javax.swing.GroupLayout(frmIngreInvenEmbalado.getContentPane());
        frmIngreInvenEmbalado.getContentPane().setLayout(frmIngreInvenEmbaladoLayout);
        frmIngreInvenEmbaladoLayout.setHorizontalGroup(
            frmIngreInvenEmbaladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 822, Short.MAX_VALUE)
        );
        frmIngreInvenEmbaladoLayout.setVerticalGroup(
            frmIngreInvenEmbaladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
        );

        frmNuevoEmbalado.setTitle("REGISTRAR NUEVO PRODUCTO");
        frmNuevoEmbalado.setBounds(new java.awt.Rectangle(450, 300, 0, 0));
        frmNuevoEmbalado.setMinimumSize(new java.awt.Dimension(450, 435));

        jPanel15.setBackground(new java.awt.Color(153, 204, 255));
        jPanel15.setMaximumSize(new java.awt.Dimension(800, 800));
        jPanel15.setMinimumSize(new java.awt.Dimension(500, 435));
        jPanel15.setPreferredSize(new java.awt.Dimension(427, 435));

        lblCodigoP1.setText("Codigo:");

        lblNombreP1.setText("Nombre:");

        lblSaldo1.setText("Cantidad:");

        lblUltimoP5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblUltimoP5.setText(".........");

        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel50.setText("Ultimo Codigo Registrado:");

        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel51.setText("Ingresar Datos de Producto");

        txtCodigoEmbal.setBackground(new java.awt.Color(255, 255, 204));
        txtCodigoEmbal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtCodigoEmbal.setForeground(new java.awt.Color(0, 0, 255));

        btnRegistrarNuevoProducto3.setText("Registrar");
        btnRegistrarNuevoProducto3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarNuevoProducto3ActionPerformed(evt);
            }
        });

        btnSalirP2.setText("Cancelar");
        btnSalirP2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirP2ActionPerformed(evt);
            }
        });

        jLabel15.setText("Presentacion");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel15Layout.createSequentialGroup()
                                            .addComponent(lblCodigoP1)
                                            .addGap(24, 24, 24))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                                            .addComponent(lblNombreP1)
                                            .addGap(22, 22, 22))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                                            .addComponent(lblSaldo1)
                                            .addGap(18, 18, 18)))
                                    .addGroup(jPanel15Layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addGap(18, 18, 18)))
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNombreEmbal, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                                    .addComponent(txtCodigoEmbal)
                                    .addComponent(txtCantEmbal)
                                    .addComponent(txtPresentacionEmbal)))
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addComponent(jLabel50)
                                .addGap(18, 18, 18)
                                .addComponent(lblUltimoP5))
                            .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(btnRegistrarNuevoProducto3)
                        .addGap(76, 76, 76)
                        .addComponent(btnSalirP2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel51)
                .addGap(35, 35, 35)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50)
                    .addComponent(lblUltimoP5))
                .addGap(29, 29, 29)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoEmbal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodigoP1))
                .addGap(23, 23, 23)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreP1)
                    .addComponent(txtNombreEmbal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSaldo1)
                    .addComponent(txtCantEmbal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtPresentacionEmbal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrarNuevoProducto3)
                    .addComponent(btnSalirP2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout frmNuevoEmbaladoLayout = new javax.swing.GroupLayout(frmNuevoEmbalado.getContentPane());
        frmNuevoEmbalado.getContentPane().setLayout(frmNuevoEmbaladoLayout);
        frmNuevoEmbaladoLayout.setHorizontalGroup(
            frmNuevoEmbaladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        frmNuevoEmbaladoLayout.setVerticalGroup(
            frmNuevoEmbaladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel16.setBackground(new java.awt.Color(153, 204, 255));
        jPanel16.setForeground(new java.awt.Color(100, 100, 255));
        jPanel16.setToolTipText("");

        jLabel60.setText("Productos De Embalado:");

        tblProdEmbal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "Codigo", "Nombre producto"
            }
        ));
        jScrollPane21.setViewportView(tblProdEmbal);

        btnSalirProv3.setText("Salir");
        btnSalirProv3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirProv3ActionPerformed(evt);
            }
        });

        btnEliminarProdEmbal.setText("Eliminar");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel60)
                    .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(btnEliminarProdEmbal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalirProv3)
                .addGap(113, 113, 113))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel60)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalirProv3)
                    .addComponent(btnEliminarProdEmbal))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout frmListaEmbaladoGerenLayout = new javax.swing.GroupLayout(frmListaEmbaladoGeren.getContentPane());
        frmListaEmbaladoGeren.getContentPane().setLayout(frmListaEmbaladoGerenLayout);
        frmListaEmbaladoGerenLayout.setHorizontalGroup(
            frmListaEmbaladoGerenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmListaEmbaladoGerenLayout.createSequentialGroup()
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        frmListaEmbaladoGerenLayout.setVerticalGroup(
            frmListaEmbaladoGerenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmListaEmbaladoGerenLayout.createSequentialGroup()
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel27.setBackground(new java.awt.Color(153, 204, 255));
        jPanel27.setForeground(new java.awt.Color(100, 100, 255));
        jPanel27.setToolTipText("");

        jLabel78.setText("Productos De Embalado:");

        tblProdEmbal1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "Codigo", "Nombre producto"
            }
        ));
        jScrollPane32.setViewportView(tblProdEmbal1);

        btnSalirProv5.setText("Salir");
        btnSalirProv5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirProv5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel78)
                            .addComponent(jScrollPane32, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(btnSalirProv5)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel78)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane32, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalirProv5)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout frmListaEmbaladoPublicLayout = new javax.swing.GroupLayout(frmListaEmbaladoPublic.getContentPane());
        frmListaEmbaladoPublic.getContentPane().setLayout(frmListaEmbaladoPublicLayout);
        frmListaEmbaladoPublicLayout.setHorizontalGroup(
            frmListaEmbaladoPublicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmListaEmbaladoPublicLayout.createSequentialGroup()
                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        frmListaEmbaladoPublicLayout.setVerticalGroup(
            frmListaEmbaladoPublicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmListaEmbaladoPublicLayout.createSequentialGroup()
                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        frmSalidaInvenEmbalado.setTitle("REGISTRAR NUEVO PRODUCTO");
        frmSalidaInvenEmbalado.setBounds(new java.awt.Rectangle(450, 300, 0, 0));
        frmSalidaInvenEmbalado.setMinimumSize(new java.awt.Dimension(450, 435));

        jPanel17.setBackground(new java.awt.Color(153, 204, 255));
        jPanel17.setMaximumSize(new java.awt.Dimension(800, 800));
        jPanel17.setMinimumSize(new java.awt.Dimension(500, 435));
        jPanel17.setPreferredSize(new java.awt.Dimension(427, 435));

        lblUltimoP7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblUltimoP7.setText(".........");

        jLabel61.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel61.setText("Ultimo Codigo Registrado:");

        jLabel62.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel62.setText("Salida Inventario Embalado");

        btnRegistrarSalidaMatPrim1.setText("Registrar");
        btnRegistrarSalidaMatPrim1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarSalidaMatPrim1ActionPerformed(evt);
            }
        });

        btnSalirP3.setText("Salir");
        btnSalirP3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirP3ActionPerformed(evt);
            }
        });

        jLabel63.setText("Fecha:");

        txtComproEmpreSalEmbal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtComproEmpreSalEmbalActionPerformed(evt);
            }
        });

        jLabel64.setText("Comprobante de la empresa");

        tblSalidaInventarioEmbal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Producto", "Presentacion", "Cantidad"
            }
        ));
        jScrollPane22.setViewportView(tblSalidaInventarioEmbal);

        btnBuscarProd1.setText("Buscar");

        txtCodProductoEmbalado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodProductoEmbaladoActionPerformed(evt);
            }
        });

        jLabel66.setText("Codigo de producto");

        jTable17.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Producto", "Presentacion", "Cantidad"
            }
        ));
        jScrollPane23.setViewportView(jTable17);

        btnAgregarSalInve.setText("Agregar");
        btnAgregarSalInve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarSalInveActionPerformed(evt);
            }
        });

        jLabel67.setText("Cantidad:");

        btnQuitarProducto1.setText("Quitar Producto");

        btnListaProductosMateriaPrima1.setText("Lista Embalados");
        btnListaProductosMateriaPrima1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaProductosMateriaPrima1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel66)
                            .addComponent(btnListaProductosMateriaPrima1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCodProductoEmbalado, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscarProd1))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane23, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jLabel64)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtComproEmpreSalEmbal, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel67)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCantSalInveEmbal, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAgregarSalInve)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel61)
                        .addGap(18, 18, 18)
                        .addComponent(lblUltimoP7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)))
                .addGap(18, 18, 18)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FechaSalidaInvenEmbalado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnQuitarProducto1))
                .addGap(98, 98, 98))
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(btnRegistrarSalidaMatPrim1)
                        .addGap(211, 211, 211)
                        .addComponent(btnSalirP3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(301, 301, 301)
                        .addComponent(jLabel62)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel62)
                .addGap(36, 36, 36)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblUltimoP7)
                        .addComponent(jLabel61)
                        .addComponent(jLabel63))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(FechaSalidaInvenEmbalado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel64)
                            .addComponent(txtComproEmpreSalEmbal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(59, 59, 59)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane23, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCodProductoEmbalado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel66))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBuscarProd1)
                            .addComponent(btnListaProductosMateriaPrima1)))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel67)
                            .addComponent(txtCantSalInveEmbal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregarSalInve)))
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(btnQuitarProducto1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrarSalidaMatPrim1)
                    .addComponent(btnSalirP3))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout frmSalidaInvenEmbaladoLayout = new javax.swing.GroupLayout(frmSalidaInvenEmbalado.getContentPane());
        frmSalidaInvenEmbalado.getContentPane().setLayout(frmSalidaInvenEmbaladoLayout);
        frmSalidaInvenEmbaladoLayout.setHorizontalGroup(
            frmSalidaInvenEmbaladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, 877, Short.MAX_VALUE)
        );
        frmSalidaInvenEmbaladoLayout.setVerticalGroup(
            frmSalidaInvenEmbaladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
        );

        frmReportMatPrim.setMinimumSize(new java.awt.Dimension(600, 600));

        jPanel19.setBackground(new java.awt.Color(153, 204, 255));
        jPanel19.setMaximumSize(new java.awt.Dimension(32767, 25000));

        lblReportar2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblReportar2.setText("Reporte de almacen Materia Prima");

        jLabel69.setText("Seleccione Fecha inicial:");

        btnMostrarReporteMatPrim.setText("Mostrar");
        btnMostrarReporteMatPrim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarReporteMatPrimActionPerformed(evt);
            }
        });

        btSalirReport2.setText("Salir");
        btSalirReport2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalirReport2ActionPerformed(evt);
            }
        });

        tblResultadoReporteMatPrim.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Numero Comprobante", "Producto", "Cantidad"
            }
        ));
        jScrollPane24.setViewportView(tblResultadoReporteMatPrim);

        jLabel70.setText("Seleccione Fecha finall:");

        btnAlmacenMatPrim.setText("Almacen Materia Prima");
        btnAlmacenMatPrim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlmacenMatPrimActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnMostrarReporteMatPrim)
                            .addComponent(lblReportar2))
                        .addGap(61, 61, 61)
                        .addComponent(btnAlmacenMatPrim))
                    .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel19Layout.createSequentialGroup()
                            .addGap(113, 113, 113)
                            .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel70)
                                .addComponent(jLabel69))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(fechaReportFinalMatPrim, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(FechaReportInicialMatPrim, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel19Layout.createSequentialGroup()
                            .addGap(81, 81, 81)
                            .addComponent(jScrollPane24, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel19Layout.createSequentialGroup()
                            .addGap(338, 338, 338)
                            .addComponent(btSalirReport2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jLabel70))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(lblReportar2)
                        .addGap(30, 30, 30)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel69)
                            .addComponent(FechaReportInicialMatPrim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnMostrarReporteMatPrim)
                                    .addComponent(btnAlmacenMatPrim, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(fechaReportFinalMatPrim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane24, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btSalirReport2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout frmReportMatPrimLayout = new javax.swing.GroupLayout(frmReportMatPrim.getContentPane());
        frmReportMatPrim.getContentPane().setLayout(frmReportMatPrimLayout);
        frmReportMatPrimLayout.setHorizontalGroup(
            frmReportMatPrimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        frmReportMatPrimLayout.setVerticalGroup(
            frmReportMatPrimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        frmAlmacenMateriaPrima.setMinimumSize(new java.awt.Dimension(600, 600));

        jPanel22.setBackground(new java.awt.Color(153, 204, 255));
        jPanel22.setMaximumSize(new java.awt.Dimension(32767, 25000));

        lblReportar5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblReportar5.setText("Almacen Materia Prima");

        btSalirReport5.setText("Salir");
        btSalirReport5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalirReport5ActionPerformed(evt);
            }
        });

        tblMateriaPrima.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Codigo Producto", "Producto", "Cantidad"
            }
        ));
        jScrollPane27.setViewportView(tblMateriaPrima);

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGap(338, 338, 338)
                        .addComponent(btSalirReport5, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jScrollPane27, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addComponent(lblReportar5)))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblReportar5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane27, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btSalirReport5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout frmAlmacenMateriaPrimaLayout = new javax.swing.GroupLayout(frmAlmacenMateriaPrima.getContentPane());
        frmAlmacenMateriaPrima.getContentPane().setLayout(frmAlmacenMateriaPrimaLayout);
        frmAlmacenMateriaPrimaLayout.setHorizontalGroup(
            frmAlmacenMateriaPrimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        frmAlmacenMateriaPrimaLayout.setVerticalGroup(
            frmAlmacenMateriaPrimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        frmReportProdTerm.setMinimumSize(new java.awt.Dimension(600, 600));

        jPanel20.setBackground(new java.awt.Color(153, 204, 255));
        jPanel20.setMaximumSize(new java.awt.Dimension(32767, 25000));

        lblReportar3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblReportar3.setText("Reporte de almacen Producto Terminado");

        jLabel71.setText("Seleccione Fecha inicial:");

        btnReportar3.setText("Reportar");
        btnReportar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportar3ActionPerformed(evt);
            }
        });

        btSalirReport3.setText("Salir");
        btSalirReport3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalirReport3ActionPerformed(evt);
            }
        });

        tblResultadoReporte3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Numero Comprobante", "Producto", "Cantidad"
            }
        ));
        jScrollPane25.setViewportView(tblResultadoReporte3);

        jLabel72.setText("Seleccione Fecha finall:");

        btnAlmacenProdTermina.setText("Almacen Producto terminado");
        btnAlmacenProdTermina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlmacenProdTerminaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel72)
                    .addComponent(jLabel71))
                .addGap(27, 27, 27)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(dateChFechaFinProdTerm, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(btnReportar3))
                    .addComponent(dateChFechaInicioProdTerm, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(btnAlmacenProdTermina)
                .addGap(69, 69, 69))
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(lblReportar3))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jScrollPane25, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(326, 326, 326)
                        .addComponent(btSalirReport3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(lblReportar3)
                        .addGap(30, 30, 30)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel71)
                            .addComponent(dateChFechaInicioProdTerm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addComponent(dateChFechaFinProdTerm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jLabel72))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnReportar3)
                            .addComponent(btnAlmacenProdTermina, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane25, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btSalirReport3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout frmReportProdTermLayout = new javax.swing.GroupLayout(frmReportProdTerm.getContentPane());
        frmReportProdTerm.getContentPane().setLayout(frmReportProdTermLayout);
        frmReportProdTermLayout.setHorizontalGroup(
            frmReportProdTermLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        frmReportProdTermLayout.setVerticalGroup(
            frmReportProdTermLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        frmAlmacenProdTerm.setMinimumSize(new java.awt.Dimension(600, 600));

        jPanel23.setBackground(new java.awt.Color(153, 204, 255));
        jPanel23.setMaximumSize(new java.awt.Dimension(32767, 25000));

        lblReportar6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblReportar6.setText("Almacen Producto Terminado");

        btSalirReport6.setText("Salir");
        btSalirReport6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalirReport6ActionPerformed(evt);
            }
        });

        tblProdTerminado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Codigo Producto", "Producto", "Cantidad"
            }
        ));
        jScrollPane28.setViewportView(tblProdTerminado);

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGap(338, 338, 338)
                        .addComponent(btSalirReport6, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jScrollPane28, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addComponent(lblReportar6)))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblReportar6)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane28, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btSalirReport6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout frmAlmacenProdTermLayout = new javax.swing.GroupLayout(frmAlmacenProdTerm.getContentPane());
        frmAlmacenProdTerm.getContentPane().setLayout(frmAlmacenProdTermLayout);
        frmAlmacenProdTermLayout.setHorizontalGroup(
            frmAlmacenProdTermLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        frmAlmacenProdTermLayout.setVerticalGroup(
            frmAlmacenProdTermLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        frmReportEmbal.setMinimumSize(new java.awt.Dimension(600, 600));

        jPanel21.setBackground(new java.awt.Color(153, 204, 255));
        jPanel21.setMaximumSize(new java.awt.Dimension(32767, 25000));

        lblReportar4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblReportar4.setText("Reporte de almacen Embalado");

        jLabel73.setText("Seleccione Fecha inicial:");

        btnReportarAlmaEmbal.setText("Reportar");
        btnReportarAlmaEmbal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportarAlmaEmbalActionPerformed(evt);
            }
        });

        btSalirReport4.setText("Salir");
        btSalirReport4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalirReport4ActionPerformed(evt);
            }
        });

        tblReporteAlmacenEmbalado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Numero Comprobante", "Nombre Producto", "Cantidad"
            }
        ));
        jScrollPane26.setViewportView(tblReporteAlmacenEmbalado);

        jLabel74.setText("Seleccione Fecha finall:");

        btnAlmacenEmbal.setText("Almacen Embalado");
        btnAlmacenEmbal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlmacenEmbalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(jLabel73)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dateChFechaIniReporAlmaEmbal, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addComponent(jLabel74)
                                .addGap(18, 18, 18)
                                .addComponent(dateChFechaFinAlmaEmbal, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnReportarAlmaEmbal)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAlmacenEmbal)
                        .addGap(65, 65, 65))))
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(lblReportar4))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jScrollPane26, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGap(341, 341, 341)
                        .addComponent(btSalirReport4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jLabel74))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(lblReportar4)
                        .addGap(30, 30, 30)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel73)
                            .addComponent(dateChFechaIniReporAlmaEmbal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnReportarAlmaEmbal)
                                    .addComponent(btnAlmacenEmbal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(dateChFechaFinAlmaEmbal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane26, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btSalirReport4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout frmReportEmbalLayout = new javax.swing.GroupLayout(frmReportEmbal.getContentPane());
        frmReportEmbal.getContentPane().setLayout(frmReportEmbalLayout);
        frmReportEmbalLayout.setHorizontalGroup(
            frmReportEmbalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        frmReportEmbalLayout.setVerticalGroup(
            frmReportEmbalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        frmAlmacenEmbalado.setMinimumSize(new java.awt.Dimension(600, 600));

        jPanel24.setBackground(new java.awt.Color(153, 204, 255));
        jPanel24.setMaximumSize(new java.awt.Dimension(32767, 25000));

        lblReportar7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblReportar7.setText("Almacen Embalado");

        btSalirReport7.setText("Salir");
        btSalirReport7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalirReport7ActionPerformed(evt);
            }
        });

        tblAlmacenEmbal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Codigo Producto", "Producto", "Cantidad"
            }
        ));
        jScrollPane29.setViewportView(tblAlmacenEmbal);

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(338, 338, 338)
                        .addComponent(btSalirReport7, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jScrollPane29, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(283, 283, 283)
                        .addComponent(lblReportar7)))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblReportar7)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane29, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btSalirReport7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout frmAlmacenEmbaladoLayout = new javax.swing.GroupLayout(frmAlmacenEmbalado.getContentPane());
        frmAlmacenEmbalado.getContentPane().setLayout(frmAlmacenEmbaladoLayout);
        frmAlmacenEmbaladoLayout.setHorizontalGroup(
            frmAlmacenEmbaladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        frmAlmacenEmbaladoLayout.setVerticalGroup(
            frmAlmacenEmbaladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jFormattedTextField1.setText("jFormattedTextField1");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane7.setViewportView(jTable1);

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISTEMA VENTAS");
        setBackground(new java.awt.Color(204, 204, 204));

        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });

        jLabel16.setText("Usuario a Cargo");

        bmInicio.setText("Inicio");

        opNuevoUser.setText("Nuevo Usuario");
        opNuevoUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opNuevoUserActionPerformed(evt);
            }
        });
        bmInicio.add(opNuevoUser);

        opBuscarUser.setText("Buscar Usuario");
        opBuscarUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opBuscarUserActionPerformed(evt);
            }
        });
        bmInicio.add(opBuscarUser);
        bmInicio.add(jSeparator1);

        opSalir.setText("Salir (Exit)");
        opSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opSalirActionPerformed(evt);
            }
        });
        bmInicio.add(opSalir);

        MenuBarraPrincipal.add(bmInicio);

        bmInventario.setText("Inventario");

        jMenu1.setText("Inventario Materia Prima");

        opInveMatPrimIngreso.setText("Ingreso Inventario Materia Prima");
        opInveMatPrimIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opInveMatPrimIngresoActionPerformed(evt);
            }
        });
        jMenu1.add(opInveMatPrimIngreso);

        opInveMatPrimSalida.setText("Salida Inventario Materia Prima");
        opInveMatPrimSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opInveMatPrimSalidaActionPerformed(evt);
            }
        });
        jMenu1.add(opInveMatPrimSalida);

        bmInventario.add(jMenu1);

        jMenu2.setText("Inventario Producto Terminado");

        opInveProdTermIngreso.setText("Ingreso Inventario Producto Terminado");
        opInveProdTermIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opInveProdTermIngresoActionPerformed(evt);
            }
        });
        jMenu2.add(opInveProdTermIngreso);

        opInveProdTermSalida.setText("Salida Inventario Producto Terminado");
        opInveProdTermSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opInveProdTermSalidaActionPerformed(evt);
            }
        });
        jMenu2.add(opInveProdTermSalida);

        bmInventario.add(jMenu2);

        jMenu3.setText("Inventario Embalado");

        opInveEmbalIngreso.setText("Ingreso Inventario Embalado");
        opInveEmbalIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opInveEmbalIngresoActionPerformed(evt);
            }
        });
        jMenu3.add(opInveEmbalIngreso);

        opInveEmbalSalida.setText("Salida Inventario Embalado");
        opInveEmbalSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opInveEmbalSalidaActionPerformed(evt);
            }
        });
        jMenu3.add(opInveEmbalSalida);

        bmInventario.add(jMenu3);

        MenuBarraPrincipal.add(bmInventario);

        bmReportes.setText("Reportes");

        opReportMatPrim.setText("Reporte Materia Prima");
        opReportMatPrim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opReportMatPrimActionPerformed(evt);
            }
        });
        bmReportes.add(opReportMatPrim);

        opReportProdTermi.setText("Reporte Producto Terminado");
        opReportProdTermi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opReportProdTermiActionPerformed(evt);
            }
        });
        bmReportes.add(opReportProdTermi);

        opReportEmbal.setText("Reporte Embalado");
        opReportEmbal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opReportEmbalActionPerformed(evt);
            }
        });
        bmReportes.add(opReportEmbal);

        MenuBarraPrincipal.add(bmReportes);

        setJMenuBar(MenuBarraPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(275, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addContainerGap(357, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opNuevoUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opNuevoUserActionPerformed
        
        frmNuevoUser.setVisible(true);
        frmNuevoUser.setLocationRelativeTo(null);
        
        cConnection con = new cConnection();
        
        String query = "SELECT MAX(IdUser) AS IdUser FROM Usuario"; //selecciona el ultimo(MAX) registro de IdUser de la tabla
        
        try
        {
          Statement st = con.ObtenerConexion().createStatement();
          ResultSet rs = st.executeQuery(query);
             
          if(rs.next())
          {
            lblUltimoU.setText(rs.getString("IdUser"));
            int cod = Integer.parseInt(rs.getString("IdUser"));
            cod++;
            txtCodigoU.setText(String.valueOf(cod));
            txtCodigoU.setEditable(false);
            txtNombreU.requestFocus();
          }      
        }
        catch(Exception e)
        {
          JOptionPane.showMessageDialog(null,"No existe el Usuario","Mensaje",JOptionPane.CANCEL_OPTION);
        }
        
    }//GEN-LAST:event_opNuevoUserActionPerformed

    private void btnSalirUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirUActionPerformed
        
        frmNuevoUser.setVisible(false);
    }//GEN-LAST:event_btnSalirUActionPerformed

    private void btnRegistrarNuevoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarNuevoUsuarioActionPerformed
       
        cConnection con = new cConnection();
        
        String codUser;
        String nombUser;
        String passUser;
       
        try{
              
            codUser = txtCodigoU.getText();
            nombUser = txtNombreU.getText();
            passUser = txtPasswordU.getText();
            
            Statement st = null;
            st = con.ObtenerConexion().createStatement();
            st.executeUpdate("INSERT INTO Usuario(IdUser,NombUser,PassUser)" + "values("+codUser+" , '"+nombUser+"' , '"+passUser+"')");
            
            JOptionPane.showMessageDialog(null, "Se registró usuario...");
            txtCodigoU.setText("");
            txtNombreU.setText("");
            txtPasswordU.setText("");
        }
        catch(Exception e){
                JOptionPane.showMessageDialog(null,"No se Pudo Agregar","Mensaje",JOptionPane.CANCEL_OPTION);
                txtCodigoU.setText("");
                txtNombreU.setText("");
                txtPasswordU.setText("");
        }
    }//GEN-LAST:event_btnRegistrarNuevoUsuarioActionPerformed

    private void opSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opSalirActionPerformed
        
        System.exit(0);
    }//GEN-LAST:event_opSalirActionPerformed

    private void btnRegistrarNuevoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarNuevoProductoActionPerformed
 
        double MBruto, MDcto;
        String FechaRegistro;
        String mb;
        String md;
        String codP;
        int SaldoActual = 0;
        int NuevoSaldo;
        String NuevoStock;
        String cantV;
        for(int i = 0;i<tblProdMatPrimRegis.getRowCount();i++)
        {
            try{
                    cConnection con = new cConnection();

                    ItemCmbDcto = String.valueOf(cmbDcto.getSelectedItem());
                    int porcent = Integer.parseInt(ItemCmbDcto);
                     
                    MBruto = sumPago;
                    MDcto = (MBruto*porcent)/100; 

                    TotalPago = String.valueOf(MBruto - MDcto);
                    
                    mb = String.valueOf(MBruto);
                    md = String.valueOf(MDcto);

                    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); //Primero dar formato para fecha
                    FechaRegistro = sdf.format(FechaIngreInveMatPrim.getDate());
                    
                    codP = tblProdMatPrimRegis.getValueAt(i, 0).toString();
                    String NomP = tblProdMatPrimRegis.getValueAt(i, 1).toString();
                    String precioP = tblProdMatPrimRegis.getValueAt(i, 2).toString();
                    cantV = tblProdMatPrimRegis.getValueAt(i, 3).toString();
                    String sbtotal = tblProdMatPrimRegis.getValueAt(i, 4).toString();
                    
                    // Registrar en Cabecera Comprobante
                    Statement stCab = null;
                    stCab = con.ObtenerConexion().createStatement();
                    stCab.executeUpdate("INSERT INTO CabecDocVenta(NumDocVenta,NomUsuario,DNICli,MontoBruto,MontoDcto,MontoTotal,FechaVenta)" 
                                    + "values("+Comprobante+",'"+DatoUsuario+"',"+dni+","+mb+","+md+","+TotalPago+",'"+FechaRegistro+"')");
                   
                    // Registrar en Detalle Comprobante
                    Statement stDetalle = null;
                    stDetalle = con.ObtenerConexion().createStatement();
                    stDetalle.executeUpdate("INSERT INTO DetalleDocVenta(NumDocV,CodProduc,CantVend,SubTot)" 
                                  + "values("+Comprobante+" , "+codP+" , "+cantV+" , "+sbtotal+")");
                    
                    JOptionPane.showMessageDialog(null, "Se registro correctamente la venta...\n"+"El monto a pagar es:\n"+String.valueOf(TotalPago));
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,"No se Pudo Agregar","Mensaje",JOptionPane.CANCEL_OPTION);
                tblProductoEncontrado.removeAll();
                tblProdMatPrimRegis.removeAll();
                tblClienteEncontrado.removeAll();
                txtDNI.setText("");
                txtTotal.setText("");
               try {
                //Regresa la cantidad a la tabla Producto
                cConnection con = new cConnection();
                
                codP = tblProdMatPrimRegis.getValueAt(i, 0).toString();
                cantV = tblProdMatPrimRegis.getValueAt(i, 3).toString();
                
                String queryBusca = "SELECT Saldo FROM Producto WHERE CodProd = "+codP+"";

                PreparedStatement pstm = con.ObtenerConexion().prepareStatement(queryBusca);
                ResultSet rs = pstm.executeQuery();

                
                    while(rs.next())
                    {
                        SaldoActual = Integer.parseInt(rs.getString("Saldo"));

                    }
                    rs.close();

                    // Actualizar Stock de la Tabla Producto (Base de Datos)
                    NuevoSaldo = SaldoActual + Integer.parseInt(cantV);
                    NuevoStock = String.valueOf(NuevoSaldo);

                    String queryAcutaliza = "UPDATE Producto SET Saldo="+NuevoStock+" WHERE CodProd ="+codP+"";

                    Statement st;
                    st = con.ObtenerConexion().createStatement();
                    st.executeUpdate(queryAcutaliza);
                } catch (SQLException ex) {
                    
                }
                    
            }

        }
        
        tblProductoEncontrado.removeAll();
        tblProdMatPrimRegis.removeAll();
        tblClienteEncontrado.removeAll();
        txtDNI.setText("");
        txtTotal.setText("");
    }//GEN-LAST:event_btnRegistrarNuevoProductoActionPerformed

    private void btnCancelarMatPrimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarMatPrimActionPerformed
        frmIngreInvenMatPrim.setVisible(false);
    }//GEN-LAST:event_btnCancelarMatPrimActionPerformed

    private void opInveMatPrimIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opInveMatPrimIngresoActionPerformed
        
        frmIngreInvenMatPrim.setVisible(true);
        frmIngreInvenMatPrim.setLocationRelativeTo(null);
        
        cConnection con = new cConnection();
        
        String queryP = "SELECT MAX(ComprobanteEmpresa) AS ComprobanteEmpresa FROM MovimientoMateriaPrima"; //selecciona el ultimo(MAX) registro de la tabla
               
        FechaIngreInveMatPrim.setCalendar(calend);  // Poner la fecha Actual en el JDateChooser

        int codEmpre;
                
        try
        {
          Statement st = con.ObtenerConexion().createStatement();
          ResultSet rs = st.executeQuery(queryP);
             
          if(rs.next())
            { 
              lblUltimoP.setText(rs.getString("ComprobanteEmpresa"));
              codEmpre = Integer.parseInt(rs.getString("ComprobanteEmpresa"));
              codEmpre++;
              txtComprobanteEmpreIMatPrim.setText(String.valueOf(codEmpre));
              txtComprobanteEmpreIMatPrim.setEditable(false);
              txtComprobanteEmpreIMatPrim.requestFocus();
            } 
        }
        catch(Exception e)
        {
          JOptionPane.showMessageDialog(null,"No existe un Producto. Puede Crear nuevo","Mensaje",JOptionPane.INFORMATION_MESSAGE);
          
          codEmpre=1;  // Para poner el primer codigo del producto
          lblUltimoP.setText("CERO");
          txtComprobanteEmpreIMatPrim.setText(String.valueOf(codEmpre));
          txtComprobanteEmpreIMatPrim.setEditable(false);
          txtComprobanteEmpreIMatPrim.requestFocus();
        }
    }//GEN-LAST:event_opInveMatPrimIngresoActionPerformed

    private void opInveProdTermIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opInveProdTermIngresoActionPerformed
       
        frmIngreProdTerm.setVisible(true);
        frmIngreProdTerm.setLocationRelativeTo(null);
        // Poner la fecha Actual en el JDateChooser
                
    }//GEN-LAST:event_opInveProdTermIngresoActionPerformed

    private void txtNombUserBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombUserBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombUserBuscarActionPerformed

    private void btnBuscarUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarUserActionPerformed
        
        String codUser;
              
        cConnection con = new cConnection();
        
        try{            
            codUser = txtNombUserBuscar.getText();

            DefaultTableModel dtBuscarUsuario = new DefaultTableModel(); //Crear Modelo de Tabla dtBuscarUsuario
            tblResultadoUsuario.setModel(dtBuscarUsuario);  // Asignar el Modelo de Tabla para el tblResultadoUuario (formulario)
 
            dtBuscarUsuario.addColumn("Nombre"); //Asigna nom,be a cada columna del Modelo de Tabla
            dtBuscarUsuario.addColumn("Password");
     
            String query = "SELECT * FROM Usuario WHERE IdUser = "+codUser+"";
                        
            PreparedStatement pstm = con.ObtenerConexion().prepareStatement(query);
            ResultSet rs = pstm.executeQuery();         
            
            while(rs.next()){            
                dtBuscarUsuario.addRow(new Object[] {rs.getString("NombUser"),rs.getString("PassUSer")}); //Extrae del rs y lo añade al Modelo de Tabla
            }
            rs.close();
          }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"No existe Usuario. Puede Crear Nuevo.","Mensaje",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarUserActionPerformed

    private void opBuscarUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opBuscarUserActionPerformed
        
        frmBuscarUsuario.setVisible(true);
        frmBuscarUsuario.setLocationRelativeTo(null);
    }//GEN-LAST:event_opBuscarUserActionPerformed

    private void opInveEmbalIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opInveEmbalIngresoActionPerformed
        
        frmIngreInvenEmbalado.setVisible(true);
        frmIngreInvenEmbalado.setLocationRelativeTo(null);
    
        cConnection con = new cConnection();
        
        String queryDV = "SELECT MAX(IdDctoVenta) AS IdDctoVenta FROM DctoVenta"; //selecciona el ultimo(MAX) registro de la tabla
               
        int codDV;
                
        
    }//GEN-LAST:event_opInveEmbalIngresoActionPerformed

    private void opReportMatPrimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opReportMatPrimActionPerformed
        
        int codCP;
        
        frmReportMatPrim.setVisible(true);
        frmReportMatPrim.setLocationRelativeTo(null);
    
        
        cConnection con = new cConnection();
        
        String queryP = "SELECT MAX(NumDocVenta) AS NumDocVenta FROM CabecDocVenta"; //selecciona el ultimo(MAX) registro de la tabla
                
        
        
    }//GEN-LAST:event_opReportMatPrimActionPerformed

    private void opReportProdTermiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opReportProdTermiActionPerformed
        
        frmReportProdTerm.setVisible(true);
        frmReportProdTerm.setLocationRelativeTo(null);


    }//GEN-LAST:event_opReportProdTermiActionPerformed

    private void btnSalirBuscarUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirBuscarUActionPerformed
       
        frmBuscarUsuario.setVisible(false);
    }//GEN-LAST:event_btnSalirBuscarUActionPerformed

    private void opReportEmbalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opReportEmbalActionPerformed
        frmReportEmbal.setVisible(true);
    }//GEN-LAST:event_opReportEmbalActionPerformed

    private void txtComprobanteEmpreIMatPrimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtComprobanteEmpreIMatPrimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtComprobanteEmpreIMatPrimActionPerformed

    private void txtMatPrimBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMatPrimBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMatPrimBuscarActionPerformed

    private void btnRegistrarSalidaMatPrimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarSalidaMatPrimActionPerformed
        
    }//GEN-LAST:event_btnRegistrarSalidaMatPrimActionPerformed

    private void btnSalirP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirP1ActionPerformed
        frmSalidaInvenMatPrim.setVisible(false);
    }//GEN-LAST:event_btnSalirP1ActionPerformed

    private void txtGuiaRemisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGuiaRemisionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGuiaRemisionActionPerformed

    private void txtResponsableSalMatPrimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResponsableSalMatPrimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResponsableSalMatPrimActionPerformed

    private void txtCodProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodProductoActionPerformed

    private void btnAgregarNuevoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarNuevoProductoActionPerformed
        frmNuevaMatPrima.setVisible(true);
        frmListaMatPrimaGeren.setLocationRelativeTo(null);
        
        cConnection con = new cConnection();
        
        String query = "SELECT MAX(CodProd) AS CodProd FROM InventarioMateriaPrima"; //selecciona el ultimo(MAX) registro de IdUser de la tabla
        
        try
        {
          Statement st = con.ObtenerConexion().createStatement();
          ResultSet rs = st.executeQuery(query);
             
          if(rs.next())
          {
            lblUltimoU.setText(rs.getString("CodProd"));
            int cod = Integer.parseInt(rs.getString("CodProd"));
            cod++;
            txtCodigoIngrMatPrim.setText(String.valueOf(cod));
            txtCodigoIngrMatPrim.setEditable(false);
            txtNombreIngrMatPrim.requestFocus();
            txtCantidadIngrMatPrim.requestFocus();
            txtPresentacionIngreMatPrim.requestFocus();
            
          }      
        }
        catch(Exception e)
        {
          JOptionPane.showMessageDialog(null,"No existe esa Materia Prima","Mensaje",JOptionPane.CANCEL_OPTION);
        }
    }//GEN-LAST:event_btnAgregarNuevoProductoActionPerformed

    private void btnRegistrarMatPrimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarMatPrimActionPerformed

       cConnection con = new cConnection();
        
        String codProdMatPrim;
        String NombreMatPrim;
        String PresentaMatPrim;
        String CantMatPrim;

       
        try{
              
            codProdMatPrim = txtCodigoIngrMatPrim.getText();
            NombreMatPrim = txtNombreIngrMatPrim.getText();
            PresentaMatPrim = txtCantidadIngrMatPrim.getText();
            CantMatPrim = txtPresentacionIngreMatPrim.getText();
            
            Statement st = null;
            st = con.ObtenerConexion().createStatement();
            st.executeUpdate("INSERT INTO InventarioMateriaPrima(CodProd,NombProd,Presentacion,Cantidad)" + "values("+codProdMatPrim+" , '"+NombreMatPrim+"' , '"+PresentaMatPrim+"', '"+CantMatPrim+"')");
            
            JOptionPane.showMessageDialog(null, "Se registró Producto Materia Prima...");
            txtCodigoIngrMatPrim.setText("");
            txtNombreIngrMatPrim.setText("");
            txtCantidadIngrMatPrim.setText("");
            txtPresentacionIngreMatPrim.setText("");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"No se Pudo Agregar","Mensaje",JOptionPane.CANCEL_OPTION);
            txtCodigoIngrMatPrim.setText("");
            txtNombreIngrMatPrim.setText("");
            txtCantidadIngrMatPrim.setText("");
            txtPresentacionIngreMatPrim.setText("");
        }
    }//GEN-LAST:event_btnRegistrarMatPrimActionPerformed

    private void btnSalirIngrMatPrimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirIngrMatPrimActionPerformed

        frmNuevaMatPrima.setVisible(false);
    }//GEN-LAST:event_btnSalirIngrMatPrimActionPerformed

    private void btnBuscarIngrInveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarIngrInveActionPerformed
        String nombProd= txtMatPrimBuscar.getText();
        
        cConnection con = new cConnection();       

        try
        {
            DefaultTableModel dtResultadoBuscar = new DefaultTableModel(); // Crea un Modelo de Tabla
            tblProdMatPrim.setModel(dtResultadoBuscar);  // Asigna el Model ode Tabla al tbProductoEncontrado
            
            dtResultadoBuscar.addColumn("Codigo");
            dtResultadoBuscar.addColumn("Producto");
            dtResultadoBuscar.addColumn("Presentacion");
            dtResultadoBuscar.addColumn("Cantidad");

            String query = "SELECT * FROM InventarioMateriaPrima WHERE NombProd LIKE '"+nombProd+"%'";
                        
            Statement st = con.ObtenerConexion().createStatement();
            ResultSet rs = st.executeQuery(query);

            while(rs.next())
            {
                dtResultadoBuscar.addRow(new Object[] {rs.getString("CodProd"),rs.getString("NombProd"),rs.getString("Presentacion"),rs.getString("Cantidad"),rs.getString("Proovedor")});
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"No existe el Producto","Mensaje",JOptionPane.CANCEL_OPTION);
        }
    }//GEN-LAST:event_btnBuscarIngrInveActionPerformed

    private void txtCodProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodProvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodProvActionPerformed

    private void btnListaProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaProveedoresActionPerformed
        frmListaProveedores.setVisible(true);
        frmListaProveedores.setLocationRelativeTo(null);

        cConnection con = new cConnection();
        String query = "SELECT Codigo, NombreEmpresa, Contacto FROM proveedor";

            try
            {
                
                DefaultTableModel dtMostrarProveedor = new DefaultTableModel();
                tblProveedores.setModel(dtMostrarProveedor);

                PreparedStatement pstm = con.ObtenerConexion().prepareStatement(query);
                ResultSet rs = pstm.executeQuery();         

                ResultSetMetaData metaData = rs.getMetaData();
                int Columnas = metaData.getColumnCount();
                
                for(int i = 1; i<= Columnas; i++)
                {
                    dtMostrarProveedor.addColumn(metaData.getColumnName(i));
                }
                while(rs.next()){            
                    Object[] row = new Object[Columnas];
                    for(int i = 1; i<= Columnas; i++)
                    {
                        row[i - 1] = rs.getObject(i);
                    }
                    dtMostrarProveedor.addRow(row);
                }
                rs.close();
             }
            catch(SQLException e)
            {
                JOptionPane.showMessageDialog(null,"No existe Proveedores. Puede Crear Nuevo.","Mensaje",JOptionPane.INFORMATION_MESSAGE);
            }
        
        
        
    }//GEN-LAST:event_btnListaProveedoresActionPerformed

    private void btnSalirProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirProvActionPerformed
        frmListaProveedores.setVisible(false);
    }//GEN-LAST:event_btnSalirProvActionPerformed

    private void btnAgregarSalMatPrimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarSalMatPrimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarSalMatPrimActionPerformed

    private void btnSalirListMatPrimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirListMatPrimActionPerformed
        frmListaMatPrimaGeren.setVisible(false);
    }//GEN-LAST:event_btnSalirListMatPrimActionPerformed

    private void btnListaProductosMateriaPrimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaProductosMateriaPrimaActionPerformed
        frmListaMatPrimaGeren.setVisible(true);
    }//GEN-LAST:event_btnListaProductosMateriaPrimaActionPerformed

    private void btnRegistrarSalidaProdTermActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarSalidaProdTermActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarSalidaProdTermActionPerformed

    private void btnCancelarP2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarP2ActionPerformed
        frmSalidaProdTerm.setVisible(false);
    }//GEN-LAST:event_btnCancelarP2ActionPerformed

    private void txtDocEmpreProdTermActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDocEmpreProdTermActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDocEmpreProdTermActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void txtCodigoProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoProdActionPerformed

    private void btnListaProdTermActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaProdTermActionPerformed
        frmListaProdTermGeren.setVisible(true);
    }//GEN-LAST:event_btnListaProdTermActionPerformed

    private void btnQuitarProductoTerm1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarProductoTerm1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnQuitarProductoTerm1ActionPerformed

    private void btnMostrarListaMatPrimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarListaMatPrimActionPerformed
        frmListaMatPrimaGeren.setVisible(true);
        
    }//GEN-LAST:event_btnMostrarListaMatPrimActionPerformed

    private void btnSalirProv2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirProv2ActionPerformed
        frmListaProdTermGeren.setVisible(false);
    }//GEN-LAST:event_btnSalirProv2ActionPerformed

    private void btnRegistrarNuevoProducto3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarNuevoProducto3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarNuevoProducto3ActionPerformed

    private void btnSalirP2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirP2ActionPerformed
        frmNuevoEmbalado.setVisible(true);
    }//GEN-LAST:event_btnSalirP2ActionPerformed

    private void btnRegistrarIngreEmbalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarIngreEmbalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarIngreEmbalActionPerformed

    private void btnCancelarP3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarP3ActionPerformed
        frmIngreInvenEmbalado.setVisible(false);
    }//GEN-LAST:event_btnCancelarP3ActionPerformed

    private void txtComproEmpresaIngreInveEmbalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtComproEmpresaIngreInveEmbalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtComproEmpresaIngreInveEmbalActionPerformed

    private void btnBuscarIngreEmbaladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarIngreEmbaladoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarIngreEmbaladoActionPerformed

    private void txtCodProdEmbaladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodProdEmbaladoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodProdEmbaladoActionPerformed

    private void btnAgregarNuevoProductoEmbaladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarNuevoProductoEmbaladoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarNuevoProductoEmbaladoActionPerformed

    private void txtCodProvInveEmbalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodProvInveEmbalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodProvInveEmbalActionPerformed

    private void btnListaProveedores1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaProveedores1ActionPerformed
        frmListaProveedores.setVisible(true);
    }//GEN-LAST:event_btnListaProveedores1ActionPerformed

    private void btnMostrarListaEmbaladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarListaEmbaladoActionPerformed
        frmNuevoEmbalado.setVisible(true);
    }//GEN-LAST:event_btnMostrarListaEmbaladoActionPerformed

    private void btnSalirProv3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirProv3ActionPerformed
        frmListaEmbaladoGeren.setVisible(true);
    }//GEN-LAST:event_btnSalirProv3ActionPerformed

    private void btnRegistrarSalidaMatPrim1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarSalidaMatPrim1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarSalidaMatPrim1ActionPerformed

    private void btnSalirP3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirP3ActionPerformed
        frmSalidaInvenEmbalado.setVisible(false);
    }//GEN-LAST:event_btnSalirP3ActionPerformed

    private void txtComproEmpreSalEmbalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtComproEmpreSalEmbalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtComproEmpreSalEmbalActionPerformed

    private void txtCodProductoEmbaladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodProductoEmbaladoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodProductoEmbaladoActionPerformed

    private void btnAgregarSalInveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarSalInveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarSalInveActionPerformed

    private void btnListaProductosMateriaPrima1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaProductosMateriaPrima1ActionPerformed
        frmListaEmbaladoGeren.setVisible(true);
    }//GEN-LAST:event_btnListaProductosMateriaPrima1ActionPerformed

    private void btnMostrarReporteMatPrimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarReporteMatPrimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMostrarReporteMatPrimActionPerformed

    private void btSalirReport2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalirReport2ActionPerformed
        frmReportMatPrim.setVisible(false);
    }//GEN-LAST:event_btSalirReport2ActionPerformed

    private void btnReportar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportar3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReportar3ActionPerformed

    private void btSalirReport3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalirReport3ActionPerformed
        frmReportProdTerm.setVisible(false);
    }//GEN-LAST:event_btSalirReport3ActionPerformed

    private void btnReportarAlmaEmbalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportarAlmaEmbalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReportarAlmaEmbalActionPerformed

    private void btSalirReport4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalirReport4ActionPerformed
        frmReportEmbal.setVisible(false);
    }//GEN-LAST:event_btSalirReport4ActionPerformed

    private void btSalirReport5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalirReport5ActionPerformed
        frmAlmacenMateriaPrima.setVisible(false);
    }//GEN-LAST:event_btSalirReport5ActionPerformed

    private void btSalirReport6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalirReport6ActionPerformed
        frmAlmacenProdTerm.setVisible(false);
    }//GEN-LAST:event_btSalirReport6ActionPerformed

    private void btSalirReport7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalirReport7ActionPerformed
        frmAlmacenEmbalado.setVisible(false);
    }//GEN-LAST:event_btSalirReport7ActionPerformed

    private void btnAlmacenMatPrimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlmacenMatPrimActionPerformed
        frmAlmacenMateriaPrima.setVisible(true);
    }//GEN-LAST:event_btnAlmacenMatPrimActionPerformed

    private void btnAlmacenProdTerminaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlmacenProdTerminaActionPerformed
        frmAlmacenProdTerm.setVisible(true);
    }//GEN-LAST:event_btnAlmacenProdTerminaActionPerformed

    private void btnAlmacenEmbalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlmacenEmbalActionPerformed
        frmAlmacenEmbalado.setVisible(true);
    }//GEN-LAST:event_btnAlmacenEmbalActionPerformed

    private void opInveMatPrimSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opInveMatPrimSalidaActionPerformed
        frmSalidaInvenMatPrim.setVisible(true);
    }//GEN-LAST:event_opInveMatPrimSalidaActionPerformed

    private void opInveEmbalSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opInveEmbalSalidaActionPerformed
        frmSalidaInvenEmbalado.setVisible(true);
    }//GEN-LAST:event_opInveEmbalSalidaActionPerformed

    private void opInveProdTermSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opInveProdTermSalidaActionPerformed
        frmSalidaProdTerm.setVisible(true);
    }//GEN-LAST:event_opInveProdTermSalidaActionPerformed

    private void txtPresentacionIngreMatPrimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPresentacionIngreMatPrimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPresentacionIngreMatPrimActionPerformed

    private void btnRegistrarNuevoProdTermActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarNuevoProdTermActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarNuevoProdTermActionPerformed

    private void btnSalirP4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirP4ActionPerformed
        frmNuevaProdTerm.setVisible(false);
    }//GEN-LAST:event_btnSalirP4ActionPerformed

    private void txtPresentacionProdTermActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPresentacionProdTermActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPresentacionProdTermActionPerformed

    private void txtPasswordUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordUActionPerformed

    private void txtCodigoUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoUActionPerformed

    private void lblUltimoUKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblUltimoUKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_lblUltimoUKeyTyped

    private void txtCodigoUKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoUKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoUKeyTyped

    private void txtCodigoUAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_txtCodigoUAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoUAncestorAdded

    private void btnSalirListMatPrim1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirListMatPrim1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalirListMatPrim1ActionPerformed

    private void btnEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEActionPerformed

    private void btnQuitarProductoTermActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarProductoTermActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnQuitarProductoTermActionPerformed

    private void btnListProdTermActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListProdTermActionPerformed
        frmListaProdTermGeren.setVisible(true);
    }//GEN-LAST:event_btnListProdTermActionPerformed

    private void btnAgregarNuevoProducto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarNuevoProducto1ActionPerformed
        frmNuevaProdTerm.setVisible(true);
    }//GEN-LAST:event_btnAgregarNuevoProducto1ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void btnBuscarIngreProdTermActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarIngreProdTermActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarIngreProdTermActionPerformed

    private void txtDocIngreInveProdTermActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDocIngreInveProdTermActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDocIngreInveProdTermActionPerformed

    private void btnCancelarP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarP1ActionPerformed
        frmIngreProdTerm.setVisible(false);
    }//GEN-LAST:event_btnCancelarP1ActionPerformed

    private void btnRegistrarIngreInvenProdTermActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarIngreInvenProdTermActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarIngreInvenProdTermActionPerformed

    private void btnSalirProv4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirProv4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalirProv4ActionPerformed

    private void btnSalirProv5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirProv5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalirProv5ActionPerformed

    private void btnQuitarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarProductoActionPerformed

        cConnection con = new cConnection();
        
        int SaldoActual = 0;
        int NuevoSaldo;
        String NuevoStock;
        
        int filaSeleccionada  = tblSalidaInveMatPrim.getSelectedRow();
        
        try{
            if (filaSeleccionada == -1) //para validar que se seleccione fila
                JOptionPane.showMessageDialog(null, "Debe Seleccionar Producto");
            else
                {   //Obtener Datos del Jtable Venta
                    String cod    = tblSalidaInveMatPrim.getValueAt(filaSeleccionada, 0).toString();
                    String nomb   = tblSalidaInveMatPrim.getValueAt(filaSeleccionada, 1).toString();
                    String Presentacion  = tblSalidaInveMatPrim.getValueAt(filaSeleccionada, 2).toString();
                    int cant = Integer.parseInt(tblSalidaInveMatPrim.getValueAt(filaSeleccionada, 3).toString());

                    //Remover fila del tblVenta
                    DefaultTableModel modelo = (DefaultTableModel) tblSalidaInveMatPrim.getModel();
                    modelo.removeRow(filaSeleccionada);
                }
            }
        catch(Exception e){

        }

    }//GEN-LAST:event_btnQuitarProductoActionPerformed

    private void btnAgregarProveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProveActionPerformed
        String codProv= txtCodProv.getText();
        
        cConnection con = new cConnection();       

        try
        {
            DefaultTableModel dtProveedorBuscar = new DefaultTableModel(); // Crea un Modelo de Tabla
            tblProveedor.setModel(dtProveedorBuscar);  // Asigna el Model ode Tabla al tbProductoEncontrado
            
            dtProveedorBuscar.addColumn("Codigo");
            dtProveedorBuscar.addColumn("Nombre de la Empresa");

            String query = "SELECT * FROM Proveedor WHERE Codigo LIKE '"+codProv+"%'";
                        
            Statement st = con.ObtenerConexion().createStatement();
            ResultSet rs = st.executeQuery(query);

            while(rs.next())
            {
                dtProveedorBuscar.addRow(new Object[] {rs.getString("Codigo"),rs.getString("NombreEmpresa")});
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"No existe el Producto","Mensaje",JOptionPane.CANCEL_OPTION);
        }
    }//GEN-LAST:event_btnAgregarProveActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void btnQuitarProducto2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarProducto2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnQuitarProducto2ActionPerformed

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
            java.util.logging.Logger.getLogger(FormVentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormVentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormVentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormVentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormVentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser FechaIngreInveMatPrim;
    private com.toedter.calendar.JDateChooser FechaIngreInvenProdTerm;
    private com.toedter.calendar.JDateChooser FechaReportInicialMatPrim;
    private com.toedter.calendar.JDateChooser FechaSalidaInvenEmbalado;
    private javax.swing.JScrollPane JScrollPane3;
    private javax.swing.JMenuBar MenuBarraPrincipal;
    private javax.swing.JMenu bmInicio;
    private javax.swing.JMenu bmInventario;
    private javax.swing.JMenu bmReportes;
    private javax.swing.JButton btSalirReport2;
    private javax.swing.JButton btSalirReport3;
    private javax.swing.JButton btSalirReport4;
    private javax.swing.JButton btSalirReport5;
    private javax.swing.JButton btSalirReport6;
    private javax.swing.JButton btSalirReport7;
    private javax.swing.JButton btnAgregarIngreInveProdTerm;
    private javax.swing.JButton btnAgregarMatPrim;
    private javax.swing.JToggleButton btnAgregarNuevoProducto;
    private javax.swing.JToggleButton btnAgregarNuevoProducto1;
    private javax.swing.JToggleButton btnAgregarNuevoProductoEmbalado;
    private javax.swing.JButton btnAgregarProve;
    private javax.swing.JButton btnAgregarSalInve;
    private javax.swing.JButton btnAgregarSalMatPrim;
    private javax.swing.JButton btnAgregarSalProdTerm;
    private javax.swing.JButton btnAlmacenEmbal;
    private javax.swing.JButton btnAlmacenMatPrim;
    private javax.swing.JButton btnAlmacenProdTermina;
    private javax.swing.JButton btnBuscarIngrInve;
    private javax.swing.JButton btnBuscarIngreEmbalado;
    private javax.swing.JButton btnBuscarIngreProdTerm;
    private javax.swing.JButton btnBuscarMatPrim;
    private javax.swing.JButton btnBuscarProd1;
    private javax.swing.JButton btnBuscarUser;
    private javax.swing.JButton btnCancelarMatPrim;
    private javax.swing.JButton btnCancelarP1;
    private javax.swing.JButton btnCancelarP2;
    private javax.swing.JButton btnCancelarP3;
    private javax.swing.JButton btnE;
    private javax.swing.JButton btnEditarProv;
    private javax.swing.JButton btnEliminarProdEmbal;
    private javax.swing.JButton btnEliminarProdTerm;
    private javax.swing.JButton btnListProdTerm;
    private javax.swing.JButton btnListaProdTerm;
    private javax.swing.JButton btnListaProductosMateriaPrima;
    private javax.swing.JButton btnListaProductosMateriaPrima1;
    private javax.swing.JToggleButton btnListaProveedores;
    private javax.swing.JToggleButton btnListaProveedores1;
    private javax.swing.JButton btnMostrarListaEmbalado;
    private javax.swing.JButton btnMostrarListaMatPrim;
    private javax.swing.JButton btnMostrarReporteMatPrim;
    private javax.swing.JButton btnQuitarProducto;
    private javax.swing.JButton btnQuitarProducto1;
    private javax.swing.JButton btnQuitarProducto2;
    private javax.swing.JButton btnQuitarProductoTerm;
    private javax.swing.JButton btnQuitarProductoTerm1;
    private javax.swing.JButton btnRegistrarIngreEmbal;
    private javax.swing.JButton btnRegistrarIngreInvenProdTerm;
    private javax.swing.JButton btnRegistrarMatPrim;
    private javax.swing.JButton btnRegistrarNuevoProdTerm;
    private javax.swing.JButton btnRegistrarNuevoProducto;
    private javax.swing.JButton btnRegistrarNuevoProducto3;
    private javax.swing.JButton btnRegistrarNuevoUsuario;
    private javax.swing.JButton btnRegistrarSalidaMatPrim;
    private javax.swing.JButton btnRegistrarSalidaMatPrim1;
    private javax.swing.JButton btnRegistrarSalidaProdTerm;
    private javax.swing.JButton btnReportar3;
    private javax.swing.JButton btnReportarAlmaEmbal;
    private javax.swing.JButton btnSalirBuscarU;
    private javax.swing.JButton btnSalirIngrMatPrim;
    private javax.swing.JButton btnSalirListMatPrim;
    private javax.swing.JButton btnSalirListMatPrim1;
    private javax.swing.JButton btnSalirP1;
    private javax.swing.JButton btnSalirP2;
    private javax.swing.JButton btnSalirP3;
    private javax.swing.JButton btnSalirP4;
    private javax.swing.JButton btnSalirProv;
    private javax.swing.JButton btnSalirProv2;
    private javax.swing.JButton btnSalirProv3;
    private javax.swing.JButton btnSalirProv4;
    private javax.swing.JButton btnSalirProv5;
    private javax.swing.JButton btnSalirU;
    private com.toedter.calendar.JDateChooser dateChFechaFinAlmaEmbal;
    private com.toedter.calendar.JDateChooser dateChFechaFinProdTerm;
    private com.toedter.calendar.JDateChooser dateChFechaIniReporAlmaEmbal;
    private com.toedter.calendar.JDateChooser dateChFechaInicioProdTerm;
    private com.toedter.calendar.JDateChooser fechaReportFinalMatPrim;
    private com.toedter.calendar.JDateChooser fechaSalidaInventarioMatPrim;
    private javax.swing.JFrame frmAlmacenEmbalado;
    private javax.swing.JFrame frmAlmacenMateriaPrima;
    private javax.swing.JFrame frmAlmacenProdTerm;
    private javax.swing.JFrame frmBuscarUsuario;
    private javax.swing.JFrame frmIngreInvenEmbalado;
    private javax.swing.JFrame frmIngreInvenMatPrim;
    private javax.swing.JFrame frmIngreProdTerm;
    private javax.swing.JFrame frmListaEmbaladoGeren;
    private javax.swing.JFrame frmListaEmbaladoPublic;
    private javax.swing.JFrame frmListaMatPrimaGeren;
    private javax.swing.JFrame frmListaMatPrimaPublic;
    private javax.swing.JFrame frmListaProdTermGeren;
    private javax.swing.JFrame frmListaProdTermPublic;
    private javax.swing.JFrame frmListaProveedores;
    private javax.swing.JFrame frmNuevaMatPrima;
    private javax.swing.JFrame frmNuevaProdTerm;
    private javax.swing.JFrame frmNuevoEmbalado;
    private javax.swing.JFrame frmNuevoUser;
    private javax.swing.JFrame frmReportEmbal;
    private javax.swing.JFrame frmReportMatPrim;
    private javax.swing.JFrame frmReportProdTerm;
    private javax.swing.JFrame frmSalidaInvenEmbalado;
    private javax.swing.JFrame frmSalidaInvenMatPrim;
    private javax.swing.JFrame frmSalidaProdTerm;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton6;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JScrollPane jScrollPane25;
    private javax.swing.JScrollPane jScrollPane26;
    private javax.swing.JScrollPane jScrollPane27;
    private javax.swing.JScrollPane jScrollPane28;
    private javax.swing.JScrollPane jScrollPane29;
    private javax.swing.JScrollPane jScrollPane30;
    private javax.swing.JScrollPane jScrollPane31;
    private javax.swing.JScrollPane jScrollPane32;
    private javax.swing.JScrollPane jScrollPane33;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable17;
    private javax.swing.JTable jTable7;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JLabel lblCodigoP;
    private javax.swing.JLabel lblCodigoP1;
    private javax.swing.JLabel lblCodigoP2;
    private javax.swing.JLabel lblCodigoU;
    private javax.swing.JLabel lblNombreP;
    private javax.swing.JLabel lblNombreP1;
    private javax.swing.JLabel lblNombreP2;
    private javax.swing.JLabel lblNombreU;
    private javax.swing.JLabel lblNombreUserBuscar;
    private javax.swing.JLabel lblPaswordU;
    private javax.swing.JLabel lblReportar2;
    private javax.swing.JLabel lblReportar3;
    private javax.swing.JLabel lblReportar4;
    private javax.swing.JLabel lblReportar5;
    private javax.swing.JLabel lblReportar6;
    private javax.swing.JLabel lblReportar7;
    private javax.swing.JLabel lblSaldo;
    private javax.swing.JLabel lblSaldo1;
    private javax.swing.JLabel lblSaldo2;
    private javax.swing.JLabel lblUltimoCodMatPrim;
    private javax.swing.JLabel lblUltimoP;
    private javax.swing.JLabel lblUltimoP1;
    private javax.swing.JLabel lblUltimoP3;
    private javax.swing.JLabel lblUltimoP4;
    private javax.swing.JLabel lblUltimoP5;
    private javax.swing.JLabel lblUltimoP6;
    private javax.swing.JLabel lblUltimoP7;
    private javax.swing.JLabel lblUltimoP8;
    private javax.swing.JLabel lblUltimoU;
    private javax.swing.JMenuItem opBuscarUser;
    private javax.swing.JMenuItem opInveEmbalIngreso;
    private javax.swing.JMenuItem opInveEmbalSalida;
    private javax.swing.JMenuItem opInveMatPrimIngreso;
    private javax.swing.JMenuItem opInveMatPrimSalida;
    private javax.swing.JMenuItem opInveProdTermIngreso;
    private javax.swing.JMenuItem opInveProdTermSalida;
    private javax.swing.JMenuItem opNuevoUser;
    private javax.swing.JMenuItem opReportEmbal;
    private javax.swing.JMenuItem opReportMatPrim;
    private javax.swing.JMenuItem opReportProdTermi;
    private javax.swing.JMenuItem opSalir;
    private javax.swing.JTable tblAlmacenEmbal;
    private javax.swing.JTable tblEleccionSalidaProdTerm;
    private javax.swing.JTable tblIngreInveEmbal;
    private javax.swing.JTable tblIngreInveProdTerm;
    private javax.swing.JTable tblIngreProdTermEleccion;
    private javax.swing.JTable tblListMatPrima;
    private javax.swing.JTable tblListProdTerm;
    private javax.swing.JTable tblListProdTerm1;
    private javax.swing.JTable tblMateriaPrima;
    private javax.swing.JTable tblProdEmbal;
    private javax.swing.JTable tblProdEmbal1;
    private javax.swing.JTable tblProdMatPrim;
    private javax.swing.JTable tblProdMatPrimRegis;
    private javax.swing.JTable tblProdTerminado;
    private javax.swing.JTable tblProductosSalInveMatPrim;
    private javax.swing.JTable tblProvIngreEmbal;
    private javax.swing.JTable tblProveedor;
    private javax.swing.JTable tblProveedores;
    private javax.swing.JTable tblReporteAlmacenEmbalado;
    private javax.swing.JTable tblResultadoReporte3;
    private javax.swing.JTable tblResultadoReporteMatPrim;
    private javax.swing.JTable tblResultadoUsuario;
    private javax.swing.JTable tblSalidaInveMatPrim;
    private javax.swing.JTable tblSalidaInventarioEmbal;
    private javax.swing.JTable tblSalidaProdTerm;
    private javax.swing.JTextField txtAgregarMatPrim;
    private javax.swing.JButton txtAgregarProv;
    private javax.swing.JTextField txtCantEmbal;
    private javax.swing.JTextField txtCantIngreInveEmbal;
    private javax.swing.JTextField txtCantSalInveEmbal;
    private javax.swing.JTextField txtCantSalProdTerm;
    private javax.swing.JTextField txtCantidadIngrMatPrim;
    private javax.swing.JTextField txtCantidadProdTerm;
    private javax.swing.JTextField txtCantidadSalida;
    private javax.swing.JTextField txtCodProdEmbalado;
    private javax.swing.JTextField txtCodProducto;
    private javax.swing.JTextField txtCodProductoEmbalado;
    private javax.swing.JTextField txtCodProv;
    private javax.swing.JTextField txtCodProvInveEmbal;
    private javax.swing.JTextField txtCodigoEmbal;
    private javax.swing.JTextField txtCodigoIngrMatPrim;
    private javax.swing.JTextField txtCodigoProd;
    private javax.swing.JTextField txtCodigoProdTerm;
    private javax.swing.JTextField txtCodigoU;
    private javax.swing.JTextField txtComproEmpreSalEmbal;
    private javax.swing.JTextField txtComproEmpresaIngreInveEmbal;
    private javax.swing.JTextField txtComprobanteEmpreIMatPrim;
    private javax.swing.JTextField txtDocEmpreProdTerm;
    private javax.swing.JTextField txtDocIngreInveProdTerm;
    private com.toedter.calendar.JDateChooser txtFechaIngreEmbal;
    private com.toedter.calendar.JDateChooser txtFechaSalProdTerm;
    private javax.swing.JTextField txtGuiaRemision;
    private javax.swing.JTextField txtMatPrimBuscar;
    private javax.swing.JTextField txtNombUserBuscar;
    private javax.swing.JTextField txtNombreEmbal;
    private javax.swing.JTextField txtNombreIngrMatPrim;
    private javax.swing.JTextField txtNombreProdTerm;
    private javax.swing.JTextField txtNombreU;
    private javax.swing.JTextField txtPasswordU;
    private javax.swing.JTextField txtPresentacionEmbal;
    private javax.swing.JTextField txtPresentacionIngreMatPrim;
    private javax.swing.JTextField txtPresentacionProdTerm;
    private javax.swing.JTextField txtResponsableSalMatPrim;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
