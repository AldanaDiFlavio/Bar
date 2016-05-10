package ar.edu.unlam.tallerweb;

public class Cliente implements Comparable<Cliente>{
	
	//ATRIBUTOS
	String nombreCliente;

	
	
	//CONSTRUCTOR
	public Cliente(String nombreCliente){
		this.nombreCliente=nombreCliente;
	}

	
	
	
	//GETTERS Y SETTERS
	public String getNombre() {
		return nombreCliente;
	}

	public void setNombre(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	
	
	
	//COMPARADOR
	@Override
	public int compareTo(Cliente o) {
		return this.nombreCliente.compareTo(o.nombreCliente);
	}

	
	
	
	//EQUALS Y HASHCODE
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombreCliente == null) ? 0 : nombreCliente.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (nombreCliente == null) {
			if (other.nombreCliente != null)
				return false;
		} else if (!nombreCliente.equals(other.nombreCliente))
			return false;
		return true;
	}

	
}
