package net.bajobongo.example;

import com.badlogic.gdx.graphics.Texture;
import net.snowyhollows.bento.annotation.WithFactory;

public class ExampleTexture extends Texture {
    @WithFactory
    public ExampleTexture() {
        super("libgdx.png");
    }
}
