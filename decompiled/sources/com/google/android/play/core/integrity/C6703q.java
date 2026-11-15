package com.google.android.play.core.integrity;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C6703q extends IntegrityTokenResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f39884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i0 f39885b;

    C6703q(String str, i0 i0Var) {
        this.f39884a = str;
        this.f39885b = i0Var;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenResponse
    public final String token() {
        return this.f39884a;
    }
}
