package gmff;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod("gmff")
public class GameModifyForFun
{
    public GameModifyForFun() {
        RegistryEvents.myBlocks.register(FMLJavaModLoadingContext.get().getModEventBus());
    	RegistryEvents.myItems.register(FMLJavaModLoadingContext.get().getModEventBus());
        MinecraftForge.EVENT_BUS.register(this);
    }
    
    public static class RegistryEvents {
    	public static DeferredRegister<Block> myBlocks = DeferredRegister.create(ForgeRegistries.BLOCKS, "gmff");
    	public static DeferredRegister<Item> myItems = DeferredRegister.create(ForgeRegistries.ITEMS, "gmff");
    	public static RegistryObject<Block> gmffBlock = myBlocks.register("all_ore", () -> new Block(Block.Properties.of(Material.STONE)));
    	public static RegistryObject<Item> gmffItem = myItems.register("all_ore", () -> new BlockItem(gmffBlock.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
    }
}