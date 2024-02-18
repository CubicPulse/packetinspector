package com.cubicpulse.packetinspector.generated;

import net.minecraft.network.packet.s2c.play.TitleS2CPacket;
import net.minecraft.network.packet.s2c.play.SignEditorOpenS2CPacket;
import net.minecraft.network.packet.s2c.common.SynchronizeTagsS2CPacket;
import net.minecraft.network.packet.s2c.play.OpenScreenS2CPacket;
import net.minecraft.network.packet.s2c.common.ResourcePackRemoveS2CPacket;
import net.minecraft.network.packet.s2c.play.SynchronizeRecipesS2CPacket;
import net.minecraft.network.packet.s2c.play.TitleFadeS2CPacket;
import net.minecraft.network.packet.s2c.play.WorldTimeUpdateS2CPacket;
import net.minecraft.network.packet.s2c.play.RemoveEntityStatusEffectS2CPacket;
import net.minecraft.network.packet.s2c.play.CommandSuggestionsS2CPacket;
import net.minecraft.network.packet.s2c.play.CommandTreeS2CPacket;
import net.minecraft.network.packet.s2c.play.CloseScreenS2CPacket;
import net.minecraft.network.packet.s2c.play.WorldBorderInitializeS2CPacket;
import net.minecraft.network.packet.s2c.play.OpenWrittenBookS2CPacket;
import net.minecraft.network.packet.s2c.play.VehicleMoveS2CPacket;
import net.minecraft.network.packet.s2c.play.EntityStatusEffectS2CPacket;
import net.minecraft.network.packet.s2c.common.CommonPingS2CPacket;
import net.minecraft.network.packet.s2c.play.EntityAttributesS2CPacket;
import net.minecraft.network.packet.s2c.play.UnloadChunkS2CPacket;
import net.minecraft.network.packet.s2c.query.PingResultS2CPacket;
import net.minecraft.network.packet.s2c.play.GameStateChangeS2CPacket;
import net.minecraft.network.packet.s2c.play.DamageTiltS2CPacket;
import net.minecraft.network.packet.s2c.common.KeepAliveS2CPacket;
import net.minecraft.network.packet.s2c.play.EntityStatusS2CPacket;
import net.minecraft.network.packet.s2c.play.EntitySetHeadYawS2CPacket;
import net.minecraft.network.packet.s2c.play.WorldBorderWarningTimeChangedS2CPacket;
import net.minecraft.network.packet.s2c.play.ChunkDataS2CPacket;
import net.minecraft.network.packet.s2c.play.AdvancementUpdateS2CPacket;
import net.minecraft.network.packet.s2c.play.PlayerAbilitiesS2CPacket;
import net.minecraft.network.packet.s2c.play.StartChunkSendS2CPacket;
import net.minecraft.network.packet.s2c.play.TeamS2CPacket;
import net.minecraft.network.packet.s2c.play.SimulationDistanceS2CPacket;
import net.minecraft.network.packet.s2c.play.PlaySoundS2CPacket;
import net.minecraft.network.packet.s2c.play.UpdateTickRateS2CPacket;
import net.minecraft.network.packet.s2c.play.InventoryS2CPacket;
import net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket;
import net.minecraft.network.packet.s2c.play.StopSoundS2CPacket;
import net.minecraft.network.packet.s2c.play.ScreenHandlerSlotUpdateS2CPacket;
import net.minecraft.network.packet.s2c.play.EntitiesDestroyS2CPacket;
import net.minecraft.network.packet.s2c.common.ResourcePackSendS2CPacket;
import net.minecraft.network.packet.s2c.play.ClearTitleS2CPacket;
import net.minecraft.network.packet.s2c.play.WorldBorderInterpolateSizeS2CPacket;
import net.minecraft.network.packet.s2c.play.ScoreboardObjectiveUpdateS2CPacket;
import net.minecraft.network.packet.s2c.play.SelectAdvancementTabS2CPacket;
import net.minecraft.network.packet.s2c.play.DifficultyS2CPacket;
import net.minecraft.network.packet.s2c.play.EntitySpawnS2CPacket;
import net.minecraft.network.packet.s2c.play.EntityAnimationS2CPacket;
import net.minecraft.network.packet.s2c.play.BlockEntityUpdateS2CPacket;
import net.minecraft.network.packet.s2c.play.SetCameraEntityS2CPacket;
import net.minecraft.network.packet.s2c.play.ExperienceBarUpdateS2CPacket;
import net.minecraft.network.packet.s2c.play.EntityVelocityUpdateS2CPacket;
import net.minecraft.network.packet.s2c.play.PlayerActionResponseS2CPacket;
import net.minecraft.network.packet.s2c.play.PlayerSpawnPositionS2CPacket;
import net.minecraft.network.packet.s2c.play.ChunkRenderDistanceCenterS2CPacket;
import net.minecraft.network.packet.s2c.play.EntityTrackerUpdateS2CPacket;
import net.minecraft.network.packet.s2c.play.EntityDamageS2CPacket;
import net.minecraft.network.packet.s2c.play.HealthUpdateS2CPacket;
import net.minecraft.network.packet.s2c.play.NbtQueryResponseS2CPacket;
import net.minecraft.network.packet.s2c.play.DeathMessageS2CPacket;
import net.minecraft.network.packet.s2c.play.BlockEventS2CPacket;
import net.minecraft.network.packet.s2c.play.OverlayMessageS2CPacket;
import net.minecraft.network.packet.s2c.play.WorldBorderCenterChangedS2CPacket;
import net.minecraft.network.packet.s2c.play.BlockUpdateS2CPacket;
import net.minecraft.network.packet.s2c.common.CustomPayloadS2CPacket;
import net.minecraft.network.packet.s2c.play.ItemPickupAnimationS2CPacket;
import net.minecraft.network.packet.s2c.play.EnterCombatS2CPacket;
import net.minecraft.network.packet.s2c.play.PlayerRemoveS2CPacket;
import net.minecraft.network.packet.s2c.play.RemoveMessageS2CPacket;
import net.minecraft.network.packet.s2c.play.ChatSuggestionsS2CPacket;
import net.minecraft.network.packet.s2c.play.PlayerListHeaderS2CPacket;
import net.minecraft.network.packet.s2c.play.EndCombatS2CPacket;
import net.minecraft.network.packet.s2c.play.PlayerListS2CPacket;
import net.minecraft.network.packet.s2c.play.ParticleS2CPacket;
import net.minecraft.network.packet.s2c.play.EntityPositionS2CPacket;
import net.minecraft.network.packet.s2c.common.DisconnectS2CPacket;
import net.minecraft.network.packet.s2c.play.ChatMessageS2CPacket;
import net.minecraft.network.packet.s2c.play.WorldEventS2CPacket;
import net.minecraft.network.packet.s2c.play.LightUpdateS2CPacket;
import net.minecraft.network.packet.s2c.play.MapUpdateS2CPacket;
import net.minecraft.network.packet.s2c.play.GameJoinS2CPacket;
import net.minecraft.network.packet.s2c.play.SetTradeOffersS2CPacket;
import net.minecraft.network.packet.s2c.play.EnterReconfigurationS2CPacket;
import net.minecraft.network.packet.s2c.play.TickStepS2CPacket;
import net.minecraft.network.packet.s2c.play.StatisticsS2CPacket;
import net.minecraft.network.packet.s2c.play.ChunkSentS2CPacket;
import net.minecraft.network.packet.s2c.play.ScoreboardScoreUpdateS2CPacket;
import net.minecraft.network.packet.s2c.play.ProfilelessChatMessageS2CPacket;
import net.minecraft.network.packet.s2c.play.CraftFailedResponseS2CPacket;
import net.minecraft.network.packet.s2c.play.ChunkDeltaUpdateS2CPacket;
import net.minecraft.network.packet.s2c.play.PlayerRespawnS2CPacket;
import net.minecraft.network.packet.s2c.play.ExplosionS2CPacket;
import net.minecraft.network.packet.s2c.play.LookAtS2CPacket;
import net.minecraft.network.packet.s2c.play.ScreenHandlerPropertyUpdateS2CPacket;
import net.minecraft.network.packet.s2c.play.UnlockRecipesS2CPacket;
import net.minecraft.network.packet.s2c.play.CooldownUpdateS2CPacket;
import net.minecraft.network.packet.s2c.play.GameMessageS2CPacket;
import net.minecraft.network.packet.s2c.play.PlaySoundFromEntityS2CPacket;
import net.minecraft.network.packet.s2c.play.SubtitleS2CPacket;
import net.minecraft.network.packet.s2c.play.ExperienceOrbSpawnS2CPacket;
import net.minecraft.network.packet.s2c.play.BlockBreakingProgressS2CPacket;
import net.minecraft.network.packet.s2c.play.EntityEquipmentUpdateS2CPacket;
import net.minecraft.network.packet.s2c.play.ChunkBiomeDataS2CPacket;
import net.minecraft.network.packet.s2c.play.EntityPassengersSetS2CPacket;
import net.minecraft.network.packet.s2c.play.BossBarS2CPacket;
import net.minecraft.network.packet.s2c.play.ServerMetadataS2CPacket;
import net.minecraft.network.packet.s2c.play.WorldBorderSizeChangedS2CPacket;
import net.minecraft.network.packet.s2c.play.WorldBorderWarningBlocksChangedS2CPacket;
import net.minecraft.network.packet.s2c.play.ChunkLoadDistanceS2CPacket;
import net.minecraft.network.packet.s2c.play.ScoreboardDisplayS2CPacket;
import net.minecraft.network.packet.s2c.play.EntityAttachS2CPacket;
import net.minecraft.network.packet.s2c.play.UpdateSelectedSlotS2CPacket;
import net.minecraft.network.packet.s2c.play.OpenHorseScreenS2CPacket;
import net.minecraft.network.packet.s2c.play.ScoreboardScoreResetS2CPacket;

import net.minecraft.network.packet.s2c.common.CustomPayloadS2CPacket;
import net.minecraft.network.packet.s2c.config.ReadyS2CPacket;
import net.minecraft.network.packet.s2c.common.ResourcePackRemoveS2CPacket;
import net.minecraft.network.packet.s2c.common.CommonPingS2CPacket;
import net.minecraft.network.packet.s2c.config.FeaturesS2CPacket;
import net.minecraft.network.packet.s2c.common.SynchronizeTagsS2CPacket;
import net.minecraft.network.packet.s2c.common.DisconnectS2CPacket;
import net.minecraft.network.packet.s2c.common.KeepAliveS2CPacket;
import net.minecraft.network.packet.s2c.common.ResourcePackSendS2CPacket;
import net.minecraft.network.packet.s2c.config.DynamicRegistriesS2CPacket;


import net.minecraft.network.packet.s2c.query.QueryResponseS2CPacket;
import net.minecraft.network.packet.s2c.query.PingResultS2CPacket;

import net.minecraft.network.packet.s2c.login.LoginDisconnectS2CPacket;
import net.minecraft.network.packet.s2c.login.LoginSuccessS2CPacket;
import net.minecraft.network.packet.s2c.login.LoginQueryRequestS2CPacket;
import net.minecraft.network.packet.s2c.login.LoginHelloS2CPacket;
import net.minecraft.network.packet.s2c.login.LoginCompressionS2CPacket;

import net.minecraft.network.NetworkSide;
import net.minecraft.network.NetworkState;
import com.cubicpulse.packetinspector.PacketManager;
import com.cubicpulse.packetinspector.PacketInspectorMod;
import java.util.Map;
import java.util.HashMap;
import java.lang.reflect.Field;

public class PacketManagerImpl extends PacketManager {
    private static final Map<Class<?>, PacketManager.PacketData> types = new HashMap<>();

    static {
        types.put(TitleS2CPacket.class,new PacketManager.PacketData<TitleS2CPacket>("Title",NetworkState.PLAY,NetworkSide.CLIENTBOUND,99,(o) -> "Title{" + "\n    title=" + getFromField(o, "field_29166", "title") + "\n}"));
        types.put(SignEditorOpenS2CPacket.class,new PacketManager.PacketData<SignEditorOpenS2CPacket>("SignEditorOpen",NetworkState.PLAY,NetworkSide.CLIENTBOUND,50,(o) -> "SignEditorOpen{" + "\n    pos=" + getFromField(o, "field_12325", "pos") + "\n    front=" + getFromField(o, "field_43387", "front") + "\n}"));
        types.put(SynchronizeTagsS2CPacket.class,new PacketManager.PacketData<SynchronizeTagsS2CPacket>("SynchronizeTags",NetworkState.PLAY,NetworkSide.CLIENTBOUND,116,(o) -> "SynchronizeTags{" + "\n    groups=" + getFromField(o, "field_12757", "groups") + "\n}"));
        types.put(OpenScreenS2CPacket.class,new PacketManager.PacketData<OpenScreenS2CPacket>("OpenScreen",NetworkState.PLAY,NetworkSide.CLIENTBOUND,49,(o) -> "OpenScreen{" + "\n    syncId=" + getFromField(o, "field_17436", "syncId") + "\n    screenHandlerId=" + getFromField(o, "field_17437", "screenHandlerId") + "\n    name=" + getFromField(o, "field_17438", "name") + "\n}"));
        types.put(ResourcePackRemoveS2CPacket.class,new PacketManager.PacketData<ResourcePackRemoveS2CPacket>("ResourcePackRemove",NetworkState.PLAY,NetworkSide.CLIENTBOUND,67,(o) -> "ResourcePackRemove{" + "}"));
        types.put(SynchronizeRecipesS2CPacket.class,new PacketManager.PacketData<SynchronizeRecipesS2CPacket>("SynchronizeRecipes",NetworkState.PLAY,NetworkSide.CLIENTBOUND,115,(o) -> "SynchronizeRecipes{" + "\n    recipes=" + getFromField(o, "field_12751", "recipes") + "\n}"));
        types.put(TitleFadeS2CPacket.class,new PacketManager.PacketData<TitleFadeS2CPacket>("TitleFade",NetworkState.PLAY,NetworkSide.CLIENTBOUND,100,(o) -> "TitleFade{" + "\n    fadeInTicks=" + getFromField(o, "field_29167", "fadeInTicks") + "\n    stayTicks=" + getFromField(o, "field_29168", "stayTicks") + "\n    fadeOutTicks=" + getFromField(o, "field_29169", "fadeOutTicks") + "\n}"));
        types.put(WorldTimeUpdateS2CPacket.class,new PacketManager.PacketData<WorldTimeUpdateS2CPacket>("WorldTimeUpdate",NetworkState.PLAY,NetworkSide.CLIENTBOUND,98,(o) -> "WorldTimeUpdate{" + "\n    timeOfDay=" + getFromField(o, "field_12620", "timeOfDay") + "\n    time=" + getFromField(o, "field_12621", "time") + "\n}"));
        types.put(RemoveEntityStatusEffectS2CPacket.class,new PacketManager.PacketData<RemoveEntityStatusEffectS2CPacket>("RemoveEntityStatusEffect",NetworkState.PLAY,NetworkSide.CLIENTBOUND,65,(o) -> "RemoveEntityStatusEffect{" + "\n    entityId=" + getFromField(o, "field_12424", "entityId") + "\n    effectType=" + getFromField(o, "field_12425", "effectType") + "\n}"));
        types.put(CommandSuggestionsS2CPacket.class,new PacketManager.PacketData<CommandSuggestionsS2CPacket>("CommandSuggestions",NetworkState.PLAY,NetworkSide.CLIENTBOUND,16,(o) -> "CommandSuggestions{" + "\n    suggestions=" + getFromField(o, "field_12121", "suggestions") + "\n    completionId=" + getFromField(o, "field_12122", "completionId") + "\n}"));
        types.put(CommandTreeS2CPacket.class,new PacketManager.PacketData<CommandTreeS2CPacket>("CommandTree",NetworkState.PLAY,NetworkSide.CLIENTBOUND,17,(o) -> "CommandTree{" + "\n    rootSize=" + getFromField(o, "field_38038", "rootSize") + "\n    nodes=" + getFromField(o, "field_38039", "nodes") + "\n    nodes=" + getFromField(o, "field_38047", "nodes") + "\n}"));
        types.put(CloseScreenS2CPacket.class,new PacketManager.PacketData<CloseScreenS2CPacket>("CloseScreen",NetworkState.PLAY,NetworkSide.CLIENTBOUND,18,(o) -> "CloseScreen{" + "\n    syncId=" + getFromField(o, "field_12137", "syncId") + "\n}"));
        types.put(WorldBorderInitializeS2CPacket.class,new PacketManager.PacketData<WorldBorderInitializeS2CPacket>("WorldBorderInitialize",NetworkState.PLAY,NetworkSide.CLIENTBOUND,35,(o) -> "WorldBorderInitialize{" + "\n    centerX=" + getFromField(o, "field_29123", "centerX") + "\n    centerZ=" + getFromField(o, "field_29124", "centerZ") + "\n    size=" + getFromField(o, "field_29125", "size") + "\n    sizeLerpTarget=" + getFromField(o, "field_29126", "sizeLerpTarget") + "\n    sizeLerpTime=" + getFromField(o, "field_29127", "sizeLerpTime") + "\n    maxRadius=" + getFromField(o, "field_29128", "maxRadius") + "\n    warningBlocks=" + getFromField(o, "field_29129", "warningBlocks") + "\n    warningTime=" + getFromField(o, "field_29130", "warningTime") + "\n}"));
        types.put(OpenWrittenBookS2CPacket.class,new PacketManager.PacketData<OpenWrittenBookS2CPacket>("OpenWrittenBook",NetworkState.PLAY,NetworkSide.CLIENTBOUND,48,(o) -> "OpenWrittenBook{" + "\n    hand=" + getFromField(o, "field_17199", "hand") + "\n}"));
        types.put(VehicleMoveS2CPacket.class,new PacketManager.PacketData<VehicleMoveS2CPacket>("VehicleMove",NetworkState.PLAY,NetworkSide.CLIENTBOUND,47,(o) -> "VehicleMove{" + "\n    z=" + getFromField(o, "field_12320", "z") + "\n    pitch=" + getFromField(o, "field_12321", "pitch") + "\n    y=" + getFromField(o, "field_12322", "y") + "\n    yaw=" + getFromField(o, "field_12323", "yaw") + "\n    x=" + getFromField(o, "field_12324", "x") + "\n}"));
        types.put(EntityStatusEffectS2CPacket.class,new PacketManager.PacketData<EntityStatusEffectS2CPacket>("EntityStatusEffect",NetworkState.PLAY,NetworkSide.CLIENTBOUND,114,(o) -> "EntityStatusEffect{" + "\n    effectId=" + getFromField(o, "field_12725", "effectId") + "\n    duration=" + getFromField(o, "field_12726", "duration") + "\n    entityId=" + getFromField(o, "field_12727", "entityId") + "\n    flags=" + getFromField(o, "field_12728", "flags") + "\n    amplifier=" + getFromField(o, "field_12729", "amplifier") + "\n    factorCalculationData=" + getFromField(o, "field_38364", "factorCalculationData") + "\n}"));
        types.put(CommonPingS2CPacket.class,new PacketManager.PacketData<CommonPingS2CPacket>("CommonPing",NetworkState.PLAY,NetworkSide.CLIENTBOUND,51,(o) -> "CommonPing{" + "\n    parameter=" + getFromField(o, "field_33751", "parameter") + "\n}"));
        types.put(EntityAttributesS2CPacket.class,new PacketManager.PacketData<EntityAttributesS2CPacket>("EntityAttributes",NetworkState.PLAY,NetworkSide.CLIENTBOUND,113,(o) -> "EntityAttributes{" + "\n    entityId=" + getFromField(o, "field_12719", "entityId") + "\n    entries=" + getFromField(o, "field_12720", "entries") + "\n}"));
        types.put(UnloadChunkS2CPacket.class,new PacketManager.PacketData<UnloadChunkS2CPacket>("UnloadChunk",NetworkState.PLAY,NetworkSide.CLIENTBOUND,31,(o) -> "UnloadChunk{" + "}"));
        types.put(PingResultS2CPacket.class,new PacketManager.PacketData<PingResultS2CPacket>("PingResult",NetworkState.PLAY,NetworkSide.CLIENTBOUND,52,(o) -> "PingResult{" + "\n    startTime=" + getFromField(o, "field_13280", "startTime") + "\n}"));
        types.put(GameStateChangeS2CPacket.class,new PacketManager.PacketData<GameStateChangeS2CPacket>("GameStateChange",NetworkState.PLAY,NetworkSide.CLIENTBOUND,32,(o) -> "GameStateChange{" + "\n    value=" + getFromField(o, "field_12198", "value") + "\n    reason=" + getFromField(o, "field_12199", "reason") + "\n}"));
        types.put(DamageTiltS2CPacket.class,new PacketManager.PacketData<DamageTiltS2CPacket>("DamageTilt",NetworkState.PLAY,NetworkSide.CLIENTBOUND,34,(o) -> "DamageTilt{" + "}"));
        types.put(KeepAliveS2CPacket.class,new PacketManager.PacketData<KeepAliveS2CPacket>("KeepAlive",NetworkState.PLAY,NetworkSide.CLIENTBOUND,36,(o) -> "KeepAlive{" + "\n    id=" + getFromField(o, "field_12211", "id") + "\n}"));
        types.put(EntityStatusS2CPacket.class,new PacketManager.PacketData<EntityStatusS2CPacket>("EntityStatus",NetworkState.PLAY,NetworkSide.CLIENTBOUND,29,(o) -> "EntityStatus{" + "\n    status=" + getFromField(o, "field_12174", "status") + "\n    id=" + getFromField(o, "field_12175", "id") + "\n}"));
        types.put(EntitySetHeadYawS2CPacket.class,new PacketManager.PacketData<EntitySetHeadYawS2CPacket>("EntitySetHeadYaw",NetworkState.PLAY,NetworkSide.CLIENTBOUND,70,(o) -> "EntitySetHeadYaw{" + "\n    headYaw=" + getFromField(o, "field_12436", "headYaw") + "\n    entity=" + getFromField(o, "field_12437", "entity") + "\n}"));
        types.put(WorldBorderWarningTimeChangedS2CPacket.class,new PacketManager.PacketData<WorldBorderWarningTimeChangedS2CPacket>("WorldBorderWarningTimeChanged",NetworkState.PLAY,NetworkSide.CLIENTBOUND,78,(o) -> "WorldBorderWarningTimeChanged{" + "\n    warningTime=" + getFromField(o, "field_29149", "warningTime") + "\n}"));
        types.put(ChunkDataS2CPacket.class,new PacketManager.PacketData<ChunkDataS2CPacket>("ChunkData",NetworkState.PLAY,NetworkSide.CLIENTBOUND,37,(o) -> "ChunkData{" + "\n    chunkZ=" + getFromField(o, "field_12235", "chunkZ") + "\n    chunkX=" + getFromField(o, "field_12236", "chunkX") + "\n    chunkData=" + getFromField(o, "field_34870", "chunkData") + "\n    lightData=" + getFromField(o, "field_34871", "lightData") + "\n}"));
        types.put(AdvancementUpdateS2CPacket.class,new PacketManager.PacketData<AdvancementUpdateS2CPacket>("AdvancementUpdate",NetworkState.PLAY,NetworkSide.CLIENTBOUND,112,(o) -> "AdvancementUpdate{" + "\n    toRemove=" + getFromField(o, "field_12715", "toRemove") + "\n    toSetProgress=" + getFromField(o, "field_12716", "toSetProgress") + "\n    toEarn=" + getFromField(o, "field_12717", "toEarn") + "\n    clearCurrent=" + getFromField(o, "field_12718", "clearCurrent") + "\n}"));
        types.put(PlayerAbilitiesS2CPacket.class,new PacketManager.PacketData<PlayerAbilitiesS2CPacket>("PlayerAbilities",NetworkState.PLAY,NetworkSide.CLIENTBOUND,54,(o) -> "PlayerAbilities{" + "\n    walkSpeed=" + getFromField(o, "field_12334", "walkSpeed") + "\n    flySpeed=" + getFromField(o, "field_12335", "flySpeed") + "\n    creativeMode=" + getFromField(o, "field_12336", "creativeMode") + "\n    allowFlying=" + getFromField(o, "field_12337", "allowFlying") + "\n    flying=" + getFromField(o, "field_12338", "flying") + "\n    invulnerable=" + getFromField(o, "field_12339", "invulnerable") + "\n}"));
        types.put(StartChunkSendS2CPacket.class,new PacketManager.PacketData<StartChunkSendS2CPacket>("StartChunkSend",NetworkState.PLAY,NetworkSide.CLIENTBOUND,13,(o) -> "StartChunkSend{" + "}"));
        types.put(TeamS2CPacket.class,new PacketManager.PacketData<TeamS2CPacket>("Team",NetworkState.PLAY,NetworkSide.CLIENTBOUND,94,(o) -> "Team{" + "\n    packetType=" + getFromField(o, "field_29151", "packetType") + "\n    teamName=" + getFromField(o, "field_29152", "teamName") + "\n    playerNames=" + getFromField(o, "field_29153", "playerNames") + "\n    team=" + getFromField(o, "field_29154", "team") + "\n}"));
        types.put(SimulationDistanceS2CPacket.class,new PacketManager.PacketData<SimulationDistanceS2CPacket>("SimulationDistance",NetworkState.PLAY,NetworkSide.CLIENTBOUND,96,(o) -> "SimulationDistance{" + "}"));
        types.put(PlaySoundS2CPacket.class,new PacketManager.PacketData<PlaySoundS2CPacket>("PlaySound",NetworkState.PLAY,NetworkSide.CLIENTBOUND,102,(o) -> "PlaySound{" + "\n    volume=" + getFromField(o, "field_12656", "volume") + "\n    fixedZ=" + getFromField(o, "field_12657", "fixedZ") + "\n    fixedY=" + getFromField(o, "field_12658", "fixedY") + "\n    fixedX=" + getFromField(o, "field_12659", "fixedX") + "\n    category=" + getFromField(o, "field_12660", "category") + "\n    sound=" + getFromField(o, "field_12661", "sound") + "\n    pitch=" + getFromField(o, "field_12662", "pitch") + "\n    seed=" + getFromField(o, "field_38820", "seed") + "\n}"));
        types.put(UpdateTickRateS2CPacket.class,new PacketManager.PacketData<UpdateTickRateS2CPacket>("UpdateTickRate",NetworkState.PLAY,NetworkSide.CLIENTBOUND,110,(o) -> "UpdateTickRate{" + "}"));
        types.put(InventoryS2CPacket.class,new PacketManager.PacketData<InventoryS2CPacket>("Inventory",NetworkState.PLAY,NetworkSide.CLIENTBOUND,19,(o) -> "Inventory{" + "\n    syncId=" + getFromField(o, "field_12146", "syncId") + "\n    contents=" + getFromField(o, "field_12147", "contents") + "\n    revision=" + getFromField(o, "field_34034", "revision") + "\n    cursorStack=" + getFromField(o, "field_34035", "cursorStack") + "\n}"));
        types.put(PlayerPositionLookS2CPacket.class,new PacketManager.PacketData<PlayerPositionLookS2CPacket>("PlayerPositionLook",NetworkState.PLAY,NetworkSide.CLIENTBOUND,62,(o) -> "PlayerPositionLook{" + "\n    z=" + getFromField(o, "field_12390", "z") + "\n    pitch=" + getFromField(o, "field_12391", "pitch") + "\n    y=" + getFromField(o, "field_12392", "y") + "\n    yaw=" + getFromField(o, "field_12393", "yaw") + "\n    teleportId=" + getFromField(o, "field_12394", "teleportId") + "\n    x=" + getFromField(o, "field_12395", "x") + "\n    flags=" + getFromField(o, "field_12396", "flags") + "\n}"));
        types.put(StopSoundS2CPacket.class,new PacketManager.PacketData<StopSoundS2CPacket>("StopSound",NetworkState.PLAY,NetworkSide.CLIENTBOUND,104,(o) -> "StopSound{" + "\n    soundId=" + getFromField(o, "field_12676", "soundId") + "\n    category=" + getFromField(o, "field_12677", "category") + "\n}"));
        types.put(ScreenHandlerSlotUpdateS2CPacket.class,new PacketManager.PacketData<ScreenHandlerSlotUpdateS2CPacket>("ScreenHandlerSlotUpdate",NetworkState.PLAY,NetworkSide.CLIENTBOUND,21,(o) -> "ScreenHandlerSlotUpdate{" + "\n    slot=" + getFromField(o, "field_12151", "slot") + "\n    syncId=" + getFromField(o, "field_12152", "syncId") + "\n    stack=" + getFromField(o, "field_12153", "stack") + "\n    revision=" + getFromField(o, "field_34036", "revision") + "\n}"));
        types.put(EntitiesDestroyS2CPacket.class,new PacketManager.PacketData<EntitiesDestroyS2CPacket>("EntitiesDestroy",NetworkState.PLAY,NetworkSide.CLIENTBOUND,64,(o) -> "EntitiesDestroy{" + "\n    entityIds=" + getFromField(o, "field_33690", "entityIds") + "\n}"));
        types.put(ResourcePackSendS2CPacket.class,new PacketManager.PacketData<ResourcePackSendS2CPacket>("ResourcePackSend",NetworkState.PLAY,NetworkSide.CLIENTBOUND,68,(o) -> "ResourcePackSend{" + "}"));
        types.put(ClearTitleS2CPacket.class,new PacketManager.PacketData<ClearTitleS2CPacket>("ClearTitle",NetworkState.PLAY,NetworkSide.CLIENTBOUND,15,(o) -> "ClearTitle{" + "\n    reset=" + getFromField(o, "field_29122", "reset") + "\n}"));
        types.put(WorldBorderInterpolateSizeS2CPacket.class,new PacketManager.PacketData<WorldBorderInterpolateSizeS2CPacket>("WorldBorderInterpolateSize",NetworkState.PLAY,NetworkSide.CLIENTBOUND,76,(o) -> "WorldBorderInterpolateSize{" + "\n    size=" + getFromField(o, "field_29145", "size") + "\n    sizeLerpTarget=" + getFromField(o, "field_29146", "sizeLerpTarget") + "\n    sizeLerpTime=" + getFromField(o, "field_29147", "sizeLerpTime") + "\n}"));
        types.put(ScoreboardObjectiveUpdateS2CPacket.class,new PacketManager.PacketData<ScoreboardObjectiveUpdateS2CPacket>("ScoreboardObjectiveUpdate",NetworkState.PLAY,NetworkSide.CLIENTBOUND,92,(o) -> "ScoreboardObjectiveUpdate{" + "\n    name=" + getFromField(o, "field_12589", "name") + "\n    mode=" + getFromField(o, "field_12590", "mode") + "\n    displayName=" + getFromField(o, "field_12591", "displayName") + "\n    type=" + getFromField(o, "field_12592", "type") + "\n    numberFormat=" + getFromField(o, "field_47519", "numberFormat") + "\n}"));
        types.put(SelectAdvancementTabS2CPacket.class,new PacketManager.PacketData<SelectAdvancementTabS2CPacket>("SelectAdvancementTab",NetworkState.PLAY,NetworkSide.CLIENTBOUND,72,(o) -> "SelectAdvancementTab{" + "\n    tabId=" + getFromField(o, "field_12440", "tabId") + "\n}"));
        types.put(DifficultyS2CPacket.class,new PacketManager.PacketData<DifficultyS2CPacket>("Difficulty",NetworkState.PLAY,NetworkSide.CLIENTBOUND,11,(o) -> "Difficulty{" + "\n    difficulty=" + getFromField(o, "field_12090", "difficulty") + "\n    difficultyLocked=" + getFromField(o, "field_12091", "difficultyLocked") + "\n}"));
        types.put(EntitySpawnS2CPacket.class,new PacketManager.PacketData<EntitySpawnS2CPacket>("EntitySpawn",NetworkState.PLAY,NetworkSide.CLIENTBOUND,1,(o) -> "EntitySpawn{" + "\n    y=" + getFromField(o, "field_11946", "y") + "\n    pitch=" + getFromField(o, "field_11947", "pitch") + "\n    x=" + getFromField(o, "field_11948", "x") + "\n    velocityZ=" + getFromField(o, "field_11949", "velocityZ") + "\n    velocityY=" + getFromField(o, "field_11950", "velocityY") + "\n    velocityX=" + getFromField(o, "field_11951", "velocityX") + "\n    uuid=" + getFromField(o, "field_11952", "uuid") + "\n    id=" + getFromField(o, "field_11953", "id") + "\n    entityData=" + getFromField(o, "field_11954", "entityData") + "\n    entityType=" + getFromField(o, "field_11955", "entityType") + "\n    z=" + getFromField(o, "field_11956", "z") + "\n    yaw=" + getFromField(o, "field_11957", "yaw") + "\n    headYaw=" + getFromField(o, "field_38817", "headYaw") + "\n}"));
        types.put(EntityAnimationS2CPacket.class,new PacketManager.PacketData<EntityAnimationS2CPacket>("EntityAnimation",NetworkState.PLAY,NetworkSide.CLIENTBOUND,3,(o) -> "EntityAnimation{" + "\n    animationId=" + getFromField(o, "field_12028", "animationId") + "\n    id=" + getFromField(o, "field_12029", "id") + "\n}"));
        types.put(BlockEntityUpdateS2CPacket.class,new PacketManager.PacketData<BlockEntityUpdateS2CPacket>("BlockEntityUpdate",NetworkState.PLAY,NetworkSide.CLIENTBOUND,7,(o) -> "BlockEntityUpdate{" + "\n    blockEntityType=" + getFromField(o, "field_12038", "blockEntityType") + "\n    nbt=" + getFromField(o, "field_12039", "nbt") + "\n    pos=" + getFromField(o, "field_12040", "pos") + "\n}"));
        types.put(SetCameraEntityS2CPacket.class,new PacketManager.PacketData<SetCameraEntityS2CPacket>("SetCameraEntity",NetworkState.PLAY,NetworkSide.CLIENTBOUND,80,(o) -> "SetCameraEntity{" + "\n    entityId=" + getFromField(o, "field_12462", "entityId") + "\n}"));
        types.put(ExperienceBarUpdateS2CPacket.class,new PacketManager.PacketData<ExperienceBarUpdateS2CPacket>("ExperienceBarUpdate",NetworkState.PLAY,NetworkSide.CLIENTBOUND,90,(o) -> "ExperienceBarUpdate{" + "\n    barProgress=" + getFromField(o, "field_12580", "barProgress") + "\n    experience=" + getFromField(o, "field_12581", "experience") + "\n    experienceLevel=" + getFromField(o, "field_12582", "experienceLevel") + "\n}"));
        types.put(EntityVelocityUpdateS2CPacket.class,new PacketManager.PacketData<EntityVelocityUpdateS2CPacket>("EntityVelocityUpdate",NetworkState.PLAY,NetworkSide.CLIENTBOUND,88,(o) -> "EntityVelocityUpdate{" + "\n    velocityZ=" + getFromField(o, "field_12561", "velocityZ") + "\n    velocityY=" + getFromField(o, "field_12562", "velocityY") + "\n    velocityX=" + getFromField(o, "field_12563", "velocityX") + "\n    id=" + getFromField(o, "field_12564", "id") + "\n}"));
        types.put(PlayerActionResponseS2CPacket.class,new PacketManager.PacketData<PlayerActionResponseS2CPacket>("PlayerActionResponse",NetworkState.PLAY,NetworkSide.CLIENTBOUND,5,(o) -> "PlayerActionResponse{" + "}"));
        types.put(PlayerSpawnPositionS2CPacket.class,new PacketManager.PacketData<PlayerSpawnPositionS2CPacket>("PlayerSpawnPosition",NetworkState.PLAY,NetworkSide.CLIENTBOUND,84,(o) -> "PlayerSpawnPosition{" + "\n    pos=" + getFromField(o, "field_12615", "pos") + "\n    angle=" + getFromField(o, "field_26381", "angle") + "\n}"));
        types.put(ChunkRenderDistanceCenterS2CPacket.class,new PacketManager.PacketData<ChunkRenderDistanceCenterS2CPacket>("ChunkRenderDistanceCenter",NetworkState.PLAY,NetworkSide.CLIENTBOUND,82,(o) -> "ChunkRenderDistanceCenter{" + "\n    chunkX=" + getFromField(o, "field_19206", "chunkX") + "\n    chunkZ=" + getFromField(o, "field_19207", "chunkZ") + "\n}"));
        types.put(EntityTrackerUpdateS2CPacket.class,new PacketManager.PacketData<EntityTrackerUpdateS2CPacket>("EntityTrackerUpdate",NetworkState.PLAY,NetworkSide.CLIENTBOUND,86,(o) -> "EntityTrackerUpdate{" + "\n    id=" + getFromField(o, "comp_1127", "id") + "\n    trackedValues=" + getFromField(o, "comp_1128", "trackedValues") + "\n}"));
        types.put(EntityDamageS2CPacket.class,new PacketManager.PacketData<EntityDamageS2CPacket>("EntityDamage",NetworkState.PLAY,NetworkSide.CLIENTBOUND,25,(o) -> "EntityDamage{" + "}"));
        types.put(HealthUpdateS2CPacket.class,new PacketManager.PacketData<HealthUpdateS2CPacket>("HealthUpdate",NetworkState.PLAY,NetworkSide.CLIENTBOUND,91,(o) -> "HealthUpdate{" + "\n    saturation=" + getFromField(o, "field_12583", "saturation") + "\n    health=" + getFromField(o, "field_12584", "health") + "\n    food=" + getFromField(o, "field_12585", "food") + "\n}"));
        types.put(NbtQueryResponseS2CPacket.class,new PacketManager.PacketData<NbtQueryResponseS2CPacket>("NbtQueryResponse",NetworkState.PLAY,NetworkSide.CLIENTBOUND,107,(o) -> "NbtQueryResponse{" + "\n    nbt=" + getFromField(o, "field_12690", "nbt") + "\n    transactionId=" + getFromField(o, "field_12691", "transactionId") + "\n}"));
        types.put(DeathMessageS2CPacket.class,new PacketManager.PacketData<DeathMessageS2CPacket>("DeathMessage",NetworkState.PLAY,NetworkSide.CLIENTBOUND,58,(o) -> "DeathMessage{" + "\n    entityId=" + getFromField(o, "field_29133", "entityId") + "\n    message=" + getFromField(o, "field_29135", "message") + "\n}"));
        types.put(BlockEventS2CPacket.class,new PacketManager.PacketData<BlockEventS2CPacket>("BlockEvent",NetworkState.PLAY,NetworkSide.CLIENTBOUND,8,(o) -> "BlockEvent{" + "\n    data=" + getFromField(o, "field_12041", "data") + "\n    type=" + getFromField(o, "field_12042", "type") + "\n    block=" + getFromField(o, "field_12043", "block") + "\n    pos=" + getFromField(o, "field_12044", "pos") + "\n}"));
        types.put(OverlayMessageS2CPacket.class,new PacketManager.PacketData<OverlayMessageS2CPacket>("OverlayMessage",NetworkState.PLAY,NetworkSide.CLIENTBOUND,74,(o) -> "OverlayMessage{" + "\n    message=" + getFromField(o, "field_29142", "message") + "\n}"));
        types.put(WorldBorderCenterChangedS2CPacket.class,new PacketManager.PacketData<WorldBorderCenterChangedS2CPacket>("WorldBorderCenterChanged",NetworkState.PLAY,NetworkSide.CLIENTBOUND,75,(o) -> "WorldBorderCenterChanged{" + "\n    centerX=" + getFromField(o, "field_29143", "centerX") + "\n    centerZ=" + getFromField(o, "field_29144", "centerZ") + "\n}"));
        types.put(BlockUpdateS2CPacket.class,new PacketManager.PacketData<BlockUpdateS2CPacket>("BlockUpdate",NetworkState.PLAY,NetworkSide.CLIENTBOUND,9,(o) -> "BlockUpdate{" + "\n    state=" + getFromField(o, "field_12051", "state") + "\n    pos=" + getFromField(o, "field_12052", "pos") + "\n}"));
        types.put(CustomPayloadS2CPacket.class,new PacketManager.PacketData<CustomPayloadS2CPacket>("CustomPayload",NetworkState.PLAY,NetworkSide.CLIENTBOUND,24,(o) -> "CustomPayload{" + "}"));
        types.put(ItemPickupAnimationS2CPacket.class,new PacketManager.PacketData<ItemPickupAnimationS2CPacket>("ItemPickupAnimation",NetworkState.PLAY,NetworkSide.CLIENTBOUND,108,(o) -> "ItemPickupAnimation{" + "\n    stackAmount=" + getFromField(o, "field_12692", "stackAmount") + "\n    collectorEntityId=" + getFromField(o, "field_12693", "collectorEntityId") + "\n    entityId=" + getFromField(o, "field_12694", "entityId") + "\n}"));
        types.put(EnterCombatS2CPacket.class,new PacketManager.PacketData<EnterCombatS2CPacket>("EnterCombat",NetworkState.PLAY,NetworkSide.CLIENTBOUND,57,(o) -> "EnterCombat{" + "}"));
        types.put(PlayerRemoveS2CPacket.class,new PacketManager.PacketData<PlayerRemoveS2CPacket>("PlayerRemove",NetworkState.PLAY,NetworkSide.CLIENTBOUND,59,(o) -> "PlayerRemove{" + "}"));
        types.put(RemoveMessageS2CPacket.class,new PacketManager.PacketData<RemoveMessageS2CPacket>("RemoveMessage",NetworkState.PLAY,NetworkSide.CLIENTBOUND,26,(o) -> "RemoveMessage{" + "}"));
        types.put(ChatSuggestionsS2CPacket.class,new PacketManager.PacketData<ChatSuggestionsS2CPacket>("ChatSuggestions",NetworkState.PLAY,NetworkSide.CLIENTBOUND,23,(o) -> "ChatSuggestions{" + "}"));
        types.put(PlayerListHeaderS2CPacket.class,new PacketManager.PacketData<PlayerListHeaderS2CPacket>("PlayerListHeader",NetworkState.PLAY,NetworkSide.CLIENTBOUND,106,(o) -> "PlayerListHeader{" + "\n    header=" + getFromField(o, "field_12683", "header") + "\n    footer=" + getFromField(o, "field_12684", "footer") + "\n}"));
        types.put(EndCombatS2CPacket.class,new PacketManager.PacketData<EndCombatS2CPacket>("EndCombat",NetworkState.PLAY,NetworkSide.CLIENTBOUND,56,(o) -> "EndCombat{" + "\n    timeSinceLastAttack=" + getFromField(o, "field_29132", "timeSinceLastAttack") + "\n}"));
        types.put(PlayerListS2CPacket.class,new PacketManager.PacketData<PlayerListS2CPacket>("PlayerList",NetworkState.PLAY,NetworkSide.CLIENTBOUND,60,(o) -> "PlayerList{" + "\n    entries=" + getFromField(o, "field_12369", "entries") + "\n    actions=" + getFromField(o, "field_40698", "actions") + "\n}"));
        types.put(ParticleS2CPacket.class,new PacketManager.PacketData<ParticleS2CPacket>("Particle",NetworkState.PLAY,NetworkSide.CLIENTBOUND,39,(o) -> "Particle{" + "\n    offsetZ=" + getFromField(o, "field_12251", "offsetZ") + "\n    offsetY=" + getFromField(o, "field_12252", "offsetY") + "\n    count=" + getFromField(o, "field_12253", "count") + "\n    longDistance=" + getFromField(o, "field_12254", "longDistance") + "\n    offsetX=" + getFromField(o, "field_12255", "offsetX") + "\n    z=" + getFromField(o, "field_12256", "z") + "\n    y=" + getFromField(o, "field_12257", "y") + "\n    x=" + getFromField(o, "field_12258", "x") + "\n    parameters=" + getFromField(o, "field_12259", "parameters") + "\n    speed=" + getFromField(o, "field_12260", "speed") + "\n}"));
        types.put(EntityPositionS2CPacket.class,new PacketManager.PacketData<EntityPositionS2CPacket>("EntityPosition",NetworkState.PLAY,NetworkSide.CLIENTBOUND,109,(o) -> "EntityPosition{" + "\n    z=" + getFromField(o, "field_12701", "z") + "\n    y=" + getFromField(o, "field_12702", "y") + "\n    x=" + getFromField(o, "field_12703", "x") + "\n    onGround=" + getFromField(o, "field_12704", "onGround") + "\n    id=" + getFromField(o, "field_12705", "id") + "\n    pitch=" + getFromField(o, "field_12706", "pitch") + "\n    yaw=" + getFromField(o, "field_12707", "yaw") + "\n}"));
        types.put(DisconnectS2CPacket.class,new PacketManager.PacketData<DisconnectS2CPacket>("Disconnect",NetworkState.PLAY,NetworkSide.CLIENTBOUND,27,(o) -> "Disconnect{" + "\n    reason=" + getFromField(o, "field_12173", "reason") + "\n}"));
        types.put(ChatMessageS2CPacket.class,new PacketManager.PacketData<ChatMessageS2CPacket>("ChatMessage",NetworkState.PLAY,NetworkSide.CLIENTBOUND,55,(o) -> "ChatMessage{" + "\n    serializedParameters=" + getFromField(o, "comp_943", "serializedParameters") + "\n}"));
        types.put(WorldEventS2CPacket.class,new PacketManager.PacketData<WorldEventS2CPacket>("WorldEvent",NetworkState.PLAY,NetworkSide.CLIENTBOUND,38,(o) -> "WorldEvent{" + "\n    data=" + getFromField(o, "field_12239", "data") + "\n    global=" + getFromField(o, "field_12240", "global") + "\n    eventId=" + getFromField(o, "field_12241", "eventId") + "\n    pos=" + getFromField(o, "field_12242", "pos") + "\n}"));
        types.put(LightUpdateS2CPacket.class,new PacketManager.PacketData<LightUpdateS2CPacket>("LightUpdate",NetworkState.PLAY,NetworkSide.CLIENTBOUND,40,(o) -> "LightUpdate{" + "\n    chunkZ=" + getFromField(o, "field_12264", "chunkZ") + "\n    chunkX=" + getFromField(o, "field_12265", "chunkX") + "\n    data=" + getFromField(o, "field_34872", "data") + "\n}"));
        types.put(MapUpdateS2CPacket.class,new PacketManager.PacketData<MapUpdateS2CPacket>("MapUpdate",NetworkState.PLAY,NetworkSide.CLIENTBOUND,42,(o) -> "MapUpdate{" + "\n    scale=" + getFromField(o, "field_12296", "scale") + "\n    id=" + getFromField(o, "field_12303", "id") + "\n    icons=" + getFromField(o, "field_12304", "icons") + "\n    locked=" + getFromField(o, "field_17433", "locked") + "\n    updateData=" + getFromField(o, "field_28016", "updateData") + "\n}"));
        types.put(GameJoinS2CPacket.class,new PacketManager.PacketData<GameJoinS2CPacket>("GameJoin",NetworkState.PLAY,NetworkSide.CLIENTBOUND,41,(o) -> "GameJoin{" + "\n    showDeathScreen=" + getFromField(o, "comp_100", "showDeathScreen") + "\n    playerEntityId=" + getFromField(o, "comp_88", "playerEntityId") + "\n    hardcore=" + getFromField(o, "comp_89", "hardcore") + "\n    dimensionIds=" + getFromField(o, "comp_92", "dimensionIds") + "\n    maxPlayers=" + getFromField(o, "comp_97", "maxPlayers") + "\n    viewDistance=" + getFromField(o, "comp_98", "viewDistance") + "\n    reducedDebugInfo=" + getFromField(o, "comp_99", "reducedDebugInfo") + "\n}"));
        types.put(SetTradeOffersS2CPacket.class,new PacketManager.PacketData<SetTradeOffersS2CPacket>("SetTradeOffers",NetworkState.PLAY,NetworkSide.CLIENTBOUND,43,(o) -> "SetTradeOffers{" + "\n    syncId=" + getFromField(o, "field_17434", "syncId") + "\n    offers=" + getFromField(o, "field_17435", "offers") + "\n    levelProgress=" + getFromField(o, "field_18801", "levelProgress") + "\n    experience=" + getFromField(o, "field_18802", "experience") + "\n    leveled=" + getFromField(o, "field_18803", "leveled") + "\n    refreshable=" + getFromField(o, "field_19376", "refreshable") + "\n}"));
        types.put(EnterReconfigurationS2CPacket.class,new PacketManager.PacketData<EnterReconfigurationS2CPacket>("EnterReconfiguration",NetworkState.PLAY,NetworkSide.CLIENTBOUND,103,(o) -> "EnterReconfiguration{" + "}"));
        types.put(TickStepS2CPacket.class,new PacketManager.PacketData<TickStepS2CPacket>("TickStep",NetworkState.PLAY,NetworkSide.CLIENTBOUND,111,(o) -> "TickStep{" + "}"));
        types.put(StatisticsS2CPacket.class,new PacketManager.PacketData<StatisticsS2CPacket>("Statistics",NetworkState.PLAY,NetworkSide.CLIENTBOUND,4,(o) -> "Statistics{" + "\n    stats=" + getFromField(o, "field_12030", "stats") + "\n}"));
        types.put(ChunkSentS2CPacket.class,new PacketManager.PacketData<ChunkSentS2CPacket>("ChunkSent",NetworkState.PLAY,NetworkSide.CLIENTBOUND,12,(o) -> "ChunkSent{" + "}"));
        types.put(ScoreboardScoreUpdateS2CPacket.class,new PacketManager.PacketData<ScoreboardScoreUpdateS2CPacket>("ScoreboardScoreUpdate",NetworkState.PLAY,NetworkSide.CLIENTBOUND,95,(o) -> "ScoreboardScoreUpdate{" + "\n    scoreHolderName=" + getFromField(o, "comp_2122", "scoreHolderName") + "\n}"));
        types.put(ProfilelessChatMessageS2CPacket.class,new PacketManager.PacketData<ProfilelessChatMessageS2CPacket>("ProfilelessChatMessage",NetworkState.PLAY,NetworkSide.CLIENTBOUND,28,(o) -> "ProfilelessChatMessage{" + "}"));
        types.put(CraftFailedResponseS2CPacket.class,new PacketManager.PacketData<CraftFailedResponseS2CPacket>("CraftFailedResponse",NetworkState.PLAY,NetworkSide.CLIENTBOUND,53,(o) -> "CraftFailedResponse{" + "\n    recipeId=" + getFromField(o, "field_12332", "recipeId") + "\n    syncId=" + getFromField(o, "field_12333", "syncId") + "\n}"));
        types.put(ChunkDeltaUpdateS2CPacket.class,new PacketManager.PacketData<ChunkDeltaUpdateS2CPacket>("ChunkDeltaUpdate",NetworkState.PLAY,NetworkSide.CLIENTBOUND,71,(o) -> "ChunkDeltaUpdate{" + "\n    sectionPos=" + getFromField(o, "field_26345", "sectionPos") + "\n    positions=" + getFromField(o, "field_26346", "positions") + "\n    blockStates=" + getFromField(o, "field_26347", "blockStates") + "\n}"));
        types.put(PlayerRespawnS2CPacket.class,new PacketManager.PacketData<PlayerRespawnS2CPacket>("PlayerRespawn",NetworkState.PLAY,NetworkSide.CLIENTBOUND,69,(o) -> "PlayerRespawn{" + "\n    flag=" + getFromField(o, "comp_1729", "flag") + "\n}"));
        types.put(ExplosionS2CPacket.class,new PacketManager.PacketData<ExplosionS2CPacket>("Explosion",NetworkState.PLAY,NetworkSide.CLIENTBOUND,30,(o) -> "Explosion{" + "\n    playerVelocityX=" + getFromField(o, "field_12176", "playerVelocityX") + "\n    z=" + getFromField(o, "field_12177", "z") + "\n    y=" + getFromField(o, "field_12178", "y") + "\n    radius=" + getFromField(o, "field_12179", "radius") + "\n    x=" + getFromField(o, "field_12180", "x") + "\n    affectedBlocks=" + getFromField(o, "field_12181", "affectedBlocks") + "\n    playerVelocityZ=" + getFromField(o, "field_12182", "playerVelocityZ") + "\n    playerVelocityY=" + getFromField(o, "field_12183", "playerVelocityY") + "\n    particle=" + getFromField(o, "field_47515", "particle") + "\n    emitterParticle=" + getFromField(o, "field_47516", "emitterParticle") + "\n    destructionType=" + getFromField(o, "field_47517", "destructionType") + "\n    soundEvent=" + getFromField(o, "field_47518", "soundEvent") + "\n}"));
        types.put(LookAtS2CPacket.class,new PacketManager.PacketData<LookAtS2CPacket>("LookAt",NetworkState.PLAY,NetworkSide.CLIENTBOUND,61,(o) -> "LookAt{" + "\n    targetZ=" + getFromField(o, "field_12383", "targetZ") + "\n    targetY=" + getFromField(o, "field_12384", "targetY") + "\n    selfAnchor=" + getFromField(o, "field_12385", "selfAnchor") + "\n    targetX=" + getFromField(o, "field_12386", "targetX") + "\n    lookAtEntity=" + getFromField(o, "field_12387", "lookAtEntity") + "\n    entityId=" + getFromField(o, "field_12388", "entityId") + "\n    targetAnchor=" + getFromField(o, "field_12389", "targetAnchor") + "\n}"));
        types.put(ScreenHandlerPropertyUpdateS2CPacket.class,new PacketManager.PacketData<ScreenHandlerPropertyUpdateS2CPacket>("ScreenHandlerPropertyUpdate",NetworkState.PLAY,NetworkSide.CLIENTBOUND,20,(o) -> "ScreenHandlerPropertyUpdate{" + "\n    value=" + getFromField(o, "field_12148", "value") + "\n    propertyId=" + getFromField(o, "field_12149", "propertyId") + "\n    syncId=" + getFromField(o, "field_12150", "syncId") + "\n}"));
        types.put(UnlockRecipesS2CPacket.class,new PacketManager.PacketData<UnlockRecipesS2CPacket>("UnlockRecipes",NetworkState.PLAY,NetworkSide.CLIENTBOUND,63,(o) -> "UnlockRecipes{" + "\n    action=" + getFromField(o, "field_12408", "action") + "\n    recipeIdsToInit=" + getFromField(o, "field_12409", "recipeIdsToInit") + "\n    recipeIdsToChange=" + getFromField(o, "field_12414", "recipeIdsToChange") + "\n    options=" + getFromField(o, "field_25797", "options") + "\n}"));
        types.put(CooldownUpdateS2CPacket.class,new PacketManager.PacketData<CooldownUpdateS2CPacket>("CooldownUpdate",NetworkState.PLAY,NetworkSide.CLIENTBOUND,22,(o) -> "CooldownUpdate{" + "\n    item=" + getFromField(o, "field_12154", "item") + "\n    cooldown=" + getFromField(o, "field_12155", "cooldown") + "\n}"));
        types.put(GameMessageS2CPacket.class,new PacketManager.PacketData<GameMessageS2CPacket>("GameMessage",NetworkState.PLAY,NetworkSide.CLIENTBOUND,105,(o) -> "GameMessage{" + "}"));
        types.put(PlaySoundFromEntityS2CPacket.class,new PacketManager.PacketData<PlaySoundFromEntityS2CPacket>("PlaySoundFromEntity",NetworkState.PLAY,NetworkSide.CLIENTBOUND,101,(o) -> "PlaySoundFromEntity{" + "\n    pitch=" + getFromField(o, "field_12638", "pitch") + "\n    volume=" + getFromField(o, "field_12639", "volume") + "\n    entityId=" + getFromField(o, "field_12640", "entityId") + "\n    category=" + getFromField(o, "field_12641", "category") + "\n    sound=" + getFromField(o, "field_12642", "sound") + "\n    seed=" + getFromField(o, "field_38819", "seed") + "\n}"));
        types.put(SubtitleS2CPacket.class,new PacketManager.PacketData<SubtitleS2CPacket>("Subtitle",NetworkState.PLAY,NetworkSide.CLIENTBOUND,97,(o) -> "Subtitle{" + "\n    subtitle=" + getFromField(o, "field_29165", "subtitle") + "\n}"));
        types.put(ExperienceOrbSpawnS2CPacket.class,new PacketManager.PacketData<ExperienceOrbSpawnS2CPacket>("ExperienceOrbSpawn",NetworkState.PLAY,NetworkSide.CLIENTBOUND,2,(o) -> "ExperienceOrbSpawn{" + "\n    z=" + getFromField(o, "field_11970", "z") + "\n    y=" + getFromField(o, "field_11971", "y") + "\n    x=" + getFromField(o, "field_11972", "x") + "\n    experience=" + getFromField(o, "field_11973", "experience") + "\n    id=" + getFromField(o, "field_11974", "id") + "\n}"));
        types.put(BlockBreakingProgressS2CPacket.class,new PacketManager.PacketData<BlockBreakingProgressS2CPacket>("BlockBreakingProgress",NetworkState.PLAY,NetworkSide.CLIENTBOUND,6,(o) -> "BlockBreakingProgress{" + "\n    progress=" + getFromField(o, "field_12032", "progress") + "\n    entityId=" + getFromField(o, "field_12033", "entityId") + "\n    pos=" + getFromField(o, "field_12034", "pos") + "\n}"));
        types.put(EntityEquipmentUpdateS2CPacket.class,new PacketManager.PacketData<EntityEquipmentUpdateS2CPacket>("EntityEquipmentUpdate",NetworkState.PLAY,NetworkSide.CLIENTBOUND,89,(o) -> "EntityEquipmentUpdate{" + "\n    id=" + getFromField(o, "field_12565", "id") + "\n    equipmentList=" + getFromField(o, "field_25721", "equipmentList") + "\n}"));
        types.put(ChunkBiomeDataS2CPacket.class,new PacketManager.PacketData<ChunkBiomeDataS2CPacket>("ChunkBiomeData",NetworkState.PLAY,NetworkSide.CLIENTBOUND,14,(o) -> "ChunkBiomeData{" + "}"));
        types.put(EntityPassengersSetS2CPacket.class,new PacketManager.PacketData<EntityPassengersSetS2CPacket>("EntityPassengersSet",NetworkState.PLAY,NetworkSide.CLIENTBOUND,93,(o) -> "EntityPassengersSet{" + "\n    passengerIds=" + getFromField(o, "field_12593", "passengerIds") + "\n    id=" + getFromField(o, "field_12594", "id") + "\n}"));
        types.put(BossBarS2CPacket.class,new PacketManager.PacketData<BossBarS2CPacket>("BossBar",NetworkState.PLAY,NetworkSide.CLIENTBOUND,10,(o) -> "BossBar{" + "\n    uuid=" + getFromField(o, "field_12074", "uuid") + "\n    action=" + getFromField(o, "field_12075", "action") + "\n}"));
        types.put(ServerMetadataS2CPacket.class,new PacketManager.PacketData<ServerMetadataS2CPacket>("ServerMetadata",NetworkState.PLAY,NetworkSide.CLIENTBOUND,73,(o) -> "ServerMetadata{" + "\n    description=" + getFromField(o, "field_39387", "description") + "\n    secureChatEnforced=" + getFromField(o, "field_39920", "secureChatEnforced") + "\n    favicon=" + getFromField(o, "field_42967", "favicon") + "\n}"));
        types.put(WorldBorderSizeChangedS2CPacket.class,new PacketManager.PacketData<WorldBorderSizeChangedS2CPacket>("WorldBorderSizeChanged",NetworkState.PLAY,NetworkSide.CLIENTBOUND,77,(o) -> "WorldBorderSizeChanged{" + "\n    sizeLerpTarget=" + getFromField(o, "field_29148", "sizeLerpTarget") + "\n}"));
        types.put(WorldBorderWarningBlocksChangedS2CPacket.class,new PacketManager.PacketData<WorldBorderWarningBlocksChangedS2CPacket>("WorldBorderWarningBlocksChanged",NetworkState.PLAY,NetworkSide.CLIENTBOUND,79,(o) -> "WorldBorderWarningBlocksChanged{" + "\n    warningBlocks=" + getFromField(o, "field_29150", "warningBlocks") + "\n}"));
        types.put(ChunkLoadDistanceS2CPacket.class,new PacketManager.PacketData<ChunkLoadDistanceS2CPacket>("ChunkLoadDistance",NetworkState.PLAY,NetworkSide.CLIENTBOUND,83,(o) -> "ChunkLoadDistance{" + "\n    distance=" + getFromField(o, "field_19146", "distance") + "\n}"));
        types.put(ScoreboardDisplayS2CPacket.class,new PacketManager.PacketData<ScoreboardDisplayS2CPacket>("ScoreboardDisplay",NetworkState.PLAY,NetworkSide.CLIENTBOUND,85,(o) -> "ScoreboardDisplay{" + "\n    slot=" + getFromField(o, "field_12464", "slot") + "\n    name=" + getFromField(o, "field_12465", "name") + "\n}"));
        types.put(EntityAttachS2CPacket.class,new PacketManager.PacketData<EntityAttachS2CPacket>("EntityAttach",NetworkState.PLAY,NetworkSide.CLIENTBOUND,87,(o) -> "EntityAttach{" + "\n    holdingEntityId=" + getFromField(o, "field_12478", "holdingEntityId") + "\n    attachedEntityId=" + getFromField(o, "field_12479", "attachedEntityId") + "\n}"));
        types.put(UpdateSelectedSlotS2CPacket.class,new PacketManager.PacketData<UpdateSelectedSlotS2CPacket>("UpdateSelectedSlot",NetworkState.PLAY,NetworkSide.CLIENTBOUND,81,(o) -> "UpdateSelectedSlot{" + "\n    slot=" + getFromField(o, "field_12463", "slot") + "\n}"));
        types.put(OpenHorseScreenS2CPacket.class,new PacketManager.PacketData<OpenHorseScreenS2CPacket>("OpenHorseScreen",NetworkState.PLAY,NetworkSide.CLIENTBOUND,33,(o) -> "OpenHorseScreen{" + "\n    horseId=" + getFromField(o, "field_12142", "horseId") + "\n    slotCount=" + getFromField(o, "field_12143", "slotCount") + "\n    syncId=" + getFromField(o, "field_12144", "syncId") + "\n}"));
        types.put(ScoreboardScoreResetS2CPacket.class,new PacketManager.PacketData<ScoreboardScoreResetS2CPacket>("ScoreboardScoreReset",NetworkState.PLAY,NetworkSide.CLIENTBOUND,66,(o) -> "ScoreboardScoreReset{" + "\n    scoreHolderName=" + getFromField(o, "comp_2120", "scoreHolderName") + "\n}"));

        types.put(CustomPayloadS2CPacket.class,new PacketManager.PacketData<CustomPayloadS2CPacket>("CustomPayload",NetworkState.CONFIGURATION,NetworkSide.CLIENTBOUND,0,(o) -> "CustomPayload{" + "}"));
        types.put(ReadyS2CPacket.class,new PacketManager.PacketData<ReadyS2CPacket>("Ready",NetworkState.CONFIGURATION,NetworkSide.CLIENTBOUND,2,(o) -> "Ready{" + "}"));
        types.put(ResourcePackRemoveS2CPacket.class,new PacketManager.PacketData<ResourcePackRemoveS2CPacket>("ResourcePackRemove",NetworkState.CONFIGURATION,NetworkSide.CLIENTBOUND,6,(o) -> "ResourcePackRemove{" + "}"));
        types.put(CommonPingS2CPacket.class,new PacketManager.PacketData<CommonPingS2CPacket>("CommonPing",NetworkState.CONFIGURATION,NetworkSide.CLIENTBOUND,4,(o) -> "CommonPing{" + "\n    parameter=" + getFromField(o, "field_33751", "parameter") + "\n}"));
        types.put(FeaturesS2CPacket.class,new PacketManager.PacketData<FeaturesS2CPacket>("Features",NetworkState.CONFIGURATION,NetworkSide.CLIENTBOUND,8,(o) -> "Features{" + "}"));
        types.put(SynchronizeTagsS2CPacket.class,new PacketManager.PacketData<SynchronizeTagsS2CPacket>("SynchronizeTags",NetworkState.CONFIGURATION,NetworkSide.CLIENTBOUND,9,(o) -> "SynchronizeTags{" + "\n    groups=" + getFromField(o, "field_12757", "groups") + "\n}"));
        types.put(DisconnectS2CPacket.class,new PacketManager.PacketData<DisconnectS2CPacket>("Disconnect",NetworkState.CONFIGURATION,NetworkSide.CLIENTBOUND,1,(o) -> "Disconnect{" + "\n    reason=" + getFromField(o, "field_12173", "reason") + "\n}"));
        types.put(KeepAliveS2CPacket.class,new PacketManager.PacketData<KeepAliveS2CPacket>("KeepAlive",NetworkState.CONFIGURATION,NetworkSide.CLIENTBOUND,3,(o) -> "KeepAlive{" + "\n    id=" + getFromField(o, "field_12211", "id") + "\n}"));
        types.put(ResourcePackSendS2CPacket.class,new PacketManager.PacketData<ResourcePackSendS2CPacket>("ResourcePackSend",NetworkState.CONFIGURATION,NetworkSide.CLIENTBOUND,7,(o) -> "ResourcePackSend{" + "}"));
        types.put(DynamicRegistriesS2CPacket.class,new PacketManager.PacketData<DynamicRegistriesS2CPacket>("DynamicRegistries",NetworkState.CONFIGURATION,NetworkSide.CLIENTBOUND,5,(o) -> "DynamicRegistries{" + "\n    registryManager=" + getFromField(o, "comp_1724", "registryManager") + "\n}"));


        types.put(QueryResponseS2CPacket.class,new PacketManager.PacketData<QueryResponseS2CPacket>("QueryResponse",NetworkState.STATUS,NetworkSide.CLIENTBOUND,0,(o) -> "QueryResponse{" + "\n    metadata=" + getFromField(o, "comp_1272", "metadata") + "\n}"));
        types.put(PingResultS2CPacket.class,new PacketManager.PacketData<PingResultS2CPacket>("PingResult",NetworkState.STATUS,NetworkSide.CLIENTBOUND,1,(o) -> "PingResult{" + "\n    startTime=" + getFromField(o, "field_13280", "startTime") + "\n}"));

        types.put(LoginDisconnectS2CPacket.class,new PacketManager.PacketData<LoginDisconnectS2CPacket>("LoginDisconnect",NetworkState.LOGIN,NetworkSide.CLIENTBOUND,0,(o) -> "LoginDisconnect{" + "\n    reason=" + getFromField(o, "field_13243", "reason") + "\n}"));
        types.put(LoginSuccessS2CPacket.class,new PacketManager.PacketData<LoginSuccessS2CPacket>("LoginSuccess",NetworkState.LOGIN,NetworkSide.CLIENTBOUND,2,(o) -> "LoginSuccess{" + "\n    profile=" + getFromField(o, "field_13190", "profile") + "\n}"));
        types.put(LoginQueryRequestS2CPacket.class,new PacketManager.PacketData<LoginQueryRequestS2CPacket>("LoginQueryRequest",NetworkState.LOGIN,NetworkSide.CLIENTBOUND,4,(o) -> "LoginQueryRequest{" + "\n    queryId=" + getFromField(o, "comp_1567", "queryId") + "\n}"));
        types.put(LoginHelloS2CPacket.class,new PacketManager.PacketData<LoginHelloS2CPacket>("LoginHello",NetworkState.LOGIN,NetworkSide.CLIENTBOUND,1,(o) -> "LoginHello{" + "\n    serverId=" + getFromField(o, "field_13209", "serverId") + "\n    nonce=" + getFromField(o, "field_13210", "nonce") + "\n    publicKey=" + getFromField(o, "field_13211", "publicKey") + "\n}"));
        types.put(LoginCompressionS2CPacket.class,new PacketManager.PacketData<LoginCompressionS2CPacket>("LoginCompression",NetworkState.LOGIN,NetworkSide.CLIENTBOUND,3,(o) -> "LoginCompression{" + "\n    compressionThreshold=" + getFromField(o, "field_13232", "compressionThreshold") + "\n}"));

    }

    @Override
    public PacketManager.PacketData get(Class<?> clazz) {
        return types.get(clazz);
    }

    @Override
    public Map<Class<?>, PacketData> getTypes() {
        return types;
    }

    private static Object getFromField(Object o, String nameA, String nameB) {
        Field field = null;
        try {
            field = o.getClass().getDeclaredField(nameB);
            if (field == null) {
                field = o.getClass().getDeclaredField(nameA);
            }
            if (field != null) {
                field.setAccessible(true);
                return field.get(o);
            }
        } catch (NoSuchFieldException | IllegalAccessException e) {
           PacketInspectorMod.LOGGER.error("Could not read packet");
           e.printStackTrace();
        }

        return null;
    }
}
