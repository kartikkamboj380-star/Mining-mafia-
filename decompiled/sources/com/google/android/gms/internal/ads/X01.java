package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class X01 extends C1776Gj {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private boolean f25057A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private boolean f25058B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private boolean f25059C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final SparseArray f25060D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final SparseBooleanArray f25061E;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f25062w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f25063x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f25064y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f25065z;

    public X01() {
        this.f25060D = new SparseArray();
        this.f25061E = new SparseBooleanArray();
        this.f25062w = true;
        this.f25063x = true;
        this.f25064y = true;
        this.f25065z = true;
        this.f25057A = true;
        this.f25058B = true;
        this.f25059C = true;
    }

    final /* synthetic */ boolean A() {
        return this.f25065z;
    }

    final /* synthetic */ boolean B() {
        return this.f25057A;
    }

    final /* synthetic */ boolean C() {
        return this.f25058B;
    }

    final /* synthetic */ boolean D() {
        return this.f25059C;
    }

    final /* synthetic */ SparseArray E() {
        return this.f25060D;
    }

    final /* synthetic */ SparseBooleanArray F() {
        return this.f25061E;
    }

    protected final X01 G(C3771hk c3771hk) {
        super.a(c3771hk);
        return this;
    }

    public final X01 H(int i10, boolean z9) {
        SparseBooleanArray sparseBooleanArray = this.f25061E;
        if (sparseBooleanArray.get(i10) == z9) {
            return this;
        }
        if (z9) {
            sparseBooleanArray.put(i10, true);
            return this;
        }
        sparseBooleanArray.delete(i10);
        return this;
    }

    final /* synthetic */ boolean I() {
        return this.f25062w;
    }

    final /* synthetic */ boolean y() {
        return this.f25063x;
    }

    final /* synthetic */ boolean z() {
        return this.f25064y;
    }

    /* synthetic */ X01(Y01 y01, byte[] bArr) {
        super(y01);
        this.f25062w = y01.f25438J;
        this.f25063x = y01.f25440L;
        this.f25064y = y01.f25442N;
        this.f25065z = y01.f25447S;
        this.f25057A = y01.f25448T;
        this.f25058B = y01.f25449U;
        this.f25059C = y01.f25451W;
        SparseArray sparseArray = new SparseArray();
        int i10 = 0;
        while (true) {
            SparseArray sparseArrayE = y01.e();
            if (i10 < sparseArrayE.size()) {
                sparseArray.put(sparseArrayE.keyAt(i10), new HashMap((Map) sparseArrayE.valueAt(i10)));
                i10++;
            } else {
                this.f25060D = sparseArray;
                this.f25061E = y01.f().clone();
                return;
            }
        }
    }
}
