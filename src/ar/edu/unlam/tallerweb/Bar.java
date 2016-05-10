package ar.edu.unlam.tallerweb;

import java.util.TreeSet;

public class Bar {
	//ATRIBUTOS
	private TreeSet<Cliente> miCliente = new TreeSet<Cliente>();
	Cliente nombre;
	
	//METODOS
	public void agregarCliente(Cliente nombre) {
		this.miCliente.add(nombre);
	}

	public TreeSet<Cliente>	mostrarCliente(){
		return this.miCliente;
	}
}