package com.zengsenli.libgdxlearn01;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Actor;


public class FirstActor extends Actor {
	
	private Texture texture;
	
	public FirstActor(String name) {
		super();
		this.setName(name);
		Texture.setEnforcePotImages(false);
		texture = new Texture(Gdx.files.internal("hero.gif"));
		this.setWidth(texture.getWidth());
		this.setHeight(texture.getHeight());
		this.setPosition(100, 100);
	}
	
	@Override
	public void draw(SpriteBatch batch,float parentAlpha) {
		batch.draw(texture,this.getX(),this.getY());
	}
	
	@Override
	public Actor hit(float x, float y, boolean touchable) {
		if (x >0 && y >0 &&this.getHeight() > y &&this.getWidth() > x) {
			return this;
		}else {
			return null;
		}
	} 
}
