package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.lL0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C4224lL0 extends AbstractC4350mL0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f31248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f31249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbstractC5231tL0 f31250c;

    C4224lL0(AbstractC5231tL0 abstractC5231tL0) {
        Objects.requireNonNull(abstractC5231tL0);
        this.f31250c = abstractC5231tL0;
        this.f31248a = 0;
        this.f31249b = abstractC5231tL0.j();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f31248a < this.f31249b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4602oL0
    public final byte zza() {
        int i10 = this.f31248a;
        if (i10 >= this.f31249b) {
            throw new NoSuchElementException();
        }
        this.f31248a = i10 + 1;
        return this.f31250c.i(i10);
    }
}
