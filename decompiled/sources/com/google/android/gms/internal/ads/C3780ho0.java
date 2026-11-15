package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ho0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3780ho0 extends RuntimeException {
    C3780ho0(int i10) {
        StringBuilder sb = new StringBuilder(String.valueOf(i10).length() + 3);
        sb.append("r: ");
        sb.append(i10);
        super(sb.toString());
    }
}
