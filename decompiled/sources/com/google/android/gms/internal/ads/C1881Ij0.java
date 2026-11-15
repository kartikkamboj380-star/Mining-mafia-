package com.google.android.gms.internal.ads;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ij0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1881Ij0 extends kotlin.coroutines.jvm.internal.l implements Function2 {
    C1881Ij0(p169q8.b bVar) {
        super(2, bVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final p169q8.b create(Object obj, p169q8.b bVar) {
        return new C1881Ij0(bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C1881Ij0) create((C5027rj0) obj, (p169q8.b) obj2)).invokeSuspend(Unit.f45918a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        p179r8.b.e();
        p129m8.n.b(obj);
        C5027rj0 c5027rj0G0 = C5027rj0.g0();
        Intrinsics.checkNotNullExpressionValue(c5027rj0G0, "getDefaultInstance(...)");
        return c5027rj0G0;
    }
}
