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
	private boolean spacePressedLastFrame;

	@Override
	public void update(float delta) {
		x += xVel;
		y += yVel;
		
		boolean spacePressed = Gdx.input.isButtonPressed(Input.Keys.SPACE);
		if(spacePressed && !spacePressedLastFrame) {
			xVel = -xVel;
			yVel = -yVel;
		}
		spacePressedLastFrame = spacePressed;
		
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
