package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Gu0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1799Gu0 extends AbstractC2316Qt0 implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final transient AbstractC1539Bu0 f19159d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final transient int f19160e;

    AbstractC1799Gu0(AbstractC1539Bu0 abstractC1539Bu0, int i10) {
        this.f19159d = abstractC1539Bu0;
        this.f19160e = i10;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2264Pt0
    final Set a() {
        throw new AssertionError("unreachable");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3668gv0
    public final void b() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2264Pt0
    final /* synthetic */ Collection c() {
        return new C1747Fu0(this);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2264Pt0
    final Map e() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2264Pt0
    public final boolean f(Object obj) {
        return obj != null && super.f(obj);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2264Pt0, com.google.android.gms.internal.ads.InterfaceC3668gv0
    public final /* bridge */ /* synthetic */ Collection g() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3668gv0
    public final int zzd() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3668gv0
    public final boolean zze(Object obj, Object obj2) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2264Pt0, com.google.android.gms.internal.ads.InterfaceC3668gv0
    public /* synthetic */ Map zzu() {
        return this.f19159d;
    }
}
