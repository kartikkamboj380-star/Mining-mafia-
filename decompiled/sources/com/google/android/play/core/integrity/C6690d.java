package com.google.android.play.core.integrity;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C6690d extends AbstractC6702p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f39835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private i0 f39836b;

    C6690d() {
    }

    @Override // com.google.android.play.core.integrity.AbstractC6702p
    final AbstractC6702p a(i0 i0Var) {
        this.f39836b = i0Var;
        return this;
    }

    @Override // com.google.android.play.core.integrity.AbstractC6702p
    final AbstractC6702p b(String str) {
        this.f39835a = str;
        return this;
    }

    @Override // com.google.android.play.core.integrity.AbstractC6702p
    final C6703q c() {
        i0 i0Var;
        String str = this.f39835a;
        if (str != null && (i0Var = this.f39836b) != null) {
            return new C6703q(str, i0Var);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f39835a == null) {
            sb.append(" token");
        }
        if (this.f39836b == null) {
            sb.append(" integrityDialogWrapper");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
