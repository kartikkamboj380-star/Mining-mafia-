package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Kj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class BinderC1984Kj extends AbstractBinderC2711Yj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Drawable f20264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Uri f20265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f20266c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f20267d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f20268e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f20269f;

    public BinderC1984Kj(Drawable drawable, Uri uri, double d10, int i10, int i11, Map map) {
        this.f20264a = drawable;
        this.f20265b = uri;
        this.f20266c = d10;
        this.f20267d = i10;
        this.f20268e = i11;
        this.f20269f = map;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2763Zj
    public final int b() {
        return this.f20268e;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2763Zj
    public final com.google.android.gms.dynamic.a zzb() {
        return com.google.android.gms.dynamic.b.N0(this.f20264a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2763Zj
    public final Uri zzc() {
        return this.f20265b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2763Zj
    public final double zzd() {
        return this.f20266c;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2763Zj
    public final int zze() {
        return this.f20267d;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2763Zj
    public final Map zzg() {
        return this.f20269f;
    }
}
