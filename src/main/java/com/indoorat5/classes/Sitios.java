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
public class Sitios implements Serializable{
    private String nome;
    private String morada;
    private int cod;
    public static int nsitios = 0;
    private int precoh;
    private Utilizador organizador;
    private static final String STRING_POR_OMISSAO = "";
    private static final int PRECO_OMISSAO = 40;
    /**
     * Construtor vazio
     */
    public Sitios() {
        this.nome =STRING_POR_OMISSAO;
        this.morada = STRING_POR_OMISSAO;
        this.precoh = PRECO_OMISSAO;
        this.organizador = new Utilizador();
        this.cod = nsitios;
        nsitios++;
    }
    /**
     * Construtor Sitios
     * @param nome
     * @param morada
     * @param precoh
     * @param organizador 
     */
    public Sitios(String nome, String morada, int precoh, Utilizador organizador) {
        this.cod = nsitios;
        this.nome = nome;
        this.morada = morada;
        this.precoh = precoh;
        this.organizador = organizador;
        nsitios++;
    }
    /**
     * Construtor sitios
     * @param nome
     * @param morada
     * @param precoh 
     */
    public Sitios(String nome, String morada, int precoh) {
        this.cod = nsitios;
        this.nome = nome;
        this.morada = morada;
        this.precoh = precoh;
        nsitios++;
    }
    /**
     * 
     * @param cod 
     */
    public void setCod(int cod) {
        this.cod = cod;
    }
    /**
     * 
     * @param nsitios 
     */
    public  void setNsitios(int nsitios) {
        this.nsitios = nsitios;
    }

    /**
     *
     * @return
     */
    public int getCod() {
        return cod;
    }

    /**
     *
     * @return
     */
    public  int getNsitios() {
        return nsitios;
    }

    /**
     *
     * @return
     */
    public static int getPRECO_OMISSAO() {
        return PRECO_OMISSAO;
    }
    /**
     * 
     * @return 
     */
    public String getNome() {
        return nome;
    }
    /**
     * 
     * @return 
     */
    public String getMorada() {
        return morada;
    }
    /**
     * 
     * @return 
     */
    public int getPrecoh() {
        return precoh;
    }
    /**
     * 
     * @return 
     */
    public Utilizador getOrganizador() {
        return organizador;
    }
    /**
     * 
     * @return 
     */
    public static String getSTRING_POR_OMISSAO() {
        return STRING_POR_OMISSAO;
    }
    /**
     * 
     * @param nome 
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    /**
     * 
     * @param morada 
     */
    public void setMorada(String morada) {
        this.morada = morada;
    }
    /**
     * 
     * @param precoh 
     */
    public void setPrecoh(int precoh) {
        this.precoh = precoh;
    }
    /**
     * 
     * @param organizador 
     */
    public void setOrganizador(Utilizador organizador) {
        this.organizador = organizador;
    }

    @Override
    public String toString() {
        return "Sitios{" + "nome=" + nome + ", morada=" + morada + ", cod=" + cod + ", precoh=" + precoh + ", organizador=" + organizador + '}';
    }

 

    @Override
    public int hashCode() {
        int hash = 3;
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
        final Sitios other = (Sitios) obj;
        if (this.precoh != other.precoh)
        {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome))
        {
            return false;
        }
        if (!Objects.equals(this.morada, other.morada))
        {
            return false;
        }
        if (!Objects.equals(this.organizador, other.organizador))
        {
            return false;
        }
        return true;
    }
    
}
