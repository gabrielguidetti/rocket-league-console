package exceptions;

public class CarroException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public CarroException(String msg) {
		super(msg);
	}

}
