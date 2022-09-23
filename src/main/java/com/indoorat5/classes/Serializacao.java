/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.indoorat5.classes;

import java.io.*;

/**
 * Classe para guardar e ler as informaçoes atraves de ficheiros
 * @author HugoM
 */
public class Serializacao implements Serializable{
     private static Rede arr;
    /**
     * Grava o ficheiro ao receber os parametros:
     * @param nomeFicheiro
     * @param arr
     * @return 
     */
    private static boolean gravarFicheiro(String nomeFicheiro, Rede arr) {
        try
        {
            FileOutputStream fout = new FileOutputStream(nomeFicheiro);
            ObjectOutputStream out = new ObjectOutputStream(fout);

            out.writeObject(arr);
            System.out.println("->Guardado com sucesso!");
            out.close();
            fout.close();

            return true;

        } catch (IOException ex)
        {
            return false;
        }
    }
/**
 * Le o ficheiro ao receber os parametros:
 * @param nomeFicheiro
 * @return 
 */

    private static boolean lerFicheiro(String nomeFicheiro) {
        try
        {
            FileInputStream fin = new FileInputStream(nomeFicheiro);
            ObjectInputStream in = new ObjectInputStream(fin);
            try
            {
                arr = (Rede) in.readObject();
                System.out.println("->Lido com sucesso!");
                return true;
            } finally
            {
                in.close();
            }
        } catch (FileNotFoundException ex)
        {
            System.out.println("->Não conseguiu encontrar ficheiro");
            return false;
        } catch (IOException ex)
        {
            System.out.println("->Erro na leitura do ficheiro");
            return false;
        } catch (ClassNotFoundException ex)
        {
            System.out.println("->Erro no carregamento da classe!!");
            return false;
        }
    }
/**
 * Grava a informacao para um ficheiro
 * @param nomeFicheiro
 * @param arr
 * @return 
 */

    public static boolean gravarInformacaoRede(String nomeFicheiro, Rede arr) {
        return gravarFicheiro(nomeFicheiro, arr);
    }

    /**
     * Le o ficheiro atraves do parametro:
     * @param nomeFicheiro
     * @return
     */
    public static Rede lerInformacaoAgencia(String nomeFicheiro) {
        if (lerFicheiro(nomeFicheiro))
        {
            return arr;
        } else
        {
            return null;
        }
    }
}
