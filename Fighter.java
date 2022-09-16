
public class Fighter {
	String name;
	int damage;
	int health;
	int weight;
	double dodge;
	
	public Fighter(String name,int damage,int health,int weight) {
		this.name=name;
		this.damage=damage;
		this.health=health;
		this.weight=weight;
		this.dodge=0;
	}
	
	public int hit(Fighter foe) {
		System.out.println(this.name +"==>"+foe.name+" "+this.damage+" Hasar Vurdu");
		if(foe.dodge()) {
			System.out.println(foe.name+" Gelen Hasarı Savurdu!");
			return foe.health;
		}
		if(foe.health<this.damage) {
			return 0;
		}
		return foe.health-this.damage;
		
	}
	public boolean dodge() {
		double randomValue=Math.random()*100;
		return this.dodge>=randomValue;
	}

}
