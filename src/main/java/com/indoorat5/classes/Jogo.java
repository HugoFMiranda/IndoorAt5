/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.indoorat5.classes;

import java.io.Serializable;
import com.indoorat5.datas.*;
import java.time.LocalDate;
import java.util.*;

/**
 *
 * @author HugoM
 */
public abstract class Jogo implements Serializable, Comparable<Jogo> {

    public static int njogos = 0;
    private int id;
    private HashSet<Utilizador> vecUtilizadores = new HashSet<>();
    private Sitios local;
    private Data Data;
    private Data Data_criacao;
    
    /**
     * construtor vazio
     */
    public Jogo() {
        this.id = njogos;
        this.local = new Sitios();
        this.vecUtilizadores = new HashSet<>();
        this.Data = new Data();
        LocalDate d = LocalDate.now();
        this.Data_criacao = new Data(d.getYear(),d.getMonthValue(),d.getDayOfMonth());
        njogos++;
    }
    /**
     * construtor jogo
     * @param local
     * @param u 
     */
    public Jogo(Sitios local, HashSet u) {
        this.id = njogos;
        this.local = local;
        this.vecUtilizadores = u;
        njogos++;
    }
    /**
     * construtor jogo
     * @param local
     * @param u
     * @param data 
     */
    public Jogo(Sitios local, HashSet u, Data data) {
        this.id = njogos;
        this.local = local;
        this.vecUtilizadores = u;
        this.Data = data;
        LocalDate d = LocalDate.now();
        this.Data_criacao = new Data(d.getYear(),d.getMonthValue(),d.getDayOfMonth());
        njogos++;
    }

    /**
     *
     * @return
     */
    public Data getData_criacao() {
        return Data_criacao;
    }
    /**
     * 
     * @param Data_criacao 
     */
    public void setData_criacao(Data Data_criacao) {
        this.Data_criacao = Data_criacao;
    }
    /**
     * 
     * @return 
     */
    public HashSet<Utilizador> getVecUtilizadores() {
        return vecUtilizadores;
    }
    /**
     * 
     * @param njogos 
     */
    public  void setNjogos(int njogos) {
        this.njogos = njogos;
    }
    /**
     * 
     * @param id 
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * 
     * @return 
     */
    public  int getNjogos() {
        return njogos;
    }
    /**
     * 
     * @return 
     */
    public int getId() {
        return id;
    }
    /**
     * 
     * @return 
     */
    public Sitios getLocal() {
        return local;
    }
    /**
     * 
     * @param u 
     */
    public void addUtilizadores(Utilizador u) {
        this.vecUtilizadores.add(u);
    }
    /**
     * 
     * @param vecUtilizadores 
     */
    public void setVecUtilizadores(HashSet<Utilizador> vecUtilizadores) {
        this.vecUtilizadores = vecUtilizadores;
    }

    /**
     *
     * @param local
     */
    public void setLocal(Sitios local) {
        this.local = local;
    }
    /**
     * 
     * @return 
     */
    public Data getData() {
        return Data;
    }
    /**
     * 
     * @param Data 
     */
    public void setData(Data Data) {
        this.Data = Data;
    }

    @Override
    public String toString() {
        return "Jogo{" + "id=" + id + ", Jogadores= " + vecUtilizadores + ", local=" + local.getNome() + "Preco=" + local.getPrecoh() +'}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + this.id;
        hash = 79 * hash + Objects.hashCode(this.vecUtilizadores);
        hash = 79 * hash + Objects.hashCode(this.local);
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
        final Jogo other = (Jogo) obj;
        if (!Objects.equals(this.vecUtilizadores, other.vecUtilizadores))
        {
            return false;
        }
        if (!Objects.equals(this.local, other.local))
        {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Jogo o) {
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
