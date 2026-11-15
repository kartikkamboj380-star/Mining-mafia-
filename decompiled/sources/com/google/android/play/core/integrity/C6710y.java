package com.google.android.play.core.integrity;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C6710y extends M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f39895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private i0 f39896b;

    C6710y() {
    }

    @Override // com.google.android.play.core.integrity.M
    final M a(i0 i0Var) {
        this.f39896b = i0Var;
        return this;
    }

    @Override // com.google.android.play.core.integrity.M
    final M b(String str) {
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        this.f39895a = str;
        return this;
    }

    @Override // com.google.android.play.core.integrity.M
    final N c() {
        i0 i0Var;
        String str = this.f39895a;
        if (str != null && (i0Var = this.f39896b) != null) {
            return new N(str, i0Var);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f39895a == null) {
            sb.append(" token");
        }
        if (this.f39896b == null) {
            sb.append(" integrityDialogWrapper");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
