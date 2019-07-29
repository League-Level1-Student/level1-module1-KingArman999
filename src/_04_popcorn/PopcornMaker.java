package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {
public static void main(String[] args) {
String flavor = JOptionPane.showInputDialog("What flavor do you want your popcorn?");
String time = JOptionPane.showInputDialog("How much time do you want to cook your popcorn for?");
int t= Integer.parseInt(time);
	Popcorn p= new Popcorn(flavor);	
	Microwave m= new Microwave();
	m.putInMicrowave(p);
	m.setTime(t);
	m.startMicrowave();
	p.applyHeat();
	p.eat();
}
}
