package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ov0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C4674ov0 extends AbstractC5551vt0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final transient InterfaceC4166kt0 f32219f;

    C4674ov0(Map map, InterfaceC4166kt0 interfaceC4166kt0) {
        super(map);
        this.f32219f = interfaceC4166kt0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2264Pt0
    final Set a() {
        return m();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2264Pt0
    final Map e() {
        return n();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2108Mt0
    protected final /* bridge */ /* synthetic */ Collection k() {
        return (List) this.f32219f.zza();
    }
}
