package com.bytedance.sdk.component.adexpress.oq;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class wki {
    private String bob;
    private int csi;
    private boolean dgq;
    private boolean ebt;
    private int fax;
    private boolean fgm;
    private dgq fou;
    private int gm;
    private JSONObject ha;
    private JSONObject ibd;
    private int jhe;
    private JSONObject kq;
    private int ktb;
    private int mq;
    private boolean mxq;
    private double nb;
    private int nn;
    private final String nz;
    private int nze;
    private csi oq;
    private int ou;
    private String rhi;
    private String rjo;
    private JSONObject rs;
    private String sns;
    private Map<String, String> suf;
    private String syt;
    private long ubx;
    private String uml;
    private int vvw;
    private int wcx;
    private final boolean wf;
    private String wki;
    private final String xn;
    private String zfx;

    public static class kq {
        private String bob;
        private int csi;
        private boolean dgq;
        private int fax;
        private boolean fgm;
        private dgq fou;
        private int gm;
        private JSONObject ha;
        private JSONObject ibd;
        private int jhe;
        private JSONObject kq;
        private int mq;
        private boolean mxq;
        private double nb;
        private int nn;
        private int nz;
        private int nze;
        private csi oq;
        private int ou;
        private String rhi;
        private String rjo;
        private JSONObject rs;
        private String sns;
        private Map<String, String> suf;
        private String syt;
        private long ubx;
        private String uml;
        private int vvw;
        private int wcx;
        private String wf;
        private String wki;
        private String xn;
        private String zfx;
        private boolean ebt = true;
        private boolean ktb = true;

        public kq bob(String str) {
            this.rjo = str;
            return this;
        }

        public kq csi(String str) {
            this.sns = str;
            return this;
        }

        public kq fou(String str) {
            this.syt = str;
            return this;
        }

        public kq kq(csi csiVar) {
            this.oq = csiVar;
            return this;
        }

        public kq oq(String str) {
            this.rhi = str;
            return this;
        }

        public kq rhi(String str) {
            this.zfx = str;
            return this;
        }

        public kq rjo(String str) {
            this.wf = str;
            return this;
        }

        public kq syt(String str) {
            this.xn = str;
            return this;
        }

        public kq bob(boolean z9) {
            this.ktb = z9;
            return this;
        }

        public kq csi(int i10) {
            this.ou = i10;
            return this;
        }

        public kq fou(int i10) {
            this.nze = i10;
            return this;
        }

        public kq kq(boolean z9) {
            this.ebt = z9;
            return this;
        }

        public kq oq(boolean z9) {
            this.dgq = z9;
            return this;
        }

        public kq rhi(int i10) {
            this.nz = i10;
            return this;
        }

        public kq bob(int i10) {
            this.vvw = i10;
            return this;
        }

        public kq csi(boolean z9) {
            this.fgm = z9;
            return this;
        }

        public kq fou(boolean z9) {
            this.mxq = z9;
            return this;
        }

        public kq kq(String str) {
            this.bob = str;
            return this;
        }

        public kq oq(int i10) {
            this.nn = i10;
            return this;
        }

        public kq kq(dgq dgqVar) {
            this.fou = dgqVar;
            return this;
        }

        public kq kq(int i10) {
            this.csi = i10;
            return this;
        }

        public kq kq(long j10) {
            this.ubx = j10;
            return this;
        }

        public kq kq(Map<String, String> map) {
            this.suf = map;
            return this;
        }

        public wki kq() {
            return new wki(this);
        }

        public kq kq(double d10) {
            this.nb = d10;
            return this;
        }
    }

    public wki(kq kqVar) {
        this.kq = kqVar.kq;
        this.oq = kqVar.oq;
        this.bob = kqVar.bob;
        this.fou = kqVar.fou;
        this.csi = kqVar.csi;
        this.rhi = kqVar.rhi;
        this.rjo = kqVar.rjo;
        this.syt = kqVar.syt;
        this.dgq = kqVar.dgq;
        this.nn = kqVar.nn;
        this.ubx = kqVar.ubx;
        this.vvw = kqVar.vvw;
        this.wki = kqVar.wki;
        this.suf = kqVar.suf;
        this.nze = kqVar.nze;
        this.mxq = kqVar.mxq;
        this.sns = kqVar.sns;
        this.wcx = kqVar.wcx;
        this.gm = kqVar.gm;
        this.fax = kqVar.fax;
        this.mq = kqVar.mq;
        this.jhe = kqVar.jhe;
        this.uml = kqVar.uml;
        this.nb = kqVar.nb;
        this.ou = kqVar.ou;
        this.ebt = kqVar.ebt;
        this.ibd = kqVar.ibd;
        this.rs = kqVar.rs;
        this.ha = kqVar.ha;
        this.fgm = kqVar.fgm;
        this.zfx = kqVar.zfx;
        this.ktb = kqVar.nz;
        this.wf = kqVar.ktb;
        this.xn = kqVar.wf;
        this.nz = kqVar.xn;
    }

    public JSONObject bob() {
        csi csiVar;
        if (this.kq == null && (csiVar = this.oq) != null) {
            this.kq = csiVar.kq();
        }
        return this.kq;
    }

    public dgq csi() {
        return this.fou;
    }

    public long dgq() {
        return this.ubx;
    }

    public boolean ebt() {
        return this.wf;
    }

    public JSONObject fax() {
        return this.ha;
    }

    public String fou() {
        return this.bob;
    }

    public JSONObject gm() {
        return this.rs;
    }

    public String ibd() {
        return this.xn;
    }

    public int jhe() {
        return this.jhe;
    }

    public boolean kq() {
        return this.ebt;
    }

    public int mq() {
        return this.mq;
    }

    public int mxq() {
        return this.gm;
    }

    public String nb() {
        return this.zfx;
    }

    public int nn() {
        return this.vvw;
    }

    public int nze() {
        return this.wcx;
    }

    public double oq() {
        return this.nb;
    }

    public int ou() {
        return this.ktb;
    }

    public int rhi() {
        return this.csi;
    }

    public int rjo() {
        return this.ou;
    }

    public String rs() {
        return this.nz;
    }

    public int sns() {
        return this.fax;
    }

    public String suf() {
        return this.sns;
    }

    public boolean syt() {
        return this.dgq;
    }

    public Map<String, String> ubx() {
        return this.suf;
    }

    public boolean uml() {
        return this.fgm;
    }

    public int vvw() {
        return this.nze;
    }

    public JSONObject wcx() {
        return this.ibd;
    }

    public boolean wki() {
        return this.mxq;
    }
}
