package com.google.android.gms.internal.play_billing;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C6459t extends AbstractC6420j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient Object[] f37332d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient int f37333e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final transient int f37334f;

    C6459t(Object[] objArr, int i10, int i11) {
        this.f37332d = objArr;
        this.f37333e = i10;
        this.f37334f = i11;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC6408g
    final boolean g() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        AbstractC6388b.a(i10, this.f37334f, "index");
        Object obj = this.f37332d[i10 + i10 + this.f37333e];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f37334f;
    }
}
