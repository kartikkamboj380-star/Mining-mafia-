package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;
import java.util.AbstractMap;
import java.util.HashSet;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.On, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2199On implements InterfaceC3399en, InterfaceC2147Nn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC2147Nn f21669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashSet f21670b = new HashSet();

    public C2199On(InterfaceC2147Nn interfaceC2147Nn) {
        this.f21669a = interfaceC2147Nn;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2147Nn
    public final void D0(String str, InterfaceC2091Ml interfaceC2091Ml) {
        this.f21669a.D0(str, interfaceC2091Ml);
        this.f21670b.add(new AbstractMap.SimpleEntry(str, interfaceC2091Ml));
    }

    public final void g() {
        HashSet<AbstractMap.SimpleEntry> hashSet = this.f21670b;
        for (AbstractMap.SimpleEntry simpleEntry : hashSet) {
            AbstractC0786o0.k("Unregistering eventhandler: ".concat(String.valueOf(((InterfaceC2091Ml) simpleEntry.getValue()).toString())));
            this.f21669a.w0((String) simpleEntry.getKey(), (InterfaceC2091Ml) simpleEntry.getValue());
        }
        hashSet.clear();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3399en, com.google.android.gms.internal.ads.InterfaceC4783pn
    public final void k(String str) {
        this.f21669a.k(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2147Nn
    public final void w0(String str, InterfaceC2091Ml interfaceC2091Ml) {
        this.f21669a.w0(str, interfaceC2091Ml);
        this.f21670b.remove(new AbstractMap.SimpleEntry(str, interfaceC2091Ml));
    }
}
