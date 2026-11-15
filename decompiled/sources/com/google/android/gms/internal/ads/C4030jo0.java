package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.jo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C4030jo0 extends RuntimeException {
    C4030jo0(int i10) {
        StringBuilder sb = new StringBuilder(String.valueOf(i10).length() + 3);
        sb.append("r: ");
        sb.append(i10);
        super(sb.toString());
    }
}
