
public class Team {
	public String Naziv;
	public int bodovi;
	public int PostignutiGolovi;
	public int PrimljeniGolovi;
	public int GolRazlika;
	public int ID;
	public int broj_meceva;
	public int Broj_pobeda;
	public int Broj_poraza;
	public int Broj_remija;
	
	public Team() {
		this.bodovi = 0;
		this.broj_meceva = 0;
		this.Broj_pobeda = 0;
		this.Broj_poraza = 0;
		this.Broj_remija = 0;
		this.GolRazlika = 0;
		this.PostignutiGolovi = 0;
		this.PrimljeniGolovi = 0;
	}
	
	public int getScore() {
		return this.bodovi;
	}
	public void setName(String name) {
		this.Naziv = name;
	}
	public String getName() {
		return this.Naziv.substring(0, 3);
	}
	public int getScoredGoals() {
		return this.PostignutiGolovi;
	}
	public int getRecievedGoals() {
		return this.PrimljeniGolovi;
	}
	public int getGoalsSR() {
		return this.GolRazlika;
	}
	public void setID(int id) {
		this.ID = id;
	}
	public int getID() {
		return this.ID;
	}
	public int getNumberOfGames() {
		return this.broj_meceva;
	}
	public int getVictory() {
		return this.Broj_pobeda;
	}
	public int getDefeat() {
		return this.Broj_poraza;
	}
	public int getEqual() {
		return this.Broj_remija;
	}
	public void UpdateNumberOfGames() {
		this.broj_meceva += 1;
	}
	public void UpdateScoredGoals(int goals) {
		this.PostignutiGolovi += goals;
	}
	public void UpdateRecievedgoals(int goals) {
		this.PrimljeniGolovi += goals;
	}
	public void UpdateG() {
		this.GolRazlika = this.PostignutiGolovi - this.PrimljeniGolovi;
	}
	public void UpdateVictory() {
		this.Broj_pobeda += 1;
		this.bodovi += 3;
	}
	public void UpdateEqual() {
		this.Broj_remija += 1;
		this.bodovi += 1;
	}
	public void UpdateDefeat() {
		this.Broj_poraza += 1;
	}
		
		

}
