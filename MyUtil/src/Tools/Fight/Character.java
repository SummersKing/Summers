package Tools.Fight;

public class Character {
private String name;
private int attack=0;
private int hp=0;
boolean flag=true;
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getAttack() {
	return attack;
}

public void setAttack(int attack) {
	this.attack = attack;
}

public int getHp() {
	return hp;
}

public void setHp(int hp) {
	this.hp = hp;
}

public Character(String name,int attack,int hp) {
this.name=name;
this.attack=attack;
this.hp=hp;
}

@Override
public String toString() {
	return "玩家" + name + "：攻击力为" + attack + ", 当前血量" + hp ;
}

}
