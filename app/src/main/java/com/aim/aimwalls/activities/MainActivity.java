package com.aim.aimwalls.activities;

import android.support.annotation.NonNull;

import com.dm.wallpaper.board.activities.WallpaperBoardActivity;
import com.dm.wallpaper.board.activities.configurations.ActivityConfiguration;
import com.aim.aimwalls.licenses.License;

public class MainActivity extends WallpaperBoardActivity {

    @NonNull
    @Override
    public ActivityConfiguration onInit() {
        return new ActivityConfiguration()
                .setLicenseCheckerEnabled(License.isLicenseCheckerEnabled())
                .setLicenseKey(License.getLicenseKey())
                .setRandomString(License.getRandomString())
                .setDonationProductsId(License.getDonationProductsId());
    }
}
