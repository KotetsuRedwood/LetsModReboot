package com.kotetsuredwood.letsmodreboot.init;


import com.kotetsuredwood.letsmodreboot.block.blockFlag;
import com.kotetsuredwood.letsmodreboot.block.blockLMRB;
import com.kotetsuredwood.letsmodreboot.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)''
public class modBlocks
{
    public static final blockLMRB flag = new blockFlag();

    public static void init()
    {
        GameRegistry.registerBlock(flag, "flag");
    }

}
