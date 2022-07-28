package exceptions;

public class ErroNumeroException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public ErroNumeroException(String msg) {
		super(msg);
	}

}
