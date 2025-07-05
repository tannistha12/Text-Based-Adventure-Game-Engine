package com.textadventure.model;

/**
 * Represents an item that can be found in rooms or carried by the player.
 * It will hold information like the item's name and description.
 */
public class Item {
    //Attributes
    private String name; // Name of the item, declared as private to enforce encapsulation.
    private String description; // Description of the item, also private for encapsulation.

    //Constructor
    public Item(String name, String description) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Item name cannot be null or empty.");
        }
        if (description == null || description.trim().isEmpty()) {
            throw new IllegalArgumentException("Item description cannot be null or empty.");
        }
        this.name = name;
        this.description = description;
    }

    // Getters
    public String getName() {
        return this.name;
    }
    public String getDescription() {
        return this.description;
    }
}

