package core;

import core.state.*;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class Main extends StateBasedGame {
    public static final int FRAMES_PER_SECOND = 60;
    private static AppGameContainer appgc;

    public static final int MAIN_MENU_ID = 0;
    public static final int BASIC_SYNTHESIS_STATE = 1;

    private BasicGameState mainMenuState;
    private BasicGameState basicSynthesisState;

    public Main(String name) {
        super(name);

        mainMenuState = new MainMenuState(MAIN_MENU_ID);
        basicSynthesisState = new BasicSynthesisState(BASIC_SYNTHESIS_STATE);
    }

    public static int getScreenWidth() {
        return appgc.getScreenWidth();
    }

    public static int getScreenHeight() {
        return appgc.getScreenHeight();
    }

    public void initStatesList(GameContainer gc) throws SlickException {
        addState(mainMenuState);
        addState(basicSynthesisState);
    }

    public static void main(String[] args) {
        try {
            appgc = new AppGameContainer(new Main("Sequence Simulator 280"));
            System.setProperty("org.lwjgl.opengl.Window.undecorated", "true");

            appgc.setDisplayMode(appgc.getScreenWidth(), appgc.getScreenHeight(), false);
            appgc.setTargetFrameRate(FRAMES_PER_SECOND);
            appgc.setVSync(true);
            appgc.start();

        }
        catch (SlickException e) {
            e.printStackTrace();
        }
    }
}