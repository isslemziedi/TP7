package tp7;

public class testCandidat {

	public static void main(String[] args) {
		Epreuve e = new Epreuve("denomination", 10);
		Candidat c1 = new Candidat(1,"isslem");
		Candidat c2 = new Candidat(2,"eya"); 
		Candidat c3 = new Candidat (3,"ayette");
		e.ajoutCandidat(c1);
		e.ajoutCandidat(c2);
		e.ajoutCandidat(c3);
		System.out.println("l'epreuve : ");
		System.out.println(e.toString()+"\n");
		
		ResultatOral ro1 = new ResultatOral ('A');
		ResultatOral ro2 = new ResultatOral ('B');
		ResultatOral ro3 = new ResultatOral ('C');
		try {
			e.fixeResultat(1, ro1);
			e.fixeResultat(2, ro2);
			e.fixeResultat(3, ro3);
		}
		catch ( IllegalUpdateException a){
			System.out.println("erreur");
			a.getMessage();
			a.printStackTrace();
		}
		e.terminer();
		
		System.out.println("Resultat Record : "+e.getRecord()+"\n");
		System.out.println(e.getVinqueur());
	}

}
