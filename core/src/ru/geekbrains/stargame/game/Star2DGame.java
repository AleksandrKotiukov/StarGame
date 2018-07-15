package ru.geekbrains.stargame.game;

import com.badlogic.gdx.Game;

import ru.geekbrains.stargame.screen.MenuScreen;

/**
 * Основной игровой класс
 */

public class Star2DGame extends Game {
    @Override
    public void create() {
        setScreen(new MenuScreen(this));
    }
}
