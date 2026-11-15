package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.tenjin.android.config.TenjinConsts;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.cM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3094cM implements InterfaceC2091Ml {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference f27099a;

    @Override // com.google.android.gms.internal.ads.InterfaceC2091Ml
    public final void a(Object obj, Map map) {
        C3723hM c3723hM = (C3723hM) this.f27099a.get();
        if (c3723hM != null && "_ac".equals((String) map.get(TenjinConsts.EVENT_NAME))) {
            c3723hM.x().onAdClicked();
            if (((Boolean) H4.B.c().d(AbstractC3892ii.kc)).booleanValue()) {
                c3723hM.y().t0();
                if (TextUtils.isEmpty((CharSequence) map.get("sccg"))) {
                    return;
                }
                c3723hM.y().F0();
            }
        }
    }
}
