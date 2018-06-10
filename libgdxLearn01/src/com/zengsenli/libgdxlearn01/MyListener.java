package com.zengsenli.libgdxlearn01;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;

public class MyListener implements ApplicationListener {

	private SpriteBatch spriteBatch; // 批量精灵
	private Sprite mSprite; // 精灵
	private Texture mTexture; // 纹理
	private BitmapFont mBitmapFont; // 图片文字
	
	// 声明一个Stage
	private Stage stage; // 舞台
	private FirstActor firstActor; // 演员
	private NarrowButton button; // 按钮
	
	@Override
	public void create() {
		// 实例化批量精灵
		spriteBatch = new SpriteBatch();
		
		// 实例化纹理 
		mTexture = new Texture(Gdx.files.internal("badlogic.jpg"));
		
		// 实例化精灵
		mSprite = new Sprite(mTexture);
		mSprite.setPosition(100, 100); // 设置精灵的位置
		
		// 实例化图片文字
		mBitmapFont = new BitmapFont(Gdx.files.internal("my.fnt"), Gdx.files.internal("my.png"), false);
		
		
		// 实例化Stage
		stage = new Stage(Gdx.graphics.getWidth(), Gdx.graphics.getHeight(),
				true);
		
		// 实例化FirstActor和NarrowButton
		firstActor = new FirstActor("renwu"); // 实例化FirstActor
		button = new NarrowButton("narrow"); // 实例化NarrowButton
		
		// 将二者加入舞台中
		stage.addActor(firstActor); // 将演员加入舞台
		stage.addActor(button); // 将按钮加入舞台
		// 设置输入响应为Stage
		Gdx.input.setInputProcessor(stage);
	}

	@Override
	public void dispose() {
		// 部署 dispose
		stage.dispose();
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub

	}

	@Override
	public void render() {
//		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT); // 清屏
//		
//		spriteBatch.begin();
//		// 显示帧率
//		mBitmapFont.draw(spriteBatch, "FPS" + Gdx.graphics.getFramesPerSecond(), 5, Gdx.graphics.getHeight() - 10); 
//		
//		mBitmapFont.draw(spriteBatch, "love我的游戏", 50, 50);
//		
//		
//		mSprite.draw(spriteBatch);
//		
//		spriteBatch.end();
//		
		
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		stage.act(Gdx.graphics.getDeltaTime());
		stage.draw();
	}

	@Override
	public void resize(int arg0, int arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub

	}

}
