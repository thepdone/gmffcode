package gmff;

import com.mojang.blaze3d.matrix.MatrixStack;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class PornScreen extends Screen {
	
	int page;
	
	public PornScreen() {
		super(new TranslationTextComponent(""));
		page = 1;
	}
	
	@Override
	public void init(Minecraft p_231158_1_, int p_231158_2_, int p_231158_3_) {
		
		super.init(p_231158_1_, p_231158_2_, p_231158_3_);
		
		int w = this.width / 2;
		int h = this.height / 2;
		
		addButton(new Button(w - 150, h, 70, 20, new TranslationTextComponent("Back Page"), (event) ->  {
			if (page > 1) page--;
		}));
		
		addButton(new Button(w + 150 - 70, h, 70, 20, new TranslationTextComponent("Next Page"), (event) ->  {
			if (page < 10) page++;
		}));
	}
	
	@Override
	public void render(MatrixStack p_230430_1_, int p_230430_2_, int p_230430_3_, float p_230430_4_) {
		renderBackground(p_230430_1_);
		getMinecraft().getTextureManager().bind(new ResourceLocation("gmff:textures/gui/pornbook.png"));
		blit(p_230430_1_, (this.width / 2) - (146 / 2), (this.height / 2) - (180 / 2), 0, 0, 146, 180, 146, 180);
		String s = "" + page;
		drawCenteredString(p_230430_1_, this.font, s, (this.width / 2), (this.height / 2), s.length());
		super.render(p_230430_1_, p_230430_2_, p_230430_3_, p_230430_4_);
	}
}
