
public class Main {
    public static void main(String[] args) {
//1)Создать класс Товар, имеющий переменные имя, цена, рейтинг.
        Product product1 = new Product("Apple", 55.50, 1);
        Product product2 = new Product("Pear", 65.50, 2);
        Product product3 = new Product("Carrot", 59.90, 3);
        Product product4 = new Product("Potato", 49.90, 4);
        Product product5 = new Product("Dill", 35.50, 5);
//2)Создать класс Категория, имеющий переменные имя и массив товаров.
// Создать несколько объектов класса Категория.
        Category category1 = new Category ("Fruits");
        category1.addProduct(product1);
        category1.addProduct(product2);
        Category category2 = new Category("Vegetables");
        category2.addProduct(product3);
        category2.addProduct(product4);
        Category category3 = new Category("Grass");
        category3.addProduct(product5);
//3)Создать класс Basket, содержащий массив купленных товаров.
        Basket basket1 = new Basket(new Product[]{product1, product2});
        Basket basket2 = new Basket(new Product[]{product3, product4});
        Basket basket3 = new Basket(new Product[]{product5});
//4)Создать класс User, содержащий логин, пароль и объект класса Basket.
// Создать несколько объектов класса User.
        User user1 = new User("User1", 123456, basket1);
        User user2 = new User("User2", 234567, basket2);
        User user3 = new User("User3", 456789, basket3);
//5)Вывести на консоль каталог продуктов. (все продукты магазина)
        System.out.println("Product Catalog: ");
        System.out.println("**Fruits**");
        for (Product product : category1.products) {
            System.out.println("Product: " + product.name +
                    "\nPrice: " + product.price + "\nRating: " + product.rating);
        }
        System.out.println("**Vegetables**");
        for (Product product : category2.products) {
            System.out.println("Product: " + product.name +
                    "\nPrice: " + product.price + "\nRating: " + product.rating);
        }
        System.out.println("**Grass**");
        for (Product product : category3.products) {
            System.out.println("Product: " + product.name +
                    "\nPrice: " + product.price + "\nRating: " + product.rating);
        }
//6)Вывести на консоль покупки посетителей магазина.
// (После покупки у пользователя добавляется товар, а из магазина - удаляется)
        System.out.println("User Purchases: ");
        System.out.println("User1");
        for(Product product : user1.getBasket().purchasedProducts){
            System.out.println(product.name);
        }
        System.out.println("User2");
        for(Product product : user2.getBasket().purchasedProducts){
            System.out.println(product.name);
        }
        System.out.println("User3");
        for(Product product : user3.getBasket().purchasedProducts){
            System.out.println(product.name);
        }
    }
}