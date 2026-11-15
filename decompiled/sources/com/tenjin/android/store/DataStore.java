package com.tenjin.android.store;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public interface DataStore {
    void clear();

    boolean contains(String str);

    Map<String, ?> getAll();

    boolean getBoolean(String str, boolean z9);

    float getFloat(String str, float f10);

    int getInt(String str, int i10);

    long getLong(String str, long j10);

    String getString(String str, String str2);

    void putBoolean(String str, boolean z9);

    void putFloat(String str, float f10);

    void putInt(String str, int i10);

    void putLong(String str, long j10);

    void putString(String str, String str2);

    void remove(String str);
}
