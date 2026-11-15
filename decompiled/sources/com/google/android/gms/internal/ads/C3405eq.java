package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.eq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3405eq extends NativeAd.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC2763Zj f28079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Drawable f28080c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Uri f28081d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final double f28082e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f28083f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f28084g;

    public C3405eq(InterfaceC2763Zj interfaceC2763Zj) {
        Drawable drawable;
        Uri uriZzc;
        double dZzd;
        int iZze;
        this.f28079b = interfaceC2763Zj;
        Map mapZzg = null;
        try {
            com.google.android.gms.dynamic.a aVarZzb = interfaceC2763Zj.zzb();
            drawable = aVarZzb != null ? (Drawable) com.google.android.gms.dynamic.b.h0(aVarZzb) : null;
        } catch (RemoteException e10) {
            L4.p.d("", e10);
        }
        this.f28080c = drawable;
        try {
            uriZzc = this.f28079b.zzc();
        } catch (RemoteException e11) {
            L4.p.d("", e11);
            uriZzc = null;
        }
        this.f28081d = uriZzc;
        try {
            dZzd = this.f28079b.zzd();
        } catch (RemoteException e12) {
            L4.p.d("", e12);
            dZzd = 1.0d;
        }
        this.f28082e = dZzd;
        int iB = -1;
        try {
            iZze = this.f28079b.zze();
        } catch (RemoteException e13) {
            L4.p.d("", e13);
            iZze = -1;
        }
        this.f28083f = iZze;
        try {
            iB = this.f28079b.b();
        } catch (RemoteException e14) {
            L4.p.d("", e14);
        }
        this.f28084g = iB;
        if (((Boolean) H4.B.c().d(AbstractC3892ii.f29644O4)).booleanValue()) {
            try {
                mapZzg = this.f28079b.zzg();
            } catch (RemoteException unused) {
            }
        }
        this.f16880a = mapZzg;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.b
    public final Drawable a() {
        return this.f28080c;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.b
    public final double b() {
        return this.f28082e;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.b
    public final Uri c() {
        return this.f28081d;
    }
}
