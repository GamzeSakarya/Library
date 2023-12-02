# Library
 # Kütüphane Yönetim Sistemi
1-Bu kütüphane sisteminde aşağıdaki entity’ler bulunmaktadır.

Kitap : Kitapların özelliklerini içeren entity/tablo.

Yazar : Yazarların özelliklerini içeren entity/tablo.

Kategori : Kitap kategorilerini içeren entity/tablo.

Yayın Evi : Yayınevlerinin özelliklerini içeren entity/tablo.

Kitap Ödünç Alınması : Kitap ödünç alma işlemlerini izleyen entity/tablo. Bu tablo, ödünç alınan kitabın kim tarafından alındığını, alınma tarihini ve teslim tarihini içerecektir.

Her bir varlık için temel değişkenler aşağıdaki gibidir.

# Kitap (Book):

id (Benzersiz kitap kimliği)

name(Kitap adı)

publicationYear (Yayın yılı)

stock (Kütüphanedeki miktarı)

# Yazar (Author):

id (Benzersiz yazar kimliği)

name (Yazarın adı)

birthDate (Yazarın doğum yılı)

country (Yazarın ülkesi)

# Kategoriler (Category):

id (Benzersiz kategori kimliği)

name (Kategori adı)

description (Kategori tanımı)

# Yayınevi (Publisher)

id (Benzersiz kimliği)

name (Yayınevi ismi)

establishmentYear (Kuruluş yılı)

address (Yayınevi adresi)

# Kitap Ödünç Alma (BookBorrowing)

id (Benzersiz kimliği)

borrowerName (Kitap ödünç alan kişi adı soyadı)

borrowingDate (Kitap ödünç alma tarihi)

returnDate (Kitabın teslim edildiği tarih, ilk kayıtta null olacak. Kitap teslim edilince tarih güncellenecek)

![Ekran Görüntüsü (64)](https://github.com/GamzeSakarya/Library/assets/126356427/2d153893-9465-4508-a135-6ab183b85337)
![Ekran Görüntüsü (63)](https://github.com/GamzeSakarya/Library/assets/126356427/82623ef1-449a-4991-af36-eef39d2ab655)
![Ekran Görüntüsü (62)](https://github.com/GamzeSakarya/Library/assets/126356427/3ed2a17e-88a3-40e4-a61d-8cf722aee10a)
![Ekran Görüntüsü (61)](https://github.com/GamzeSakarya/Library/assets/126356427/72dec6ad-4114-4e75-bd7f-692dc998cce2)
![Ekran Görüntüsü (60)](https://github.com/GamzeSakarya/Library/assets/126356427/f87b350f-a2e7-49d1-b51c-7ab27b31d61a)
![Ekran Görüntüsü (59)](https://github.com/GamzeSakarya/Library/assets/126356427/718afe04-7926-46e4-96b7-dcea2bdb1f70)


