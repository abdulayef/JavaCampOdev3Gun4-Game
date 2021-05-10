package concrete;

public class CampaniyaManager {
SalesManager salesManager=new SalesManager("Candy Crusher","Combat Strike 2","Bubble Invasion");
	public void campaniya() {
		System.out.println("Satishda olan oyunlar: ");
		System.out.println("1."+salesManager.getGema1());
		System.out.println("2."+salesManager.getGema2());
		System.out.println("3."+salesManager.getGema3());
		System.out.println("Endirimde olan oyunlar:");
		System.out.println("2."+salesManager.getGema2()+" 50% indirim");
}
}
