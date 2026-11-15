package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C6412h extends AbstractC6396d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AbstractC6420j f37217c;

    C6412h(AbstractC6420j abstractC6420j, int i10) {
        super(abstractC6420j.size(), i10);
        this.f37217c = abstractC6420j;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC6396d
    protected final Object a(int i10) {
        return this.f37217c.get(i10);
    }
}
