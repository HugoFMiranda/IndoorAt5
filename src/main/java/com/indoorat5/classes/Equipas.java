/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.indoorat5.classes;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;

/**
 *
 * @author berng
 */
public class Equipas implements Serializable{
    private HashSet<Utilizador> utilizador;
    private int NumeroDeJogadoresMax;
    private String Modalidades;
    private String nome;
    private final String STRING_OMISSAO = "";
    private final int NumeroJogadoresMaxOmissao = 11;
    private int idequipa;
    public static int numeroDeEquipas=1;
    /**
     * 
     * @param nome
     * @param utilizador
     * @param NumeroDeJogadoresMax
     * @param Modalidades 
     */
    public Equipas(String nome, HashSet<Utilizador> utilizador, int NumeroDeJogadoresMax, String Modalidades) {
        this.nome = nome;
        this.utilizador = utilizador;
        this.NumeroDeJogadoresMax = NumeroDeJogadoresMax;
        this.Modalidades = Modalidades;
        this.idequipa = numeroDeEquipas;
        numeroDeEquipas++;
    }
    /**
     * 
     * @param nome 
     */
    public Equipas(String nome) {
        this.nome = nome;
        this.utilizador = new HashSet<>();
        this.NumeroDeJogadoresMax = NumeroJogadoresMaxOmissao;
        this.Modalidades = STRING_OMISSAO;
        this.idequipa = numeroDeEquipas;
        numeroDeEquipas++;
    }
    /**
     * 
     */
    public Equipas() {
        this.nome = STRING_OMISSAO;
        this.utilizador = new HashSet<>();
        this.NumeroDeJogadoresMax = NumeroJogadoresMaxOmissao;
        this.Modalidades = STRING_OMISSAO;
        this.idequipa = numeroDeEquipas;
        numeroDeEquipas++;
    }

    /**
     *
     * @return
     */
    public int getNumeroDeJogadoresMax() {
        return NumeroDeJogadoresMax;
    }
    /**
     * 
     * @return 
     */
    public String getModalidades() {
        return Modalidades;
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
     * @return
     */
    public String getNome() {
        return nome;
    }
    /**
     * 
     * @param u 
     */
    public void adicionarUtilizador(Utilizador u){
        this.utilizador.add(u);
    }
    /**
     * 
     * @param u 
     */
    public void removerUtilizador(Utilizador u){
        this.utilizador.remove(u);
    }
    /**
     * 
     * @return 
     */
    public String getSTRING_OMISSAO() {
        return STRING_OMISSAO;
    }
    /**
     * 
     * @return 
     */
    public int getNumeroJogadoresMaxOmissao() {
        return NumeroJogadoresMaxOmissao;
    }
    /**
     * 
     * @return 
     */
    public int getIdequipa() {
        return idequipa;
    }

    /**
     *
     * @return
     */
    public int getNumeroDeEquipas() {
        return numeroDeEquipas;
    }
    /**
     * 
     * @return 
     */
    public HashSet<Utilizador> getUtilizador() {
        return utilizador;
    }
    /**
     * 
     * @param utilizador 
     */
    public void setUtilizador(HashSet<Utilizador> utilizador) {
        this.utilizador = utilizador;
    }
    /**
     * 
     * @param NumeroDeJogadoresMax 
     */
    
    public void setNumeroDeJogadoresMax(int NumeroDeJogadoresMax) {
        this.NumeroDeJogadoresMax = NumeroDeJogadoresMax;
    }
    /**
     * 
     * @param Modalidades 
     */
    public void setModalidades(String Modalidades) {
        this.Modalidades = Modalidades;
    }
    /**
     * 
     * @param idequipa 
     */
    public void setIdequipa(int idequipa) {
        this.idequipa = idequipa;
    }

    /**
     *
     * @param numeroDeEquipas
     */
    public void setNumeroDeEquipas(int numeroDeEquipas) {
        this.numeroDeEquipas = numeroDeEquipas;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.utilizador);
        hash = 37 * hash + this.NumeroDeJogadoresMax;
        hash = 37 * hash + Objects.hashCode(this.Modalidades);
        hash = 37 * hash + Objects.hashCode(this.nome);
        hash = 37 * hash + Objects.hashCode(this.STRING_OMISSAO);
        hash = 37 * hash + this.NumeroJogadoresMaxOmissao;
        hash = 37 * hash + this.idequipa;
        hash = 37 * hash + this.numeroDeEquipas;
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
        final Equipas other = (Equipas) obj;
        if (this.NumeroDeJogadoresMax != other.NumeroDeJogadoresMax)
        {
            return false;
        }
        if (this.NumeroJogadoresMaxOmissao != other.NumeroJogadoresMaxOmissao)
        {
            return false;
        }
        if (this.idequipa != other.idequipa)
        {
            return false;
        }
        if (this.numeroDeEquipas != other.numeroDeEquipas)
        {
            return false;
        }
        if (!Objects.equals(this.Modalidades, other.Modalidades))
        {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome))
        {
            return false;
        }
        if (!Objects.equals(this.STRING_OMISSAO, other.STRING_OMISSAO))
        {
            return false;
        }
        if (!Objects.equals(this.utilizador, other.utilizador))
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Equipas{" + "utilizador=" + utilizador + ", NumeroDeJogadoresMax=" + NumeroDeJogadoresMax + ", Modalidades=" + Modalidades + ", nome=" + nome + ", STRING_OMISSAO=" + STRING_OMISSAO + ", NumeroJogadoresMaxOmissao=" + NumeroJogadoresMaxOmissao + ", idequipa=" + idequipa + ", numeroDeEquipas=" + numeroDeEquipas + '}';
    }

    
  

    
    
   
    
    
}
