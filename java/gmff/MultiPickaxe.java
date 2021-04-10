package gmff;

import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTier;
import net.minecraft.item.PickaxeItem;

public class MultiPickaxe extends PickaxeItem{

	public MultiPickaxe(Properties p_i48460_4_) {
		super(ItemTier.DIAMOND, 3, -2.4F, p_i48460_4_);
	}
	
	@Override
	public float getDestroySpeed(ItemStack p_150893_1_, BlockState p_150893_2_) {
		Material material = p_150893_2_.getMaterial();
		return material != Material.METAL && material != Material.HEAVY_METAL && material != Material.STONE ? super.getDestroySpeed(p_150893_1_, p_150893_2_) : this.speed * 2;
	}
}
