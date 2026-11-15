package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.r2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C6618r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f38334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f38335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bundle f38336d;

    public C6618r2(String str, String str2, Bundle bundle, long j10) {
        this.f38333a = str;
        this.f38334b = str2;
        this.f38336d = bundle;
        this.f38335c = j10;
    }

    public static C6618r2 a(G g10) {
        return new C6618r2(g10.f37527a, g10.f37529c, g10.f37528b.N(), g10.f37530d);
    }

    public final G b() {
        return new G(this.f38333a, new E(new Bundle(this.f38336d)), this.f38334b, this.f38335c);
    }

    public final String toString() {
        String str = this.f38334b;
        String string = this.f38336d.toString();
        int length = String.valueOf(str).length();
        String str2 = this.f38333a;
        StringBuilder sb = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + string.length());
        sb.append("origin=");
        sb.append(str);
        sb.append(",name=");
        sb.append(str2);
        sb.append(",params=");
        sb.append(string);
        return sb.toString();
    }
}
