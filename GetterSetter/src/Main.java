public class Main {

    public static void main(String[] args) {
	// write your code here
        //Yapılandırıcı kullanılarak veriler yazıldı
      Product product = new Product(61,"Laptop","Asus Gaming Laptop",5000,3,"Siyah");


//      product.setId(1);
//      product.setName("Laptop");
//      product.setDescription("Asus Gaming Laptop");
//      product.setPrice(5000);
//      product.setStockAmount(3);


       ProductManager productManager = new ProductManager();
       productManager.Add(product);
       System.out.println(product.getKod());
    }
}
