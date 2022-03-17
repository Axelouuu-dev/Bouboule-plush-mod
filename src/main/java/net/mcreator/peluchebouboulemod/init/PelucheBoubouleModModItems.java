
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.peluchebouboulemod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.item.Item;

import net.mcreator.peluchebouboulemod.item.PelucheBouboulePirateItem;
import net.mcreator.peluchebouboulemod.item.PelucheBoubouleMarioItem;
import net.mcreator.peluchebouboulemod.item.PelucheBoubouleLunettesItem;
import net.mcreator.peluchebouboulemod.item.PelucheBoubouleLuigiItem;
import net.mcreator.peluchebouboulemod.item.PelucheBoubouleItem;
import net.mcreator.peluchebouboulemod.item.PelucheBoubouleHautDeFormeItem;
import net.mcreator.peluchebouboulemod.item.PelucheBoubouleDocteurItem;
import net.mcreator.peluchebouboulemod.item.PelucheBoubouleChapeauDePailleItem;
import net.mcreator.peluchebouboulemod.item.PelucheBoubouleBonnetDeNoelItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PelucheBoubouleModModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item PELUCHE_BOUBOULE = register(new PelucheBoubouleItem());
	public static final Item PELUCHE_BOUBOULE_BONNET_DE_NOEL = register(new PelucheBoubouleBonnetDeNoelItem());
	public static final Item PELUCHE_BOUBOULE_HAUT_DE_FORME = register(new PelucheBoubouleHautDeFormeItem());
	public static final Item PELUCHE_BOUBOULE_DOCTEUR = register(new PelucheBoubouleDocteurItem());
	public static final Item PELUCHE_BOUBOULE_LUIGI = register(new PelucheBoubouleLuigiItem());
	public static final Item PELUCHE_BOUBOULE_PIRATE = register(new PelucheBouboulePirateItem());
	public static final Item PELUCHE_BOUBOULE_MARIO = register(new PelucheBoubouleMarioItem());
	public static final Item PELUCHE_BOUBOULE_CHAPEAU_DE_PAILLE = register(new PelucheBoubouleChapeauDePailleItem());
	public static final Item PELUCHE_BOUBOULE_LUNETTES = register(new PelucheBoubouleLunettesItem());

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
