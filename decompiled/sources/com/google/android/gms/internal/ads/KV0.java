package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class KV0 extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f20211b;

    public KV0(int i10, boolean z9) {
        StringBuilder sb = new StringBuilder(String.valueOf(i10).length() + 26);
        sb.append("AudioOutput write failed: ");
        sb.append(i10);
        super(sb.toString());
        this.f20211b = z9;
        this.f20210a = i10;
    }
}
