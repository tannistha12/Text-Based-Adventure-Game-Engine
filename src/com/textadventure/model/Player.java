package com.textadventure.model;

//imports will be needed
import java.util.List;
import java.util.ArrayList;
import com.textadventure.model.Item;

/**
 * Represents the player character in the game.
 * It will keep track of the player's current location and inventory.
 * (This is just a placeholder file for now).
 */
public class Player {
    private String currentRoomName;

    private List<Item> inventory;

    public Player(String startingRoomName) {
        if (startingRoomName == null || startingRoomName.trim().isEmpty()) {
            throw new IllegalArgumentException("Starting room name cannot be null or empty.");
        }
        this.currentRoomName = startingRoomName.trim();
        this.inventory = new ArrayList<>(); // Initialize inventory
    }

    public void takeItem(Item item) {
        if (item == null) {
            throw new IllegalArgumentException("Item cannot be null.");
        }
        this.inventory.add(item);
    }

    public boolean dropItem(Item item) {
        if (item == null) {
            throw new IllegalArgumentException("Item cannot be null.");
        }
        return this.inventory.remove(item);
    }

    public List<Item> getInventory() {
        return this.inventory;
    }

    public String getCurrentRoomName() {
        return this.currentRoomName;
    }

    public void setCurrentRoomName(String newRoomName) {
        if (newRoomName == null || newRoomName.trim().isEmpty()) {
            throw new IllegalArgumentException("New room name cannot be null or empty.");
        }
        this.currentRoomName = newRoomName.trim();
    }
}
