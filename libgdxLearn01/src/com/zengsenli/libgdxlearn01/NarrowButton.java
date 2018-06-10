package com.zengsenli.libgdxlearn01;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Event;

public class NarrowButton extends Actor{
	
	private Texture texture;
	
	public NarrowButton(String name) {
		super();
		this.setName(name);
		Texture.setEnforcePotImages(false);
		texture = new Texture(Gdx.files.internal("button.png"));
		this.setWidth(texture.getWidth());
		this.setHeight(texture.getHeight());
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
	
//	@Override
//	public boolean touchDown(float x,float y,int pointer) {
//		Actor actor =this.getParent().findActor("renwu");
//		actor.setX(actor.getX()+10);
//		return false;
//	}


	@Override
	public boolean notify(Event arg0, boolean arg1) {
		Actor actor =this.getParent().findActor("renwu");
		actor.setX(actor.getX()+1);
		System.out.println(actor.getX());
		return true;		
	}

}
