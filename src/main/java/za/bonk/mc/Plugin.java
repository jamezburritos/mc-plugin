package za.bonk.mc;

import java.util.logging.Logger;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import za.bonk.mc.event.PlayerJoin;

public class Plugin extends JavaPlugin {
    public Logger logger;

    private PluginManager pluginManager;

    @Override
    public void onEnable() {
        logger = getLogger();
        pluginManager = getServer().getPluginManager();

        pluginManager.registerEvents(new PlayerJoin(), this);
    }
}
