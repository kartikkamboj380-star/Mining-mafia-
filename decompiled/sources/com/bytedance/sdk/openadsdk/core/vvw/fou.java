package com.bytedance.sdk.openadsdk.core.vvw;

import android.text.TextUtils;
import app.notifee.core.event.LogEvent;
import com.bykv.vk.openvk.kq.kq.kq.bob.c;
import com.bytedance.sdk.openadsdk.core.model.uml;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class fou {
    private boolean fax;
    private boolean gm;
    private String jhe;
    private String mq;
    private long mxq;
    private boolean nze;
    private uml sns;
    private boolean wcx;
    private final AtomicBoolean wki = new AtomicBoolean(false);
    private final AtomicBoolean suf = new AtomicBoolean(false);
    public List<com.bytedance.sdk.openadsdk.core.vvw.oq.bob> kq = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.vvw.oq.bob> oq = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.vvw.oq.bob> bob = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.vvw.oq.bob> fou = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.vvw.oq.bob> csi = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.vvw.oq.bob> rhi = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.vvw.oq.bob> rjo = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.vvw.oq.bob> syt = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.vvw.oq.bob> dgq = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.vvw.oq.bob> nn = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.vvw.oq.oq> ubx = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.vvw.oq.kq> vvw = new ArrayList();

    public void bob(long j10) {
        if (!kq(j10, this.fou, null, this.nze ? null : new com.bytedance.sdk.openadsdk.core.vvw.oq.bob.oq("resume", this.sns, j10)) || this.nze) {
            return;
        }
        com.bytedance.sdk.openadsdk.fou.bob.oq(this.sns, this.mq, "track_resume", (JSONObject) null);
    }

    public void csi(long j10) {
        if (this.suf.compareAndSet(false, true)) {
            kq(j10, this.rhi, (com.bytedance.sdk.openadsdk.core.vvw.kq.kq) null);
        }
    }

    public void dgq(long j10) {
        if (!kq(j10, this.nn, null, this.nze ? null : new com.bytedance.sdk.openadsdk.core.vvw.oq.bob.oq("unmute", this.sns, j10)) || this.nze) {
            return;
        }
        com.bytedance.sdk.openadsdk.fou.bob.oq(this.sns, this.mq, "track_unmute", (JSONObject) null);
    }

    public void fou(long j10) {
        if (!kq(j10, this.csi, null, new com.bytedance.sdk.openadsdk.core.vvw.oq.bob.oq(this.nze ? "video_progress" : "complete", this.sns, 1.0f)) || this.nze) {
            return;
        }
        com.bytedance.sdk.openadsdk.fou.bob.oq(this.sns, this.mq, "track_complete", (JSONObject) null);
    }

    public void kq(com.bytedance.sdk.openadsdk.core.vvw.kq.kq kqVar) {
        if (!kq(-1L, this.kq, kqVar, this.nze ? null : new com.bytedance.sdk.openadsdk.core.vvw.oq.bob.oq(LogEvent.LEVEL_ERROR, this.sns, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) || this.nze) {
            return;
        }
        com.bytedance.sdk.openadsdk.fou.bob.oq(this.sns, this.mq, "track_error", (JSONObject) null);
    }

    public void nn(List<com.bytedance.sdk.openadsdk.core.vvw.oq.bob> list) {
        this.kq.addAll(list);
    }

    public void oq(long j10) {
        if (!kq(j10, this.bob, null, this.nze ? null : new com.bytedance.sdk.openadsdk.core.vvw.oq.bob.oq("pause", this.sns, j10)) || this.nze) {
            return;
        }
        com.bytedance.sdk.openadsdk.fou.bob.oq(this.sns, this.mq, "track_pause", (JSONObject) null);
    }

    public void rhi(long j10) {
        if (!kq(j10, this.rjo, null, this.nze ? null : new com.bytedance.sdk.openadsdk.core.vvw.oq.bob.oq("skip", this.sns)) || this.nze) {
            return;
        }
        com.bytedance.sdk.openadsdk.fou.bob.oq(this.sns, this.mq, "track_skip", (JSONObject) null);
    }

    public void rjo(long j10) {
        if (!kq(j10, this.syt, null, new com.bytedance.sdk.openadsdk.core.vvw.oq.bob.oq(this.nze ? "click" : "clickTracking", this.sns)) || this.nze) {
            return;
        }
        com.bytedance.sdk.openadsdk.fou.bob.oq(this.sns, this.mq, "track_video_click", (JSONObject) null);
    }

    public void syt(long j10) {
        if (!kq(j10, this.dgq, null, this.nze ? null : new com.bytedance.sdk.openadsdk.core.vvw.oq.bob.oq("mute", this.sns, j10)) || this.nze) {
            return;
        }
        com.bytedance.sdk.openadsdk.fou.bob.oq(this.sns, this.mq, "track_mute", (JSONObject) null);
    }

    public void ubx(List<com.bytedance.sdk.openadsdk.core.vvw.oq.bob> list) {
        this.dgq.addAll(list);
    }

    public void vvw(List<com.bytedance.sdk.openadsdk.core.vvw.oq.bob> list) {
        this.nn.addAll(list);
    }

    public void csi(List<com.bytedance.sdk.openadsdk.core.vvw.oq.bob> list) {
        this.rhi.addAll(list);
    }

    private String oq() {
        if (this.jhe == null) {
            this.jhe = UUID.randomUUID().toString();
        }
        return this.jhe;
    }

    public void bob(List<com.bytedance.sdk.openadsdk.core.vvw.oq.bob> list) {
        this.fou.addAll(list);
    }

    public void dgq(List<com.bytedance.sdk.openadsdk.core.vvw.oq.kq> list) {
        this.vvw.addAll(list);
        Collections.sort(this.vvw);
    }

    public void fou(List<com.bytedance.sdk.openadsdk.core.vvw.oq.bob> list) {
        this.csi.addAll(list);
    }

    public void kq(long j10) {
        if (this.wki.compareAndSet(false, true)) {
            if (!kq(j10, this.oq, null, new com.bytedance.sdk.openadsdk.core.vvw.oq.bob.oq(this.nze ? "show_impression" : "impression", this.sns)) || this.nze) {
                return;
            }
            com.bytedance.sdk.openadsdk.fou.bob.oq(this.sns, this.mq, "track_impression", (JSONObject) null);
        }
    }

    public void rhi(List<com.bytedance.sdk.openadsdk.core.vvw.oq.bob> list) {
        this.rjo.addAll(list);
    }

    public void rjo(List<com.bytedance.sdk.openadsdk.core.vvw.oq.bob> list) {
        this.syt.addAll(list);
    }

    public void syt(List<com.bytedance.sdk.openadsdk.core.vvw.oq.oq> list) {
        this.ubx.addAll(list);
        Collections.sort(this.ubx);
    }

    private JSONArray bob() {
        JSONArray jSONArray = new JSONArray();
        Iterator<com.bytedance.sdk.openadsdk.core.vvw.oq.oq> it = this.ubx.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().oq());
        }
        return jSONArray;
    }

    private JSONArray fou() {
        JSONArray jSONArray = new JSONArray();
        Iterator<com.bytedance.sdk.openadsdk.core.vvw.oq.kq> it = this.vvw.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().oq());
        }
        return jSONArray;
    }

    public void oq(List<com.bytedance.sdk.openadsdk.core.vvw.oq.bob> list) {
        this.bob.addAll(list);
    }

    public void kq(long j10, long j11, rhi rhiVar) {
        com.bytedance.sdk.openadsdk.core.vvw.oq.bob.oq oqVar;
        if (System.currentTimeMillis() - this.mxq >= 1000 && j10 >= 0 && j11 > 0) {
            this.mxq = System.currentTimeMillis();
            float f10 = j10 / j11;
            List<com.bytedance.sdk.openadsdk.core.vvw.oq.bob> listKq = kq(j10, f10);
            float f11 = 0.25f;
            if (f10 >= 0.25f && !this.wcx) {
                kq("firstQuartile");
                this.wcx = true;
                if (rhiVar != null) {
                    kq(rhiVar, 6);
                }
                if (!this.nze) {
                    oqVar = new com.bytedance.sdk.openadsdk.core.vvw.oq.bob.oq("firstQuartile", this.sns, 0.25f);
                    f10 = f11;
                }
                f10 = f11;
                oqVar = null;
            } else {
                f11 = 0.5f;
                if (f10 >= 0.5f && !this.gm) {
                    kq("midpoint");
                    this.gm = true;
                    if (rhiVar != null) {
                        kq(rhiVar, 7);
                    }
                    if (!this.nze) {
                        oqVar = new com.bytedance.sdk.openadsdk.core.vvw.oq.bob.oq("midpoint", this.sns, 0.5f);
                        f10 = f11;
                    }
                    f10 = f11;
                    oqVar = null;
                } else {
                    f11 = 0.75f;
                    if (f10 < 0.75f || this.fax) {
                        oqVar = null;
                    } else {
                        kq("thirdQuartile");
                        this.fax = true;
                        if (rhiVar != null) {
                            kq(rhiVar, 8);
                        }
                        if (!this.nze) {
                            oqVar = new com.bytedance.sdk.openadsdk.core.vvw.oq.bob.oq("thirdQuartile", this.sns, 0.75f);
                            f10 = f11;
                        }
                        f10 = f11;
                        oqVar = null;
                    }
                }
            }
            if (f10 < 0.03f) {
                f10 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            if (!this.nze && !listKq.isEmpty()) {
                com.bytedance.sdk.openadsdk.core.vvw.oq.bob bobVar = listKq.get(0);
                if ((bobVar instanceof com.bytedance.sdk.openadsdk.core.vvw.oq.kq) && ((com.bytedance.sdk.openadsdk.core.vvw.oq.kq) bobVar).kq() == 0) {
                    com.bytedance.sdk.openadsdk.fou.bob.oq(this.sns, this.mq, "track_start", (JSONObject) null);
                    oqVar = new com.bytedance.sdk.openadsdk.core.vvw.oq.bob.oq("start", this.sns, f10);
                }
            }
            if (listKq.isEmpty()) {
                return;
            }
            if (oqVar == null) {
                oqVar = new com.bytedance.sdk.openadsdk.core.vvw.oq.bob.oq("video_progress", this.sns, f10);
            }
            kq(j10, listKq, null, oqVar);
        }
    }

    private void kq(final rhi rhiVar, final int i10) {
        com.bytedance.sdk.component.utils.dgq.oq().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.vvw.fou.1
            @Override // java.lang.Runnable
            public void run() {
                rhi rhiVar2 = rhiVar;
                if (rhiVar2 != null) {
                    rhiVar2.kq(i10);
                }
            }
        });
    }

    private void kq(String str) {
        try {
            if (this.nze) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("event", str);
                com.bytedance.sdk.openadsdk.fou.bob.oq(this.sns, this.mq, "vast_play_track", jSONObject);
            } else if ("firstQuartile".equals(str)) {
                com.bytedance.sdk.openadsdk.fou.bob.oq(this.sns, this.mq, "track_first_quartile", (JSONObject) null);
            } else if ("midpoint".equals(str)) {
                com.bytedance.sdk.openadsdk.fou.bob.oq(this.sns, this.mq, "track_midpoint", (JSONObject) null);
            } else if ("thirdQuartile".equals(str)) {
                com.bytedance.sdk.openadsdk.fou.bob.oq(this.sns, this.mq, "track_third_quartile", (JSONObject) null);
            }
        } catch (Throwable unused) {
        }
    }

    private boolean kq(long j10, List<com.bytedance.sdk.openadsdk.core.vvw.oq.bob> list, com.bytedance.sdk.openadsdk.core.vvw.kq.kq kqVar, com.bytedance.sdk.openadsdk.core.vvw.oq.bob.oq oqVar) {
        c cVarJob;
        uml umlVar = this.sns;
        String strK = null;
        if (umlVar != null && (cVarJob = umlVar.job()) != null) {
            strK = cVarJob.K();
        }
        return com.bytedance.sdk.openadsdk.core.vvw.oq.bob.kq(this.sns, list, kqVar, j10, strK, oqVar, oq());
    }

    private boolean kq(long j10, List<com.bytedance.sdk.openadsdk.core.vvw.oq.bob> list, com.bytedance.sdk.openadsdk.core.vvw.kq.kq kqVar) {
        return kq(j10, list, kqVar, null);
    }

    public List<com.bytedance.sdk.openadsdk.core.vvw.oq.bob> kq(long j10, float f10) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < this.ubx.size(); i10++) {
            com.bytedance.sdk.openadsdk.core.vvw.oq.oq oqVar = this.ubx.get(i10);
            if (oqVar.kq(f10)) {
                arrayList.add(oqVar);
            }
        }
        for (int i11 = 0; i11 < this.vvw.size(); i11++) {
            com.bytedance.sdk.openadsdk.core.vvw.oq.kq kqVar = this.vvw.get(i11);
            if (kqVar.kq(j10)) {
                arrayList.add(kqVar);
            }
        }
        return arrayList;
    }

    public void kq(List<com.bytedance.sdk.openadsdk.core.vvw.oq.bob> list) {
        this.oq.addAll(list);
    }

    public JSONObject kq() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorTrackers", com.bytedance.sdk.openadsdk.core.vvw.oq.bob.kq(this.kq));
        jSONObject.put("impressionTrackers", com.bytedance.sdk.openadsdk.core.vvw.oq.bob.kq(this.oq));
        jSONObject.put("pauseTrackers", com.bytedance.sdk.openadsdk.core.vvw.oq.bob.kq(this.bob));
        jSONObject.put("resumeTrackers", com.bytedance.sdk.openadsdk.core.vvw.oq.bob.kq(this.fou));
        jSONObject.put("completeTrackers", com.bytedance.sdk.openadsdk.core.vvw.oq.bob.kq(this.csi));
        jSONObject.put("closeTrackers", com.bytedance.sdk.openadsdk.core.vvw.oq.bob.kq(this.rhi));
        jSONObject.put("skipTrackers", com.bytedance.sdk.openadsdk.core.vvw.oq.bob.kq(this.rjo));
        jSONObject.put("clickTrackers", com.bytedance.sdk.openadsdk.core.vvw.oq.bob.kq(this.syt));
        jSONObject.put("muteTrackers", com.bytedance.sdk.openadsdk.core.vvw.oq.bob.kq(this.dgq));
        jSONObject.put("unMuteTrackers", com.bytedance.sdk.openadsdk.core.vvw.oq.bob.kq(this.nn));
        jSONObject.put("fractionalTrackers", bob());
        jSONObject.put("absoluteTrackers", fou());
        return jSONObject;
    }

    public void kq(JSONObject jSONObject) {
        nn(com.bytedance.sdk.openadsdk.core.vvw.oq.bob.kq(jSONObject.optJSONArray("errorTrackers")));
        kq(com.bytedance.sdk.openadsdk.core.vvw.oq.bob.kq(jSONObject.optJSONArray("impressionTrackers")));
        oq(com.bytedance.sdk.openadsdk.core.vvw.oq.bob.kq(jSONObject.optJSONArray("pauseTrackers"), true));
        bob(com.bytedance.sdk.openadsdk.core.vvw.oq.bob.kq(jSONObject.optJSONArray("resumeTrackers"), true));
        fou(com.bytedance.sdk.openadsdk.core.vvw.oq.bob.kq(jSONObject.optJSONArray("completeTrackers")));
        csi(com.bytedance.sdk.openadsdk.core.vvw.oq.bob.kq(jSONObject.optJSONArray("closeTrackers")));
        rhi(com.bytedance.sdk.openadsdk.core.vvw.oq.bob.kq(jSONObject.optJSONArray("skipTrackers")));
        rjo(com.bytedance.sdk.openadsdk.core.vvw.oq.bob.kq(jSONObject.optJSONArray("clickTrackers")));
        ubx(com.bytedance.sdk.openadsdk.core.vvw.oq.bob.kq(jSONObject.optJSONArray("muteTrackers"), true));
        vvw(com.bytedance.sdk.openadsdk.core.vvw.oq.bob.kq(jSONObject.optJSONArray("unMuteTrackers"), true));
        syt(com.bytedance.sdk.openadsdk.core.vvw.oq.bob.oq(jSONObject.optJSONArray("fractionalTrackers")));
        dgq(com.bytedance.sdk.openadsdk.core.vvw.oq.bob.bob(jSONObject.optJSONArray("absoluteTrackers")));
    }

    public void kq(uml umlVar) {
        this.sns = umlVar;
        this.mq = umlVar.csi();
        this.nze = umlVar.bns();
    }

    public void kq(String str, long j10) {
        if (TextUtils.isEmpty(str) || j10 < 0) {
            return;
        }
        dgq(Collections.singletonList(new com.bytedance.sdk.openadsdk.core.vvw.oq.kq.C0291kq(str, j10).kq()));
    }

    public void kq(String str, float f10) {
        if (TextUtils.isEmpty(str) || f10 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        syt(Collections.singletonList(new com.bytedance.sdk.openadsdk.core.vvw.oq.oq.kq(str, f10).kq()));
    }

    public void kq(fou fouVar) {
        nn(fouVar.kq);
        kq(fouVar.oq);
        oq(fouVar.bob);
        bob(fouVar.fou);
        fou(fouVar.csi);
        csi(fouVar.rhi);
        rhi(fouVar.rjo);
        rjo(fouVar.syt);
        ubx(fouVar.dgq);
        vvw(fouVar.nn);
        syt(fouVar.ubx);
        dgq(fouVar.vvw);
    }
}
