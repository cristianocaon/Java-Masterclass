package com.example.game;

import java.util.List;

public interface ISavable {
    void populate(List<String> values);
    List<String> save();
}
