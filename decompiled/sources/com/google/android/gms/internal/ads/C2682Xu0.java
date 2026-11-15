package com.google.android.gms.internal.ads;

import java.util.ListIterator;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Xu0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2682Xu0 extends AbstractC2060Lv0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2734Yu0 f25402b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2682Xu0(C2734Yu0 c2734Yu0, ListIterator listIterator) {
        super(listIterator);
        Objects.requireNonNull(c2734Yu0);
        this.f25402b = c2734Yu0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2009Kv0
    final Object a(Object obj) {
        return this.f25402b.f25786b.apply(obj);
    }
}
