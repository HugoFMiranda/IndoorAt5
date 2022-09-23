/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.indoorat5.classes;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;

/**
 *
 * @author berng
 */
public class Torneios implements Serializable{
    private  HashSet <Equipas> equipa = new HashSet();
    private int PrizePool;
    private String nome;
    private  HashSet <Utilizador> arbitros = new HashSet();
    private String Modalidades;
    public final static ArrayList<String> tipotorneio = new ArrayList<>(Arrays.asList("4 equipas","8 equipas"));
    private String tipo;
    private final int PrizePoolOmissao = 500;
    private final static String STRING_OMISSAO = "";
    private int idtorneios;
    public  static int NumeroTorneios=1;
    
    /**
     * Construtor Torneios
     * @param nome
     * @param PrizePool
     * @param eq
     * @param us
     * @param modalidade
     * @param tipo 
     */
    public Torneios(String nome, int PrizePool, HashSet<Equipas> eq, HashSet<Utilizador> us, String modalidade, String tipo) {
        this.nome = nome;
        this.PrizePool = PrizePool;
        this.idtorneios = NumeroTorneios;
        this.equipa = eq;
        this.arbitros = us;
        this.Modalidades = modalidade;
        this.tipo = tipo;
        NumeroTorneios++;
    }

    /**
     *Construtor Torneios
     * @param nome
     * @param PrizePool
     * @param us
     * @param modalidade
     */
    public Torneios(String nome, int PrizePool, HashSet<Utilizador> us, String modalidade) {
        this.nome = nome;
        this.PrizePool = PrizePool;
        this.idtorneios = NumeroTorneios;
        this.equipa = new HashSet();
        this.arbitros = us;
        this.Modalidades = modalidade;
        NumeroTorneios++;
    }
    /**
     * Construtor vazio
     */
    public Torneios() {
        this.nome = STRING_OMISSAO;
        this.PrizePool = PrizePoolOmissao;
        this.idtorneios = NumeroTorneios;
        this.equipa = new HashSet();
        this.arbitros = new HashSet<>();
        this.Modalidades = STRING_OMISSAO;
        NumeroTorneios++;
    }
    /**
     * 
     * @return 
     */
    public HashSet<Equipas> getEquipa() {
        return equipa;
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
     * @param Modalidades 
     */
    public void setModalidades(String Modalidades) {
        this.Modalidades = Modalidades;
    }
    /**
     * 
     * @return 
     */
    public ArrayList<String> getTipotorneio() {
        return tipotorneio;
    }
    /**
     * 
     * @param tipo 
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    /**
     * 
     * @return 
     */
    public String getTipo() {
        return tipo;
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
     * @param nome 
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    /**
     * 
     * @return 
     */
    public int getPrizePool() {
        return PrizePool;
    }
    /**
     * 
     * @return 
     */
    public HashSet<Utilizador> getArbitros() {
        return arbitros;
    }
    /**
     * 
     * @return 
     */
    public int getPrizePoolOmissao() {
        return PrizePoolOmissao;
    }   
    /**
     * 
     * @return 
     */
    public int getIdtorneios() {
        return idtorneios;
    }
    /**
     * 
     * @return 
     */
    public int getNumeroTorneios() {
        return NumeroTorneios;
    }
    /**
     * 
     * @param e 
     */
    public void adicionarEquipas(Equipas e){
        this.equipa.add(e);
    }
    /**
     * 
     * @param e 
     */
    public void adicionarUsers(Utilizador e){
        this.arbitros.add(e);
    }
    /**
     * 
     * @param equipa 
     */
    public void setEquipa(HashSet<Equipas> equipa) {
        this.equipa = equipa;
    }
    /**
     * 
     * @param PrizePool 
     */
    public void setPrizePool(int PrizePool) {
        this.PrizePool = PrizePool;
    }
    /**
     * 
     * @param arbitros 
     */
    public void setArbitros(HashSet<Utilizador> arbitros) {
        this.arbitros = arbitros;
    }
    /**
     * 
     * @param idtorneios 
     */
    public void setIdtorneios(int idtorneios) {
        this.idtorneios = idtorneios;
    }
    /**
     * 
     * @param NumeroTorneios 
     */
    public void setNumeroTorneios(int NumeroTorneios) {
        this.NumeroTorneios = NumeroTorneios;
    }
    /**
     * 
     * @return 
     */
    public static String getSTRING_OMISSAO() {
        return STRING_OMISSAO;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.equipa);
        hash = 59 * hash + this.PrizePool;
        hash = 59 * hash + Objects.hashCode(this.nome);
        hash = 59 * hash + Objects.hashCode(this.arbitros);
        hash = 59 * hash + Objects.hashCode(this.Modalidades);
        hash = 59 * hash + Objects.hashCode(this.tipotorneio);
        hash = 59 * hash + Objects.hashCode(this.tipo);
        hash = 59 * hash + this.PrizePoolOmissao;
        hash = 59 * hash + this.idtorneios;
        hash = 59 * hash + this.NumeroTorneios;
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
        final Torneios other = (Torneios) obj;
        if (this.PrizePool != other.PrizePool)
        {
            return false;
        }
        if (this.PrizePoolOmissao != other.PrizePoolOmissao)
        {
            return false;
        }
        if (this.idtorneios != other.idtorneios)
        {
            return false;
        }
        if (this.NumeroTorneios != other.NumeroTorneios)
        {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome))
        {
            return false;
        }
        if (!Objects.equals(this.Modalidades, other.Modalidades))
        {
            return false;
        }
        if (!Objects.equals(this.tipo, other.tipo))
        {
            return false;
        }
        if (!Objects.equals(this.equipa, other.equipa))
        {
            return false;
        }
        if (!Objects.equals(this.arbitros, other.arbitros))
        {
            return false;
        }
        if (!Objects.equals(this.tipotorneio, other.tipotorneio))
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Torneios{" + "equipa=" + equipa + ", PrizePool=" + PrizePool + ", nome=" + nome + ", arbitros=" + arbitros + ", Modalidades=" + Modalidades + ", tipotorneio=" + tipotorneio + ", tipo=" + tipo + ", PrizePoolOmissao=" + PrizePoolOmissao + ", idtorneios=" + idtorneios + ", NumeroTorneios=" + NumeroTorneios + '}';
    }

  

 

   

   
}
