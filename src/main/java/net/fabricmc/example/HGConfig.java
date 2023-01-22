package net.fabricmc.example;

import io.github.vampirestudios.vampirelib.api.CustomConfig;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;

@Config(name = "hidden_gems_config")
public class HGConfig implements ConfigData, CustomConfig {
	public boolean eat_cookies_berries_fast = false;
}