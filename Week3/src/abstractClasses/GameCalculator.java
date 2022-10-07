package abstractClasses;
//Abstract class lar new lenemez 
//new lenebilmesi için new lendiği yerde abstarct metodlarının içi doldurulabilir ancak asla böyle kullanılmamalıdır
public abstract class GameCalculator {
	//Abstract classlar normal class gibidir 
	// abstract keywordu ile beslenen metodlar base class ta verilmez kim inherit edıyorsa bu metodu override etmek zorundadır
	public abstract void hesapla();
	//Final keywordu ile beslenen metodlar override edilemez
	public final void gameOver() {
		System.out.println("game over");
	}
}
