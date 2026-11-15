package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Yh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2708Yh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25684a;

    public static String a(int i10) {
        char c10 = (char) ((i10 >> 24) & 255);
        int length = String.valueOf(c10).length();
        char c11 = (char) ((i10 >> 16) & 255);
        int length2 = String.valueOf(c11).length();
        char c12 = (char) ((i10 >> 8) & 255);
        char c13 = (char) (i10 & 255);
        StringBuilder sb = new StringBuilder(length + length2 + String.valueOf(c12).length() + String.valueOf(c13).length());
        sb.append(c10);
        sb.append(c11);
        sb.append(c12);
        sb.append(c13);
        return sb.toString();
    }

    public String toString() {
        return a(this.f25684a);
    }
}
