package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ts, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class BinderC5296ts extends AbstractBinderC2675Xr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f33508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f33509b;

    public BinderC5296ts(U4.b bVar) {
        this(bVar != null ? bVar.getType() : "", bVar != null ? bVar.a() : 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2727Yr
    public final int b() {
        return this.f33509b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2727Yr
    public final String zze() {
        return this.f33508a;
    }

    public BinderC5296ts(String str, int i10) {
        this.f33508a = str;
        this.f33509b = i10;
    }
}
