
package Modelo;


public class Juicio {
    //atributos
    private String codigo_juicio;
    private String numero_juicio;
    private String tipo_juicio;
    
    //constructor
    public Juicio(String codigo_juicio, String numero_juicio, String tipo_juicio) {
        this.codigo_juicio = codigo_juicio;
        this.numero_juicio = numero_juicio;
        this.tipo_juicio = tipo_juicio;
    }
    
    //metodos getters y setters

    public String getCodigo_juicio() {
        return codigo_juicio;
    }
    public void setCodigo_juicio(String codigo_juicio) {
        this.codigo_juicio = codigo_juicio;
    }

    public String getNumero_juicio() {
        return numero_juicio;
    }
    public void setNumero_juicio(String numero_juicio) {
        this.numero_juicio = numero_juicio;
    }

    public String getTipo_juicio() {
        return tipo_juicio;
    }
    public void setTipo_juicio(String tipo_juicio) {
        this.tipo_juicio = tipo_juicio;
    }

    @Override
    public String toString() {
        return "Juicio{" + "codigo_juicio=" + codigo_juicio + ", numero_juicio=" + numero_juicio + ", tipo_juicio=" + tipo_juicio + '}';
    }
    
    
}
