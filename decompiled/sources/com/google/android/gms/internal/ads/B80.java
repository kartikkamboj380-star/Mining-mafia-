package com.google.android.gms.internal.ads;

import H4.C0654z;
import K4.AbstractC0786o0;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class B80 implements InterfaceC3065c70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f17514a;

    public B80(Map map) {
        this.f17514a = map;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3065c70
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        try {
            ((JSONObject) obj).put("video_decoders", C0654z.a().t(this.f17514a));
        } catch (JSONException e10) {
            AbstractC0786o0.k("Could not encode video decoder properties: ".concat(String.valueOf(e10.getMessage())));
        }
    }
}
