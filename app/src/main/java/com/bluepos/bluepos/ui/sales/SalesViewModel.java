package com.bluepos.bluepos.ui.sales;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SalesViewModel extends ViewModel {
    private final MutableLiveData<String> mText;

    public SalesViewModel(){
        mText = new MutableLiveData<>();
        mText.setValue("This is Sale fragment");
    }
    public LiveData<String> getText() {
        return  mText;
    }
}
