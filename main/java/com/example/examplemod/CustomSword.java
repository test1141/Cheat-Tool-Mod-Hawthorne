package com.example.examplemod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class CustomSword extends ItemSword {

	public CustomSword() {
		super(ExampleMod.myToolMaterial);
		// TODO Auto-generated constructor stub
		this.setRegistryName("my_sword");
		this.setUnlocalizedName("my_sword");
		//Replace COMBAT with TOOLS if you're making a tool instead of a weapon or armor.
		this.setCreativeTab(CreativeTabs.COMBAT);
		
	}
	

}
