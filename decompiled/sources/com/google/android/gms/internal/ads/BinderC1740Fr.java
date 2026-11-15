package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Fr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class BinderC1740Fr extends AbstractBinderC1844Hr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f18849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f18850b;

    public BinderC1740Fr(String str, int i10) {
        this.f18849a = str;
        this.f18850b = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BinderC1740Fr)) {
            return false;
        }
        BinderC1740Fr binderC1740Fr = (BinderC1740Fr) obj;
        if (Objects.equal(this.f18849a, binderC1740Fr.f18849a)) {
            if (Objects.equal(Integer.valueOf(this.f18850b), Integer.valueOf(binderC1740Fr.f18850b))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1896Ir
    public final String zzb() {
        return this.f18849a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1896Ir
    public final int zzc() {
        return this.f18850b;
    }
}
