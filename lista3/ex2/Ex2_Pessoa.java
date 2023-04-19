package lista3.ex2;

import java.util.ArrayList;

public class Ex2_Pessoa {

    int codigo;
    String nome;
    ArrayList<Ex2_Automovel> automoveis = new ArrayList<>();

    // construir padrão
    public Ex2_Pessoa() {
        this.codigo = 0;
        this.nome = "";
        this.automoveis = new ArrayList<Ex2_Automovel>();
    }

    // construir parametro
    public Ex2_Pessoa(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        this.automoveis = new ArrayList<Ex2_Automovel>();
    }

    //Metodo p/ inserir automovel
    public void inserirAutomovel(Ex2_Automovel automovel) {
        this.automoveis.add(automovel);
    }

    //Metodo p/ remover automovel
    public void removerAutomovel(int index) {
        this.automoveis.remove(index);
    }

    //Metodo p/ imprimir pessoa
    public String imprimirPessoa() {
        return "Código: " + this.codigo + "\nNome: " + this.nome;
    }

    public String imprimirCompleto() {
        StringBuilder sb = new StringBuilder();
        sb.append("Código: ").append(codigo).append("\n");
        sb.append("Nome: ").append(nome).append("\n");
        sb.append("Automóveis: \n");
        for (Ex2_Automovel automovel : automoveis) {
            sb.append(automovel.imprimir()).append("\n");
        }
        return sb.toString();
    }

    //metodo getters e setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Ex2_Automovel> getAutomoveis() {
        return automoveis;
    }

    public void setAutomoveis(ArrayList<Ex2_Automovel> automoveis) {
        this.automoveis = automoveis;
    }


}
