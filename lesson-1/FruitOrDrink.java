import java.util.Scanner; 

public class FruitOrDrink {
    public static void main(String[] args) {
    
        
        Scanner myscan = new Scanner(System.in);

        System.out.println("Would you like a fruit or a drink?");
        String choice = myscan.nextLine();
        choice = choice.toLowerCase();

        double price = 0;

        
        if (choice.equals("fruit")) {
            System.out.println("Available fruits: apple, orange, pear, strawberry, banana.");
            System.out.println("What fruit do you want to buy?");

            String fruitUserWants = myscan.nextLine();

            if (fruitUserWants.equals("apple")) {
                price = 1.07;
            } else if (fruitUserWants.equals("orange")) {
                price = 1.03;
            } else if (fruitUserWants.equals("pear")) {
                price = 1.14;
            } else if (fruitUserWants.equals("strawberry")) {
                price = 0.52;
            } else if (fruitUserWants.equals("banana")) {
                price = 0.79;
            }
    
            
            System.out.println("Your total is $" + price);
            

        } else if (choice.equals("drink")) {
            System.out.println("Available drinks: water, juice, tea, coffee.");
            System.out.println("What drink do you want?");

            String  drinkUserWants = myscan.nextLine();

            if(drinkUserWants.equals("water")) {
                price = 1.50;
            } else if (drinkUserWants.equals("juice")) {
                price = 2.00;
            } else if (drinkUserWants.equals("tea")) {
                price = 2.01;
            } else if (drinkUserWants.equals("coffee")) {
                price = 3.00;
            }

            {
                System.out.println("Your total is $" + price);
            }

        }


    }
}





