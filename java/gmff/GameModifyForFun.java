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
    	public static RegistryObject<Item> multiOre = myItems.register("multi_ore", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
        public static RegistryObject<Item> multiSword = myItems.register("multi_sword", () -> new MultiSword(new Item.Properties().tab(ItemGroup.TAB_COMBAT)));
        public static RegistryObject<Item> multiPickaxe = myItems.register("multi_pickaxe", () -> new MultiPickaxe(new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
    	public static RegistryObject<Item> sss = myItems.register("porn_book", () -> new ItemBookPorn(new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
    }
}
