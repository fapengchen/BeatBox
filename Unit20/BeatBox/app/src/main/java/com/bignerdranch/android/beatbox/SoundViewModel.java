package com.bignerdranch.android.beatbox;

import androidx.databinding.BaseObservable;

public class SoundViewModel extends BaseObservable {
    private BeatBox mBeatBox;
    private Sound mSound;

    public SoundViewModel(BeatBox beatBox){
        mBeatBox = beatBox;
    }

    public Sound getSound() {
        return mSound;
    }

    public void setSound(Sound sound) {
        mSound = sound;
        notifyChange();
    }

    public String getTitle(){
        return mSound.getName();
    }
}
