package com.google.android.gms.internal.common;

import com.google.android.gms.common.api.Api;

/* JADX INFO: loaded from: classes2.dex */
abstract class G extends v {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final CharSequence f36203c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final A f36204d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final boolean f36205e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f36206f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f36207g = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    G(H h10, CharSequence charSequence) {
        this.f36204d = h10.f();
        this.f36205e = h10.g();
        this.f36203c = charSequence;
    }

    @Override // com.google.android.gms.internal.common.v
    protected final /* bridge */ /* synthetic */ Object a() {
        int iD;
        int i10 = this.f36206f;
        while (true) {
            int i11 = this.f36206f;
            if (i11 == -1) {
                b();
                return null;
            }
            int iC = c(i11);
            if (iC == -1) {
                iC = this.f36203c.length();
                this.f36206f = -1;
                iD = -1;
            } else {
                iD = d(iC);
                this.f36206f = iD;
            }
            if (iD == i10) {
                int i12 = iD + 1;
                this.f36206f = i12;
                if (i12 > this.f36203c.length()) {
                    this.f36206f = -1;
                }
            } else {
                if (i10 < iC) {
                    this.f36203c.charAt(i10);
                }
                if (i10 < iC) {
                    this.f36203c.charAt(iC - 1);
                }
                if (!this.f36205e || i10 != iC) {
                    int i13 = this.f36207g;
                    if (i13 == 1) {
                        CharSequence charSequence = this.f36203c;
                        int length = charSequence.length();
                        this.f36206f = -1;
                        if (length > i10) {
                            charSequence.charAt(length - 1);
                        }
                        iC = length;
                    } else {
                        this.f36207g = i13 - 1;
                    }
                    return this.f36203c.subSequence(i10, iC).toString();
                }
                i10 = this.f36206f;
            }
        }
    }

    abstract int c(int i10);

    abstract int d(int i10);
}
