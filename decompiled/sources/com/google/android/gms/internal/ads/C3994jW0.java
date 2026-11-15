package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.jW0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3994jW0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SparseBooleanArray f30478a = new SparseBooleanArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f30479b;

    public final C3994jW0 a(int i10) {
        AbstractC2418Ss0.i(!this.f30479b);
        this.f30478a.append(i10, true);
        return this;
    }

    public final KW0 b() {
        AbstractC2418Ss0.i(!this.f30479b);
        this.f30479b = true;
        return new KW0(this.f30478a, null);
    }
}
