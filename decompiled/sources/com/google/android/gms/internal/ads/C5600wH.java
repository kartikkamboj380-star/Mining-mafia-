package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.wH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5600wH {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f34504d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f34505e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f34506f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f34507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f34508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f34509c;

    static {
        String str = AbstractC4634ob0.f32117a;
        f34504d = Integer.toString(0, 36);
        f34505e = Integer.toString(1, 36);
        f34506f = Integer.toString(2, 36);
    }

    public C5600wH(int i10, int i11, int i12) {
        this.f34507a = i10;
        this.f34508b = i11;
        this.f34509c = i12;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(f34504d, this.f34507a);
        bundle.putInt(f34505e, this.f34508b);
        bundle.putInt(f34506f, this.f34509c);
        return bundle;
    }
}
