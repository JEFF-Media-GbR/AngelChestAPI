package de.jeff_media.angelchest;

import com.allatori.annotations.DoNotRename;
import org.bukkit.OfflinePlayer;
import org.bukkit.block.Block;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;
import java.util.function.Consumer;

/**
 * Represents the main instance of the AngelChest plugin
 */
@DoNotRename
public interface AngelChestPlugin {

    /**
     * Gets a Set of all currently loaded AngelChests
     * @return Set including all loaded AngelChests
     */
    @NotNull Set<AngelChest> getAllAngelChests();

    /**
     * Gets a LinkedHashSet of all AngelChests currently loaded and owned by a specific player. The position of the chests inside the LinkedHashSet correspondents to their ID in /aclist
     * @param player
     * @return Set including all loaded AngelChests by this player
     */
    @NotNull LinkedHashSet<AngelChest> getAllAngelChestsFromPlayer(OfflinePlayer player);

    /**
     * Gets an AngelChest at a specific location, or null if that block is not an AngelChest
     * @param block
     * @return The AngelChest, or null
     */
    @Nullable AngelChest getAngelChestAtBlock(Block block);

    @NotNull AngelChest createAngelChest(AngelChestBuilder angelChestBuilder);

}
