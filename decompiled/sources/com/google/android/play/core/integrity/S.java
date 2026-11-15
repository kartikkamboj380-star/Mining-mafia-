package com.google.android.play.core.integrity;

/* JADX INFO: loaded from: classes2.dex */
final class S extends InterfaceC6689c.a.AbstractC0365a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f39826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte f39827b;

    S() {
    }

    @Override // com.google.android.play.core.integrity.InterfaceC6689c.a.AbstractC0365a
    public final InterfaceC6689c.a a() {
        if (this.f39827b == 3) {
            return new T(this.f39826a, 0, null);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f39827b & 1) == 0) {
            sb.append(" cloudProjectNumber");
        }
        if ((this.f39827b & 2) == 0) {
            sb.append(" webViewRequestMode");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // com.google.android.play.core.integrity.InterfaceC6689c.a.AbstractC0365a
    public final InterfaceC6689c.a.AbstractC0365a b(long j10) {
        this.f39826a = j10;
        this.f39827b = (byte) (this.f39827b | 1);
        return this;
    }

    public final InterfaceC6689c.a.AbstractC0365a c(int i10) {
        this.f39827b = (byte) (this.f39827b | 2);
        return this;
    }
}
