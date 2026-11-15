package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes2.dex */
final class Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ BasePendingResult f17028a;

    /* synthetic */ Z(BasePendingResult basePendingResult, zar zarVar) {
        this.f17028a = basePendingResult;
    }

    protected final void finalize() throws Throwable {
        BasePendingResult.zal(this.f17028a.zaj);
        super.finalize();
    }
}
