package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class Q7 extends AbstractC6235j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC6350v7 f36476c;

    public Q7(InterfaceC6350v7 interfaceC6350v7) {
        super("internal.logger");
        this.f36476c = interfaceC6350v7;
        this.f36719b.put("log", new P7(this, false, true));
        this.f36719b.put("silent", new C6331t6(this, "silent"));
        ((AbstractC6235j) this.f36719b.get("silent")).d("log", new P7(this, true, true));
        this.f36719b.put("unmonitored", new U6(this, "unmonitored"));
        ((AbstractC6235j) this.f36719b.get("unmonitored")).d("log", new P7(this, false, false));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6235j
    public final InterfaceC6289p c(C6157a2 c6157a2, List list) {
        return InterfaceC6289p.f36808x;
    }

    final /* synthetic */ InterfaceC6350v7 h() {
        return this.f36476c;
    }
}
