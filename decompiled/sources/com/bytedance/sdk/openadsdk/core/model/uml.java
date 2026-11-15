package com.bytedance.sdk.openadsdk.core.model;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bykv.vk.openvk.kq.kq.kq.bob.c;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;
import com.bytedance.sdk.openadsdk.utils.wol;
import com.bytedance.sdk.openadsdk.utils.yyl;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import com.unity3d.services.core.device.MimeTypes;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class uml {
    private int aed;
    private String aq;
    private int aqe;
    private String ax;
    private ebt bj;
    private JSONObject bns;
    private String bnx;
    private boolean bu;
    private int ced;
    private boolean clh;
    private com.bytedance.sdk.openadsdk.core.ubx.syt.kq cvt;
    private boolean czb;
    protected long dgq;
    private int dra;
    private boolean dt;
    private String ea;
    private Map<String, Object> et;
    private boolean evn;
    private String ezl;
    private int fax;
    private String fgm;
    private int gg;
    private String gm;
    private String ha;
    private wki hlh;
    private PAGBannerSize hmq;
    private String hn;
    private JSONObject iaf;
    private String ibd;
    private long jhe;
    private int jhy;
    private JSONObject jnr;
    private String job;
    private int jvy;
    private kq jwr;
    private boolean ktb;
    private boolean lag;
    private int ldy;
    private int ll;
    private ktb lol;
    private wcx ls;
    private mq ma;
    private int mku;
    private int mz;
    private String ne;
    private String ngf;
    private String nv;
    private String nvp;
    private int ok;
    private nb ou;
    private String oxe;
    private sns pcj;
    private String pfu;
    private String pms;
    private c pw;
    private boolean qad;
    private String qbl;
    private int qdf;
    private String qip;
    private syt qsb;
    private String qvq;
    private String qy;
    private long rrl;
    private com.bytedance.sdk.openadsdk.core.model.kq rs;
    private c rul;
    private String rxz;
    private wcx rz;
    private boolean sns;
    private int sv;
    protected int syt;
    private int tk;
    private int tn;
    private int tpg;
    private rjo tqu;
    private int tvh;
    private rhi uaj;
    private gm uc;
    private volatile boolean ugp;
    private boolean ul;
    private long uml;
    private String uv;
    private boolean vd;
    private suf vdk;
    private rs vg;
    private c vho;
    private JSONObject vi;
    private int vni;
    private com.bytedance.sdk.openadsdk.core.ubx.syt.kq vu;
    private String vyv;
    private int wbn;
    private csi wcx;
    private int wee;
    private int wf;
    private String wj;
    public long wki;
    private ha wt;
    private JSONObject xb;
    private String xgx;
    private int xk;
    private int xn;
    private com.bytedance.sdk.openadsdk.core.vvw.kq xo;
    private String xp;
    private boolean yn;
    private AdSlot yo;
    private String ysx;
    private int zfx;
    private fgm zsr;
    private nze ztj;
    public static final String oq = a.a("_", new CharSequence[]{"is", wol.ha()});
    public static final String bob = a.a("_", new CharSequence[]{"is", wol.ha(), "sample"});
    public static final String fou = a.a("_", new CharSequence[]{wol.ha(), "strategy"});
    protected static int ubx = 330;
    private long mxq = 0;
    protected boolean kq = false;
    protected boolean csi = com.bytedance.sdk.openadsdk.ou.kq.bob.kq;
    protected int rhi = com.bytedance.sdk.openadsdk.ou.kq.bob.oq;
    protected String rjo = com.bytedance.sdk.openadsdk.ou.kq.bob.bob;
    private int mq = 0;
    private boolean nb = false;
    private int ebt = -1;
    protected int nn = 0;
    private final List<wcx> nz = new ArrayList();
    private final List<String> yyl = new ArrayList();
    private final List<FilterWord> wol = new ArrayList();
    private final yyl bss = yyl.bob();
    public boolean vvw = false;
    private int syw = 0;
    private List<String> ye = new ArrayList();
    private List<String> jq = new ArrayList();
    private String ui = "0";
    private String fm = "";
    private int rhg = 0;
    private int noa = 2;
    private int rao = -1;
    private int wxb = 0;
    private int oz = 0;
    private int zp = 1;
    private ubx ymy = new ubx();
    private int kfr = -200;
    private int vt = 0;
    private int ju = 1;
    private int fsp = 0;
    private int oyl = 0;
    private int wqw = 0;
    private int ayo = 1;
    private int ze = 1;
    private float kiq = 100.0f;
    private int lqo = -1;
    private int be = 2;
    private int jqv = 1;
    private int iy = 0;
    private int flb = -1;
    private long xh = -1;
    private int rf = 0;
    private int bbl = LinearLayoutManager.INVALID_OFFSET;
    private boolean hw = false;
    private int rn = 0;
    private int tau = -1;
    private long gec = -1;
    private int hcm = 50;
    private int md = -1;
    private final oq zj = new oq();
    private boolean ain = false;
    private com.bytedance.sdk.openadsdk.ou.kq.oq ns = null;
    protected int suf = -1;
    protected int nze = -1;
    private float aa = -1.0f;

    public static class kq {
        private String bob;
        private String csi;
        private String dgq;
        private String fou;
        private String kq;
        private String nn;
        private String oq;
        private String rhi;
        private String rjo;
        private String suf;
        private List<Integer> syt;
        private String ubx;
        private String vvw;
        private String wki;

        @NonNull
        public static com.bytedance.sdk.component.adexpress.kq.bob.fou kq(kq kqVar, String str) {
            return com.bytedance.sdk.component.adexpress.kq.bob.fou.kq().kq(kqVar.fou()).oq(kqVar.csi()).bob(kqVar.rhi()).fou(kqVar.rjo()).csi(kqVar.bob()).rhi(str);
        }

        @NonNull
        public static com.bytedance.sdk.openadsdk.core.ubx.syt.kq oq(kq kqVar, String str) {
            return new com.bytedance.sdk.openadsdk.core.ubx.syt.kq().kq(kqVar.fou()).oq(kqVar.suf()).bob(kqVar.wki()).fou(kqVar.nze()).csi(str);
        }

        public String bob() {
            return this.rhi;
        }

        public String csi() {
            return this.oq;
        }

        public String dgq() {
            return this.rjo;
        }

        public String fou() {
            return this.kq;
        }

        public String nn() {
            return this.ubx;
        }

        public String nze() {
            return this.suf;
        }

        public String rhi() {
            return this.bob;
        }

        public String rjo() {
            return this.fou;
        }

        public String suf() {
            return this.wki;
        }

        public String syt() {
            return this.csi;
        }

        public String ubx() {
            return this.nn;
        }

        public boolean vvw() {
            return !TextUtils.isEmpty(this.nn) && this.nn.equals("v3");
        }

        public String wki() {
            return this.vvw;
        }

        public void bob(String str) {
            this.kq = str;
        }

        public void csi(String str) {
            this.bob = str;
        }

        public void dgq(String str) {
            this.ubx = str;
        }

        public void fou(String str) {
            this.oq = str;
        }

        public void nn(String str) {
            this.nn = str;
        }

        public void rhi(String str) {
            this.fou = str;
        }

        public void rjo(String str) {
            this.csi = str;
        }

        public void syt(String str) {
            this.rjo = str;
        }

        public void ubx(String str) {
            this.vvw = str;
        }

        public void vvw(String str) {
            this.wki = str;
        }

        public void wki(String str) {
            this.suf = str;
        }

        public String oq() {
            return this.dgq;
        }

        public List<Integer> kq() {
            return this.syt;
        }

        public void oq(String str) {
            this.rhi = str;
        }

        public void kq(List<Integer> list) {
            this.syt = list;
        }

        public void kq(String str) {
            this.dgq = str;
        }
    }

    public uml() {
        com.bytedance.sdk.openadsdk.core.model.kq kqVar = new com.bytedance.sdk.openadsdk.core.model.kq();
        this.rs = kqVar;
        kqVar.kq(this);
    }

    private com.bytedance.sdk.openadsdk.core.ubx.syt.kq ore() {
        ktb ktbVarYo = yo();
        if (ktbVarYo == null) {
            return null;
        }
        return new com.bytedance.sdk.openadsdk.core.ubx.syt.kq().kq(ktbVarYo.kq()).oq(ktbVarYo.oq()).bob(ktbVarYo.bob()).fou(ktbVarYo.fou()).csi(tt() + "_v3");
    }

    public static boolean ui(int i10) {
        return i10 == 44 || i10 == 43 || i10 == 30 || i10 == 40 || i10 == 41 || i10 == 39;
    }

    private com.bytedance.sdk.openadsdk.core.ubx.syt.kq vzg() {
        kq kqVarZp = zp();
        if (kqVarZp == null) {
            return null;
        }
        return kq.oq(kqVarZp, String.valueOf(tt()));
    }

    public boolean aa() {
        return ain() == 7;
    }

    public com.bytedance.sdk.component.adexpress.kq.bob.fou aed() {
        kq kqVarZp = zp();
        if (kqVarZp == null) {
            return null;
        }
        return kq.kq(kqVarZp, String.valueOf(tt()));
    }

    public int ain() {
        if (this.flb < 0) {
            JSONObject jSONObjectZj = zj();
            if (jSONObjectZj != null) {
                this.flb = jSONObjectZj.optInt("ad_slot_type", 0);
            } else {
                this.flb = 0;
            }
        }
        return this.flb;
    }

    public int aq() {
        return this.rhg;
    }

    public int aqe() {
        return this.aed;
    }

    public String ax() {
        return this.oxe;
    }

    public boolean ayo() {
        return this.mku == 1;
    }

    public boolean bbl() {
        return bns() || this.wcx != null;
    }

    public String be() {
        return this.xp;
    }

    public int bj() {
        return this.xk;
    }

    public yyl blz() {
        return this.bss;
    }

    public boolean bns() {
        int i10 = this.rf;
        return (i10 == 1 || i10 == 3) && hw() != null;
    }

    public boolean bnx() {
        return !bns() && rf() == 1;
    }

    public int bob() {
        return this.wf;
    }

    public boolean bpo() {
        return true;
    }

    public boolean bss() {
        return this.dt;
    }

    public boolean bu() {
        if (this.nz.isEmpty()) {
            return false;
        }
        if (this.qdf == 4 && this.nz.size() < 3) {
            return false;
        }
        Iterator<wcx> it = this.nz.iterator();
        while (it.hasNext()) {
            if (!it.next().csi()) {
                return false;
            }
        }
        return true;
    }

    public oq bvt() {
        return this.zj;
    }

    public boolean bxi() {
        return ain() == 8;
    }

    public float byj() {
        float f10 = this.aa;
        if (f10 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return f10;
        }
        ktb ktbVar = this.lol;
        if (ktbVar != null) {
            String strFou = ktbVar.fou();
            if (TextUtils.isEmpty(strFou)) {
                strFou = com.bytedance.sdk.openadsdk.core.ubx.kq.oq.kq().kq("adv3", this.lol.kq(), this.lol.oq());
            }
            if (strFou != null) {
                try {
                    JSONObject jSONObjectOptJSONObject = new JSONObject(strFou).optJSONObject("body");
                    if (jSONObjectOptJSONObject != null) {
                        float fOptDouble = (float) jSONObjectOptJSONObject.optDouble("ratio");
                        this.aa = fOptDouble;
                        return fOptDouble;
                    }
                } catch (JSONException unused) {
                }
            }
        }
        this.aa = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public boolean bz() {
        return this.bss.kq > 0;
    }

    public JSONObject ced() {
        return this.vi;
    }

    public long ch() {
        return this.dgq;
    }

    public String ci() {
        rhi rhiVarXo = xo();
        if (rhiVarXo == null || TextUtils.isEmpty(rhiVarXo.kq())) {
            return null;
        }
        return rhiVarXo.kq();
    }

    public AdSlot clh() {
        return this.yo;
    }

    public String csi() {
        int iUc = uc();
        if (iUc == 1) {
            return "banner_ad";
        }
        if (iUc == 3) {
            return "open_ad";
        }
        if (iUc == 5) {
            return "embeded_ad";
        }
        if (iUc != 7) {
            return iUc != 8 ? "unknown" : "fullscreen_interstitial_ad";
        }
        return "rewarded_video";
    }

    public int cvt() {
        return this.tn;
    }

    public int czb() {
        return this.jvy;
    }

    public boolean db() {
        ebt ebtVar = this.bj;
        if (ebtVar == null || ebtVar.oq() != 1) {
            return false;
        }
        nb nbVar = this.ou;
        return nbVar == null || nbVar.kq() <= 0;
    }

    public long dgq() {
        return this.mxq;
    }

    public int dm() {
        String strValueOf;
        com.bytedance.sdk.openadsdk.core.model.kq kqVarFou = fou();
        if (kqVarFou != null && kqVarFou.vvw() != null) {
            return kqVarFou.vvw().dgq();
        }
        if (clh() != null) {
            strValueOf = clh().getCodeId();
        } else {
            int iTt = tt();
            strValueOf = iTt != 0 ? String.valueOf(iTt) : null;
        }
        if (strValueOf != null) {
            return com.bytedance.sdk.openadsdk.core.sns.fou().ubx(strValueOf);
        }
        return 30;
    }

    public String dra() {
        return this.ui;
    }

    public String dt() {
        return this.ne;
    }

    public int ea() {
        rjo rjoVar = this.tqu;
        if (rjoVar == null) {
            return 2;
        }
        return rjoVar.oq();
    }

    public gm ebt() {
        return this.uc;
    }

    public long eh() {
        return this.jhe;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && uml.class == obj.getClass()) {
            uml umlVar = (uml) obj;
            if (this.ui.equals(umlVar.dra()) && this.aq.equals(umlVar.jnr())) {
                return true;
            }
        }
        return false;
    }

    public boolean esp() {
        nze nzeVar;
        return bns() && !bz() && (nzeVar = this.ztj) != null && nzeVar.kq() == 1;
    }

    public int et() {
        return this.tk;
    }

    public ubx evn() {
        return this.ymy;
    }

    public JSONObject ezl() {
        return ubx(true);
    }

    public boolean fax() {
        return this.evn;
    }

    public void fc() {
        this.bss.csi();
        rhi(false);
    }

    public boolean fgm() {
        List<Integer> listKq;
        return (zp() == null || (listKq = zp().kq()) == null || !listKq.contains(57)) ? false : true;
    }

    public boolean fhf() {
        return this.ain;
    }

    public long flb() {
        return this.rrl;
    }

    public int fm() {
        int i10 = this.tvh;
        if (i10 == 5 || i10 == 6 || i10 == 33) {
            return 1;
        }
        if (wk()) {
            return 2;
        }
        return this.noa;
    }

    public com.bytedance.sdk.openadsdk.core.model.kq fou() {
        return this.rs;
    }

    public boolean fq() {
        int i10 = this.tvh;
        return (i10 == 2 || i10 == 1) && 3 == this.wee;
    }

    public String fsp() {
        return this.wj;
    }

    public int fxn() {
        int i10 = this.suf;
        return i10 >= 0 ? i10 : com.bytedance.sdk.openadsdk.core.sns.fou().gm(String.valueOf(tt()));
    }

    public com.bytedance.sdk.openadsdk.ou.kq.oq gdx() {
        return this.ns;
    }

    public boolean gec() {
        return this.ok == 1;
    }

    public String gg() {
        return this.pms;
    }

    public PAGBannerSize gkh() {
        return this.hmq;
    }

    public boolean gm() {
        return this.vd;
    }

    public int guj() {
        return this.mq;
    }

    public String ha() {
        return this.ezl;
    }

    public boolean hcm() {
        return this.ugp;
    }

    public int hlh() {
        return this.syw;
    }

    public c hmq() {
        return this.vho;
    }

    public String hn() {
        return this.fm;
    }

    public com.bytedance.sdk.openadsdk.core.vvw.kq hw() {
        return this.xo;
    }

    public int hxh() {
        int i10 = this.nze;
        return i10 >= 0 ? i10 : com.bytedance.sdk.openadsdk.core.sns.fou().nn(String.valueOf(tt()));
    }

    public boolean iad() {
        return ain() == 5;
    }

    public boolean iaf() {
        return jwr() == 100 || this.tvh == 20;
    }

    public boolean ibd() {
        return this.bu;
    }

    public boolean igl() {
        return this.nb;
    }

    public String iy() {
        return this.ea;
    }

    public int jc() {
        int i10 = this.ebt;
        if (i10 >= 0) {
            return i10;
        }
        return aa() ? 30 : 5;
    }

    public String jhe() {
        return this.nvp;
    }

    public int jhy() {
        return this.zp;
    }

    public String jnr() {
        return this.aq;
    }

    public c job() {
        return this.rul;
    }

    public String jp() {
        JSONObject jSONObjectZj;
        String strOptString = this.ngf;
        if (TextUtils.isEmpty(strOptString) && (jSONObjectZj = zj()) != null) {
            strOptString = jSONObjectZj.optString("req_id", "");
            ktb(strOptString);
        }
        return strOptString == null ? "" : strOptString;
    }

    public boolean jq() {
        if (this.flb <= 0) {
            this.flb = ain();
        }
        int i10 = this.flb;
        return (i10 == 7 || i10 == 8) && !csi(this) && uaj() != 21 && this.vni == 1;
    }

    public String jqv() {
        if (!TextUtils.isEmpty(this.ea)) {
            return this.ea;
        }
        Context contextKq = com.bytedance.sdk.openadsdk.core.sns.kq();
        int iWqw = wqw();
        if (iWqw != 2 && iWqw != 3) {
            if (iWqw == 4) {
                return contextKq != null ? com.bytedance.sdk.component.utils.uml.kq(contextKq, "tt_video_download_apk") : this.ea;
            }
            if (iWqw != 8) {
                return this.ea;
            }
        }
        return contextKq != null ? com.bytedance.sdk.component.utils.uml.kq(contextKq, "tt_video_mobile_go_detail") : this.ea;
    }

    public long jt() {
        return this.uml;
    }

    public int ju() {
        suf sufVar = this.vdk;
        if (sufVar == null) {
            return 0;
        }
        return sufVar.kq();
    }

    public List<String> jvy() {
        return this.ye;
    }

    public int jwr() {
        return this.jhy;
    }

    public int kcj() {
        return this.rhi;
    }

    public int kfr() {
        JSONObject jSONObject;
        int i10 = this.bbl;
        return (Integer.MIN_VALUE != i10 || (jSONObject = this.bns) == null) ? i10 : jSONObject.optInt("click_trigger_type", 0);
    }

    public List<wcx> kiq() {
        return this.nz;
    }

    public void kmo() {
        if (!TextUtils.isEmpty(rul())) {
            suf("0");
        }
        Map<String, Object> mapLl = ll();
        if (mapLl == null || !mapLl.containsKey(InAppPurchaseMetaData.KEY_PRICE)) {
            return;
        }
        mapLl.put(InAppPurchaseMetaData.KEY_PRICE, "0");
    }

    public nb kq() {
        return this.ou;
    }

    public boolean ktb() {
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectVt = vt();
        if (jSONObjectVt == null || (jSONArrayOptJSONArray = jSONObjectVt.optJSONArray("tag_ids")) == null) {
            return false;
        }
        for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
            if (jSONArrayOptJSONArray.optInt(i10) == 186) {
                return true;
            }
        }
        return false;
    }

    public JSONObject lag() {
        return this.jnr;
    }

    public int ldy() {
        return this.ayo;
    }

    public long lkh() {
        return this.wki;
    }

    public double lku() {
        return dgq(zj());
    }

    public Map<String, Object> ll() {
        return this.et;
    }

    public int lol() {
        return this.gg;
    }

    public List<String> lqo() {
        return this.jq;
    }

    public String lr() {
        return this.rjo;
    }

    public boolean ls() {
        return this.qad;
    }

    public String ma() {
        return this.hn;
    }

    public nze md() {
        return this.ztj;
    }

    public int mku() {
        return this.iy;
    }

    public String mq() {
        return this.qy;
    }

    public boolean mv() {
        int i10 = this.wbn;
        return i10 == 44 || i10 == 43;
    }

    public int mxq() {
        return this.tau;
    }

    public int mz() {
        return this.oz;
    }

    public mq nb() {
        return this.ma;
    }

    public wki ne() {
        return this.hlh;
    }

    public boolean ngf() {
        return this.ul;
    }

    public int nn() {
        return this.fax;
    }

    public int noa() {
        return this.fsp;
    }

    public boolean ns() {
        return ain() == 3 || ain() == 4;
    }

    public String nu() {
        return this.ibd;
    }

    public int nv() {
        return this.ced;
    }

    public int nvp() {
        if (this.ze != 2) {
            this.ze = 1;
        }
        return this.ze;
    }

    public com.bytedance.sdk.openadsdk.core.ubx.syt.kq nz() {
        return this.vu;
    }

    public boolean nze() {
        return this.ktb;
    }

    public int of() {
        return this.nze;
    }

    public List<FilterWord> ok() {
        return this.wol;
    }

    public int oq() {
        rjo rjoVarXp = xp();
        if (rjoVarXp != null) {
            return rjoVarXp.kq();
        }
        return -1;
    }

    public ebt oqf() {
        return this.bj;
    }

    public syt ou() {
        return this.qsb;
    }

    public fou ovs() {
        fou fouVarSuf;
        csi csiVar = this.wcx;
        if (csiVar != null) {
            fouVarSuf = csiVar.bob();
        } else {
            com.bytedance.sdk.openadsdk.core.vvw.kq kqVar = this.xo;
            fouVarSuf = kqVar != null ? kqVar.suf() : null;
        }
        if (fouVarSuf != null) {
            fouVarSuf.kq(this);
        }
        return fouVarSuf;
    }

    public String oxe() {
        return this.nv;
    }

    public String oyl() {
        return this.ysx;
    }

    public int oz() {
        return this.ldy;
    }

    public int pcj() {
        return this.qdf;
    }

    @NonNull
    public List<uml> pcz() {
        return this.rs.fou();
    }

    public String pfu() {
        JSONObject jSONObjectZj;
        if (this.qbl == null && (jSONObjectZj = zj()) != null) {
            this.qbl = jSONObjectZj.optString("cid", "");
        }
        return this.qbl;
    }

    public void pms() {
        c cVar = this.rul;
        if (cVar == null || TextUtils.isEmpty(cVar.L())) {
            return;
        }
        try {
            if (!this.rul.L().contains("style_id")) {
                this.czb = false;
            } else {
                this.czb = true;
                this.uv = Uri.parse(this.rul.L()).getQueryParameters("style_id").get(0);
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.fax.bob(th.getMessage(), new Object[0]);
        }
    }

    public int pw() {
        return this.ju;
    }

    public boolean qa() {
        return this.hw;
    }

    public void qad() {
        this.ugp = true;
    }

    public int qbl() {
        return this.ll;
    }

    public boolean qc() {
        return this.csi;
    }

    public int qdf() {
        return this.jqv;
    }

    public int qip() {
        if (fgm()) {
            return 5;
        }
        return rn() ? 4 : 1;
    }

    public int qmk() {
        return this.syt;
    }

    public csi qns() {
        return this.wcx;
    }

    public c qsb() {
        return this.pw;
    }

    public wcx qvq() {
        return this.ls;
    }

    public String qy() {
        return this.job;
    }

    public String rao() {
        return this.ax;
    }

    public int rf() {
        return this.wxb;
    }

    public int rhg() {
        return this.rao;
    }

    public boolean rhi() {
        ebt ebtVar;
        int iUi = ui();
        if (ls() && ha.bob(this) && iUi != 43 && iUi != 44) {
            return false;
        }
        if (!ls() && ui(iUi) && (ebtVar = this.bj) != null && ebtVar.kq() == 1) {
            return false;
        }
        boolean z9 = (iUi == 33 || iUi == 5 || iUi == 6 || iUi == 19 || iUi == 12) ? false : true;
        if (bns() || fm() == 2 || !z9 || !com.bytedance.sdk.openadsdk.core.ubx.rhi.kq.fou.kq(wol.bob(this.flb))) {
            return fm() == 2 && z9;
        }
        return true;
    }

    public int rjo() {
        return this.xn;
    }

    public boolean rn() {
        return this.rf == 2;
    }

    public int rrl() {
        return this.wqw;
    }

    public String rs() {
        return this.bnx;
    }

    public String rul() {
        return this.xgx;
    }

    public String rxz() {
        return this.rxz;
    }

    public int rz() {
        return this.hcm;
    }

    public String sb() {
        return this.vyv;
    }

    public long sns() {
        return this.gec;
    }

    public boolean suf() {
        return this.sns;
    }

    public com.bytedance.sdk.component.dgq.oq.kq sv() {
        com.bytedance.sdk.component.dgq.oq.kq kqVar = new com.bytedance.sdk.component.dgq.oq.kq();
        kqVar.kq(this.ldy);
        kqVar.oq(this.ui);
        kqVar.bob(this.hn);
        kqVar.kq(jnr());
        return kqVar;
    }

    public String syt() {
        ou ouVarVvw;
        com.bytedance.sdk.openadsdk.core.model.kq kqVarFou = fou();
        if (kqVarFou == null || (ouVarVvw = kqVarFou.vvw()) == null) {
            return null;
        }
        return ouVarVvw.rjo();
    }

    public boolean syw() {
        return this.lag;
    }

    public sns tau() {
        return this.pcj;
    }

    public int tk() {
        return this.mku;
    }

    public long tm() {
        Map<String, Object> mapLl = ll();
        if (mapLl == null) {
            return 0L;
        }
        try {
            Object obj = mapLl.get("media_share_price");
            if (obj == null) {
                return 0L;
            }
            return Long.parseLong(obj.toString());
        } catch (Exception unused) {
            return 0L;
        }
    }

    public List<String> tn() {
        return this.yyl;
    }

    public int tpg() {
        return this.dra;
    }

    public boolean tq() {
        return this.kq;
    }

    public float tqu() {
        if (this.kiq <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            this.kiq = 100.0f;
        }
        return (this.kiq * 1000.0f) / 1000.0f;
    }

    public int tt() {
        JSONObject jSONObjectZj = zj();
        if (jSONObjectZj != null) {
            return jSONObjectZj.optInt("rit", 0);
        }
        return 0;
    }

    public boolean tvh() {
        return this.yn;
    }

    public int ty() {
        return this.rf;
    }

    public int uaj() {
        return this.wbn;
    }

    public String ubx() {
        return this.ha;
    }

    public int uc() {
        return this.flb;
    }

    public String ugp() {
        return this.qvq;
    }

    public int ul() {
        return this.kfr;
    }

    public boolean uml() {
        return (TextUtils.isEmpty(mq()) || TextUtils.isEmpty(jhe())) ? false : true;
    }

    public JSONObject uv() {
        JSONObject jSONObjectUbx = ubx(false);
        JSONObject jSONObjectWcx = com.bytedance.sdk.openadsdk.core.settings.ubx.bob().wcx(String.valueOf(tt()));
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObjectUbx);
            jSONObject.put("creatives", jSONArray);
            jSONObject.put("did", 1);
            jSONObject.put("processing_time_ms", 100);
            jSONObject.put("request_id", "aaaaaaaa-aaaa-aaaa-aaaa-aaaaaaaaaaaa");
            jSONObject.put("s_receive_ts", 1);
            jSONObject.put("s_send_ts", 1);
            jSONObject.put("status_code", 20000);
            jSONObject.put("core_settings", jSONObjectWcx);
            return jSONObject;
        } catch (JSONException e10) {
            com.bytedance.sdk.component.utils.fax.bob("MaterialMeta", "toJsonObjPlus", e10.getMessage());
            return jSONObject;
        }
    }

    public int uxv() {
        Map<String, Object> map = this.et;
        if (map == null) {
            return 0;
        }
        try {
            Object obj = map.get(TTAdConstant.SDK_BIDDING_TYPE);
            if (obj != null) {
                return Integer.parseInt(obj.toString());
            }
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }

    public int vd() {
        if (bns()) {
            return 5;
        }
        if (tqu() != 100.0f || fm() == 2) {
            return 0;
        }
        return this.vt;
    }

    public wcx vdk() {
        return this.rz;
    }

    public boolean vfe() {
        nb nbVar = this.ou;
        return nbVar != null && nbVar.kq() > 0;
    }

    public String vg() {
        return this.qip;
    }

    public int vho() {
        return this.oyl;
    }

    public boolean vi() {
        return this.sv == 1;
    }

    public int vni() {
        return this.aqe;
    }

    public boolean vsm() {
        gm gmVar;
        AdSlot adSlot = this.yo;
        if (adSlot == null || (gmVar = this.uc) == null) {
            return false;
        }
        return gmVar.kq(!TextUtils.isEmpty(adSlot.getBidAdm()));
    }

    public JSONObject vt() {
        return this.bns;
    }

    public int vu() {
        int i10 = this.lqo;
        if (i10 >= 0) {
            return i10;
        }
        return 30;
    }

    public String vvw() {
        return this.fgm;
    }

    public long vyv() {
        if (this.xh < 0) {
            JSONObject jSONObjectZj = zj();
            if (jSONObjectZj != null) {
                this.xh = jSONObjectZj.optLong("ad_id", 0L);
            } else {
                this.xh = 0L;
            }
        }
        return this.xh;
    }

    public int wbn() {
        try {
            JSONObject jSONObjectZj = zj();
            if (jSONObjectZj != null) {
                return jSONObjectZj.optInt("rec_clk", 0);
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    public int wcx() {
        return this.nn;
    }

    public rs we() {
        return this.vg;
    }

    public void wee() {
        this.yn = true;
    }

    public String wf() {
        return this.uv;
    }

    public boolean wiy() {
        return ain() == 1;
    }

    public int wj() {
        return this.be;
    }

    public boolean wk() {
        return clh() != null && clh().getDurationSlotType() == 8 && rn();
    }

    public int wki() {
        return this.zfx;
    }

    public int wol() {
        return this.rn;
    }

    public int wqw() {
        return this.wee;
    }

    public String wt() {
        return this.gm;
    }

    public int wx() {
        String strValueOf;
        com.bytedance.sdk.openadsdk.core.model.kq kqVarFou = fou();
        if (kqVarFou != null && kqVarFou.vvw() != null) {
            return kqVarFou.vvw().dgq();
        }
        if (clh() != null) {
            strValueOf = clh().getCodeId();
        } else {
            int iTt = tt();
            strValueOf = iTt != 0 ? String.valueOf(iTt) : null;
        }
        if (strValueOf != null) {
            return com.bytedance.sdk.openadsdk.core.sns.fou().gm(strValueOf);
        }
        return 5;
    }

    public boolean wxb() {
        return this.fsp == 1;
    }

    public int xb() {
        return this.sv;
    }

    public int xgx() {
        return this.tpg;
    }

    public int xh() {
        return this.mz;
    }

    public ha xk() {
        return this.wt;
    }

    public boolean xn() {
        return this.czb;
    }

    public rhi xo() {
        return this.uaj;
    }

    public rjo xp() {
        return this.tqu;
    }

    public int ye() {
        if (this.md < 0) {
            try {
                JSONObject jSONObjectZj = zj();
                if (jSONObjectZj != null) {
                    this.md = jSONObjectZj.optInt("is_drop_to_retargeting_sample", 0);
                } else {
                    this.md = 0;
                }
            } catch (Throwable unused) {
                this.md = 0;
            }
        }
        return this.md;
    }

    public fgm ygi() {
        return this.zsr;
    }

    public boolean ymy() {
        kq kqVar = this.jwr;
        if (kqVar != null) {
            return !TextUtils.isEmpty(kqVar.ubx());
        }
        int i10 = this.oz;
        return i10 == 9 || i10 == 10;
    }

    public int yn() {
        JSONObject jSONObject = this.jnr;
        if (jSONObject != null) {
            return jSONObject.optInt("easy_playable_skip_duration", 0);
        }
        return 0;
    }

    public boolean ynr() {
        return this.vvw;
    }

    public ktb yo() {
        return this.lol;
    }

    public long ysx() {
        rjo rjoVar = this.tqu;
        if (rjoVar == null) {
            return 0L;
        }
        return rjoVar.bob();
    }

    public com.bytedance.sdk.openadsdk.core.ubx.syt.kq yyl() {
        return this.cvt;
    }

    public String ze() {
        return this.pfu;
    }

    public boolean zfx() {
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectVt = vt();
        if (jSONObjectVt != null && (jSONArrayOptJSONArray = jSONObjectVt.optJSONArray("tag_ids")) != null) {
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                if (jSONArrayOptJSONArray.optInt(i10) == 174) {
                    return true;
                }
            }
        }
        return false;
    }

    public JSONObject zj() {
        if (this.iaf == null) {
            try {
                if (!TextUtils.isEmpty(this.aq)) {
                    this.iaf = new JSONObject(this.aq);
                }
            } catch (JSONException e10) {
                com.bytedance.sdk.component.utils.fax.bob("MaterialMeta", e10.getMessage());
            }
        }
        return this.iaf;
    }

    public kq zp() {
        return this.jwr;
    }

    public boolean zsr() {
        c cVar = this.rul;
        return cVar == null || cVar.m() != 1;
    }

    public JSONObject ztj() {
        return this.xb;
    }

    private static double dgq(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optDouble("pack_time", 0.0d);
        }
        return 0.0d;
    }

    public static boolean fou(uml umlVar) {
        return (umlVar == null || umlVar.job() == null || umlVar.job().o() != 1) ? false : true;
    }

    public static boolean rjo(uml umlVar) {
        Object obj;
        if (umlVar == null) {
            return false;
        }
        try {
            Map<String, Object> mapLl = umlVar.ll();
            return (mapLl == null || (obj = mapLl.get(TTAdConstant.SDK_BIDDING_TYPE)) == null || 2 != Integer.parseInt(obj.toString())) ? false : true;
        } catch (Throwable th) {
            th.getMessage();
            return false;
        }
    }

    private String yyl(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return com.bytedance.sdk.component.utils.mxq.kq(str);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.fax.bob("MaterialMeta", "generate icon key error", th.getMessage());
            return null;
        }
    }

    public void bob(int i10) {
        this.fax = i10;
    }

    public void bss(int i10) {
        this.lqo = i10;
    }

    public void ea(int i10) {
        if (i10 < 0 || i10 > 30) {
            i10 = 6;
        }
        this.rhi = i10;
    }

    public void ebt(int i10) {
        this.tk = i10;
    }

    public void fax(int i10) {
        this.oyl = i10;
    }

    public void gm(int i10) {
        this.zp = i10;
    }

    public void ha(int i10) {
        this.sv = i10;
    }

    public void ibd(int i10) {
        this.jhy = i10;
    }

    public void jhe(int i10) {
        this.vt = i10;
    }

    public void kq(com.bytedance.sdk.openadsdk.core.model.kq kqVar) {
        if (kqVar != null) {
            this.rs = kqVar;
        }
    }

    public void ls(int i10) {
        this.ll = Math.max(0, i10);
    }

    public void mq(int i10) {
        this.ju = i10;
    }

    public void mxq(int i10) {
        this.fsp = i10;
    }

    public void nb(int i10) {
        this.kfr = i10;
    }

    public void nn(String str) {
        this.ezl = str;
    }

    public void nz(int i10) {
        this.ze = i10;
    }

    public void nze(int i10) {
        this.noa = i10;
    }

    public void ou(int i10) {
        this.ayo = i10;
    }

    public void oxe(int i10) {
        this.iy = i10;
    }

    public void rs(int i10) {
        this.ldy = i10;
    }

    public void rz(int i10) {
        this.ced = i10;
    }

    public void sns(int i10) {
        this.wqw = i10;
    }

    public void suf(int i10) {
        this.rao = i10;
    }

    public void syw(int i10) {
        this.ok = i10;
    }

    public void tvh(int i10) {
        this.tn = i10;
    }

    public void ubx(String str) {
        this.nv = str;
    }

    public int ui() {
        return this.tvh;
    }

    public void uml(int i10) {
        this.aed = i10;
    }

    public void vvw(int i10) {
        this.tvh = i10;
    }

    public void wcx(int i10) {
        this.oz = i10;
    }

    public void wee(int i10) {
        this.ebt = i10;
    }

    public void wf(int i10) {
        this.qdf = i10;
    }

    public void wki(int i10) {
        this.rhg = i10;
    }

    public void wol(int i10) {
        this.jvy = i10;
    }

    public void xk(int i10) {
        this.mq = i10;
    }

    public void xn(int i10) {
        this.mz = i10;
    }

    public void xp(int i10) {
        this.syt = i10;
    }

    public void ysx(int i10) {
        this.nze = i10;
    }

    public static boolean bob(uml umlVar) {
        return (umlVar == null || umlVar.job() == null || umlVar.job().j() != 7 || ha.oq(umlVar)) ? false : true;
    }

    public void dgq(String str) {
        this.bnx = str;
    }

    public void ebt(String str) {
        this.aq = str;
    }

    public void fax(String str) {
        this.pms = str;
    }

    public void gm(String str) {
        this.oxe = str;
    }

    public void ha(String str) {
        this.ne = str;
    }

    public void ibd(String str) {
        this.qvq = str;
    }

    public void jhe(String str) {
        this.ea = str;
    }

    public void kq(int i10) {
        this.wf = i10;
    }

    public void mq(String str) {
        this.xp = str;
    }

    public void mxq(String str) {
        this.wj = str;
    }

    public void nb(String str) {
        this.hn = str;
    }

    public void nn(int i10) {
        kq(i10, -1);
    }

    public void nz(String str) {
        this.ibd = str;
    }

    public void nze(String str) {
        this.rxz = str;
    }

    public void oq(int i10) {
        this.xn = i10;
    }

    public void ou(String str) {
        this.gm = str;
    }

    public void qip(int i10) {
        this.suf = i10;
    }

    public void rs(String str) {
        this.job = str;
    }

    public void sns(String str) {
        this.ysx = str;
    }

    public void suf(String str) {
        this.xgx = str;
    }

    public void ubx(int i10) {
        this.syw = i10;
    }

    public void uml(String str) {
        this.ui = str;
    }

    public void vvw(String str) {
        this.fm = str;
    }

    public void wbn(int i10) {
        this.gg = i10;
    }

    public void wcx(String str) {
        this.pfu = str;
    }

    public void wf(String str) {
        this.vyv = str;
    }

    public void wki(String str) {
        this.ax = str;
    }

    public void xn(String str) {
        if (TextUtils.isEmpty(str)) {
            this.rjo = com.bytedance.sdk.openadsdk.ou.kq.bob.bob;
        } else {
            this.rjo = str;
        }
    }

    public static JSONObject bob(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new JSONObject(str);
        } catch (JSONException e10) {
            com.bytedance.sdk.component.utils.fax.bob("MaterialMeta", e10.getMessage());
            return null;
        }
    }

    public static int fou(String str) {
        return kq(bob(str));
    }

    public static boolean oq(uml umlVar) {
        return (kq(umlVar) || bob(umlVar)) ? false : true;
    }

    private static long syt(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optLong("uid", 0L);
        }
        return 0L;
    }

    public void dgq(boolean z9) {
        this.qad = z9;
    }

    public void fgm(int i10) {
        this.wee = i10;
    }

    public void kq(long j10) {
        this.mxq = j10;
    }

    public void mxq(boolean z9) {
        this.csi = z9;
    }

    public void nn(boolean z9) {
        this.ul = z9;
    }

    public void nze(boolean z9) {
        this.ain = z9;
    }

    public void sns(boolean z9) {
        this.nb = z9;
    }

    public void suf(boolean z9) {
        this.kq = z9;
    }

    public JSONObject ubx(boolean z9) {
        JSONObject jSONObjectCsi;
        JSONObject jSONObjectUbx;
        JSONObject jSONObject = new JSONObject();
        if (z9) {
            try {
                jSONObject.put("raw_response_info", sb());
            } catch (Exception unused) {
            }
        }
        jSONObject.put("interaction_type", wqw());
        jSONObject.put("iv_skip_time", this.suf);
        jSONObject.put("rv_skip_time", this.nze);
        jSONObject.put(bob, xb());
        jSONObject.put("interaction_method", uaj());
        jSONObject.put("top_area_leave_blank", hlh());
        jSONObject.put("lp_click_type", qmk());
        jSONObject.put("lp_click_interval", ch());
        jSONObject.put("proportion_watching", rhg());
        jSONObject.put(oq, tk());
        jSONObject.put(fou, xgx());
        jSONObject.put("target_url", ze());
        jSONObject.put("app_log_url", ma());
        jSONObject.put("settings_url", this.gm);
        jSONObject.put("gecko_id", ugp());
        jSONObject.put("extension", lag());
        jSONObject.put("ad_id", dra());
        jSONObject.put("source", fsp());
        jSONObject.put("app_name", oyl());
        jSONObject.put("screenshot", ngf());
        jSONObject.put("dislike_control", rf());
        jSONObject.put("play_bar_show_time", ul());
        jSONObject.put("play_bar_style", vd());
        jSONObject.put("if_block_lp", noa());
        jSONObject.put("cache_sort", ldy());
        jSONObject.put("if_sp_cache", et());
        jSONObject.put("render_control", fm());
        jSONObject.put("mrc_report", this.ok);
        jSONObject.put("isMrcReportFinish", this.ugp);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("cta", wj());
        jSONObject2.put("other", qdf());
        jSONObject.put("set_click_type", jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("reward_name", hn());
        jSONObject3.put("reward_amount", aq());
        jSONObject.put("reward_data", jSONObject3);
        if (!TextUtils.isEmpty(mq()) && !TextUtils.isEmpty(jhe())) {
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("adchoices_icon", mq());
            jSONObject4.put("adchoices_url", jhe());
            jSONObject.put("dsp_adchoices", jSONObject4);
        }
        wcx wcxVarQvq = qvq();
        if (wcxVarQvq != null && !TextUtils.isEmpty(wcxVarQvq.kq())) {
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("url", wcxVarQvq.kq());
            jSONObject5.put("height", wcxVarQvq.bob());
            jSONObject5.put("width", wcxVarQvq.oq());
            jSONObject.put("icon", jSONObject5);
        }
        wcx wcxVarVdk = vdk();
        if (wcxVarVdk != null && !TextUtils.isEmpty(wcxVarVdk.kq())) {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("url", wcxVarVdk.kq());
            jSONObject6.put("height", wcxVarVdk.bob());
            jSONObject6.put("width", wcxVarVdk.oq());
            jSONObject.put("cover_image", jSONObject6);
        }
        JSONObject jSONObjectCed = ced();
        if (jSONObjectCed != null) {
            jSONObject.put("session_params", jSONObjectCed);
        }
        JSONObject jSONObjectZtj = ztj();
        if (jSONObjectZtj != null) {
            jSONObject.put("dynamic_configs", jSONObjectZtj);
        }
        ubx ubxVarEvn = evn();
        if (ubxVarEvn != null) {
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put("click_upper_content_area", ubxVarEvn.kq);
            jSONObject7.put("click_upper_non_content_area", ubxVarEvn.oq);
            jSONObject7.put("click_lower_content_area", ubxVarEvn.bob);
            jSONObject7.put("click_lower_non_content_area", ubxVarEvn.fou);
            jSONObject7.put("click_button_area", ubxVarEvn.csi);
            jSONObject7.put("click_video_area", ubxVarEvn.rhi);
            jSONObject.put("click_area", jSONObject7);
        }
        syt sytVarOu = ou();
        if (sytVarOu != null) {
            jSONObject.put("arbitrage_interceptor_params", sytVarOu.syt());
        }
        AdSlot adSlotClh = clh();
        if (adSlotClh != null) {
            jSONObject.put("adslot", adSlotClh.toJsonObj());
        }
        kq(this, jSONObject);
        List<String> listJvy = jvy();
        if (listJvy != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator<String> it = listJvy.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next());
            }
            jSONObject.put("show_url", jSONArray);
        }
        List<String> listLqo = lqo();
        if (listLqo != null) {
            JSONArray jSONArray2 = new JSONArray();
            Iterator<String> it2 = listLqo.iterator();
            while (it2.hasNext()) {
                jSONArray2.put(it2.next());
            }
            jSONObject.put("click_url", jSONArray2);
        }
        List<String> listTn = tn();
        if (listTn != null) {
            JSONArray jSONArray3 = new JSONArray();
            Iterator<String> it3 = listTn.iterator();
            while (it3.hasNext()) {
                jSONArray3.put(it3.next());
            }
            jSONObject.put("play_start", jSONArray3);
        }
        jSONObject.put("phone_num", ax());
        jSONObject.put("title", gg());
        jSONObject.put("description", be());
        jSONObject.put("ext", jnr());
        jSONObject.put("image_mode", pcj());
        jSONObject.put("cover_click_area", jwr());
        jSONObject.put("intercept_flag", aqe());
        jSONObject.put("button_text", jqv());
        jSONObject.put("ad_logo", pw());
        jSONObject.put("video_adaptation", vho());
        jSONObject.put("feed_video_opentype", rrl());
        jSONObject.put(AdUnitActivity.EXTRA_ORIENTATION, nvp());
        jSONObject.put("aspect_ratio", tqu());
        oq(this, jSONObject);
        wki wkiVarNe = ne();
        if (wkiVarNe != null) {
            JSONObject jSONObject8 = new JSONObject();
            jSONObject8.put("deeplink_url", wkiVarNe.kq());
            jSONObject8.put("fallback_url", wkiVarNe.oq());
            jSONObject8.put("fallback_type", wkiVarNe.bob());
            jSONObject.put("deep_link", jSONObject8);
        }
        jSONObject.put("is_web_jump_ip", this.nn);
        rs rsVarWe = we();
        if (rsVarWe != null && (jSONObjectUbx = rsVarWe.ubx()) != null) {
            jSONObject.put("oem", jSONObjectUbx);
        }
        ebt ebtVarOqf = oqf();
        if (ebtVarOqf != null && (jSONObjectCsi = ebtVarOqf.csi()) != null) {
            jSONObject.put("multi_ad_scene", jSONObjectCsi);
        }
        List<FilterWord> listOk = ok();
        if (listOk != null) {
            JSONArray jSONArray4 = new JSONArray();
            Iterator<FilterWord> it4 = listOk.iterator();
            while (it4.hasNext()) {
                JSONObject jSONObjectOq = oq(it4.next());
                if (jSONObjectOq != null) {
                    jSONArray4.put(jSONObjectOq);
                }
            }
            jSONObject.put("filter_words", jSONArray4);
        }
        xk().kq(jSONObject);
        jSONObject.put("count_down", xh());
        jSONObject.put("expiration_time", flb());
        c cVarQsb = qsb();
        if (cVarQsb != null) {
            jSONObject.put(MimeTypes.BASE_TYPE_VIDEO, cVarQsb.M());
        }
        c cVarHmq = hmq();
        if (cVarHmq != null) {
            jSONObject.put("h265_video", cVarHmq.M());
        }
        jSONObject.put("video_encode_type", tpg());
        JSONObject jSONObject9 = new JSONObject();
        jSONObject9.put("if_send_click", ju());
        jSONObject.put("download_conf", jSONObject9);
        if (ll() != null) {
            JSONObject jSONObject10 = new JSONObject();
            Set<Map.Entry<String, Object>> setEntrySet = ll().entrySet();
            if (!setEntrySet.isEmpty()) {
                for (Map.Entry<String, Object> entry : setEntrySet) {
                    jSONObject10.put(entry.getKey(), entry.getValue());
                }
            }
            jSONObject.put("media_ext", jSONObject10);
        }
        jSONObject.put("lp_cache_count", rjo());
        kq kqVarZp = zp();
        if (kqVarZp != null) {
            JSONObject jSONObject11 = new JSONObject();
            jSONObject11.put("id", kqVarZp.fou());
            jSONObject11.put("md5", kqVarZp.csi());
            jSONObject11.put("url", kqVarZp.rhi());
            jSONObject11.put(JsonStorageKeyNames.DATA_KEY, kqVarZp.rjo());
            jSONObject11.put("diff_data", kqVarZp.syt());
            jSONObject11.put("version", kqVarZp.bob());
            jSONObject11.put("dynamic_creative", kqVarZp.dgq());
            jSONObject11.put("engine_version", kqVarZp.ubx());
            jSONObject11.put("ugen_data", kqVarZp.nze());
            jSONObject11.put("ugen_md5", kqVarZp.suf());
            jSONObject11.put("ugen_url", kqVarZp.wki());
            jSONObject.put("tpl_info", jSONObject11);
        }
        ktb ktbVar = this.lol;
        if (ktbVar != null) {
            jSONObject.put("tpl_info_v3", ktbVar.rjo());
        }
        jSONObject.put("dynamic_creative", vt());
        jSONObject.put("creative_extra", rxz());
        jSONObject.put("market_url", qy());
        jSONObject.put("auction_price", rul());
        jSONObject.put("ad_info", rao());
        jSONObject.put("is_package_open", czb());
        jSONObject.put("playable_duration_time", vu());
        jSONObject.put("playable_endcard_close_time", cvt());
        jSONObject.put("endcard_close_time", lol());
        JSONObject jSONObject12 = new JSONObject();
        jSONObject12.put("render_sequence", mz());
        jSONObject12.put("backup_render_control", jhy());
        jSONObject12.put("reserve_time", qbl());
        jSONObject12.put("render_thread", nv());
        jSONObject.put("render", jSONObject12);
        if (this.ma == null) {
            mq mqVar = new mq();
            this.ma = mqVar;
            mqVar.kq("");
            this.ma.kq(10L);
            this.ma.oq(20L);
            this.ma.bob(10L);
            this.ma.fou(20L);
        }
        JSONObject jSONObject13 = new JSONObject();
        jSONObject13.put("onlylp_loading_maxtime", this.ma.kq());
        jSONObject13.put("straight_lp_showtime", this.ma.oq());
        jSONObject13.put("onlyagg_loading_maxtime", this.ma.bob());
        jSONObject13.put("straight_agg_showtime", this.ma.fou());
        jSONObject13.put("loading_text", this.ma.csi());
        gm gmVar = this.uc;
        if (gmVar != null) {
            jSONObject13 = gmVar.kq(jSONObject13);
        }
        jSONObject.put("interaction_method_params", jSONObject13);
        JSONObject jSONObject14 = new JSONObject();
        jSONObject14.put("splash_clickarea", ea());
        jSONObject14.put("splash_layout_id", qip());
        jSONObject14.put("load_wait_time", ysx());
        rjo rjoVar = this.tqu;
        jSONObject14.put("skip_time", rjoVar != null ? rjoVar.kq() : 0);
        jSONObject.put("splash_control", jSONObject14);
        if (rn()) {
            jSONObject.put("dsp_html", this.ne);
        }
        if (bns()) {
            jSONObject.put("vast_json", this.xo.nn());
        }
        jSONObject.put("dsp_material_type", ty());
        jSONObject.put("deep_link_appname", this.qip);
        jSONObject.put("landing_page_download_clicktype", this.xk);
        nze nzeVar = this.ztj;
        if (nzeVar != null) {
            jSONObject.put("dsp_style", nzeVar.bob());
        }
        jSONObject.put("identificationOverlayContent", this.ezl);
        if (this.vu != null) {
            JSONObject jSONObject15 = new JSONObject();
            jSONObject15.put("endcard", this.vu.kq(this.cvt));
            jSONObject.put("ugen", jSONObject15);
        }
        jSONObject.put("preload_h5_type", wol());
        jSONObject.put("hasReportShow", this.lag);
        jSONObject.put("endcard_creative", this.nv);
        jSONObject.put("image_stay", this.vni);
        jSONObject.put("ad_label", this.zj.rhi());
        JSONObject jSONObject16 = new JSONObject();
        jSONObject16.put("enable", this.csi);
        jSONObject16.put("wait_time", this.rhi);
        jSONObject16.put("label", this.rjo);
        jSONObject.put("ev", jSONObject16);
        jSONObject.put("ad_label", this.zj.rhi());
        if (this.hmq != null) {
            JSONObject jSONObject17 = new JSONObject();
            jSONObject17.put("width", this.hmq.getWidth());
            jSONObject17.put("height", this.hmq.getHeight());
            jSONObject.put("banner", jSONObject17);
        }
        if (!TextUtils.isEmpty(this.bnx)) {
            jSONObject.put("gdid_encrypted", this.bnx);
        }
        csi csiVar = this.wcx;
        if (csiVar != null) {
            jSONObject.put("ad_tracks", csiVar.oq());
        }
        nb nbVar = this.ou;
        if (nbVar != null) {
            jSONObject.put("popup", nbVar.fou());
        }
        jSONObject.put("playable_close_time", this.ebt);
        return jSONObject;
    }

    public void vvw(boolean z9) {
        this.vvw = z9;
    }

    public void wki(boolean z9) {
        this.hw = z9;
    }

    public static boolean kq(uml umlVar, boolean z9, boolean z10, boolean z11, boolean z12) {
        if (kq(umlVar) || z12 || umlVar == null || umlVar.job() == null || TextUtils.isEmpty(umlVar.job().L())) {
            return false;
        }
        if (bob(umlVar)) {
            return z11;
        }
        return (umlVar.job() == null || umlVar.job().o() != 1) ? z9 : z10;
    }

    public static double oq(String str) {
        return dgq(bob(str));
    }

    public void dgq(int i10) {
        this.vni = i10;
    }

    public void fgm(String str) {
        this.qip = str;
    }

    public void fou(int i10) {
        this.zfx = i10;
    }

    public void ktb(int i10) {
        this.tpg = i10;
    }

    public void pfu(int i10) {
        this.aqe = i10;
    }

    public void syt(String str) {
        this.nvp = str;
    }

    public void yyl(int i10) {
        this.wxb = i10;
    }

    public void zfx(int i10) {
        this.mku = i10;
    }

    public void fou(boolean z9) {
        this.evn = z9;
    }

    public void jq(int i10) {
        this.xk = i10;
    }

    public void ktb(String str) {
        this.ngf = str;
    }

    public void rjo(String str) {
        this.qy = str;
    }

    public void syt(boolean z9) {
        this.lag = z9;
    }

    public String zfx(String str) {
        JSONObject jSONObjectZj = zj();
        return jSONObjectZj != null ? jSONObjectZj.optString("rit", str) : str;
    }

    public static String oq(Context context, uml umlVar) {
        if (context != null && umlVar != null) {
            try {
                if (umlVar.wqw() != 8) {
                    if (umlVar.ou().kq()) {
                    }
                }
                String strKq = com.bytedance.sdk.openadsdk.core.kq.kq.kq(context);
                if (TextUtils.isEmpty(strKq)) {
                    return null;
                }
                return strKq;
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.fax.bob("MaterialMeta", th.getMessage());
            }
        }
        return null;
    }

    public static boolean rhi(uml umlVar) {
        if (umlVar == null) {
            return false;
        }
        int iPcj = umlVar.pcj();
        return iPcj == 5 || iPcj == 15 || iPcj == 50;
    }

    public void bob(boolean z9) {
        this.vd = z9;
    }

    public void fou(JSONObject jSONObject) {
        this.xb = jSONObject;
    }

    public void rjo(int i10) {
        this.rn = i10;
    }

    public void syt(int i10) {
        this.hcm = i10;
    }

    public void ye(int i10) {
        this.dra = i10;
    }

    public static boolean csi(uml umlVar) {
        if (umlVar == null) {
            return false;
        }
        int iPcj = umlVar.pcj();
        return umlVar.bns() || iPcj == 5 || iPcj == 15 || iPcj == 50;
    }

    public void bob(wcx wcxVar) {
        this.nz.add(wcxVar);
    }

    public void fou(long j10) {
        this.wki = j10;
    }

    public void pms(int i10) {
        this.rf = i10;
    }

    public void rhi(String str) {
        this.fgm = str;
    }

    public void rjo(boolean z9) {
        this.dt = z9;
    }

    public static boolean kq(uml umlVar) {
        return (umlVar == null || umlVar.job() == null || umlVar.job().j() != 1) ? false : true;
    }

    public void bob(long j10) {
        this.rrl = j10;
    }

    public void rhi(int i10) {
        this.nn = i10;
    }

    public void rjo(JSONObject jSONObject) {
        this.zj.kq(jSONObject);
    }

    public static com.bytedance.sdk.openadsdk.core.wki.kq.oq kq(String str, uml umlVar) {
        umlVar.oxe(0);
        int iAin = umlVar.ain();
        int i10 = 3;
        if (iAin == 3) {
            i10 = 4;
        } else if (iAin == 7) {
            i10 = 1;
        } else if (iAin == 8) {
            i10 = 2;
        }
        com.bytedance.sdk.openadsdk.core.wki.kq.oq oqVar = new com.bytedance.sdk.openadsdk.core.wki.kq.oq(str, umlVar.qsb(), umlVar.hmq(), umlVar.mku(), umlVar.tpg(), i10);
        oqVar.kq(com.bytedance.sdk.openadsdk.jhe.kq.kq("video_error_conf", 0));
        oqVar.bob(H1.a.i(oqVar.mxq()));
        return oqVar;
    }

    public void bob(JSONObject jSONObject) {
        this.vi = jSONObject;
    }

    public void csi(String str) {
        this.ha = str;
    }

    public void rhi(boolean z9) {
        this.bu = z9;
    }

    public void rjo(long j10) {
        this.uml = j10;
    }

    public void bob(c cVar) {
        this.vho = cVar;
    }

    public void csi(int i10) {
        this.tau = i10;
    }

    public void oq(boolean z9) {
        this.ktb = z9;
    }

    public void rhi(JSONObject jSONObject) {
        this.jnr = jSONObject;
    }

    public void csi(boolean z9) {
        this.clh = z9;
    }

    public void oq(long j10) {
        this.gec = j10;
    }

    public void rhi(long j10) {
        this.jhe = j10;
    }

    public void csi(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.wee = 4;
        this.ui = jSONObject.optString("id");
        this.wj = jSONObject.optString("source");
        rhi rhiVar = new rhi();
        this.uaj = rhiVar;
        rhiVar.bob(jSONObject.optString("pkg_name"));
        this.uaj.oq(jSONObject.optString(MediationMetaData.KEY_NAME));
        this.uaj.kq(jSONObject.optString("download_url"));
    }

    public void oq(com.bytedance.sdk.openadsdk.core.ubx.syt.kq kqVar) {
        this.cvt = kqVar;
        com.bytedance.sdk.openadsdk.core.ubx.kq.oq.kq().kq(kqVar, "endcard");
    }

    public static long kq(String str) {
        return syt(bob(str));
    }

    public void oq(double d10) {
        if (d10 != 2.0d && d10 != 1.0d) {
            this.be = 2;
        } else {
            this.be = (int) d10;
        }
    }

    public static int kq(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optInt("ut", 0);
        }
        return 0;
    }

    public void oq(JSONObject jSONObject) {
        this.bns = jSONObject;
    }

    public static String kq(Context context, uml umlVar) {
        if (context == null || umlVar == null || !((umlVar.ain() == 8 || umlVar.ain() == 7) && umlVar.iaf())) {
            return null;
        }
        String strOq = oq(context, umlVar);
        if (TextUtils.isEmpty(strOq) || com.bytedance.sdk.openadsdk.core.kq.kq.kq() != 1) {
            return null;
        }
        return strOq;
    }

    public void oq(wcx wcxVar) {
        this.rz = wcxVar;
    }

    private JSONObject oq(FilterWord filterWord) {
        if (filterWord == null) {
            return null;
        }
        try {
            if (filterWord.isValid()) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", filterWord.getId());
                jSONObject.put(MediationMetaData.KEY_NAME, filterWord.getName());
                jSONObject.put("is_selected", filterWord.getIsSelected());
                if (filterWord.hasSecondOptions()) {
                    JSONArray jSONArray = new JSONArray();
                    Iterator<FilterWord> it = filterWord.getOptions().iterator();
                    while (it.hasNext()) {
                        jSONArray.put(oq(it.next()));
                    }
                    if (jSONArray.length() > 0) {
                        jSONObject.put("options", jSONArray);
                    }
                }
                return jSONObject;
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public void csi(long j10) {
        this.dgq = j10;
    }

    public void kq(boolean z9) {
        this.sns = z9;
    }

    public void kq(syt sytVar) {
        this.qsb = sytVar;
    }

    public void kq(mq mqVar) {
        this.ma = mqVar;
    }

    public void kq(gm gmVar) {
        this.uc = gmVar;
    }

    public void kq(com.bytedance.sdk.openadsdk.core.ubx.syt.kq kqVar) {
        this.vu = kqVar;
        com.bytedance.sdk.openadsdk.core.ubx.kq.oq.kq().kq(kqVar, "endcard");
    }

    public void kq(rjo rjoVar) {
        this.tqu = rjoVar;
    }

    public void kq(ha haVar) {
        this.wt = haVar;
    }

    public void kq(int i10, int i11) {
        this.wbn = i10;
        this.tvh = i10;
        if (this.yo == null) {
            this.tvh = 0;
            return;
        }
        if (i11 <= 0) {
            i11 = ain();
        }
        if (this.yo.getDurationSlotType() != 3 && i11 != 3) {
            if (this.yo.getDurationSlotType() != 7 && this.yo.getDurationSlotType() != 8 && i11 != 7 && i11 != 8) {
                if (!this.qad && ha.oq(this)) {
                    this.tvh = 4;
                    return;
                }
                if (this.wbn == 4 && !ha.oq(this)) {
                    this.tvh = 0;
                }
                int i12 = this.wbn;
                if (i12 == 41) {
                    this.tvh = 41;
                    return;
                }
                if (i10 >= 5) {
                    this.tvh = 0;
                    return;
                }
                if (i12 == 2 && wqw() != 3) {
                    this.tvh = 0;
                    return;
                } else {
                    if (i10 == 0 || (i10 == 1 && wqw() != 3)) {
                        this.tvh = 0;
                        return;
                    }
                    return;
                }
            }
            if (!this.qad) {
                if (ha.bob(this)) {
                    this.tvh = 12;
                    return;
                } else if (ha.oq(this)) {
                    this.tvh = 9;
                    return;
                }
            }
            if (this.wbn == 5 && !fax.fou(this)) {
                this.tvh = 7;
            }
            if (this.wbn == 6 && !fax.oq(this)) {
                this.tvh = 7;
            }
            if (this.wbn == 8 && jwr() != 100) {
                this.tvh = 7;
            }
            if (this.wbn == 19 && TextUtils.isEmpty(this.pfu)) {
                this.tvh = 7;
            }
            if (this.wbn == 20 && TextUtils.isEmpty(this.pfu)) {
                this.tvh = 7;
            }
            if (this.wbn == 38 && !fax.bob(this)) {
                this.tvh = 7;
            }
            if (i10 < 5) {
                this.tvh = 7;
                return;
            }
            return;
        }
        this.tvh = 14;
    }

    public void oq(c cVar) {
        this.pw = cVar;
    }

    public static void oq(uml umlVar, JSONObject jSONObject) throws JSONException {
        rhi rhiVarXo = umlVar.xo();
        if (rhiVarXo != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("app_name", rhiVarXo.oq());
            jSONObject2.put("package_name", rhiVarXo.bob());
            jSONObject2.put("download_url", rhiVarXo.kq());
            jSONObject2.put("score", rhiVarXo.fou());
            jSONObject2.put("comment_num", rhiVarXo.csi());
            jSONObject2.put("app_size", rhiVarXo.rhi());
            jSONObject2.put("app_category", rhiVarXo.rjo());
            jSONObject.put("app", jSONObject2);
        }
    }

    public void kq(double d10) {
        if (d10 != 2.0d && d10 != 1.0d) {
            this.jqv = 1;
        } else {
            this.jqv = (int) d10;
        }
    }

    public void kq(ubx ubxVar) {
        this.ymy = ubxVar;
    }

    public void kq(AdSlot adSlot) {
        this.yo = adSlot;
    }

    public void kq(kq kqVar) {
        this.jwr = kqVar;
        com.bytedance.sdk.component.adexpress.kq.bob.fou fouVarAed = aed();
        if (fouVarAed != null && !ymy()) {
            com.bytedance.sdk.component.adexpress.kq.oq.oq.kq(fouVarAed);
        }
        if (kqVar == null || TextUtils.isEmpty(kqVar.wki())) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.ubx.kq.oq.kq().kq(vzg(), "ad");
    }

    public void kq(ktb ktbVar) {
        this.lol = ktbVar;
        if (ktbVar == null || TextUtils.isEmpty(ktbVar.bob())) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.ubx.kq.oq.kq().kq(ore(), "adv3");
    }

    public void kq(c cVar) {
        this.rul = cVar;
    }

    public void kq(suf sufVar) {
        this.vdk = sufVar;
    }

    public void kq(wcx wcxVar) {
        kq(wcxVar, ubx);
        String strYyl = yyl(wcxVar.kq());
        if (!TextUtils.isEmpty(strYyl)) {
            wcxVar.oq(strYyl);
        }
        this.ls = wcxVar;
    }

    private void kq(wcx wcxVar, int i10) {
        if (wcxVar != null) {
            try {
                if (TextUtils.isEmpty(wcxVar.kq())) {
                    return;
                }
                if (wcxVar.oq() == 0 && wcxVar.bob() == 0) {
                    wcxVar.kq(i10);
                    wcxVar.oq(i10);
                    return;
                }
                if (wcxVar.oq() == 0) {
                    if (wcxVar.bob() > i10) {
                        wcxVar.oq(i10);
                        wcxVar.kq(i10);
                        return;
                    } else {
                        wcxVar.kq(wcxVar.bob());
                        return;
                    }
                }
                if (wcxVar.bob() == 0) {
                    if (wcxVar.oq() > i10) {
                        wcxVar.oq(i10);
                        wcxVar.kq(i10);
                        return;
                    } else {
                        wcxVar.oq(wcxVar.oq());
                        return;
                    }
                }
                if (wcxVar.oq() > wcxVar.bob()) {
                    if (wcxVar.oq() > i10) {
                        wcxVar.oq((int) (i10 / (wcxVar.oq() / wcxVar.bob())));
                        wcxVar.kq(i10);
                        return;
                    }
                    return;
                }
                if (wcxVar.bob() > i10) {
                    wcxVar.kq((int) (i10 * (wcxVar.oq() / wcxVar.bob())));
                    wcxVar.oq(i10);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void kq(rhi rhiVar) {
        this.uaj = rhiVar;
    }

    public void kq(wki wkiVar) {
        this.hlh = wkiVar;
    }

    public void kq(FilterWord filterWord) {
        this.wol.add(filterWord);
    }

    public void kq(Map<String, Object> map) {
        this.et = map;
    }

    public void kq(float f10) {
        this.kiq = f10;
    }

    public void kq(com.bytedance.sdk.openadsdk.core.vvw.kq kqVar) {
        this.xo = kqVar;
    }

    public void kq(sns snsVar) {
        this.pcj = snsVar;
    }

    public void kq(nze nzeVar) {
        this.ztj = nzeVar;
    }

    public void kq(rs rsVar) {
        this.vg = rsVar;
    }

    public void kq(PAGBannerSize pAGBannerSize) {
        this.hmq = pAGBannerSize;
    }

    public void kq(ebt ebtVar) {
        this.bj = ebtVar;
    }

    public void kq(com.bytedance.sdk.openadsdk.ou.kq.oq oqVar) {
        this.ns = oqVar;
    }

    public void kq(fgm fgmVar) {
        this.zsr = fgmVar;
    }

    public void kq(csi csiVar) {
        this.wcx = csiVar;
    }

    public void kq(nb nbVar) {
        this.ou = nbVar;
    }

    public static void kq(uml umlVar, JSONObject jSONObject) throws JSONException {
        List<wcx> listKiq = umlVar.kiq();
        if (listKiq != null) {
            JSONArray jSONArray = new JSONArray();
            for (wcx wcxVar : listKiq) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("url", wcxVar.kq());
                jSONObject2.put("height", wcxVar.bob());
                jSONObject2.put("width", wcxVar.oq());
                jSONObject2.put("image_preview", wcxVar.rhi());
                jSONObject2.put("image_key", wcxVar.rjo());
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("image", jSONArray);
        }
    }
}
