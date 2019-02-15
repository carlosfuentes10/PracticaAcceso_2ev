/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicafinal2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author xp
 */
public class Conexion {

    /**
     * @param args the command line arguments
     */
    Connection conect;
    String cadena_resultado ="";
    
    public Conexion() {
        conect = null;
        
        try{
            String url1 = "jdbc:mysql://localhost:3306/tienda_ropa?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
            String user = "root";
            String password = "root";
            conect = DriverManager.getConnection(url1, user, password);

            if (conect != null) {
                System.out.println("Conectado a base de datos");
            }

        } catch (SQLException ex) {
            System.out.println("ERROR");
            ex.printStackTrace();
        }
      }
   
         public void cerrar_conexion() {
        try {
            conect.close();
            System.out.println("Conexion cerrada");

        } catch (SQLException ex) {
            System.err.println("Error al cerrar conexion");
            ex.printStackTrace();
        }
    }
         public String consultaClienteStatement() {
        String fallo = "error";

        try {
            conect.setAutoCommit(false);

            Statement sta = conect.createStatement();
            String query = "SELECT * FROM cliente ";
            ResultSet rs = sta.executeQuery(query);
            ResultSetMetaData metaDatos = rs.getMetaData();

            int numColumnas = metaDatos.getColumnCount();

            return cadena_resultado;

        } catch (Exception e) {
            System.out.println("Error");
            try {
                if (conect != null) {
                    conect.rollback();
                }
            } catch (Exception se2) {
                se2.printStackTrace();
            }
            e.printStackTrace();
            return fallo;
        }
    }
     public String consultaEmpleadoStatement() {
        String fallo = "error";

        try {
            conect.setAutoCommit(false);

            Statement sta = conect.createStatement();
            String query = "SELECT * FROM empleado ";
            ResultSet rs = sta.executeQuery(query);
            ResultSetMetaData metaDatos = rs.getMetaData();

            int numColumnas = metaDatos.getColumnCount();

            return cadena_resultado;

        } catch (Exception e) {
            System.out.println("Error");
            try {
                if (conect != null) {
                    conect.rollback();
                }
            } catch (Exception se2) {
                se2.printStackTrace();
            }
            e.printStackTrace();
            return fallo;
        }
    }
     public String consultaTiendaStatement() {
        String fallo = "error";

        try {
            conect.setAutoCommit(false);

            Statement sta = conect.createStatement();
            String query = "SELECT * FROM tienda ";
            ResultSet rs = sta.executeQuery(query);
            ResultSetMetaData metaDatos = rs.getMetaData();

            int numColumnas = metaDatos.getColumnCount();

            return cadena_resultado;

        } catch (Exception e) {
            System.out.println("Error");
            try {
                if (conect != null) {
                    conect.rollback();
                }
            } catch (Exception se2) {
                se2.printStackTrace();
            }
            e.printStackTrace();
            return fallo;
        }
    }

    public void insertarClienteNuevo( String ID_tienda, String nombre, String apellido, String DNI, String telefono, String direccion, String sexo) {
        try {
            conect.setAutoCommit(false);

            Statement sta = conect.createStatement();

            sta.executeUpdate("INSERT INTO cliente VALUES('" + ID_tienda + "', '" + DNI + "', '" + nombre + "', '" + apellido + "', '" + telefono + "','" + direccion + "', '" + sexo + "')");

            System.out.println("insertado cliente correctamente");

            sta.close();

            conect.commit();
        } catch (Exception e) {
            System.out.println("Error");

            try {
                if (conect != null) {
                    conect.rollback();
                }
            } catch (Exception se2) {
                se2.printStackTrace();
                cadena_resultado = se2.toString();
            }
            e.printStackTrace();
            cadena_resultado = e.toString();
        }
    }

    public void insertarEmpleadoNuevo (String ID_tienda,String nombre, String apellido, String DNI, String telefono, String direccion, String puesto) {
        try {
            conect.setAutoCommit(false);

            Statement sta = conect.createStatement();

            sta.executeUpdate("INSERT INTO empleado VALUES('" + ID_tienda + "', '" + DNI + "', '" + nombre + "', '" + apellido + "', '" + direccion + "', '" + telefono + "', '" + puesto + "')");

            System.out.println("insertado empleado correctamente");

            sta.close();

            conect.commit();
        } catch (Exception e) {
            System.out.println("Error");

            try {
                if (conect != null) {
                    conect.rollback();
                }
            } catch (Exception se2) {
                se2.printStackTrace();
                cadena_resultado = se2.toString();
            }

            e.printStackTrace();
            cadena_resultado = e.toString();
        }
    }
    
    
    
     public void eliminarCliente(String dni1_eliminado) {
        try {
            conect.setAutoCommit(false);

            Statement sta = conect.createStatement();
            sta.executeUpdate("DELETE FROM cliente WHERE DNI_cliente LIKE '" + dni1_eliminado +"'");
            sta.close();

            conect.commit();
        } catch (Exception e) {
            System.out.println("Error");

            try {
                if (conect != null) {
                    conect.rollback();
                }
            } catch (Exception se2) {
                se2.printStackTrace();
                cadena_resultado = se2.toString();
            }

            e.printStackTrace();
            cadena_resultado = e.toString();
        }
    }
    
    public void eliminarEmpleado(String dni2_eliminado) {
        try {
            conect.setAutoCommit(false);

            Statement sta = conect.createStatement();
            sta.executeUpdate("DELETE FROM empleado WHERE DNI_empleado LIKE '" + dni2_eliminado +"'");
            sta.close();

            conect.commit();
        } catch (Exception e) {
            System.out.println("Error");

            try {
                if (conect != null) {
                    conect.rollback();
                }
            } catch (Exception se2) {
                se2.printStackTrace();
                cadena_resultado = se2.toString();
            }

            e.printStackTrace();
            cadena_resultado = e.toString();
        }
    }
    
    
     public void modificarEmpleadoNuevo (String ID_tienda,String nombre, String apellido, String DNI_cliente, String telefono, String direccion, String puesto) {
        try {
            conect.setAutoCommit(false);

            Statement sta = conect.createStatement();

           
            String query = "UPDATE  empleado SET  ID_tienda='" + ID_tienda + "', nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono + ", direccion=" + direccion + ", puesto=" + puesto + " WHERE DNI_cliente='" + DNI_cliente+ "';";

            System.out.println("modificado empleado correctamente");

            sta.close();

            conect.commit();
        } catch (Exception e) {
            System.out.println("Error");

            try {
                if (conect != null) {
                    conect.rollback();
                }
            } catch (Exception se2) {
                se2.printStackTrace();
                cadena_resultado = se2.toString();
            }

            e.printStackTrace();
            cadena_resultado = e.toString();
        }
    }
     public void modificarClientedoNuevo (String ID_tienda,String nombre, String apellido, String DNI, String telefono, String direccion, String sexo) {
        try {
            conect.setAutoCommit(false);

            Statement sta = conect.createStatement();

            sta.executeUpdate("UPDATE cliente SET DNI_cliente('" + ID_tienda + "', '" + DNI + "', '" + nombre + "', '" + apellido + "', '" + direccion + "', '" + telefono + "', '" + sexo + "')");

            System.out.println("modificado cliente correctamente");

            sta.close();

            conect.commit();
        } catch (Exception e) {
            System.out.println("Error");

            try {
                if (conect != null) {
                    conect.rollback();
                }
            } catch (Exception se2) {
                se2.printStackTrace();
                cadena_resultado = se2.toString();
            }

            e.printStackTrace();
            cadena_resultado = e.toString();
        }
    }
}
    
    

