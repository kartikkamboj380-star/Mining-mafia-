package com.google.android.gms.common.api;

/* JADX INFO: loaded from: classes2.dex */
final class c implements PendingResult.StatusListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Batch f16979a;

    c(Batch batch) {
        this.f16979a = batch;
    }

    @Override // com.google.android.gms.common.api.PendingResult.StatusListener
    public final void onComplete(Status status) {
        synchronized (this.f16979a.zai) {
            try {
                if (this.f16979a.isCanceled()) {
                    return;
                }
                if (status.isCanceled()) {
                    this.f16979a.zag = true;
                } else if (!status.isSuccess()) {
                    this.f16979a.zaf = true;
                }
                this.f16979a.zae--;
                Batch batch = this.f16979a;
                if (batch.zae == 0) {
                    if (batch.zag) {
                        super/*com.google.android.gms.common.api.internal.BasePendingResult*/.cancel();
                    } else {
                        Status status2 = batch.zaf ? new Status(13) : Status.RESULT_SUCCESS;
                        Batch batch2 = this.f16979a;
                        batch2.setResult(new BatchResult(status2, batch2.zah));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
