package com.indoorat5.menu;

import com.indoorat5.classes.*;
import com.indoorat5.datas.*;
import java.io.Serializable;
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author HugoM
 */
public class Menu implements Serializable {

    private static Rede indoor5 = new Rede();
    static Scanner in = new Scanner(System.in);
    static Formatter out = new Formatter(System.out);

    public static void main(String[] args) {
        Rede indoor6 = Serializacao.lerInformacaoAgencia("rede.dat");
        if (indoor6 != null)
        {
            indoor5 = indoor6;
            Jogo.njogos = indoor5.getVecJogos().size() + 1;
            Sitios.nsitios = indoor5.getVecSitios().size() + 1;
            Calendario.ncalendarios = indoor5.getVecCalendario().size() + 1;
            Equipas.numeroDeEquipas = indoor5.getVecEquipas().size() + 1;
            Notificacao.not = indoor5.getVecNotify().size() + 1;
            Publicacao.npub = indoor5.getVecPublicacoes().size() + 1;
            Torneios.NumeroTorneios = indoor5.getVecTorneios().size() + 1;
            Utilizador.nUsers = indoor5.getVecUtilizadores().size() + 1;
        } else
        {
            Utilizador u1 = new Utilizador("NunoMonteiro", "12345", "Jogador", "Futsal", "Nuno@sapo.pt", new Data(2002, 05, 05));
            Utilizador u2 = new Utilizador("TiagoRibeiro", "12345", "Arbito", "Futsal", "Tiago@sapo.pt", new Data(2002, 05, 05));
            Utilizador u3 = new Utilizador("HugoMiranda", "12345", "Jogador", "Futebol", "Hugo@sapo.pt", new Data(2002, 05, 05));
            Utilizador u4 = new Utilizador("BernardoPinto", "12345", "Arbito", "Futebol", "Bernardo@sapo.pt", new Data(2002, 05, 05));
            Utilizador u5 = new Utilizador("DiogoMagalhâes", "12345", "Organizador", "Andebol", "Diogo@sapo.pt", new Data(2002, 05, 05));
            Utilizador u6 = new Utilizador("Admin", "12345", "Admin", "Andebol", "João@sapo.pt", new Data(2002, 05, 05));

            indoor5.adicionarUsers(u1);
            indoor5.adicionarUsers(u2);
            indoor5.adicionarUsers(u3);
            indoor5.adicionarUsers(u4);
            indoor5.adicionarUsers(u5);
            indoor5.adicionarUsers(u5);
            indoor5.adicionarUsers(u6);

            Sitios s1 = new Sitios("Pavilhao da lomba", "R. do Complexo Desportivo, 4515-272 Lomba", 15, u1);
            Sitios s2 = new Sitios("Pavilhao de Fânzeres", "R. Santa Bárbara 422, 4510-670 Fânzeres", 15, u2);
            Sitios s3 = new Sitios("Pavilhao Multiusos de Gondomar", "Av. Multiusos, 4420-230 S. Cosme", 15, u3);
            Sitios s4 = new Sitios("Estádio Sousense", "R. 1º de Dezembro 55, Foz do Sousa", 15, u4);
            Sitios s5 = new Sitios("Estádio São Miguel", "Tv. Santo André, S. Cosme", 15, u5);

            indoor5.adicionarSitios(s1);
            indoor5.adicionarSitios(s2);
            indoor5.adicionarSitios(s3);
            indoor5.adicionarSitios(s4);
            indoor5.adicionarSitios(s5);

            Interesses i1 = new Interesses("Benfica");
            Interesses i2 = new Interesses("Porto");
            Interesses i3 = new Interesses("Sporting");
            Interesses i4 = new Interesses("Braga");
            Interesses i5 = new Interesses("Vizela");
//
            indoor5.adicionarInteresses(i1);
            indoor5.adicionarInteresses(i2);
            indoor5.adicionarInteresses(i3);
            indoor5.adicionarInteresses(i4);
            indoor5.adicionarInteresses(i5);

            HashSet<Interesses> iv1 = new HashSet<>(Arrays.asList(i1, i2));
            HashSet<Interesses> iv2 = new HashSet<>(Arrays.asList(i1, i2));
            HashSet<Interesses> iv3 = new HashSet<>(Arrays.asList(i1, i2));
            HashSet<Interesses> iv4 = new HashSet<>(Arrays.asList(i1, i2));
            HashSet<Interesses> iv5 = new HashSet<>(Arrays.asList(i1, i2));
//
            PaginaPessoal p1 = new PaginaPessoal(u1, "INSERIR DESCRIÇÃO", iv1);
            PaginaPessoal p2 = new PaginaPessoal(u1, "INSERIR DESCRIÇÃO", iv2);
            PaginaPessoal p3 = new PaginaPessoal(u1, "INSERIR DESCRIÇÃO", iv3);
            PaginaPessoal p4 = new PaginaPessoal(u1, "INSERIR DESCRIÇÃO", iv4);
            PaginaPessoal p5 = new PaginaPessoal(u1, "INSERIR DESCRIÇÃO", iv5);
//
            indoor5.adicionarPagPessoal(p1);
            indoor5.adicionarPagPessoal(p2);
            indoor5.adicionarPagPessoal(p3);
            indoor5.adicionarPagPessoal(p4);
            indoor5.adicionarPagPessoal(p5);

            HashSet<Utilizador> uv1 = new HashSet<>(Arrays.asList(u1, u5));
            HashSet<Utilizador> uv2 = new HashSet<>(Arrays.asList(u2, u4));
            HashSet<Utilizador> uv3 = new HashSet<>(Arrays.asList(u3, u3));
            HashSet<Utilizador> uv4 = new HashSet<>(Arrays.asList(u4, u2));
            HashSet<Utilizador> uv5 = new HashSet<>(Arrays.asList(u5, u1));

            Publicacao pub1 = new Publicacao(u1, "Jogo de futebol Dia 25", "Gondomar vs Sousense", "Futebol", uv1);
            Publicacao pub2 = new Publicacao(u2, "Jogo de futebol Dia 24", "Fânzeres vs S. Pedro da Cova", "Futebol", uv2);
            Publicacao pub3 = new Publicacao(u3, "Jogo de futebol Dia 24", "Gondomar vs Amanhâ da Criança", "Futebol", uv3);
            Publicacao pub4 = new Publicacao(u4, "Jogo Amador Dia 24", "Nuno e Companhia vs Diogo Boys ", "Futebol", uv4);
            Publicacao pub5 = new Publicacao(u5, "Jogo Amador Dia 27", "Meninos do Ribeiro vs Miranda Futebol Club ", "Futebol", uv5);

            pub1.adicionarComentario(new Comentario("Topzao!", u5));
            pub2.adicionarComentario(new Comentario("Topzao!", u4));
            pub3.adicionarComentario(new Comentario("Topzao!", u3));
            pub4.adicionarComentario(new Comentario("Topzao!", u2));
            pub5.adicionarComentario(new Comentario("Topzao!", u1));

            pub1.adicionarReacao(new Reacoes(u1, "Golo"));
            pub2.adicionarReacao(new Reacoes(u2, "Ao poste"));
            pub3.adicionarReacao(new Reacoes(u3, "Golo"));
            pub4.adicionarReacao(new Reacoes(u4, "Ao poste"));
            pub5.adicionarReacao(new Reacoes(u5, "Golo"));
//
            indoor5.adicionarPublicacoes(pub1);
            indoor5.adicionarPublicacoes(pub2);
            indoor5.adicionarPublicacoes(pub3);
            indoor5.adicionarPublicacoes(pub4);
            indoor5.adicionarPublicacoes(pub5);

            Relacionamentos r1 = new Relacionamentos(u1, u2, "Amigos");
            Relacionamentos r2 = new Relacionamentos(u2, u3, "Amigos");
            Relacionamentos r3 = new Relacionamentos(u4, u5, "Amigos");
            Relacionamentos r4 = new Relacionamentos(u1, u3, "Amigos");
            Relacionamentos r5 = new Relacionamentos(u1, u4, "Amigos");

            indoor5.adicionarRelacionamentos(r1);
            indoor5.adicionarRelacionamentos(r2);
            indoor5.adicionarRelacionamentos(r3);
            indoor5.adicionarRelacionamentos(r4);
            indoor5.adicionarRelacionamentos(r5);

            jogoAndebol ja1 = new jogoAndebol(s1, uv1, new Data(2021, 10, 23), 14);
            jogoAndebol ja2 = new jogoAndebol(s2, uv2, new Data(2021, 10, 23), 14);
            jogoAndebol ja3 = new jogoAndebol(s3, uv3, new Data(2021, 10, 23), 14);
            jogoAndebol ja4 = new jogoAndebol(s4, uv4, new Data(2021, 10, 23), 14);
            jogoAndebol ja5 = new jogoAndebol(s5, uv5, new Data(2021, 10, 23), 14);

            jogoFutebol jf1 = new jogoFutebol(s1, uv1, new Data(2021, 10, 23), 14);
            jogoFutebol jf2 = new jogoFutebol(s2, uv2, new Data(2021, 10, 23), 14);
            jogoFutebol jf3 = new jogoFutebol(s3, uv3, new Data(2021, 10, 23), 14);
            jogoFutebol jf4 = new jogoFutebol(s4, uv4, new Data(2021, 10, 23), 14);
            jogoFutebol jf5 = new jogoFutebol(s5, uv5, new Data(2021, 10, 23), 14);

            jogoFutsal jfu1 = new jogoFutsal(s1, uv1, new Data(2021, 10, 23), 14);
            jogoFutsal jfu2 = new jogoFutsal(s2, uv2, new Data(2021, 10, 23), 14);
            jogoFutsal jfu3 = new jogoFutsal(s3, uv3, new Data(2021, 10, 23), 14);
            jogoFutsal jfu4 = new jogoFutsal(s4, uv4, new Data(2021, 10, 23), 14);
            jogoFutsal jfu5 = new jogoFutsal(s5, uv5, new Data(2021, 10, 23), 14);

            indoor5.adicionarJogos(ja1);
            indoor5.adicionarJogos(ja2);
            indoor5.adicionarJogos(ja3);
            indoor5.adicionarJogos(ja4);
            indoor5.adicionarJogos(ja5);
            indoor5.adicionarJogos(jf1);
            indoor5.adicionarJogos(jf2);
            indoor5.adicionarJogos(jf3);
            indoor5.adicionarJogos(jf4);
            indoor5.adicionarJogos(jf5);
            indoor5.adicionarJogos(jfu1);
            indoor5.adicionarJogos(jfu2);
            indoor5.adicionarJogos(jfu3);
            indoor5.adicionarJogos(jfu4);
            indoor5.adicionarJogos(jfu5);

        }
        opcoesmenuprincipal();
    }

    private static void mostrarMenuPrincipal() {
        System.out.println("\n################ IndoorAt5 ################");
        System.out.println(" 1- Login");
        System.out.println(" 2- Registar");
        System.out.println(" 3- Info");
        System.out.println(" 4- Sair");
        System.out.println("###########################################");
        System.out.println("\n Qual sua opção? ");
    }

    private static void info() {
        System.out.println("\n############################## Info ##############################");
        System.out.println("############### Programa criado no ambito de LENG3 ###############");
        System.out.println("# Desenvolvido pelo grupo 2: Bernardo, Diogo, Hugo, Nuno e Tiago #");
        System.out.printf("##################################################################");
        indoor5.info();
        System.out.println("\n#################0 para voltar, 1 para criar admin################");
        int i = in.nextInt();
        if (i == 1)
        {
            mostrarMenuRegistoAd();
        }
    }

    private static void mostrarMenuLogin() {
        System.out.println("\n################## Login ##################");
        System.out.println("######## 0 como nome para cancelar ########");
        System.out.println("###########################################");
        loginuser();
    }

    private static void mostrarMenuRegisto() {
        System.out.println("\n################# Registar ################");
        System.out.println("######## 0 como nome para cancelar ########");
        System.out.println("###########################################");
        indoor5.registaruser();
    }

    private static void mostrarMenuRegistoAd() {
        System.out.println("\n################# Registar ################");
        System.out.println("######## 0 como nome para cancelar ########");
        System.out.println("###########################################");
        System.out.println("Password: ");
        String pw = in.next();
        if (pw.equals("Mitra"))
        {
            indoor5.registaruserAdmin();
        } else
        {
            System.out.println("Password errada...");
        }
    }

    private static void mostrarMenuAdmin() {
        System.out.printf("\n################# Menu Pessoal #################");
        System.out.println("\n 1 - Listar Utilizadores");
        System.out.println(" 2 - Listar Jogos");
        System.out.println(" 3 - Listar Sitios");
        System.out.println(" 4 - Listar Relacionamentos");
        System.out.println(" 5 - Listar Interesses");
        System.out.println(" 6 - Listar PaginasPessoais");
        System.out.println(" 7 - Alterar utilizador");
        System.out.println(" 8 - Alterar Sitios");
        System.out.println(" 9 - Eliminar Utilizador");
        System.out.println(" 10 - Eliminar Jogo");
        System.out.println(" 11 - Eliminar Sitio");
        System.out.println(" 12 - Voltar");
        System.out.println("###############################################");
        System.out.println("Qual a sua opção? ");
    }

    private static void opcoesmenuAdmin(Utilizador u) {
        int op;

        mostrarMenuAdmin();
        do
        {
            op = in.nextInt();
            switch (op)
            {
                case 1:
                {
                    indoor5.listarUsers();
                    mostrarMenuAdmin();
                    break;
                }
                case 2:
                {
                    indoor5.listarJogos();
                    mostrarMenuAdmin();
                    break;
                }
                case 3:
                {

                    indoor5.listarSitios();
                    mostrarMenuAdmin();
                    break;
                }

                case 4:
                {
                    indoor5.listarRelacionamentos();
                    mostrarMenuAdmin();
                    break;
                }
                case 5:
                {
                    indoor5.listarInteresses();
                    mostrarMenuAdmin();
                    break;
                }
                case 6:
                {
                    indoor5.listarPaginasPessoais();
                    mostrarMenuAdmin();
                    break;
                }
                case 7:
                {
                    System.out.println("Insira ID: ");
                    int id = in.nextInt();
                    indoor5.altUser(id);
                    mostrarMenuAdmin();
                    break;
                }
                case 8:
                {
                    System.out.println("Insira ID: ");
                    int id = in.nextInt();
                    indoor5.altSitios(id);
                    mostrarMenuAdmin();
                    break;
                }
                case 9:
                {
                    System.out.println("Insira ID: ");
                    int id = in.nextInt();
                    indoor5.elmUser(id);
                    mostrarMenuAdmin();
                    break;
                }
                case 10:
                {
                    System.out.println("Insira ID: ");
                    int id = in.nextInt();
                    indoor5.elmJogo(id);
                    mostrarMenuAdmin();
                    break;
                }
                case 11:
                {
                    System.out.println("Insira ID: ");
                    int id = in.nextInt();
                    indoor5.elmSitios(id);
                    mostrarMenuAdmin();
                    break;
                }
                case 12:
                {
                    System.out.println("Exit!");
                    break;
                }
                default:
                    System.out.println("Opção inválda. Selecione nova opção");
            }
        } while (op != 12);
    }

    private static void mostrarMenuJogador() {
        System.out.printf("\n############## Menu Pessoal ##############");
        System.out.println("\n 1 - Editar perfil");
        System.out.println(" 2 - Criar um jogo");
        System.out.println(" 3 - Juntar-se a um jogo");
        System.out.println(" 4 - Consultar jogos feitos");
        System.out.println(" 5 - Consultar jogos em que estou inscrito");
        System.out.println(" 6 - Criar página pessoal");
        System.out.println(" 7 - Consultar página pessoal");
        System.out.println(" 8 - Consultar página de outro utilizador");
        System.out.println(" 9 - Pedir amizade");
        System.out.println(" 10 - Fazer publicação");
        System.out.println(" 11 - Mostrar as minhas publicações");
        System.out.println(" 12 - Mostrar as publicações partilhadas comigo");
        System.out.println(" 13 - Mostrar os meus relacionamentos");
        System.out.println(" 14 - Comentar ou reagir a uma publicação");
        System.out.println(" 15 - Gerir equipas");
        System.out.println(" 16 - Entrar em um torneio");
        System.out.println(" 17 - Notificações");
        System.out.println(" 18 - Calendario");
        System.out.println(" 19 - Voltar");
        System.out.println("Qual a sua opção? ");
    }

    private static void mostrarMenuGerirEquipa() {
        System.out.printf("\n############## Equipas ##############");
        System.out.println("\n 1 - Criar equipa");
        System.out.println(" 2 - Ver minhas equipas");
        System.out.println(" 3 - Juntar-se a uma equipa");
        System.out.println(" 4 - Ver convites para equipas");
        System.out.println(" 5 - Sair de uma equipa");
        System.out.println(" 6 - Voltar");
        System.out.println("Qual a sua opção? ");
    }

    private static void opcoesmenuEquipa(Utilizador u) {
        int op;

        mostrarMenuGerirEquipa();
        do
        {
            op = in.nextInt();
            switch (op)
            {
                case 1:
                {
                    indoor5.criarequipa(u);
                    mostrarMenuGerirEquipa();
                    break;
                }
                case 2:
                {
                    indoor5.verequipas(u);
                    mostrarMenuGerirEquipa();
                    break;
                }
                case 3:
                {
                    indoor5.juntarEquipa(u);
                    mostrarMenuGerirEquipa();
                    break;
                }
                case 4:
                {
                    processarmenuconvite(u);
                    mostrarMenuGerirEquipa();
                    break;
                }
                case 5:
                {
                    indoor5.sairEquipa(u);
                    mostrarMenuGerirEquipa();
                    break;
                }
                case 6:
                {
                    break;
                }
                default:
                    System.out.println("Opção inválda. Selecione nova opção");
            }
        } while (op != 6);
    }

    private static void opcoesmenujogador(Utilizador u) {
        int op;

        mostrarMenuJogador();
        boolean sair = false;
        do
        {
            if (sair)
            {
                op = 19;
            } else
            {
                op = in.nextInt();
            }

            switch (op)
            {
                case 1:
                {
                    String tipo = u.getTipoDeUtilizador();
                    indoor5.registoErrado(u);
                    if (!tipo.equals(u.getTipoDeUtilizador()))
                    {
                        System.out.println("Tipo de utilizador alterado, faça login novamente!");
                        sair = true;
                    } else
                    {
                        mostrarMenuJogador();
                    }
                    break;
                }
                case 2:
                {
                    indoor5.criarjogo(u);
                    mostrarMenuJogador();
                    break;
                }
                case 3:
                {
                    indoor5.juntarJogo(u);
                    mostrarMenuJogador();
                    break;
                }
                case 4:
                {
                    indoor5.mostrarjogosfeitos(u);
                    mostrarMenuJogador();
                    break;
                }
                case 5:
                {
                    indoor5.mostrarjogosregistado(u);
                    mostrarMenuJogador();
                    break;
                }
                case 6:
                {
                    indoor5.criarpaginapessoal(u);
                    mostrarMenuJogador();
                    break;
                }
                case 7:
                {
                    indoor5.verpaginapessoalua(u);
                    mostrarMenuJogador();
                    break;
                }
                case 8:
                {
                    processarverpagina(u);
                    mostrarMenuJogador();
                    break;
                }
                case 9:
                {
                    processarpediramizade(u);
                    mostrarMenuJogador();
                    break;
                }
                case 10:
                {
                    indoor5.criarpublicacao(u);
                    mostrarMenuJogador();
                    break;
                }
                case 11:
                {
                    indoor5.verpublicacoesau(u);
                    mostrarMenuJogador();
                    break;
                }
                case 12:
                {
                    indoor5.verpublicacoespau(u);
                    mostrarMenuJogador();
                    break;
                }
                case 13:
                {
                    indoor5.vermeusrelacionamentos(u);
                    mostrarMenuJogador();
                    break;
                }
                case 14:
                {
                    processarmenupublicacao(u);
                    mostrarMenuJogador();
                    break;
                }
                case 15:
                {
                    opcoesmenuEquipa(u);
                    mostrarMenuJogador();
                    break;
                }
                case 16:
                {
                    processarmenuTorneio(u);
                    mostrarMenuJogador();
                    break;
                }
                case 17:
                {
                    indoor5.feed(u);
                    mostrarMenuJogador();
                    break;
                }
                case 18:
                {
                    indoor5.mostrarCalendario(u);
                    mostrarMenuJogador();
                    break;
                }
                case 19:
                {
                    break;
                }
                default:
                    System.out.println("Opção inválda. Selecione nova opção");
            }
        } while (op != 19);
    }

    private static void mostrarMenuArbito() {
        System.out.printf("\n############## Menu Pessoal ##############");
        System.out.println("\n 1 - Editar perfil");
        System.out.println(" 2 - Criar um jogo");
        System.out.println(" 3 - Juntar-se a um jogo (Jogador)");
        System.out.println(" 4 - Juntar-se a um jogo (Arbitro)");
        System.out.println(" 5 - Consultar jogos feitos");
        System.out.println(" 6 - Consultar jogos em que estou inscrito");
        System.out.println(" 7 - Criar página pessoal");
        System.out.println(" 8 - Consultar página pessoal");
        System.out.println(" 9 - Consultar página de outro utilizador");
        System.out.println(" 10 - Pedir amizade");
        System.out.println(" 11 - Fazer publicação");
        System.out.println(" 12 - Mostrar as minhas publicações");
        System.out.println(" 13 - Mostrar as publicações partilhadas comigo");
        System.out.println(" 14 - Mostrar os meus relacionamentos");
        System.out.println(" 15 - Comentar ou reagir a uma publicação");
        System.out.println(" 16 - Gerir equipas");
        System.out.println(" 17 - Entrar em um torneio");
        System.out.println(" 18 - Notificações");
        System.out.println(" 19 - Calendario");
        System.out.println(" 20 - Voltar");
        System.out.println("Qual a sua opção? ");
    }

    private static void opcoesmenuArbito(Utilizador u) {
        int op;

        mostrarMenuArbito();
        boolean sair = false;
        do
        {
            if (sair)
            {
                op = 19;
            } else
            {
                op = in.nextInt();
            }
            switch (op)
            {
                case 1:
                {
                    String tipo = u.getTipoDeUtilizador();
                    indoor5.registoErrado(u);
                    if (!tipo.equals(u.getTipoDeUtilizador()))
                    {
                        System.out.println("Tipo de utilizador alterado, faça login novamente!");
                        sair = true;
                    } else
                    {
                        mostrarMenuArbito();
                    }

                    break;
                }
                case 2:
                {
                    indoor5.criarjogo(u);
                    mostrarMenuArbito();
                    break;
                }
                case 3:
                {
                    indoor5.juntarJogo(u);
                    mostrarMenuArbito();
                    break;
                }
                case 4:
                {
                    indoor5.juntarJogoArb(u);
                    mostrarMenuArbito();
                    break;
                }
                case 5:
                {
                    indoor5.consultarjogosfeitos(u);
                    mostrarMenuArbito();
                    break;
                }
                case 6:
                {
                    indoor5.mostrarjogosregistado(u);
                    mostrarMenuArbito();
                    break;
                }
                case 7:
                {
                    indoor5.criarpaginapessoal(u);
                    mostrarMenuArbito();
                    break;
                }
                case 8:
                {
                    indoor5.verpaginapessoalua(u);
                    mostrarMenuArbito();
                    break;
                }
                case 9:
                {
                    processarverpagina(u);
                    mostrarMenuJogador();
                    break;
                }
                case 10:
                {
                    processarpediramizade(u);
                    mostrarMenuArbito();
                    break;
                }
                case 11:
                {
                    indoor5.criarpublicacao(u);
                    mostrarMenuArbito();
                    break;
                }
                case 12:
                {
                    indoor5.verpublicacoesau(u);
                    mostrarMenuArbito();
                    break;
                }
                case 13:
                {
                    indoor5.verpublicacoespau(u);
                    mostrarMenuArbito();
                    break;
                }
                case 14:
                {
                    indoor5.vermeusrelacionamentos(u);
                    mostrarMenuArbito();
                    break;
                }
                case 15:
                {
                    processarmenupublicacao(u);
                    mostrarMenuArbito();
                    break;
                }
                case 16:
                {
                    opcoesmenuEquipa(u);
                    mostrarMenuArbito();
                    break;
                }
                case 17:
                {
                    indoor5.entrarTorneio(u);
                    mostrarMenuArbito();
                    break;
                }
                case 18:
                {
                    indoor5.feed(u);
                    mostrarMenuArbito();
                    break;
                }
                case 19:
                {
                    indoor5.mostrarCalendario(u);
                    mostrarMenuArbito();
                    break;
                }
                case 20:
                {
                    System.out.println("Saindo....");
                    break;
                }
                default:
                    System.out.println("Opção inválda. Selecione nova opção");
            }
        } while (op != 20);
    }

    private static void mostrarMenuOrganizador() {
        System.out.printf("\n############## Menu Pessoal ##############");
        System.out.println("\n 1 - Editar perfil");
        System.out.println(" 2 - Criar um jogo");
        System.out.println(" 3 - Juntar-se a um jogo");
        System.out.println(" 4 - Registar novo local");
        System.out.println(" 5 - Alterar informações de um local");
        System.out.println(" 6 - Consultar informações de um local");
        System.out.println(" 7 - Consultar jogos feitos");
        System.out.println(" 8 - Consultar jogos em que estou inscrito");
        System.out.println(" 9 - Criar página pessoal");
        System.out.println(" 10 - Consultar página pessoal");
        System.out.println(" 11 - Consultar página de outro utilizador");
        System.out.println(" 12 - Pedir amizade");
        System.out.println(" 13 - Fazer publicação");
        System.out.println(" 14 - Mostrar as minhas publicações");
        System.out.println(" 15 - Mostrar as publicações partilhadas comigo");
        System.out.println(" 16 - Mostrar os meus relacionamentos");
        System.out.println(" 17 - Comentar ou Reagir a uma publicação");
        System.out.println(" 18 - Gerir equipas");
        System.out.println(" 19 - Criar torneio");
        System.out.println(" 20 - Começar torneio");
        System.out.println(" 21 - Entrar em um torneio");
        System.out.println(" 22 - Notificações");
        System.out.println(" 23 - Calendario");
        System.out.println(" 24 - Voltar");
        System.out.println("Qual a sua opção? ");
    }

    private static void opcoesmenuOrganizador(Utilizador u) {
        int op;

        mostrarMenuOrganizador();
        boolean sair = false;
        do
        {
            if (sair)
            {
                op = 19;
            } else
            {
                op = in.nextInt();
            }
            switch (op)
            {
                case 1:
                {
                    String tipo = u.getTipoDeUtilizador();
                    indoor5.registoErrado(u);
                    if (!tipo.equals(u.getTipoDeUtilizador()))
                    {
                        System.out.println("Tipo de utilizador alterado, faça login novamente!");
                        sair = true;
                    } else
                    {
                        mostrarMenuOrganizador();
                    }
                    break;
                }
                case 2:
                {
                    indoor5.criarjogo(u);
                    mostrarMenuOrganizador();
                    break;
                }
                case 3:
                {
                    indoor5.juntarJogo(u);
                    mostrarMenuOrganizador();
                    break;
                }
                case 4:
                {
                    indoor5.criarlocal(u);
                    mostrarMenuOrganizador();
                    break;
                }
                case 5:
                {
                    indoor5.alterarlocal(u);
                    mostrarMenuOrganizador();
                    break;
                }
                case 6:
                {
                    indoor5.mostrarlocal(u);
                    mostrarMenuOrganizador();
                    break;
                }
                case 7:
                {
                    indoor5.mostrarjogosfeitos(u);
                    mostrarMenuOrganizador();
                    break;
                }
                case 8:
                {
                    indoor5.mostrarjogosregistado(u);
                    mostrarMenuOrganizador();
                    break;
                }
                case 9:
                {
                    indoor5.criarpaginapessoal(u);
                    mostrarMenuOrganizador();
                    break;
                }
                case 10:
                {
                    indoor5.verpaginapessoalua(u);
                    mostrarMenuOrganizador();
                    break;
                }
                case 11:
                {
                    processarverpagina(u);
                    mostrarMenuOrganizador();
                    break;
                }
                case 12:
                {
                    processarpediramizade(u);
                    mostrarMenuOrganizador();
                    break;
                }
                case 13:
                {
                    indoor5.criarpublicacao(u);
                    mostrarMenuOrganizador();
                    break;
                }
                case 14:
                {
                    indoor5.verpublicacoesau(u);
                    mostrarMenuOrganizador();
                    break;
                }
                case 15:
                {
                    indoor5.verpublicacoespau(u);
                    mostrarMenuOrganizador();
                    break;
                }
                case 16:
                {
                    indoor5.vermeusrelacionamentos(u);
                    mostrarMenuOrganizador();
                    break;
                }
                case 17:
                {
                    processarmenupublicacao(u);
                    mostrarMenuOrganizador();
                    break;
                }
                case 19:
                {
                    indoor5.criartorneio();
                    mostrarMenuOrganizador();
                    break;
                }
                case 21:
                {
                    indoor5.entrarTorneio(u);
                    mostrarMenuOrganizador();
                    break;
                }
                case 22:
                {
                    indoor5.feed(u);
                    mostrarMenuOrganizador();
                    break;
                }
                case 23:
                {
                    indoor5.mostrarCalendario(u);
                    mostrarMenuOrganizador();
                    break;
                }
                case 20:
                {
                    indoor5.mostrartorneios();
                    mostrarMenuOrganizador();
                    break;
                }
                case 24:
                {
                    System.out.println("Saindo....");
                    break;
                }
                case 18:
                {
                    opcoesmenuEquipa(u);
                    mostrarMenuOrganizador();
                    break;
                }
                default:
                    System.out.println("Opção inválda. Selecione nova opção");
            }
        } while (op != 24);
    }

    private static void loginuser() {
        boolean sn = false;
        boolean ls = false;
        String nome = "";
        do
        {
            System.out.println("Username :");
            nome = in.next();
            if (indoor5.verf0s(nome) == false)
            {
                System.out.println("Pw :");
                String pw = in.next();
                if (indoor5.procurarUser(nome) != null)
                {
                    if (indoor5.procurarUser(nome).getPassword().equals(pw))
                    {
                        sn = true;
                        System.out.println("\nLogin com sucesso! \nBem vindo Sr/a. " + indoor5.procurarUser(nome).getUsername());
                        ls = true;

                    } else
                    {
                        System.out.println("Credenciais erradas: Password errada!");
                    }

                } else
                {
                    System.out.println("Credenciais erradas: Username errado!");
                }
            } else
            {
                System.out.println("Operação Cancelada!");
                sn = true;
            }
        } while (sn != true);
        if (ls == true)
        {
            switch (indoor5.procurarUser(nome).getTipoDeUtilizador())
            {
                case "Jogador":
                    opcoesmenujogador(indoor5.procurarUser(nome));
                    break;
                case "Arbito":
                    opcoesmenuArbito(indoor5.procurarUser(nome));
                    break;
                case "Organizador":
                    opcoesmenuOrganizador(indoor5.procurarUser(nome));
                    break;
                case "Admin":
                    opcoesmenuAdmin(indoor5.procurarUser(nome));
                    break;
                default:
                    break;

            }

        }
    }

    private static int menupublicacao(Utilizador u) {
        int id = indoor5.mostrarpublicacoes();
        if (id != 0)
        {
            System.out.println("\n\nO que deseja fazer?");
            System.out.println(" 1 - Comentar");
            System.out.println(" 2 - Reagir");
            System.out.println(" 3 - Voltar");
        }
        return id;
    }

    private static int menuConvite(Utilizador u) {
        int id = indoor5.convitesEquipa(u);
        if (id != 0)
        {
            System.out.println("\nO que deseja fazer?");
            System.out.println(" 1 - Aceitar");
            System.out.println(" 2 - Recusar");
            System.out.println(" 3 - voltar");

        }
        return id;
    }

    private static void processarmenuconvite(Utilizador u) {
        int op;

        int id = menuConvite(u);

        do
        {
            if (id != 0)
            {
                op = in.nextInt();
            } else
            {
                op = 3;
            }

            switch (op)
            {
                case 1:
                {
                    indoor5.aceitarConvite(u, id);
                    id = menuConvite(u);
                    break;
                }
                case 2:
                {
                    indoor5.apagarConvite(u, id);
                    id = menuConvite(u);
                    break;
                }
                case 3:
                    break;
                default:
                    System.out.println("Opção inválda. Selecione nova opção");
            }
        } while (op != 3);
    }

    private static void processarmenupublicacao(Utilizador u) {
        int op;
        int id = menupublicacao(u);
        if (id != 0)
        {
            do
            {
                if (id != 0)
                {
                    op = in.nextInt();
                } else
                {
                    op = 3;
                }

                switch (op)
                {
                    case 1:
                    {
                        indoor5.comentarpub(u, id);
                        id = menupublicacao(u);
                        break;
                    }
                    case 2:
                    {
                        processarmenureacoes(u, id);
                        id = menupublicacao(u);
                        break;
                    }
                    case 3:
                        break;
                    default:
                        System.out.println("Opção inválda. Selecione nova opção");
                }
            } while (op != 3);
        }

    }

    private static void menuTorneio(Utilizador u) {
        System.out.println("Torneios disponiveis: ");
        indoor5.mostrarTorneiosDispo(u);
        System.out.println(" 1 - Entrar no torneio");
        System.out.println(" 2 - Ver todos os torneios");
        System.out.println(" 3 - Voltar");
    }

    private static void processarmenuTorneio(Utilizador u) {
        int op;

        menuTorneio(u);
        do
        {
            op = in.nextInt();
            switch (op)
            {
                case 1:
                {
                    indoor5.entrarTorneio(u);
                    menuTorneio(u);
                    break;
                }
                case 2:
                {
                    indoor5.verTorneio(u);
                    menuTorneio(u);
                    break;
                }
                case 3:
                {
                    break;
                }
                default:
                    System.out.println("Opção inválda. Selecione nova opção");
            }
        } while (op != 4);
    }

    private static void menureacoes(Utilizador u) {
        System.out.printf("\n 1 - %s!", Reacoes.getTiporeacao().get(0));
        System.out.printf("\n 2 - %s!", Reacoes.getTiporeacao().get(1));
        System.out.printf("\n 3 - Ver todas a reacoes");
        System.out.printf("\n 4 - voltar\n");
    }

    private static void processarmenureacoes(Utilizador u, int id) {
        int op;

        menureacoes(u);
        do
        {
            op = in.nextInt();
            switch (op)
            {
                case 1:
                {
                    indoor5.reagirpub1(u, id);
                    menureacoes(u);
                    break;
                }
                case 2:
                {
                    indoor5.reagirpub2(u, id);
                    menureacoes(u);
                    break;
                }
                case 3:
                    indoor5.mostrartodasreacoes(u, id);
                    menureacoes(u);
                    break;
                case 4:
                    System.out.println("Voltando...");
                    break;
                default:
                    System.out.println("Opção inválda. Selecione nova opção");
            }
        } while (op != 4);
    }

    private static void Menupediramizade() {
        System.out.println("\nEscolha uma opcao:");
        System.out.println(" 1 - Ver todos os utilizadores disponveis");
        System.out.println(" 2 - Procurar por parametro");
        System.out.println(" 3 - Voltar");
    }

    private static void Menupediramizade2() {
        System.out.println("\nEscolha uma opcao:");
        System.out.println(" 1 - ID");
        System.out.println(" 2 - Nome");
        System.out.println(" 3 - Email");
        System.out.println(" 4 - Voltar");
    }

    private static void opcoesmenuprincipal() {
        int op;

        mostrarMenuPrincipal();
        do
        {
            op = in.nextInt();
            switch (op)
            {
                case 1:
                {
                    mostrarMenuLogin();
                    mostrarMenuPrincipal();
                    break;
                }
                case 2:
                {
                    mostrarMenuRegisto();
                    mostrarMenuPrincipal();
                    break;
                }
                case 3:
                {
                    info();
                    mostrarMenuPrincipal();
                    break;
                }
                case 4:
                {
                    Serializacao.gravarInformacaoRede("rede.dat", indoor5);
                    System.out.println("Exit");
                    break;
                }
                default:
                    System.out.println("Opção inválda. Selecione nova opção");
            }
        } while (op != 4);
    }

    private static void processarverpagina(Utilizador u) {
        int op;

        Menupediramizade();
        do
        {
            op = in.nextInt();
            switch (op)
            {
                case 1:
                {
                    indoor5.verusersdisponveispp(u);
                    Menupediramizade();
                    break;
                }
                case 2:
                {
                    processarverpagina2(u);
                    Menupediramizade();
                    break;
                }
                case 3:
                    System.out.println("Voltando...");
                default:
                    System.out.println("Opção inválda. Selecione nova opção");
            }
        } while (op != 3);

    }

    private static void processarverpagina2(Utilizador u) {
        int op;

        Menupediramizade2();
        do
        {
            op = in.nextInt();
            switch (op)
            {
                case 1:
                {
                    indoor5.procurarporIDp(u);
                    Menupediramizade2();
                    break;
                }
                case 2:
                {
                    indoor5.procurarporNomep(u);
                    Menupediramizade2();
                    break;
                }
                case 3:
                    indoor5.procurarporEmailp(u);
                    Menupediramizade2();
                    break;
                case 4:
                    System.out.println("Voltando...");
                    break;
                default:
                    System.out.println("Opção inválda. Selecione nova opção");
            }
        } while (op != 4);

    }

    private static void processarpediramizade(Utilizador u) {
        int op;

        Menupediramizade();
        do
        {
            op = in.nextInt();
            switch (op)
            {
                case 1:
                {
                    indoor5.verusersdisponveis(u);
                    Menupediramizade();
                    break;
                }
                case 2:
                {
                    processarpediramizade2(u);
                    Menupediramizade();
                    break;
                }
                case 3:
                    System.out.println("Voltando...");
                default:
                    System.out.println("Opção inválda. Selecione nova opção");
            }
        } while (op != 3);

    }

    private static void processarpediramizade2(Utilizador u) {
        int op;

        Menupediramizade2();
        do
        {
            op = in.nextInt();
            switch (op)
            {
                case 1:
                {
                    indoor5.procurarporID(u);
                    Menupediramizade2();
                    break;
                }
                case 2:
                {
                    indoor5.procurarporNome(u);
                    Menupediramizade2();
                    break;
                }
                case 3:
                    indoor5.procurarporEmail(u);
                    Menupediramizade2();
                    break;
                case 4:
                    System.out.println("Voltando...");
                    break;
                default:
                    System.out.println("Opção inválda. Selecione nova opção");
            }
        } while (op != 4);

    }
}
