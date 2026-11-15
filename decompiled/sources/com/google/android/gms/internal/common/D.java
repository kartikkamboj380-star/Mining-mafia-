package com.google.android.gms.internal.common;

/* JADX INFO: loaded from: classes2.dex */
final class D extends G {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ A f36199h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    D(H h10, CharSequence charSequence, A a10) {
        super(h10, charSequence);
        this.f36199h = a10;
    }

    @Override // com.google.android.gms.internal.common.G
    final int c(int i10) {
        CharSequence charSequence = this.f36203c;
        int length = charSequence.length();
        C.c(i10, length, "index");
        while (i10 < length) {
            if (this.f36199h.a(charSequence.charAt(i10))) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.common.G
    final int d(int i10) {
        return i10 + 1;
    }
}
