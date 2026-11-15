package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ih0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3891ih0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1875Ig0 f29497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList f29498b;

    public C3891ih0(C1875Ig0 c1875Ig0, String str) {
        ArrayList arrayList = new ArrayList();
        this.f29498b = arrayList;
        this.f29497a = c1875Ig0;
        arrayList.add(str);
    }

    public final void a(String str) {
        this.f29498b.add(str);
    }

    public final C1875Ig0 b() {
        return this.f29497a;
    }

    public final ArrayList c() {
        return this.f29498b;
    }
}
