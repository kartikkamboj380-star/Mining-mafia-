package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ci, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3138ci implements InterfaceC1464Aj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ SharedPreferences f27181a;

    C3138ci(SharedPreferencesOnSharedPreferenceChangeListenerC3641gi sharedPreferencesOnSharedPreferenceChangeListenerC3641gi, SharedPreferences sharedPreferences) {
        this.f27181a = sharedPreferences;
        Objects.requireNonNull(sharedPreferencesOnSharedPreferenceChangeListenerC3641gi);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1464Aj
    public final String a(String str, String str2) {
        return this.f27181a.getString(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1464Aj
    public final Long b(String str, long j10) {
        try {
            return Long.valueOf(this.f27181a.getLong(str, j10));
        } catch (ClassCastException unused) {
            return Long.valueOf(this.f27181a.getInt(str, (int) j10));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1464Aj
    public final Double c(String str, double d10) {
        try {
            return Double.valueOf(this.f27181a.getFloat(str, (float) d10));
        } catch (ClassCastException unused) {
            return Double.valueOf(this.f27181a.getString(str, String.valueOf(d10)));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1464Aj
    public final Boolean d(String str, boolean z9) {
        try {
            return Boolean.valueOf(this.f27181a.getBoolean(str, z9));
        } catch (ClassCastException unused) {
            return Boolean.valueOf(this.f27181a.getString(str, String.valueOf(z9)));
        }
    }
}
