
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.peluchebouboulemod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.peluchebouboulemod.potion.ReconfortMobEffect;
import net.mcreator.peluchebouboulemod.PelucheBoubouleModMod;

public class PelucheBoubouleModModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, PelucheBoubouleModMod.MODID);
	public static final RegistryObject<MobEffect> RECONFORT = REGISTRY.register("reconfort", () -> new ReconfortMobEffect());
}
