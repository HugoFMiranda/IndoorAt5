/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.indoorat5.classes;
import com.indoorat5.datas.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
/**
 *
 * @author HugoM
 */
public class Convite implements Serializable{
    private Data data;
    private Utilizador user;
    private Equipas equipa;
    private HashSet<Utilizador> userp;

    /**
     *
     * @param data
     * @param user
     * @param equipa
     * @param userp
     */
    public Convite(Data data, Utilizador user, Equipas equipa, HashSet<Utilizador> userp) {
        this.data = data;
        this.user = user;
        this.equipa = equipa;
        this.userp = userp;
    }

    /**
     *
     * @param user
     * @param equipa
     * @param userp
     */
    public Convite(Utilizador user, Equipas equipa, HashSet<Utilizador> userp) {
        this.user = user;
        this.equipa = equipa;
        this.userp = userp;
    }

    /**
     *
     */
    public Convite() {
        this.user = new Utilizador();
        this.equipa = new Equipas();
        this.userp = new HashSet<>();
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
     * @param data
     */
    public void setData(DataHora data) {
        this.data = data;
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
     * @param user
     */
    public void setUser(Utilizador user) {
        this.user = user;
    }

    /**
     *
     * @return
     */
    public Equipas getEquipa() {
        return equipa;
    }

    /**
     *
     * @param equipa
     */
    public void setEquipa(Equipas equipa) {
        this.equipa = equipa;
    }

    /**
     *
     * @return
     */
    public HashSet<Utilizador> getUserp() {
        return userp;
    }

    /**
     *
     * @param userp
     */
    public void setUserp(HashSet<Utilizador> userp) {
        this.userp = userp;
    }

    @Override
    public String toString() {
        return "Convite{" + "data=" + data + ", user=" + user + ", equipa=" + equipa + ", userp=" + userp + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.data);
        hash = 17 * hash + Objects.hashCode(this.user);
        hash = 17 * hash + Objects.hashCode(this.equipa);
        hash = 17 * hash + Objects.hashCode(this.userp);
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
        final Convite other = (Convite) obj;
        if (!Objects.equals(this.data, other.data))
        {
            return false;
        }
        if (!Objects.equals(this.user, other.user))
        {
            return false;
        }
        if (!Objects.equals(this.equipa, other.equipa))
        {
            return false;
        }
        if (!Objects.equals(this.userp, other.userp))
        {
            return false;
        }
        return true;
    }

   
}
