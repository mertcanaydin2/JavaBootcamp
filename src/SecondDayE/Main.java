package SecondDayE;

public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        customerManager.add();
        customerManager.update();
        customerManager.remove();

        System.out.println("*****************************");

        DortIslem dortIslem = new DortIslem(); //ReCap Demo
        int toplaSonuc = dortIslem.Topla(4,5);
        int cikarSonuc = dortIslem.Cikar(8,3);
        int bolSonuc = dortIslem.Bol(15,5);
        int carpSonuc = dortIslem.Carp(4,7);
        System.out.println(toplaSonuc +" " +cikarSonuc+" "+bolSonuc+" "+carpSonuc);

        Product product = new Product();
        product.name = "Kırmızı Demir Pala +9";
        product.description = "Ortalama Zarar %55";
        System.out.println(product.name+" , " + product.description);

        Product product1 = new Product();
        product1.name = "denemelik +2";
        product1.description = "Beceri Hasarı %7";


        Product product2 = new Product();
        product2.name = " deneme";
        product2.setId(2);
        product2.setName("Havalı Çelik Yay");
        product2.setDescription("Ortalama Zarar 59");

        product1.setName("Dolunay Kılıcı +2");

        ProductManager productManager = new ProductManager();
        productManager.add(product1);
        productManager.add(product2);
    }
}
