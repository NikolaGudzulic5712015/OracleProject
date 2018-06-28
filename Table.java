
public class Table {
	public Team[] member = new Team[4];
	
	public Table(){
		for(int i = 0; i < 4; i++)
			member[i] = new Team();
		}
	public void PrintTable() {
		System.out.print("------------------------------TABELA----------------------------------\n");
		System.out.print("NAZIV" + "\t" +  "MECEVA" + "\t" + "POBEDA" + "\t" + "REMI" + "\t" + "PORAZA" + "\t" + "G+" + "\t" + "G-" + "\t" + "G+-" + "\t" + "BODOVI" + "\n");
		System.out.print("----------------------------------------------------------------------\n");
		int i;
		for(i = 0; i < 4; i++)
			System.out.printf("%s \t %d \t %d \t %d \t %d \t %d \t %d \t %d \t %d \n", member[i].getName(), member[i].getNumberOfGames(), member[i].getVictory(), member[i].getEqual(), member[i].getDefeat(), member[i].getScoredGoals(), member[i].getRecievedGoals(), member[i].getGoalsSR(), member[i].getScore());     
         
			
	}
	public void ChangePlace(Team team1, Team team2) {
		Team tmp;
		tmp = team1;
		team1 = team2;
		team2 = tmp;
	}
	public boolean CheckPosition(Team team1, Team team2) {
		boolean position = false;
		if ( team1.bodovi < team2.bodovi)
			position = true;
		else if (team1.bodovi == team2.bodovi)
		{
			if ( team1.GolRazlika < team2.GolRazlika )
				position = true;
			else if ( team1.GolRazlika == team2.GolRazlika)
			{
				if ( 1 == Check_H2H(team1, team2))
					position = true;
			}
			else
			{
				if ( team1.PostignutiGolovi < team2.PostignutiGolovi)
					position = true;
			}
		}
		
		return position;
	}
	public int Check_H2H( Team team1, Team team2) {
		int retValue = 0;
		int i;
		Match []match = new Match[6];
		for ( i = 0; i < match.length; i++)
		{
			if ( match[i].getID1() == team1.getID() && match[i].getID2() == team2.getID())
			{
				if ( match[i].getTeam1Goals() < match[i].getTeam2Goals())
					retValue = 1;
			}
		}
		return retValue;
	}
	public void UpdateData(int postignuti_golovi, int primljeni_golovi, int id) {
		int i;
		for ( i = 0; i < 4; i++)
		{
			if(id == member[i].getID())
			{
				member[i].UpdateNumberOfGames();
				member[i].UpdateScoredGoals(postignuti_golovi);
				member[i].UpdateRecievedgoals(primljeni_golovi);
				member[i].UpdateG();
				
				if(postignuti_golovi > primljeni_golovi)
					member[i].UpdateVictory();
				
				else if(postignuti_golovi == primljeni_golovi)
					member[i].UpdateEqual();
				
				else
					member[i].UpdateDefeat();
					
				}
		}
	}
	public void Sort() {
		int i,j;
		for(i = 0; i< 4; i++) {
			for(j = i+1; j < 4; j++)
				if (CheckPosition(member[i], member[j])) {
					
				ChangePlace(member[i], member[j]);
		}
		}
	}
	

}
