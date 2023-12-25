package net.bajobongo.example;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import net.snowyhollows.bento.annotation.WithFactory;

public class EnterpriseScreenClearingService {

    @WithFactory
    public EnterpriseScreenClearingService() {
    }

    public void clearScreen() {
        Gdx.gl.glClearColor(0.15f, 0.15f, 0.2f, 1f);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
    }
}
