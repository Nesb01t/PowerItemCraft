package nesb01t.poweritemcraft.core;

import nesb01t.poweritemcraft.PowerItemCraft;
import nesb01t.poweritemcraft.core.events.AntiAnvil;
import nesb01t.poweritemcraft.core.events.BlockBreak;
import nesb01t.poweritemcraft.core.generator.GeneratorCommand;

public class Core {
    public Core() {
        PowerItemCraft.easyRegCommand(new GeneratorCommand(), "pic");

        PowerItemCraft.easyRegEvent(new BlockBreak());
        PowerItemCraft.easyRegEvent(new AntiAnvil());
    }
}
