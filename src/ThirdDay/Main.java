package ThirdDay;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(1,"Monster Abra A5",17000,"Oyuncu Bilgisayarı.");

        Product product2 = new Product();
        product2.id = 1;
        product2.setId(2);
        product2.setName("Monster Abra A7");
        product2.setDetail("Açamadığı oyun yok.");
        product2.setUnitPrice(18000);
    }
}
