package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Ball implements IDrawable, IUpdateable, ILifeCycle {
	private Texture texture;
	private float x;
	private float y;
	private float xVel = 1;
	private float yVel = 1;

	@Override
	public void update(float delta) {
		x += xVel;
		y += yVel;
		
		if(Gdx.input.isKeyJustPressed(Input.Keys.SPACE)) {
			xVel = -xVel;
			yVel = -yVel;
		}
		
//		if(x > Gdx.graphics.getWidth()) {
//			
//		}
	}

	@Override
	public void init() {
		texture = new Texture("x.png");
	}

	@Override
	public void dispose() {
		texture.dispose();
	}

	@Override
	public void draw(SpriteBatch spriteBatch) {
		spriteBatch.draw(texture, x, y, 64, 64);
	}

}
