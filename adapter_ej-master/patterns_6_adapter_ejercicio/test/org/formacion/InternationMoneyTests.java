package org.formacion;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InternationMoneyTests {

	private InternationalMoneyOrganization servicio;
	
	@Before
	public void init() {
		
		
		servicio = (InternationalMoneyOrganization) new adapter(servicio);
	     
	}
	
	@Test
	public void test_cliente_no_existe() {
		Assert.assertEquals(0,servicio.state("No_existo"));
	}

	@Test
	public void test_operaciones_con_nuevo_cliente() {
		String cliente = "nuevo";
		servicio.transfer(100, cliente);
		servicio.transfer(-70, cliente);
	}
}
