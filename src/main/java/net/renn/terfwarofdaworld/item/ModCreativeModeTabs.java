package net.renn.terfwarofdaworld.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.renn.terfwarofdaworld.TerfWar;
import net.renn.terfwarofdaworld.block.ModBlocks;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TerfWar.MOD_ID);

    public static final Supplier<CreativeModeTab> TERF_WAR_ITEMS_TAB = CREATIVE_MODE_TAB.register("terf_war_items_tab",
        () -> CreativeModeTab.builder().icon(()-> new ItemStack(ModItems.THE_GOOD_JOB_STICKER.get()))
                .title(Component.translatable("creativetab.terfwarofdaworld.terf_war_items"))
                .displayItems((itemDisplayParameters, output) -> {
                    output.accept(ModItems.ERASER);
                    output.accept(ModItems.THE_GOOD_JOB_STICKER);
                })
                .build());

    public static final Supplier<CreativeModeTab> TERF_WAR_WEAPONS_TAB = CREATIVE_MODE_TAB.register("terf_war_weapons_tab",
        () -> CreativeModeTab.builder().icon(()-> new ItemStack(ModItems.TERF_BULLET.get()))
                .withTabsBefore(ResourceLocation.fromNamespaceAndPath(TerfWar.MOD_ID, "terf_war_items_tab"))
                .title(Component.translatable("creativetab.terfwarofdaworld.terf_war_items"))
                .displayItems((itemDisplayParameters, output) -> {
                    output.accept(ModItems.TERF_BULLET);
                    output.accept(ModBlocks.TERF_BULLET_BLOCK);
                    output.accept(ModBlocks.TERF_BULLET_CRATE);
                })
                .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }

}
