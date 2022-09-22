package net.probluecougar.endgameexpanded.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.probluecougar.endgameexpanded.EndgameExpanded;

public class ModItemGroup {
   public static final ItemGroup ENDGAME_EXPANDED_ITEMGROUP = FabricItemGroupBuilder.build(
            new Identifier(EndgameExpanded.MOD_ID,"endgame_itemgroup"),
            () -> new ItemStack(ModItems.ENDER_INGOT)

    );

    public static void RegisterModItemGroup(){
        EndgameExpanded.LOGGER.debug("Registering ItemGroup For " + EndgameExpanded.MOD_ID);
    }
}

