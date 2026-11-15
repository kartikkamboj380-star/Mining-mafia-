package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Lo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2047Lo0 extends RuntimeException {
    public C2047Lo0(int i10) {
        StringBuilder sb = new StringBuilder(String.valueOf(i10).length() + 3);
        sb.append("r: ");
        sb.append(i10);
        super(sb.toString());
    }

    public C2047Lo0(int i10, Throwable th) {
        super("r: 2", th);
    }
}
