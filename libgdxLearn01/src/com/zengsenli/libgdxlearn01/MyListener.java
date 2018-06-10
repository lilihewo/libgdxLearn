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

	private SpriteBatch spriteBatch; // ��������
	private Sprite mSprite; // ����
	private Texture mTexture; // ����
	private BitmapFont mBitmapFont; // ͼƬ����
	
	// ����һ��Stage
	private Stage stage; // ��̨
	private FirstActor firstActor; // ��Ա
	private NarrowButton button; // ��ť
	
	@Override
	public void create() {
		// ʵ������������
		spriteBatch = new SpriteBatch();
		
		// ʵ�������� 
		mTexture = new Texture(Gdx.files.internal("badlogic.jpg"));
		
		// ʵ��������
		mSprite = new Sprite(mTexture);
		mSprite.setPosition(100, 100); // ���þ����λ��
		
		// ʵ����ͼƬ����
		mBitmapFont = new BitmapFont(Gdx.files.internal("my.fnt"), Gdx.files.internal("my.png"), false);
		
		
		// ʵ����Stage
		stage = new Stage(Gdx.graphics.getWidth(), Gdx.graphics.getHeight(),
				true);
		
		// ʵ����FirstActor��NarrowButton
		firstActor = new FirstActor("renwu"); // ʵ����FirstActor
		button = new NarrowButton("narrow"); // ʵ����NarrowButton
		
		// �����߼�����̨��
		stage.addActor(firstActor); // ����Ա������̨
		stage.addActor(button); // ����ť������̨
		// ����������ӦΪStage
		Gdx.input.setInputProcessor(stage);
	}

	@Override
	public void dispose() {
		// ���� dispose
		stage.dispose();
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub

	}

	@Override
	public void render() {
//		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT); // ����
//		
//		spriteBatch.begin();
//		// ��ʾ֡��
//		mBitmapFont.draw(spriteBatch, "FPS" + Gdx.graphics.getFramesPerSecond(), 5, Gdx.graphics.getHeight() - 10); 
//		
//		mBitmapFont.draw(spriteBatch, "love�ҵ���Ϸ", 50, 50);
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
