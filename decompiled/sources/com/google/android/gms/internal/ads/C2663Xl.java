package com.google.android.gms.internal.ads;

import H4.InterfaceC0580a;
import J4.InterfaceC0739b;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Xl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2663Xl implements InterfaceC0739b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f25376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f25377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ InterfaceC0580a f25378c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ Map f25379d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ Map f25380e;

    C2663Xl(C2767Zl c2767Zl, boolean z9, InterfaceC0580a interfaceC0580a, Map map, Map map2) {
        this.f25377b = z9;
        this.f25378c = interfaceC0580a;
        this.f25379d = map;
        this.f25380e = map2;
        Objects.requireNonNull(c2767Zl);
        this.f25376a = false;
    }

    @Override // J4.InterfaceC0739b
    public final void b(int i10) {
    }

    @Override // J4.InterfaceC0739b
    public final void h0(boolean z9) {
        if (this.f25376a) {
            return;
        }
        if (z9 && this.f25377b) {
            ((InterfaceC4599oK) this.f25378c).t0();
        }
        this.f25376a = true;
        Map map = this.f25379d;
        map.put((String) this.f25380e.get("event_id"), Boolean.valueOf(z9));
        ((InterfaceC3274dn) this.f25378c).b("openIntentAsync", map);
    }
}
