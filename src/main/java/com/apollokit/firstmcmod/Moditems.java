package com.apollokit.firstmcmod;

import net.minecraftforge.fml.common.Mod;

import com.apollokit.firstmcmod.modmain;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;


/**
 * This class has the register event handler for all custom items.
 * This class uses @Mod.EventBusSubscriber so the event handler has to be static
 * This class uses @ObjectHolder to get a reference to the items
 */
@Mod.EventBusSubscriber(modid = modmain.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(modmain.MOD_ID)
public class Moditems {

    public static final Item tutorial_dust = null;

    /**
     * The actual event handler that registers the custom items.
     *
     * @param event The event this event handler handles
     */
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        //In here you pass in all item instances you want to register.
        //Make sure you always set the registry name.
        event.getRegistry().registerAll(

                new Item(new Item.Properties()).setRegistryName(modmain.MOD_ID, "tutorial_dust1")
        );
    }

}