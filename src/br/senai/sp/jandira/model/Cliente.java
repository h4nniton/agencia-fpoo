package br.senai.sp.jandira.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cliente {
    public String nome,  endereco;
    public long cpf, rg, telefone;
    Scanner scanner = new Scanner(System.in);

    List<Cliente> listCliente = new ArrayList<>();

    public Cliente pesquisarCliente(long cpf){
        for (Cliente cliente: listCliente) {
            long validaCpf = cliente.getCpf();
            if (validaCpf == cpf){
                return cliente;
            }
        }
    }

    public void listarClientes(){
        for (Cliente cliente: listCliente) {
            System.out.println(cliente.nome);

        }
    }

    public void adicionarCliente(Cliente cliente){
        listCliente.add(cliente);
    }

    public void setNome (String nome){

        this.nome = nome;

    }

    public String getNome (){
        return nome
    }

    public

    public void cadastrarCliente(){

        System.out.println("/-/-/-/-/-/  Cadastro Clinte  /-/-/-/-/-/");
        System.out.print("Informe seu nome: ");
        nome = scanner.nextLine();
        System.out.print("Informe seu endereço: ");
        endereco = scanner.nextLine();
        System.out.print("Informe seu CPF: ");
        cpf = scanner.nextLong();
        System.out.print("Informe seu RG: ");
        rg = scanner.nextLong();
        System.out.println("Informe seu Telefone: ");
        telefone = scanner.nextLong();
        scanner.nextLine();
        System.out.println("/-/-/-/-/  Cadastro Finalizado /-/-/-/-/-/");


    }


}
