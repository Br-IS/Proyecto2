/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author velez
 */
public class Empleado {
    private String sueldo, cod_rol;

    public Empleado(String sueldo, String cod_rol) {
        this.sueldo = sueldo;
        this.cod_rol = cod_rol;
    }

    public String getSueldo() {
        return sueldo;
    }

    public void setSueldo(String sueldo) {
        this.sueldo = sueldo;
    }

    public String getCod_rol() {
        return cod_rol;
    }

    public void setCod_rol(String cod_rol) {
        this.cod_rol = cod_rol;
    }

    @Override
    public String toString() {
        return "Empleado{" + "sueldo=" + sueldo + ", cod_rol=" + cod_rol + '}';
    }
}
