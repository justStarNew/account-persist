package com.just.mvnbook.account.persist;

import org.dom4j.DocumentException;
import org.omg.CORBA.portable.ApplicationException;

public class AccountPersistException extends Exception {

	public AccountPersistException(String string, Exception e) {
		super(string,e);
	}
	

}
