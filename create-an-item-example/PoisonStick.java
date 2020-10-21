package me.insideintel.newitems;

import me.insideintel.IntelItems;
import org.bukkit.Color;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.block.Block;
import org.bukkit.block.data.type.Bed;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.util.Vector;
import thirtyvirus.uber.UberItem;
import thirtyvirus.uber.UberItems;
import thirtyvirus.uber.helpers.UberAbility;
import thirtyvirus.uber.helpers.UberRarity;
import thirtyvirus.uber.items.UberItemTemplate;

import java.util.List;

public class PoisonStick extends UberItem {
    // Test item to see what I can do with UberItems
    public PoisonStick(UberItems main, int id, UberRarity rarity, String name, Material material, boolean canBreakBlocks, boolean stackable, boolean oneTimeUse, boolean hasActiveEffect, List<UberAbility> abilities) {
        super(main, id, rarity, name, material, canBreakBlocks, stackable, oneTimeUse, hasActiveEffect, abilities);
    }

    @Override
    public void onItemStackCreate(ItemStack itemStack) {

    }

    @Override
    public void getSpecificLorePrefix(List<String> list, ItemStack itemStack) {

    }

    @Override
    public void getSpecificLoreSuffix(List<String> list, ItemStack itemStack) {

    }

    @Override
    public void leftClickAirAction(Player player, ItemStack itemStack) {

    }

    @Override
    public void leftClickBlockAction(Player player, PlayerInteractEvent playerInteractEvent, Block block, ItemStack itemStack) {

    }

    @Override
    public void rightClickAirAction(Player player, ItemStack itemStack) {
        Location playerLocation = player.getEyeLocation();
        Vector direction = playerLocation.getDirection();
        direction.multiply(8);
        Location destination = playerLocation.clone().add(direction);
        List<Entity> nearbyEntities = (List<Entity>) destination.getWorld().getNearbyEntities(destination, 2, 2, 2);
        for (int i = 0; i < 8; i++) {
            Location loc = playerLocation.add(playerLocation.getDirection().multiply(i));
            loc.getWorld().spawnParticle(Particle.REDSTONE, loc, 0, 0.001, 1, 0, 1, new Particle.DustOptions(Color.RED, 1));
        }
         for (Entity e : destination.getWorld().getNearbyEntities(destination, 0, 0, 0)) {
             if (nearbyEntities.contains(e)) {
                 LivingEntity entity = (LivingEntity) e;
                 entity.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 80, 1));
             }
         }
    }

    @Override
    public void rightClickBlockAction(Player player, PlayerInteractEvent playerInteractEvent, Block block, ItemStack itemStack) {

    }

    @Override
    public void shiftLeftClickAirAction(Player player, ItemStack itemStack) {

    }

    @Override
    public void shiftLeftClickBlockAction(Player player, PlayerInteractEvent playerInteractEvent, Block block, ItemStack itemStack) {

    }

    @Override
    public void shiftRightClickAirAction(Player player, ItemStack itemStack) {

    }

    @Override
    public void shiftRightClickBlockAction(Player player, PlayerInteractEvent playerInteractEvent, Block block, ItemStack itemStack) {

    }

    @Override
    public void middleClickAction(Player player, ItemStack itemStack) {

    }

    @Override
    public void hitEntityAction(Player player, EntityDamageByEntityEvent entityDamageByEntityEvent, Entity entity, ItemStack itemStack) {

    }

    @Override
    public void clickedInInventoryAction(Player player, InventoryClickEvent inventoryClickEvent) {

    }

    @Override
    public void activeEffect(Player player, ItemStack itemStack) {

    }
}
