/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Boris
 */
public class Buffet {

    private String codigo_buffet;
    private String ruc;
    private String direccion_buffet;
    private String telefono_buffet;

    public Buffet() {
    }

    public Buffet(String codigo_buffet, String ruc, String direccion_buffet, String telefono_buffet) {
        this.codigo_buffet = codigo_buffet;
        this.ruc = ruc;
        this.direccion_buffet = direccion_buffet;
        this.telefono_buffet = telefono_buffet;
    }

    public String getCodigo_buffet() {
        return codigo_buffet;
    }

    public void setCodigo_buffet(String codigo_buffet) {
        this.codigo_buffet = codigo_buffet;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getDireccion_buffet() {
        return direccion_buffet;
    }

    public void setDireccion_buffet(String direccion_buffet) {
        this.direccion_buffet = direccion_buffet;
    }

    public String getTelefono_buffet() {
        return telefono_buffet;
    }

    public void setTelefono_buffet(String telefono_buffet) {
        this.telefono_buffet = telefono_buffet;
    }

    @Override
    public String toString() {
        return "Buffet{" + "codigo_buffet=" + codigo_buffet + ", ruc=" + ruc + ", direccion_buffet=" + direccion_buffet + ", telefono_buffet=" + telefono_buffet + '}';
    }
    
    

}
