package com.example.ryoji.helloopengl;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class GameSurfaceView extends GLSurfaceView {

    private static final int OPENGL_ES_VERSION = 2;

    public GameSurfaceView(Context context) {
        super(context);


        setEGLContextClientVersion(OPENGL_ES_VERSION);
        setRenderer(new GameRenderer());
        setRenderMode(RENDERMODE_CONTINUOUSLY);
    }
}