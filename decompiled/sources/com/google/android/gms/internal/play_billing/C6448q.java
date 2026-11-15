package com.google.android.gms.internal.play_billing;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C6448q extends AbstractC6420j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ r f37322d;

    C6448q(r rVar) {
        this.f37322d = rVar;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC6408g
    public final boolean g() {
        return true;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        AbstractC6388b.a(i10, this.f37322d.f37328e, "index");
        int i11 = i10 + i10;
        Object obj = this.f37322d.f37327d[i11];
        Objects.requireNonNull(obj);
        Object obj2 = this.f37322d.f37327d[i11 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f37322d.f37328e;
    }
}
