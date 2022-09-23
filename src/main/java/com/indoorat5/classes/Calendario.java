/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.indoorat5.classes;
import com.indoorat5.datas.*;
import java.io.Serializable;
import java.util.*;
/**
 *
 * @author HugoM
 */
public class Calendario implements Serializable {
    private int Id;
    public static int ncalendarios = 0;
    private Utilizador user;
    private Data data;
    private HashSet<Jogo> vecJogos = new HashSet<>();
    private Sitios sitio;

    /**
     *
     * @param user
     * @param data
     * @param vecJogos
     * @param sitio
     */
    public Calendario(Utilizador user, Data data, HashSet<Jogo> vecJogos, Sitios sitio) {
        this.user = user;
        this.data = data;
        this.vecJogos = vecJogos;
        this.sitio = sitio;
        this.Id = ncalendarios;
        ncalendarios++;
    }

    /**
     *
     */
    public Calendario() {
        this.user = new Utilizador();
        this.data = new Data();
        this.vecJogos = new HashSet<>();
        this.sitio = new Sitios();
        this.Id = ncalendarios;
        ncalendarios++;
    }

    /**
     *
     * @return
     */
    public int getId() {
        return Id;
    }

    /**
     *
     * @return
     */
    public int getNcalendarios() {
        return ncalendarios;
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
    public Data getData() {
        return data;
    }

    /**
     *
     * @return
     */
    public HashSet<Jogo> getVecJogos() {
        return vecJogos;
    }

    /**
     *
     * @return
     */
    public Sitios getSitio() {
        return sitio;
    }

    /**
     *
     * @param Id
     */
    public void setId(int Id) {
        this.Id = Id;
    }

    /**
     *
     * @param ncalendarios
     */
    public void setNcalendarios(int ncalendarios) {
        this.ncalendarios = ncalendarios;
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
     * @param data
     */
    public void setData(Data data) {
        this.data = data;
    }

    /**
     *
     * @param vecJogos
     */
    public void setVecJogos(HashSet<Jogo> vecJogos) {
        this.vecJogos = vecJogos;
    }

    /**
     *
     * @param sitio
     */
    public void setSitio(Sitios sitio) {
        this.sitio = sitio;
    }

    @Override
    public String toString() {
        return "Calendario{" + "Id=" + Id + ", user=" + user + ", data=" + data + ", vecJogos=" + vecJogos + ", sitio=" + sitio + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + this.Id;
        hash = 47 * hash + Objects.hashCode(this.user);
        hash = 47 * hash + Objects.hashCode(this.data);
        hash = 47 * hash + Objects.hashCode(this.vecJogos);
        hash = 47 * hash + Objects.hashCode(this.sitio);
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
        final Calendario other = (Calendario) obj;
        if (this.Id != other.Id)
        {
            return false;
        }
        if (!Objects.equals(this.user, other.user))
        {
            return false;
        }
        if (!Objects.equals(this.data, other.data))
        {
            return false;
        }
        if (!Objects.equals(this.vecJogos, other.vecJogos))
        {
            return false;
        }
        if (!Objects.equals(this.sitio, other.sitio))
        {
            return false;
        }
        return true;
    }

    
    
    
    
}
