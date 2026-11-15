package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.lv0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C4296lv0 extends AbstractC4170kv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ AbstractC4422mv0 f31387a;

    C4296lv0(AbstractC4422mv0 abstractC4422mv0, int i10) {
        Objects.requireNonNull(abstractC4422mv0);
        this.f31387a = abstractC4422mv0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4170kv0
    public final InterfaceC2526Uu0 c() {
        return new C4674ov0(this.f31387a.a(), new C4044jv0(2));
    }
}
