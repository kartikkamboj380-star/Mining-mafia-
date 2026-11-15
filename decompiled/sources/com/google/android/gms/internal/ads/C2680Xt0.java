package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Xt0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2680Xt0 extends AbstractC2912au0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ C3414eu0 f25400e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2680Xt0(C3414eu0 c3414eu0) {
        super(c3414eu0, null);
        Objects.requireNonNull(c3414eu0);
        this.f25400e = c3414eu0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2912au0
    final /* bridge */ /* synthetic */ Object a(int i10) {
        return new C3163cu0(this.f25400e, i10);
    }
}
