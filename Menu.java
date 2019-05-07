public class Menu {
    public static void main(String[] args) {
        Drink drink1 = new Drink();
        drink1.name= "Mohito";
        drink1.price= 18.90;
        drink1.alcohol=true;
        drink1.ingredient1.name="lime";
        drink1.ingredient1.quantity=0.015;
        drink1.ingredient2.name="rum";
        drink1.ingredient2.quantity=0.05;
        drink1.ingredient3.name ="ice and sparkling water";
        drink1.ingredient3.quantity =0.2;
        double quantityTotal = drink1.ingredient1.quantity + drink1.ingredient2.quantity + drink1.ingredient3.quantity;

        System.out.println("About the drink");
        System.out.printf("Name: %s\n", drink1.name);
        System.out.printf("Price: %.2f%n", drink1.price);
        System.out.printf("Is it an alcoholic drink?: %b\n", drink1.alcohol);
        System.out.printf("Ingredients: %s, %s, %s.\n", drink1.ingredient1.name, drink1.ingredient2.name, drink1.ingredient3.name);
        System.out.printf("Quantity in liter: %.2f%n", quantityTotal);

    }
}
