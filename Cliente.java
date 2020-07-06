package com.mod.dados;
import java.util.LinkedList;

public class Cliente {
	private int cpf;
	private String nome;
	private String endereco;
	private int telefone;
	private LinkedList<Reserva> reservas=new LinkedList<Reserva>();
	
	
	public LinkedList<Reserva> getReservas() {
		return this.reservas;
	}
	public void setReservas(LinkedList<Reserva> reservas) {
		this.reservas = reservas;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	public void reservaIda(Reserva reserva) {
		this.reservas.add(reserva);
	}
	public void reservarvolta(Reserva ida,Reserva volta) {
		ida.setIdaEvolta(true);
		ida.setVolta(volta);
	}
	public String toString() {
		return "CPF: "+this.cpf+"\n"+
			   "Nome: "+this.nome+"\n"+
			   "Emederco: "+this.endereco+"\n"+
			   "telefone: "+this.telefone+"\n";
	}
}
