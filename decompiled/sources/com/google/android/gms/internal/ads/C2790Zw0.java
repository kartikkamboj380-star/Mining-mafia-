package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Zw0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2790Zw0 extends AbstractC2738Yw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f26354a = AtomicReferenceFieldUpdater.newUpdater(AbstractC3044bx0.class, Set.class, "h");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f26355b = AtomicIntegerFieldUpdater.newUpdater(AbstractC3044bx0.class, "i");

    /* synthetic */ C2790Zw0(byte[] bArr) {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2738Yw0
    final void a(AbstractC3044bx0 abstractC3044bx0, Set set, Set set2) {
        androidx.concurrent.futures.b.a(f26354a, abstractC3044bx0, null, set2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2738Yw0
    final int b(AbstractC3044bx0 abstractC3044bx0) {
        return f26355b.decrementAndGet(abstractC3044bx0);
    }
}
