/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.indoorat5.classes;

import java.io.Serializable;
import java.util.*;

/**
 *
 * @author HugoM
 */
public class Reacoes implements Serializable{
    private String reacao;
    public static final ArrayList<String> tiporeacao = new ArrayList<>(Arrays.asList("Golo","Ao poste"));
    private Utilizador user;
    
    /**
     *Construtor vazio
     */
    public Reacoes(){
        this.user = new Utilizador();
        this.reacao = tiporeacao.get(0);
    }
    /**
     * 
     * @param u
     * @param reacao 
     */
    public Reacoes(Utilizador u, String reacao) {
        this.user = u;
        if (tiporeacao.contains(reacao))
        {
            this.reacao = reacao;
        }else{
            this.reacao = tiporeacao.get(0);
        }  
    }

    /**
     *
     * @return
     */
    public String getReacao() {
        return reacao;
    }
    /**
     * 
     * @return 
     */
    public static ArrayList<String> getTiporeacao() {
        return tiporeacao;
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
     * @param reacao 
     */
    public void setReacao(String reacao) {
        this.reacao = reacao;
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
     * @return 
     */
    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }
    /**
     * 
     * @param obj
     * @return 
     */
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
        final Reacoes other = (Reacoes) obj;
        if (!Objects.equals(this.reacao, other.reacao))
        {
            return false;
        }
        if (!Objects.equals(this.user, other.user))
        {
            return false;
        }
        return true;
    }
    /**
     * 
     * @return 
     */
    @Override
    public String toString() {
        return "Reacoes{" + "reacao=" + reacao + ", user=" + user + '}';
    }
    
   
    
}
