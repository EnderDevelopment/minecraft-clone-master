package com.enderdevelopment.clonemaster;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(CloneMaster.MOD_ID)
public class CloneMasterMod {
    public CloneMasterMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        
        CloneMaster.register(modEventBus);
        
        MinecraftForge.EVENT_BUS.register(this);
    }
}