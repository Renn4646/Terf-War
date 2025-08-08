package net.renn.terfwarofdaworld.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.renn.terfwarofdaworld.TerfWar;

public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(TerfWar.MOD_ID);

    public static final DeferredItem<Item> ERASER = ITEMS.register("eraser",
            ()-> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
