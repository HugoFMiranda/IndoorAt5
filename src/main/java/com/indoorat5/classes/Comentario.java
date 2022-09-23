/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.indoorat5.classes;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author HugoM
 */
public class Comentario implements Serializable{
    private String texto;
    private Utilizador user;
    private static final String TEXTO_POR_OMISSAO = "";

    /**
     *
     */
    public Comentario() {
        this.texto = TEXTO_POR_OMISSAO;
        this.user = new Utilizador();
    }

    /**
     *
     * @param texto
     * @param user
     */
    public Comentario(String texto, Utilizador user) {
        this.texto = texto;
        this.user = user;
    }

    /**
     *
     * @return
     */
    public String getTexto() {
        return texto;
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
     * @param texto
     */
    public void setTexto(String texto) {
        this.texto = texto;
    }

    /**
     *
     * @param user
     */
    public void setUser(Utilizador user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Comentario{" + "texto=" + texto + ", user=" + user + '}';
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
        final Comentario other = (Comentario) obj;
        if (!Objects.equals(this.texto, other.texto))
        {
            return false;
        }
        if (!Objects.equals(this.user, other.user))
        {
            return false;
        }
        return true;
    }
    
    
}
