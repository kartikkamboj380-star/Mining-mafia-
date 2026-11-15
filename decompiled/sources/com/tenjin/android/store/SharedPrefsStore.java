package com.tenjin.android.store;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.tenjin.android.config.TenjinConsts;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class SharedPrefsStore implements DataStore {
    private final SharedPreferences settings;

    public SharedPrefsStore(Context context) {
        this.settings = context.getSharedPreferences(TenjinConsts.INSTALL_PREFERENCE, 0);
    }

    @Override // com.tenjin.android.store.DataStore
    public void clear() {
        this.settings.edit().clear().apply();
    }

    @Override // com.tenjin.android.store.DataStore
    public boolean contains(String str) {
        return this.settings.contains(str);
    }

    @Override // com.tenjin.android.store.DataStore
    public Map<String, ?> getAll() {
        return this.settings.getAll();
    }

    @Override // com.tenjin.android.store.DataStore
    public boolean getBoolean(String str, boolean z9) {
        try {
            return this.settings.getBoolean(str, z9);
        } catch (ClassCastException e10) {
            Log.e("Tenjin", "Tried to retrieve value from shared prefs but got " + e10.getLocalizedMessage());
            return z9;
        }
    }

    @Override // com.tenjin.android.store.DataStore
    public float getFloat(String str, float f10) {
        try {
            return this.settings.getFloat(str, f10);
        } catch (ClassCastException e10) {
            Log.e("Tenjin", "Tried to retrieve value from shared prefs but got " + e10.getLocalizedMessage());
            return f10;
        }
    }

    @Override // com.tenjin.android.store.DataStore
    public int getInt(String str, int i10) {
        try {
            return this.settings.getInt(str, i10);
        } catch (ClassCastException e10) {
            Log.e("Tenjin", "Tried to retrieve value from shared prefs but got " + e10.getLocalizedMessage());
            return i10;
        }
    }

    @Override // com.tenjin.android.store.DataStore
    public long getLong(String str, long j10) {
        try {
            Log.d("Tenjin", "str is " + this.settings.getString(str, ""));
            return this.settings.getLong(str, j10);
        } catch (ClassCastException e10) {
            Log.e("Tenjin", "Tried to retrieve value from shared prefs but got " + e10.getLocalizedMessage());
            return j10;
        }
    }

    @Override // com.tenjin.android.store.DataStore
    public String getString(String str, String str2) {
        try {
            return this.settings.getString(str, str2);
        } catch (ClassCastException e10) {
            Log.e("Tenjin", "Tried to retrieve value from shared prefs but got " + e10.getLocalizedMessage());
            return str2;
        }
    }

    @Override // com.tenjin.android.store.DataStore
    public void putBoolean(String str, boolean z9) {
        this.settings.edit().putBoolean(str, z9).apply();
    }

    @Override // com.tenjin.android.store.DataStore
    public void putFloat(String str, float f10) {
        this.settings.edit().putFloat(str, f10).apply();
    }

    @Override // com.tenjin.android.store.DataStore
    public void putInt(String str, int i10) {
        this.settings.edit().putInt(str, i10).apply();
    }

    @Override // com.tenjin.android.store.DataStore
    public void putLong(String str, long j10) {
        this.settings.edit().putLong(str, j10).apply();
    }

    @Override // com.tenjin.android.store.DataStore
    public void putString(String str, String str2) {
        this.settings.edit().putString(str, str2).apply();
    }

    @Override // com.tenjin.android.store.DataStore
    public void remove(String str) {
        this.settings.edit().remove(str).apply();
    }
}
