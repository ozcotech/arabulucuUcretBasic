# Arabuluculuk Ücret Hesaplama

Programda if-else yapısını kullanarak çok temel, basit bir arabuluculuk ücreti hesaplama programı yaptık.


Not: Eğer bu kod yazılımını, (özellikle) <u><b>algoritmasını</b></u> oop mantığında veya daha sade ve kısa şekilde yapmak, yenilemek isteyen varsa lütfen bana yardımcı olsun.


İlerde nesne mantığını kullanarak düzenlenecektir veya algoritması daha basit şekile indirgenecektir.

Ayrıca diğer ihtimaller de programımıza eklenecektir. Şöyle ki;
Bu hesaplama iş hukuku uyuşmazlıkları için geçerlidir ve sadece 2 kişi katılımında geçerlidir. Katılım yani anlaşan kişi sayısını arttırdığımızda özellikle asgarisini yani 800TL'yi baz aldığımızda savcılıkça ödenecek miktar değişmektedir. Ayrıca tüketici veya ticari uyuşmazlıklarda da asgari miktar değişmektedir. Ancak genel itibariyle asgarinin üzerinde bir ücret hesaplamasında bu basit program her zaman doğru sonucu verecektir. 

Hesaplama Şu mantıkla Yapılmaktadır;

1- Kullanıcıdan anlaşma miktarını alıyoruz.
2- Anlaşma miktarına göre belirli oranlarda arabuluculuk ücreti hesaplaması yapıyoruz ancak öncelikle anlaşma miktarı 0'dan büyük olmalıdır.
3- Daha sonra arabuluculuk ücreti 2022 yılı itibariyle 800 TL'den düşük olmamalıdır.
4- anlaşma miktarının ilk 50.000 TL'si için %6 oranında arabuluculuk ücreti hesaplanır.
```
Örnek-1: 
Anlaşma miktarınız: 10.000 TL
Arabuluculuk ücreti: 600TL değil 800TL'dir. (Çünkü % 6 olarak hesaplansa da 800TL'nin altına düşülmeyecektir.)
```
```
Örnek-2: 
Anlaşma miktarınız: 20.000TL
Arabuluculuk ücreti: 1.200TL'dir.
(Çünkü % 6 oranda hesaplama yaptığımızda 800TL'nin üzerinde çıktığından çıkan rakam ücretimiz oluyor.)
```

5- Anlaşma miktarının ilk 50.000 TL'si için %6, sonraki 80.000TL'si için %5, sonraki 130.000TL'si %4, sonraki 260.000TL'si için %3 vd. şeklinde aşağıdaki tabloda görülmektedir.

| Sayı | Anlaşılan Miktar | Oran|
|------|-------------------|----|
| 1. | İlk 50.000,00 TL’si için | %6 |
| 2. | Sonra gelen 80.000,00 TL'si için | %5 |
| 3. | Sonra gelen 130.000,00 TL'si için | %4 |
| 4. | Sonra gelen 260.000,00 TL'si için | %3 |
| 5. | Sonra gelen 780.000,00 TL'si için | %2 |
| 6. | Sonra gelen 1.040.000,00 TL'si için | %1,5 |
| 7. | Sonra gelen 2.080.000,00 TL'si için | %1 |
| 8. | 4.160.000,00 TL'den yukarısı için | %0,5 |

* Algoritmayı yeniden inşa etmemde yardımcı olmanızı rica ederim.
