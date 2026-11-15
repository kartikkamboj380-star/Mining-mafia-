package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.bi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3013bi {
    public static final SharedPreferences a(Context context) {
        try {
            return context.getSharedPreferences("google_adapter_flags", 0);
        } catch (IllegalStateException e10) {
            L4.p.g("", e10);
            return null;
        }
    }

    public static final SharedPreferences b(Context context) {
        try {
            return context.getSharedPreferences("google_ads_flags", 0);
        } catch (IllegalStateException e10) {
            L4.p.g("", e10);
            return null;
        }
    }
}
