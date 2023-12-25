package net.bajobongo.example;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import net.snowyhollows.bento.annotation.WithFactory;

public class Scene extends ApplicationAdapter {

    private final MySpriteBatch batch;
    private final ExampleTexture image;
    private final EnterpriseScreenClearingService enterpriseScreenClearingService;

    @WithFactory
    public Scene(MySpriteBatch mySpriteBatch, ExampleTexture exampleTexture, EnterpriseScreenClearingService enterpriseScreenClearingService) {
        this.batch = mySpriteBatch;
        this.image = exampleTexture;

        this.enterpriseScreenClearingService = enterpriseScreenClearingService;
    }

    @Override
    public void render() {
        enterpriseScreenClearingService.clearScreen();

        batch.begin();
        batch.draw(image, 140, 210);
        batch.end();
    }
}
