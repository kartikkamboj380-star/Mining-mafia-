package com.google.android.gms.internal.play_billing;

import com.google.android.gms.common.api.Api;

/* JADX INFO: loaded from: classes2.dex */
final class T extends V {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f37139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f37140c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f37141d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f37142e;

    /* synthetic */ T(byte[] bArr, int i10, int i11, boolean z9, S s10) {
        super(null);
        this.f37142e = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f37139b = bArr;
        this.f37140c = 0;
    }

    public final int c(int i10) {
        int i11 = this.f37142e;
        this.f37142e = 0;
        int i12 = this.f37140c + this.f37141d;
        this.f37140c = i12;
        if (i12 <= 0) {
            this.f37141d = 0;
            return i11;
        }
        this.f37141d = i12;
        this.f37140c = 0;
        return i11;
    }
}
