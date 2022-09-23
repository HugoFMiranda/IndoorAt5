/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.indoorat5.classes;

import com.indoorat5.datas.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.*;

/**
 *
 * @author Diogo Magalhães
 */
public class Publicacao implements Serializable, Comparable<Publicacao>{

    private Utilizador User;
    private String titulo;
    private Data DataDeCriacao;
    private String TextoPub;
    private String Modalidades;
    public static int npub = 1;
    private int CodigoDePub;
    private HashSet<Utilizador> vecusersp = new HashSet<>();
    private ArrayList<Comentario> vecComentario = new ArrayList<>();
    private int nccomentarios;
    private HashSet<Reacoes> vecReacao = new HashSet<>();

//Por omissao
    private static final String STRING_POR_OMISSAO = "";
    private static final int INT_POR_OMISSAO = 0;
    
    /**
     * Construtor vazio
     */
    public Publicacao() {
        this.User = new Utilizador();
        this.TextoPub = STRING_POR_OMISSAO;
        this.DataDeCriacao = new DataHora();
        this.Modalidades = STRING_POR_OMISSAO;
        this.CodigoDePub = npub;     
        this.vecComentario = new ArrayList();
        this.vecReacao = new HashSet();
        this.nccomentarios = vecComentario.size();
        npub++;
    }
//    public Publicacao(Utilizador User, String titulo,String TextoPub, String Modalidades) {
//        this.User = User;
//        this.titulo = titulo;
//        LocalDate date = LocalDate.now();
//        this.DataDeCriacao = new Data(date.getYear(), date.getMonthValue(), date.getDayOfMonth());
//        this.TextoPub = TextoPub;
//        this.Modalidades = Modalidades;
//        this.CodigoDePub = npub;
//        npub++;
//    }
//    public Publicacao(Utilizador User, String titulo,String TextoPub, String Modalidades, HashSet<Utilizador> users) {
//        this.User = User;
//        this.titulo = titulo;
//        LocalDate date = LocalDate.now();
//        this.DataDeCriacao = new Data(date.getYear(), date.getMonthValue(), date.getDayOfMonth());
//        this.TextoPub = TextoPub;
//        this.Modalidades = Modalidades;
//        this.CodigoDePub = npub;
//        npub++;
//    }
//    public Publicacao(Utilizador User, String titulo,String TextoPub, String Modalidades, HashSet<Utilizador> users,ArrayList<Comentario> vecComentario,HashSet<Reacoes> vecReacao) {
//        this.User = User;
//        this.titulo = titulo;
//        LocalDate date = LocalDate.now();
//        this.DataDeCriacao = new Data(date.getYear(), date.getMonthValue(), date.getDayOfMonth());
//        this.TextoPub = TextoPub;
//        this.Modalidades = Modalidades;
//        this.vecComentario = vecComentario;
//        this.vecReacao = vecReacao;
//        this.CodigoDePub = npub;
//        npub++;
//    }
//    public Publicacao(Utilizador User, String titulo,String TextoPub) {
//        this.User = User;
//        this.titulo = titulo;
//        LocalDate date = LocalDate.now();
//        this.DataDeCriacao = new Data(date.getYear(), date.getMonthValue(), date.getDayOfMonth());
//        this.TextoPub = TextoPub;
//        this.CodigoDePub = npub;
//        npub++;
//    }
//
//    public Publicacao(Utilizador User,Data DataDeCriacao, String titulo,String TextoPub, String Modalidades, int nccomentarios) {
//        this.User = User;
//         this.titulo = titulo;
//        LocalDate date = LocalDate.now();
//        this.DataDeCriacao = new Data(date.getYear(), date.getMonthValue(), date.getDayOfMonth());
//        this.TextoPub = TextoPub;
//        this.Modalidades = Modalidades;
//        this.CodigoDePub = npub;
//        this.nccomentarios = nccomentarios;
//        npub++;
//    }
    /**
     * Construtor publicaçao
     * @param User
     * @param titulo
     * @param TextoPub
     * @param Modalidades
     * @param us 
     */
    public Publicacao(Utilizador User, String titulo,String TextoPub, String Modalidades, HashSet<Utilizador> us) {
        this.User = User;
        this.titulo = titulo;
        LocalDate date = LocalDate.now();
        Calendar now = Calendar.getInstance();
        this.DataDeCriacao = new Data(date.getYear(), date.getMonthValue(), date.getDayOfMonth());
        this.TextoPub = TextoPub;
        this.Modalidades = Modalidades;
        this.CodigoDePub = npub;
        this.vecusersp=us;
        npub++;
        this.nccomentarios = vecComentario.size();
    }
    /**
     * 
     * @param u 
     */
    public void adicionarUsers(Utilizador u){
        this.vecusersp.add(u);
    }

    /**
     *
     * @param u
     */
    public void adicionarReacao(Reacoes u){
        this.vecReacao.add(u);
    }
    /**
     * 
     * @param u 
     */
    public void adicionarComentario(Comentario u){
        this.vecComentario.add(u);
    }
    /**
     * 
     * @return 
     */
    public Utilizador getUser() {
        return User;
    }
    /**
     * 
     * @param titulo 
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    /**
     * 
     * @param npub 
     */
    public void setNpub(int npub) {
        this.npub = npub;
    }

    /**
     * 
     * @param usersp 
     */
    public void setUsersp(HashSet<Utilizador> usersp) {
        this.vecusersp = usersp;
    }
    /**
     * 
     * @return 
     */
    public String getTitulo() {
        return titulo;
    }
    /**
     * 
     * @return 
     */
    public  int getNpub() {
        return npub;
    }
    /**
     * 
     * @return 
     */
    public HashSet<Utilizador> getUsersp() {
        return vecusersp;
    }

    /**
     *
     * @return
     */
    public Data getDataDeCriacao() {
        return DataDeCriacao;
    }
    /**
     * 
     * @return 
     */
    public String getTextoPub() {
        return TextoPub;
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
     * @return 
     */
    public int getCodigoDePub() {
        return CodigoDePub;
    }
    /**
     * 
     * @return 
     */
    public ArrayList<Comentario> getVecComentario() {
        return vecComentario;
    }
    /**
     * 
     * @return 
     */
    public int getNccomentarios() {
        return nccomentarios;
    }
    /**
     * 
     * @return 
     */
    public HashSet<Reacoes> getVecReacao() {
        return vecReacao;
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
     * @return 
     */
    public static int getINT_POR_OMISSAO() {
        return INT_POR_OMISSAO;
    }
    /**
     * 
     * @param User 
     */
    public void setUser(Utilizador User) {
        this.User = User;
    }

    /**
     * 
     * @param DataDeCriacao 
     */
    public void setDataDeCriacao(Data DataDeCriacao) {
        this.DataDeCriacao = DataDeCriacao;
    }
    /**
     * 
     * @param TextoPub 
     */
    public void setTextoPub(String TextoPub) {
        this.TextoPub = TextoPub;
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
     * @param CodigoDePub 
     */
    public void setCodigoDePub(int CodigoDePub) {
        this.CodigoDePub = CodigoDePub;
    }
    /**
     * 
     * @param vecComentario 
     */
    public void setVecComentario(ArrayList<Comentario> vecComentario) {
        this.vecComentario = vecComentario;
    }
    /**
     * 
     * @param nccomentarios 
     */
    public void setNccomentarios(int nccomentarios) {
        this.nccomentarios = nccomentarios;
    }
    /**
     * 
     * @param vecReacao 
     */
    public void setVecReacao(HashSet<Reacoes> vecReacao) {
        this.vecReacao = vecReacao;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.User);
        hash = 41 * hash + Objects.hashCode(this.DataDeCriacao);
        hash = 41 * hash + Objects.hashCode(this.TextoPub);
        hash = 41 * hash + Objects.hashCode(this.Modalidades);
        hash = 41 * hash + this.CodigoDePub;
        hash = 41 * hash + Objects.hashCode(this.vecComentario);
        hash = 41 * hash + this.nccomentarios;
        hash = 41 * hash + Objects.hashCode(this.vecReacao);
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
        final Publicacao other = (Publicacao) obj;
        if (this.CodigoDePub != other.CodigoDePub)
        {
            return false;
        }
        if (this.nccomentarios != other.nccomentarios)
        {
            return false;
        }
        if (!Objects.equals(this.TextoPub, other.TextoPub))
        {
            return false;
        }
        if (!Objects.equals(this.Modalidades, other.Modalidades))
        {
            return false;
        }
        if (!Objects.equals(this.User, other.User))
        {
            return false;
        }
        if (!Objects.equals(this.DataDeCriacao, other.DataDeCriacao))
        {
            return false;
        }
        if (!Objects.equals(this.vecComentario, other.vecComentario))
        {
            return false;
        }
        if (!Objects.equals(this.vecReacao, other.vecReacao))
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Publicacao{" + "User=" + User + ", titulo=" + titulo + ", DataDeCriacao=" + DataDeCriacao + ", TextoPub=" + TextoPub + ", Modalidades=" + Modalidades + ", CodigoDePub=" + CodigoDePub + ", vecusersp=" + vecusersp + ", vecComentario=" + vecComentario + ", nccomentarios=" + nccomentarios + ", vecReacao=" + vecReacao + '}';
    }
    /**
     * 
     * @return 
     */
    public HashSet<Utilizador> getVecusersp() {
        return vecusersp;
    }
    /**
     * 
     * @param us 
     */
    public void addUsersp(HashSet<Utilizador> us){
        this.vecusersp=us;
    }
    /**
     * 
     * @param vecusersp 
     */
    public void setVecusersp(HashSet<Utilizador> vecusersp) {
        this.vecusersp = vecusersp;
    }

    @Override
    public int compareTo(Publicacao o) {
       if (this.getDataDeCriacao().isMaior(o.getDataDeCriacao()) == true)
        {
            return 1;
        } else if (this.getDataDeCriacao().isMaior(o.getDataDeCriacao()) == false)
        {
            return -1;
        } else
        {
            return 0;
        }
    }
}
