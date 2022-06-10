package de.jeff_media.angelchest.events;

import com.allatori.annotations.DoNotRename;
import de.jeff_media.angelchest.AngelChest;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

/**
 * Called after an AngelChest has been spawned
 */
@DoNotRename
public class AngelChestSpawnEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();
    private final AngelChest angelchest;

    public AngelChestSpawnEvent(AngelChest angelChest) {
        this.angelchest = angelChest;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
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
