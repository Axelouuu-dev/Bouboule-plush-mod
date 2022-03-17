package net.mcreator.peluchebouboulemod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.AdvancementEvent;

import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import javax.annotation.Nullable;

import java.util.Iterator;

@Mod.EventBusSubscriber
public class ProcedureCollectionTermineeProcedure {
	@SubscribeEvent
	public static void onAdvancement(AdvancementEvent event) {
		execute(event, event.getPlayer());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		double TouteLesPeluches = 0;
		TouteLesPeluches = 0;
		if (entity instanceof ServerPlayer _plr && _plr.level instanceof ServerLevel
				? _plr.getAdvancements()
						.getOrStartProgress(
								_plr.server.getAdvancements().getAdvancement(new ResourceLocation("peluche_bouboule_mod:peluche_pirate_en_poche")))
						.isDone()
				: false) {
			TouteLesPeluches = TouteLesPeluches + 1;
		}
		if (entity instanceof ServerPlayer _plr && _plr.level instanceof ServerLevel
				? _plr.getAdvancements()
						.getOrStartProgress(_plr.server.getAdvancements().getAdvancement(new ResourceLocation("peluche_bouboule_mod:pelulche_luigi")))
						.isDone()
				: false) {
			TouteLesPeluches = TouteLesPeluches + 1;
		}
		if (entity instanceof ServerPlayer _plr && _plr.level instanceof ServerLevel
				? _plr.getAdvancements()
						.getOrStartProgress(_plr.server.getAdvancements().getAdvancement(new ResourceLocation("peluche_bouboule_mod:peluche_mario")))
						.isDone()
				: false) {
			TouteLesPeluches = TouteLesPeluches + 1;
		}
		if (entity instanceof ServerPlayer _plr && _plr.level instanceof ServerLevel
				? _plr.getAdvancements()
						.getOrStartProgress(
								_plr.server.getAdvancements().getAdvancement(new ResourceLocation("peluche_bouboule_mod:peluche_docteur")))
						.isDone()
				: false) {
			TouteLesPeluches = TouteLesPeluches + 1;
		}
		if (entity instanceof ServerPlayer _plr && _plr.level instanceof ServerLevel
				? _plr.getAdvancements()
						.getOrStartProgress(
								_plr.server.getAdvancements().getAdvancement(new ResourceLocation("peluche_bouboule_mod:peluche_haut_de_forme")))
						.isDone()
				: false) {
			TouteLesPeluches = TouteLesPeluches + 1;
		}
		if (entity instanceof ServerPlayer _plr && _plr.level instanceof ServerLevel
				? _plr.getAdvancements()
						.getOrStartProgress(
								_plr.server.getAdvancements().getAdvancement(new ResourceLocation("peluche_bouboule_mod:peluche_chapeau_de_paille")))
						.isDone()
				: false) {
			TouteLesPeluches = TouteLesPeluches + 1;
		}
		if (entity instanceof ServerPlayer _plr && _plr.level instanceof ServerLevel
				? _plr.getAdvancements()
						.getOrStartProgress(
								_plr.server.getAdvancements().getAdvancement(new ResourceLocation("peluche_bouboule_mod:peluche_lunettes")))
						.isDone()
				: false) {
			TouteLesPeluches = TouteLesPeluches + 1;
		}
		if (entity instanceof ServerPlayer _plr && _plr.level instanceof ServerLevel
				? _plr.getAdvancements()
						.getOrStartProgress(
								_plr.server.getAdvancements().getAdvancement(new ResourceLocation("peluche_bouboule_mod:peluche_bonnet_de_noel")))
						.isDone()
				: false) {
			TouteLesPeluches = TouteLesPeluches + 1;
		}
		if (entity instanceof ServerPlayer _plr && _plr.level instanceof ServerLevel
				? _plr.getAdvancements()
						.getOrStartProgress(
								_plr.server.getAdvancements().getAdvancement(new ResourceLocation("peluche_bouboule_mod:demarrer_une_collection")))
						.isDone()
				: false) {
			TouteLesPeluches = TouteLesPeluches + 1;
		}
		if (TouteLesPeluches == 9) {
			if (entity instanceof ServerPlayer _player) {
				Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("peluche_bouboule_mod:collection_terminee"));
				AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
				if (!_ap.isDone()) {
					Iterator _iterator = _ap.getRemainingCriteria().iterator();
					while (_iterator.hasNext())
						_player.getAdvancements().award(_adv, (String) _iterator.next());
				}
			}
		}
	}
}
