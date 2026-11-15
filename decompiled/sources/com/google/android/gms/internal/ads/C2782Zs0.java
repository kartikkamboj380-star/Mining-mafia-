package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Zs0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2782Zs0 extends AbstractC3538ft0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ AbstractC1795Gs0 f26331f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2782Zs0(C3790ht0 c3790ht0, CharSequence charSequence, AbstractC1795Gs0 abstractC1795Gs0) {
        super(c3790ht0, charSequence);
        this.f26331f = abstractC1795Gs0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3538ft0
    public final int c(int i10) {
        Matcher matcher = ((C1951Js0) this.f26331f).f20013a;
        if (matcher.find(i10)) {
            return matcher.start();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3538ft0
    public final int d(int i10) {
        return ((C1951Js0) this.f26331f).f20013a.end();
    }
}
