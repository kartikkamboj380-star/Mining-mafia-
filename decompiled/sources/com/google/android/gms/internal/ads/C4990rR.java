package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.rR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4990rR implements InterfaceC2180Od0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f32898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C2703Yf f32899b;

    C4990rR(C2703Yf c2703Yf, Map map) {
        this.f32898a = map;
        this.f32899b = c2703Yf;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2180Od0
    public final void K(EnumC1817Hd0 enumC1817Hd0, String str) {
        Map map = this.f32898a;
        if (map.containsKey(enumC1817Hd0)) {
            this.f32899b.c(((C4865qR) map.get(enumC1817Hd0)).f32630a);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2180Od0
    public final void N(EnumC1817Hd0 enumC1817Hd0, String str) {
        Map map = this.f32898a;
        if (map.containsKey(enumC1817Hd0)) {
            this.f32899b.c(((C4865qR) map.get(enumC1817Hd0)).f32631b);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2180Od0
    public final void j(EnumC1817Hd0 enumC1817Hd0, String str, Throwable th) {
        Map map = this.f32898a;
        if (map.containsKey(enumC1817Hd0)) {
            this.f32899b.c(((C4865qR) map.get(enumC1817Hd0)).f32632c);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2180Od0
    public final void u(EnumC1817Hd0 enumC1817Hd0, String str) {
    }
}
