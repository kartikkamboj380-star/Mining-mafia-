package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ay, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1494Ay extends Exception {
    public C1494Ay(String str, C5558vx c5558vx) {
        String strValueOf = String.valueOf(c5558vx);
        StringBuilder sb = new StringBuilder(str.length() + 1 + strValueOf.length());
        sb.append(str);
        sb.append(" ");
        sb.append(strValueOf);
        super(sb.toString());
    }
}
