package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1430k extends AbstractC1442x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ BaseGmsClient.ConnectionProgressReportCallbacks f17067b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1430k(C1431l c1431l, zabf zabfVar, BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks) {
        super(zabfVar);
        this.f17067b = connectionProgressReportCallbacks;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1442x
    public final void a() {
        this.f17067b.onReportServiceBinding(new ConnectionResult(16, null));
    }
}
