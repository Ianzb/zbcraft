package org.zb.zbcraft;

import net.fabricmc.api.ModInitializer;
import org.zb.zbcraft.item.*;
import org.zb.zbcraft.itemGroup.*;

public class Zbcraft implements ModInitializer {

    @Override
    public void onInitialize() {
        ZbItems.initialize();
        ZbItemGroups.initialize();
    }
}
