package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.v01, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C5441v01 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC3977jO f33972c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SparseArray f33971b = new SparseArray();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f33970a = -1;

    public C5441v01(InterfaceC3977jO interfaceC3977jO) {
        this.f33972c = interfaceC3977jO;
    }

    public final Object a(int i10) {
        SparseArray sparseArray;
        if (this.f33970a == -1) {
            this.f33970a = 0;
        }
        while (true) {
            int i11 = this.f33970a;
            if (i11 <= 0 || i10 >= this.f33971b.keyAt(i11)) {
                break;
            }
            this.f33970a--;
        }
        while (true) {
            int i12 = this.f33970a;
            sparseArray = this.f33971b;
            if (i12 >= sparseArray.size() - 1 || i10 < sparseArray.keyAt(this.f33970a + 1)) {
                break;
            }
            this.f33970a++;
        }
        return sparseArray.valueAt(this.f33970a);
    }

    public final void b(int i10, Object obj) {
        if (this.f33970a == -1) {
            AbstractC2418Ss0.i(this.f33971b.size() == 0);
            this.f33970a = 0;
        }
        SparseArray sparseArray = this.f33971b;
        if (sparseArray.size() > 0) {
            int iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
            AbstractC2418Ss0.a(i10 >= iKeyAt);
            if (iKeyAt == i10) {
                this.f33972c.zza(sparseArray.valueAt(sparseArray.size() - 1));
            }
        }
        sparseArray.append(i10, obj);
    }

    public final Object c() {
        SparseArray sparseArray = this.f33971b;
        return sparseArray.valueAt(sparseArray.size() - 1);
    }

    public final void d(int i10) {
        int i11 = 0;
        while (true) {
            SparseArray sparseArray = this.f33971b;
            if (i11 >= sparseArray.size() - 1) {
                return;
            }
            int i12 = i11 + 1;
            if (i10 < sparseArray.keyAt(i12)) {
                return;
            }
            this.f33972c.zza(sparseArray.valueAt(i11));
            sparseArray.removeAt(i11);
            int i13 = this.f33970a;
            if (i13 > 0) {
                this.f33970a = i13 - 1;
            }
            i11 = i12;
        }
    }

    public final void e() {
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.f33971b;
            if (i10 >= sparseArray.size()) {
                this.f33970a = -1;
                sparseArray.clear();
                return;
            } else {
                this.f33972c.zza(sparseArray.valueAt(i10));
                i10++;
            }
        }
    }

    public final boolean f() {
        return this.f33971b.size() == 0;
    }
}
