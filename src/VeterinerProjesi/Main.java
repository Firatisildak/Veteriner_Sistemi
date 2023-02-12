package VeterinerProjesi;

public class Main {

	public static void main(String[] args) {
		ilkNesneleriOluştur();
		
	}

 private static void ilkNesneleriOluştur() {
	 Kedi kedi=new Kedi("01-01-2016",true,"Van Kedisi");
		Kedi kedi2=new Kedi("01-04-2016",false,"Siyam");
		Kedi kedi3=new Kedi("05-04-2016",true,"Tekir");
		
		kedi.bilgileriGoster();
		kedi2.bilgileriGoster();
		kedi3.bilgileriGoster();
		
		
		Kopek kopek=new Kopek("02-06-2018",true,1,"Golden");
		Kopek kopek2=new Kopek("01-02-2017",true,2,"Dalmaçyalı");
		Kopek kopek3=new Kopek("06-10-2016",true,4,"Pitbull");
		
		kopek.bilgileriGoster();
		kopek2.bilgileriGoster();
		kopek3.bilgileriGoster();
		
		Musteri m1=new Musteri("emre","123","ankara");
		m1.musteriHayvanekle(kedi);
		m1.musteriHayvanekle(kopek);
		Musteri m2=new Musteri("hasan","234","izmir");
		m2.musteriHayvanekle(kedi2);
		m2.musteriHayvanekle(kopek2);
		Musteri m3=new Musteri("ali","345","istanbul");
		m3.musteriHayvanekle(kedi3);
		m3.musteriHayvanekle(kopek3);
		System.out.println(m3);
		m3.kendiniTanit();
		
		
		Veteriner v1=new Veteriner("ayşe","456","ankara",1);
		v1.musteriEkle(m1);
		v1.musteriEkle(m2);
		Veteriner v2=new Veteriner("fatma","567","ege",4);
		v2.musteriEkle(m1);
		v2.musteriEkle(m3);
		Veteriner v3=new Veteriner("hayriye","678","marmara",2);
		v3.musteriEkle(m3);
		
		v1.musterileriListele();
		
		SehirVeterinerlikleri ankara=new SehirVeterinerlikleri("ankara");
		ankara.sehireVeterinerEkle(v1);
		ankara.sehireVeterinerEkle(v2);
		
		SehirVeterinerlikleri izmir=new SehirVeterinerlikleri("izmir");
		izmir.sehireVeterinerEkle(v3);
		
		ankara.sehirdekiToplamVeterinerSayisiniBul();
		izmir.sehirdekiToplamVeterinerSayisiniBul();
		
		
		System.out.println("Yönetim paneli");
		YonetimPaneli<Hayvan> hayvanYonetimPaneli=new YonetimPaneli<>();
		hayvanYonetimPaneli.bilgileriGoster(kedi);
		hayvanYonetimPaneli.bilgileriGoster(kopek);
		
		YonetimPaneli<Musteri> musteriYonetimPaneli=new YonetimPaneli<>();
		musteriYonetimPaneli.bilgileriGoster(m1);
		
		musteriYonetimPaneli.sahipOlduguHayvanlariGoster(m1);
 }
 }
