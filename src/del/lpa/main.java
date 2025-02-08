package del.lpa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] groceryItems = {"Apple", "Milk", "Bread", "Cheese",
                "Butter", "Fish", "Meat", "Banana"};

        ArrayList<String> groceryList = new ArrayList<>(List.of(groceryItems));

        System.out.println("ArrayLIst: " + groceryList);

        while (true){
            System.out.println("\nAvailable actions:" +
                    "\n0 - to shutdown" +
                    "\n1 - to add item(s) to the list (comma delimited list)" +
                    "\n2 - to remove any items (comma delimited list)" +
                    "\nEnter a number for which action you want to do: ");
            int respond = scanner.nextInt();
            scanner.nextLine();

            if (respond == 0){
                System.out.println("Shutting down...");
                break;
            } else if (respond == 1) {
                System.out.println("Add new item(s) to the list (comma separated): ");
                String newItem = scanner.nextLine();
                groceryList.add(newItem);
                System.out.println("Updated list: " + groceryList);
                
            }else if (respond == 2){
                System.out.println("Enter item to remove from the list");
                String item = scanner.nextLine();
                groceryList.remove(item);
                System.out.println("Updated list: " + groceryList);
            }
            else {
                System.out.println("Invalid option. Try again.");
            }
        }
        scanner.close();
    }
}
