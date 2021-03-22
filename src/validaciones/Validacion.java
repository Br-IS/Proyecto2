/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validaciones;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Boris
 */
public class Validacion {

    public static boolean ValidarCedula(String cedula) {
        int c, suma = 0, resta = 0;
        for (int i = 0; i < cedula.length() - 1; i++) {
            c = Integer.parseInt(cedula.charAt(i) + "");
            if (i % 2 == 0) {
                c = c * 2;
                if (c > 9) {
                    c = c - 9;
                }
            }
            suma = suma + c;
        }
        if (suma % 10 != 0) {
            int acum = ((suma / 10) + 1) * 10;
            resta = acum - suma;
        }
        int ultimo = Integer.parseInt(cedula.charAt(9) + "");
        return ultimo == resta;
    }

    public static void MostrarOpciones(String cadena) {
        JOptionPane.showMessageDialog(null, cadena);
    }

    public static String RecibirCadenas(String cadena) {
        return JOptionPane.showInputDialog(null, cadena);
    }

    public static double RecibirDobles(String cadena) {
        return Double.parseDouble(cadena);
    }

    public static int RecibirEnteros(String cadena) {
        return Integer.parseInt(cadena);
    }

    public static boolean RecibirPregunta(String cadena) {
        return Boolean.parseBoolean(JOptionPane.showInputDialog(cadena));
    }

    public static boolean ValidarCelular(String numero) {
        return numero.charAt(0) == '0' && numero.charAt(1) == '9' && numero.length() == 10 && numero.matches("\\d+");
    }

    public static boolean ValidarTelefono(String telefono) {
        return telefono.charAt(0) == '0' && telefono.charAt(1) == '7' && telefono.length() == 10 && telefono.matches("\\d+");
    }

    public static boolean ValidaNombre(String nombre) {
        return nombre.matches("[a-zA-Z]*");//true o false
    }

    public static boolean ValidaApellido(String apellido) {
        return apellido.matches("[a-zA-Z]*");
    }

    public static boolean ValidarCodigo(String codigo) {
        return codigo.matches("\\d{10}");
    }

    public static boolean ValidarContrasena(String contrasena) {
        return contrasena.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,}$");
    }

    public static boolean ValidarUsuario(String usuario) {
        return usuario.matches("^[A-Za-z0-9]+");
    }

    public static boolean ValidarCorreo(String correo) {
        String emailRegex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        Pattern emailPat = Pattern.compile(emailRegex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = emailPat.matcher(correo);
        return matcher.find();
    }
}
