/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.indoorat5.classes;

import com.indoorat5.datas.Data;
import java.io.Serializable;
import java.text.*;
import java.time.*;
import java.util.*;

/**
 *
 * @author berng
 */
public class Rede implements Serializable {

    private HashSet<Utilizador> vecUtilizadores;
    private ArrayList<Publicacao> vecPublicacoes;
    private ArrayList<Jogo> vecJogos;
    private ArrayList<Sitios> vecSitios;
    private ArrayList<PaginaPessoal> vecPagPessoal;
    private HashSet<Relacionamentos> vecRelacionamentos;
    private HashSet<Calendario> vecCalendario;
    private ArrayList<Interesses> vecInteresses;
    private HashSet<Torneios> vecTorneios;
    private HashSet<Equipas> vecEquipas;
    private HashSet<Notificacao> vecNotify;
    private HashSet<Convite> vecConvite;
    private HashSet<Utilizador> vecAmigosUser = new HashSet<>();
    static Scanner in = new Scanner(System.in).useDelimiter("\n");
    static Formatter out = new Formatter(System.out);

    /**
     * Construtor vazio
     */
    public Rede() {
        this.vecUtilizadores = new HashSet<>();
        this.vecPublicacoes = new ArrayList<>();
        this.vecJogos = new ArrayList<>();
        this.vecSitios = new ArrayList<>();
        this.vecPagPessoal = new ArrayList<>();
        this.vecInteresses = new ArrayList<>();
        this.vecRelacionamentos = new HashSet<>();
        this.vecCalendario = new HashSet<>();
        this.vecTorneios = new HashSet<>();
        this.vecEquipas = new HashSet<>();
        this.vecConvite = new HashSet<>();
        this.vecNotify = new HashSet<>();
    }

    /**
     *
     * @return
     */
    public ArrayList<Sitios> getVecSitios() {
        return vecSitios;
    }

    /**
     *
     * @return
     */
    public HashSet<Torneios> getVecTorneios() {
        return vecTorneios;
    }

    /**
     *
     * @return
     */
    public HashSet<Notificacao> getVecNotify() {
        return vecNotify;
    }

    /**
     *
     * @param vecNotify
     */
    public void setVecNotify(HashSet<Notificacao> vecNotify) {
        this.vecNotify = vecNotify;
    }

    /**
     *
     * @return
     */
    public HashSet<Convite> getVecConvite() {
        return vecConvite;
    }

    /**
     *
     * @param vecConvite
     */
    public void setVecConvite(HashSet<Convite> vecConvite) {
        this.vecConvite = vecConvite;
    }

    /**
     *
     * @return
     */
    public HashSet<Equipas> getVecEquipas() {
        return vecEquipas;
    }

    /**
     *
     * @return
     */
    public static Scanner getIn() {
        return in;
    }

    /**
     *
     * @return
     */
    public static Formatter getOut() {
        return out;
    }

    /**
     *
     * @return
     */
    public HashSet<Utilizador> getVecUtilizadores() {
        return this.vecUtilizadores;
    }

    /**
     *
     * @param vecTorneios
     */
    public void setVecTorneios(HashSet<Torneios> vecTorneios) {
        this.vecTorneios = vecTorneios;
    }

    /**
     *
     * @param vecEquipas
     */
    public void setVecEquipas(HashSet<Equipas> vecEquipas) {
        this.vecEquipas = vecEquipas;
    }

    /**
     *
     * @param in
     */
    public static void setIn(Scanner in) {
        Rede.in = in;
    }

    /**
     *
     * @param out
     */
    public static void setOut(Formatter out) {
        Rede.out = out;
    }

    /**
     *
     * @param Username
     * @param Password
     * @param TipoDeUtilizador
     * @param Modalidades
     * @param email
     * @param d
     */
    public void adicionarUsers(String Username, String Password, String TipoDeUtilizador, String Modalidades, String email, Data d) {
        vecUtilizadores.add(new Utilizador(Username, Password, TipoDeUtilizador, Modalidades, email, d));
    }

    /**
     *
     * @param u
     */
    public void adicionarUsers(Utilizador u) {
        vecUtilizadores.add(u);
    }

    /**
     *
     * @return
     */
    public ArrayList<Interesses> getVecInteresses() {
        return vecInteresses;
    }

    /**
     *
     * @return
     */
    public HashSet<Relacionamentos> getVecRelacionamentos() {
        return vecRelacionamentos;
    }

    /**
     *
     * @param vecRelacionamentos
     */
    public void setVecRelacionamentos(HashSet<Relacionamentos> vecRelacionamentos) {
        this.vecRelacionamentos = vecRelacionamentos;
    }

    /**
     *
     * @param eq
     */
    public void adicionarEquipas(Equipas eq) {
        this.vecEquipas.add(eq);
    }

    /**
     *
     * @param eq
     */
    public void adicionarTorneios(Torneios eq) {
        this.vecTorneios.add(eq);
    }

    /**
     *
     * @param ua
     * @param user
     * @param tipoamizade
     */
    public void adicionarRelacionamentos(Utilizador ua, Utilizador user, String tipoamizade) {
        this.vecRelacionamentos.add(new Relacionamentos(ua, user, tipoamizade));
    }

    /**
     *
     * @param r
     */
    public void adicionarRelacionamentos(Relacionamentos r) {
        this.vecRelacionamentos.add(r);
    }

    /**
     *
     * @param vecInteresses
     */
    public void setVecInteresses(ArrayList<Interesses> vecInteresses) {
        this.vecInteresses = vecInteresses;
    }

    /**
     *
     * @param designacao
     */
    public void adicionarInteresses(String designacao) {
        this.vecInteresses.add(new Interesses(designacao));
    }

    /**
     *
     * @param t
     */
    public void adicionarInteresses(Interesses t) {
        this.vecInteresses.add(t);
    }

    /**
     *
     * @param p
     */
    public void adicionarPublicacoes(Publicacao p) {
        vecPublicacoes.add(p);
    }

    /**
     *
     * @param j
     */
    public void adicionarJogos(Jogo j) {
        vecJogos.add(j);
    }

    /**
     *
     * @param j
     */
    public void adicionarSitios(Sitios j) {
        vecSitios.add(j);
    }

    /**
     *
     * @param j
     */
    public void adicionarPagPessoal(PaginaPessoal j) {
        vecPagPessoal.add(j);
    }

    /**
     *
     * @return
     */
    public ArrayList<Publicacao> getVecPublicacoes() {
        return vecPublicacoes;
    }

    /**
     *
     * @return
     */
    public ArrayList<Jogo> getVecJogos() {
        return vecJogos;
    }

    /**
     *
     * @param vecUtilizadores
     */
    public void setVecUtilizadores(HashSet<Utilizador> vecUtilizadores) {
        this.vecUtilizadores = vecUtilizadores;
    }

    /**
     *
     * @param vecPublicacoes
     */
    public void setVecPublicacoes(ArrayList<Publicacao> vecPublicacoes) {
        this.vecPublicacoes = vecPublicacoes;
    }

    /**
     *
     * @param vecJogos
     */
    public void setVecJogos(ArrayList<Jogo> vecJogos) {
        this.vecJogos = vecJogos;
    }

    /**
     *
     * @return
     */
    public ArrayList<PaginaPessoal> getVecPagPessoal() {
        return vecPagPessoal;
    }

    /**
     *
     * @param vecSitios
     */
    public void setVecSitios(ArrayList<Sitios> vecSitios) {
        this.vecSitios = vecSitios;
    }

    /**
     *
     * @param vecPagPessoal
     */
    public void setVecPagPessoal(ArrayList<PaginaPessoal> vecPagPessoal) {
        this.vecPagPessoal = vecPagPessoal;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.vecUtilizadores);
        hash = 59 * hash + Objects.hashCode(this.vecPublicacoes);
        hash = 59 * hash + Objects.hashCode(this.vecJogos);
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
        final Rede other = (Rede) obj;
        if (!Objects.equals(this.vecUtilizadores, other.vecUtilizadores))
        {
            return false;
        }
        if (!Objects.equals(this.vecPublicacoes, other.vecPublicacoes))
        {
            return false;
        }
        if (!Objects.equals(this.vecJogos, other.vecJogos))
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Rede{" + "vecUtilizadores=" + vecUtilizadores + ", vecPublicacoes=" + vecPublicacoes + ", vecJogos=" + vecJogos + '}';
    }

    /**
     *
     * @param u
     */
    public void mostrarlocal(Utilizador u) {
        for (Sitios st : vecSitios)
        {
            System.out.printf("\nID: %d - %s preco: %d \n %s Organizador: %s", st.getCod(), st.getNome(), st.getPrecoh(), st.getMorada(), st.getOrganizador().getUsername());
        }
        System.out.println("0 para continuar");
        in.next();
    }

    /**
     *
     * @param u
     */
    public void alterarlocal(Utilizador u) {
        System.out.println("Seus locais: ");
        if (existelocalua(u))
        {
            mostrarlocalua(u);
            System.out.println("Insira o ID do local que quer editar (0 para cancelar): ");
            int i = in.nextInt();
            if (!verf0i(i))
            {
                if (procurarlocal(i) != null)
                {
                    //procurarlocal(i);
                    int op1;
                    boolean sn = false;
                    do
                    {
                        System.out.println("O que deseja alterar?");
                        System.out.println("\n 1 - nome \n 2 - Morada \n 3 - preco \n 4 - Apagar \n 5 - Cancelar");
                        System.out.println("Opção: ");
                        op1 = in.nextInt();
                        switch (op1)
                        {
                            case 1:
                            {
                                System.out.println("Alterando nome: ");
                                procurarlocal(i).setNome(criarnomelocal());
                                System.out.println("Deseja alterar mais alguma coisa? (s/n)");
                                if (simnao())
                                {
                                    sn = true;
                                }
                                break;
                            }
                            case 2:
                            {
                                System.out.println("Alterando a morada: ");
                                procurarlocal(i).setMorada(criarmoradalocal());
                                System.out.println("Deseja alterar mais alguma coisa? (s/n)");
                                if (simnao())
                                {
                                    sn = true;
                                }
                                break;
                            }
                            case 3:
                            {
                                System.out.println("Alterando do preço: ");
                                procurarlocal(i).setPrecoh(criarprecolocal());
                                System.out.println("Deseja alterar mais alguma coisa? (s/n)");
                                if (simnao())
                                {
                                    sn = true;
                                }
                                break;
                            }
                            case 4:
                            {
                                getVecSitios().remove(procurarlocal(i));
                                System.out.println("Apagado!");
                                sn = true;
                            }
                            case 5:
                            {
                                sn = true;

                                break;
                            }
                            default:
                                System.out.println("Opção inválda. Selecione nova opção");
                        }
                    } while (sn != true);
                }

            } else
            {
                System.out.println("Operacao cancelada!");
            }
        } else
        {
            System.out.println("Nao existe nenhum local criado por si!");
        }
    }

    /**
     *
     * @param i
     * @return
     */
    public Sitios procurarlocal(int i) {
        for (Sitios st : getVecSitios())
        {
            if (st.getCod() == i)
            {
                return st;
            }
        }
        return null;
    }

    /**
     *
     * @param u
     */
    public void mostrarlocalua(Utilizador u) {
        for (Sitios st : getVecSitios())
        {
            if (st.getOrganizador().equals(u))
            {
                System.out.printf("\nID: %d - %s preco: %d \n %s Organizador: %s\n", st.getCod(), st.getNome(), st.getPrecoh(), st.getMorada(), st.getOrganizador().getUsername());
            }
        }
    }

    /**
     *
     * @param u
     * @return
     */
    public boolean existelocalua(Utilizador u) {
        for (Sitios st : getVecSitios())
        {
            if (st.getOrganizador().equals(u))
            {
                return true;
            }
        }
        return false;
    }

    /**
     *
     * @param u
     */
    public void criarlocal(Utilizador u) {
        String nome = criarnomelocal();
        String morada = criarmoradalocal();
        int preco = criarprecolocal();
        adicionarSitios(new Sitios(nome, morada, preco, u));
        System.out.println("Local criado com sucesso! (0 para continuar)");
        in.next();

    }

    /**
     *
     * @return
     */
    public String criarnomelocal() {
        String nome = "";
        System.out.println("Nome do local (0 para cancelar): ");
        String e = in.next();
        if (verf0s(nome) == false)
        {
            nome = e;
            return nome;
        }
        return nome;

    }

    /**
     *
     * @return
     */
    public String criarmoradalocal() {
        System.out.println("Morada: ");
        String str = in.next();
        return str;
    }

    /**
     *
     * @return
     */
    public int criarprecolocal() {
        System.out.println("Preco p/hora: ");
        return in.nextInt();
    }

    /**
     *
     * @param e
     * @return
     */
    public boolean verf0s(String e) {
        if (e.equals("0"))
        {
            System.out.println("Operacao cancelada!");
            return true;
        }
        return false;
    }

    /**
     *
     * @param e
     * @return
     */
    public boolean verf0ss(String e) {
        if (e.equals("0"))
        {
            return true;
        }
        return false;
    }

    /**
     *
     * @param e
     * @return
     */
    public boolean verf0i(int e) {
        if (e == 0)
        {
            System.out.println("Operacao cancelada!");
            return true;
        }
        return false;
    }

    /**
     *
     * @param source
     * @return
     */
    public Utilizador procurarUser(String source) {
        for (Utilizador obj : getVecUtilizadores())
        {
            if (obj.getUsername().equals(source))
            {
                return obj;
            }
        }
        return null;
    }

    /**
     *
     * @param source
     * @return
     */
    public Utilizador procurarUser(int source) {
        for (Utilizador obj : getVecUtilizadores())
        {
            if (obj.getId() == source)
            {
                return obj;
            }
        }
        return null;
    }

    /**
     *
     * @return
     */
    public String registemail() {
        String email = "";
        System.out.println("Email > ");
        boolean valido = false;
        do
        {
            String e = in.next();
            if (e.contains("@"))
            {
                if (verf0s(e) == false)
                {
                    email = e;
                    valido = true;
                    return email;
                }
            } else
            {
                valido = false;
                System.out.println("Insira um email valido...");
            }
        } while (!valido);

        return email;
    }

    /**
     *
     * @return
     */
    public String registnome() {
        String Username = "";
        System.out.println("Username > ");
        String e = in.next();
        if (verf0s(e) == false)
        {
            Username = e;
            return Username;
        }
        return Username;
    }

    /**
     *
     * @return
     */
    public String registpw() {
        System.out.println("PW > ");
        String Password = "";
        boolean blank = true;
        do
        {
            Password = in.next();
            if (Password.equals(""))
            {
                System.out.println("Insira uma password....");
            } else
            {
                blank = false;
            }
        } while (blank);

        return Password;
    }

    /**
     *
     * @return
     */
    public Data registdata() {
        boolean sn = false;
        do
        {
            try
            {
                String data = in.next();
                DateFormat df = new SimpleDateFormat("ddMMyyyy");
                df.setLenient(false);
                Date date = df.parse(data);
                if (data.length() == 8)
                {
                    int dia = Integer.parseInt(data.substring(0, 2));
                    int mes = Integer.parseInt(data.substring(2, 4));
                    int ano = Integer.parseInt(data.substring(4, 8));
                    Data d = new Data(ano, mes, dia);
                    sn = true;
                    return d;

                } else
                {
                    System.out.println("Insira uma data valida.");
                }
            } catch (ParseException ex)
            {
                sn = false;
                System.out.println("Insira uma data valida.");
            }
        } while (!sn);

        return null;
    }

    /**
     *
     * @return
     */
    public Data registdatanasc() {
        System.out.println("Data de nascimento: (ddmmaaaa ex:02072000)");
        Data d = registdata();
        return d;
    }

    /**
     *
     * @return
     */
    public String registtipouser() {
        String TipoDeUtilizador;
        System.out.println("Escolha o seu tipo de utilizador > ");
        for (int i = 0; i < Utilizador.tipouserdispo.size(); i++)
        {
            System.out.println(i + " - " + Utilizador.tipouserdispo.get(i));
        }
        int e = in.nextInt();
        TipoDeUtilizador = Utilizador.tipouserdispo.get(e);
        return TipoDeUtilizador;
    }

    /**
     *
     * @return
     */
    public String registmodalidade() {
        String Modalidades;
        System.out.println("Escolha a sua modalidade > ");
        for (int i = 0; i < Utilizador.Modalidadesdispo.size(); i++)
        {
            System.out.println(i + " - " + Utilizador.Modalidadesdispo.get(i));
        }
        int e = in.nextInt();
        Modalidades = Utilizador.Modalidadesdispo.get(e);
        return Modalidades;
    }

    /**
     *
     * @return
     */
    public boolean simnao() {
        String e = "";
        e += in.next();
        if (e.equals("s"))
        {
//            System.out.println("true");
            return true;
        }
//        System.out.println("false");
        return false;
    }

    /**
     *
     * @param u
     * @param id
     */
    public void reagirpub1(Utilizador u, int id) {
        procurarpublicacao(id).adicionarReacao(new Reacoes(u, Reacoes.getTiporeacao().get(0)));
        System.out.println("\nGOLOOOOOOOOOOOOO!");
    }

    /**
     *
     * @param u
     * @param id
     */
    public void reagirpub2(Utilizador u, int id) {
        procurarpublicacao(id).adicionarReacao(new Reacoes(u, Reacoes.getTiporeacao().get(1)));
        System.out.println("\nAo posteeee!");
    }

    /**
     *
     * @param u
     * @param id
     */
    public void mostrartodasreacoes(Utilizador u, int id) {
        for (Reacoes rea : procurarpublicacao(id).getVecReacao())
        {
            System.out.printf("\n %s - %s", rea.getUser().getUsername(), rea.getReacao());
        }
    }

    /**
     *
     * @param u
     * @param id
     */
    public void comentarpub(Utilizador u, int id) {
        System.out.println("Insira o comentario: (0 para cancelar)");
        String texto = in.next();
        if (!verf0s(texto))
        {
            procurarpublicacao(id).adicionarComentario(new Comentario(texto, u));
        } else
        {
            System.out.println("Operação Cancelada!");
        }
    }

    /**
     *
     * @return
     */
    public int mostrarpublicacoes() {
        System.out.println("Publicações:");
        for (Publicacao pub : getVecPublicacoes())
        {
            System.out.printf("ID: %d - %s, criada por %s\n", pub.getCodigoDePub(), pub.getTitulo(), pub.getUser().getUsername());
        }
        System.out.printf("\nQual publicação deseja ver (ID)? (0 para voltar)\n");
        int op = in.nextInt();
        if (op == 0)
        {
            System.out.println("Operação cancelada!");
        } else
        {
            System.out.printf("\n====================================================================");
            seepubs(op);
            System.out.printf("\n====================================================================");
            return procurarpublicacao(op).getCodigoDePub();
        }
        return 0;
        
    }

    /**
     *
     * @param id
     */
    public void seepubs(int id) {
        System.out.printf("\nTitulo: %s", procurarpublicacao(id).getTitulo());
        System.out.printf("\nID: %s", procurarpublicacao(id).getCodigoDePub());
        System.out.printf("\nCriador: %s", procurarpublicacao(id).getUser().getUsername());
        if (!procurarpublicacao(id).getModalidades().isEmpty())
        {
            System.out.printf("\nModalidade: %s", procurarpublicacao(id).getModalidades());
        }
        if (!procurarpublicacao(id).getUsersp().isEmpty())
        {
            System.out.printf("\nPartilhado com: ");
            int i = 0;
            for (Utilizador us : procurarpublicacao(id).getVecusersp())
            {
                System.out.printf("%s", us.getUsername());
                if (procurarpublicacao(id).getVecusersp().size() - 2 == i)
                {
                    System.out.print(" e ");
                } else if (procurarpublicacao(id).getVecusersp().size() - 1 == i)
                {
                    System.out.print(".");
                } else
                {
                    System.out.print(", ");
                }
                i++;
            }

        }
        System.out.printf("\nTexto: %s", procurarpublicacao(id).getTextoPub());
        if (!(procurarpublicacao(id).getVecReacao().isEmpty()))
        {
            System.out.printf("\n-----------------------------Reações------------------------------");
            for (Reacoes rea : procurarpublicacao(id).getVecReacao())
            {
                System.out.printf("\n%s: %s", rea.getUser().getUsername(), rea.getReacao());
            }
        }
        if (!procurarpublicacao(id).getVecComentario().isEmpty())
        {
            System.out.printf("\n----------------------------Comentarios----------------------------");
            for (Comentario com : procurarpublicacao(id).getVecComentario())
            {
                System.out.printf("\n%s: %s", com.getUser().getUsername(), com.getTexto());
            }
        }
    }

    /**
     *
     * @param i
     * @return
     */
    public Publicacao procurarpublicacao(int i) {
        for (Publicacao pub : getVecPublicacoes())
        {
            if (pub.getCodigoDePub() == i)
            {
                return pub;
            }
        }
        return null;
    }

    /**
     *
     * @param u
     */
    public void verpublicacoesau(Utilizador u) {
        System.out.println("Minhas publicações: ");
        int i = 0;
        for (Publicacao p : vecPublicacoes)
        {
            if (p.getUser().getId() == u.getId())
            {

                System.out.printf("\n====================================================================");
                seepubs(p.getCodigoDePub());
                System.out.printf("\n====================================================================");
                i++;
            }
        }
        if (i == 0)
        {
            System.out.println("\nNao tem nenhuma publicação!");
        }
        System.out.println("\n0 para voltar.");
        in.next();

    }

    /**
     *
     * @param u
     */
    public void verpublicacoespau(Utilizador u) {
        System.out.println("Publicacoes partilhada comigo: ");
        int i = 0;
        for (Publicacao p : getVecPublicacoes())
        {
            if (p.getVecusersp().contains(u))
            {
                seepubs(p.getCodigoDePub());
            }

        }
        if (i != 0)
        {
            System.out.println("Nao tem nenhuma publicação");
        }
        System.out.println("\n0 para voltar.");
        in.next();
    }

    /**
     *
     * @param u
     */
    public void criarpublicacao(Utilizador u) {
        HashSet<Utilizador> us = new HashSet<>();
        System.out.println("Titulo da publicacao: ");
        String titulo = in.next();
        System.out.println("Corpo da publicacao: ");
        String textopub = in.next();
        System.out.println("Deseja partilhar esta publicação na sua modalidade? (s/n)");
        if (simnao())
        {
            System.out.println("Deseja partilhar esta publição com algum amigo? (s/n)");
            if (simnao())
            {
                us = verusersamigosPartilhar(u);
                adicionarPublicacoes(new Publicacao(u, titulo, textopub, u.getModalidades(), us));
                String str = u.getUsername() + " criou uma publicação na modalidade " + u.getModalidades() + " e partilhou com ";
                for (int i = 0; i < us.size(); i++)
                {
                    for (Utilizador ul : us)
                    {
                        str += ul.getUsername();
                        if (us.size() - 2 == i)
                        {
                            str += " e ";
                        } else if (us.size() - 1 == i)
                        {
                            str += ".";
                        } else
                        {
                            str += ", ";
                        }
                        i++;
                    }
                }
                amigosuser(u);
                vecNotify.add(new Notificacao(vecAmigosUser, str));
                System.out.printf("\nPublicação partilhada na sua pagina pessoal, na modalide %s e com os utilizadores: ", u.getModalidades());
                int i = 0;
                for (Utilizador ul : us)
                {
                    System.out.printf("%s", ul.getUsername());
                    if (us.size() - 2 == i)
                    {
                        System.out.print(" e ");
                    } else if (us.size() - 1 == i)
                    {
                        System.out.print(".");
                    } else
                    {
                        System.out.print(", ");
                    }
                    i++;
                }
            } else
            {
                adicionarPublicacoes(new Publicacao(u, titulo, textopub, u.getModalidades(), us));
                amigosuser(u);
                vecNotify.add(new Notificacao(vecAmigosUser, u.getUsername() + " criou uma publicação na modalidade " + u.getModalidades() + "."));
                System.out.printf("\nPublicação partilhada na sua pagina pessoal e na modalide %s\n", u.getModalidades());
            }
        } else
        {
            adicionarPublicacoes(new Publicacao(u, titulo, textopub, "Nenhuma", us));
            amigosuser(u);
            vecNotify.add(new Notificacao(vecAmigosUser, u.getUsername() + " criou uma publicação."));
            System.out.printf("\nPublicação partilhada na sua pagina pessoal");
        }

    }

    /**
     *
     * @param ua
     * @return
     */
    public HashSet<Utilizador> verusersamigosPartilhar(Utilizador ua) {
        HashSet<Utilizador> us = new HashSet<>();
        ArrayList<Utilizador> t = new ArrayList<>();
        int i = 0;
        for (Utilizador user : vecUtilizadores)
        {
            if (verfrelacionamentoentreUsers(ua, user))
            {
                System.out.printf("\nID: %d - Nome: %s", user.getId(), user.getUsername());
            }
        }
        do
        {
            t.add(escolheruserPartilhar(ua));
            if (t.get(i) == null)
            {
                System.out.println("Operação cancelada ou ID errado! (Confirme que é amigo do utilizador com que esta a tentar partilhar.)");
            }
            System.out.println("Deseja Partilhar com mais algum utilizador? (s/n)");
            i++;
        } while (simnao());
        for (int j = 0; j < t.size(); j++)
        {
            if (t.get(j) != null)
            {
                us.add(t.get(j));
            }
        }
        return us;
    }

    /**
     *
     * @param ua
     * @return
     */
    public Utilizador escolheruserPartilhar(Utilizador ua) {
        System.out.println("\nInsira o ID do utilizador com deseja partilhar: (0 para cancelar)");
        int id = in.nextInt();
        if (id == 0)
        {
            return null;
        }

        for (Utilizador user : getVecUtilizadores())
        {
            if (user.getId() == id && verfrelacionamentoentreUsers(ua, user))
            {
                return user;
            }
        }
        return null;
    }

    /**
     *
     * @param u
     */
    public void juntarJogo(Utilizador u) {
        System.out.printf("\nJogos disponiveis para a sua modalidade (%s): ", u.getModalidades());
        jogosdispo(u, "Jogador");
    }

    /**
     *
     * @param u
     */
    public void juntarJogoArb(Utilizador u) {
        System.out.printf("\nJogos disponiveis para a sua modalidade (%s): ", u.getModalidades());
        jogosdispo(u, "Arbito");
    }

    /**
     *
     * @param u
     * @param tipouser
     */
    public void jogosdispo(Utilizador u, String tipouser) {
        ArrayList<Jogo> jogosdispo = new ArrayList<>();
        int op = 0;
        int canc = 0;
        if (vermodalidade(u).equals("Futebol"))
        {
            jogosdispo = mostrarjogoFutebol(u, tipouser);
            if (jogosdispo.isEmpty())
            {
                System.out.println("\nNao existem jogos disponveis para esta modalidade! \n(0 para continuar)\n");
                in.next();
            } else
            {
                for (int i = 0; i < jogosdispo.size(); i++)
                {
                    System.out.printf("\n %d - criado por: %s, local: %s, preço: %d€", i, jogosdispo.get(i).getVecUtilizadores().stream().findFirst().get().getUsername(), jogosdispo.get(i).getLocal().getNome(), jogosdispo.get(i).getLocal().getPrecoh());
                }
                canc = jogosdispo.size();
                System.out.println();
                System.out.printf("\n Insira o numero do jogo (%d para cancelar): \n", canc);
                op = in.nextInt();
                if (op == canc)
                {
                    System.out.println("Operação cancelada!");
                } else
                {
                    jogosdispo.get(op).addUtilizadores(u);
                    System.out.println("Você foi adicionado ao jogo!");
                }
            }
        } else if (vermodalidade(u).equals("Futsal"))
        {
            jogosdispo = mostrarjogoFutsal(u, tipouser);
            for (int i = 0; i < jogosdispo.size(); i++)
            {
                System.out.printf("\n %d - criado por: %s, local: %s, preço: %d€", i, jogosdispo.get(i).getVecUtilizadores().stream().findFirst().get().getUsername(), jogosdispo.get(i).getLocal().getNome(), jogosdispo.get(i).getLocal().getPrecoh());
            }
            canc = jogosdispo.size();
            System.out.printf("\n Insira o numero do jogo (%d para cancelar):\n ", canc);
            op = in.nextInt();
            if (op == canc)
            {
                System.out.println("Operação cancelada!");
            } else
            {
                jogosdispo.get(op).addUtilizadores(u);
                System.out.println("Você foi adicionado ao jogo!");
            }
        } else
        {
            jogosdispo = mostrarjogoAndebol(u, tipouser);
            for (int i = 0; i < jogosdispo.size(); i++)
            {
                System.out.printf("\n %d - criado por: %s, local: %s, preço: %d€", i, jogosdispo.get(i).getVecUtilizadores().stream().findFirst().get().getUsername(), jogosdispo.get(i).getLocal().getNome(), jogosdispo.get(i).getLocal().getPrecoh());
            }
            canc = jogosdispo.size();
            System.out.printf("\n Insira o numero do jogo (%d para cancelar): ", canc);
            op = in.nextInt();
            if (op == canc)
            {
                System.out.println("Operação cancelada!");
            } else
            {
                jogosdispo.get(op).addUtilizadores(u);
                System.out.println("Você foi adicionado ao jogo!");
            }
        }

    }

    /**
     *
     * @param u
     * @param tipouser
     * @return
     */
    public ArrayList<Jogo> mostrarjogoFutebol(Utilizador u, String tipouser) {
        ArrayList<Jogo> jogodispo = new ArrayList<>();
        for (int i = 0; i < vecJogos.size(); i++)
        {
            if (vecJogos.get(i) instanceof jogoFutebol)
            {
                if (vecJogos.get(i).getVecUtilizadores().size() < vermaxjogadoresFutebol((jogoFutebol) vecJogos.get(i), tipouser))
                {
                    jogodispo.add(vecJogos.get(i));
                }
            }
        }
        for (Jogo j : getVecJogos())
        {
            if (j instanceof jogoFutebol)
            {
                if (j.getVecUtilizadores().size() > vermaxjogadoresFutebol((jogoFutebol) j, tipouser))
                {
                    jogodispo.add(j);
                }

            }
        }
        return jogodispo;
    }

    /**
     *
     * @param u
     * @param tipouser
     * @return
     */
    public ArrayList<Jogo> mostrarjogoFutsal(Utilizador u, String tipouser) {
        ArrayList<Jogo> jogodispo = new ArrayList<>();
        for (Jogo j : getVecJogos())
        {
            if (j instanceof jogoFutsal)
            {
                if (j.getVecUtilizadores().size() < ((jogoFutsal) j).getNjogadores())
                {
                    jogodispo.add(j);
                }
            }
        }
        return jogodispo;
    }

    /**
     *
     * @param u
     * @param tipouser
     * @return
     */
    public ArrayList<Jogo> mostrarjogoAndebol(Utilizador u, String tipouser) {
        ArrayList<Jogo> jogodispo = new ArrayList<>();
        for (Jogo j : getVecJogos())
        {
            if (j instanceof jogoAndebol)
            {
                if (j.getVecUtilizadores().size() < vermaxjogadoresAndebol((jogoAndebol) j, tipouser))
                {
                    jogodispo.add(j);
                }
            }
        }
        return jogodispo;
    }

    /**
     *
     * @param j
     * @param tipouser
     * @return
     */
    public int vermaxjogadoresFutebol(jogoFutebol j, String tipouser) {
        int maxj = j.getNjogadores();
        if (tipouser.equals("Arbito"))
        {
            return maxj;
        }
        return (maxj - 1);
    }

    /**
     *
     * @param j
     * @param tipouser
     * @return
     */
    public int vermaxjogadoresFutsal(jogoFutsal j, String tipouser) {
        int maxj = j.getNjogadores();
        if (tipouser.equals("Arbito"))
        {
            return maxj;
        }
        return maxj - 1;
    }

    /**
     *
     * @param j
     * @param tipouser
     * @return
     */
    public int vermaxjogadoresAndebol(jogoAndebol j, String tipouser) {
        int maxj = j.getNjogadores();
        if (tipouser.equals("Arbito"))
        {
            return maxj;
        }
        return maxj - 1;
    }

    /**
     *
     * @param u
     */
    public void criarjogo(Utilizador u) {
        if (vermodalidade(u).equals("Futebol"))
        {
            criarjogoFutebol(u);
        } else if (vermodalidade(u).equals("Futsal"))
        {
            criarjogoFutsal(u);
        } else
        {
            criarjogoAndebol(u);
        }
        amigosuser(u);
        vecNotify.add(new Notificacao(vecAmigosUser, u.getUsername() + " criou um jogo na modalidade " + u.getModalidades()));
    }

    /**
     *
     * @param ua
     */
    public void amigosuser(Utilizador ua) {
        for (Relacionamentos r : vecRelacionamentos)
        {
            if (r.getUa().equals(ua))
            {
                vecAmigosUser.add(r.getUser());

            } else if (r.getUser().equals(ua))
            {
                vecAmigosUser.add(r.getUa());
            }
        }
    }

    /**
     *
     * @param u
     */
    public void criarjogoFutebol(Utilizador u) {
        jogoFutebol j = new jogoFutebol();
        System.out.printf("\nColoque o ID do local onde deseja fazer o jogo: ");
        ArrayList<Integer> ids = new ArrayList<>();
        for (int i = 0; i < vecSitios.size(); i++)
        {
            System.out.printf("\nID: %d - %s preço: %d", vecSitios.get(i).getCod(), vecSitios.get(i).getNome(), vecSitios.get(i).getPrecoh());
            ids.add(vecSitios.get(i).getCod());
        }
        System.out.println("");
        int e = 0;
        do
        {
            System.out.println("ID do local: ");
            e = in.nextInt();
            if (!ids.contains(e))
            {
                System.out.println("Insira um ID valido");
            }
        } while (!ids.contains(e));
        for (Sitios sit : vecSitios)
        {
            if (sit.getCod() == e)
            {
                j.setLocal(sit);
            }
        }
        j.addUtilizadores(u);
        System.out.println("Data do jogo (ex: ddmmaaaa ex:02072000): ");
        Data d = new Data();
        do
        {
            d = registdata();
        } while (d == null);
        j.setData(d);
        int nj = 0;
        do
        {
            System.out.printf("Numero de jogadores (max = %d): \n", j.getNjogadoresmaximo());
            nj = in.nextInt();
            if (nj > j.getNjogadoresmaximo())
            {
                System.out.println("Insira um numero abaixo do limite...");
            } else
            {
                j.setNjogadores(nj);
            }
        } while (nj > j.getNjogadoresmaximo());
        adicionarJogos(j);
        System.out.println("Jogo criado!");
        System.out.println("0 para voltar");
        in.next();
    }

    /**
     *
     * @param u
     */
    public void criarjogoFutsal(Utilizador u) {
        jogoFutsal j = new jogoFutsal();
        ArrayList<Integer> ids = new ArrayList<>();
        System.out.println("Coloque o ID de onde deseja fazer o jogo: ");
        for (int i = 0; i < vecSitios.size(); i++)
        {
            System.out.printf("\nID: %d - %s preço: %d", vecSitios.get(i).getCod(), vecSitios.get(i).getNome(), vecSitios.get(i).getPrecoh());
            ids.add(vecSitios.get(i).getCod());
        }
        int e = 0;
        do
        {
            System.out.println("ID do local: ");
            e = in.nextInt();
            if (!ids.contains(e))
            {
                System.out.println("Insira um ID valido");
            }
        } while (!ids.contains(e));
        for (Sitios sit : vecSitios)
        {
            if (sit.getCod() == e)
            {
                j.setLocal(sit);
            }
        }
        j.addUtilizadores(u);
        System.out.println("Data do jogo (ex: ddmmaaaa ex:02072000): ");
        Data d = new Data();
        do
        {
            d = registdata();
        } while (d == null);
        j.setData(d);
        int nj = 0;
        do
        {
            System.out.printf("Numero de jogadores (max = %d): \n", j.getNjogadoresmaximo());
            nj = in.nextInt();
            if (nj > j.getNjogadoresmaximo())
            {
                System.out.println("Insira um numero abaixo do limite...");
            } else
            {
                j.setNjogadores(nj);
            }
        } while (nj > j.getNjogadoresmaximo());
        adicionarJogos(j);
        System.out.println("Jogo criado!");
    }

    /**
     *
     * @param u
     */
    public void criarjogoAndebol(Utilizador u) {
        jogoAndebol j = new jogoAndebol();
        ArrayList<Integer> ids = new ArrayList<>();
        System.out.println("Coloque o ID de onde deseja fazer o jogo: ");
        for (int i = 0; i < vecSitios.size(); i++)
        {
            System.out.printf("\nID: %d - %s preço: %d", vecSitios.get(i).getCod(), vecSitios.get(i).getNome(), vecSitios.get(i).getPrecoh());
            ids.add(vecSitios.get(i).getCod());
        }
        int e = 0;
        do
        {
            System.out.println("ID do local: ");
            e = in.nextInt();
            if (!ids.contains(e))
            {
                System.out.println("Insira um ID valido");
            }
        } while (!ids.contains(e));
        for (Sitios sit : vecSitios)
        {
            if (sit.getCod() == e)
            {
                j.setLocal(sit);
            }
        }
        System.out.println("Data do jogo (ex: ddmmaaaa ex:02072000): ");
        Data d = new Data();
        do
        {
            d = registdata();
        } while (d == null);
        j.setData(d);
        int nj = 0;
        do
        {
            System.out.printf("Numero de jogadores (max = %d): \n", j.getNjogadoresmaximo());
            nj = in.nextInt();
            if (nj > j.getNjogadoresmaximo())
            {
                System.out.println("Insira um numero abaixo do limite...");
            } else
            {
                j.setNjogadores(nj);
            }
        } while (nj > j.getNjogadoresmaximo());
        adicionarJogos(j);
        System.out.println("Jogo criado!");
    }

    /**
     *
     * @param u
     * @return
     */
    public String vermodalidade(Utilizador u) {
        if (u.getModalidades().equals(Utilizador.Modalidadesdispo.get(0)))
        {
            return "Futebol";
        } else if (u.getModalidades().equals(Utilizador.Modalidadesdispo.get(1)))
        {
            return "Futsal";
        } else
        {
            return "Andebol";
        }

    }

    /**
     *
     * @param u
     * @return
     */
    public String vertipouser(Utilizador u) {
        if (u.getTipoDeUtilizador().equals(Utilizador.getTipouserdispo().get(0)))
        {
            return "Jogador";
        } else if (u.getTipoDeUtilizador().equals(Utilizador.getTipouserdispo().get(1)))
        {
            return "Arbito";
        }
        return "Organizador";

    }

    /**
     *
     * @param u
     * @return
     */
    public ArrayList<Jogo> consultarjogosfeitos(Utilizador u) {
        ArrayList<Jogo> Jogosf = new ArrayList<>();
        for (Jogo j : getVecJogos())
        {
            if (j.getVecUtilizadores().contains(u))
            {
                Jogosf.add(j);
            }
        }
        return Jogosf;
    }

    /**
     *
     * @param u
     */
    public void mostrarjogosfeitos(Utilizador u) {
        ArrayList<Jogo> Jogosf = consultarjogosfeitos(u);
        System.out.println("Jogos feitos: ");
        String mod = u.getModalidades();
        LocalDate date = LocalDate.now();
        boolean existe = false;
        Data dh = new Data(date.getYear(), date.getMonthValue(), date.getDayOfMonth());

        if (!Jogosf.isEmpty())
        {
            for (int i = 0; i < Jogosf.size(); i++)
            {
                if (!Jogosf.get(i).getData().isMaior(dh))
                {
                    if (mod.equals("Andebol"))
                    {
                        if (Jogosf.get(i) instanceof jogoAndebol)
                        {
                            existe = true;
                            System.out.printf("\n%d - %s,Data: %s", Jogosf.get(i).getId(), Jogosf.get(i).getLocal().getNome(), Jogosf.get(i).getData());
                        }
                    } else if (mod.equals("Futebol"))
                    {
                        if (Jogosf.get(i) instanceof jogoFutebol)
                        {
                            existe = true;
                            System.out.printf("\n%d - %s,Data: %s", Jogosf.get(i).getId(), Jogosf.get(i).getLocal().getNome(), Jogosf.get(i).getData());
                        }
                    } else if (mod.equals("Futsal"))
                    {
                        if (Jogosf.get(i) instanceof jogoFutsal)
                        {
                            existe = true;
                            System.out.printf("\n%d - %s,Data: %s", Jogosf.get(i).getId(), Jogosf.get(i).getLocal().getNome(), Jogosf.get(i).getData());
                        }
                    }
                }
            }
        } else
        {
            System.out.println("Nao existem jogos feitos.");
        }
        if (!existe)
        {
            System.out.println("Nao existem jogos feitos.");
        }
        System.out.println("\n0 para voltar.");
        in.next();
    }

    /**
     *
     * @param u
     */
    public void mostrarjogosregistado(Utilizador u) {
        ArrayList<Jogo> Jogosf = consultarjogosfeitos(u);
        System.out.println("Jogos feitos: ");
        String mod = u.getModalidades();
        if (!Jogosf.isEmpty())
        {
            for (int i = 0; i < Jogosf.size(); i++)
            {
                if (mod.equals("Andebol"))
                {
                    if (Jogosf.get(i) instanceof jogoAndebol)
                    {
                        System.out.printf("\n%d - %s,Data: %s", Jogosf.get(i).getId(), Jogosf.get(i).getLocal().getNome(), Jogosf.get(i).getData());
                    }
                } else if (mod.equals("Futebol"))
                {
                    if (Jogosf.get(i) instanceof jogoFutebol)
                    {
                        System.out.printf("\n%d - %s,Data: %s", Jogosf.get(i).getId(), Jogosf.get(i).getLocal().getNome(), Jogosf.get(i).getData());
                    }
                } else if (mod.equals("Futsal"))
                {
                    if (Jogosf.get(i) instanceof jogoFutsal)
                    {
                        System.out.printf("\n%d - %s,Data: %s", Jogosf.get(i).getId(), Jogosf.get(i).getLocal().getNome(), Jogosf.get(i).getData());
                    }
                }
            }

        } else
        {
            System.out.println("Nao existem jogos feitos.");
        }
        System.out.println("\n0 para voltar.");
        in.next();
    }

    /**
     *
     * @param ua
     */
    public void procurarporNome(Utilizador ua) {
        System.out.println("Insira o nome: ");
        String nome = in.next();
        boolean enc = false;
        for (Utilizador user : getVecUtilizadores())
        {
            if (user.getUsername().equals(nome))
            {
                enc = true;
                adicionarRelacionamentos(ua, user, Relacionamentos.getTipoami().get(0));
                System.out.printf("\nAgora é amigo de %s\n", user.getUsername());
            }
        }
        if (!enc)
        {
            System.out.println("Utilizador não encontrado!");
        }
    }

    /**
     *
     * @param ua
     */
    public void procurarporID(Utilizador ua) {
        System.out.println("Insira o ID: ");
        int id = in.nextInt();
        boolean enc = false;
        for (Utilizador user : getVecUtilizadores())
        {
            if (user.getId() == id)
            {
                enc = true;
                adicionarRelacionamentos(ua, user, Relacionamentos.getTipoami().get(0));
                System.out.printf("\nAgora é amigo de %s\n", user.getUsername());
            }
        }
        if (!enc)
        {
            System.out.println("Utilizador não encontrado!");
        }
    }

    /**
     *
     * @param ua
     */
    public void procurarporEmail(Utilizador ua) {
        System.out.println("Insira o nome: ");
        String email = in.next();
        boolean enc = false;
        for (Utilizador user : getVecUtilizadores())
        {
            if (user.getEmail().equals(email))
            {
                enc = true;
                adicionarRelacionamentos(ua, user, Relacionamentos.getTipoami().get(0));
                System.out.printf("\nAgora é amigo de %s\n", user.getUsername());
            }
        }
        if (!enc)
        {
            System.out.println("Utilizador não encontrado!");
        }
    }

    /**
     *
     * @param ua
     */
    public void procurarporNomep(Utilizador ua) {
        System.out.println("Insira o nome: ");
        String nome = in.next();
        boolean enc = false;
        for (Utilizador user : getVecUtilizadores())
        {
            if (user.getUsername().equals(nome))
            {
                enc = true;
                verpaginapessoaloutrouser(user);
            }
        }
        if (!enc)
        {
            System.out.println("Utilizador não encontrado!");
        }
    }

    /**
     *
     * @param ua
     */
    public void procurarporIDp(Utilizador ua) {
        System.out.println("Insira o ID: ");
        int id = in.nextInt();
        boolean enc = false;
        for (Utilizador user : getVecUtilizadores())
        {
            if (user.getId() == id)
            {
                enc = true;
                verpaginapessoaloutrouser(user);
            }
        }
        if (!enc)
        {
            System.out.println("Utilizador não encontrado!");
        }
    }

    /**
     *
     * @param ua
     */
    public void procurarporEmailp(Utilizador ua) {
        System.out.println("Insira o nome: ");
        String email = in.next();
        boolean enc = false;
        for (Utilizador user : getVecUtilizadores())
        {
            if (user.getEmail().equals(email))
            {
                enc = true;
                verpaginapessoaloutrouser(user);
            }
        }
        if (!enc)
        {
            System.out.println("Utilizador não encontrado!");
        }
    }

    /**
     *
     * @param ua
     */
    public void verusersdisponveis(Utilizador ua) {
        System.out.printf("\nUtilizadores Disponiveis: ");
        for (Utilizador user : vecUtilizadores)
        {
            if (!verfrelacionamentoentreUsers(ua, user))
            {
                if (ua.getId() != user.getId())
                {
                    System.out.printf("\nID: %d - Nome: %s", user.getId(), user.getUsername());
                }

            }
        }
        do
        {
            escolheruseradd(ua);
            System.out.println("\nDeseja adicionar mais algum utilizador? (s/n)");

        } while (simnao());

    }

    /**
     *
     * @param ua
     */
    public void verusersdisponveisp(Utilizador ua) {
        for (Utilizador user : vecUtilizadores)
        {
            if (!user.equals(ua))
            {
                System.out.printf("\nID: %d - Nome: %s", user.getId(), user.getUsername());
            } else
            {
                System.out.println("Pode observar a sua pagina pessoal no menu!");
            }
        }
        do
        {
            escolheruserverp(ua);
            System.out.println("Deseja partilhar com mais algum utilizador? (s/n)");

        } while (simnao());

    }

    /**
     *
     * @param ua
     */
    public void verusersdisponveispp(Utilizador ua) {
        for (Utilizador user : vecUtilizadores)
        {
            if (!user.equals(ua))
            {
                System.out.printf("\nID: %d - Nome: %s", user.getId(), user.getUsername());
            }
        }
        escolheruserverp(ua);

    }

    /**
     *
     * @param ua
     */
    public void escolheruseradd(Utilizador ua) {
        System.out.println("\nInsira o ID do utilizador que deseja adicionar: (0 para cancelar)");
        int id = in.nextInt();
        if (id != 0)
        {
            int i = 0;
            for (Utilizador user : vecUtilizadores)
            {
                if (user.getId() == id)
                {
                    if (user.getId() == ua.getId())
                    {
                        i++;
                        System.out.println("Não se pode adicionar a si mesmo!");
                    } else
                    {
                        if (!verfrelacionamentoentreUsers(ua, user))
                        {
                            i++;
                            adicionarRelacionamentos(ua, user, Relacionamentos.getTipoami().get(0));
                            amigosuser(ua);
                            vecNotify.add(new Notificacao(vecAmigosUser, ua.getUsername() + " e " + user.getUsername() + " são agora amigos."));
                            System.out.printf("\nVoce e %s são agora amigos!\n", user.getUsername());
                        } else
                        {
                            i++;
                            System.out.println("Já são amigos!");
                        }
                    }
                }
            }
            if (i == 0)
            {
                System.out.println("Utilizador não encontrado!");
            }
        } else
        {
            System.out.println("Operação cancelada!");
        }

    }

    /**
     *
     * @param ua
     */
    public void escolheruserverp(Utilizador ua) {
        System.out.println("\nInsira o ID do utilizador que deseja ver a pagina: ");
        int id = in.nextInt();
        boolean enc = false;
        for (Utilizador user : getVecUtilizadores())
        {
            if (user.getId() == id)
            {
                enc = true;
                verpaginapessoaloutrouser(user);
            } else if (ua.getId() == id)
            {
                System.out.println("Pode ver a sua pagina pessoal no menu....");
            }
            {

            }
        }
        if (!enc)
        {
            System.out.println("Utilizador não encontrado!");
        }
    }

    /**
     *
     * @param ua
     * @param u
     * @return
     */
    public boolean verfrelacionamentoentreUsers(Utilizador ua, Utilizador u) {
        for (Relacionamentos r : getVecRelacionamentos())
        {
            if (r.getUa().equals(ua) && r.getUser().equals(u))
            {
                return true;
            } else if (r.getUa().equals(u) && r.getUser().equals(ua))
            {
                return true;
            }
        }
        return false;
    }

    /**
     *
     * @param ua
     */
    public void vermeusrelacionamentos(Utilizador ua) {
        boolean existe = false;
//        System.out.println(".........................");
//        for (Relacionamentos r : vecRelacionamentos)
//        {
//            System.out.println(r.getUa().getUsername() + " e " + r.getUser().getUsername());
//        }
//        System.out.println(".........................");
        System.out.println("Seus relacionamentos: ");
        for (Relacionamentos r : vecRelacionamentos)
        {
            if (r.getUa().equals(ua))
            {
                existe = true;
                System.out.printf("\n%s: %s desde %s", r.getUser().getUsername(), r.getTipo(), r.getData());
            } else if (r.getUser().equals(ua))
            {
                existe = true;
                System.out.printf("\n%s: %s desde %s", r.getUa().getUsername(), r.getTipo(), r.getData());
            }
        }
        if (!existe)
        {
            System.out.println("Não tem nenhum relacionamento!");
        }
        System.out.println("\n0 para sair");
        in.next();
    }

    /**
     *
     * @param u
     */
    public void verpaginapessoalua(Utilizador u) {
        System.out.printf("\n----------------------Pagina pessoal de %s-------------------------\n", u.getUsername());
        System.out.printf("\nNome: %s", u.getUsername());
        System.out.printf("\nData de nascimento: %s", u.getDatadeNascimento());
        System.out.printf("\nModalidade: %s", u.getModalidades());
        if (encontrarPaginaPessoal(u) == null)
        {
            System.out.printf("\nDescrição: Crie a pagina pessoal para editar a sua descrição.");
            System.out.printf("\nInteresses: Crie a pagina pessoal para editar a sua descrição.");
        } else
        {
            System.out.printf("\nDescrição: %s", encontrarPaginaPessoal(u).getDescricao());
            System.out.printf("\nInteresses: ");
            int i = 0;
            for (PaginaPessoal pg : vecPagPessoal)
            {
                if (pg.getUtilizador().equals(u))
                {
                    for (Interesses inte : pg.getInteresses())
                    {
                        System.out.printf("%s", inte.getDesignacao());
                        if (pg.getInteresses().size() - 2 == i)
                        {
                            System.out.print(" e ");
                        } else if (pg.getInteresses().size() - 1 == i)
                        {
                            System.out.print(".");
                        } else
                        {
                            System.out.print(", ");
                        }
                        i++;
                    }

                }
            }

        }
        System.out.printf("\nNumero de amigos: %d", contarRelacionamentos(u));
        int i = 0;
        if (contarRelacionamentos(u) != 0)
        {
            System.out.printf("\nAmigos: ");
            i = 0;
            for (Relacionamentos us : encontrarRelacionamentos(u))
            {
                if (us.getUa().equals(u) || us.getUser().equals(u))
                {
                    System.out.printf("%s", us.getUa().getUsername());
                    if (encontrarRelacionamentos(u).size() - 2 == i)
                    {
                        System.out.print(" e ");
                    } else if (encontrarRelacionamentos(u).size() - 1 == i)
                    {
                        System.out.print(".");
                    } else
                    {
                        System.out.print(", ");
                    }
                    i++;
                }

            }
        }
        System.out.printf("\nNumero de Publicacoes: %s", contarPublicacoes(u));
        if (contarPublicacoes(u) != 0)
        {
            System.out.printf("\nPublicacoes: ");
            i = 0;
            for (Publicacao us : encontrarPublicacoes(u))
            {
                if (us.getUser().equals(u))
                {
                    System.out.printf("%s", us.getTitulo());
                    if (encontrarPublicacoes(u).size() - 2 == i)
                    {
                        System.out.print(" e ");
                    } else if (encontrarPublicacoes(u).size() - 1 == i)
                    {
                        System.out.print(".");
                    } else
                    {
                        System.out.print(", ");
                    }
                    i++;
                }
            }
        }
        System.out.printf("\n-------------------------------------------------------------------\n");
        System.out.println("\n -> 1 para ver todas as publicações ou 0 para voltar.");
        int opc = in.nextInt();
        if (opc == 1)
        {
            verpublicacoesau(u);
        }

    }

    /**
     *
     */
    public void mostrarpubstodas() {
        System.out.println(vecPublicacoes);
    }

    /**
     *
     * @param u
     */
    public void verpaginapessoaloutrouser(Utilizador u) {
        System.out.printf("\n----------------------Pagina pessoal de %s-------------------------\n", u.getUsername());
        System.out.printf("\nNome: %s", u.getUsername());
        System.out.printf("\nData de nascimento: %s", u.getDatadeNascimento());
        System.out.printf("\nModalidade: %s", u.getModalidades());
        if (encontrarPaginaPessoal(u) == null)
        {
            System.out.printf("\nDescrição: Este utilizador ainda nao configurou a sua pagina pessoal.");
            System.out.printf("\nInteresses: Este utilizador ainda nao configurou a sua pagina pessoal.");
        } else
        {
            System.out.printf("\nDescrição: %s", encontrarPaginaPessoal(u).getDescricao());
            System.out.printf("\nInteresses: ");
            int i = 0;
            for (Interesses us : vecInteresses)
            {
                System.out.printf("%s", us.getDesignacao());
                if (vecInteresses.size() - 2 == i)
                {
                    System.out.print(" e ");
                } else if (vecInteresses.size() - 1 == i)
                {
                    System.out.print(".");
                } else
                {
                    System.out.print(", ");
                }
                i++;
            }
        }
        System.out.printf("\nNumero de amigos: %d", contarRelacionamentos(u));
        int i = 0;
        if (contarRelacionamentos(u) != 0)
        {
            System.out.printf("\nAmigos: ");

            i = 0;
            for (Relacionamentos us : encontrarRelacionamentos(u))
            {
                if (us.getUa().equals(u) || us.getUser().equals(u))
                {
                    System.out.printf("%s", us.getUa().getUsername());
                    if (encontrarRelacionamentos(u).size() - 2 == i)
                    {
                        System.out.print(" e ");
                    } else if (encontrarRelacionamentos(u).size() - 1 == i)
                    {
                        System.out.print(".");
                    } else
                    {
                        System.out.print(", ");
                    }
                    i++;
                }

            }
        }

        System.out.printf("\nNumero de Publicacoes: %s", contarPublicacoes(u));
        if (contarPublicacoes(u) != 0)
        {
            System.out.printf("\nPublicacoes: ");
            i = 0;
            for (Publicacao us : encontrarPublicacoes(u))
            {
                if (us.getUser().equals(u))
                {
                    System.out.printf("%s", us.getTitulo());
                    if (encontrarPublicacoes(u).size() - 2 == i)
                    {
                        System.out.print(" e ");
                    } else if (encontrarPublicacoes(u).size() - 1 == i)
                    {
                        System.out.print(".");
                    } else
                    {
                        System.out.print(", ");
                    }
                    i++;
                }
            }
        }
        System.out.printf("\n-------------------------------------------------------------------\n");
        System.out.println("\n -> 1 para ver todas as publicações ou 0 para voltar.");
        int opc = in.nextInt();
        if (opc == 1)
        {
            verpublicacoesau(u);
        }
    }

    /**
     *
     * @param u
     * @return
     */
    public PaginaPessoal encontrarPaginaPessoal(Utilizador u) {
        for (PaginaPessoal obj : getVecPagPessoal())
        {
            if (u.equals(obj.getUtilizador()))
            {
                return obj;
            }
        }
        return null;
    }

    /**
     *
     * @return
     */
    public HashSet<Calendario> getVecCalendario() {
        return vecCalendario;
    }

    /**
     *
     * @param vecCalendario
     */
    public void setVecCalendario(HashSet<Calendario> vecCalendario) {
        this.vecCalendario = vecCalendario;
    }

    /**
     *
     * @param u
     * @return
     */
    public int contarRelacionamentos(Utilizador u) {
        int i = 0;
        for (Relacionamentos obj : vecRelacionamentos)
        {
            if (obj.getUa().equals(u))
            {
                i++;
            } else if (obj.getUser().equals(u))
            {
                i++;
            }
        }
        return i;
    }

    /**
     *
     * @param u
     * @return
     */
    public HashSet<Relacionamentos> encontrarRelacionamentos(Utilizador u) {
        HashSet<Relacionamentos> r = new HashSet<>();
        for (Relacionamentos obj : vecRelacionamentos)
        {
            if (obj.getUa().equals(u))
            {
                r.add(obj);
            } else if (obj.getUser().equals(u))
            {
                r.add(obj);
            }
        }
        return r;
    }

    /**
     *
     * @param u
     * @return
     */
    public int contarPublicacoes(Utilizador u) {
        int i = 0;
        for (Publicacao obj : getVecPublicacoes())
        {
            if (u.equals(obj.getUser()))
            {
                i++;
            }
        }
        return i;
    }

    /**
     *
     * @param u
     * @return
     */
    public HashSet<Publicacao> encontrarPublicacoes(Utilizador u) {
        HashSet<Publicacao> r = new HashSet<>();
        for (Publicacao obj : getVecPublicacoes())
        {
            if (u.equals(obj.getUser()))
            {
                r.add(obj);
            }
        }
        return r;
    }

    /**
     *
     * @param u
     */
    public void criarpaginapessoal(Utilizador u) {
        System.out.printf("\nVamos agora criar a sua pagina pessoal Sr/a. %s\n", u.getUsername());
        System.out.println("Após a criação vai poder observar os seus relacionamentos e publicações!");
        System.out.println("Vamos começar com uma descrição. Descreva-se: ");
        String descricao = in.next();
        System.out.println("Insira os seus interesses (ex: SLB (enter)) (0 para finalizar): ");
        HashSet<Interesses> inte = new HashSet<>();
        String s = "";
        do
        {
            s = in.next();
            if (!verf0ss(s))
            {
                inte.add(new Interesses(s));
            }
        } while (!verf0s(s));
        adicionarPagPessoal(new PaginaPessoal(u, descricao, inte, u.getModalidades()));
        System.out.println("Pagina pessoal criada com sucesso! (0 para voltar)");
        in.next();

    }

    /**
     *
     */
    public void registaruser() {
        String nome = registnome();
        if (nome.equals("") == false)
        {
            String pw = registpw();
            Data datanasc = registdatanasc();
            String email = registemail();
            String tipo = registtipouser();
            String modal = registmodalidade();
            adicionarUsers(new Utilizador(nome, pw, tipo, modal, email, datanasc));
            System.out.println("\nSr/a. " + procurarUser(nome).getUsername());
            System.out.println("As suas informações estão corretas? (s/n) ");
            String c = in.next();
            if (c.equals("n"))
            {
                registoErrado(procurarUser(nome));
            } else
            {
                System.out.println("Registado com sucesso, pode agora fazer login!");
            }
        } else
        {
            System.out.println("Operacao cancelada!");
        }

    }

    /**
     *
     */
    public void registaruserAdmin() {
        String nome = registnome();
        if (nome.equals("") == false)
        {
            String pw = registpw();
            String email = registemail();
            String tipo = "Admin";
            String modal = registmodalidade();
            Data datanasc = registdatanasc();
            adicionarUsers(new Utilizador(nome, pw, tipo, modal, email, datanasc));
            System.out.println("Sr/a. " + procurarUser(nome).getUsername());
            System.out.println("\n As suas informações estão corretas? (s/n) ");
            String c = in.next();
            if (c.equals("n"))
            {
                registoErrado(procurarUser(nome));
            } else
            {
                System.out.println("Registado com sucesso, pode agora fazer login!");
            }
        } else
        {
            System.out.println("Operacao cancelada!");
        }

    }

    /**
     *
     */
    public void listarUsers() {
        for (Utilizador user : getVecUtilizadores())
        {
            System.out.println(user);
        }
        System.out.println("0 para sair");
        in.next();
    }

    /**
     *
     */
    public void listarJogos() {
        for (Jogo jogo : getVecJogos())
        {
            System.out.println(jogo);
        }
        System.out.println("0 para sair");
        in.next();
    }

    /**
     *
     */
    public void listarSitios() {
        for (Sitios o : getVecSitios())
        {
            System.out.println(o);
        }
        System.out.println("0 para sair");
        in.next();

    }

    /**
     *
     */
    public void listarRelacionamentos() {
        for (Relacionamentos o : getVecRelacionamentos())
        {
            System.out.println(o);
        }
        System.out.println("0 para sair");
        in.next();

    }

    /**
     *
     */
    public void listarInteresses() {
        for (Interesses o : getVecInteresses())
        {
            System.out.println(o);
        }
        System.out.println("0 para sair");
        in.next();

    }

    /**
     *
     */
    public void listarPaginasPessoais() {
        for (PaginaPessoal o : getVecPagPessoal())
        {
            System.out.println(o);
        }
        System.out.println("0 para sair");
        in.next();

    }

    /**
     *
     * @param id
     */
    public void elmUser(int id) {
        for (Utilizador user : getVecUtilizadores())
        {
            if (user.getId() == id)
            {
                getVecUtilizadores().remove(user);
                System.out.println("Eliminado ID: " + id);
            }

        }
        System.out.println("0 para sair");
        in.next();
    }

    /**
     *
     * @param id
     */
    public void elmJogo(int id) {
        for (Jogo user : getVecJogos())
        {
            if (user.getId() == id)
            {
                getVecJogos().remove(user);
                System.out.println("Eliminado ID: " + id);
            }

        }
        System.out.println("0 para sair");
        in.next();
    }

    /**
     *
     * @param id
     */
    public void elmSitios(int id) {
        for (Sitios user : getVecSitios())
        {
            if (user.getCod() == id)
            {
                getVecSitios().remove(user);
                System.out.println("Eliminado ID: " + id);
            }

        }
        System.out.println("0 para sair");
        in.next();
    }

    /**
     *
     * @param id
     */
    public void altUser(int id) {
        registoErrado(procurarUser(id));
    }

    /**
     *
     * @param id
     */
    public void altSitios(int id) {
        int op1;
        boolean sn = false;
        do
        {
            System.out.println("\nO que deseja alterar?");
            System.out.printf(" 1 - nome (%s) \n 2 - Morada (%s) \n 3 - preco (%s) \n 4 - Apagar \n 5 - Cancelar", procurarlocal(id).getNome(), procurarlocal(id).getMorada(), procurarlocal(id).getPrecoh());
            op1 = in.nextInt();
            switch (op1)
            {
                case 1:
                {
                    System.out.println("Alterando nome: ");
                    procurarlocal(id).setNome(criarnomelocal());
                    System.out.println("Deseja alterar mais alguma coisa? (s/n)");
                    sn = simnao();
                    break;
                }
                case 2:
                {
                    System.out.println("Alterando a morada: ");
                    procurarlocal(id).setMorada(criarmoradalocal());
                    System.out.println("Deseja alterar mais alguma coisa? (s/n)");
                    sn = simnao();
                    break;
                }
                case 3:
                {
                    System.out.println("Alterando do preço: ");
                    procurarlocal(id).setPrecoh(criarprecolocal());
                    System.out.println("Deseja alterar mais alguma coisa? (s/n)");
                    sn = simnao();
                    break;
                }
                case 4:
                {
                    getVecSitios().remove(procurarlocal(id));
                    System.out.println("Apagado!");
                    sn = true;
                }
                case 5:
                {
                    sn = true;

                    break;
                }
                default:
                    System.out.println("Opção inválda. Selecione nova opção");
            }
        } while (sn);
    }

    /**
     *
     * @param u
     * @return
     */
    public boolean registoErrado(Utilizador u) {
//        System.out.println(u.toString());

        int op1;
        boolean sn = false;
        do
        {
            System.out.println("\nO que deseja alterar?");
            System.out.printf(" 1 - nome (%s) \n 2 - password (%s) \n 3 - data de nascimento (%s) \n 4 - Tipo de utilizador (%s) \n 5 - Modalidade (%s) \n 6 - Cancelar \n", u.getUsername(), u.getPassword(), u.getDatadeNascimento(), u.getTipoDeUtilizador(), u.getModalidades());
            op1 = in.nextInt();
            switch (op1)
            {
                case 1:
                {
                    System.out.println("\nAlterando nome");
                    u.setUsername(registnome());
                    System.out.println("Deseja alterar mais alguma coisa? (s/n)");
                    sn = simnao();
                    break;
                }
                case 2:
                {
                    System.out.println("Alterando password");
                    u.setPassword(registpw());
                    System.out.println("Deseja alterar mais alguma coisa? (s/n)");
                    sn = simnao();
                    break;
                }
                case 3:
                {
                    System.out.println("Alterando data de nascimento");
                    Data d = new Data();
                    do
                    {
                        d = registdatanasc();
                    } while (d == null);
                    u.setDatadeNascimento(d);
                    System.out.println("Deseja alterar mais alguma coisa? (s/n)");
                    sn = simnao();
                    break;
                }
                case 4:
                {
                    System.out.println("Alterando tipo de utilizador");
                    u.setTipoDeUtilizador(registtipouser());
                    System.out.println("Deseja alterar mais alguma coisa? (s/n)");
                    sn = simnao();
                    break;
                }
                case 5:
                {
                    System.out.println("Alterando modalidade");
                    u.setModalidades(registmodalidade());
                    System.out.println("Deseja alterar mais alguma coisa? (s/n)");
                    sn = simnao();
                    break;
                }
                case 6:
                {
                    sn = false;
                }
                default:
                    System.out.println("Opção inválda. Selecione nova opção");
            }
        } while (sn);
        return true;
    }

    /**
     *
     * @param u
     * @return
     */
    public ArrayList<Relacionamentos> relacionamentosComUser(Utilizador u) {
        ArrayList<Relacionamentos> relacionamentos = new ArrayList<>();
        for (Relacionamentos r : vecRelacionamentos)
        {
            if (r.getUser().equals(u))
            {
                relacionamentos.add(r);
//                System.out.printf("\n%s adicionou-o como amigo.", r.getUa().getUsername());

            }
        }
        return relacionamentos;
    }

    /**
     *
     * @param u
     * @return
     */
    public ArrayList<Jogo> jogosCriadosPorAmigos(Utilizador u) {
        HashSet<Relacionamentos> Rel = encontrarRelacionamentos(u);
        ArrayList<Jogo> jogos = new ArrayList<>();
        for (Jogo j : vecJogos)
        {
            for (Relacionamentos relacionamentos : Rel)
            {
                if (relacionamentos.getUser().equals(u))
                {
                    if (relacionamentos.getTipo().equals("Amigo"))
                    {
                        jogos.add(j);
//                        System.out.printf("\nO seu amigo %s criou um jogo na modalidade %s.", relacionamentos.getUa(), relacionamentos.getUa().getModalidades());
                    }
                }
            }
        }
        return jogos;
    }

    /**
     *
     * @param u
     * @return
     */
    public ArrayList<Publicacao> pubsPcomigo(Utilizador u) {
        ArrayList<Publicacao> pubs = new ArrayList<>();
        for (Publicacao p : getVecPublicacoes())
        {
            if (p.getVecusersp().contains(u))
            {
                pubs.add(p);
            }

        }
        return pubs;
    }

    /**
     *
     * @param u
     * @return
     */
    public HashMap<Integer, String> feedJogos(Utilizador u) {
        ArrayList<Jogo> jogos = jogosCriadosPorAmigos(u);
        HashMap<Integer, String> hm = new HashMap<>();
        LocalDate date = LocalDate.now();
        Data d1 = new Data(date.getYear(), date.getMonthValue(), date.getDayOfMonth());
        for (int i = 0; i < jogos.size(); i++)
        {
            hm.put(jogos.get(i).getData().calcularDiferenca(d1), jogos.get(i).getVecUtilizadores().stream().findFirst().get().getUsername() + " criou um jogo na modalidade " + jogos.get(i).getVecUtilizadores().stream().findFirst().get().getModalidades() + ".");
        }
        return hm;
    }

    /**
     *
     * @param u
     * @return
     */
    public HashMap<Integer, String> feedRelacionamentos(Utilizador u) {
        ArrayList<Relacionamentos> rel = relacionamentosComUser(u);
        HashMap<Integer, String> hm = new HashMap<>();
        LocalDate date = LocalDate.now();
        Data d1 = new Data(date.getYear(), date.getMonthValue(), date.getDayOfMonth());
        for (int i = 0; i < rel.size(); i++)
        {
            hm.put(rel.get(i).getData().calcularDiferenca(d1), rel.get(i).getUser().getUsername() + " adicionou-o como amigo.");
        }
        return hm;
    }

    /**
     *
     * @param u
     * @return
     */
    public HashMap<Integer, String> feedPublicacoes(Utilizador u) {
        ArrayList<Publicacao> pubs = pubsPcomigo(u);
        HashMap<Integer, String> hm = new HashMap<>();
        LocalDate date = LocalDate.now();
        Data d1 = new Data(date.getYear(), date.getMonthValue(), date.getDayOfMonth());
        for (int i = 0; i < pubs.size(); i++)
        {
            hm.put(pubs.get(i).getDataDeCriacao().calcularDiferenca(d1), pubs.get(i).getUser() + " partilhou uma publicação consigo.");
        }
        return hm;
    }

    /**
     *
     * @param u
     */
    public void feed(Utilizador u) {
        System.out.printf("\n---------------------------Notificações----------------------------\n");
        for (Notificacao not : vecNotify)
        {
            if (not.getUser().contains(u))
            {
                System.out.println(not.getStr());
            }
        }
        System.out.println("------------------------------------------------------------------\n");
        System.out.println("0 para sair...");
        in.next();
//        ArrayList<Publicacao> pubs = pubsPcomigo(u);
//        Collections.sort(pubs);
//        ArrayList<Relacionamentos> rel = relacionamentosComUser(u);
//        Collections.sort(rel);
//        ArrayList<Jogo> jogos = jogosCriadosPorAmigos(u);
//        Collections.sort(jogos);
//        ArrayList<String> str = new ArrayList<>();
//        for (Publicacao pub : pubs)
//        {
//            for (Relacionamentos relacionamentos : rel)
//            {
//                for (Jogo jogo : jogos)
//                {
//                    if (!jogo.getData_criacao().isMaior(relacionamentos.getData()) && !jogo.getData_criacao().isMaior(pub.getDataDeCriacao()))
//                    {
//                        str.add(jogo.getVecUtilizadores().stream().findFirst().get().getUsername() + " criou um jogo na modalidade " + jogo.getVecUtilizadores().stream().findFirst().get().getModalidades() + ".");
//                    } else if (!jogo.getData_criacao().isMaior(relacionamentos.getData()) && jogo.getData_criacao().isMaior(pub.getDataDeCriacao()))
//                    {
//                        if (!relacionamentos.getData().isMaior(pub.getDataDeCriacao()))
//                        {
//                            str.add(relacionamentos.getUser().getUsername() + " adicionou-o como amigo.");
//                        }
//                    }
//                }
//            }
//        }
//        HashMap<Integer, String> hmj = feedJogos(u);
//        HashMap<Integer, String> hmp = feedPublicacoes(u);
//        HashMap<Integer, String> hmr = feedRelacionamentos(u);
//        HashMap<Integer, String> hmf = feedRelacionamentos(u);
//        TreeMap<Integer, String> sorted1 = new TreeMap<>(Collections.reverseOrder());
//        sorted1.putAll(hmj);
//        TreeMap<Integer, String> sorted2 = new TreeMap<>(Collections.reverseOrder());
//        sorted2.putAll(hmp);
//        TreeMap<Integer, String> sorted3 = new TreeMap<>(Collections.reverseOrder());
//        sorted3.putAll(hmr);
//        for (int i : sorted1.keySet())
//        {
//            
//        }
//        for (String str : sorted1.values())
//        {
//            System.out.println(str);
//        }

//        int m = Math.max(relacionamentos.size(), jogos.size());
//        int max = Math.max(m, pubs.size());
//        int i = 0, j = 0, n = 0;
//        do
//        {
//            if (i > relacionamentos.size())
//            {
//                if (relacionamentos.get(i).getData().isMaior(jogos.get(j).getData()) && relacionamentos.get(i).getData().isMaior(pubs.get(n).getDataDeCriacao()))
//                {
//                    System.out.printf("\n%s adicionou-o como amigo.", relacionamentos.get(i));
//                    if (jogos.get(j).getData().isMaior(pubs.get(n).getDataDeCriacao()))
//                    {
//                        System.out.printf("\n%s criou um jogo na modalidade %s.",jogos.get(j).getVecUtilizadores().stream().findFirst().get().getUsername(),jogos.get(j).getVecUtilizadores().stream().findFirst().get().getModalidades());
//                        System.out.printf("\n%s partilhou uma publicação consigo.", pubs.get(n).getUser());
//                    }else{
//                        System.out.printf("\n%s partilhou uma publicação consigo.", pubs.get(n).getUser());
//                        System.out.printf("\n%s criou um jogo na modalidade %s.",jogos.get(j).getVecUtilizadores().stream().findFirst().get().getUsername(),jogos.get(j).getVecUtilizadores().stream().findFirst().get().getModalidades());                       
//                    }
//                }else if (relacionamentos.get(i).getData().isMaior(jogos.get(j).getData()) && !relacionamentos.get(i).getData().isMaior(pubs.get(n).getDataDeCriacao())){
//                    
//                }
//            }
//        } while (i!=relacionamentos.size() && j != jogos.size() && n != pubs.size());
//        for (Publicacao pub : vecPublicacoes)
//        {
//            System.out.println("»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»");
//            System.out.printf("\nID: %s", pub.getCodigoDePub());
//            System.out.printf("\nCriador: %s", pub.getUser().getUsername());
//            if (!pub.getModalidades().isEmpty())
//            {
//                System.out.printf("\nModalidade: %s", pub.getModalidades());
//            }
//            if (!pub.getUsersp().isEmpty())
//            {
//                System.out.printf("\nPartilhado com: %s", pub.getUsersp());
//            }
//            System.out.printf("\nTitulo: %s", pub.getTitulo());
//            System.out.printf("\nTexto: %s", pub.getTextoPub());
//            if (!pub.getVecComentario().isEmpty())
//            {
//                System.out.println("------------------------------------------------------------------");
//                System.out.printf("\nComentarios:");
//                for (Comentario com : pub.getVecComentario())
//                {
//                    System.out.printf("\n%s: %s", com.getUser().getUsername(), com.getTexto());
//                }
//            }
//            System.out.println("»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»");
//        }
    }

    /**
     *
     * @return
     */
    public ArrayList<Jogo> ordenarJogos() {
        Collections.sort(vecJogos);
        ArrayList<Jogo> jogos = new ArrayList<>();
        for (int i = 0; i < vecJogos.size(); i++)
        {
            jogos.add(vecJogos.get(i));
        }
        return jogos;
    }

    /**
     *
     * @param u
     * @return
     */
    public Calendario procurarcalendario(Utilizador u) {
        for (Calendario cal : vecCalendario)
        {
            if (u.getId() == cal.getUser().getId())
            {
                return cal;
            }
        }
        return null;
    }

    /**
     *
     * @param d
     * @return
     */
    public ArrayList<Jogo> JogosHoje(Data d) {
        ArrayList<Jogo> j = new ArrayList<>();
        for (Jogo jogo : vecJogos)
        {
            if (jogo.getData().equals(d))
            {
                j.add(jogo);
            }
        }
        return j;
    }

    /**
     *
     * @param u
     * @param j
     * @return
     */
    public boolean userNoJogo(Utilizador u, Jogo j) {
        if (j.getVecUtilizadores().contains(u))
        {
            return true;
        }
        return false;
    }

    /**
     *
     * @param u
     */
    public void mostrarCalendario(Utilizador u) {
        System.out.println("Eventos desde a criação do seu utilizador: ");
        LocalDate date = LocalDate.now();
        ArrayList<Jogo> jogos = ordenarJogos();
        Data di = new Data(jogos.get(0).getData());
        Data df = new Data(jogos.get(jogos.size() - 1).getData());
        Data daa = new Data(u.getDatadecriacao());
        Data da = daa;
        boolean tf = false;
        int i = 0;
        for (int j = 0; j < u.getDatadecriacao().calcularDiferenca(df) + 10; j++)
        {
            System.out.printf("\n%s: ", da.toAnoMesDiaString());
            for (Jogo jogo : jogos)
            {
                if (jogo.getData().equals(da))
                {
                    if (userNoJogo(u, jogo))
                    {
                        i = 0;
                        for (Jogo jogo1 : JogosHoje(da))
                        {
                            System.out.printf("Jogo em %s", jogo1.getLocal().getNome());
                            tf = true;
                            if (JogosHoje(da).size() - 2 == i)
                            {
                                System.out.print(" e ");
                            } else if (JogosHoje(da).size() - 1 == i)
                            {
                                System.out.print(".");
                            } else
                            {
                                System.out.print(", ");
                            }
                            i++;
                        }
                    }
                } else
                {
                    tf = false;
                }

            }
            if (!tf)
            {
                System.out.printf("-----------");
            } else
            {
                tf = true;
            }
            LocalDate datee = LocalDate.of(da.getAno(), da.getMes(), da.getDia());
            LocalDate dateee = datee.plusDays(1);
            da.setData(dateee.getYear(), dateee.getMonthValue(), dateee.getDayOfMonth());
        }
        System.out.println("");
        System.out.println("0 para voltar...");
        in.next();

    }

    /**
     *
     * @return
     */
    public Utilizador userMpubs() {
        Utilizador u = null;
        int i = 0;
        int npubs = 0;
        int nmax = 0;
        for (Utilizador us : vecUtilizadores)
        {
            for (Publicacao pubs : vecPublicacoes)
            {
                if (pubs.getUser().equals(us) || pubs.getUsersp().contains(us))
                {
                    npubs++;
                }
            }
            if (npubs > nmax || i == 0)
            {
                u = us;
                nmax = npubs;
            }
            i++;
        }
        return u;
    }

    /**
     *
     * @return
     */
    public Utilizador userMrel() {
        Utilizador u = null;
        int i = 0;
        int npubs = 0;
        int nmax = 0;
        for (Utilizador us : vecUtilizadores)
        {
            for (Relacionamentos pubs : vecRelacionamentos)
            {
                if (pubs.getUa().equals(us))
                {
                    npubs++;
                }
            }
            if (npubs > nmax || i == 0)
            {
                u = us;
                nmax = npubs;
            }
            i++;
        }
        return u;
    }

    /**
     *
     * @return
     */
    public Utilizador userMjogos() {
        Utilizador u = null;
        int i = 0;
        int npubs = 0;
        int nmax = 0;
        for (Utilizador us : vecUtilizadores)
        {
            for (Jogo pubs : vecJogos)
            {
                if (pubs.getVecUtilizadores().contains(us))
                {
                    npubs++;
                }
            }
            if (npubs > nmax || i == 0)
            {
                u = us;
                nmax = npubs;
            }
            i++;
        }
        return u;
    }

    /**
     *
     * @return
     */
    public Utilizador userMpopular() {
        Utilizador u = null;
        int i = 0;
        int npubs = 0;
        int nmax = 0;
        for (Utilizador us : vecUtilizadores)
        {
            for (Publicacao pubs : vecPublicacoes)
            {
                if (pubs.getUser().equals(us) || pubs.getUsersp().contains(us))
                {
                    npubs++;
                }
            }
            for (Jogo pubs : vecJogos)
            {
                if (pubs.getVecUtilizadores().contains(us))
                {
                    npubs++;
                }
            }
            for (Relacionamentos pubs : vecRelacionamentos)
            {
                if (pubs.getUa().equals(us))
                {
                    npubs++;
                }
            }
            if (npubs > nmax || i == 0)
            {
                u = us;
                nmax = npubs;
            }
            i++;
        }

        return u;
    }

    /**
     *
     * @param u
     * @param i
     */
    public void aceitarConvite(Utilizador u, int i) {
        for (Equipas eq : vecEquipas)
        {
            if (eq.getIdequipa() == i)
            {
                eq.adicionarUtilizador(u);
                System.out.println("Convite aceite!");
                for (Convite conv : vecConvite)
                {
                    if (conv.getEquipa().equals(eq))
                    {
                        conv.getUserp().remove(u);
                    }
                }
            }
        }
    }

    /**
     *
     * @param u
     */
    public void verequipas(Utilizador u) {
        System.out.println("Equipas: ");
        boolean existe = false;
        for (Equipas eq : vecEquipas)
        {
            if (eq.getUtilizador().contains(u))
            {
                existe = true;
                System.out.printf("\n%d - %s, composta por:", eq.getIdequipa(), eq.getNome());
                for (Utilizador users : eq.getUtilizador())
                {
                    System.out.printf(" [%s];", users.getUsername());
                }
            }
        }
        if (!existe)
        {
            System.out.println("Não esta inserido em nenhuma equipa");
        }
        System.out.println("\n0 para voltar...");
        in.next();
    }

    /**
     *
     * @param u
     */
    public void entrarEquipa(Utilizador u) {
        for (Equipas eq : vecEquipas)
        {
            if (!eq.getUtilizador().contains(u))
            {
                System.out.printf("\n%d - %s, composta por: %s", eq.getIdequipa(), eq.getNome(), eq.getUtilizador());
            }
        }
        System.out.println("Insira o ID da equipa a que se quer juntar: ");
        int i = in.nextInt();
        for (Equipas eq : vecEquipas)
        {
            if (eq.getIdequipa() == i)
            {
                eq.adicionarUtilizador(u);
                System.out.printf("\nBem vindo a equipa %s!", eq.getNome());
                for (Convite conv : vecConvite)
                {
                    if (conv.getEquipa().equals(eq))
                    {
                        conv.getUserp().remove(u);
                    }
                }
            }
        }
    }

    /**
     *
     * @param u
     * @param i
     */
    public void apagarConvite(Utilizador u, int i) {
        for (Equipas eq : vecEquipas)
        {
            if (eq.getIdequipa() == i)
            {
                for (Convite conv : vecConvite)
                {
                    if (conv.getEquipa().equals(eq))
                    {
                        conv.getUserp().remove(u);
                        System.out.println("Convite removido!");
                    }
                }
            }
        }
    }

    /**
     *
     * @param u
     * @return
     */
    public int convitesEquipa(Utilizador u) {
        System.out.println("Convites recebidos: ");
        boolean existe = false;
        for (Convite conv : vecConvite)
        {
            if (conv.getUserp().contains(u))
            {
                existe = true;
                System.out.printf("\n%d - %s, convidado por %s", conv.getEquipa().getIdequipa(), conv.getEquipa().getNome(), conv.getUser().getUsername());
            }
        }
        int op = 0;
        if (!existe)
        {
            System.out.println("Não tem nenhum convite! (0 para sair)");
        }else{
            System.out.println("\nInsira o ID do convite para se juntar ou apagar. (0 para sair)");
        }
        
        op = in.nextInt();
        if (op != 0)
        {
            return procurarconvite(op).getEquipa().getIdequipa();
        }
        return 0;
    }

    /**
     *
     * @param u
     */
    public void mostrarTorneiosDispo(Utilizador u) {
        System.out.println("Torneios disponiveis para a sua modalidade: ");
        for (Torneios torn : vecTorneios)
        {
            if (torn.getModalidades().equals(u.getModalidades()))
            {
                System.out.printf("\n%d - %s , premio: %d\n", torn.getIdtorneios(), torn.getNome(), torn.getPrizePool());
            }
        }

    }

    /**
     *
     * @param u
     */
    public void verTorneio(Utilizador u) {
        System.out.println("Torneios: ");
        for (Torneios torn : vecTorneios)
        {
            System.out.printf("\n%d - %s , premio: %d", torn.getIdtorneios(), torn.getNome(), torn.getPrizePool());
        }

    }

    /**
     *
     * @param u
     */
    public void entrarTorneio(Utilizador u) {
        mostrarTorneiosDispo(u);
        System.out.println("ID do torneio: ");
        boolean existe = false;
        do
        {
            int id = in.nextInt();
            for (Torneios torn : vecTorneios)
            {
                if (torn.getIdtorneios() == id)
                {
                    existe = true;
                }
            }
            if (!existe)
            {
                System.out.println("Insira um ID valido ou 0 para cancelar.");
            }
            if (id == 0)
            {
                existe = true;
            }
        } while (!existe);
        System.out.println("Insira o ID da equipa com que deseja entrar: ");
        existe = false;
        for (Equipas eq : vecEquipas)
        {
            if (eq.getUtilizador().contains(u))
            {
                existe = true;
                System.out.printf("\n%d - %s, constituido por: ", eq.getIdequipa(), eq.getNome(), eq.getUtilizador());
            }
        }
        int opc;
        if (!existe)
        {
            System.out.println("Não tem nenhuma equipa, operação cancelada!");
        } else
        {
            opc = in.nextInt();
            for (Torneios torn : vecTorneios)
            {
                for (Equipas eq : vecEquipas)
                {
                    if (eq.getIdequipa() == opc)
                    {
                        if (!torn.getEquipa().contains(eq))
                        {
                            torn.adicionarEquipas(eq);
                        } else
                        {
                            System.out.println("A sua equipa já esta registada no torneio....");
                        }

                    }
                }
            }
        }
        System.out.println("0 para voltar...");
        in.next();

    }

    /**
     *
     * @param i
     * @return
     */
    public Convite procurarconvite(int i) {
        for (Convite pub : vecConvite)
        {
            if (pub.getEquipa().getIdequipa() == i)
            {
                return pub;
            }
        }
        return null;
    }

    /**
     *
     * @return
     */
    public int mostrarConvite() {
        System.out.println("Publicações:");
        for (Publicacao pub : getVecPublicacoes())
        {
            System.out.printf("ID: %d - %s, criada por %s\n", pub.getCodigoDePub(), pub.getTitulo(), pub.getUser().getUsername());
        }
        System.out.printf("\nQual publicação deseja ver (ID)? (%d para voltar)\n", getVecPublicacoes().size() + 1);
        int op = in.nextInt();
        if (op == vecPublicacoes.size() + 1)
        {
            System.out.println("Operação cancelada!");
        } else
        {
            System.out.printf("\n====================================================================");
            seepubs(op);
            System.out.printf("\n====================================================================");
        }
        return procurarpublicacao(op).getCodigoDePub();
    }

    /**
     *
     * @return
     */
    public String modMpopular() {
        int fut = 0, and = 0, fute = 0;
        for (Utilizador us : vecUtilizadores)
        {
            if (us.getModalidades().equals("Futebol"))
            {
                fute++;
            } else if (us.getModalidades().equals("Futsal"))
            {
                fut++;
            } else
            {
                and++;
            }
        }
        if (Math.max(and, Math.max(fute, fut)) == and)
        {
            return "Andebol";
        } else if (Math.max(and, Math.max(fute, fut)) == fute)
        {
            return "Futebol";
        } else
        {
            return "Futesal";
        }
    }

    /**
     *
     * @param u
     */
    public void infouser(Utilizador u) {

    }

    /**
     *
     * @return
     */
    public Publicacao pubMint() {
        Publicacao p = null;
        int nint = 0;
        int m = 0;
        int i = 0;
        for (Publicacao pub : vecPublicacoes)
        {
            if (i == 0)
            {
                m = pub.getNccomentarios() + pub.getVecReacao().size();
                nint = m;
                p = pub;
            }
            nint = pub.getNccomentarios() + pub.getVecReacao().size();
            if (nint > m)
            {
                m = nint;
                p = pub;
            }
            i++;
        }
        return p;
    }

    /**
     *
     */
    public void info() {
        System.out.printf("\nNumero de utilizadores: %d", vecUtilizadores.size());
        System.out.printf("\nNumero de paginas pessoais configuradas: %d", vecPagPessoal.size());
        System.out.printf("\nNumero de relacionamentos: %d", vecRelacionamentos.size());
        System.out.printf("\nNumero de locais registados: %d", vecSitios.size());
        System.out.printf("\nNumero de publicações: %d", vecPublicacoes.size());
        System.out.printf("\nNumero de jogos criados: %d", vecJogos.size());
        System.out.printf("\nNumero de torneios realizados: %d", vecTorneios.size());
        System.out.printf("\nNumero de equipas criadas: %d", vecEquipas.size());
        System.out.printf("\nPublicação com mais interações: %s", pubMint().getTitulo());
        System.out.printf("\nUtilizador com mais publicações: %s", userMpubs().getUsername());
        System.out.printf("\nUtilizador com mais relacionamentos: %s", userMrel().getUsername());
        System.out.printf("\nUtilizador com mais jogos: %s", userMjogos().getUsername());
        System.out.printf("\nUtilizador mais popular: %s", userMpopular().getUsername());
        System.out.printf("\nModalidade mais popular: %s", modMpopular());
    }

    /**
     *
     * @param u
     */
    public void criarequipa(Utilizador u) {
        System.out.println("Nome da equipa: ");
        String nome = in.next();
        System.out.println("Modalidade da equipa: ");
        String Modalidades;
        for (int i = 0; i < Utilizador.Modalidadesdispo.size(); i++)
        {
            System.out.println(i + " - " + Utilizador.Modalidadesdispo.get(i));
        }
        int e = in.nextInt();
        Modalidades = Utilizador.Modalidadesdispo.get(e);
        System.out.println("Numero max de jogadores: ");
        int maxj = in.nextInt();
        HashSet<Utilizador> us = new HashSet<>();
        us.add(u);
        HashSet<Utilizador> cus = new HashSet<>();
        System.out.println("Deseja convidar algum amigo para a equipa? (s/n)");
        if (simnao())
        {
            adicionarEquipas(new Equipas(nome, us, maxj, Modalidades));
            for (Equipas eq : vecEquipas)
            {
                if (eq.getNome().equals(nome) && eq.getNumeroDeJogadoresMax() == maxj)
                {
                    mandarconvite(verusersamigosInvitar(u), eq, u);
                }
            }

//            int i = 0;
//            for (Utilizador ul : us)
//            {
//                System.out.printf("%s", ul.getUsername());
//                if (us.size() - 2 == i)
//                {
//                    System.out.print(" e ");
//                } else if (us.size() - 1 == i)
//                {
//                    System.out.print(".");
//                } else
//                {
//                    System.out.print(", ");
//                }
//                i++;
//            }
        }else{
            adicionarEquipas(new Equipas(nome, us, maxj, Modalidades));
        }
        
        System.out.printf("\nEquipa criada!");
    }

    /**
     *
     * @param us
     * @param eq
     * @param u
     */
    public void mandarconvite(HashSet<Utilizador> us, Equipas eq, Utilizador u) {
        vecConvite.add(new Convite(u, eq, us));
    }

    /**
     *
     * @param ua
     * @return
     */
    public Utilizador escolheruserInvite(Utilizador ua) {
        System.out.println("\nInsira o ID do utilizador que deseja convidar: (0 para cancelar)");
        int id = in.nextInt();
        if (id == 0)
        {
            return null;
        }

        for (Utilizador user : vecUtilizadores)
        {
            if (user.getId() == id && verfrelacionamentoentreUsers(ua, user))
            {
                return user;
            }
        }
        return null;
    }

    /**
     *
     * @param ua
     * @return
     */
    public HashSet<Utilizador> verusersamigosInvitar(Utilizador ua) {
        HashSet<Utilizador> us = new HashSet<>();
        ArrayList<Utilizador> t = new ArrayList<>();
        int i = 0;
        for (Utilizador user : vecUtilizadores)
        {
            if (verfrelacionamentoentreUsers(ua, user))
            {
                System.out.printf("\nID: %d - Nome: %s", user.getId(), user.getUsername());
            }
        }
        do
        {
            t.add(escolheruserInvite(ua));
            if (t.get(i) == null)
            {
                System.out.println("Operação cancelada ou ID errado! (Confirme que é amigo do utilizador que esta a tentar convidar.)");
            }
            System.out.println("Deseja convidar mais algum utilizador? (s/n)");
            i++;
        } while (simnao());
        for (int j = 0; j < t.size(); j++)
        {
            if (t.get(j) != null)
            {
                us.add(t.get(j));
            }
        }
        return us;
    }

    /**
     *
     */
    public void criartorneio() {
        System.out.println("Nome do torneio: ");
        String nome = in.next();
        System.out.println("Modalidade: ");
        String Modalidades;
        for (int i = 0; i < Utilizador.Modalidadesdispo.size(); i++)
        {
            System.out.println(i + " - " + Utilizador.Modalidadesdispo.get(i));
        }
        int e = in.nextInt();
        Modalidades = Utilizador.Modalidadesdispo.get(e);
        System.out.println("Prize pool: ");
        int prize = in.nextInt();
        HashSet<Utilizador> utilizador = new HashSet<>();
        adicionarTorneios(new Torneios(nome, prize, utilizador, Modalidades));
        System.out.println("Torneio criado!");
        System.out.println("0 para contiuar...");
        in.next();
    }

    /**
     *
     */
    public void mostrartorneios() {
        if (!vecTorneios.isEmpty())
        {
            for (Torneios torn : vecTorneios)
            {
                System.out.printf("%d - %s, equipas registadas: %d, modalidade: %s\n", torn.getIdtorneios(), torn.getNome(), torn.getEquipa().size(), torn.getModalidades());
            }
            System.out.println("Insira o ID do torneio que deseja começar: ");
            boolean valido = false;
            Torneios torneio = null;
            do
            {
                int id = in.nextInt();
                if (id == 0)
                {
                    valido = true;
                }
                for (Torneios t : vecTorneios)
                {
                    if (t.getIdtorneios() == id)
                    {
                        valido = true;
                        torneio = t;
                    }
                }
                if (!valido)
                {
                    System.out.println("Insira um ID valido ou 0 para cancelar.");
                }
            } while (!valido);
            if (valido)
            {
                comecartorneio(torneio);
            }
        } else
        {
            System.out.println("Não existem torneios...");
            System.out.println("0 para voltar...");
            in.next();
        }

    }

    /**
     *
     * @param t
     */
    public void comecartorneio(Torneios t) {
        ArrayList<Equipas> equipas = hashToArray(t.getEquipa());
        ArrayList<String> sequipas = new ArrayList<>();
        if (equipas.size() == 4)
        {
            System.out.println("Torneio: " + t.getNome());
            mostrarChaveTorneio(equipas);
        } else
        {
            switch (equipas.size())
            {
                case 0:
                    equipas.add(new Equipas("Equipa 1"));
                    equipas.add(new Equipas("Equipa 2"));
                    equipas.add(new Equipas("Equipa 3"));
                    equipas.add(new Equipas("Equipa 4"));
                    break;
                case 1:
                    equipas.add(new Equipas("Equipa 1"));
                    equipas.add(new Equipas("Equipa 2"));
                    equipas.add(new Equipas("Equipa 3"));
                    break;
                case 2:
                    equipas.add(new Equipas("Equipa 1"));
                    equipas.add(new Equipas("Equipa 2"));
                    break;
                case 3:
                    equipas.add(new Equipas("Equipa 1"));
                    break;
                default:
                    throw new AssertionError();
            }
            System.out.println("Torneio: " + t.getNome());
            mostrarChaveTorneio(equipas);
        }
        System.out.println("Torneio criado!");
        System.out.println("0 para voltar...");
        in.next();
    }

    /**
     *
     * @param equipas
     */
    public void mostrarChaveTorneio(ArrayList<Equipas> equipas) {

        Collections.shuffle(equipas);
        int lengthmax = 0;
        for (int i = 0; i < equipas.size(); i++)
        {
            if (lengthmax < equipas.get(i).getNome().length())
            {
                lengthmax = equipas.get(i).getNome().length();
            }
        }
        //111111111111111
        System.out.printf("\n%S ", equipas.get(0).getNome());
        for (int i = 0; i < lengthmax + 5 - equipas.get(0).getNome().length(); i++)
        {
            System.out.printf("-");
        }
        System.out.printf("|\n");
        //2222222222222222222222
        for (int i = 0; i < lengthmax + 6; i++)
        {
            System.out.printf(" ");
        }
        System.out.printf("|");
        for (int i = 0; i < 10; i++)
        {
            System.out.printf("-");
        }
        System.out.print(" VENCEDOR 1 ");
        for (int i = 0; i < 10; i++)
        {
            System.out.printf("-");
        }
        System.out.print("|");
        System.out.printf("\n%S ", equipas.get(1).getNome());
        for (int i = 0; i < lengthmax + 5 - equipas.get(1).getNome().length(); i++)
        {
            System.out.printf("-");
        }
        System.out.printf("|");

        System.out.printf("%34s", "|\n");
        System.out.printf("%48s", "|");
        System.out.printf("---------- VENCEDOR 3 ");
        System.out.printf("\n%S ", equipas.get(2).getNome());
        for (int i = 0; i < lengthmax + 5 - equipas.get(2).getNome().length(); i++)
        {
            System.out.printf("-");
        }
        System.out.printf("|");
        System.out.printf("%34s", "|\n");
        for (int i = 0; i < lengthmax + 6; i++)
        {
            System.out.printf(" ");
        }
        System.out.printf("|");

        for (int i = 0; i < 10; i++)
        {
            System.out.printf("-");
        }
        System.out.print(" VENCEDOR 2 ");
        for (int i = 0; i < 10; i++)
        {
            System.out.printf("-");
        }
        System.out.print("|");
        System.out.printf("\n%S ", equipas.get(3).getNome());
        for (int i = 0; i < lengthmax + 5 - equipas.get(3).getNome().length(); i++)
        {
            System.out.printf("-");
        }
        System.out.printf("|\n");
        System.out.println("");
    }

    /**
     *
     * @param hs
     * @return
     */
    public ArrayList<Equipas> hashToArray(HashSet<Equipas> hs) {
        ArrayList<Equipas> eq = new ArrayList<>();
        for (Equipas h : hs)
        {
            eq.add(h);
        }
        return eq;
    }

    /**
     *
     * @param u
     */
    public void juntarEquipa(Utilizador u) {
        System.out.printf("\nInsira o ID da equipa a que se quer juntar: ");
        HashSet<Equipas> equips = new HashSet<>();
        for (Equipas equip : vecEquipas)
        {
            if (equip.getModalidades().equals(u.getModalidades()))
            {
                if (equip.getUtilizador().size() < equip.getNumeroDeJogadoresMax())
                {
                    if (!equip.getUtilizador().contains(u))
                    {
                        equips.add(equip);
                    }
                }
            }
        }
        if (!equips.isEmpty())
        {
            for (Equipas equip : equips)
            {
                System.out.printf("\n%d - %s", equip.getIdequipa(), equip.getNome());
            }

        } else
        {
            System.out.println("\nNão existem equipas para se juntar! (0 para cancelar)");
        }
        int id = in.nextInt();
        if (id != 0)
        {
            boolean existe = false;
            do
            {
                for (Equipas equip : equips)
                {
                    if (equip.getIdequipa() == id)
                    {
                        existe = true;
                        equip.adicionarUtilizador(u);
                    }

                }
                if (!existe)
                {
                    System.out.println("Insira um ID valido. (0 para cancelar)");
                    id = in.nextInt();
                }
            } while (existe != true);
        }

    }

    /**
     *
     * @param u
     */
    public void sairEquipa(Utilizador u) {
        System.out.printf("\nInsira o ID da equipa que deseja sair:");
        HashSet<Equipas> equips = new HashSet<>();
        for (Equipas equip : vecEquipas)
        {
            if (equip.getUtilizador().contains(u))
            {
                equips.add(equip);
            }

        }
        if (!equips.isEmpty())
        {
            for (Equipas equip : equips)
            {
                System.out.printf("\n%d - %s ", equip.getIdequipa(), equip.getNome());
            }

        } else
        {
            System.out.println("\nNão esta inserido em nenhuma equipa (0 para voltar)");
        }
        System.out.println("");
        int id = in.nextInt();
        if (id != 0)
        {
            boolean existe = false;
            do
            {
                for (Equipas equip : vecEquipas)
                {
                    if (equip.getIdequipa() == id)
                    {
                        existe = true;
                        equip.removerUtilizador(u);
                        System.out.println("Saiu da equipa!");
                    }
                }
                if (!existe)
                {
                    System.out.println("Insira um ID valido. (0 para cancelar)");
                    id = in.nextInt();
                    if (id == 0)
                    {
                        existe = true;
                    }
                }
            } while (existe != true);
        }

    }
}
