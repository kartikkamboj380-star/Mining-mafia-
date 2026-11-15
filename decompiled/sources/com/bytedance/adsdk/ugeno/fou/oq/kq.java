package com.bytedance.adsdk.ugeno.fou.oq;

import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.fou.rhi;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class kq {
    public static final HashSet<String> kq = new HashSet<>(Arrays.asList("convert", "dislike", "openAppPermission", "openAppPolicy", "openPrivacy", "openAppFunction", "close", "skip", "videoControl", "pauseVideo", "resumeVideo", "muteVideo", "preventEvent"));
    protected com.bytedance.adsdk.ugeno.oq.bob bob;
    protected String csi;
    protected String fou;
    protected rhi.kq oq;
    protected Map<String, String> rhi;
    protected String rjo;
    protected String syt;

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.fou.oq.kq$kq, reason: collision with other inner class name */
    public static class C0227kq {
        public static kq kq(com.bytedance.adsdk.ugeno.oq.bob bobVar, String str, rhi.kq kqVar) {
            if (kqVar == null) {
                return null;
            }
            String strOq = kqVar.oq();
            String strKq = kqVar.kq();
            com.bytedance.adsdk.ugeno.fou.oq oqVarKq = (TextUtils.isEmpty(strKq) || TextUtils.equals(strKq, "global")) ? com.bytedance.adsdk.ugeno.fou.fou.kq(strOq) : com.bytedance.adsdk.ugeno.fou.fou.kq(kqVar.csi());
            if (oqVarKq == null) {
                return new bob(bobVar, str, kqVar);
            }
            kq kqVarKq = oqVarKq.kq(bobVar, str, kqVar);
            return kqVarKq == null ? new bob(bobVar, str, kqVar) : kqVarKq;
        }
    }

    public kq(com.bytedance.adsdk.ugeno.oq.bob bobVar, String str, rhi.kq kqVar) {
        this.bob = bobVar;
        this.oq = kqVar;
        this.rjo = str;
        csi();
    }

    private void csi() {
        rhi.kq kqVar = this.oq;
        if (kqVar == null) {
            return;
        }
        this.fou = kqVar.kq();
        this.csi = this.oq.oq();
        Map<String, String> mapBob = this.oq.bob();
        this.rhi = mapBob;
        if (mapBob == null || mapBob.isEmpty() || !this.rhi.containsKey("emitCustomEvent")) {
            return;
        }
        this.syt = this.rhi.get("emitCustomEvent");
    }

    public void bob() {
        if (fou()) {
            rhi.kq kqVar = new rhi.kq();
            kqVar.kq("custom");
            kqVar.oq("emit");
            HashMap map = new HashMap();
            map.put(MediationMetaData.KEY_NAME, this.syt);
            kqVar.kq(map);
            new oq(this.bob, this.csi, kqVar).kq();
        }
    }

    public boolean fou() {
        return !TextUtils.isEmpty(this.syt);
    }

    public abstract void kq();

    public void oq() {
        bob();
    }
}
