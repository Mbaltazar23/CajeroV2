/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Camilo Andres
 */
public class Cajero {
    int Caj_saldo;
    int Caj_Id;

    public Cajero() {
    }

    public Cajero(int Caj_saldo, int Caj_Id) {
        this.Caj_saldo = Caj_saldo;
        this.Caj_Id = Caj_Id;
    }

    public int getCaj_saldo() {
        return Caj_saldo;
    }

    public void setCaj_saldo(int Caj_saldo) {
        this.Caj_saldo = Caj_saldo;
    }

    public int getCaj_Id() {
        return Caj_Id;
    }

    public void setCaj_Id(int Caj_Id) {
        this.Caj_Id = Caj_Id;
    }
    
}
