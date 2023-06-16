package com.example.knowledgeninja;

public class Menu {
    View popupTriggerView = findViewById(R.id.your_trigger_view);

    popupTriggerView.setOnClickListener(v -> showPopupMenu(v));
}
