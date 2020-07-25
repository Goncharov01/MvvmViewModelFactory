package com.example.mvvmhelloword;

import android.os.Handler;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class LoginViewModel extends ViewModel {

    Model model;

    public LoginViewModel(Model model) {
        this.model = model;
    }

    public MutableLiveData<String> name = new MutableLiveData<>();
    public MutableLiveData<String> number = new MutableLiveData<>();


    public void onClick(){
       new Handler().postDelayed(new Runnable() {
           @Override
           public void run() {
               name.setValue(model.getName());
               number.setValue(model.getNumber());
           }
       },3000);

    }

    private MutableLiveData<Model> modelMutableLiveData;

        LiveData<Model> getModel(){
            modelMutableLiveData = new MutableLiveData<>();
            return modelMutableLiveData;
        }



}
