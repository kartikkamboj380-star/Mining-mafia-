package com.google.android.gms.internal.play_billing;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C6444p extends AbstractC6420j {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final AbstractC6420j f37315f = new C6444p(new Object[0], 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final transient Object[] f37316d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient int f37317e;

    C6444p(Object[] objArr, int i10) {
        this.f37316d = objArr;
        this.f37317e = i10;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC6420j, com.google.android.gms.internal.play_billing.AbstractC6408g
    final int a(Object[] objArr, int i10) {
        System.arraycopy(this.f37316d, 0, objArr, 0, this.f37317e);
        return this.f37317e;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC6408g
    final int b() {
        return this.f37317e;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC6408g
    final int d() {
        return 0;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC6408g
    final boolean g() {
        return false;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        AbstractC6388b.a(i10, this.f37317e, "index");
        Object obj = this.f37316d[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC6408g
    final Object[] i() {
        return this.f37316d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f37317e;
    }
}
