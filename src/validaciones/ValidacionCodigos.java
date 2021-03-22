/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validaciones;

import javax.swing.JOptionPane;

/**
 *
 * @author Boris
 */
public class ValidacionCodigos {

   public static int ValidarEnterosRango(String string, int numeroMin, int numeroMax) {
        int respuesta = 0;
        while (true) {
            String texto = Validacion.RecibirCadenas(string);
            try {
                respuesta = Validacion.RecibirEnteros(texto);
                if (respuesta > numeroMin && respuesta < numeroMax) {
                    break;
                }
                Validacion.MostrarOpciones("ERROR, vuelva ah ingresar denuevo");
            } catch (NumberFormatException e) {
                Validacion.MostrarOpciones("ERROR, vuelva ah ingresar denuevo");
            }
        }
        return respuesta;
    }

    public static int ValidacionEntero(String string, int numeroMin) {
        int respuesta = 0;
        while (true) {
            String texto = Validacion.RecibirCadenas(string);
            try {
                respuesta = Validacion.RecibirEnteros(texto);///parseando

                if (respuesta > numeroMin) {
                    break;
                }
                Validacion.MostrarOpciones("ERROR, vuelva ah ingresar denuevo");
            } catch (NumberFormatException e) {
                Validacion.MostrarOpciones("ERROR, vuelva ah ingresar denuevo");
            }
        }
        return respuesta;
    }

    public static double ValidarDoblesRango(String string, int numeroMin, int numeroMax) {
        double respuesta = 0;
        while (true) {
            String texto = Validacion.RecibirCadenas(string);
            try {
                respuesta = Validacion.RecibirDobles(texto);
                if (respuesta > numeroMin && respuesta < numeroMax) {
                    break;
                }
                Validacion.MostrarOpciones("ERROR, vuelva ah ingresar denuevo");
            } catch (NumberFormatException e) {
                Validacion.MostrarOpciones("ERROR, vuelva ah ingresar denuevo");
            }
        }
        return respuesta;
    }
    
    public static double ValidacionDoubles(String string, int numeroMin) {
        double respuesta = 0;
        while (true) {
            String texto = Validacion.RecibirCadenas(string);
            try {
                respuesta = Validacion.RecibirDobles(texto);
                if (respuesta > numeroMin) {
                    break;
                }
                Validacion.MostrarOpciones("ERROR, vuelva ah ingresar denuevo");
            } catch (NumberFormatException e) {
                Validacion.MostrarOpciones("ERROR, vuelva ah ingresar denuevo");
            }
        }
        return respuesta;
    }
    

    public static String retornarCedula(String msgpregunta) {
        String cedula = null;
        boolean respuesta;
        while (true) {
            try {
                cedula = Validacion.RecibirCadenas(msgpregunta);
                respuesta = Validacion.ValidarCedula(cedula);
                if (respuesta == true) {
                    break;
                }
                Validacion.MostrarOpciones("ERROR, vuelva ah ingresar de nuevo");
            } catch (StringIndexOutOfBoundsException e) {
                Validacion.MostrarOpciones("ERROR, ingrese cedula completa");
            } catch (NumberFormatException e) {
                Validacion.MostrarOpciones("ERROR, vuelva a ingresar");
            }
        }
        return cedula;
    }

    public static String Nombres(String texto) {
        String cadena;
        while (true) {
            cadena = Validacion.RecibirCadenas(texto);
            boolean boleano = Validacion.ValidaNombre(cadena);
            if (boleano == true) {
                break;
            }
            Validacion.MostrarOpciones("ERROR, vuelva ah ingresar de nuevo");
        }
        return cadena;
    }

    public static String Apellido(String texto) {
        String cadena;
        while (true) {
            cadena = Validacion.RecibirCadenas(texto);
            boolean boleano = Validacion.ValidaApellido(cadena);
            if (boleano == true) {
                break;
            }
            Validacion.MostrarOpciones("ERROR, vuelva ah ingresar de nuevo");
        }
        return cadena;
    }

    public static String Usuario(String texto) {
        String cadena;
        while (true) {
            cadena = Validacion.RecibirCadenas(texto);
            boolean boleano = Validacion.ValidarUsuario(cadena);
            if (boleano == true) {
                break;
            }
            Validacion.MostrarOpciones("ERROR, vuelva ah ingresar de nuevo");
        }
        return cadena;
    }

    public static String Contrasena(String texto) {
        String cadena;
        while (true) {
            cadena = Validacion.RecibirCadenas(texto);
            boolean boleano = Validacion.ValidarContrasena(cadena);
            if (boleano == true) {
                break;
            }
            Validacion.MostrarOpciones("ERROR, vuelva ah ingresar de nuevo");
        }
        return cadena;
    }

    public static String Codigo(String texto) {
        String cadena;
        while (true) {
            cadena = Validacion.RecibirCadenas(texto);
            boolean boleano = Validacion.ValidarCodigo(cadena);
            if (boleano == true) {
                break;
            }
            Validacion.MostrarOpciones("ERROR, vuelva ah ingresar de nuevo");
        }
        return cadena;
    }

    public static String Correo(String texto) {
        String cadena;
        while (true) {
            cadena = Validacion.RecibirCadenas(texto);
            boolean boleano = Validacion.ValidarCorreo(cadena);
            if (boleano == true) {
                break;
            }
            Validacion.MostrarOpciones("ERROR, vuelva ah ingresar de nuevo");
        }
        return cadena;
    }

    public static String Telefono(String texto) {
        String cadena;
        while (true) {
            cadena = Validacion.RecibirCadenas(texto);
            boolean boleano = Validacion.ValidarTelefono(cadena);
            if (boleano == true) {
                break;
            }
            Validacion.MostrarOpciones("ERROR, vuelva ah ingresar de nuevo");
        }
        return cadena;
    }

    public static String Celular(String texto) {
        String cadena;
        while (true) {
            cadena = Validacion.RecibirCadenas(texto);
            boolean boleano = Validacion.ValidarCelular(cadena);
            if (boleano == true) {
                break;
            }
            Validacion.MostrarOpciones("ERROR, vuelva ah ingresar de nuevo");
        }
        return cadena;
    }

   

    public static double numeritos(String numeroString) {
        double respuesta = 0;
        while (true) {
            try {
                respuesta = Double.parseDouble(numeroString);
                if (respuesta > 0) {
                    break;
                }
            } catch (NumberFormatException e) {
                Validacion.MostrarOpciones("ERROR, vuelva ah ingresar de nuevo");
            }
        }
        return respuesta;

    }


}
