package tp7;

public class ResultatPoints implements Resultat{
	private int pointsCum ;
	
	ResultatPoints(int pointsCum){
		this.pointsCum=pointsCum;
	}
	
	public String toString() {
		return this.getClass().getSimpleName()+"[ Points Cumulés : ' "+pointsCum+" ' ]";
	}
	
	public int compareTo(Resultat r) {
		int nbrp=0;
		if(r instanceof ResultatPoints ) {
			if(this.pointsCum == ((ResultatPoints)r).pointsCum) {
				nbrp=0;
			}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
			else if (this.pointsCum < ((ResultatPoints)r).pointsCum) {
				nbrp=1;
			}
			else {
				nbrp=-1;
			}
		}
		return nbrp;
	}
	

}
