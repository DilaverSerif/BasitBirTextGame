# BasitBirTextGame
Oyunum başta kullanıcı kendine bir karakter yaratarak düşmanlarıyla savaştığı basit bir text tabanlı rpg(rol yapma) oyunudur. Oyunda iki sınıf vardır okçu ve savaşçı bunun yanında oyunda düşmanlar rastgele oluşurken, oyuncu düşmanlarını alt ederek deneyim kazanarak oyunda ilerlemektedir. Oyun 2 adet harita barındırmaktadır bunlar zindan ve şehirdir. Savaşlarda mesafe göstergesi bulunmaktadır O işaret oyuncuyu, * işareti mesafeyi, X işareti ise düşmanı ifade etmektedir. Detaylı bilgi devamında verilmektedir.

![Image](https://i.hizliresim.com/n9UICk.png)

 	Oyunda iki farklı interface bulunmaktadır biri oyuncaya düşman objelere ait iken diğeri oyuncuya ve oyuncuya dost objelere aittir.Dusman pet ve oyuncu scriptlerindeki değişkenler için kapsülleme kullanılmıştır.
	
•Corona ve Ayi objeleri Dusman classindan extends almaktadır.

•Baykus Pet classindan extends almaktadır.

•Oyuncu Classindan oyunun başlangıçta kullanıcıdan alınan bilgilerle yeni Obje yaratılır.

Programda fonksiyonların bulunduğu 3 adet script bulunmaktadır.
1)Main

Main içerisinde kullanıcıya sorular sorularak kişiye özel Oyuncu oluşturulur.
Ekstra olarak main içerinde Konusalım SecenekGir ve Rastgele diye 3 adet fonksiyon vardır.

![Image](https://i.hizliresim.com/dyWUvG.png)

a)Konusalım

Bu fonksiyon kullanıncaya bilgi vermenin yanında karakterlerin konuşması için kullanılmaktadır.
b)SecenekGir

Kullanıcıların yapacağı seçimler için çağırılan fonksiyon.

c)Rastgele

Düşmanların rastgele yaratılması için ve olasılıkların (Oyuncunun savaşta kaçma gibi) çalışması için çağırılır.

2)Mekanlar
Mekanlar scriptinde iki adet fonksiyon vardır.

a)Sehir

 Sehir fonksiyonunda kullanıcıya 3 adet seçenek sunulur iksir alıp savaş esnasında canını doldurabilir. Zindana gidip düşmanlarla kapışabilir ve pet (yardımcı hayvan) alarak düşmanlarla kapışırken yardım alabilir.
 
![Image](https://i.hizliresim.com/YC02ko.png)

b)Zindan

![Image](https://i.hizliresim.com/IKnD2H.png)

Zindan ekranında 4 adet seçeneğin yanında bilgilendirme de mevcuttur ilk satırda 
Düşmanın narası yazar 2 satırda düşmanın canı 3.satırda düşmanın gücü ve zırhı 4. Satırda oyuncuyla düşmanla arasındaki mesafeyi göstermektedir.
Kaç seçeneği savaş esnasında savaşı bitirip şehre gitmek için kullanılır lakin 10/4 şans ile eğer şanssızdanız düşman mesafe katleder.
Saldır seçeneği oyuncu “güç – düşmanın zırhı” kadar düşmana hasar atar eğer oyuna başlarken savaşçı sınıfı seçildiyse oyuncu sadece mesafe 0 ken hasar atılabilir eğer okçu seçildiyse mesafe önemli olmamaktadır.
İksir içerek canını 20 can daha eklenebilir.


  Düşmanın canı bittiğinde görünen ekran kazanılan deneyim ve altını gösterdikten oyuncu otomatik olarak şehre gider.
  
   ![Image](https://i.hizliresim.com/AUjt66.png)
   
3)DusmanYarat
	Rastgele düşman yaratılması için yazılan scriptir.


