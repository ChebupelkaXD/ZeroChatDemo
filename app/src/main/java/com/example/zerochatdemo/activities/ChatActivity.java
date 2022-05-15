package com.example.zerochatdemo.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.zerochatdemo.R;
import com.example.zerochatdemo.databinding.ActivityChatBinding;
import com.example.zerochatdemo.models.User;
import com.example.zerochatdemo.utilities.Constants;

public class ChatActivity extends AppCompatActivity {
    private ActivityChatBinding binding;
    private User receieverUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityChatBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setListeners();
        loadReceiverDetails();
    }

    private void loadReceiverDetails() {
        receieverUser = (User) getIntent().getSerializableExtra(Constants.KEY_USER);
        binding.textName.setText(receieverUser.name);
    }

    private void setListeners() {
        binding.imageBack.setOnClickListener(v -> onBackPressed());
    }
}