package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6236j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ThreadLocal f36720a = new C6227i0();

    public static SharedPreferences a(Context context, String str, int i10, AbstractC6191e0 abstractC6191e0) {
        Y.a();
        SharedPreferencesC6218h0 sharedPreferencesC6218h0 = str.equals("") ? new SharedPreferencesC6218h0() : null;
        if (sharedPreferencesC6218h0 != null) {
            return sharedPreferencesC6218h0;
        }
        ThreadLocal threadLocal = f36720a;
        X5.j.d(((Boolean) threadLocal.get()).booleanValue());
        threadLocal.set(Boolean.FALSE);
        try {
            return context.getSharedPreferences(str, 0);
        } finally {
            f36720a.set(Boolean.TRUE);
        }
    }
}
