package com.google.android.gms.internal.play_billing;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C6416i extends AbstractC6420j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final transient int f37227d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final transient int f37228e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ AbstractC6420j f37229f;

    C6416i(AbstractC6420j abstractC6420j, int i10, int i11) {
        this.f37229f = abstractC6420j;
        this.f37227d = i10;
        this.f37228e = i11;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC6408g
    final int b() {
        return this.f37229f.d() + this.f37227d + this.f37228e;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC6408g
    final int d() {
        return this.f37229f.d() + this.f37227d;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC6408g
    final boolean g() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        AbstractC6388b.a(i10, this.f37228e, "index");
        return this.f37229f.get(i10 + this.f37227d);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC6408g
    final Object[] i() {
        return this.f37229f.i();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC6420j
    /* JADX INFO: renamed from: j */
    public final AbstractC6420j subList(int i10, int i11) {
        AbstractC6388b.d(i10, i11, this.f37228e);
        int i12 = this.f37227d;
        return this.f37229f.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f37228e;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC6420j, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}
