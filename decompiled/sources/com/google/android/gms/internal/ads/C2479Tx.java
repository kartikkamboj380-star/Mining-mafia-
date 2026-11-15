package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Tx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2479Tx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f23646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f23647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f23648c;

    private C2479Tx(int i10, int i11, int i12) {
        this.f23646a = i10;
        this.f23648c = i11;
        this.f23647b = i12;
    }

    public static C2479Tx a(H4.m2 m2Var) {
        if (m2Var.f1374d) {
            return new C2479Tx(3, 0, 0);
        }
        if (m2Var.f1379i) {
            return new C2479Tx(2, 0, 0);
        }
        return m2Var.f1378h ? new C2479Tx(0, 0, 0) : new C2479Tx(1, m2Var.f1376f, m2Var.f1373c);
    }

    public static C2479Tx b() {
        return new C2479Tx(0, 0, 0);
    }

    public static C2479Tx c(int i10, int i11) {
        return new C2479Tx(1, i10, i11);
    }

    public static C2479Tx d() {
        return new C2479Tx(4, 0, 0);
    }

    public static C2479Tx e() {
        return new C2479Tx(5, 0, 0);
    }

    public final boolean f() {
        return this.f23646a == 2;
    }

    public final boolean g() {
        return this.f23646a == 3;
    }

    public final boolean h() {
        return this.f23646a == 0;
    }

    public final boolean i() {
        return this.f23646a == 4;
    }

    public final boolean j() {
        return this.f23646a == 5;
    }
}
