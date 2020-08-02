package com.example.mvvmhelloword;

import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;

import androidx.databinding.BindingAdapter;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;


public class LoginViewModel extends ViewModel {

    Model model;

    public LoginViewModel(Model model) {
        this.model = model;
    }

    //    private View.OnFocusChangeListener onFocusEmail;
//
//    public LoginViewModel(final Model model) {
//        this.model = model;
//
//        onFocusEmail = new View.OnFocusChangeListener() {
//            @Override
//            public void onFocusChange(View v, boolean hasFocus) {
//                EditText editText = (EditText) v;
//                if(editText.length() <0 ){
//                    model.setEditText(editText.toString());
//                    System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@" + editText.toString());
//                }
//            }
//        };
//    }

    public MutableLiveData<String> name = new MutableLiveData<>();
    public MutableLiveData<String> number = new MutableLiveData<>();
    public MutableLiveData<String> oldData = new MutableLiveData<>();

    public void onClick() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                name.setValue(oldData.getValue());
                number.setValue(model.getNumber());
            }
        }, 3000);

    }

    private MutableLiveData<Model> modelMutableLiveData;

    LiveData<Model> getModel() {
        modelMutableLiveData = new MutableLiveData<>();
        return modelMutableLiveData;
    }

//    public View.OnFocusChangeListener getOnFocusEmail() {
//        return onFocusEmail;
//    }
//
//    @BindingAdapter("onFocus")
//    public static void bindFocusChange(EditText editText, View.OnFocusChangeListener onFocusChangeListener) {
//        if (editText.getOnFocusChangeListener() == null) {
//            editText.setOnFocusChangeListener(onFocusChangeListener);
//        }
//    }

    @BindingAdapter("android:watcher")
    public static void bindTextWatcher(EditText pEditText,CharSequence s) {
        pEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

}
