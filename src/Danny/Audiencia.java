
package Danny;
import java.util.*;

public class Audiencia {
    //atributos
    private String codigo_audiencia;
    private Date fecha_aud;
    private String numero_aud;
    private String juez_enca_aud;
    
    //constructor
    public Audiencia(String codigo_audiencia, Date fecha_aud, String numero_aud, String juez_enca_aud) {
        this.codigo_audiencia = codigo_audiencia;
        this.fecha_aud = fecha_aud;
        this.numero_aud = numero_aud;
        this.juez_enca_aud = juez_enca_aud;
    }
    
    //metodos getters y setters

    public String getCodigo_audiencia() {
        return codigo_audiencia;
    }
    public void setCodigo_audiencia(String codigo_audiencia) {
        this.codigo_audiencia = codigo_audiencia;
    }

    public Date getFecha_aud() {
        return fecha_aud;
    }
    public void setFecha_aud(Date fecha_aud) {
        this.fecha_aud = fecha_aud;
    }

    public String getNumero_aud() {
        return numero_aud;
    }
    public void setNumero_aud(String numero_aud) {
        this.numero_aud = numero_aud;
    }

    public String getJuez_enca_aud() {
        return juez_enca_aud;
    }
    public void setJuez_enca_aud(String juez_enca_aud) {
        this.juez_enca_aud = juez_enca_aud;
    }

    @Override
    public String toString() {
        return "Audiencia{" + "codigo_audiencia=" + codigo_audiencia + ", fecha_aud=" + fecha_aud + ", numero_aud=" + numero_aud + ", juez_enca_aud=" + juez_enca_aud + '}';
    }
    
    
}
