package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
final class W extends AbstractC6173c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f36523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte f36524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f36525c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f36526d;

    W() {
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6173c0
    public final AbstractC6173c0 a(boolean z9) {
        this.f36524b = (byte) 1;
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6173c0
    public final AbstractC6191e0 b() {
        if (this.f36524b == 1 && this.f36523a != null && this.f36525c != 0 && this.f36526d != 0) {
            return new X(this.f36523a, false, this.f36525c, null, null, this.f36526d, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f36523a == null) {
            sb.append(" fileOwner");
        }
        if (this.f36524b == 0) {
            sb.append(" hasDifferentDmaOwner");
        }
        if (this.f36525c == 0) {
            sb.append(" fileChecks");
        }
        if (this.f36526d == 0) {
            sb.append(" filePurpose");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6173c0
    final AbstractC6173c0 c(int i10) {
        this.f36525c = i10;
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6173c0
    public final AbstractC6173c0 d(int i10) {
        this.f36526d = 1;
        return this;
    }

    public final AbstractC6173c0 e(String str) {
        this.f36523a = "";
        return this;
    }
}
