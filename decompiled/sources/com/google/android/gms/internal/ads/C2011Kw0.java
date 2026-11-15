package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Kw0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2011Kw0 extends AbstractC1959Jw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f20299a = AtomicReferenceFieldUpdater.newUpdater(C2218Ow0.class, Thread.class, "a");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f20300b = AtomicReferenceFieldUpdater.newUpdater(C2218Ow0.class, C2218Ow0.class, "b");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f20301c = AtomicReferenceFieldUpdater.newUpdater(AbstractC2270Pw0.class, C2218Ow0.class, "c");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f20302d = AtomicReferenceFieldUpdater.newUpdater(AbstractC2270Pw0.class, C1751Fw0.class, "b");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f20303e = AtomicReferenceFieldUpdater.newUpdater(AbstractC2270Pw0.class, Object.class, "a");

    /* synthetic */ C2011Kw0(byte[] bArr) {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.AbstractC1959Jw0
    public final void a(C2218Ow0 c2218Ow0, Thread thread) {
        f20299a.lazySet(c2218Ow0, thread);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1959Jw0
    final void b(C2218Ow0 c2218Ow0, C2218Ow0 c2218Ow1) {
        f20300b.lazySet(c2218Ow0, c2218Ow1);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1959Jw0
    final boolean c(AbstractC2270Pw0 abstractC2270Pw0, C2218Ow0 c2218Ow0, C2218Ow0 c2218Ow1) {
        return androidx.concurrent.futures.b.a(f20301c, abstractC2270Pw0, c2218Ow0, c2218Ow1);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1959Jw0
    final boolean d(AbstractC2270Pw0 abstractC2270Pw0, C1751Fw0 c1751Fw0, C1751Fw0 c1751Fw1) {
        return androidx.concurrent.futures.b.a(f20302d, abstractC2270Pw0, c1751Fw0, c1751Fw1);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1959Jw0
    final C2218Ow0 e(AbstractC2270Pw0 abstractC2270Pw0, C2218Ow0 c2218Ow0) {
        return (C2218Ow0) f20301c.getAndSet(abstractC2270Pw0, c2218Ow0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1959Jw0
    final C1751Fw0 f(AbstractC2270Pw0 abstractC2270Pw0, C1751Fw0 c1751Fw0) {
        return (C1751Fw0) f20302d.getAndSet(abstractC2270Pw0, c1751Fw0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1959Jw0
    final boolean g(AbstractC2270Pw0 abstractC2270Pw0, Object obj, Object obj2) {
        return androidx.concurrent.futures.b.a(f20303e, abstractC2270Pw0, obj, obj2);
    }
}
