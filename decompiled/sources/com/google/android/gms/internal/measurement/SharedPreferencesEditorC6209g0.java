package com.google.android.gms.internal.measurement;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class SharedPreferencesEditorC6209g0 implements SharedPreferences.Editor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f36683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Set f36684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Map f36685c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ SharedPreferencesC6218h0 f36686d;

    /* synthetic */ SharedPreferencesEditorC6209g0(SharedPreferencesC6218h0 sharedPreferencesC6218h0, byte[] bArr) {
        Objects.requireNonNull(sharedPreferencesC6218h0);
        this.f36686d = sharedPreferencesC6218h0;
        this.f36683a = false;
        this.f36684b = new HashSet();
        this.f36685c = new HashMap();
    }

    private final void a(String str, Object obj) {
        if (obj != null) {
            this.f36685c.put(str, obj);
        } else {
            remove(str);
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
        commit();
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor clear() {
        this.f36683a = true;
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
        if (this.f36683a) {
            this.f36686d.a().clear();
        }
        SharedPreferencesC6218h0 sharedPreferencesC6218h0 = this.f36686d;
        Set set = this.f36684b;
        sharedPreferencesC6218h0.a().keySet().removeAll(set);
        Map map = this.f36685c;
        for (Map.Entry entry : map.entrySet()) {
            sharedPreferencesC6218h0.a().put((String) entry.getKey(), entry.getValue());
        }
        for (SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener : sharedPreferencesC6218h0.b()) {
            Y5.A it = Y5.x.c(set, map.keySet()).iterator();
            while (it.hasNext()) {
                onSharedPreferenceChangeListener.onSharedPreferenceChanged(sharedPreferencesC6218h0, (String) it.next());
            }
        }
        return (!this.f36683a && set.isEmpty() && map.isEmpty()) ? false : true;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putBoolean(String str, boolean z9) {
        a(str, Boolean.valueOf(z9));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putFloat(String str, float f10) {
        a(str, Float.valueOf(f10));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putInt(String str, int i10) {
        a(str, Integer.valueOf(i10));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putLong(String str, long j10) {
        a(str, Long.valueOf(j10));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putString(String str, String str2) {
        a(str, str2);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putStringSet(String str, Set set) {
        a(str, set);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor remove(String str) {
        this.f36684b.add(str);
        return this;
    }
}
