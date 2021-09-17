public class NewGrid {
	boolean[][] grid = new boolean[7][7];
	String website1 = "Go2.com";
	String website2 = "Pets.com";
	String website3 = "AskMe.com";
	int w1counter = 0;
	int w2counter = 0;
	int w3counter = 0;
	boolean w1text = false, w2text = false, w3text = false;

	public NewGrid() {
		for (int i = 1; i < 4; i++) {
			grid[i][0] = true;
		}
		for (int j = 2; j < 5; j++) {
			grid[3][j] = true;
		}
		for (int k = 3; k < 6; k++) {
			grid[6][k] = true;
		}

	}

}
