package com.indoorat5.classes;

import com.indoorat5.datas.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author berng
 */
public class Utilizador implements Serializable{

    public static int nUsers = 1;
    private int id;
    private String Username;
    private String Password;
    private String TipoDeUtilizador;
    private String Modalidades;
    private String email;
    public static ArrayList<String> Modalidadesdispo = new ArrayList<>(Arrays.asList("Futebol", "Futsal", "Andebol"));
    public static ArrayList<String> tipouserdispo = new ArrayList<>(Arrays.asList("Jogador", "Arbito", "Organizador"));
    private Data DatadeNascimento;
    private Data Datadecriacao;
    //Private Interesses
    private static final String STRING_POR_OMISSAO = "";
    /**
     * Construtor vazio
     */
    public Utilizador() {
        this.id = nUsers;
        this.Username = STRING_POR_OMISSAO;
        this.Password = STRING_POR_OMISSAO;
        this.TipoDeUtilizador = STRING_POR_OMISSAO;
        this.Modalidades = STRING_POR_OMISSAO;
        this.DatadeNascimento = new Data();
        LocalDate d = LocalDate.now();
        this.Datadecriacao = new Data(d.getYear(),d.getMonthValue(),d.getDayOfMonth());
        nUsers++;
    }
    /**
     * Construtor Username
     * @param Username
     * @param Password
     * @param TipoDeUtilizador
     * @param Modalidades
     * @param email
     * @param DatadeNascimento 
     */
    public Utilizador(String Username, String Password, String TipoDeUtilizador, String Modalidades, String email, Data DatadeNascimento) {
        this.id = nUsers;
        this.Username = Username;
        this.Password = Password;
        this.TipoDeUtilizador = TipoDeUtilizador;
        this.Modalidades = Modalidades;
        this.email = email;
        this.DatadeNascimento = DatadeNascimento;
        LocalDate d = LocalDate.now();
        this.Datadecriacao = new Data(d.getYear(),d.getMonthValue(),d.getDayOfMonth());
        nUsers++;
    }
    /**
     * Construtor Utilizador
     * @param Username
     * @param Password
     * @param TipoDeUtilizador
     * @param Modalidades
     * @param d 
     */
    public Utilizador(String Username, String Password, String TipoDeUtilizador, String Modalidades, Data d) {
        this.id = nUsers;
        this.Username = Username;
        this.Password = Password;
        this.TipoDeUtilizador = TipoDeUtilizador;
        this.Modalidades = Modalidades;
        this.DatadeNascimento = d;
        LocalDate d1 = LocalDate.now();
        this.Datadecriacao = new Data(d1.getYear(),d1.getMonthValue(),d1.getDayOfMonth());
        nUsers++;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }
    /**
     * 
     * @return 
     */
    public Data getDatadecriacao() {
        return Datadecriacao;
    }
    /**
     * 
     * @param Datadecriacao 
     */
    public void setDatadecriacao(Data Datadecriacao) {
        this.Datadecriacao = Datadecriacao;
    }
    /**
     * 
     * @return 
     */
    public  int getnUsers() {
        return nUsers;
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
     * @param nUsers 
     */
    public  void setnUsers(int nUsers) {
        this.nUsers = nUsers;
    }   
    /**
     * 
     * @param id 
     */
    public void setId(int id) {
        this.id = id;
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
        final Utilizador other = (Utilizador) obj;
        if (this.id != other.id)
        {
            return false;
        }
        if (!Objects.equals(this.Username, other.Username))
        {
            return false;
        }
        if (!Objects.equals(this.Password, other.Password))
        {
            return false;
        }
        if (!Objects.equals(this.TipoDeUtilizador, other.TipoDeUtilizador))
        {
            return false;
        }
        if (!Objects.equals(this.Modalidades, other.Modalidades))
        {
            return false;
        }
        if (!Objects.equals(this.email, other.email))
        {
            return false;
        }
        if (!Objects.equals(this.DatadeNascimento, other.DatadeNascimento))
        {
            return false;
        }
        return true;
    }

  
    /**
     * 
     * @param email 
     */
    public void setEmail(String email) {
        this.email = email;
    }
    /**
     * 
     * @return 
     */
    public String getEmail() {
        return email;
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
     * @param Username 
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }
    /**
     * 
     * @param Password 
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }
    /**
     * 
     * @param TipoDeUtilizador 
     */
    public void setTipoDeUtilizador(String TipoDeUtilizador) {
        this.TipoDeUtilizador = TipoDeUtilizador;
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
     * @param Modalidadesdispo 
     */
    public static void setModalidadesdispo(ArrayList<String> Modalidadesdispo) {
        Utilizador.Modalidadesdispo = Modalidadesdispo;
    }
    /**
     * 
     * @param tipouserdispo 
     */
    public static void setTipouserdispo(ArrayList<String> tipouserdispo) {
        Utilizador.tipouserdispo = tipouserdispo;
    }

    /**
     *
     * @param DatadeNascimento
     */
    public void setDatadeNascimento(Data DatadeNascimento) {
        this.DatadeNascimento = DatadeNascimento;
    }
    /**
     * 
     * @return 
     */
    public static ArrayList<String> getModalidadesdispo() {
        return Modalidadesdispo;
    }

    /**
     *
     * @return
     */
    public static ArrayList<String> getTipouserdispo() {
        return tipouserdispo;
    }
    /**
     * 
     * @return 
     */
    public String getUsername() {
        return this.Username;
    }
    /**
     * 
     * @return 
     */
    public String getPassword() {
        return this.Password;
    }
    /**
     * 
     * @return 
     */
    public String getTipoDeUtilizador() {
        return this.TipoDeUtilizador;
    }
    /**
     * 
     * @return 
     */
    public String getModalidades() {
        return this.Modalidades;
    }
    /**
     * 
     * @return 
     */
    public Data getDatadeNascimento() {
        return DatadeNascimento;
    }

    @Override
    public String toString() {
        return "Utilizador{" + "id=" + id + ", Username=" + Username + ", Password=" + Password + ", TipoDeUtilizador=" + TipoDeUtilizador + ", Modalidades=" + Modalidades + ", email=" + email + ", DatadeNascimento=" + DatadeNascimento + '}';
    }



    

}
