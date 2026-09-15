package Cliente;

import Computadores.Computador;

public class Cliente {

    private String nome;
    private String cpf;

    private Computador[] compu = new Computador[100];

    public Cliente(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public  float calculaTotalCompra(){

        float total = 0;

        for(int i = 0; i < compu.length; i++){

            if(compu[i] != null){
                total = total + compu[i].getPreco();
            }
        }

        return total;
    }

    public String getNome(){
        return this.nome;
    }

    public String getCpf(){

        return this.cpf;
    }

    public  Computador[] getCompu(){

        return this.compu;
    }

}