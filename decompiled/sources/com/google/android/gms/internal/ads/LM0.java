package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class LM0 extends AbstractC4350mL0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final NM0 f20433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    InterfaceC4602oL0 f20434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ OM0 f20435c;

    LM0(OM0 om0) {
        Objects.requireNonNull(om0);
        this.f20435c = om0;
        this.f20433a = new NM0(om0, null);
        this.f20434b = a();
    }

    private final InterfaceC4602oL0 a() {
        NM0 nm0 = this.f20433a;
        if (nm0.hasNext()) {
            return nm0.next().iterator();
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f20434b != null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4602oL0
    public final byte zza() {
        InterfaceC4602oL0 interfaceC4602oL0 = this.f20434b;
        if (interfaceC4602oL0 == null) {
            throw new NoSuchElementException();
        }
        byte bZza = interfaceC4602oL0.zza();
        if (!this.f20434b.hasNext()) {
            this.f20434b = a();
        }
        return bZza;
    }
}
