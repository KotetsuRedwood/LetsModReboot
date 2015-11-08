package com.kotetsuredwood.letsmodreboot.init;

import com.kotetsuredwood.letsmodreboot.item.itemLMRB;
import com.kotetsuredwood.letsmodreboot.item.itemMapleLeaf;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
    public static final itemLMRB mapleLeaf = new itemMapleLeaf();

    public static void init()
    {
        GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
    }
}
