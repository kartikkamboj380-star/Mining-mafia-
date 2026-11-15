package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Dr0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1637Dr0 extends AbstractC3536fs0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f18290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f18291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f18292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private byte f18293d;

    C1637Dr0() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3536fs0
    public final AbstractC3536fs0 a(int i10) {
        this.f18290a = i10;
        this.f18293d = (byte) (this.f18293d | 1);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3536fs0
    public final AbstractC3536fs0 b(String str) {
        this.f18291b = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3536fs0
    public final AbstractC3536fs0 c(int i10) {
        this.f18292c = i10;
        this.f18293d = (byte) (this.f18293d | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3536fs0
    public final AbstractC3662gs0 d() {
        if (this.f18293d == 3) {
            return new C1689Er0(this.f18290a, this.f18291b, this.f18292c, null);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f18293d & 1) == 0) {
            sb.append(" statusCode");
        }
        if ((this.f18293d & 2) == 0) {
            sb.append(" uiMode");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
