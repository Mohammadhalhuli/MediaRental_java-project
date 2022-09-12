package application;

//import project.String;

public abstract class Media {
	private String code;
	private String titel;
	private int NumberOfCopies;
	
	public Media() {
		titel = null;
		NumberOfCopies = 0;

	}

	public Media(String code,String titel, int numberOfCopies) {
		this.code=code;
		this.titel = titel;
		NumberOfCopies = numberOfCopies;
	}

	public String getTitel() {
		return titel;
	}

	public String getCode() {
		return code;
	}

	public int getNumberOfCopies() {
		return NumberOfCopies;
	}
	public  void setCode (String code) {
		this.code=code;
	}
	public  void settitel (String titel) {
		this.titel=titel;
	}

	public  void   setNumberOfCopies (int NumberOfCopies) {
		//inset 
////		 for (int NumberOfCopies > 1 : NumberOfCopies) {
//			 if (add==true) {
//				 NumberOfCopies++;
//			 }
//			 else {
//				 NumberOfCopies--;
//				 } 
////		 }
		
		this.NumberOfCopies=NumberOfCopies;
	}

	@Override
	public String toString() {
		return "Media [titel=" + titel + ", NumberOfCopies=" + NumberOfCopies + "]";
	}
	
	
}
