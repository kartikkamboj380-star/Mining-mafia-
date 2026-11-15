package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Vk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2557Vk extends com.google.android.gms.dynamic.c {
    public C2557Vk() {
        super("com.google.android.gms.ads.NativeAdViewHolderDelegateCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.c
    protected final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
        return iInterfaceQueryLocalInterface instanceof InterfaceC4273lk ? (InterfaceC4273lk) iInterfaceQueryLocalInterface : new C4147kk(iBinder);
    }
}
