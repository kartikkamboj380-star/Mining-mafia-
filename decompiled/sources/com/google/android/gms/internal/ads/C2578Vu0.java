package com.google.android.gms.internal.ads;

import java.util.ListIterator;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Vu0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2578Vu0 extends AbstractC2060Lv0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2630Wu0 f24584b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2578Vu0(C2630Wu0 c2630Wu0, ListIterator listIterator) {
        super(listIterator);
        Objects.requireNonNull(c2630Wu0);
        this.f24584b = c2630Wu0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2009Kv0
    final Object a(Object obj) {
        return this.f24584b.f24884b.apply(obj);
    }
}
