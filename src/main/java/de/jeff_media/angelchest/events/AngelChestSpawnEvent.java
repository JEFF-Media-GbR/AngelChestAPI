package de.jeff_media.angelchest.events;

import de.jeff_media.angelchest.data.AngelChest;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

/**
 * Called after an AngelChest has been spawned
 */
public class AngelChestSpawnEvent extends Event {

    private static HandlerList HANDLERS = new HandlerList();
    private final AngelChest angelchest;

    public AngelChestSpawnEvent(AngelChest angelChest) {
        this.angelchest = angelChest;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    /**
     * Returns the AngelChest that has been spawned
     * @return
     */
    public AngelChest getAngelChest() {
        return angelchest;
    }
}
