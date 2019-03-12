package course.oop.classes;

public class TTTPlayer
{
	protected String username;
	protected String marker;
	//protected int record;
	protected boolean isAi;
	
	public TTTPlayer() 
	{
		username = "Player";
		marker = "X";
		isAi = false;
	}
	
	public TTTPlayer(int playerNum) 
	{
		username = "Player " + Integer.toString(playerNum);
		if(playerNum == 1)
			marker = "X";
		else
			marker = "O";
		isAi = false;
	}
	
	public TTTPlayer(String name, String marking) 
	{
		username = name;
		marker = marking;
		isAi = false;
	}
	
	public void setName(String newName) {
		username = newName;
	}
	
	public String getName() {
		return username;
	}
	
	public void setMarker(String newMarker) {
		marker = newMarker;
	}
	
	public String getMarker() {
		return marker;
	}
	
	public void setAi(boolean n_isAi) {
		isAi = n_isAi;
	}
	
	public boolean getAi() {
		return isAi;
	}
}