package com.bykv.vk.openvk.kq.kq.kq.bob;

import G1.e;
import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f13337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f13338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f13339c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private double f13340d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f13341e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f13342f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f13343g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f13344h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f13345i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f13346j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private double f13347k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f13348l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f13349m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f13350n = -1.0f;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f13351o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f13352p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f13353q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f13354r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f13355s = 307200;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f13356t = 1;

    public void A(String str) {
        this.f13342f = str;
    }

    public double B() {
        return this.f13340d;
    }

    public void C(int i10) {
        this.f13353q = i10;
    }

    public void D(String str) {
        this.f13346j = str;
    }

    public double E() {
        return this.f13347k;
    }

    public void F(int i10) {
        this.f13354r = i10;
    }

    public int G() {
        return this.f13354r;
    }

    public String H() {
        if (TextUtils.isEmpty(this.f13346j)) {
            this.f13346j = e.a(this.f13343g);
        }
        return this.f13346j;
    }

    public float I() {
        return this.f13350n;
    }

    public void J(int i10) {
        this.f13351o = i10;
    }

    public String K() {
        return this.f13343g;
    }

    public String L() {
        return this.f13344h;
    }

    public JSONObject M() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cover_height", y());
            jSONObject.put("cover_url", v());
            jSONObject.put("cover_width", a());
            jSONObject.put("endcard", L());
            jSONObject.put("file_hash", H());
            jSONObject.put("resolution", g());
            jSONObject.put("size", d());
            jSONObject.put("video_duration", B());
            jSONObject.put("video_url", K());
            jSONObject.put("playable_download_url", N());
            jSONObject.put("if_playable_loading_show", m());
            jSONObject.put("remove_loading_page_type", i());
            jSONObject.put("fallback_endcard_judge", o());
            jSONObject.put("video_preload_size", x());
            jSONObject.put("reward_video_cached_type", u());
            jSONObject.put("execute_cached_type", G());
            jSONObject.put("endcard_render", j());
            jSONObject.put("replay_time", n());
            jSONObject.put("play_speed_ratio", I());
            if (E() > 0.0d) {
                jSONObject.put("start", E());
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public String N() {
        return this.f13345i;
    }

    public int a() {
        return this.f13338b;
    }

    public void b(int i10) {
        this.f13338b = i10;
    }

    public void c(String str) {
        this.f13343g = str;
    }

    public long d() {
        return this.f13339c;
    }

    public void e(int i10) {
        this.f13355s = i10;
    }

    public void f(String str) {
        this.f13345i = str;
    }

    public String g() {
        return this.f13341e;
    }

    public void h(int i10) {
        this.f13352p = i10;
    }

    public int i() {
        return this.f13352p;
    }

    public int j() {
        return this.f13349m;
    }

    public void k(int i10) {
        this.f13349m = i10;
    }

    public void l(String str) {
        this.f13344h = str;
    }

    public int m() {
        return this.f13351o;
    }

    public int n() {
        return this.f13356t;
    }

    public int o() {
        return this.f13348l;
    }

    public void p(double d10) {
        this.f13340d = d10;
    }

    public void q(int i10) {
        this.f13348l = i10;
    }

    public void r(long j10) {
        this.f13339c = j10;
    }

    public void s(String str) {
        this.f13341e = str;
    }

    public boolean t() {
        return this.f13353q == 0;
    }

    public int u() {
        return this.f13353q;
    }

    public String v() {
        return this.f13342f;
    }

    public void w(int i10) {
        this.f13356t = Math.min(4, Math.max(1, i10));
    }

    public int x() {
        if (this.f13355s < 0) {
            this.f13355s = 307200;
        }
        long j10 = this.f13355s;
        long j11 = this.f13339c;
        if (j10 > j11) {
            this.f13355s = (int) j11;
        }
        return this.f13355s;
    }

    public int y() {
        return this.f13337a;
    }

    public void z(int i10) {
        this.f13337a = i10;
    }
}
