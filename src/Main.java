import java.util.Scanner;

public class Main {
	public static int cevirici(char y) {
		switch (y) {
		case 'A':
			return 0;
		case 'B':
			return 1;
		case 'C':
			return 2;
		case 'D':
			return 3;
		case 'E':
			return 4;
		case 'F':
			return 5;
		case 'G':
			return 6;
		}
		return 0;
	}

	public static void main(String[] args) {
		NewGrid grid1 = new NewGrid();
		boolean[][] girilenler = new boolean[49][49];
		boolean finish = true;

		// String x,y; //(y,x)
		int x, y;
		Scanner scan = new Scanner(System.in);
		while (finish) {
			System.out.println("Enter a guess ");
			String girilen = scan.next();
			y = cevirici(girilen.charAt(0));
			x = Integer.parseInt(girilen.substring(1, 2));
			if (girilenler[y][x]) {
				System.out.println("Repeated guess");
			} else {
				if (grid1.grid[y][x]) {
					System.out.println("hit");
					girilenler[y][x] = true;
					if (y == 1) {
						grid1.w1counter++;
					} else if (y == 2) {
						grid1.w1counter++;
					} else if (y == 3) {
						if (x == 0) {
							grid1.w1counter++;
						} else {
							grid1.w2counter++;
						}
					} else if (y == 6) {
						grid1.w3counter++;
					}

					if (grid1.w1counter == 3 && grid1.w1text == false) {
						System.out.println(grid1.website1 + " guessed");
						grid1.w1text = true;
					} else if (grid1.w2counter == 3 && grid1.w2text == false) {
						System.out.println(grid1.website2 + " guessed");
						grid1.w2text = true;
					} else if (grid1.w3counter == 3 && grid1.w3text == false) {
						System.out.println(grid1.website3 + " guessed");
						grid1.w3text = true;
					}
					if (grid1.w1text && grid1.w2text && grid1.w3text) {
						System.out.println("Game Over");
						finish = false;
					}

				} else {
					System.out.println("miss");
					girilenler[y][x] = true;

				}
			}

		}

	}

}
