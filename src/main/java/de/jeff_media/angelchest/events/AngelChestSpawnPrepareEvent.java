package de.jeff_media.angelchest.events;

import com.allatori.annotations.DoNotRename;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.PlayerDeathEvent;

/**
 * Called before an AngelChest is being spawned
 */
@DoNotRename
public class AngelChestSpawnPrepareEvent extends Event implements Cancellable {

    private boolean isCancelled = false;
    private final Player player;

    private Block block;
    private final EntityDamageEvent.DamageCause damageCause;

    private final PlayerDeathEvent playerDeathEvent;

    private static final HandlerList HANDLERS = new HandlerList();

    /**
     * Gets the PlayerDeathEvent that caused this de.jeff_media.angelchest.AngelChest to be spawned
     * @return PlayerDeathEvent related to this de.jeff_media.angelchest.AngelChest spawn attempt
     */
    public PlayerDeathEvent getPlayerDeathEvent() {
        return playerDeathEvent;
    }

    /**
     * Gets the player who died
     * @return Player who died
     */
    public Player getPlayer() {
        return player;
    }

    /**
     * Gets the block where the de.jeff_media.angelchest.AngelChest will be created
     * @return Block where the de.jeff_media.angelchest.AngelChest will be created
     */
    public Block getBlock() {
        return block;
    }

    /**
     * Sets a new Block where the de.jeff_media.angelchest.AngelChest should be located
     * @param block Block where the de.jeff_media.angelchest.AngelChest should be located
     */
    public void setBlock(Block block) {
        this.block = block;
    }

    /**
     * Gets the DamageCause why the player died
     * @return DamageCause why the player died
     */
    public EntityDamageEvent.DamageCause getDamageCause() {
        return damageCause;
    }

    public AngelChestSpawnPrepareEvent(Player player, Block block, EntityDamageEvent.DamageCause damageCause, PlayerDeathEvent playerDeathEvent) {
        this.player = player;
        this.block = block;
        this.damageCause = damageCause;
        this.playerDeathEvent = playerDeathEvent;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

    @Override
    public boolean isCancelled() {
        return isCancelled;
    }

    /**
     * Whether or not this event should be cancelled. If cancelled, the chest will not be spawned
     * @param cancel Whether or not AngelChest should handle this player's death
     */
    @Override
    public void setCancelled(boolean cancel) {
        isCancelled=cancel;
    }
}
