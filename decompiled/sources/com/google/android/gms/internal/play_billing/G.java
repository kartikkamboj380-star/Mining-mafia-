package com.google.android.gms.internal.play_billing;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
final class G extends I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f37078a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f37079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ Q f37080c;

    G(Q q10) {
        this.f37080c = q10;
        this.f37079b = q10.d();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f37078a < this.f37079b;
    }

    @Override // com.google.android.gms.internal.play_billing.K
    public final byte zza() {
        int i10 = this.f37078a;
        if (i10 >= this.f37079b) {
            throw new NoSuchElementException();
        }
        this.f37078a = i10 + 1;
        return this.f37080c.b(i10);
    }
}
