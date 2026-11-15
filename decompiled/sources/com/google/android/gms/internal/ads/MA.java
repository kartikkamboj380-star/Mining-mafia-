package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class MA implements InterfaceC4705pA {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CookieManager f20781a;

    public MA(Context context) {
        this.f20781a = G4.t.j().a(context);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4705pA
    public final void a(Map map) {
        CookieManager cookieManager = this.f20781a;
        if (cookieManager == null) {
            return;
        }
        if (((String) map.get("clear")) == null) {
            String str = (String) map.get("cookie");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            cookieManager.setCookie((String) H4.B.c().d(AbstractC3892ii.f29981u1), str);
            return;
        }
        String str2 = (String) H4.B.c().d(AbstractC3892ii.f29981u1);
        String cookie = cookieManager.getCookie(str2);
        if (cookie != null) {
            List listE = C3790ht0.a(AbstractC1743Fs0.b(';')).e(cookie);
            for (int i10 = 0; i10 < listE.size(); i10++) {
                Iterator it = C3790ht0.a(AbstractC1743Fs0.b('=')).d((String) listE.get(i10)).iterator();
                it.getClass();
                if (!it.hasNext()) {
                    StringBuilder sb = new StringBuilder(String.valueOf(0).length() + 70);
                    sb.append("position (0) must be less than the number of elements that remained (");
                    sb.append(0);
                    sb.append(")");
                    throw new IndexOutOfBoundsException(sb.toString());
                }
                cookieManager.setCookie(str2, String.valueOf((String) it.next()).concat(String.valueOf((String) H4.B.c().d(AbstractC3892ii.f29827g1))));
            }
        }
    }
}
