/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.indoorat5.classes;

import com.indoorat5.datas.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.*;

/**
 *
 * @author HugoM
 */
public class Relacionamentos implements Serializable, Comparable<Relacionamentos>{
    //data de inicio
    //tipo de amizade
    // utilizador

    private Data data;
    private Utilizador ua;
    private Utilizador user;
    private String tipo;
    private static ArrayList<String> tipoami = new ArrayList<>(Arrays.asList("Amigos", "Bloqueado", "Desconhecido"));
    private static final String TIPO_POR_OMISSAO = "Desconhecido";

    /**
     * Construtor Relacionamentos
     * @param ua
     * @param user
     * @param tipoamizade 
     */
    public Relacionamentos(Utilizador ua,Utilizador user, String tipoamizade) {
        LocalDate date = LocalDate.now();
        this.data = new Data(date.getYear(), date.getMonthValue(), date.getDayOfMonth());
        this.ua = ua;
        this.user = user;
        if (tipoami.contains(tipoamizade))
        {
            this.tipo = tipoamizade;
        } else
        {
            this.tipo = TIPO_POR_OMISSAO;
        }
    }
    /**
     * Construtor vazio
     */
    public Relacionamentos() {
        LocalDate date = LocalDate.now();
        this.data = new Data(date.getYear(), date.getMonthValue(), date.getDayOfMonth());
        this.user = new Utilizador();
        this.tipo = TIPO_POR_OMISSAO;
    }
    /**
     * 
     * @return 
     */
    public Data getData() {
        return data;
    }
    /**
     * 
     * @return 
     */
    public Utilizador getUser() {
        return user;
    }
    /**
     * 
     * @return 
     */
    public Utilizador getUa() {
        return ua;
    }

    /**
     *
     * @param ua
     */
    public void setUa(Utilizador ua) {
        this.ua = ua;
    }
    /**
     * 
     * @return 
     */
    public String getTipo() {
        return tipo;
    }
    /**
     * 
     * @return 
     */
    public static ArrayList<String> getTipoami() {
        return tipoami;
    }

    /**
     *
     * @return
     */
    public static String getTIPO_POR_OMISSAO() {
        return TIPO_POR_OMISSAO;
    }
    /**
     * 
     * @param data 
     */
    public void setData(Data data) {
        this.data = data;
    }

    /**
     *
     * @param user
     */
    public void setUser(Utilizador user) {
        this.user = user;
    }
    /**
     * 
     * @param tipo 
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    /**
     * 
     * @param tipoami 
     */
    public static void setTipoami(ArrayList<String> tipoami) {
        Relacionamentos.tipoami = tipoami;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
        {
            return true;
        }
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        final Relacionamentos other = (Relacionamentos) obj;
        if (!Objects.equals(this.tipo, other.tipo))
        {
            return false;
        }
        if (!Objects.equals(this.data, other.data))
        {
            return false;
        }
        if (!Objects.equals(this.ua, other.ua))
        {
            return false;
        }
        if (!Objects.equals(this.user, other.user))
        {
            return false;
        }
        return true;
    }



    @Override
    public String toString() {
        return "Relacionamentos{" + "data=" + data + ": User1(ID:" + ua.getId() + ",NOME:" + ua.getUsername() + "), USER2(ID: " +user.getId() + "NOME:" + user.getUsername() + ", tipo=" + tipo + '}';
    }

    @Override
    public int compareTo(Relacionamentos o) {
        if (this.getData().isMaior(o.getData()) == true)
        {
            return 1;
        } else if (this.getData().isMaior(o.getData()) == false)
        {
            return -1;
        } else
        {
            return 0;
        }
    }

  
    

}
