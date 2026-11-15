package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class S70 implements InterfaceC3191d70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final InterfaceExecutorServiceC1805Gx0 f23135a;

    public S70(C2079Mf c2079Mf, InterfaceExecutorServiceC1805Gx0 interfaceExecutorServiceC1805Gx0, Context context) {
        this.f23135a = interfaceExecutorServiceC1805Gx0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3191d70
    public final com.google.common.util.concurrent.p zza() {
        return this.f23135a.e0(new Callable(this) { // from class: com.google.android.gms.internal.ads.R70
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return new T70(new JSONObject());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3191d70
    public final int zzb() {
        return 45;
    }
}
