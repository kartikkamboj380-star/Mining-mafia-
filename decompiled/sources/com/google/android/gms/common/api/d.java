package com.google.android.gms.common.api;

import android.os.Looper;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* JADX INFO: loaded from: classes2.dex */
final class d extends BasePendingResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Result f16980a;

    public d(Result result) {
        super(Looper.getMainLooper());
        this.f16980a = result;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final Result createFailedResult(Status status) {
        if (status.getStatusCode() == this.f16980a.getStatus().getStatusCode()) {
            return this.f16980a;
        }
        throw new UnsupportedOperationException("Creating failed results is not supported");
    }
}
