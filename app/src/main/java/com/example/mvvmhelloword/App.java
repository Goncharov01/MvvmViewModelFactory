package com.example.mvvmhelloword;

import android.app.Activity;
import android.app.Application;

import com.example.mvvmhelloword.DI.Component.DaggerMyComponent;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;

public class App extends Application implements HasActivityInjector {

    @Inject
    //DispatchingAndroidInjector нужен для поиска AndroidInector для конкретного Activity.
     DispatchingAndroidInjector<Activity> dispatchingAndroidInjector;
    @Override
    public void onCreate() {
        super.onCreate();
        DaggerMyComponent.builder().application(this).build().inject(this);
    }

    @Override
    public AndroidInjector<Activity> activityInjector() {

        return dispatchingAndroidInjector;
    }

}
