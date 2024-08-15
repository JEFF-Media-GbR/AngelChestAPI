package de.jeff_media.angelchest;

import org.bukkit.block.Block;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

import javax.swing.text.html.parser.Entity;
import java.util.UUID;
import java.util.function.Consumer;

public class AngelChestBuilder {
    private ItemStack[] armorInv = new ItemStack[4];
    private ItemStack[] extraInv = new ItemStack[1];
    private ItemStack[] storageInv = new ItemStack[36];
    private boolean suspendWhenOffline = false;
    private Block block;
    private UUID owner;
    private String ownerName;
    private int secondsLeft = 600;
    private int unlockIn = -1;
    private boolean isProtected = false;
    //private String customBlock = "minecraft:chest";
    private int experience = 0;
    private int levels = 0;
    private DeathReason deathReason;
    private String logFile;
    private Consumer<AngelChest> consumer;

    public AngelChestBuilder consumer(Consumer<AngelChest> consumer) {
        this.consumer = consumer;
        return this;
    }

    public Consumer<AngelChest> consumer() {
        return consumer;
    }

    public AngelChestBuilder logFile(String logFile) {
        this.logFile = logFile;
        return this;
    }

    public String logFile() {
        return logFile;
    }

    public AngelChestBuilder ownerName(@NotNull String ownerName) {
        this.ownerName = ownerName;
        return this;
    }

    public String ownerName() {
        return ownerName;
    }

    public AngelChestBuilder deathReason(@NotNull DeathReason deathReason) {
        this.deathReason = deathReason;
        return this;
    }

    public DeathReason deathReason() {
        return deathReason;
    }

    public AngelChestBuilder armorInv(ItemStack[] armorInv) {
        validate(armorInv.length == 4, "Armor inventory must have exactly 4 slots");
        this.armorInv = armorInv;
        return this;
    }

    public ItemStack[] armorInv() {
        return armorInv;
    }

    public AngelChestBuilder extraInv(ItemStack[] extraInv) {
        validate(extraInv.length == 1, "Extra inventory must have exactly 1 slot");
        this.extraInv = extraInv;
        return this;
    }

    public ItemStack[] extraInv() {
        return extraInv;
    }

    public AngelChestBuilder storageInv(ItemStack[] storageInv) {
        validate(storageInv.length == 36, "Storage inventory must have exactly 36 slots");
        this.storageInv = storageInv;
        return this;
    }

    public ItemStack[] storageInv() {
        return storageInv;
    }

    public AngelChestBuilder suspendWhenOffline(boolean suspendWhenOffline) {
        this.suspendWhenOffline = suspendWhenOffline;
        return this;
    }

    public boolean suspendWhenOffline() {
        return suspendWhenOffline;
    }

    public AngelChestBuilder block(@NotNull Block block) {
        this.block = block;
        return this;
    }

    public Block block() {
        return block;
    }

    public AngelChestBuilder owner(@NotNull UUID owner) {
        this.owner = owner;
        return this;
    }

    public UUID owner() {
        return owner;
    }

    public AngelChestBuilder secondsLeft(int secondsLeft) {
        this.secondsLeft = secondsLeft;
        return this;
    }

    public int secondsLeft() {
        return secondsLeft;
    }

    public AngelChestBuilder unlockIn(int unlockIn) {
        this.unlockIn = unlockIn;
        return this;
    }

    public int unlockIn() {
        return unlockIn;
    }

    public AngelChestBuilder isProtected(boolean isProtected) {
        this.isProtected = isProtected;
        return this;
    }

    public boolean isProtected() {
        return isProtected;
    }

//    public AngelChestBuilder customBlock(String customBlock) {
//        this.customBlock = customBlock;
//        return this;
//    }
//
//    public String customBlock() {
//        return customBlock;
//    }

    public AngelChestBuilder experience(int experience) {
        this.experience = experience;
        return this;
    }

    public int experience() {
        return experience;
    }

    public AngelChestBuilder levels(int levels) {
        this.levels = levels;
        return this;
    }

    public int levels() {
        return levels;
    }

    private static void validate(boolean condition, String message) {
        if(!condition) {
            throw new IllegalArgumentException(message);
        }
    }

    public void validate() {
        validate(block != null, "Block must not be null");
        validate(owner != null, "Owner must not be null");
        validate(ownerName != null, "Owner name must not be null");
        //validate(customBlock != null, "Custom block must not be null");
        if(deathReason == null) {
            deathReason = DeathReason.DEFAULT;
        }
    }

    public AngelChestBuilder(UUID owner, String ownerName, Block block/*, String customBlock*/) {
        this.owner = owner;
        this.ownerName = ownerName;
        this.block = block;
        //this.customBlock = customBlock;
    }

}
