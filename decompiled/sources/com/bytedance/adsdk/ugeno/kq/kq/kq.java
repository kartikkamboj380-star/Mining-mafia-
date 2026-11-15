package com.bytedance.adsdk.ugeno.kq.kq;

import android.animation.PropertyValuesHolder;
import android.graphics.Canvas;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class kq {
    private String bob;
    protected JSONObject kq;
    protected com.bytedance.adsdk.ugeno.oq.bob oq;

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.kq.kq.kq$kq, reason: collision with other inner class name */
    public static class C0229kq {
        public static kq kq(com.bytedance.adsdk.ugeno.oq.bob bobVar, JSONObject jSONObject) {
            if (bobVar == null || jSONObject == null) {
                return null;
            }
            String strOptString = jSONObject.optString(HandleInvocationsFromAdViewer.KEY_AD_TYPE);
            strOptString.getClass();
            switch (strOptString) {
                case "stretch":
                    return new csi(bobVar, jSONObject);
                case "ripple":
                    return new oq(bobVar, jSONObject);
                case "rub_in":
                    return new bob(bobVar, jSONObject);
                case "shine":
                    return new fou(bobVar, jSONObject);
                default:
                    return null;
            }
        }
    }

    public kq(com.bytedance.adsdk.ugeno.oq.bob bobVar, JSONObject jSONObject) {
        this.kq = jSONObject;
        this.oq = bobVar;
        kq();
    }

    public abstract List<PropertyValuesHolder> bob();

    public String fou() {
        return this.bob;
    }

    public void kq() {
        this.bob = this.kq.optString(HandleInvocationsFromAdViewer.KEY_AD_TYPE);
        oq();
    }

    public abstract void kq(int i10, int i11);

    public abstract void kq(Canvas canvas);

    public abstract void oq();

    public abstract void oq(Canvas canvas);
}
