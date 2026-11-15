package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.Task;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C6691e implements IntegrityManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C6697k f39838a;

    C6691e(C6697k c6697k) {
        this.f39838a = c6697k;
    }

    @Override // com.google.android.play.core.integrity.IntegrityManager
    public final Task requestIntegrityToken(IntegrityTokenRequest integrityTokenRequest) {
        return this.f39838a.b(integrityTokenRequest);
    }
}
