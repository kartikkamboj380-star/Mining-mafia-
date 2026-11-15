package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;
import android.content.Context;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Em, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1678Em implements InterfaceC5078s8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile C4907qm f18561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f18562b;

    public C1678Em(Context context) {
        this.f18562b = context;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078s8
    public final C5456v8 a(AbstractC5960z8 abstractC5960z8) throws H8 {
        Parcelable.Creator<C5032rm> creator = C5032rm.CREATOR;
        Map mapN = abstractC5960z8.n();
        int size = mapN.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i10 = 0;
        for (Map.Entry entry : mapN.entrySet()) {
            strArr[i10] = (String) entry.getKey();
            strArr2[i10] = (String) entry.getValue();
            i10++;
        }
        C5032rm c5032rm = new C5032rm(abstractC5960z8.i(), strArr, strArr2);
        long jElapsedRealtime = G4.t.o().elapsedRealtime();
        try {
            C2575Vt c2575Vt = new C2575Vt();
            this.f18561a = new C4907qm(this.f18562b, G4.t.w().a(), new C1574Cm(this, c2575Vt), new C1626Dm(this, c2575Vt));
            this.f18561a.checkAvailabilityAndConnect();
            C1470Am c1470Am = new C1470Am(this, c5032rm);
            InterfaceExecutorServiceC1805Gx0 interfaceExecutorServiceC1805Gx0 = AbstractC2315Qt.f22473a;
            com.google.common.util.concurrent.p pVarI = AbstractC5685wx0.i(AbstractC5685wx0.j(c2575Vt, c1470Am, interfaceExecutorServiceC1805Gx0), ((Integer) H4.B.c().d(AbstractC3892ii.f29952r5)).intValue(), TimeUnit.MILLISECONDS, AbstractC2315Qt.f22476d);
            pVarI.e(new RunnableC1522Bm(this), interfaceExecutorServiceC1805Gx0);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) pVarI.get();
            long jElapsedRealtime2 = G4.t.o().elapsedRealtime() - jElapsedRealtime;
            StringBuilder sb = new StringBuilder(String.valueOf(jElapsedRealtime2).length() + 32);
            sb.append("Http assets remote cache took ");
            sb.append(jElapsedRealtime2);
            sb.append("ms");
            AbstractC0786o0.k(sb.toString());
            C5284tm c5284tm = (C5284tm) new C5168sr(parcelFileDescriptor).a(C5284tm.CREATOR);
            if (c5284tm == null) {
                return null;
            }
            if (c5284tm.f33475a) {
                throw new H8(c5284tm.f33476b);
            }
            String[] strArr3 = c5284tm.f33479e;
            String[] strArr4 = c5284tm.f33480f;
            if (strArr3.length != strArr4.length) {
                return null;
            }
            HashMap map = new HashMap();
            for (int i11 = 0; i11 < strArr3.length; i11++) {
                map.put(strArr3[i11], strArr4[i11]);
            }
            return new C5456v8(c5284tm.f33477c, c5284tm.f33478d, map, c5284tm.f33481g, c5284tm.f33482h);
        } catch (InterruptedException | ExecutionException unused) {
            long jElapsedRealtime3 = G4.t.o().elapsedRealtime() - jElapsedRealtime;
            StringBuilder sb2 = new StringBuilder(String.valueOf(jElapsedRealtime3).length() + 32);
            sb2.append("Http assets remote cache took ");
            sb2.append(jElapsedRealtime3);
            sb2.append("ms");
            AbstractC0786o0.k(sb2.toString());
            return null;
        } catch (Throwable th) {
            long jElapsedRealtime4 = G4.t.o().elapsedRealtime() - jElapsedRealtime;
            StringBuilder sb3 = new StringBuilder(String.valueOf(jElapsedRealtime4).length() + 32);
            sb3.append("Http assets remote cache took ");
            sb3.append(jElapsedRealtime4);
            sb3.append("ms");
            AbstractC0786o0.k(sb3.toString());
            throw th;
        }
    }

    final /* synthetic */ void b() {
        if (this.f18561a == null) {
            return;
        }
        this.f18561a.disconnect();
        Binder.flushPendingCommands();
    }

    final /* synthetic */ C4907qm c() {
        return this.f18561a;
    }
}
