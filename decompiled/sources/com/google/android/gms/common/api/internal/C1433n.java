package com.google.android.gms.common.api.internal;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1433n extends AbstractC1442x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ zaaw f17072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.signin.internal.l f17073c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1433n(BinderC1434o binderC1434o, zabf zabfVar, zaaw zaawVar, com.google.android.gms.signin.internal.l lVar) {
        super(zabfVar);
        this.f17072b = zaawVar;
        this.f17073c = lVar;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1442x
    public final void a() {
        zaaw.zar(this.f17072b, this.f17073c);
    }
}
