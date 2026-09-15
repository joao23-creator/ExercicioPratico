import Computadores.Computador;
import Memoria.MemoriaUSB;
import Cliente.Cliente;
import Hardware.HardwareBasico;
import Sistema.SistemaOperacional;
import Processar.ProcessarPedido;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int op;
        int i = 0;

        Cliente cliente = new Cliente("João", "123.456.789-00");

        System.out.println("Olha Cliente, seja bem vindo a PC Mania!");
        System.out.println("Nesses ultimos tempos estamos tendo uma promoção imperdivel para os adoradores de PC's");
        System.out.println("Quais dessas 3 promoções você quer ver primeiro?");
        System.out.println("Digito o 1 para a primeira promoção! 2 para a segunade e 3 para a terceira!");
        System.out.println("Se não quiser ver nenhuma ou se já olhou tudo que queria é só digitar 0 (ZERO) para sair!");

        op = entrada.nextInt();

        do {

            switch (op) {
                case 1: {
                    Computador c1 = new Computador();
                    c1.setMarca("Apple");
                    c1.setPreco(9823);
                    HardwareBasico obj1 = new HardwareBasico("Pentium Core i5 ", 2200);
                    HardwareBasico obj2 = new HardwareBasico("Memoria RAM", 8);
                    HardwareBasico obj3 = new HardwareBasico("HD", 500);
                    HardwareBasico[] obj = {obj1, obj2, obj3};
                    c1.setObj(obj);
                    SistemaOperacional operar = new SistemaOperacional("Sistema Operacional macOS Sequoia (64 bits)", 64);
                    c1.setOperar(operar);

                    MemoriaUSB musb = new MemoriaUSB(16, "Pen-drive");
                    c1.addMemoriaUSB(musb);

                    cliente.getCompu()[i] = c1;
                    i++;

                    break;
                }

                case 2: {
                    Computador c2 = new Computador();
                    c2.setMarca("Samsung");
                    c2.setPreco(9824);
                    HardwareBasico obj1 = new HardwareBasico("Pentium Core i7 ", 3370);
                    HardwareBasico obj2 = new HardwareBasico("Memoria RAM", 16);
                    HardwareBasico obj3 = new HardwareBasico("HD", 1000);
                    HardwareBasico[] obj = {obj1, obj2, obj3};
                    c2.setObj(obj);
                    SistemaOperacional operar = new SistemaOperacional("Sistema Operacional Windows 8 (64 bits)", 64);
                    c2.setOperar(operar);

                    MemoriaUSB musb = new MemoriaUSB(32, "Pen-drive");
                    c2.addMemoriaUSB(musb);

                    cliente.getCompu()[i] = c2;
                    i++;

                    break;
                }

                case 3: {
                    Computador c3 = new Computador();
                    c3.setMarca("Dell");
                    c3.setPreco(9825);
                    HardwareBasico obj1 = new HardwareBasico("Pentium Core i7", 4500);
                    HardwareBasico obj2 = new HardwareBasico("Memoria RAM", 32);
                    HardwareBasico obj3 = new HardwareBasico("HD", 2000);
                    HardwareBasico[] obj = {obj1, obj2, obj3};
                    c3.setObj(obj);
                    SistemaOperacional operar = new SistemaOperacional("Sistema Operacional Windows 10 (64 bits)", 64);
                    c3.setOperar(operar);

                    MemoriaUSB musb = new MemoriaUSB(1000, "HD Externo");
                    c3.addMemoriaUSB(musb);

                    cliente.getCompu()[i] = c3;
                    i++;

                    break;
                }

                case 0:

                    break;

                default: {

                    System.out.println("Opção invalida!");

                    break;
                }

            }

            if(op != 0) {
                op = entrada.nextInt();
            }


        }while(op != 0);

        ProcessarPedido.processarPedido(cliente.getCompu());

        System.out.println();
        System.out.println("===== CLIENTE =====");
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Cpf: " + cliente.getCpf());

        System.out.println();
        System.out.println("===== PC'S ADQUIRIDOS =====");

        for (int j = 0; j < cliente.getCompu().length; j++){
            if(cliente.getCompu()[j] != null){

                cliente.getCompu()[j].mostrarPCConfigs();
            }
        }

        System.out.println();
        System.out.println("===== TOTAL DA COMPRA =====");

        System.out.println("Total: R$ " + cliente.calculaTotalCompra());

        entrada.close();
    }
}