package com.google.android.gms.internal.auth;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C6096j0 extends C6108n0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f36100f;

    C6096j0(byte[] bArr, int i10, int i11) {
        super(bArr);
        AbstractC6117q0.k(0, i11, bArr.length);
        this.f36100f = i11;
    }

    @Override // com.google.android.gms.internal.auth.C6108n0, com.google.android.gms.internal.auth.AbstractC6117q0
    public final byte a(int i10) {
        int i11 = this.f36100f;
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return this.f36126e[i10];
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i10);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i10 + ", " + i11);
    }

    @Override // com.google.android.gms.internal.auth.C6108n0, com.google.android.gms.internal.auth.AbstractC6117q0
    final byte b(int i10) {
        return this.f36126e[i10];
    }

    @Override // com.google.android.gms.internal.auth.C6108n0, com.google.android.gms.internal.auth.AbstractC6117q0
    public final int d() {
        return this.f36100f;
    }

    @Override // com.google.android.gms.internal.auth.C6108n0
    protected final int p() {
        return 0;
    }
}
