package de.jeff_media.angelchest;

import lombok.Getter;
import org.bukkit.event.entity.EntityDamageEvent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Getter
public class DeathReason {

    private final EntityDamageEvent.DamageCause damageCause;
    private final String killerName;
    private final EntityDamageEvent lastDamageEvent;

    public static DeathReason DEFAULT = new DeathReason(EntityDamageEvent.DamageCause.CUSTOM, null);

    public DeathReason(@NotNull EntityDamageEvent.DamageCause damageCause, @Nullable String killerName) {
        this.damageCause = damageCause;
        this.killerName = killerName;
        this.lastDamageEvent = null;
    }

    public DeathReason(@NotNull EntityDamageEvent lastDamageEvent) {
        this.damageCause = null;
        this.killerName = null;
        this.lastDamageEvent = lastDamageEvent;
    }
}
