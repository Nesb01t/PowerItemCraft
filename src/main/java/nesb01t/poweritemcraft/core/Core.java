package nesb01t.poweritemcraft.core;

import nesb01t.poweritemcraft.PowerItemCraft;
import nesb01t.poweritemcraft.command.givePowerItem;
import nesb01t.poweritemcraft.events.PowerItemAntiAnvil;
import nesb01t.poweritemcraft.events.PowerItemBreakEvent;

public class Core {
    public Core() {
        registerPICEvent();
        registerPICCommand();
    }

    private void registerPICCommand() {
        PowerItemCraft.easyRegCommand(new givePowerItem(), "pic");
    }

    private void registerPICEvent() {
        PowerItemCraft.easyRegEvent(new PowerItemAntiAnvil());
        PowerItemCraft.easyRegEvent(new PowerItemBreakEvent());
    }

}
