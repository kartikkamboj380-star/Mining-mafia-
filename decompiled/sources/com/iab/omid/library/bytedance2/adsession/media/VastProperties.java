package com.iab.omid.library.bytedance2.adsession.media;

import com.iab.omid.library.bytedance2.utils.d;
import com.iab.omid.library.bytedance2.utils.g;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class VastProperties {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f41745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Float f41746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f41747c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Position f41748d;

    private VastProperties(boolean z9, Float f10, boolean z10, Position position) {
        this.f41745a = z9;
        this.f41746b = f10;
        this.f41747c = z10;
        this.f41748d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z9, Position position) {
        g.a(position, "Position is null");
        return new VastProperties(false, null, z9, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f10, boolean z9, Position position) {
        g.a(position, "Position is null");
        return new VastProperties(true, Float.valueOf(f10), z9, position);
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f41745a);
            if (this.f41745a) {
                jSONObject.put("skipOffset", this.f41746b);
            }
            jSONObject.put("autoPlay", this.f41747c);
            jSONObject.put("position", this.f41748d);
            return jSONObject;
        } catch (JSONException e10) {
            d.a("VastProperties: JSON error", e10);
            return jSONObject;
        }
    }

    public Position getPosition() {
        return this.f41748d;
    }

    public Float getSkipOffset() {
        return this.f41746b;
    }

    public boolean isAutoPlay() {
        return this.f41747c;
    }

    public boolean isSkippable() {
        return this.f41745a;
    }
}
