public class Pit {

	private int stones;
	
	public Pit(int s) {
		
		stones = s;
		
	}
	
	public void addStone(int s) {
		
		stones = stones + s;
		
	}
	
	public int returnStones() {
		
		return stones;
		
	}
	
	
	//Empty the pit as well as return the current number of stones in the pit
	public int emptyPit() {
		
		int temp = stones;
		stones = 0;
		return temp;
		
	}
	
}
