package net.probluecougar.endgameexpanded.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.probluecougar.endgameexpanded.EndgameExpanded;

public class ModItems {

    public static final Item INTERDIMENSIONAL_LIGHTER = registerItems("interdimensional_lighter", new Item(new FabricItemSettings().group(ItemGroup.MISC)));


    private static Item registerItems(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(EndgameExpanded.MOD_ID, name), item);
    }
    public static void RegisterModItems(){
        EndgameExpanded.LOGGER.debug("Registering Items For " + EndgameExpanded.MOD_ID);
    }
}
