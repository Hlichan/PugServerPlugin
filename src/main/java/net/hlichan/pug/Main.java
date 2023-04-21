package net.hlichan.pug;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {
    private static JavaPlugin plugin;

    @Override
    public void onEnable() {
        // プラグイン起動時の処理
        super.onEnable();

        plugin = this;

        getLogger().info("プラグインは正常に起動しました。");
    }

    @Override
    public void onDisable() {
        // プラグイン停止時の処理
        super.onDisable();

        getLogger().info("プラグインは正常に停止しました。");
    }

    public static JavaPlugin getPlugin() {
        return plugin;
    }
}
