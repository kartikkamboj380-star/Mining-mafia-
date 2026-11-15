package com.google.ads.mediation.unity;

import android.content.Context;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.metadata.MediationMetaData;

/* JADX INFO: loaded from: classes2.dex */
public class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static f f16755b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f16756a = new c();

    private f() {
    }

    static synchronized f a() {
        try {
            if (f16755b == null) {
                f16755b = new f();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f16755b;
    }

    public void b(Context context, String str, IUnityAdsInitializationListener iUnityAdsInitializationListener) {
        if (this.f16756a.f()) {
            iUnityAdsInitializationListener.onInitializationComplete();
            return;
        }
        MediationMetaData mediationMetaDataA = this.f16756a.a(context);
        mediationMetaDataA.setName("AdMob");
        mediationMetaDataA.setVersion(this.f16756a.d());
        mediationMetaDataA.set("adapter_version", "4.16.6.0");
        mediationMetaDataA.commit();
        this.f16756a.e(context, str, iUnityAdsInitializationListener);
    }
}
