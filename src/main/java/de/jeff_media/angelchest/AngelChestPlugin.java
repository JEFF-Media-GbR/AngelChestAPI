package de.jeff_media.angelchest;

import de.jeff_media.angelchest.lib.org.jetbrains.annotations.NotNull;
import de.jeff_media.angelchest.lib.org.jetbrains.annotations.Nullable;
import org.bukkit.OfflinePlayer;
import org.bukkit.block.Block;

import java.util.LinkedHashSet;
import java.util.Set;

public interface AngelChestPlugin {

    @NotNull Set<AngelChest> getAllAngelChests();

    @NotNull LinkedHashSet<AngelChest> getAllAngelChestsFromPlayer(OfflinePlayer player);

    @Nullable AngelChest getAngelChestAtBlock(Block block);

}
