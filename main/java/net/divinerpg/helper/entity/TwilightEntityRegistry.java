package net.divinerpg.helper.entity;

import net.divinerpg.entity.twilight.EntityAngryBunny;
import net.divinerpg.entity.twilight.EntityApalachiaArcher;
import net.divinerpg.entity.twilight.EntityApalachiaCadillion;
import net.divinerpg.entity.twilight.EntityApalachiaGolem;
import net.divinerpg.entity.twilight.EntityApalachiaTomo;
import net.divinerpg.entity.twilight.EntityApalachiaWarrior;
import net.divinerpg.entity.twilight.EntityBaslisk;
import net.divinerpg.entity.twilight.EntityBunny;
import net.divinerpg.entity.twilight.EntityCadillion;
import net.divinerpg.entity.twilight.EntityCori;
import net.divinerpg.entity.twilight.EntityCori2;
import net.divinerpg.entity.twilight.EntityDensos;
import net.divinerpg.entity.twilight.EntityEdenTomo;
import net.divinerpg.entity.twilight.EntityKarot;
import net.divinerpg.entity.twilight.EntityMadivel;
import net.divinerpg.entity.twilight.EntityMoonWolf;
import net.divinerpg.entity.twilight.EntityMortumCadillion;
import net.divinerpg.entity.twilight.EntityMortumDemon;
import net.divinerpg.entity.twilight.EntityNesro;
import net.divinerpg.entity.twilight.EntityReyvor;
import net.divinerpg.entity.twilight.EntitySamek;
import net.divinerpg.entity.twilight.EntitySkythernArcher;
import net.divinerpg.entity.twilight.EntitySkythernFiend;
import net.divinerpg.entity.twilight.EntitySkythernGolem;
import net.divinerpg.entity.twilight.EntitySoulFiend;
import net.divinerpg.entity.twilight.EntitySoulStealer;
import net.divinerpg.entity.twilight.EntityTwilightDemon;
import net.divinerpg.entity.twilight.EntityVamacheron;
import net.divinerpg.entity.twilight.EntityVerek;
import net.divinerpg.entity.twilight.EntityWildWoodGolem;
import net.divinerpg.entity.twilight.EntityWildWoodTomo;
import net.divinerpg.entity.twilight.projectile.EntityApalachiaArrow;
import net.divinerpg.entity.twilight.projectile.EntityEdenArrow;
import net.divinerpg.entity.twilight.projectile.EntityHaliteArrow;
import net.divinerpg.entity.twilight.projectile.EntityMortumArrow;
import net.divinerpg.entity.twilight.projectile.EntityPhaserApalachia;
import net.divinerpg.entity.twilight.projectile.EntityPhaserEden;
import net.divinerpg.entity.twilight.projectile.EntityPhaserHalite;
import net.divinerpg.entity.twilight.projectile.EntityPhaserMortum;
import net.divinerpg.entity.twilight.projectile.EntityPhaserSkythern;
import net.divinerpg.entity.twilight.projectile.EntityPhaserWildWood;
import net.divinerpg.entity.twilight.projectile.EntitySkythernArrow;
import net.divinerpg.entity.twilight.projectile.EntitySlicerApalachia;
import net.divinerpg.entity.twilight.projectile.EntitySlicerEden;
import net.divinerpg.entity.twilight.projectile.EntitySlicerHalite;
import net.divinerpg.entity.twilight.projectile.EntitySlicerMortum;
import net.divinerpg.entity.twilight.projectile.EntitySlicerSkythern;
import net.divinerpg.entity.twilight.projectile.EntitySlicerWildWoods;
import net.divinerpg.entity.twilight.projectile.EntityWildArrow;
import net.divinerpg.helper.DivineAPI;

public class TwilightEntityRegistry {

	public static void init(){
	    DivineAPI.registerProjectile(EntitySlicerEden.class, "edenSlicer");
	    DivineAPI.registerProjectile(EntitySlicerWildWoods.class, "wildSlicer");
        DivineAPI.registerProjectile(EntitySlicerApalachia.class, "apalachiaSlicer");
        DivineAPI.registerProjectile(EntitySlicerSkythern.class, "skythernSlicer");
        DivineAPI.registerProjectile(EntitySlicerMortum.class, "mortumSlicer");
        DivineAPI.registerProjectile(EntitySlicerHalite.class, "haliteSlicer");
        DivineAPI.registerProjectile(EntityPhaserEden.class, "edenPhaser");
        DivineAPI.registerProjectile(EntityPhaserWildWood.class, "wildPhaser");
        DivineAPI.registerProjectile(EntityPhaserApalachia.class, "apalachiaPhaser");
        DivineAPI.registerProjectile(EntityPhaserSkythern.class, "skythernPhaser");
        DivineAPI.registerProjectile(EntityPhaserMortum.class, "mortumPhaser");
        DivineAPI.registerProjectile(EntityPhaserHalite.class, "halitePhaser");
        
        DivineAPI.registerDivineRPGMob(EntityCadillion.class, "Cadillion");
        DivineAPI.registerDivineRPGMob(EntityEdenTomo.class, "Eden Tomo");
        DivineAPI.registerDivineRPGMob(EntityBunny.class, "Bunny");
        DivineAPI.registerDivineRPGMob(EntityAngryBunny.class, "Angry Bunny");
        DivineAPI.registerDivineRPGMob(EntityCori.class, "Eden Cori");
        DivineAPI.registerDivineRPGMob(EntityMadivel.class, "Madivel");
        DivineAPI.registerDivineRPGMob(EntityNesro.class, "Nesro");
        DivineAPI.registerDivineRPGMob(EntityWildWoodGolem.class, "WildWood Golem");
        DivineAPI.registerDivineRPGMob(EntityWildWoodTomo.class, "WildWood Tomo");
        DivineAPI.registerDivineRPGMob(EntityVerek.class, "Verek");
        DivineAPI.registerDivineRPGMob(EntityMoonWolf.class, "Moon Wolf");
        DivineAPI.registerDivineRPGMob(EntityApalachiaCadillion.class, "Apalachia Cadillion");
        DivineAPI.registerDivineRPGMob(EntityApalachiaTomo.class, "Apalachia Tomo");
        DivineAPI.registerDivineRPGMob(EntityApalachiaGolem.class, "Apalachia Golem");
        DivineAPI.registerDivineRPGMob(EntityApalachiaWarrior.class, "Enchant Warrior");
        DivineAPI.registerDivineRPGMob(EntitySkythernArcher.class, "Skythern Archer");
        DivineAPI.registerDivineRPGMob(EntityApalachiaArcher.class, "Twilight Archer");
        DivineAPI.registerDivineRPGMob(EntitySamek.class, "Samek");
        DivineAPI.registerDivineRPGMob(EntitySkythernGolem.class, "Skythern Golem");
        DivineAPI.registerDivineRPGMob(EntityCori2.class, "Skythern Cori");
        DivineAPI.registerDivineRPGMob(EntitySkythernFiend.class, "Skythern Fiend");
        DivineAPI.registerDivineRPGMob(EntityMortumCadillion.class, "Mortum Cadillion");
        DivineAPI.registerDivineRPGMob(EntityMortumDemon.class, "Mortum Demon");
        DivineAPI.registerDivineRPGMob(EntityBaslisk.class, "Baslisk");
        DivineAPI.registerDivineRPGMob(EntitySoulStealer.class, "Soul Stealer");
        DivineAPI.registerDivineRPGMob(EntityDensos.class, "Densos");
        DivineAPI.registerDivineRPGMob(EntityReyvor.class, "Reyvor");
        DivineAPI.registerDivineRPGMob(EntityTwilightDemon.class, "Twilight Demon");
        DivineAPI.registerDivineRPGMob(EntitySoulFiend.class, "Soul Fiend");
        DivineAPI.registerDivineRPGMob(EntityVamacheron.class, "Vamacheron");
        DivineAPI.registerDivineRPGMob(EntityKarot.class, "Karot");
        
        DivineAPI.registerProjectile(EntityEdenArrow.class, "Eden Arrow");
        DivineAPI.registerProjectile(EntityWildArrow.class, "Wild Arrow");
        DivineAPI.registerProjectile(EntityApalachiaArrow.class, "Apalachia Arrow");
        DivineAPI.registerProjectile(EntitySkythernArrow.class, "Skythern Arrow");
        DivineAPI.registerProjectile(EntityMortumArrow.class, "Mortum Arrow");
        DivineAPI.registerProjectile(EntityHaliteArrow.class, "Halite Arrow");
	}
}