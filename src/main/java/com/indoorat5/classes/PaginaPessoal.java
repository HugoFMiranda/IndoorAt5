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
 * @author joaop
 */
public class PaginaPessoal implements Serializable{
    private Utilizador Utilizador;
    private String Descricao;
    private String Modalidade;
    private HashSet<Relacionamentos> Relacionamento = new HashSet<>();
    private HashSet<Interesses> interesses = new HashSet<>();
    private int Numeroamigos; 
    private HashSet<Publicacao> Publicacao = new HashSet<>();
    private int NumeroPublicacoes;

    private static final String DESCRICAO_OMISSAO = "";
    private static final int INT_OMISSAO = 0;
    
    /**
     * construtor vazio
     */
    public PaginaPessoal (){
        this.Utilizador= new Utilizador();
        this.Descricao=DESCRICAO_OMISSAO;
        this.Relacionamento = new HashSet<>();
        this.interesses = new HashSet<>();
        this.Numeroamigos=INT_OMISSAO;
        this.Publicacao = new HashSet<>();
        this.NumeroPublicacoes=INT_OMISSAO;

    }
    /**
     * construtor Pagina pessoal
     * @param Utilizador
     * @param Descricao
     * @param Relacionamento
     * @param Interesses
     * @param namigos
     * @param npub 
     */
    public PaginaPessoal (Utilizador Utilizador,String Descricao, HashSet<Relacionamentos> Relacionamento, HashSet<Interesses> Interesses,int namigos, int npub){
        this.Utilizador = Utilizador;
        this.Descricao = Descricao;
        this.Relacionamento = Relacionamento;
        this.interesses = Interesses;
        this.Numeroamigos = Relacionamento.size();
        this.NumeroPublicacoes = Publicacao.size();
       
    }
    /**
     * 
     * @param Utilizador
     * @param Descricao
     * @param Interesses 
     */
    public PaginaPessoal (Utilizador Utilizador,String Descricao, HashSet<Interesses> Interesses){
        this.Utilizador = Utilizador;
        this.Descricao = Descricao;
        this.interesses = Interesses;
        this.Numeroamigos = Relacionamento.size();
        this.NumeroPublicacoes = Publicacao.size();   
    }
    /**
     * construtor Pagina Pessoal
     * @param Utilizador
     * @param Descricao
     * @param Relacionamento
     * @param Interesses 
     */
    public PaginaPessoal (Utilizador Utilizador,String Descricao,HashSet<Relacionamentos> Relacionamento, HashSet<Interesses> Interesses){
        this.Utilizador = Utilizador;
        this.Descricao = Descricao;
        this.interesses = Interesses;
        this.Numeroamigos = Relacionamento.size();
        this.NumeroPublicacoes = Publicacao.size();   
    }
    /**
     * Construtor Pagina Pessoal
     * @param Utilizador
     * @param Descricao
     * @param Relacionamento
     * @param Interesses
     * @param Modalidade 
     */
     public PaginaPessoal (Utilizador Utilizador,String Descricao,HashSet<Relacionamentos> Relacionamento, HashSet<Interesses> Interesses,String Modalidade){
        this.Utilizador = Utilizador;
        this.Descricao = Descricao;
        this.interesses = Interesses;
        this.Numeroamigos = Relacionamento.size();
        this.NumeroPublicacoes = Publicacao.size();   
        this.Modalidade = Modalidade;
    }
     /**
      * Construtor Pagina Pessoal
      * @param Utilizador
      * @param Descricao
      * @param Interesses
      * @param Modalidade 
      */
     public PaginaPessoal (Utilizador Utilizador,String Descricao, HashSet<Interesses> Interesses,String Modalidade){
        this.Utilizador = Utilizador;
        this.Descricao = Descricao;
        this.interesses = Interesses;
        this.Numeroamigos = Relacionamento.size();
        this.NumeroPublicacoes = Publicacao.size();   
        this.Modalidade = Modalidade;
    }
     /**
      * 
      * @return 
      */
    public String getModalidade() {
        return Modalidade;
    }
    /**
     * 
     * @param Publicacao 
     */
    public void setPublicacao(HashSet<Publicacao> Publicacao) {
        this.Publicacao = Publicacao;
    }
    /**
     * 
     * @param Modalidade 
     */
    public void setModalidade(String Modalidade) {
        this.Modalidade = Modalidade;
    }
    /**
     * 
     * @return 
     */
    public Utilizador getUtilizador() {
        return Utilizador;
    }
    /**
     * 
     * @return 
     */
    public String getDescricao() {
        return Descricao;
    }
    /**
     * 
     * @return 
     */
    public HashSet<Relacionamentos> getRelacionamento() {
        return Relacionamento;
    }
    /**
     * 
     * @return 
     */
    public HashSet<Interesses> getInteresses() {
        return interesses;
    }
    /**
     * 
     * @return 
     */
    public int getNumeroamigos() {
        return Numeroamigos;
    }
    /**
     * 
     * @return 
     */
    public int getNumeroPublicacoes() {
        return NumeroPublicacoes;
    }
    /**
     * 
     * @param Utilizador 
     */
    public void setUtilizador(Utilizador Utilizador) {
        this.Utilizador = Utilizador;
    }
    /**
     * 
     * @param Descricao 
     */
    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    /**
     *
     * @param Relacionamento
     */
    public void setRelacionamento(HashSet<Relacionamentos> Relacionamento) {
        this.Relacionamento = Relacionamento;
    }
    /**
     * 
     * @param Interesses 
     */
    public void setInteresses(HashSet<Interesses> Interesses) {
        this.interesses = Interesses;
    }
    /**
     * 
     * @param Numeroamigos 
     */
    public void setNumeroamigos(int Numeroamigos) {
        this.Numeroamigos = Numeroamigos;
    }
    /**
     * 
     * @param NumeroPublicacoes 
     */
    public void setNumeroPublicacoes(int NumeroPublicacoes) {
        this.NumeroPublicacoes = NumeroPublicacoes;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PaginaPessoal other = (PaginaPessoal) obj;
        if (this.Numeroamigos != other.Numeroamigos) {
            return false;
        }
        if (!Objects.equals(this.Descricao, other.Descricao)) {
            return false;
        }
        if (!Objects.equals(this.interesses, other.interesses)) {
            return false;
        }
        if (!Objects.equals(this.Utilizador, other.Utilizador)) {
            return false;
        }
        if (!Objects.equals(this.Relacionamento, other.Relacionamento)) {
            return false;
        }
        if (!Objects.equals(this.Publicacao, other.Publicacao)) {
            return false;
        }
        if (!Objects.equals(this.NumeroPublicacoes, other.NumeroPublicacoes)) {
            return false;
        }
        return true;
    }

    public static String getDESCRICAO_OMISSAO() {
        return DESCRICAO_OMISSAO;
    }



    public static int getINT_OMISSAO() {
        return INT_OMISSAO;
    }

    @Override
    public String toString() {
        return "Pagina Pessoal ( Utilizador : " + Utilizador + ", Descrição : " + Descricao + ", Relacionamentos : " + Relacionamento + ", Interesses : " + interesses + ", número de amigos : " + Numeroamigos + "número de publicações: " + NumeroPublicacoes + ")" ;//To change body of generated methods, choose Tools | Templates.
    }
    
}
