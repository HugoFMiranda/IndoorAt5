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
public class Notificacao implements Serializable{
    private int id;
    private Data dataCriacao;
    private HashSet<Utilizador> user;
    private String str;
    private final static String STRING_OMISSAO = "";
    public static int not = 0;
    /**
     * 
     * @param user
     * @param str 
     */
    public Notificacao(HashSet<Utilizador> user, String str) {
        LocalDate date = LocalDate.now();
        this.dataCriacao = new Data(date.getYear(),date.getMonthValue(),date.getDayOfMonth());
        this.user = user;
        this.str = str;
        this.id = not;
        not++;
    }
    /**
     * 
     */
    public Notificacao() {
        LocalDate date = LocalDate.now();
        this.dataCriacao = new Data(date.getYear(),date.getMonthValue(),date.getDayOfMonth());
        this.user = new HashSet<>();
        this.str = STRING_OMISSAO;
        this.id = not;
        not++;
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
    public HashSet<Utilizador> getUser() {
        return user;
    }

    /**
     *
     * @return
     */
    public String getStr() {
        return str;
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
     * @param dataCriacao 
     */
    public void setDataCriacao(DataHora dataCriacao) {
        this.dataCriacao = dataCriacao;
    }
    /**
     * 
     * @param user 
     */
    public void setUser(HashSet<Utilizador> user) {
        this.user = user;
    }
    /**
     * 
     * @return 
     */
    public Data getDataCriacao() {
        return dataCriacao;
    }
    /**
     * 
     * @param dataCriacao 
     */
    public void setDataCriacao(Data dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    /**
     * 
     * @param str 
     */
    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + this.id;
        hash = 67 * hash + Objects.hashCode(this.dataCriacao);
        hash = 67 * hash + Objects.hashCode(this.user);
        hash = 67 * hash + Objects.hashCode(this.str);
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
        final Notificacao other = (Notificacao) obj;
        if (this.id != other.id)
        {
            return false;
        }
        if (!Objects.equals(this.str, other.str))
        {
            return false;
        }
        if (!Objects.equals(this.dataCriacao, other.dataCriacao))
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
        return "Notificacao{" + "id=" + id + ", dataCriacao=" + dataCriacao + ", user=" + user + ", str=" + str + '}';
    }

  

   
    
    
}
