package org.formacion;

public interface InternationalMoneyOrganization {

	void transfer (int cantidad, String cliente);
	
	
	
	int state (String cliente);



	void assertEquals(int i, int state);

}
