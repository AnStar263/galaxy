package machinerydustry;
import arc.*;
import mindustry.core.*;
import mindustry.graphics.*;
import arc.graphics.g2d.*;
import arc.scene.ui.*;
import arc.scene.style.TextureRegionDrawable;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.ui.Styles;
import mindustry.ui.dialogs.*;
import mindustry.mod.Mods.*;

import static mindustry.Vars.*;

public class ImmersionIndustry extends Mod{
    
    public static final String NAME = "immersionindustry";
    public static LoadedMod MOD;
    
    @Override
    public void init() {
    }
    
    //当加载模组内容时被调用
    @Override
    public void loadContent() {
      MOD = Vars.mods.getMod(getClass());
      MDSounds.load();
      MDShaders.load();
      MDCacheLayer.init();
    }
	
}