package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.api.Api;

/* JADX INFO: loaded from: classes2.dex */
final class L4 extends M4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f36331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f36332c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f36333d;

    /* synthetic */ L4(byte[] bArr, int i10, int i11, boolean z9, byte[] bArr2) {
        super(null);
        this.f36333d = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f36331b = 0;
    }

    public final int c(int i10) {
        int i11 = this.f36333d;
        this.f36333d = 0;
        int i12 = this.f36331b + this.f36332c;
        this.f36331b = i12;
        if (i12 <= 0) {
            this.f36332c = 0;
            return i11;
        }
        this.f36332c = i12;
        this.f36331b = 0;
        return i11;
    }
}
