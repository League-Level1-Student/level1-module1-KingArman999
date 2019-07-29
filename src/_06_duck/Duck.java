package _06_duck;

public class Duck {
	private int numberOfFriends;
	private String favoriteFood;
	public Duck(String favoriteFood, int numberOfFriends) {
      	System.out.println("Daffy duck likes "+favoriteFood + " and has " + numberOfFriends + " friends!");
		this.favoriteFood = favoriteFood;
      	this.numberOfFriends = numberOfFriends;
}
public void quack() {
	System.out.println("Quack");
}
public void waddle() {
System.out.println("Waddle Waddle");
}
}

