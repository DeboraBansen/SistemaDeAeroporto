package com.mod.negocio;
import com.mod.dados.*;
import java.util.LinkedList;

public class ReservaPassagem {
	private LinkedList<Cliente> listaDeClientes=new LinkedList<Cliente>();
	private LinkedList<Cidade> listaDeCidades=new LinkedList<Cidade>();
	private int numeroReservas=0;
	

	public LinkedList<Cliente> getListaDeClientes() {
		return listaDeClientes;
	}

	public void setListaDeClientes(LinkedList<Cliente> listaDeClientes) {
		this.listaDeClientes = listaDeClientes;
	}

	public LinkedList<Cidade> getListaDeCidades() {
		return listaDeCidades;
	}

	public void setListaDeCidades(LinkedList<Cidade> listaDeCidades) {
		this.listaDeCidades = listaDeCidades;
	}

	public int getNumeroReservas() {
		return numeroReservas;
	}

	public void setNumeroReservas(int numeroReservas) {
		this.numeroReservas = numeroReservas;
	}

	public void cadastrarCidade(Cidade cidade) {
		this.listaDeCidades.add(cidade);
	}
	
	public void cadastrarCliente(Cliente cliente) {
		this.listaDeClientes.add(cliente);
	}
	
	public void reservarIda(Cliente cliente,Reserva reserva) {
		reserva.setNumReserva(this.numeroReservas);
		this.numeroReservas++;
		cliente.reservaIda(reserva);
	}
	
	public void reservaVolta(Cliente cliente,Reserva ida,Reserva volta) {
		ida.setNumReserva(this.numeroReservas);
		this.numeroReservas++;
		
		volta.setNumReserva(this.numeroReservas);
		this.numeroReservas++;
		cliente.reservarvolta(ida, volta);
	}
	
	public Reserva[] mostrarReservas(int cpfCliente) {
		
	}
	
	public Cliente[] mostrarClientes() {
		
	}
	
	public Cidade[] mostrarCidades() {
		
	}
}
