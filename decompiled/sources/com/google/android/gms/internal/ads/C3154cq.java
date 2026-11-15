package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.cq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3154cq extends NativeAd.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f27228a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f27229b;

    public C3154cq(InterfaceC2399Sj interfaceC2399Sj) {
        try {
            this.f27229b = interfaceC2399Sj.zzb();
        } catch (RemoteException e10) {
            L4.p.d("", e10);
            this.f27229b = "";
        }
        try {
            for (Object obj : interfaceC2399Sj.zzc()) {
                InterfaceC2763Zj interfaceC2763ZjY6 = obj instanceof IBinder ? AbstractBinderC2711Yj.y6((IBinder) obj) : null;
                if (interfaceC2763ZjY6 != null) {
                    this.f27228a.add(new C3405eq(interfaceC2763ZjY6));
                }
            }
        } catch (RemoteException e11) {
            L4.p.d("", e11);
        }
    }
}
