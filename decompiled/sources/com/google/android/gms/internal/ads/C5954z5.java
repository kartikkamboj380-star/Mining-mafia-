package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.z5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5954z5 implements L1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final L1 f35637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC5576w5 f35638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SparseArray f35639c = new SparseArray();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f35640d;

    public C5954z5(L1 l10, InterfaceC5576w5 interfaceC5576w5) {
        this.f35637a = l10;
        this.f35638b = interfaceC5576w5;
    }

    @Override // com.google.android.gms.internal.ads.L1
    public final InterfaceC5570w2 b(int i10, int i11) {
        if (i11 != 3) {
            this.f35640d = true;
            return this.f35637a.b(i10, i11);
        }
        SparseArray sparseArray = this.f35639c;
        B5 b10 = (B5) sparseArray.get(i10);
        if (b10 != null) {
            return b10;
        }
        B5 b11 = new B5(this.f35637a.b(i10, 3), this.f35638b);
        sparseArray.put(i10, b11);
        return b11;
    }

    @Override // com.google.android.gms.internal.ads.L1
    public final void o(InterfaceC4311m2 interfaceC4311m2) {
        this.f35637a.o(interfaceC4311m2);
    }

    @Override // com.google.android.gms.internal.ads.L1
    public final void q() {
        this.f35637a.q();
        if (!this.f35640d) {
            return;
        }
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.f35639c;
            if (i10 >= sparseArray.size()) {
                return;
            }
            ((B5) sparseArray.valueAt(i10)).a(true);
            i10++;
        }
    }
}
