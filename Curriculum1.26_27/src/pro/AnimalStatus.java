package pro;


public class AnimalStatus {

	//メンバ変数（属性）
	
	 private String name;
	 
	 private double length;

	 private int speed;

	 private String scientificName;

	//メソッド（操作）
	public void animalStatus(String name, double length, int speed, String scientificName) {
        
		this.name = name;
        
		this.length = length;
        
		this.speed = speed;
        
		this.scientificName = scientificName;
    }
	
	public String getName() {
        return name;
    }

    public double getLength() {
        return length;
    }

    public double getSpeed() {
        return speed;
    }

    public String getScientificName() {
        return scientificName;
    }

}
