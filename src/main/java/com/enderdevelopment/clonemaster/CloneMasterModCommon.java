package com.enderdevelopment.clonemaster;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;

@Mod(CloneMaster.MOD_ID)
public class CloneMasterModCommon {
    public CloneMasterModCommon() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        
        CloneMaster.register(modEventBus);
    }
}