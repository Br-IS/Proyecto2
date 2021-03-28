/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tamalito;

/**
 *
 * @author velez
 */
public class Cliente {
    private String cod_cli, estado_civil;

    public Cliente(String cod_cli, String estado_civil) {
        this.cod_cli = cod_cli;
        this.estado_civil = estado_civil;
    }

    public String getCod_cli() {
        return cod_cli;
    }

    public void setCod_cli(String cod_cli) {
        this.cod_cli = cod_cli;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    @Override
    public String toString() {
        return "Cliente{" + "cod_cli=" + cod_cli + ", estado_civil=" + estado_civil + '}';
    }
}
