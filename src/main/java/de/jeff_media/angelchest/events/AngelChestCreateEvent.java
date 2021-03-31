package de.jeff_media.angelchest.events;

import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.event.entity.EntityDamageEvent;

public class AngelChestCreateEvent extends Event implements Cancellable {

    private boolean isCancelled = false;
    private final Player player;
    private final Block block;
    private final EntityDamageEvent.DamageCause damageCause;

    private static HandlerList HANDLERS = new HandlerList();

    public Player getPlayer() {
        return player;
    }

    public Block getBlock() {
        return block;
    }

    public EntityDamageEvent.DamageCause getDamageCause() {
        return damageCause;
    }

    public AngelChestCreateEvent(Player player, Block block, EntityDamageEvent.DamageCause damageCause) {
        this.player = player;
        this.block = block;
        this.damageCause = damageCause;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    @Override
    public boolean isCancelled() {
        return isCancelled;
    }

    @Override
    public void setCancelled(boolean b) {
        isCancelled=b;
    }
}
