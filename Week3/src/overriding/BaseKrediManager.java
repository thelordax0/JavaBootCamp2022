package overriding;

public class BaseKrediManager {
	//Base class ın metodunun override edilmesini istemiyorsa final anahtar kelimesini kullanırız.
	public double hesapla(double tutar) {
		return tutar * 1.18;
	}
}
