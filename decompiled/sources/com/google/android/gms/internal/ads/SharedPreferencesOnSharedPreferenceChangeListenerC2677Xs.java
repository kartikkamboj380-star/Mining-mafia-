package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Xs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class SharedPreferencesOnSharedPreferenceChangeListenerC2677Xs implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f25397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2909at f25398b;

    public SharedPreferencesOnSharedPreferenceChangeListenerC2677Xs(C2909at c2909at, String str) {
        Objects.requireNonNull(c2909at);
        this.f25398b = c2909at;
        this.f25397a = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        C2909at c2909at = this.f25398b;
        synchronized (c2909at) {
            try {
                Iterator it = c2909at.d().iterator();
                while (it.hasNext()) {
                    ((InterfaceC2729Ys) it.next()).a(sharedPreferences, this.f25397a, str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
