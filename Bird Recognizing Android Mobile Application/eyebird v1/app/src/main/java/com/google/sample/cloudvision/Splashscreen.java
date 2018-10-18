package com.google.sample.cloudvision;

import android.content.Intent;

import com.daimajia.androidanimations.library.Techniques;
import com.viksaa.sssplash.lib.activity.AwesomeSplash;
import com.viksaa.sssplash.lib.cnst.Flags;
import com.viksaa.sssplash.lib.model.ConfigSplash;

public class Splashscreen extends AwesomeSplash
{
    
    
    @Override
    public void initSplash(ConfigSplash configSplash) {
        /* you don't have to override every property */
    
        //Customize Circular Reveal
        configSplash.setBackgroundColor(R.color.app_launch_color); //any color you want form colors.xml
        configSplash.setAnimCircularRevealDuration(2000); //int ms
        configSplash.setRevealFlagX(Flags.REVEAL_RIGHT);  //or Flags.REVEAL_LEFT
        configSplash.setRevealFlagY(Flags.REVEAL_BOTTOM); //or Flags.REVEAL_TOP
    
        //Choose LOGO OR PATH; if you don't provide String value for path it's logo by default
    
        //Customize Logo
        configSplash.setLogoSplash(R.mipmap.ic_launcher); //or any other drawable
        configSplash.setAnimLogoSplashDuration(2000); //int ms
        configSplash.setAnimLogoSplashTechnique(Techniques.Bounce); //choose one form Techniques (ref: https://github.com/daimajia/AndroidViewAnimations)
    
    
        //Customize Path
        configSplash.setOriginalHeight(400); //in relation to your svg (path) resource
        configSplash.setOriginalWidth(400); //in relation to your svg (path) resource
        configSplash.setAnimPathStrokeDrawingDuration(3000);
        configSplash.setPathSplashStrokeSize(3); //I advise value be <5
        configSplash.setPathSplashStrokeColor(R.color.strokeColor); //any color you want form colors.xml
        configSplash.setAnimPathFillingDuration(3000);
        configSplash.setPathSplashFillColor(R.color.strokeColor); //path object filling color
    
    
        //Customize Title
        configSplash.setTitleSplash("EyeBird");
        configSplash.setTitleTextColor(R.color.strokeColor);
        configSplash.setTitleTextSize(30f); //float value
        configSplash.setAnimTitleDuration(3000);
        configSplash.setAnimTitleTechnique(Techniques.FadeIn);
    
    }
    
    @Override
    public void animationsFinished() {
    
        Intent intent = new Intent(this, MainActivity.class);
        
        startActivity(intent);
        
        finish();
        
    }
}