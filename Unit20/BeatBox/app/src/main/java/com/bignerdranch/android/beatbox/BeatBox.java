package com.bignerdranch.android.beatbox;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BeatBox {
    private static final String TAG = "BeatBox";
    private static final String SOUND_FOLDER = "sample_sounds";
    private AssetManager mAssets;

    private List<Sound> mSounds = new ArrayList<>();


    public BeatBox(Context context){
        mAssets = context.getAssets();
        loadSounds();
    }


    private void loadSounds(){
        String[] soundNames;

        try{
            soundNames = mAssets.list(SOUND_FOLDER);
            Log.i(TAG,"Found " + soundNames.length + " Sounds");
        }catch (IOException e){
            Log.d(TAG,"Could not list assets",e);
            return;
        }

        for (String fileName : soundNames){
            String assetPath = SOUND_FOLDER + "/" + fileName;
            Sound sound = new Sound(assetPath);
            mSounds.add(sound);
        }

    }
    public List<Sound> getSounds(){
        return mSounds;
    }
}
