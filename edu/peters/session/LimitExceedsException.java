package edu.peters.session;

public class LimitExceedsException extends Exception {
	
	String error;
	
	public LimitExceedsException(String error) {
		super();
		this.error = error;
	}

	public String toString() {
		return "LimitExceedsException [error"  + error + "]";
	}

}
