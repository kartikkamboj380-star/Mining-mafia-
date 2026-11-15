package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Tj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2451Tj extends E4.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC2399Sj f23597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f23598b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f23599c;

    public C2451Tj(InterfaceC2399Sj interfaceC2399Sj) {
        IBinder iBinder;
        this.f23597a = interfaceC2399Sj;
        try {
            this.f23599c = interfaceC2399Sj.zzb();
        } catch (RemoteException e10) {
            L4.p.d("", e10);
            this.f23599c = "";
        }
        try {
            for (Object obj : interfaceC2399Sj.zzc()) {
                InterfaceC2763Zj c2659Xj = null;
                if ((obj instanceof IBinder) && (iBinder = (IBinder) obj) != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                    c2659Xj = iInterfaceQueryLocalInterface instanceof InterfaceC2763Zj ? (InterfaceC2763Zj) iInterfaceQueryLocalInterface : new C2659Xj(iBinder);
                }
                if (c2659Xj != null) {
                    this.f23598b.add(new C2891ak(c2659Xj));
                }
            }
        } catch (RemoteException e11) {
            L4.p.d("", e11);
        }
    }
}
