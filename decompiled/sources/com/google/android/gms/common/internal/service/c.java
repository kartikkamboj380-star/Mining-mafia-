package com.google.android.gms.common.internal.service;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;

/* JADX INFO: loaded from: classes2.dex */
final class c extends zaa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BaseImplementation.ResultHolder f17153a;

    public c(BaseImplementation.ResultHolder resultHolder) {
        this.f17153a = resultHolder;
    }

    @Override // com.google.android.gms.common.internal.service.zaa, com.google.android.gms.common.internal.service.zak
    public final void zab(int i10) {
        this.f17153a.setResult(new Status(i10));
    }
}
