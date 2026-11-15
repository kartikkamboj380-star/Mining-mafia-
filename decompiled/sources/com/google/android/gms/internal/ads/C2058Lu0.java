package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Lu0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C2058Lu0 extends AbstractC1799Gu0 implements InterfaceC3668gv0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final transient AbstractC1903Iu0 f20688f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private transient AbstractC1903Iu0 f20689g;

    C2058Lu0(AbstractC1539Bu0 abstractC1539Bu0, int i10, Comparator comparator) {
        super(abstractC1539Bu0, i10);
        this.f20688f = C6059zv0.f35880i;
    }

    public final AbstractC1903Iu0 i() {
        AbstractC1903Iu0 abstractC1903Iu0 = this.f20689g;
        if (abstractC1903Iu0 != null) {
            return abstractC1903Iu0;
        }
        C2007Ku0 c2007Ku0 = new C2007Ku0(this);
        this.f20689g = c2007Ku0;
        return c2007Ku0;
    }
}
