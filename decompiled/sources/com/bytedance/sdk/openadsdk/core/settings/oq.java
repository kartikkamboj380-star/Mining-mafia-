package com.bytedance.sdk.openadsdk.core.settings;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class oq {
    public int bob;
    public int csi;
    public int dgq;
    public int ebt;
    public int fax;
    public boolean fgm;
    public int fou;
    public int gm;
    public boolean ha;
    public int ibd;
    public int jhe;
    public String kq;
    public JSONObject ktb;
    public boolean mq;
    public int mxq;
    public int nb;
    public int nn;
    public int nze;
    public int oq;
    public int ou;
    public int rhi;
    public int rjo;
    public boolean rs;
    public int sns;
    public int suf;
    public int syt;
    public int ubx;
    public List<String> uml;
    public int vvw;
    public int wcx;
    public int wki;
    public int zfx;

    public oq(JSONObject jSONObject) {
        this.oq = 1;
        this.bob = 1;
        this.fou = 2;
        this.csi = 1;
        this.rhi = 100;
        this.rjo = 0;
        this.syt = 2;
        this.dgq = 1;
        this.nn = 3;
        this.ubx = 30;
        this.vvw = 30;
        this.wki = 1;
        this.suf = 1;
        this.nze = 2;
        this.mxq = 1500;
        this.sns = 2;
        this.wcx = 3500;
        this.gm = 0;
        this.fax = 5;
        this.mq = false;
        this.jhe = 0;
        this.nb = 2;
        this.ou = 0;
        this.ebt = 0;
        this.ibd = 5;
        this.rs = true;
        this.ha = false;
        this.fgm = false;
        this.zfx = -1;
        new JSONObject();
        this.ktb = jSONObject;
        if (jSONObject == null) {
            return;
        }
        this.kq = jSONObject.optString("code_id");
        this.oq = jSONObject.optInt("auto_play", 1);
        this.zfx = jSONObject.optInt("endcard_close_time", -1);
        this.bob = jSONObject.optInt("voice_control", 1);
        this.fou = jSONObject.optInt("rv_preload", 2);
        this.csi = jSONObject.optInt("nv_preload", 1);
        this.rhi = Math.min(100, Math.max(0, jSONObject.optInt("proportion_watching", 100)));
        this.rjo = jSONObject.optInt("skip_time_displayed", 0);
        this.syt = jSONObject.optInt("video_skip_result", 2);
        this.dgq = jSONObject.optInt("reg_creative_control", 1);
        this.nn = jSONObject.optInt("play_bar_show_time", 3);
        int iOptInt = jSONObject.optInt("rv_skip_time", 30);
        this.ubx = iOptInt;
        if (iOptInt < 0) {
            this.ubx = 30;
        }
        this.wki = jSONObject.optInt("voice_control", 2);
        this.suf = jSONObject.optInt("if_show_win", 1);
        this.nze = jSONObject.optInt("sp_preload", 2);
        this.mxq = jSONObject.optInt("stop_time", 1500);
        this.sns = jSONObject.optInt("native_playable_delay", 2);
        this.wcx = jSONObject.optInt("time_out_control", -1);
        this.gm = jSONObject.optInt("playable_reward_type", 0);
        this.jhe = jSONObject.optInt("reward_is_callback", 0);
        int iOptInt2 = jSONObject.optInt("iv_skip_time", 5);
        this.fax = iOptInt2;
        if (iOptInt2 < 0) {
            this.fax = 5;
        }
        kq(jSONObject.optJSONArray("parent_tpl_ids"));
        this.nb = jSONObject.optInt("slot_type", 2);
        this.mq = jSONObject.optBoolean("close_on_click", false);
        this.ou = jSONObject.optInt("allow_system_back", 0);
        this.ebt = jSONObject.optInt("splash_skip_time", 0);
        this.ibd = jSONObject.optInt("splash_image_count_down_time", 5);
        this.ha = jSONObject.optBoolean("splash_count_down_time_off", false);
        this.fgm = jSONObject.optBoolean("splash_close_on_click", false);
        this.rs = jSONObject.optBoolean("allow_mediaview_click", true);
        if (!kq(this.bob)) {
            this.bob = 1;
        }
        if (!kq(this.wki)) {
            this.wki = 1;
        }
        this.vvw = jSONObject.optInt("multi_rv_skip_time", 30);
    }

    private static boolean kq(int i10) {
        return i10 == 1 || i10 == 2;
    }

    public void kq(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return;
        }
        this.uml = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                this.uml.add(jSONArray.get(i10).toString());
            } catch (Exception unused) {
                return;
            }
        }
    }

    public oq(String str, int i10) {
        this.oq = 1;
        this.bob = 1;
        this.fou = 2;
        this.csi = 1;
        this.rhi = 100;
        this.rjo = 0;
        this.syt = 2;
        this.dgq = 1;
        this.nn = 3;
        this.ubx = 30;
        this.vvw = 30;
        this.wki = 1;
        this.suf = 1;
        this.nze = 2;
        this.mxq = 1500;
        this.sns = 2;
        this.wcx = 3500;
        this.gm = 0;
        this.fax = 5;
        this.mq = false;
        this.jhe = 0;
        this.nb = 2;
        this.ou = 0;
        this.ebt = 0;
        this.ibd = 5;
        this.rs = true;
        this.ha = false;
        this.fgm = false;
        this.zfx = -1;
        this.ktb = new JSONObject();
        this.kq = str;
        this.bob = i10;
    }
}
