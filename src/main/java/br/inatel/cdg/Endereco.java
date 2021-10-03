package br.inatel.cdg;

public class Endereco {

    public String rua;
    public String bairro;
    public int num;

    public Endereco(String rua, String bairro, int num) {
        this.rua = rua;
        this.bairro = bairro;
        this.num = num;
    }

    //Getters

    public String getRua() {
        return rua;
    }

    public String getBairro() {
        return bairro;
    }

    public int getNum() {
        return num;
    }
}
