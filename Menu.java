public class Menu {
    public static void main(String[] args) {
        Drink drink1 = new Drink();
        drink1.name= "Mohito";
        drink1.price= 18.90;
        drink1.alcohol=true;
        drink1.ingredient.name1="lime";
        drink1.ingredient.quantity1=0.015;
        drink1.ingredient.name2="rum";
        drink1.ingredient.quantity2=0.05;
        drink1.ingredient.name3 ="ice and sparkling water";
        drink1.ingredient.quantity3 =0.2;
        double quantityTotal = drink1.ingredient.quantity1 + drink1.ingredient.quantity2 + drink1.ingredient.quantity3;

        System.out.println("About the drink");
        System.out.printf("Name: %s\n", drink1.name);
        System.out.printf("Price: %.2f%n", drink1.price);
        System.out.printf("Is it an alcoholic drink?: %b\n", drink1.alcohol);
        System.out.printf("Ingredients: %s %s %s\n", drink1.ingredient.name1, drink1.ingredient.name2, drink1.ingredient.name3 );
        System.out.printf("Quantity in liter: %.2f%n", quantityTotal);



    }
}
