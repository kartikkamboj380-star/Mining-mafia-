package com.google.android.gms.internal.ads;

import K4.InterfaceC0790q0;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.tA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5208tA implements InterfaceC4705pA {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC0790q0 f33358a;

    public C5208tA(InterfaceC0790q0 interfaceC0790q0) {
        this.f33358a = interfaceC0790q0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4705pA
    public final void a(Map map) {
        this.f33358a.N(Boolean.parseBoolean((String) map.get("content_vertical_opted_out")));
    }
}
