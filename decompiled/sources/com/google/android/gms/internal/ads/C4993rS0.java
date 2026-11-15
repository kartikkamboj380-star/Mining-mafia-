package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.rS0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C4993rS0 implements InterfaceC3986jS0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5007rZ0 f32903a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f32906d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f32907e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f32905c = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f32904b = new Object();

    public C4993rS0(InterfaceC5889yZ0 interfaceC5889yZ0, boolean z9) {
        this.f32903a = new C5007rZ0(interfaceC5889yZ0, z9);
    }

    public final void a(int i10) {
        this.f32906d = i10;
        this.f32907e = false;
        this.f32905c.clear();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3986jS0
    public final Object zza() {
        return this.f32904b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3986jS0
    public final AbstractC5270tf zzb() {
        return this.f32903a.M();
    }
}
