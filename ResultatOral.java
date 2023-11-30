package tp7;

public class ResultatOral implements Resultat {
	private char appréciation;
	
	ResultatOral(char appreciation){
		if(appreciation== 'A' || appreciation== 'B' || appreciation=='C') {
			this.appréciation=appreciation;
		}
	}
	
	public String toString() {
		return this.getClass().getSimpleName()+"[ appreciation : ' "+appréciation+" ' ]";
	}
	public int compareTo(Resultat r) {
		int com=0;
		if(r instanceof ResultatOral) {
			if(this.appréciation == ((ResultatOral)r).appréciation){
				com=0 ;
			}
			else if(this.appréciation < ((ResultatOral)r).appréciation) {
				com=1;
			}
			else {
				com=-1;
			}
		}
		return com ;
	}
	
	
}
