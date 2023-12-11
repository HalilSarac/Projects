package JavaPractice.Week05;

public class Musteri {

    /*
Bir müşteri sınıfı oluşturun ve bu sınıf içinde müşteri adı, soyadı,
e-posta adresi ve telefon numarasını temsil eden özellikler (fields) olsun.
Parametresiz bir constructor ile müşteri nesnesi oluşturulduğunda
bu özellikler varsayılan değerlere sahip olsun. Ayrıca,
parametreli bir constructor ile müşteri bilgilerini
belirli değerlere göre set edebilmek için gerekli metotları ekleyin.

Müşteri sınıfının bir örneğini oluşturun,
hem parametresiz constructor'ı hem de parametreli
constructor'ı kullanarak müşteri bilgilerini ekrana yazdırın.

 */
    //Müşterinin bilgilerini atayacağımız variable'ları oluşturalım
    String clientFirstName;
    String clientLastName;
    String clienMailAdress;
    String clientPhone;

    public Musteri(){
        clientFirstName="Kenan";
        clientLastName="Omer";
        clienMailAdress="kenan@omer.com";
        clientPhone="902583697147";
    }

    public Musteri(String clientFirstName, String clientLastName, String clienMailAdress, String clientPhone) {
        this.clientFirstName = clientFirstName;
        this.clientLastName = clientLastName;
        this.clienMailAdress = clienMailAdress;
        this.clientPhone = clientPhone;
    }

    public void bilgileriYazdir(){
        System.out.println("CLIENT INFO");
        System.out.println("-----------------------");
        System.out.println("Full Name: "+clientFirstName+" "+clientLastName);
        System.out.println("E-Mail Address: "+clienMailAdress);
        System.out.println("Phone: "+clientPhone);
    }

}
