package gmff;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTier;
import net.minecraft.item.SwordItem;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class MultiSword extends SwordItem{

	public MultiSword(Properties p_i48460_4_) {
		super(ItemTier.DIAMOND, 3, -2.4F, p_i48460_4_);
	}
	
	@Override
	public float getDamage() {
		return 20;
	}
	
	@Override
	public boolean hurtEnemy(ItemStack p_77644_1_, LivingEntity p_77644_2_, LivingEntity p_77644_3_) {
		p_77644_2_.addEffect(new EffectInstance(Effects.POISON, 20 * 3, 0));
		p_77644_3_.addEffect(new EffectInstance(Effects.DAMAGE_BOOST, 20 * 3, 0));
		return super.hurtEnemy(p_77644_1_, p_77644_2_, p_77644_3_);
	}
}
