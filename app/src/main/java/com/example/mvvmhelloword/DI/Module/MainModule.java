package com.example.mvvmhelloword.DI.Module;

import com.example.mvvmhelloword.Model;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class MainModule {
    @Singleton
    @Provides
    public Model getModel(){
        return new Model();
    }

}
