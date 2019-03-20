package andrewmogo.item_mandolin;


import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.lwjgl.opengl.GL11;

import javax.annotation.Nullable;
import java.util.List;

public class Mandolin extends ItemFood
{

    public Mandolin() {

        super(0, 0, false);
        this.setMaxStackSize(16);
        this.setCreativeTab(CreativeTabs.FOOD);
        this.setAlwaysEdible();
    }

    protected void onFoodEaten(ItemStack itemstack, World world, EntityPlayer player) {
        player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 1200, 0));
//        player.inventory.addItemStackToInventory(new ItemStack(ItemListxlfoodmod.glass_mug));
    }

    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        tooltip.add(TextFormatting.BLUE + "Speed I (1:00)");
    }

    @Override
    public EnumAction getItemUseAction(ItemStack stack) {
        return EnumAction.DRINK;
    }



}