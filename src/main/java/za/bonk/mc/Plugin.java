package za.bonk.mc;

import java.util.logging.Logger;

import org.bukkit.Server;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scoreboard.ScoreboardManager;

import za.bonk.mc.event.PlayerJoin;

public class Plugin extends JavaPlugin {
    public static Logger logger;
    public static ScoreboardManager scoreboardManager;

    private Server server;
    private PluginManager pluginManager;

    @Override
    public void onEnable() {
        logger = getLogger();
        server = getServer();

        pluginManager     = server.getPluginManager();
        scoreboardManager = server.getScoreboardManager();

        pluginManager.registerEvents(new PlayerJoin(), this);
    }
}
