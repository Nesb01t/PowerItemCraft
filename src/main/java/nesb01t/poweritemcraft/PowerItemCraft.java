package nesb01t.poweritemcraft;

import nesb01t.poweritemcraft.core.Core;
import nesb01t.poweritemcraft.utils.Message;
import org.bukkit.command.CommandExecutor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class PowerItemCraft extends JavaPlugin {
    public static JavaPlugin pluginInstance;
    public static Core core;

    public static void easyRegEvent(Listener listener) {
        pluginInstance.getServer().getPluginManager().registerEvents(listener, pluginInstance);
    }

    public static void easyRegCommand(CommandExecutor executor, String name) {
        pluginInstance.getCommand(name).setExecutor(executor);
    }

    @Override
    public void onEnable() {
        pluginInstance = this;
        core = new Core();
        Message.sendConsoleMsg("正在启动 PowerItemCraft.");
    }

    @Override
    public void onDisable() {
        Message.sendConsoleMsg("正在关闭 PowerItemCraft.");
    }
}
