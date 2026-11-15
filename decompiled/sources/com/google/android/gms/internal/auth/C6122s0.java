package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Api;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C6122s0 extends AbstractC6128u0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f36148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f36149c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f36150d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f36151e;

    /* synthetic */ C6122s0(byte[] bArr, int i10, int i11, boolean z9, AbstractC6119r0 abstractC6119r0) {
        super(null);
        this.f36151e = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f36148b = bArr;
        this.f36149c = 0;
    }

    public final int c(int i10) {
        int i11 = this.f36151e;
        this.f36151e = 0;
        int i12 = this.f36149c + this.f36150d;
        this.f36149c = i12;
        if (i12 <= 0) {
            this.f36150d = 0;
            return i11;
        }
        this.f36150d = i12;
        this.f36149c = 0;
        return i11;
    }
}
