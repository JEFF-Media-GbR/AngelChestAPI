package de.jeff_media.angelchest.events;

import com.allatori.annotations.DoNotRename;
import de.jeff_media.angelchest.AngelChest;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

/**
 * Represents an event related to "opening" an AngelChest by either fast-looting it, opening its GUI or breaking the block itself.
 * It will NOT get called when the inventory of an AngelChest is opened in preview (read-only) mode.
 */
@DoNotRename
public class AngelChestOpenEvent extends Event implements Cancellable {
    private static final HandlerList HANDLERS = new HandlerList();
    private final AngelChest angelchest;
    private final Player player;
    private final Reason reason;
    private boolean isCancelled;

    public AngelChestOpenEvent(AngelChest angelChest, Player player, Reason reason) {
        this.angelchest = angelChest;
        this.player = player;
        this.reason = reason;
    }

    @Override
    public @NotNull HandlerList getHandlers() {
        return HANDLERS;
    }

    public static @NotNull HandlerList getHandlerList() {
        return HANDLERS;
    }

    /**
     * Returns the AngelChest that is about to be opened
     */
    public @NotNull AngelChest getAngelChest() {
        return angelchest;
    }

    /**
     * Returns the player that is about to open the AngelChest
     */
    public @NotNull Player getPlayer() {
        return player;
    }

    /**
     * Gets whether the event is cancelled. If the event is cancelled, the AngelChest will not be opened, fast-looted or broken.
     */
    @Override
    public boolean isCancelled() {
        return isCancelled;
    }

    /**
     * Sets whether the event is cancelled. If the event is cancelled, the AngelChest will not be opened, fast-looted or broken.
     */
    @Override
    public void setCancelled(boolean cancelled) {
        isCancelled = cancelled;
    }

    /**
     * Gets the Reason for opening the AngelChest
     */
    public @NotNull Reason getReason() {
        return reason;
    }

    @DoNotRename
    public enum Reason {
        /**
         * Represents a player opening the GUI of an AngelChest
         */
        OPEN_GUI,
        /**
         * Represents a player fast-looting an AngelChest
         */
        FAST_LOOT,
        /**
         * Represents a player breaking an AngelChest. If the event will be cancelled, the underlying BlockBreakEvent will be cancelled too.
         */
        BREAK
    }
}

