package com.google.android.gms.internal.ads;

import K4.InterfaceC0790q0;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.rA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4956rA implements InterfaceC4705pA {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC0790q0 f32847a;

    public C4956rA(InterfaceC0790q0 interfaceC0790q0) {
        this.f32847a = interfaceC0790q0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4705pA
    public final void a(Map map) {
        this.f32847a.F0(Boolean.parseBoolean((String) map.get("content_url_opted_out")));
    }
}
