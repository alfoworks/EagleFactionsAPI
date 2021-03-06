package io.github.aquerr.eaglefactions.api.config;

import java.util.Set;

public interface ProtectionConfig
{
	void reload();

	Set<String> getClaimableWorldNames();

	Set<String> getNotClaimableWorldNames();

	Set<String> getSafeZoneWorldNames();

	Set<String> getWarZoneWorldNames();

	Set<String> getWhiteListedItems();

	Set<String> getWhiteListedPlaceDestroyBlocks();

	Set<String> getWhiteListedInteractBlocks();

	Set<String> getDetectedWorldNames();

	void addWorld(String worldName);

	//Mob spawning methods
	boolean canSpawnMobsInSafeZone();

	boolean canSpawnMobsInWarZone();

	boolean canSpawnHostileMobsInWarZone();

	boolean canSpawnMobsInFactionsTerritory();

	boolean canSpawnHostileMobsInFactionsTerritory();

	boolean shouldProtectWildernessFromPlayers();

	boolean shouldProtectClaimFromMobGrief();

	boolean shouldProtectWarZoneFromMobGrief();

	boolean shouldAllowExplosionsByOtherPlayersInClaims();

	boolean shouldProtectWarzoneFromPlayers();
}
