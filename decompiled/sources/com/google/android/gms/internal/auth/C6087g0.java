package com.google.android.gms.internal.auth;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C6087g0 extends AbstractC6093i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f36025a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f36026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbstractC6117q0 f36027c;

    C6087g0(AbstractC6117q0 abstractC6117q0) {
        this.f36027c = abstractC6117q0;
        this.f36026b = abstractC6117q0.d();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f36025a < this.f36026b;
    }

    @Override // com.google.android.gms.internal.auth.InterfaceC6102l0
    public final byte zza() {
        int i10 = this.f36025a;
        if (i10 >= this.f36026b) {
            throw new NoSuchElementException();
        }
        this.f36025a = i10 + 1;
        return this.f36027c.b(i10);
    }
}
