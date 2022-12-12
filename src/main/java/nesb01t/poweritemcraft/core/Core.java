package nesb01t.poweritemcraft.core;

import nesb01t.poweritemcraft.PowerItemCraft;
import nesb01t.poweritemcraft.core.generator.GeneratorCommand;

public class Core {
    public Core() {
        PowerItemCraft.pluginInstance.getCommand("pic").setExecutor(new GeneratorCommand());
    }
}
