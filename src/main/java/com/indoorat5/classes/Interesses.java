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
public class Interesses implements Serializable{
    private String designacao;
    private static String DESIGNACAO_POR_OMISSAO = "Nenhum";

    /**
     *construtor vazio
     */
    public Interesses() {
        this.designacao = DESIGNACAO_POR_OMISSAO;
    }
    
    /**
     *
     * @param designacao
     */
    public Interesses(String designacao) {
        this.designacao = designacao;
    }

    /**
     *
     * @return
     */
    public String getDesignacao() {
        return designacao;
    }
    /**
     * 
     * @return 
     */
    public static String getDESIGNACAO_POR_OMISSAO() {
        return DESIGNACAO_POR_OMISSAO;
    }
    /**
     * 
     * @param designacao 
     */
    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }
    /**
     * 
     * @param DESIGNACAO_POR_OMISSAO 
     */
    public static void setDESIGNACAO_POR_OMISSAO(String DESIGNACAO_POR_OMISSAO) {
        Interesses.DESIGNACAO_POR_OMISSAO = DESIGNACAO_POR_OMISSAO;
    }

    @Override
    public String toString() {
        return "Intresses{" + "designacao=" + designacao + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
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
        final Interesses other = (Interesses) obj;
        if (!Objects.equals(this.designacao, other.designacao))
        {
            return false;
        }
        return true;
    }
    
}
