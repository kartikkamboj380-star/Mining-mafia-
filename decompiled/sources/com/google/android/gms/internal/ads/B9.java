package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public abstract class B9 extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f17516b;

    static {
        String str = AbstractC4634ob0.f32117a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
    }

    protected B9(String str, Throwable th, int i10, Bundle bundle, long j10) {
        super(str, th);
        this.f17515a = i10;
        this.f17516b = j10;
    }
}
