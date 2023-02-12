package VeterinerProjesi;

public class YonetimPaneli<T> {
 public void bilgileriGoster(T nesne) {
	 System.out.println(nesne);
 }
 public <T extends Musteri> void sahipOlduguHayvanlariGoster(T musteri) {
	 musteri.musterihayvanlariniListele();
 }
 
 public void veterinerinMusterileriniListele(T veteriner) {
	 ((Veteriner) veteriner).musterileriListele();
 }
}
