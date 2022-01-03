package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class MyTestGame extends ApplicationAdapter {
	private SpriteBatch batch;
	private Ball ball = new Ball();
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		ball.init();
	}

	@Override
	public void render () {
		processInput();
		updateLogic();
		draw();
	}
	
	private void draw() {
		ScreenUtils.clear(1, 1, 1, 1);
		batch.begin();
		ball.draw(batch);
		batch.end();
	}

	private void updateLogic() {
		ball.update(1/60f);
	}

	private void processInput() {
	}

	@Override
	public void dispose () {
		batch.dispose();
		ball.dispose();
	}
}
