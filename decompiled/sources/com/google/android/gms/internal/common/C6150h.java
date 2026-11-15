package com.google.android.gms.internal.common;

import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.common.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C6150h extends AbstractC6151i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final transient int f36219d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final transient int f36220e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ AbstractC6151i f36221f;

    C6150h(AbstractC6151i abstractC6151i, int i10, int i11) {
        Objects.requireNonNull(abstractC6151i);
        this.f36221f = abstractC6151i;
        this.f36219d = i10;
        this.f36220e = i11;
    }

    @Override // com.google.android.gms.internal.common.AbstractC6146d
    final Object[] a() {
        return this.f36221f.a();
    }

    @Override // com.google.android.gms.internal.common.AbstractC6146d
    final int b() {
        return this.f36221f.b() + this.f36219d;
    }

    @Override // com.google.android.gms.internal.common.AbstractC6146d
    final int d() {
        return this.f36221f.b() + this.f36219d + this.f36220e;
    }

    @Override // com.google.android.gms.internal.common.AbstractC6146d
    final boolean g() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        C.b(i10, this.f36220e, "index");
        return this.f36221f.get(i10 + this.f36219d);
    }

    @Override // com.google.android.gms.internal.common.AbstractC6151i
    /* JADX INFO: renamed from: k */
    public final AbstractC6151i subList(int i10, int i11) {
        C.d(i10, i11, this.f36220e);
        int i12 = this.f36219d;
        return this.f36221f.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f36220e;
    }

    @Override // com.google.android.gms.internal.common.AbstractC6151i, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}
