package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1429j extends AbstractC1442x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ ConnectionResult f17065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ C1431l f17066c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1429j(C1431l c1431l, zabf zabfVar, ConnectionResult connectionResult) {
        super(zabfVar);
        this.f17066c = c1431l;
        this.f17065b = connectionResult;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1442x
    public final void a() {
        this.f17066c.f17069c.zaD(this.f17065b);
    }
}
