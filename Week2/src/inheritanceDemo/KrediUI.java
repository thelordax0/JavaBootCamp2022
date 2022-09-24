package inheritanceDemo;

public class KrediUI {
	//Polimorfizm
	//Base kredi mnager hem tarım hem ogretmen classlarının referansını tutbilir.
	public void krediHesapla(BaseKrediManager baseKrediManager) {
		baseKrediManager.hesapla();
	}
}
