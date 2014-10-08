package de.jankrause.codetalks2014.exceptions;

/**
 * Represents an exceptional state within a method. This exception has to be
 * used if the method's caller is responsible to fix the exceptional state.
 */
public class SystemException extends Exception {

	private static final long serialVersionUID = 2458690777216989288L;

	/**
	 * What indicates the cause of this exception.
	 */
	private int errorCode = -1;

	/**
	 * @param errorCode
	 *            What indicates the cause of this exception.
	 * @param message
	 *            What describes the cause of this exception in natural language
	 */
	public SystemException(int errorCode, String message) {
		super(message);

		this.errorCode = errorCode;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + errorCode;
		return result;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SystemException other = (SystemException) obj;
		if (errorCode != other.errorCode)
			return false;
		return true;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toString() {
		return "BooksellerException [errorCode=" + errorCode
				+ ", getMessage()=" + getMessage() + "]";
	}

}
