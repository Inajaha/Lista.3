package br.inatel.cdg;

public class Principal {

    public static void main(String[]args){


        Pessoa pessoa1 = new Pessoa("Maria Luisa", 127449,3);

        Endereco end1 = new Endereco("Omar Franqueria", "Inatel", 127);
        Endereco end2 = new Endereco("Jose Galdino Lemos Filho", "Pedro Sancho", 505);

        pessoa1.addEndereco(end1);
        pessoa1.addEndereco(end2);

        pessoa1.mostraInfo();

    }
}
