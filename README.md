# Veteriner_Sistemi
##Projenin Amacı
Veterinerde çalışan veterinerlerin ve gelen müşterilerin hayvan bilgilerini tutatn bir similasyondur.


##Çalışma Adımları

Öncelikli olarak 2 ana abstarct (Hayvan, Kisi) yapısı oluşturup bu yapıların altından devam ettim. Hayvan abstract yapısının içinde dogumTarihi, kayitli gibi iki 
değişken aldım ve bu değişkenleri sınıftan nesne türetirken kullanmak için constracter kullandım. Kullanıcı tarafından okunaklı olabilemesi için toString yapasını
kullandım. Buhayvan sınıfından Kedi ve Köpek adlı iki sınıfı extends ettim. Böylece kalıtım ile özellikleri kullanarak iki sınıf elde etmiş oldum. sonraki adımda
Kisi adlı bir abstract oluşturup bunun üzerinden de Musteri ve Veteriner adlı iki sınıf türettim. Yonetim paneli adlı bağımsız bir yapı yaratıp burda da generic
tipleri kullanıp tek yapı ile hem musterileri hemde hayvanları tuttum.

