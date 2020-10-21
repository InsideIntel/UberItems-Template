// This should be in your main class, you can also use a util class to make the registerIntelItems method.

package me.insideintel;

import me.insideintel.newitems.PoisonStick;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;
import thirtyvirus.uber.UberItem;
import thirtyvirus.uber.UberItems;
import thirtyvirus.uber.helpers.AbilityType;
import thirtyvirus.uber.helpers.UberAbility;
import thirtyvirus.uber.helpers.UberRarity;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class IntelItems extends JavaPlugin {
    @Override
    public void onEnable() {
        registerIntelItems();
    }

    private void registerIntelItems() {
       putItem("poison_stick", new PoisonStick(UberItems.getPlugin(UberItems.class),
                20, UberRarity.UNCOMMON, "Poison Stick",
                Material.STICK,false, false,
                false, true,
                Arrays.asList(new UberAbility("POISON!", AbilityType.RIGHT_CLICK,
                        "Right Click anything to\nshoot poison anywhere"))));
    }
    public void putItem(String name, UberItem item) {
        UberItems.items.put(name, item);
        UberItems.itemIDs.put(item.getID(), name);
    }

}
