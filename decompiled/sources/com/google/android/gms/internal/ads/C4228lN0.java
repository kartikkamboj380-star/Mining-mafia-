package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.lN0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C4228lN0 extends Exception {
    C4228lN0(int i10, int i11) {
        StringBuilder sb = new StringBuilder(String.valueOf(i10).length() + 32 + String.valueOf(i11).length());
        sb.append("Unpaired surrogate at index ");
        sb.append(i10);
        sb.append(" of ");
        sb.append(i11);
        super(sb.toString());
    }
}
