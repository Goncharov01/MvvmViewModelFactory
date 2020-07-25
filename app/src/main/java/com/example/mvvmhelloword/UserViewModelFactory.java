package com.example.mvvmhelloword;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

public class UserViewModelFactory implements ViewModelProvider.Factory {

    Model model;

    public UserViewModelFactory(Model model) {
        this.model = model;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {

        if (modelClass.isAssignableFrom(LoginViewModel.class)){
            return (T) new LoginViewModel(model);
        }
        else {
            throw  new IllegalArgumentException("Unknown class");
        }

    }


}
