package com.aim.aimwalls.activities;

import android.support.annotation.NonNull;

import com.dm.wallpaper.board.activities.WallpaperBoardMuzeiActivity;
import com.aim.aimwalls.services.MuzeiService;

public class MuzeiActivity extends WallpaperBoardMuzeiActivity {

    @NonNull
    @Override
    public Class<?> onInit() {
        return MuzeiService.class;
    }
}
