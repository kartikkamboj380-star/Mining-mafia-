package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.sQ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5115sQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f33160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f33161b;

    /* synthetic */ C5115sQ0(int i10, int i11, AbstractC4989rQ0 abstractC4989rQ0) {
        this.f33160a = AbstractC3354eQ0.a(i10);
        this.f33161b = AbstractC3354eQ0.a(i11);
    }

    public final C5115sQ0 a(InterfaceC4864qQ0 interfaceC4864qQ0) {
        this.f33160a.add(interfaceC4864qQ0);
        return this;
    }

    public final C5115sQ0 b(InterfaceC4864qQ0 interfaceC4864qQ0) {
        this.f33161b.add(interfaceC4864qQ0);
        return this;
    }

    public final C5241tQ0 c() {
        return new C5241tQ0(this.f33160a, this.f33161b, null);
    }
}
