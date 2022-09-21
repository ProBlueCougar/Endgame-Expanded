package net.probluecougar.endgameexpanded.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.probluecougar.endgameexpanded.EndgameExpanded;

public class ModBlocks {

    //infused grass block
    public static final Block INFUSED_GRASS = registerBlocks("infused_grass",new Block(FabricBlockSettings.of(Material.PLANT).strength(0.1f)));
    public static final BlockItem INFUSED_GRASS_ITEM = registerBlockItems("infused_grass", INFUSED_GRASS,ItemGroup.BUILDING_BLOCKS);

    //infused dirt block
    public static final Block INFUSED_DIRT = registerBlocks("infused_dirt",new Block(FabricBlockSettings.of(Material.PLANT).strength(0.1f)));
    public static final BlockItem INFUSED_DIRT_ITEM = registerBlockItems("infused_dirt",INFUSED_DIRT,ItemGroup.BUILDING_BLOCKS);

    //ender ore block
    public static final Block ENDER_ORE = registerBlocks("ender_ore",new Block(FabricBlockSettings.of(Material.STONE).strength(0.4f)));
    public static final BlockItem ENDER_ORE_ITEM = registerBlockItems("ender_ore",ENDER_ORE,ItemGroup.BUILDING_BLOCKS);





    private static Block registerBlocks(String name, Block block){
        return Registry.register(Registry.BLOCK, new Identifier(EndgameExpanded.MOD_ID, name), block);

    }

    private static BlockItem registerBlockItems(String name, Block block, ItemGroup itemgroup){
        return Registry.register(Registry.ITEM, new Identifier(EndgameExpanded.MOD_ID, name), new BlockItem(block, new FabricItemSettings().group(itemgroup)));
    }


    public static void RegisterModBlocks(){
        EndgameExpanded.LOGGER.debug("Registering Blocks For " + EndgameExpanded.MOD_ID);
    }
}
