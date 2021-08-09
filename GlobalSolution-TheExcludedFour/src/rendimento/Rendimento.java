package rendimento;

public class Rendimento {
	
	private int diaAntes ; 
	private int mesAntes; 
	private int diaDepois; 
	private int mesDepois;
	
	public Rendimento(int diaAntes, int mesAntes, int diaDepois, int mesDepois) {
		this.diaAntes = diaAntes;
		this.mesAntes = mesAntes;
		this.diaDepois = diaDepois;
		this.mesDepois = mesDepois;
	}

	public int getDiaAntes() {
		return diaAntes;
	}

	public void setDiaAntes(int diaAntes) {
		this.diaAntes = diaAntes;
	}

	public int getMesAntes() {
		return mesAntes;
	}

	public void setMesAntes(int mesAntes) {
		this.mesAntes = mesAntes;
	}

	public int getDiaDepois() {
		return diaDepois;
	}

	public void setDiaDepois(int diaDepois) {
		this.diaDepois = diaDepois;
	}

	public int getMesDepois() {
		return mesDepois;
	}

	public void setMesDepois(int mesDepois) {
		this.mesDepois = mesDepois;
	} 
		
	

}
