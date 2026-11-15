package com.google.android.gms.common.api.internal;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1444z implements BackgroundDetector.BackgroundStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ GoogleApiManager f17090a;

    C1444z(GoogleApiManager googleApiManager) {
        this.f17090a = googleApiManager;
    }

    @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
    public final void onBackgroundStateChanged(boolean z9) {
        GoogleApiManager googleApiManager = this.f17090a;
        googleApiManager.zar.sendMessage(googleApiManager.zar.obtainMessage(1, Boolean.valueOf(z9)));
    }
}
