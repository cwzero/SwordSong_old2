package com.liquidforte.sword.game.main;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.liquidforte.phantasia.api.engine.Engine;
import com.liquidforte.phantasia.inject.engine.EngineModule;
import com.liquidforte.phantasia.inject.render.RenderModule;
import com.liquidforte.sword.inject.game.GameModule;

public class Main {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new EngineModule(), new RenderModule(), new GameModule());
        Engine engine = injector.getInstance(Engine.class);
        engine.start();
        engine.stop();
    }
}
