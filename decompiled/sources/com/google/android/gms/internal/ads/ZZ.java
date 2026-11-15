package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
final class ZZ {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f26235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f26236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f26237c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    long f26238d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final Integer f26239e;

    ZZ(String str, String str2, int i10, long j10, Integer num) {
        this.f26235a = str;
        this.f26236b = str2;
        this.f26237c = i10;
        this.f26238d = j10;
        this.f26239e = num;
    }

    public final String toString() {
        Integer num;
        String str = this.f26235a;
        int i10 = this.f26237c;
        long j10 = this.f26238d;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(i10).length() + 1 + String.valueOf(j10).length());
        sb.append(str);
        sb.append(".");
        sb.append(i10);
        sb.append(".");
        sb.append(j10);
        String string = sb.toString();
        String str2 = this.f26236b;
        if (!TextUtils.isEmpty(str2)) {
            StringBuilder sb2 = new StringBuilder(string.length() + 1 + String.valueOf(str2).length());
            sb2.append(string);
            sb2.append(".");
            sb2.append(str2);
            string = sb2.toString();
        }
        if (!((Boolean) H4.B.c().d(AbstractC3892ii.f29850i2)).booleanValue() || (num = this.f26239e) == null || TextUtils.isEmpty(str2)) {
            return string;
        }
        StringBuilder sb3 = new StringBuilder(string.length() + 1 + num.toString().length());
        sb3.append(string);
        sb3.append(".");
        sb3.append(num);
        return sb3.toString();
    }
}
