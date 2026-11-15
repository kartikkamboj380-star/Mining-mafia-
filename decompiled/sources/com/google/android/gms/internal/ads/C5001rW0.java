package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.rW0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5001rW0 extends Exception {
    public C5001rW0(long j10, long j11) {
        StringBuilder sb = new StringBuilder(String.valueOf(j11).length() + 63 + String.valueOf(j10).length());
        sb.append("Unexpected audio track timestamp discontinuity: expected ");
        sb.append(j11);
        sb.append(", got ");
        sb.append(j10);
        super(sb.toString());
    }
}
