package nesb01t.poweritemcraft.core;

import nesb01t.poweritemcraft.PowerItemCraft;
import nesb01t.poweritemcraft.core.generator.GeneratorCommand;
import nesb01t.poweritemcraft.events.AntiAnvil;
import nesb01t.poweritemcraft.events.BlockBreak;
import nesb01t.poweritemcraft.events.ItemBreak;

public class Core {
    public Core() {
        PowerItemCraft.easyRegCommand(new GeneratorCommand(), "pic");
        PowerItemCraft.easyRegEvent(new BlockBreak());
        PowerItemCraft.easyRegEvent(new AntiAnvil());
        PowerItemCraft.easyRegEvent(new ItemBreak());
    }
}
