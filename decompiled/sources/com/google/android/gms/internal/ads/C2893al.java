package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;
import android.os.Bundle;
import app.notifee.core.event.LogEvent;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.al, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2893al implements InterfaceC2091Ml {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3019bl f26619a;

    public C2893al(InterfaceC3019bl interfaceC3019bl) {
        this.f26619a = interfaceC3019bl;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2091Ml
    public final void a(Object obj, Map map) {
        if (this.f26619a == null) {
            return;
        }
        String str = (String) map.get(MediationMetaData.KEY_NAME);
        if (str == null) {
            int i10 = AbstractC0786o0.f2696b;
            L4.p.e("Ad metadata with no name parameter.");
            str = "";
        }
        Bundle bundleL = null;
        if (map.containsKey(LogEvent.LEVEL_INFO)) {
            try {
                bundleL = K4.S.l(new JSONObject((String) map.get(LogEvent.LEVEL_INFO)));
            } catch (JSONException e10) {
                int i11 = AbstractC0786o0.f2696b;
                L4.p.d("Failed to convert ad metadata to JSON.", e10);
            }
        }
        if (bundleL != null) {
            this.f26619a.v(str, bundleL);
        } else {
            int i12 = AbstractC0786o0.f2696b;
            L4.p.c("Failed to convert ad metadata to Bundle.");
        }
    }
}
