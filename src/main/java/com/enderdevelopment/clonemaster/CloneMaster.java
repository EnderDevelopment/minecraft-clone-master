package com.enderdevelopment.clonemaster;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class CloneMaster {
    public static final String MOD_ID = "clonemaster";
    
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);
    
    public static final RegistryObject<Item> CLONE_MASTER_ITEM = ITEMS.register("clone_master_item", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}