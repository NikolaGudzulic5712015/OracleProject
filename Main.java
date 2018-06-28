import java.util.*;


public class Main {

	public static void main(String[] args) {
		
		int i;
		int j;
		int s= 0;
		Table table = new Table();
		
		Match [] matches = new Match[6];
		for(i = 0; i < 6; i++)
			matches[i] = new Match();
		
		System.out.print("Unesite nazive cetiri reprezentacije\n");
		for( i = 0; i < 4; i++)
		{
			System.out.printf("Unesite naziv %d. reprezentacije: ", i+1);
			Scanner input = new Scanner(System.in);
			String name = input.next();
			table.member[i].setName(name);
			table.member[i].setID(i);
		}
		
		for ( i = 0; i < 3; i++)
		{
			for( j = i + 1; j < 4; j++)
			{
				System.out.printf("Unesite rezultat utakmice: %s - %s ", table.member[i].getName(), table.member[j].getName());
				Scanner scan = new Scanner(System.in);
				int scores1 = scan.nextInt();
				int scores2 = scan.nextInt();
				matches[s].setTeam1Goals(scores1);
				matches[s].setTeam2Goals(scores2);
				
				if( matches[s].CheckGoalsInput(scores1, scores2) == false)
				{
					System.out.print("Pogresan unos!");
					System.exit(0);
				}
				matches[s].Team1_id = table.member[i].getID();
				matches[s].Team2_id = table.member[j].getID();
				s += 1;
				
			}
		}
		for(i = 0; i < 6; i++) {
			table.UpdateData( matches[i].getTeam1Goals(), matches[i].getTeam2Goals(), matches[i].getID1());
		table.UpdateData(matches[i].getTeam2Goals(), matches[i].getTeam1Goals(), matches[i].getID2());
		
		}
		table.Sort();
		table.PrintTable();
		

	}

}
