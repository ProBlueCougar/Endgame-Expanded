package net.probluecougar.endgameexpanded.portal;

import net.kyrptonaught.customportalapi.api.CustomPortalBuilder;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.probluecougar.endgameexpanded.item.ModItems;

public class Portal {

    public static void portalRegister(){
        CustomPortalBuilder.beginPortal()
                .frameBlock(Blocks.CRYING_OBSIDIAN)
                .tintColor(186,1,13)
                .lightWithItem(ModItems.INTERDIMENSIONAL_LIGHTER)
                .destDimID(new Identifier("the_nether"))
                .returnDim(new Identifier("the_end"), true)
                .registerPortal();



    }
}
