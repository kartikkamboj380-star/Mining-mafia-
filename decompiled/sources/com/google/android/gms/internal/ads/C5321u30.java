package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.tenjin.android.config.TenjinConsts;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.u30, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5321u30 implements InterfaceC3191d70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f33725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceExecutorServiceC1805Gx0 f33726b;

    C5321u30(InterfaceExecutorServiceC1805Gx0 interfaceExecutorServiceC1805Gx0, Context context) {
        this.f33726b = interfaceExecutorServiceC1805Gx0;
        this.f33725a = context;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3191d70
    public final com.google.common.util.concurrent.p zza() {
        if (!((Boolean) H4.B.c().d(AbstractC3892ii.se)).booleanValue()) {
            return AbstractC5685wx0.a(new C5447v30(null, false));
        }
        final ContentResolver contentResolver = this.f33725a.getContentResolver();
        return contentResolver == null ? AbstractC5685wx0.a(new C5447v30(null, false)) : this.f33726b.e0(new Callable() { // from class: com.google.android.gms.internal.ads.t30
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                ContentResolver contentResolver2 = contentResolver;
                return new C5447v30(Settings.Secure.getString(contentResolver2, TenjinConsts.ATTR_PARAM_ADVERTISING_ID), Settings.Secure.getInt(contentResolver2, "limit_ad_tracking", 0) == 1);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3191d70
    public final int zzb() {
        return 61;
    }
}
