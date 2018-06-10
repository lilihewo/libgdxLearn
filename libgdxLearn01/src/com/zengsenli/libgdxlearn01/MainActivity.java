package com.zengsenli.libgdxlearn01;

import android.os.Bundle;

import com.badlogic.gdx.backends.android.AndroidApplication;

/**
 * libgdx-0.9.9
 * @author shiyang
 *
 */
public class MainActivity extends AndroidApplication {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initialize(new MyListener(), true);
    }
}
