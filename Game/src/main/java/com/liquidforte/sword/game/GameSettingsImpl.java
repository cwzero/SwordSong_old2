package com.liquidforte.sword.game;

import com.liquidforte.phantasia.api.game.GameSettings;

public class GameSettingsImpl implements GameSettings {
    private final String windowTitle = "Sword Song";
    private final int windowWidth = 1616;
    private final int windowHeight = 912;

    @Override
    public String getWindowTitle() {
        return windowTitle;
    }

    @Override
    public int getWindowWidth() {
        return windowWidth;
    }

    @Override
    public int getWindowHeight() {
        return windowHeight;
    }
}
