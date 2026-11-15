package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.wu0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C5679wu0 extends AbstractC5299tt0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AbstractC5931yu0 f34670c;

    C5679wu0(AbstractC5931yu0 abstractC5931yu0, int i10) {
        super(abstractC5931yu0.size(), i10);
        this.f34670c = abstractC5931yu0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5299tt0
    protected final Object a(int i10) {
        return this.f34670c.get(i10);
    }
}
