package com.google.android.gms.ads.internal.overlay;

import G4.l;
import G4.t;
import H4.InterfaceC0580a;
import J4.B;
import J4.InterfaceC0742e;
import J4.m;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ads.AbstractC2315Qt;
import com.google.android.gms.internal.ads.AbstractC3892ii;
import com.google.android.gms.internal.ads.C4339mG;
import com.google.android.gms.internal.ads.InterfaceC1750Fw;
import com.google.android.gms.internal.ads.InterfaceC3019bl;
import com.google.android.gms.internal.ads.InterfaceC3270dl;
import com.google.android.gms.internal.ads.InterfaceC4033jq;
import com.google.android.gms.internal.ads.InterfaceC4599oK;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
@SafeParcelable.Class(creator = "AdOverlayInfoCreator")
@SafeParcelable.Reserved({1})
public final class AdOverlayInfoParcel extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<AdOverlayInfoParcel> CREATOR = new a();

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private static final AtomicLong f16831P = new AtomicLong(0);

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private static final ConcurrentHashMap f16832Q = new ConcurrentHashMap();

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final InterfaceC3019bl f16833G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final String f16834H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final String f16835I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final String f16836J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final C4339mG f16837K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final InterfaceC4599oK f16838L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final InterfaceC4033jq f16839M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final boolean f16840N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final long f16841O;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f16842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC0580a f16843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final B f16844c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC1750Fw f16845d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC3270dl f16846e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f16847f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f16848g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f16849h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final InterfaceC0742e f16850i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f16851j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f16852k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f16853l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final L4.a f16854m;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f16855v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final l f16856w;

    public AdOverlayInfoParcel(InterfaceC0580a interfaceC0580a, B b10, InterfaceC3019bl interfaceC3019bl, InterfaceC3270dl interfaceC3270dl, InterfaceC0742e interfaceC0742e, InterfaceC1750Fw interfaceC1750Fw, boolean z9, int i10, String str, L4.a aVar, InterfaceC4599oK interfaceC4599oK, InterfaceC4033jq interfaceC4033jq, boolean z10) {
        this.f16842a = null;
        this.f16843b = interfaceC0580a;
        this.f16844c = b10;
        this.f16845d = interfaceC1750Fw;
        this.f16833G = interfaceC3019bl;
        this.f16846e = interfaceC3270dl;
        this.f16847f = null;
        this.f16848g = z9;
        this.f16849h = null;
        this.f16850i = interfaceC0742e;
        this.f16851j = i10;
        this.f16852k = 3;
        this.f16853l = str;
        this.f16854m = aVar;
        this.f16855v = null;
        this.f16856w = null;
        this.f16834H = null;
        this.f16835I = null;
        this.f16836J = null;
        this.f16837K = null;
        this.f16838L = interfaceC4599oK;
        this.f16839M = interfaceC4033jq;
        this.f16840N = z10;
        this.f16841O = f16831P.getAndIncrement();
    }

    public static AdOverlayInfoParcel a(Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            return (AdOverlayInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        } catch (Exception e10) {
            if (!((Boolean) H4.B.c().d(AbstractC3892ii.ue)).booleanValue()) {
                return null;
            }
            t.l().j(e10, "AdOverlayInfoParcel.getFromIntent");
            return null;
        }
    }

    private static final IBinder v(Object obj) {
        if (((Boolean) H4.B.c().d(AbstractC3892ii.ue)).booleanValue()) {
            return null;
        }
        return com.google.android.gms.dynamic.b.N0(obj).asBinder();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f16842a, i10, false);
        InterfaceC0580a interfaceC0580a = this.f16843b;
        SafeParcelWriter.writeIBinder(parcel, 3, v(interfaceC0580a), false);
        B b10 = this.f16844c;
        SafeParcelWriter.writeIBinder(parcel, 4, v(b10), false);
        InterfaceC1750Fw interfaceC1750Fw = this.f16845d;
        SafeParcelWriter.writeIBinder(parcel, 5, v(interfaceC1750Fw), false);
        InterfaceC3270dl interfaceC3270dl = this.f16846e;
        SafeParcelWriter.writeIBinder(parcel, 6, v(interfaceC3270dl), false);
        SafeParcelWriter.writeString(parcel, 7, this.f16847f, false);
        SafeParcelWriter.writeBoolean(parcel, 8, this.f16848g);
        SafeParcelWriter.writeString(parcel, 9, this.f16849h, false);
        InterfaceC0742e interfaceC0742e = this.f16850i;
        SafeParcelWriter.writeIBinder(parcel, 10, v(interfaceC0742e), false);
        SafeParcelWriter.writeInt(parcel, 11, this.f16851j);
        SafeParcelWriter.writeInt(parcel, 12, this.f16852k);
        SafeParcelWriter.writeString(parcel, 13, this.f16853l, false);
        SafeParcelWriter.writeParcelable(parcel, 14, this.f16854m, i10, false);
        SafeParcelWriter.writeString(parcel, 16, this.f16855v, false);
        SafeParcelWriter.writeParcelable(parcel, 17, this.f16856w, i10, false);
        InterfaceC3019bl interfaceC3019bl = this.f16833G;
        SafeParcelWriter.writeIBinder(parcel, 18, v(interfaceC3019bl), false);
        SafeParcelWriter.writeString(parcel, 19, this.f16834H, false);
        SafeParcelWriter.writeString(parcel, 24, this.f16835I, false);
        SafeParcelWriter.writeString(parcel, 25, this.f16836J, false);
        C4339mG c4339mG = this.f16837K;
        SafeParcelWriter.writeIBinder(parcel, 26, v(c4339mG), false);
        InterfaceC4599oK interfaceC4599oK = this.f16838L;
        SafeParcelWriter.writeIBinder(parcel, 27, v(interfaceC4599oK), false);
        InterfaceC4033jq interfaceC4033jq = this.f16839M;
        SafeParcelWriter.writeIBinder(parcel, 28, v(interfaceC4033jq), false);
        SafeParcelWriter.writeBoolean(parcel, 29, this.f16840N);
        long j10 = this.f16841O;
        SafeParcelWriter.writeLong(parcel, 30, j10);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
        if (((Boolean) H4.B.c().d(AbstractC3892ii.ue)).booleanValue()) {
            f16832Q.put(Long.valueOf(j10), new b(interfaceC0580a, b10, interfaceC1750Fw, interfaceC3019bl, interfaceC3270dl, interfaceC0742e, c4339mG, interfaceC4599oK, interfaceC4033jq, AbstractC2315Qt.f22476d.schedule(new c(j10), ((Integer) H4.B.c().d(AbstractC3892ii.we)).intValue(), TimeUnit.SECONDS)));
        }
    }

    public AdOverlayInfoParcel(InterfaceC0580a interfaceC0580a, B b10, InterfaceC3019bl interfaceC3019bl, InterfaceC3270dl interfaceC3270dl, InterfaceC0742e interfaceC0742e, InterfaceC1750Fw interfaceC1750Fw, boolean z9, int i10, String str, String str2, L4.a aVar, InterfaceC4599oK interfaceC4599oK, InterfaceC4033jq interfaceC4033jq) {
        this.f16842a = null;
        this.f16843b = interfaceC0580a;
        this.f16844c = b10;
        this.f16845d = interfaceC1750Fw;
        this.f16833G = interfaceC3019bl;
        this.f16846e = interfaceC3270dl;
        this.f16847f = str2;
        this.f16848g = z9;
        this.f16849h = str;
        this.f16850i = interfaceC0742e;
        this.f16851j = i10;
        this.f16852k = 3;
        this.f16853l = null;
        this.f16854m = aVar;
        this.f16855v = null;
        this.f16856w = null;
        this.f16834H = null;
        this.f16835I = null;
        this.f16836J = null;
        this.f16837K = null;
        this.f16838L = interfaceC4599oK;
        this.f16839M = interfaceC4033jq;
        this.f16840N = false;
        this.f16841O = f16831P.getAndIncrement();
    }

    public AdOverlayInfoParcel(InterfaceC0580a interfaceC0580a, B b10, InterfaceC0742e interfaceC0742e, InterfaceC1750Fw interfaceC1750Fw, int i10, L4.a aVar, String str, l lVar, String str2, String str3, String str4, C4339mG c4339mG, InterfaceC4033jq interfaceC4033jq, String str5) {
        this.f16842a = null;
        this.f16843b = null;
        this.f16844c = b10;
        this.f16845d = interfaceC1750Fw;
        this.f16833G = null;
        this.f16846e = null;
        this.f16848g = false;
        if (((Boolean) H4.B.c().d(AbstractC3892ii.f29926p1)).booleanValue()) {
            this.f16847f = null;
            this.f16849h = null;
        } else {
            this.f16847f = str2;
            this.f16849h = str3;
        }
        this.f16850i = null;
        this.f16851j = i10;
        this.f16852k = 1;
        this.f16853l = null;
        this.f16854m = aVar;
        this.f16855v = str;
        this.f16856w = lVar;
        this.f16834H = str5;
        this.f16835I = null;
        this.f16836J = str4;
        this.f16837K = c4339mG;
        this.f16838L = null;
        this.f16839M = interfaceC4033jq;
        this.f16840N = false;
        this.f16841O = f16831P.getAndIncrement();
    }

    public AdOverlayInfoParcel(InterfaceC0580a interfaceC0580a, B b10, InterfaceC0742e interfaceC0742e, InterfaceC1750Fw interfaceC1750Fw, boolean z9, int i10, L4.a aVar, InterfaceC4599oK interfaceC4599oK, InterfaceC4033jq interfaceC4033jq) {
        this.f16842a = null;
        this.f16843b = interfaceC0580a;
        this.f16844c = b10;
        this.f16845d = interfaceC1750Fw;
        this.f16833G = null;
        this.f16846e = null;
        this.f16847f = null;
        this.f16848g = z9;
        this.f16849h = null;
        this.f16850i = interfaceC0742e;
        this.f16851j = i10;
        this.f16852k = 2;
        this.f16853l = null;
        this.f16854m = aVar;
        this.f16855v = null;
        this.f16856w = null;
        this.f16834H = null;
        this.f16835I = null;
        this.f16836J = null;
        this.f16837K = null;
        this.f16838L = interfaceC4599oK;
        this.f16839M = interfaceC4033jq;
        this.f16840N = false;
        this.f16841O = f16831P.getAndIncrement();
    }

    AdOverlayInfoParcel(m mVar, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4, String str, boolean z9, String str2, IBinder iBinder5, int i10, int i11, String str3, L4.a aVar, String str4, l lVar, IBinder iBinder6, String str5, String str6, String str7, IBinder iBinder7, IBinder iBinder8, IBinder iBinder9, boolean z10, long j10) {
        this.f16842a = mVar;
        this.f16847f = str;
        this.f16848g = z9;
        this.f16849h = str2;
        this.f16851j = i10;
        this.f16852k = i11;
        this.f16853l = str3;
        this.f16854m = aVar;
        this.f16855v = str4;
        this.f16856w = lVar;
        this.f16834H = str5;
        this.f16835I = str6;
        this.f16836J = str7;
        this.f16840N = z10;
        this.f16841O = j10;
        if (((Boolean) H4.B.c().d(AbstractC3892ii.ue)).booleanValue()) {
            b bVar = (b) f16832Q.remove(Long.valueOf(j10));
            if (bVar != null) {
                this.f16843b = bVar.a();
                this.f16844c = bVar.b();
                this.f16845d = bVar.c();
                this.f16833G = bVar.d();
                this.f16846e = bVar.e();
                this.f16837K = bVar.g();
                this.f16838L = bVar.h();
                this.f16839M = bVar.i();
                this.f16850i = bVar.f();
                bVar.j().cancel(false);
                return;
            }
            throw new NullPointerException("AdOverlayObjects is null");
        }
        this.f16843b = (InterfaceC0580a) com.google.android.gms.dynamic.b.h0(com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(iBinder));
        this.f16844c = (B) com.google.android.gms.dynamic.b.h0(com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(iBinder2));
        this.f16845d = (InterfaceC1750Fw) com.google.android.gms.dynamic.b.h0(com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(iBinder3));
        this.f16833G = (InterfaceC3019bl) com.google.android.gms.dynamic.b.h0(com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(iBinder6));
        this.f16846e = (InterfaceC3270dl) com.google.android.gms.dynamic.b.h0(com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(iBinder4));
        this.f16850i = (InterfaceC0742e) com.google.android.gms.dynamic.b.h0(com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(iBinder5));
        this.f16837K = (C4339mG) com.google.android.gms.dynamic.b.h0(com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(iBinder7));
        this.f16838L = (InterfaceC4599oK) com.google.android.gms.dynamic.b.h0(com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(iBinder8));
        this.f16839M = (InterfaceC4033jq) com.google.android.gms.dynamic.b.h0(com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(iBinder9));
    }

    public AdOverlayInfoParcel(m mVar, InterfaceC0580a interfaceC0580a, B b10, InterfaceC0742e interfaceC0742e, L4.a aVar, InterfaceC1750Fw interfaceC1750Fw, InterfaceC4599oK interfaceC4599oK, String str) {
        this.f16842a = mVar;
        this.f16843b = interfaceC0580a;
        this.f16844c = b10;
        this.f16845d = interfaceC1750Fw;
        this.f16833G = null;
        this.f16846e = null;
        this.f16847f = null;
        this.f16848g = false;
        this.f16849h = null;
        this.f16850i = interfaceC0742e;
        this.f16851j = -1;
        this.f16852k = 4;
        this.f16853l = null;
        this.f16854m = aVar;
        this.f16855v = null;
        this.f16856w = null;
        this.f16834H = str;
        this.f16835I = null;
        this.f16836J = null;
        this.f16837K = null;
        this.f16838L = interfaceC4599oK;
        this.f16839M = null;
        this.f16840N = false;
        this.f16841O = f16831P.getAndIncrement();
    }

    public AdOverlayInfoParcel(B b10, InterfaceC1750Fw interfaceC1750Fw, int i10, L4.a aVar) {
        this.f16844c = b10;
        this.f16845d = interfaceC1750Fw;
        this.f16851j = 1;
        this.f16854m = aVar;
        this.f16842a = null;
        this.f16843b = null;
        this.f16833G = null;
        this.f16846e = null;
        this.f16847f = null;
        this.f16848g = false;
        this.f16849h = null;
        this.f16850i = null;
        this.f16852k = 1;
        this.f16853l = null;
        this.f16855v = null;
        this.f16856w = null;
        this.f16834H = null;
        this.f16835I = null;
        this.f16836J = null;
        this.f16837K = null;
        this.f16838L = null;
        this.f16839M = null;
        this.f16840N = false;
        this.f16841O = f16831P.getAndIncrement();
    }

    public AdOverlayInfoParcel(InterfaceC1750Fw interfaceC1750Fw, L4.a aVar, String str, String str2, int i10, InterfaceC4033jq interfaceC4033jq) {
        this.f16842a = null;
        this.f16843b = null;
        this.f16844c = null;
        this.f16845d = interfaceC1750Fw;
        this.f16833G = null;
        this.f16846e = null;
        this.f16847f = null;
        this.f16848g = false;
        this.f16849h = null;
        this.f16850i = null;
        this.f16851j = 14;
        this.f16852k = 5;
        this.f16853l = null;
        this.f16854m = aVar;
        this.f16855v = null;
        this.f16856w = null;
        this.f16834H = str;
        this.f16835I = str2;
        this.f16836J = null;
        this.f16837K = null;
        this.f16838L = null;
        this.f16839M = interfaceC4033jq;
        this.f16840N = false;
        this.f16841O = f16831P.getAndIncrement();
    }
}
