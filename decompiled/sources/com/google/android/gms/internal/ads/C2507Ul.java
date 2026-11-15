package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;
import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ul, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2507Ul implements InterfaceC2091Ml {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C5496vS f24082a;

    public C2507Ul(C5496vS c5496vS) {
        this.f24082a = c5496vS;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2091Ml
    public final void a(Object obj, Map map) {
        if (map == null || !map.containsKey("id") || TextUtils.isEmpty((CharSequence) map.get("id")) || !map.containsKey("event_type") || TextUtils.isEmpty((CharSequence) map.get("event_type"))) {
            AbstractC0786o0.k("Ignoring onDeviceStorageEvent GMSG: missing required parameters.");
            return;
        }
        try {
            this.f24082a.a(Long.parseLong((String) map.get("id")), Integer.parseInt((String) map.get("event_type")), G4.t.o().currentTimeMillis());
        } catch (NumberFormatException e10) {
            AbstractC0786o0.l("Ignoring onDeviceStorageEvent GMSG: invalid number format for ID or eventType.", e10);
        }
    }
}
