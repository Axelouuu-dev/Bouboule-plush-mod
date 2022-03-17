
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.peluchebouboulemod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

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
import net.mcreator.peluchebouboulemod.PelucheBoubouleModMod;

public class PelucheBoubouleModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, PelucheBoubouleModMod.MODID);
	public static final RegistryObject<Item> PELUCHE_BOUBOULE = REGISTRY.register("peluche_bouboule", () -> new PelucheBoubouleItem());
	public static final RegistryObject<Item> PELUCHE_BOUBOULE_BONNET_DE_NOEL = REGISTRY.register("peluche_bouboule_bonnet_de_noel",
			() -> new PelucheBoubouleBonnetDeNoelItem());
	public static final RegistryObject<Item> PELUCHE_BOUBOULE_HAUT_DE_FORME = REGISTRY.register("peluche_bouboule_haut_de_forme",
			() -> new PelucheBoubouleHautDeFormeItem());
	public static final RegistryObject<Item> PELUCHE_BOUBOULE_DOCTEUR = REGISTRY.register("peluche_bouboule_docteur",
			() -> new PelucheBoubouleDocteurItem());
	public static final RegistryObject<Item> PELUCHE_BOUBOULE_LUIGI = REGISTRY.register("peluche_bouboule_luigi",
			() -> new PelucheBoubouleLuigiItem());
	public static final RegistryObject<Item> PELUCHE_BOUBOULE_PIRATE = REGISTRY.register("peluche_bouboule_pirate",
			() -> new PelucheBouboulePirateItem());
	public static final RegistryObject<Item> PELUCHE_BOUBOULE_MARIO = REGISTRY.register("peluche_bouboule_mario",
			() -> new PelucheBoubouleMarioItem());
	public static final RegistryObject<Item> PELUCHE_BOUBOULE_CHAPEAU_DE_PAILLE = REGISTRY.register("peluche_bouboule_chapeau_de_paille",
			() -> new PelucheBoubouleChapeauDePailleItem());
	public static final RegistryObject<Item> PELUCHE_BOUBOULE_LUNETTES = REGISTRY.register("peluche_bouboule_lunettes",
			() -> new PelucheBoubouleLunettesItem());
}
