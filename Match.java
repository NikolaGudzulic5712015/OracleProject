
public class Match {
	public int Team1_id;
	public int Team2_id;
	public int Team1_goals;
	public int Team2_goals;
	
	
	public int getID1() {
		return this.Team1_id;
	}
	public int getID2() {
		return this.Team2_id;
	}
	public void setTeam1Goals(int scores) {
		this.Team1_goals = scores;
	}
	public void setTeam2Goals(int scores) {
		this.Team2_goals = scores;
	}
	public int getTeam1Goals() {
		return this.Team1_goals;
	}
	public int getTeam2Goals() {
		return this.Team2_goals;
	}
	
	public boolean CheckGoalsInput(int Team1_goals,int Team2_goals) {
		boolean Check = true;
		if(Team1_goals < 0 || Team2_goals < 0)
			Check = false;
		return Check;
		
	}

}
