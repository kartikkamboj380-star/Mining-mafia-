package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.vP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C5490vP implements InterfaceC2091Ml {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference f34052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f34053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC2091Ml f34054c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ C5616wP f34055d;

    /* synthetic */ C5490vP(C5616wP c5616wP, WeakReference weakReference, String str, InterfaceC2091Ml interfaceC2091Ml, byte[] bArr) {
        Objects.requireNonNull(c5616wP);
        this.f34055d = c5616wP;
        this.f34052a = weakReference;
        this.f34053b = str;
        this.f34054c = interfaceC2091Ml;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2091Ml
    public final void a(Object obj, Map map) {
        Object obj2 = this.f34052a.get();
        if (obj2 == null) {
            this.f34055d.e(this.f34053b, this);
        } else {
            this.f34054c.a(obj2, map);
        }
    }
}
