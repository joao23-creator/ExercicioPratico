package Memoria;

public class MemoriaUSB {
    private String nome;
    private int capacidade;

    public MemoriaUSB(int capacidade, String nome) {
        this.capacidade = capacidade;
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public int getCapacidade(){
        return this.capacidade;
    }
}