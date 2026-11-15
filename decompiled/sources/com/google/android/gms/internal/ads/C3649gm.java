package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;
import android.text.TextUtils;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.gm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3649gm implements InterfaceC2091Ml {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3397em f28729a;

    public C3649gm(InterfaceC3397em interfaceC3397em) {
        this.f28729a = interfaceC3397em;
    }

    public static void b(InterfaceC1750Fw interfaceC1750Fw, InterfaceC3397em interfaceC3397em) {
        interfaceC1750Fw.c0("/reward", new C3649gm(interfaceC3397em));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2091Ml
    public final void a(Object obj, Map map) {
        String str = (String) map.get(HandleInvocationsFromAdViewer.KEY_ACTION);
        if (!"grant".equals(str)) {
            if ("video_start".equals(str)) {
                this.f28729a.zza();
                return;
            } else {
                if ("video_complete".equals(str)) {
                    this.f28729a.zzc();
                    return;
                }
                return;
            }
        }
        C2519Ur c2519Ur = null;
        try {
            int i10 = Integer.parseInt((String) map.get("amount"));
            String str2 = (String) map.get(HandleInvocationsFromAdViewer.KEY_AD_TYPE);
            if (!TextUtils.isEmpty(str2)) {
                c2519Ur = new C2519Ur(str2, i10);
            }
        } catch (NumberFormatException e10) {
            int i11 = AbstractC0786o0.f2696b;
            L4.p.g("Unable to parse reward amount.", e10);
        }
        this.f28729a.X0(c2519Ur);
    }
}
