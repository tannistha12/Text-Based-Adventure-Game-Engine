//Specifies that this class belongs to the com.textadventure.model package
package com.textadventure.model;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.textadventure.model.Item;
/**
 *Represents a single location or room within the game.
 *It will hold information about the room and its contents.
 * (This is just a placeholder for now)
*/
public class Room {
    // Attributes (name, description, items, etc.) can be added later
    // Constructor will be added later
    // Methods (getters, setters, etc.) can be added later
    
    //Attributes
    private String name; // Name of the room
    private String description; // Description of the roomss
    private Map<String, String> exits; // Items in the room, using a map for easy access by name}
    private List<Item> items; // List of items in the room

    public Room(String name, String description) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Room name cannot be null or empty.");
        }
        if (description == null || description.trim().isEmpty()) {
            throw new IllegalArgumentException("Room description cannot be null or empty.");
        }

        this.name = name.trim();
        this.description = description;
        this.exits = new HashMap<>(); // Initialize exits map
        this.items = new ArrayList<>(); // Initialize items list
    }

    public String getName() {
        return this.name;
    }
    public String getDescription() {
        return this.description;
    }
    public Map<String, String> getExits() {
        return this.exits;
    }
    public List<Item> getItems() {
        return this.items;
    }

    public void addItem(Item item) {
        if (item == null) {
            throw new IllegalArgumentException("Item cannot be null.");
        }
        this.items.add(item);
    }

    public boolean removeItem(Item item) {
        if (item == null) {
            throw new IllegalArgumentException("Item cannot be null.");
        }
        return this.items.remove(item);
    }

    public void addExit(String direction, String destinationRoomName) {
        if (direction == null || direction.trim().isEmpty()) {
            throw new IllegalArgumentException("Direction cannot be null or empty.");
        }
        if (destinationRoomName == null || destinationRoomName.trim().isEmpty()) {
            throw new IllegalArgumentException("Room name cannot be null or empty.");
        }

        String normalizedDirection = direction.trim().toLowerCase();
        String trimmedDestination = destinationRoomName.trim().toLowerCase();
        this.exits.put(normalizedDirection, trimmedDestination);
    }
        
}
// End of Room class