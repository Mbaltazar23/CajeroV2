/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author mario
 */
public class ControladorBanco {

    /**
     *
     */
    public static final ArrayList<Cliente> clientes = new ArrayList();

    public static Cliente BuscarCliente(String rut) {
        Cliente cli = null;
        for (int i = 0; i < clientes.size(); i++) {
            cli = clientes.get(i);
            if (rut == null ? cli.getCli_rut() == null : rut.equals(cli.getCli_rut())) {
                return cli;
            }
        }
        return null;
    }
}
