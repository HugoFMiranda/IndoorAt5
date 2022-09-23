/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.indoorat5.classes;
import com.indoorat5.datas.*;
import java.io.Serializable;
import java.util.HashSet;

/**
 *
 * @author HugoM
 */
public class jogoAndebol extends Jogo implements Serializable{
    private int njogadores;
    private final static int NJOGADORES_OMISSAO = 14;
    private static int njogadoresmaximo = 19;

    /**
     *Construtor vazio
     */
    public jogoAndebol() {
        super();
        this.njogadores = NJOGADORES_OMISSAO;
    }

    /**
     *Construtor Jogoandevol
     * @param local
     * @param u
     * @param data
     * @param njogadores
     */
    public jogoAndebol(Sitios local, HashSet u,Data data,int njogadores) {
        super(local, u,data);
        this.njogadores = njogadores;
    }
    /**
     * 
     * @return 
     */
    public int getNjogadoresmaximo() {
        return njogadoresmaximo;
    }
    /**
     * 
     * @param njogadoresmaximo 
     */
    public static void setNjogadoresmaximo(int njogadoresmaximo) {
        jogoAndebol.njogadoresmaximo = njogadoresmaximo;
    }
    /**
     * 
     * @return 
     */
    public int getNjogadores() {
        return njogadores;
    }

    /**
     *
     * @return
     */
    public static int getNJOGADORES_OMISSAO() {
        return NJOGADORES_OMISSAO;
    }
    /**
     * 
     * @param njogadores 
     */
    public void setNjogadores(int njogadores) {
        this.njogadores = njogadores;
    }


    @Override
    public String toString() {
        return super.toString() + "jogoAndebol{" + "njogadores=" + njogadores + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.njogadores;
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
        final jogoAndebol other = (jogoAndebol) obj;
        if (this.njogadores != other.njogadores)
        {
            return false;
        }
        return true;
    }
    
}
