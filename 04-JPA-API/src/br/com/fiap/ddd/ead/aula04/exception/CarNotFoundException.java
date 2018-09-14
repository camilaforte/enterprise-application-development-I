package br.com.fiap.ddd.ead.aula04.exception;

@SuppressWarnings("serial")
public class CarNotFoundException extends Exception {

	public CarNotFoundException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CarNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public CarNotFoundException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public CarNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public CarNotFoundException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	
}
