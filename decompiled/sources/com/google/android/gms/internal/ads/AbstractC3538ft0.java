package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ft0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC3538ft0 extends AbstractC6053zs0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final CharSequence f28502c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f28503d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f28504e = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    AbstractC3538ft0(C3790ht0 c3790ht0, CharSequence charSequence) {
        this.f28502c = charSequence;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC6053zs0
    protected final /* bridge */ /* synthetic */ Object a() {
        int iD;
        int i10 = this.f28503d;
        while (true) {
            int i11 = this.f28503d;
            if (i11 == -1) {
                b();
                return null;
            }
            int iC = c(i11);
            if (iC == -1) {
                iC = this.f28502c.length();
                this.f28503d = -1;
                iD = -1;
            } else {
                iD = d(iC);
                this.f28503d = iD;
            }
            if (iD != i10) {
                if (i10 < iC) {
                    this.f28502c.charAt(i10);
                }
                if (i10 < iC) {
                    this.f28502c.charAt(iC - 1);
                }
                int i12 = this.f28504e;
                if (i12 == 1) {
                    CharSequence charSequence = this.f28502c;
                    int length = charSequence.length();
                    this.f28503d = -1;
                    if (length > i10) {
                        charSequence.charAt(length - 1);
                    }
                    iC = length;
                } else {
                    this.f28504e = i12 - 1;
                }
                return this.f28502c.subSequence(i10, iC).toString();
            }
            int i13 = iD + 1;
            this.f28503d = i13;
            if (i13 > this.f28502c.length()) {
                this.f28503d = -1;
            }
        }
    }

    abstract int c(int i10);

    abstract int d(int i10);
}
