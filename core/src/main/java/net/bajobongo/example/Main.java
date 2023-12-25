package net.bajobongo.example;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import net.snowyhollows.bento.Bento;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class Main extends ApplicationAdapter {

    private Scene scene;

    @Override
    public void create() {
        scene = Bento.createRoot().get(SceneFactory.IT);
    }

    @Override
    public void render() {
        scene.render();
    }

    @Override
    public void dispose() {
        scene.dispose();
    }
}
