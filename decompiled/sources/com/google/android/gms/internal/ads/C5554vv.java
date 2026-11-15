package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.vv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5554vv implements InterfaceC2091Ml {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC5428uv f34188a;

    public C5554vv(InterfaceC5428uv interfaceC5428uv) {
        this.f34188a = interfaceC5428uv;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2091Ml
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        String str = (String) map.get(HandleInvocationsFromAdViewer.KEY_ACTION);
        if (str == null) {
            int i10 = AbstractC0786o0.f2696b;
            L4.p.f("Action missing from video GMSG.");
        } else if (str.equals("src")) {
            String str2 = (String) map.get("src");
            if (str2 != null) {
                this.f34188a.k(str2);
            } else {
                int i11 = AbstractC0786o0.f2696b;
                L4.p.f("src missing from video GMSG.");
            }
        }
    }
}
