package gmff;

import com.mojang.blaze3d.matrix.MatrixStack;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class PornScreen extends Screen {
	
	public PornScreen() {
		super(new TranslationTextComponent(""));
	}
	
	@Override
	public void render(MatrixStack p_230430_1_, int p_230430_2_, int p_230430_3_, float p_230430_4_) {
		renderBackground(p_230430_1_);
		getMinecraft().getTextureManager().bind(new ResourceLocation("gmff:textures/gui/pornbook.png"));
		blit(p_230430_1_, (this.width / 2) - (146 / 2), (this.height / 2) - (180 / 2), 0, 0, 146, 180, 146, 180);
		String s = "WANZ-882";
		drawCenteredString(p_230430_1_, this.font, s, (this.width / 2), (this.height / 2), s.length());
	}
}
