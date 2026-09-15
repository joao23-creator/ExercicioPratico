package Computadores;

import Memoria.MemoriaUSB;
import Hardware.HardwareBasico;
import Sistema.SistemaOperacional;

public class Computador {

    private String marca;
    private float preco;
    private MemoriaUSB[] member = new MemoriaUSB[10];
    private SistemaOperacional operar;
    private HardwareBasico[] obj;

    public Computador(){

        operar = new SistemaOperacional(" ", 0);
        obj = new HardwareBasico[10];
    }

    public void setMarca(String marca) {

        this.marca = marca;
    }

    public void setPreco(float preco) {

        this.preco = preco;
    }

    public float getPreco(){

        return this.preco;
    }

    public void setMember(MemoriaUSB[] member) {

        this.member = member;
    }

    public void setOperar(SistemaOperacional operar) {

        this.operar = operar;
    }

    public void setObj(HardwareBasico[] obj) {

        this.obj = obj;
    }

    public void mostrarPCConfigs(){

        System.out.println("Obrigado pela sua escolha!");

        System.out.println("Marca: " + marca);
        System.out.println("Preço: " + preco);
        System.out.println("Configurações: ");

        for(int i = 0; i < obj.length; i++) {

            if(obj[i] != null) {

                if(i == 0){
                    System.out.println(obj[i].getNome() + " (" + obj[i].getCapacidade() + " Mhz)");
                }

                if (i == 1){
                    System.out.println(obj[i].getCapacidade() + " Gb de Memoria RAM");
                }

                if (i == 2){

                    if (obj[i].getCapacidade() == 500){
                        System.out.println("500Gb de HD");
                    }

                    if(obj[i].getCapacidade() == 1000){
                        System.out.println("1Tb de HD");
                    }

                    if (obj[i].getCapacidade() == 2000){
                        System.out.println("2Tb de HD");
                    }
                }
            }
        }

        System.out.println(operar.getNome());

        for(int i = 0; i < member.length; i++) {

            if(member[i] != null) {
                if(member[i].getNome().equals("Pen-drive")){
                    System.out.println("Acompanha Pen-drive de " + member[i].getCapacidade() + "Gb");
                }

                if(member[i].getNome().equals("HD Externo")){
                    System.out.println("Acompanha HD Externo 1Tb");
                }
            }
        }
    }

    public void addMemoriaUSB(MemoriaUSB musb){

        for(int i = 0; i < member.length; i++) {

            if(member[i] == null) {

                member[i] = musb;
                break;
            }
        }
    }
}