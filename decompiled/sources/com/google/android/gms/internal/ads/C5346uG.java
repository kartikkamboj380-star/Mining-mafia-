package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.uG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5346uG {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f33759c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f33760d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f33762b;

    static {
        String str = AbstractC4634ob0.f32117a;
        f33759c = Integer.toString(0, 36);
        f33760d = Integer.toString(1, 36);
    }

    public C5346uG(String str, int i10) {
        this.f33761a = str;
        this.f33762b = i10;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString(f33759c, this.f33761a);
        bundle.putInt(f33760d, this.f33762b);
        return bundle;
    }
}
