/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Genesis
 */
public class Usuario {
    private String cod_usua;
    private String user_name;
    private String contrasena_usu;
    private String usua;

    public Usuario(String cod_usua, String user_name, String contrasena_usu, String usua) {
        this.cod_usua = cod_usua;
        this.user_name = user_name;
        this.contrasena_usu = contrasena_usu;
        this.usua = usua;
    }

    public String getCod_usua() {
        return cod_usua;
    }

    public void setCod_usua(String cod_usua) {
        this.cod_usua = cod_usua;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getContrasena_usu() {
        return contrasena_usu;
    }

    public void setContrasena_usu(String contrasena_usu) {
        this.contrasena_usu = contrasena_usu;
    }

    public String getUsua() {
        return usua;
    }

    public void setUsua(String usua) {
        this.usua = usua;
    }
       
}
