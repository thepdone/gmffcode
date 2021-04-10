package gmff;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class ItemBookPorn extends Item{

	public ItemBookPorn(Properties p_i48487_1_) {
		super(p_i48487_1_);
	}
	
	@OnlyIn(Dist.CLIENT)
	@Override
	public ActionResult<ItemStack> use(World p_77659_1_, PlayerEntity p_77659_2_, Hand p_77659_3_) {
		
		Minecraft.getInstance().setScreen(new PornScreen());
		
		return ActionResult.pass(p_77659_2_.getItemInHand(p_77659_3_));
	}
}
