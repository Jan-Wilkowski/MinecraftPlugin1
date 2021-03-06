package com.jano.plugin.utilities;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class TPBowUtils {

    public static ItemStack createTeleportBow() {

        ItemStack bow = new ItemStack(Material.BOW, 1);
        ItemMeta bowMeta = bow.getItemMeta();
        bowMeta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Teleport Bow");
        List<String> lore = new ArrayList<>();
        lore.add("take your shot");
        lore.add("and teleport anywhere");
        bowMeta.setLore(lore);
        bowMeta.addEnchant(Enchantment.ARROW_INFINITE, 1, false);
        bow.setItemMeta(bowMeta);

        return bow;
    }
}
