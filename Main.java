
public class Main {

	public static void main(String[] args) {
		Fighter Ayse=new Fighter("Ayse",15,100,45);
		Fighter Buse=new Fighter("Buse",10,95,53);
		Ring ring=new Ring(Ayse,Buse,45,60);
		ring.run();
		

	}

}
