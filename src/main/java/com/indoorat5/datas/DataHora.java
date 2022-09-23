/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.indoorat5.datas;

import java.io.Serializable;

/**
 *
 * @author Catarina
 */
public class DataHora extends Data implements Serializable{

    private int hora;
    private int minuto;

    private static final int INT_PREDEFINIDO = 0;

    /**
     * Construtor vazio
     */
    public DataHora() {
        super();
        this.hora = INT_PREDEFINIDO;
        this.minuto = INT_PREDEFINIDO;
    }

    /**
     * Construtor com os parametros:
     * @param ano
     * @param mes
     * @param dia
     * @param hora
     * @param minuto
     */
    public DataHora(int ano, int mes, int dia, int hora, int minuto ) {
        super(ano, mes, dia);
        this.hora = hora;
        this.minuto = minuto;
    }
    /**
     * Construtor com os parametros:
     * @param data
     * @param hora
     * @param minuto 
     */
    public DataHora(Data data, int hora, int minuto) {
        super(data);
        this.hora = hora;
        this.minuto = minuto;
    }
    /**
     * Construtor com os parametros:
     * @param dh 
     */
    public DataHora(DataHora dh) {
        super(dh);
        this.hora = dh.hora;
        this.minuto = dh.minuto;
    }

    /**
     * Retorna a hora
     * @return
     */
    public int getHora() {
        return hora;
    }

    /**
     * Retorna o minuto
     * @return
     */
    public int getMinuto() {
        return minuto;
    }
    /**
     * Define a hora
     * @param hora 
     */
    public void setHora(int hora) {
        this.hora = hora;
    }
    /**
     * Define o minuto
     * @param minuto 
     */
    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }
    /**
     * Metodo equals
     * @param obj
     * @return 
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final DataHora other = (DataHora) obj;
        return this.hora == other.hora
                && this.minuto == other.minuto;
    }
    /**
     * Retorna a hora em string
     * @return 
     */
    @Override
    public String toString() {
        return super.toString() + " às "+ hora + "H " + minuto + "M";
    }
}
