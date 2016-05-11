package ar.edu.unlam.tallerweb;

import java.util.Iterator;
import java.util.TreeSet;

import org.junit.Assert;
import org.junit.Test;

public class BarTest {
	
	
	@Test
	public void testParaAgregarCliente(){ 
		Bar bar = new Bar();
		bar.agregarCliente(new Cliente("Juan"));
		bar.agregarCliente(new Cliente("Pedro"));
		bar.agregarCliente(new Cliente("Alicia"));
		bar.agregarCliente(new Cliente("Carla"));
		TreeSet<Cliente> clientes = bar.mostrarCliente();
		Assert.assertTrue(4==clientes.size());
	}

	@Test
	public void testAgregarUnClienteRepetido(){
		Bar bar = new Bar();
		bar.agregarCliente(new Cliente("Juan"));
		bar.agregarCliente(new Cliente("Alicia"));
		bar.agregarCliente(new Cliente("Juan"));
		bar.agregarCliente(new Cliente("Pedro"));
		TreeSet<Cliente> clientes = bar.mostrarCliente();
		Assert.assertTrue(3==clientes.size());
	}
	    
	@Test
	public void testParaMostrarTodosLosClientes(){
		Bar bar = new Bar();
		bar.agregarCliente(new Cliente("Juan"));
        bar.agregarCliente(new Cliente("Alicia"));
        bar.agregarCliente(new Cliente("Pedro"));
        
        int i = 0;
        for(Iterator<Cliente> it = bar.mostrarCliente().iterator(); it.hasNext();){
            Cliente each = it.next();
            switch (i){
            case 0:
                Assert.assertTrue("Alicia".equals(each.getNombre()));
                break;
            case 1:
                Assert.assertTrue("Juan".equals(each.getNombre()));
                break;
            case 2:
                Assert.assertTrue("Pedro".equals(each.getNombre()));
                break;
            }
            i++;
        }
	}

}
