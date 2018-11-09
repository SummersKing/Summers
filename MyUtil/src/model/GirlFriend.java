package model;

public class GirlFriend {
	private  String name;
private  String bust;
private int height;
public GirlFriend(String name, String bust, int height) {
	super();
	this.name = name;
	this.bust = bust;
	this.height = height;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getBust() {
	return bust;
}
public void setBust(String bust) {
	this.bust = bust;
}
public int getHeight() {
	return height;
}
public void setHeight(int height) {
	this.height = height;
}
@Override
public String toString() {
	return "GirlFriend [name=" + name + ", bust=" + bust + ", height=" + height + "]";
}

}
