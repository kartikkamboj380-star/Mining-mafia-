package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.ViewGroup;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.lN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C4227lN implements InterfaceC2087Mj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ NN f31256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ ViewGroup f31257b;

    C4227lN(NN nn, ViewGroup viewGroup) {
        this.f31256a = nn;
        this.f31257b = viewGroup;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2087Mj
    public final void a(MotionEvent motionEvent) {
        this.f31256a.onTouch(null, motionEvent);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2087Mj
    public final void zza() {
        AbstractC5931yu0 abstractC5931yu0 = ViewTreeObserverOnGlobalLayoutListenerC4101kN.f30763w;
        NN nn = this.f31256a;
        Map mapZzk = nn.zzk();
        if (mapZzk == null) {
            return;
        }
        int size = abstractC5931yu0.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = mapZzk.get((String) abstractC5931yu0.get(i10));
            i10++;
            if (obj != null) {
                nn.onClick(this.f31257b);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2087Mj
    public final JSONObject zzc() {
        return this.f31256a.h();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2087Mj
    public final JSONObject zzd() {
        return this.f31256a.a();
    }
}
