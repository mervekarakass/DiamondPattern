package diamondPattern;

import java.util.Scanner;

public class DiamondPattern {

	public static void main(String[] args) {
		

		
		       Scanner scanner = new Scanner(System.in);

		        System.out.print("Elmasın yüksekliğini girin (tek sayı olmalı): ");
		        int height = scanner.nextInt();

		        if (height % 2 == 0) {
		            System.out.println("Lütfen tek bir sayı girin.");
		            return;
		        }

		        drawDiamond(height);
		    }

		    static void drawDiamond(int height) {
		        int space = height / 2;

		        for (int i = 1; i <= height; i += 2) {
		            for (int j = 0; j < space; j++) {
		                System.out.print(" ");
		            }

		            for (int j = 0; j < i; j++) {
		                System.out.print("*");
		            }

		            System.out.println();
		            space--;
		        }

		        space = 1;

		        for (int i = height - 2; i >= 1; i -= 2) {
		            for (int j = 0; j < space; j++) {
		                System.out.print(" ");
		            }

		            for (int j = 0; j < i; j++) {
		                System.out.print("*");
		            }

		            System.out.println();
		            space++;
		        }
		    }
		

		
	}
	
	
