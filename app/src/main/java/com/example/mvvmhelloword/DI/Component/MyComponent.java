package com.example.mvvmhelloword.DI.Component;

import android.app.Application;

import com.example.mvvmhelloword.App;
import com.example.mvvmhelloword.DI.Module.MainActivityModule;
import com.example.mvvmhelloword.DI.Module.MainModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component(modules = {AndroidSupportInjectionModule.class, MainActivityModule.class, MainModule.class})
public interface MyComponent {
    @Component.Builder
    interface Builder{
        @BindsInstance
        Builder application(Application application);
        MyComponent build();
    }
    void inject(App app);


}
