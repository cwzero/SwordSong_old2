package com.liquidforte.sword.inject.game;

import com.google.inject.AbstractModule;
import com.liquidforte.phantasia.api.game.GameSettings;
import com.liquidforte.sword.game.GameSettingsImpl;

public class GameModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(GameSettings.class).to(GameSettingsImpl.class).asEagerSingleton();
    }
}
