package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ys0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2730Ys0 extends AbstractC3538ft0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ AbstractC1743Fs0 f25781f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2730Ys0(C3790ht0 c3790ht0, CharSequence charSequence, AbstractC1743Fs0 abstractC1743Fs0) {
        super(c3790ht0, charSequence);
        this.f25781f = abstractC1743Fs0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3538ft0
    final int c(int i10) {
        CharSequence charSequence = this.f28502c;
        int length = charSequence.length();
        AbstractC2418Ss0.n(i10, length, "index");
        while (i10 < length) {
            if (this.f25781f.a(charSequence.charAt(i10))) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3538ft0
    final int d(int i10) {
        return i10 + 1;
    }
}
