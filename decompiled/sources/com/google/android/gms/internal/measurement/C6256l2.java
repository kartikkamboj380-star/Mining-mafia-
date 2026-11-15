package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.l2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C6256l2 extends AbstractC6187d5 implements G5 {
    /* synthetic */ C6256l2(byte[] bArr) {
        super(C6265m2.zzu);
    }

    public final String A() {
        return ((C6265m2) this.f36663b).O();
    }

    public final int s() {
        return ((C6265m2) this.f36663b).H();
    }

    public final C6247k2 t(int i10) {
        return ((C6265m2) this.f36663b).I(i10);
    }

    public final C6256l2 u(int i10, C6238j2 c6238j2) {
        l();
        ((C6265m2) this.f36663b).X(i10, (C6247k2) c6238j2.p());
        return this;
    }

    public final List w() {
        return Collections.unmodifiableList(((C6265m2) this.f36663b).K());
    }

    public final C6256l2 x() {
        l();
        ((C6265m2) this.f36663b).Y();
        return this;
    }

    public final C6256l2 y() {
        l();
        ((C6265m2) this.f36663b).Z();
        return this;
    }

    public final List z() {
        return Collections.unmodifiableList(((C6265m2) this.f36663b).N());
    }
}
