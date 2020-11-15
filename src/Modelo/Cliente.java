/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Camilo Andres
 */
public class Cliente {

    private String cli_rut;
    private String cli_nombre;
    private int cli_clave;
    private int cli_saldo;

    /**
     *
     */
    private final ArrayList<Cliente> clientes = new ArrayList<>();

    public Cliente() {
    }

    public Cliente(String cli_rut, String cli_nombre, int cli_clave, int cli_saldo) {
        this.cli_rut = cli_rut;
        this.cli_nombre = cli_nombre;
        this.cli_clave = cli_clave;
        this.cli_saldo = cli_saldo;
    }

    public String getCli_rut() {
        return cli_rut;
    }

    public void setCli_rut(String cli_rut) {
        this.cli_rut = cli_rut;
    }

    public String getCli_nombre() {
        return cli_nombre;
    }

    public void setCli_nombre(String cli_nombre) {
        this.cli_nombre = cli_nombre;
    }

    public int getCli_clave() {
        return cli_clave;
    }

    public void setCli_clave(int cli_clave) {
        this.cli_clave = cli_clave;
    }

    public int getCli_saldo() {
        return cli_saldo;
    }

    public void setCli_saldo(int cli_saldo) {
        this.cli_saldo = cli_saldo;
    }

  

}
