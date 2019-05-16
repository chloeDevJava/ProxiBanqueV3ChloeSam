package org.formation.entity;

public interface Audit {

	public static final Long DEBIT_MAX_PART = 5000L;
	public static final Long DEBIT_MAX_ENTR = 50000L;
	
	public void auditerClients();
	
}
