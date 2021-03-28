/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Boris;

/**
 *
 * @author Boris
 */
public class Roles {
    private String cod_rol;
    private String tipo_rol;
    private String descrip_rol;

    public Roles(String cod_rol, String tipo_rol, String descrip_rol) {
        this.cod_rol = cod_rol;
        this.tipo_rol = tipo_rol;
        this.descrip_rol = descrip_rol;
    }

    public String getCod_rol() {
        return cod_rol;
    }

    public void setCod_rol(String cod_rol) {
        this.cod_rol = cod_rol;
    }

    public String getTipo_rol() {
        return tipo_rol;
    }

    public void setTipo_rol(String tipo_rol) {
        this.tipo_rol = tipo_rol;
    }

    public String getDescrip_rol() {
        return descrip_rol;
    }

    public void setDescrip_rol(String descrip_rol) {
        this.descrip_rol = descrip_rol;
    }

    @Override
    public String toString() {
        return "Roles{" + "cod_rol=" + cod_rol + ", tipo_rol=" + tipo_rol + ", descrip_rol=" + descrip_rol + '}';
    }
    
}
