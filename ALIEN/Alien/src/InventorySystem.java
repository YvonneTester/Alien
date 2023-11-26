import java.sql.SQLOutput;
import java.util.ArrayList;

public class InventorySystem {
    public static void main(String[] args) {
        ArrayList<Item> inventory = new ArrayList<>();

        // Adding custom items to the inventory
        Item healthPotion = new Item("Health Potion", "Potion", 20);
        Item sword = new Item("Sword", "Weapon", 50);
        Item shield = new Item("Shield", "Armor", 30);
        Item elixir = new Item("Mana Elixir", "Liquid", 80);
        Item staff = new Item("Magic Staff", "Secret Weapon", 90);
        Item helmet = new Item("Helmet", "Protection", 60);

        inventory.add(healthPotion);
        inventory.add(sword);
        inventory.add(shield);
        inventory.add(elixir);
        inventory.add(staff);
        inventory.add(helmet);

        // Displaying inventory items
// Opdr 2 van kyna die ik heb geschreven is hieronder.
//        System.out.println("Second "+ inventory.get(1).getType);

        inventory.remove(2);

        for (Item item : inventory) {
            System.out.println(item);
        }


        System.out.println(inventory.set(shield.getValue(40));

// hieronder opdr 5 van kyna mhv van chattie

        int totalValue = 0;

        for (Item item : inventory) {
            totalValue += item.getValue();
            System.out.println(item);
        }
        System.out.println("Inventory Summary: Total Value = " + totalValue);
    }
    }

