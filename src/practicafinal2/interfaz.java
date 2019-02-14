package practicafinal2;

import java.awt.Color;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xp
 */
public class interfaz extends javax.swing.JFrame {
    
    
    /**
     * Creates new form interfaz
     */
    public interfaz() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.white);
         try {
            gc.conect.setAutoCommit(false);

            Statement sta = gc.conect.createStatement();

            String query = "SELECT * FROM cliente ";

            ResultSet rs = sta.executeQuery(query);
            ResultSetMetaData metaDatos = rs.getMetaData();

            int numColumnas = metaDatos.getColumnCount();

            DefaultTableModel modelo = new DefaultTableModel();      

            this.jTable2.setModel(modelo);

            for (int i = 1; i <= numColumnas; i++) {
                modelo.addColumn(metaDatos.getColumnLabel(i));
            }

            while (rs.next()) {
                Object[] fila = new Object[numColumnas];

                for (int i = 0; i < numColumnas; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                modelo.addRow(fila);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
      
        
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TITULO = new javax.swing.JLabel();
        nombre_cliente = new javax.swing.JTextField();
        apellido_cliente = new javax.swing.JTextField();
        Dni_cliente = new javax.swing.JTextField();
        telefono_cliente = new javax.swing.JTextField();
        direecion_cliente = new javax.swing.JTextField();
        sexo_cliente = new javax.swing.JTextField();
        nombre_empleado = new javax.swing.JTextField();
        apellido_empleado = new javax.swing.JTextField();
        Dni_empleado = new javax.swing.JTextField();
        telefono_empleado = new javax.swing.JTextField();
        direccion_empleado = new javax.swing.JTextField();
        puesto_empleado = new javax.swing.JTextField();
        alta3 = new javax.swing.JLabel();
        alta4 = new javax.swing.JLabel();
        dni1_eliminado = new javax.swing.JTextField();
        dni2_eliminado = new javax.swing.JTextField();
        Eliminar1 = new javax.swing.JButton();
        Eliminar2 = new javax.swing.JButton();
        consulta_cliente = new javax.swing.JButton();
        consulta_empleado = new javax.swing.JButton();
        consulta_tiendas = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        alta_cliente = new javax.swing.JButton();
        alta_empleado = new javax.swing.JButton();
        tienda_cliente = new javax.swing.JTextField();
        tienda_empleado = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TITULO.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        TITULO.setForeground(new java.awt.Color(153, 0, 0));
        TITULO.setText("TIENDA DE ROPA");

        nombre_cliente.setText("Nombre");
        nombre_cliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nombre_clienteMouseClicked(evt);
            }
        });

        apellido_cliente.setText("Apellidos");
        apellido_cliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                apellido_clienteMouseClicked(evt);
            }
        });

        Dni_cliente.setText("DNI");
        Dni_cliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Dni_clienteMouseClicked(evt);
            }
        });

        telefono_cliente.setText("Telefono");
        telefono_cliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                telefono_clienteMouseClicked(evt);
            }
        });

        direecion_cliente.setText("Direccion");
        direecion_cliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                direecion_clienteMouseClicked(evt);
            }
        });

        sexo_cliente.setText("Sexo");
        sexo_cliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sexo_clienteMouseClicked(evt);
            }
        });

        nombre_empleado.setText("Nombre");
        nombre_empleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nombre_empleadoMouseClicked(evt);
            }
        });

        apellido_empleado.setText("Apellidos");
        apellido_empleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                apellido_empleadoMouseClicked(evt);
            }
        });

        Dni_empleado.setText("DNI");
        Dni_empleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Dni_empleadoMouseClicked(evt);
            }
        });

        telefono_empleado.setText("Telefono");
        telefono_empleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                telefono_empleadoMouseClicked(evt);
            }
        });

        direccion_empleado.setText("Direccion");
        direccion_empleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                direccion_empleadoMouseClicked(evt);
            }
        });

        puesto_empleado.setText("Puesto");
        puesto_empleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                puesto_empleadoMouseClicked(evt);
            }
        });

        alta3.setForeground(new java.awt.Color(153, 0, 0));
        alta3.setText("ELIMINAR CLIENTE:");

        alta4.setForeground(new java.awt.Color(153, 0, 0));
        alta4.setText("ELIMINAR EMPLEADO:");

        dni1_eliminado.setText("DNI");
        dni1_eliminado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dni1_eliminadoMouseClicked(evt);
            }
        });

        dni2_eliminado.setText("DNI");
        dni2_eliminado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dni2_eliminadoMouseClicked(evt);
            }
        });

        Eliminar1.setText("ELIMINAR");
        Eliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Eliminar1ActionPerformed(evt);
            }
        });

        Eliminar2.setText("ELIMINAR");
        Eliminar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Eliminar2ActionPerformed(evt);
            }
        });

        consulta_cliente.setText("CONSULTAR CLIENTES");
        consulta_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consulta_clienteActionPerformed(evt);
            }
        });

        consulta_empleado.setText("CONSULTAR EMPLEADOS");
        consulta_empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consulta_empleadoActionPerformed(evt);
            }
        });

        consulta_tiendas.setText("CONSULTAR TIENDAS");
        consulta_tiendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consulta_tiendasActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
            }
        ));
        jScrollPane1.setViewportView(jTable2);

        alta_cliente.setText("DAR DE ALTA CLIENTE");
        alta_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alta_clienteActionPerformed(evt);
            }
        });

        alta_empleado.setText("DAR DE ALTA EMPLEADO");
        alta_empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alta_empleadoActionPerformed(evt);
            }
        });

        tienda_cliente.setText("Numero Tienda");
        tienda_cliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tienda_clienteMouseClicked(evt);
            }
        });

        tienda_empleado.setText("Numero Tienda");
        tienda_empleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tienda_empleadoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombre_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombre_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(apellido_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(apellido_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tienda_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Dni_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Dni_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(telefono_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(telefono_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(direecion_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(direccion_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sexo_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(puesto_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(alta_cliente)
                            .addComponent(alta_empleado)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(301, 301, 301)
                        .addComponent(consulta_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(consulta_tiendas, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addComponent(TITULO, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(consulta_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(alta3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(dni1_eliminado, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                                    .addComponent(tienda_cliente))))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(Eliminar1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(alta4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dni2_eliminado, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Eliminar2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 773, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TITULO, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apellido_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Dni_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefono_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(direecion_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sexo_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alta_cliente)
                    .addComponent(tienda_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apellido_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Dni_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefono_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(direccion_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(puesto_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alta_empleado)
                    .addComponent(tienda_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alta3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dni1_eliminado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Eliminar1)
                    .addComponent(alta4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dni2_eliminado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Eliminar2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(consulta_cliente)
                    .addComponent(consulta_empleado)
                    .addComponent(consulta_tiendas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombre_clienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombre_clienteMouseClicked
        nombre_cliente.setText("");
    }//GEN-LAST:event_nombre_clienteMouseClicked

    private void apellido_clienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_apellido_clienteMouseClicked
        apellido_cliente.setText("");
    }//GEN-LAST:event_apellido_clienteMouseClicked

    private void Dni_clienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Dni_clienteMouseClicked
        Dni_cliente.setText("");
    }//GEN-LAST:event_Dni_clienteMouseClicked

    private void telefono_clienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_telefono_clienteMouseClicked
       telefono_cliente.setText("");
    }//GEN-LAST:event_telefono_clienteMouseClicked

    private void direecion_clienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_direecion_clienteMouseClicked
        direecion_cliente.setText("");
    }//GEN-LAST:event_direecion_clienteMouseClicked

    private void sexo_clienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sexo_clienteMouseClicked
        sexo_cliente.setText("");
    }//GEN-LAST:event_sexo_clienteMouseClicked

    private void nombre_empleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombre_empleadoMouseClicked
        nombre_empleado.setText("");
    }//GEN-LAST:event_nombre_empleadoMouseClicked

    private void apellido_empleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_apellido_empleadoMouseClicked
        apellido_empleado.setText("");
    }//GEN-LAST:event_apellido_empleadoMouseClicked

    private void Dni_empleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Dni_empleadoMouseClicked
       Dni_empleado.setText("");
    }//GEN-LAST:event_Dni_empleadoMouseClicked

    private void telefono_empleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_telefono_empleadoMouseClicked
        telefono_empleado.setText("");
    }//GEN-LAST:event_telefono_empleadoMouseClicked

    private void direccion_empleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_direccion_empleadoMouseClicked
        direccion_empleado.setText("");
    }//GEN-LAST:event_direccion_empleadoMouseClicked

    private void puesto_empleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_puesto_empleadoMouseClicked
       puesto_empleado.setText("");
    }//GEN-LAST:event_puesto_empleadoMouseClicked

    private void dni1_eliminadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dni1_eliminadoMouseClicked
        dni1_eliminado.setText("");
    }//GEN-LAST:event_dni1_eliminadoMouseClicked

    private void dni2_eliminadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dni2_eliminadoMouseClicked
        dni2_eliminado.setText("");
    }//GEN-LAST:event_dni2_eliminadoMouseClicked

    private void consulta_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consulta_clienteActionPerformed
       try {
            gc.conect.setAutoCommit(false);

            Statement sta = gc.conect.createStatement();

            String query = "SELECT * FROM cliente ";

            ResultSet rs = sta.executeQuery(query);
            ResultSetMetaData metaDatos = rs.getMetaData();

            int numColumnas = metaDatos.getColumnCount();

            DefaultTableModel modelo = new DefaultTableModel();

            this.jTable2.setModel(modelo);

            for (int i = 1; i <= numColumnas; i++) {
                modelo.addColumn(metaDatos.getColumnLabel(i));
            }

            while (rs.next()) {
                Object[] fila = new Object[numColumnas];

                for (int i = 0; i < numColumnas; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                modelo.addRow(fila);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
    }//GEN-LAST:event_consulta_clienteActionPerformed

    private void consulta_empleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consulta_empleadoActionPerformed
        try {
            gc.conect.setAutoCommit(false);

            Statement sta = gc.conect.createStatement();

            String query = "SELECT * FROM empleado ";

            ResultSet rs = sta.executeQuery(query);
            ResultSetMetaData metaDatos = rs.getMetaData();

            int numColumnas = metaDatos.getColumnCount();

            DefaultTableModel modelo = new DefaultTableModel();

            this.jTable2.setModel(modelo);

            for (int i = 1; i <= numColumnas; i++) {
                modelo.addColumn(metaDatos.getColumnLabel(i));
            }

            while (rs.next()) {
                Object[] fila = new Object[numColumnas];

                for (int i = 0; i < numColumnas; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                modelo.addRow(fila);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_consulta_empleadoActionPerformed

    private void consulta_tiendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consulta_tiendasActionPerformed
        try {
            gc.conect.setAutoCommit(false);

            Statement sta = gc.conect.createStatement();

            String query = "SELECT * FROM tienda ";

            ResultSet rs = sta.executeQuery(query);
            ResultSetMetaData metaDatos = rs.getMetaData();

            int numColumnas = metaDatos.getColumnCount();

            DefaultTableModel modelo = new DefaultTableModel();

            this.jTable2.setModel(modelo);

            for (int i = 1; i <= numColumnas; i++) {
                modelo.addColumn(metaDatos.getColumnLabel(i));
            }

            while (rs.next()) {
                Object[] fila = new Object[numColumnas];

                for (int i = 0; i < numColumnas; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                modelo.addRow(fila);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
               
    }//GEN-LAST:event_consulta_tiendasActionPerformed

    private void Eliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Eliminar1ActionPerformed
        gc.eliminarCliente(dni1_eliminado.getText());
    }//GEN-LAST:event_Eliminar1ActionPerformed

    private void Eliminar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Eliminar2ActionPerformed
        gc.eliminarEmpleado(dni2_eliminado.getText());
    }//GEN-LAST:event_Eliminar2ActionPerformed

    private void alta_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alta_clienteActionPerformed
        gc.insertarClienteNuevo(tienda_cliente.getText(),nombre_cliente.getText(), apellido_cliente.getText(), Dni_cliente.getText(), telefono_cliente.getText(), direecion_cliente.getText(), sexo_cliente.getText());
    }//GEN-LAST:event_alta_clienteActionPerformed

    private void alta_empleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alta_empleadoActionPerformed
        gc.insertarEmpleadoNuevo(tienda_empleado.getText(),nombre_empleado.getText(), apellido_empleado.getText(), Dni_empleado.getText(), telefono_empleado.getText(), direccion_empleado.getText(), puesto_empleado.getText());
    }//GEN-LAST:event_alta_empleadoActionPerformed

    private void tienda_clienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tienda_clienteMouseClicked
        tienda_cliente.setText("");
    }//GEN-LAST:event_tienda_clienteMouseClicked

    private void tienda_empleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tienda_empleadoMouseClicked
        tienda_empleado.setText("");
    }//GEN-LAST:event_tienda_empleadoMouseClicked
    Conexion gc = new Conexion();
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
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Dni_cliente;
    private javax.swing.JTextField Dni_empleado;
    private javax.swing.JButton Eliminar1;
    private javax.swing.JButton Eliminar2;
    private javax.swing.JLabel TITULO;
    private javax.swing.JLabel alta3;
    private javax.swing.JLabel alta4;
    private javax.swing.JButton alta_cliente;
    private javax.swing.JButton alta_empleado;
    private javax.swing.JTextField apellido_cliente;
    private javax.swing.JTextField apellido_empleado;
    private javax.swing.JButton consulta_cliente;
    private javax.swing.JButton consulta_empleado;
    private javax.swing.JButton consulta_tiendas;
    private javax.swing.JTextField direccion_empleado;
    private javax.swing.JTextField direecion_cliente;
    private javax.swing.JTextField dni1_eliminado;
    private javax.swing.JTextField dni2_eliminado;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField nombre_cliente;
    private javax.swing.JTextField nombre_empleado;
    private javax.swing.JTextField puesto_empleado;
    private javax.swing.JTextField sexo_cliente;
    private javax.swing.JTextField telefono_cliente;
    private javax.swing.JTextField telefono_empleado;
    private javax.swing.JTextField tienda_cliente;
    private javax.swing.JTextField tienda_empleado;
    // End of variables declaration//GEN-END:variables
}
