package com.kotetsuredwood.letsmodreboot.init;

import com.kotetsuredwood.letsmodreboot.item.itemLMRB;
import com.kotetsuredwood.letsmodreboot.item.itemMapleLeaf;
import com.kotetsuredwood.letsmodreboot.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class modItems
{
    public static final itemLMRB mapleLeaf = new itemMapleLeaf();

    public static void init()
    {
        GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
    }
}
