package com.google.android.gms.internal.common;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.common.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C6153k extends AbstractC6151i {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final AbstractC6151i f36224f = new C6153k(new Object[0], 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final transient Object[] f36225d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient int f36226e;

    C6153k(Object[] objArr, int i10) {
        this.f36225d = objArr;
        this.f36226e = i10;
    }

    @Override // com.google.android.gms.internal.common.AbstractC6146d
    final Object[] a() {
        return this.f36225d;
    }

    @Override // com.google.android.gms.internal.common.AbstractC6146d
    final int b() {
        return 0;
    }

    @Override // com.google.android.gms.internal.common.AbstractC6146d
    final int d() {
        return this.f36226e;
    }

    @Override // com.google.android.gms.internal.common.AbstractC6146d
    final boolean g() {
        return false;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        C.b(i10, this.f36226e, "index");
        Object obj = this.f36225d[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.common.AbstractC6151i, com.google.android.gms.internal.common.AbstractC6146d
    final int i(Object[] objArr, int i10) {
        Object[] objArr2 = this.f36225d;
        int i11 = this.f36226e;
        System.arraycopy(objArr2, 0, objArr, 0, i11);
        return i11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f36226e;
    }
}
