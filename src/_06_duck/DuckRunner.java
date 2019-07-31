package _06_duck;

import javax.swing.JOptionPane;

public class DuckRunner {
public static void main(String[] args) {
	String food = JOptionPane.showInputDialog("What food does your duck like?");
	String friends= JOptionPane.showInputDialog("How many friends does your duck have?");
	int friend= Integer.parseInt(friends);
	Duck daffy = new Duck(food,friend);
	  daffy.quack();
}
}
