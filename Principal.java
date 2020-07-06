package com.mod.apresentacao;
import java.util.Scanner;
import com.mod.dados.*;
import com.mod.negocio.ReservaPassagem;

public class Principal {
	
	private static Scanner sc=new Scanner(System.in);
	private static String nome=new String();
	private static ReservaPassagem reserva=new ReservaPassagem();
	
	public static void main(String[] args) {
		
		
	}
	public void fazerReserva() {
		
	}
	
	public void cadastrarCliente() {
		Cliente cliente=new Cliente();
		System.out.println("Digite o cpf do cliente:");
		cliente.setCpf(sc.nextInt());
		System.out.println("Digite o nome do cliente: ");
		cliente.setNome(sc.next());
		nome=sc.nextLine();
		System.out.println("Digite o endereco do cliente: ");
		cliente.setEndereco(sc.next());
		nome=sc.nextLine();
		System.out.println("Digite o telefone do cliente: ");
		cliente.setTelefone(sc.nextInt());
		reserva.cadastrarCliente(cliente);
	}
	
	public void cadastrarCidade() {
		Cidade cidade=new Cidade();
		System.out.println("Digite o nome da cidade: ");
		cidade.setNome(sc.next());
		nome=sc.nextLine();
		System.out.println("Digite o estado da cidade: ");
		cidade.setEstado(sc.next());
		nome=sc.nextLine();
		reserva.cadastrarCidade(cidade);
		
	}
	public void mostrarReservas() {
		
	}
}
