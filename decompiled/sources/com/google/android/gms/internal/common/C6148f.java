package com.google.android.gms.internal.common;

/* JADX INFO: renamed from: com.google.android.gms.internal.common.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C6148f extends K {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AbstractC6151i f36217c;

    C6148f(AbstractC6151i abstractC6151i, int i10) {
        super(abstractC6151i.size(), i10);
        this.f36217c = abstractC6151i;
    }

    @Override // com.google.android.gms.internal.common.K
    protected final Object a(int i10) {
        return this.f36217c.get(i10);
    }
}
