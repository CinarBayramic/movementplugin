package me.cinarbayramic.movementplus;

import org.bukkit.plugin.java.JavaPlugin;

public final class Movementplus extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new MovementListeners(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
