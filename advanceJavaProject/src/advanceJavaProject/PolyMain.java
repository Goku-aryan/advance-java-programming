package advanceJavaProject;
class Animal{
	String name;
	String sound;
	
	Animal(){
		this("","");
	}
	
	Animal(String name, String sound){
		this.name=name;
		this.sound=sound;
	}
	
	void getInfo() {
		System.out.println("Name = "+name);
		System.out.println("Sound = "+sound);
	}
	void getInfo(String name, String sound, String legs) {
		System.out.println("Name = "+name);
		System.out.println("Sound = "+sound);
		System.out.println("No. of Legs = "+legs);
	}
}

class Kalu extends Animal{
	
}

public class PolyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal = new Animal("Horse", "fuurrrrr");
		animal.getInfo();
		animal.getInfo("Billu", "Rakhta hu khulla", "2");
	}

}
