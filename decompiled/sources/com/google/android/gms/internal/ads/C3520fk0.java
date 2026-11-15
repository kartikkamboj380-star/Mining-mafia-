package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.fk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3520fk0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static C3520fk0 f28465c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f28466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SharedPreferences f28467b;

    private C3520fk0(Context context) {
        this.f28466a = context.getPackageName();
        this.f28467b = context.getSharedPreferences("paid_storage_sp", 0);
    }

    static C3520fk0 a(Context context) {
        if (f28465c == null) {
            f28465c = new C3520fk0(context);
        }
        return f28465c;
    }

    final void b(String str, Object obj) throws IOException {
        boolean zCommit;
        if (obj instanceof String) {
            zCommit = this.f28467b.edit().putString(str, (String) obj).commit();
        } else if (obj instanceof Long) {
            zCommit = this.f28467b.edit().putLong(str, ((Long) obj).longValue()).commit();
        } else {
            if (!(obj instanceof Boolean)) {
                if (obj instanceof Integer) {
                    zCommit = this.f28467b.edit().putInt(str, ((Integer) obj).intValue()).commit();
                } else {
                    String strValueOf = String.valueOf(obj.getClass());
                    String str2 = this.f28466a;
                    StringBuilder sb = new StringBuilder(strValueOf.length() + 33 + String.valueOf(str2).length());
                    sb.append("Unexpected object class ");
                    sb.append(strValueOf);
                    sb.append(" for app ");
                    sb.append(str2);
                    Log.e("GpidLifecycleSPHandler", sb.toString());
                }
                String str3 = this.f28466a;
                StringBuilder sb2 = new StringBuilder(str.length() + 25 + String.valueOf(str3).length());
                sb2.append("Failed to store ");
                sb2.append(str);
                sb2.append(" for app ");
                sb2.append(str3);
                throw new IOException(sb2.toString());
            }
            zCommit = this.f28467b.edit().putBoolean(str, ((Boolean) obj).booleanValue()).commit();
        }
        if (zCommit) {
            return;
        }
        String str4 = this.f28466a;
        StringBuilder sb3 = new StringBuilder(str.length() + 25 + String.valueOf(str4).length());
        sb3.append("Failed to store ");
        sb3.append(str);
        sb3.append(" for app ");
        sb3.append(str4);
        throw new IOException(sb3.toString());
    }

    final String c(String str, String str2) {
        return this.f28467b.getString(str, null);
    }

    final long d(String str, long j10) {
        return this.f28467b.getLong(str, -1L);
    }

    final boolean e(String str, boolean z9) {
        return this.f28467b.getBoolean(str, true);
    }

    final void f(String str) throws IOException {
        if (this.f28467b.edit().remove(str).commit()) {
            return;
        }
        String str2 = this.f28466a;
        StringBuilder sb = new StringBuilder(str.length() + 26 + String.valueOf(str2).length());
        sb.append("Failed to remove ");
        sb.append(str);
        sb.append(" for app ");
        sb.append(str2);
        throw new IOException(sb.toString());
    }

    final boolean g(String str) {
        return this.f28467b.contains(str);
    }
}
