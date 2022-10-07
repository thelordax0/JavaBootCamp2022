package overriding;

public class OgrenciKrediManager extends BaseKrediManager{
	//Base class ile aynı imzda frklı metho yazarsk base class ın metodunu bu class için ezmiş override etmiş oluruz
	//Java da aksi beirtilmedikçe miras alan classs base class ın methodlarını override edebilir.
	public double hesapla(double tutar) {
		return tutar* 1.10;
	}
}
