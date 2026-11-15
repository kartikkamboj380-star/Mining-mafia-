package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ak, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2891ak extends E4.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC2763Zj f26611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Drawable f26612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Uri f26613c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final double f26614d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f26615e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f26616f;

    public C2891ak(InterfaceC2763Zj interfaceC2763Zj) {
        Drawable drawable;
        double dZzd;
        int iZze;
        this.f26611a = interfaceC2763Zj;
        Uri uriZzc = null;
        try {
            com.google.android.gms.dynamic.a aVarZzb = interfaceC2763Zj.zzb();
            drawable = aVarZzb != null ? (Drawable) com.google.android.gms.dynamic.b.h0(aVarZzb) : null;
        } catch (RemoteException e10) {
            L4.p.d("", e10);
        }
        this.f26612b = drawable;
        try {
            uriZzc = this.f26611a.zzc();
        } catch (RemoteException e11) {
            L4.p.d("", e11);
        }
        this.f26613c = uriZzc;
        try {
            dZzd = this.f26611a.zzd();
        } catch (RemoteException e12) {
            L4.p.d("", e12);
            dZzd = 1.0d;
        }
        this.f26614d = dZzd;
        int iB = -1;
        try {
            iZze = this.f26611a.zze();
        } catch (RemoteException e13) {
            L4.p.d("", e13);
            iZze = -1;
        }
        this.f26615e = iZze;
        try {
            iB = this.f26611a.b();
        } catch (RemoteException e14) {
            L4.p.d("", e14);
        }
        this.f26616f = iB;
    }

    @Override // E4.d
    public final Drawable a() {
        return this.f26612b;
    }

    @Override // E4.d
    public final double b() {
        return this.f26614d;
    }

    @Override // E4.d
    public final Uri c() {
        return this.f26613c;
    }

    @Override // E4.d
    public final int d() {
        return this.f26615e;
    }

    @Override // E4.d
    public final int e() {
        return this.f26616f;
    }
}
