package de.jeff_media.angelchest;

import de.jeff_media.angelchest.lib.org.jetbrains.annotations.NotNull;
import de.jeff_media.angelchest.lib.org.jetbrains.annotations.Nullable;
import org.bukkit.OfflinePlayer;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.inventory.ItemStack;

import java.util.List;

/**
 * Represents an instance of an AngelChest
 */
public interface AngelChest {

    /**
     * Gets the items the player had equipped in the armor slots
     * @return Stored armor items
     */
    @NotNull ItemStack[] getArmorInv();

    /**
     * Sets the items the player had equipped in the armor slots
     * @param armorInv New armor items. Must be an array of 4 ItemStacks
     */
    void setArmorInv(@NotNull ItemStack[] armorInv);

    /**
     * Gets the items the player had stored in his regular inventory
     * @return Stored items
     */
    @NotNull ItemStack[] getStorageInv();

    /**
     * Sets the items the player had stored in his regular inventory
     * @param storageInv New items. Must be an array of 36 ItemStacks
     */
    void setStorageInv(@NotNull ItemStack[] storageInv);

    /**
     * Gets the offhand item
     * @return Offhand item
     */
    @Nullable ItemStack getOffhandItem();

    /**
     * Sets the offhand item
     * @param offhandItem
     */
    void setOffhandItem(@Nullable ItemStack offhandItem);

    /**
     * Checks whether the chest is protected from other players
     * @return true when protected, otherwise false
     */
    boolean isProtected();

    /**
     * Sets whether the chest is protected from other players
     * @param isProtected
     */
    void setProtected(boolean isProtected);

    /**
     * Gets the amount of seconds that are left until the chest expires
     * @return Seconds left
     */
    int getSecondsLeft();

    /**
     * Sets the amount of seconds left until the chest expires
     * @param secondsLeft
     */
    void setSecondsLeft(int secondsLeft);

    /**
     * Gets the amount of seconds left until the chest will automatically unlock
     * @return Amount of seconds left, or -1 if the chest will not automatically unlock
     */
    int getUnlockIn();

    /**
     * Sets the amount of seconds left until the chest will automatically unlock
     * @param unlockIn Amount of seconds left, or -1 if the chest shall not automatically unlock
     */
    void setUnlockIn(int unlockIn);

    /**
     * Gets the amount of experience stored in the chest
     * @return Amount of experience
     */
    int getExperience();

    /**
     * Sets the amount of experience stored in the chest
     * @param experience
     */
    void setExperience(int experience);

    /**
     * Gets the player who owns the chest
     * @return
     */
    @NotNull OfflinePlayer getPlayer();

    /**
     * Gets the block where the chest was spawned
     * @return
     */
    @NotNull Block getBlock();

    /**
     * Gets the world where the chest was spawned
     * @return
     */
    @NotNull World getWorld();

    /**
     * Checks whether this chest is completely empty
     * @return true if the chest contains neither experience nor any items, otherwise false
     */
    boolean isEmpty();

    /**
     * Checks whether this chest will expire sometime
     * @return true if the chest is infinite, otherwise false
     */
    boolean isInfinite();

    /**
     * Set whether this chest will expire sometime
     * @param isInfinite true if the chest shall never expire, otherwise false
     */
    void setInfinite(boolean isInfinite);

    /**
     * Gets a list of all players who have opened this chest
     * @return
     */
    @NotNull List<OfflinePlayer> getOpenedBy();

    /**
     * Gets the java.lang.System.currentTimeMillis() when this chest has been created
     * @return
     */
    long getCreated();

}
