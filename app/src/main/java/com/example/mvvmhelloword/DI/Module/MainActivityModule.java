package com.example.mvvmhelloword.DI.Module;

import com.example.mvvmhelloword.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public interface MainActivityModule {

//Данная аннотация служит для генерации AndroidInjector для MainActivity
    @ContributesAndroidInjector
    abstract MainActivity contributesMainActivity();

}