package com.google.android.play.core.integrity;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C6700n extends IntegrityTokenRequest.Builder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f39879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Long f39880b;

    C6700n() {
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest.Builder
    public final IntegrityTokenRequest build() {
        String str = this.f39879a;
        if (str == null) {
            throw new IllegalStateException("Missing required properties: nonce");
        }
        T5.c cVar = null;
        return new C6701o(str, this.f39880b, cVar, cVar);
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest.Builder
    public final IntegrityTokenRequest.Builder setCloudProjectNumber(long j10) {
        this.f39880b = Long.valueOf(j10);
        return this;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest.Builder
    public final IntegrityTokenRequest.Builder setNonce(String str) {
        if (str == null) {
            throw new NullPointerException("Null nonce");
        }
        this.f39879a = str;
        return this;
    }
}
