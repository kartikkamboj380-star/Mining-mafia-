package com.bytedance.sdk.component.adexpress.dynamic.fou;

import com.unity3d.services.core.device.MimeTypes;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class rhi {
    private int aed;
    private int aq;
    private int aqe;
    private int ayo;
    private float bob;
    private int bss;
    private boolean clh;
    private boolean csi;
    private float dgq;
    private boolean ea;
    private int ebt;
    private JSONObject et;
    private boolean evn;
    private String fax;
    private String fgm;
    private String fm;
    private float fou;
    private boolean fsp;
    private String gm;
    private double ha;
    private int hlh;
    private int hn;
    private String iaf;
    private int ibd;
    private String jhe;
    private int jhy;
    private int job;
    private boolean jq;
    private String ju;
    private JSONObject jwr;
    private int kfr;
    private float kq;
    private String ktb;
    private double ldy;
    private boolean ls;
    private String mq;
    private String mxq;
    private List<kq> mz;
    private String nb;
    private float nn;
    private boolean noa;
    private boolean nz;
    private String nze;
    private float oq;
    private boolean ou;
    private int oxe;
    private String oyl;
    private boolean oz;
    private boolean pfu;
    private boolean pms;
    private int pw;
    private int qdf;
    private String qip;
    private long qvq = -1;
    private int rao;
    private String rhg;
    private float rhi;
    private float rjo;
    private int rrl;
    private double rs;
    private int rul;
    private int rxz;
    private int rz;
    private String sns;
    private String suf;
    private float syt;
    private int syw;
    private String tk;
    private int tvh;
    private int uaj;
    private double ubx;
    private boolean ui;
    private boolean ul;
    private String uml;
    private boolean vd;
    private String vdk;
    private int vho;
    private int vi;
    private int vt;
    private double vvw;
    private double wbn;
    private String wcx;
    private int wee;
    private String wf;
    private int wj;
    private String wki;
    private int wol;
    private boolean wqw;
    private int wxb;
    private int xb;
    private String xgx;
    private int xk;
    private String xn;
    private boolean xp;
    private String ye;
    private int ymy;
    private int yo;
    private JSONObject ysx;
    private int yyl;
    private String ze;
    private String zfx;
    private JSONObject zp;

    private void ibd(String str) {
        this.vdk = str;
    }

    public static rhi kq(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        rhi rhiVar = new rhi();
        rhiVar.oq(jSONObject.optString("adType", "embeded"));
        rhiVar.nze(jSONObject.optString("clickArea", "creative"));
        rhiVar.mxq(jSONObject.optString("clickTigger", "click"));
        rhiVar.bob(jSONObject.optString("fontFamily", "PingFangSC"));
        rhiVar.fou(jSONObject.optString("textAlign", "left"));
        rhiVar.csi(jSONObject.optString("color", "#999999"));
        rhiVar.rhi(jSONObject.optString("bgColor", "transparent"));
        rhiVar.rjo(jSONObject.optString("bgImgUrl", ""));
        rhiVar.ibd(jSONObject.optString("bgImgData", ""));
        rhiVar.syt(jSONObject.optString("borderColor", "#000000"));
        rhiVar.dgq(jSONObject.optString("borderStyle", "solid"));
        rhiVar.nn(jSONObject.optString("heightMode", "auto"));
        rhiVar.ubx(jSONObject.optString("widthMode", "fixed"));
        rhiVar.vvw(jSONObject.optString("interactText", ""));
        rhiVar.bob(jSONObject.optBoolean("isShowBgControl", false));
        rhiVar.wki(jSONObject.optString("interactBgColor", ""));
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("interactPosition");
        if (jSONObjectOptJSONObject != null) {
            rhiVar.rjo(jSONObjectOptJSONObject.optInt("translateY", 0));
            rhiVar.syt(jSONObjectOptJSONObject.optInt("translateX", 0));
            rhiVar.fou(jSONObjectOptJSONObject.optDouble("scaleX", 0.0d));
            rhiVar.csi(jSONObjectOptJSONObject.optDouble("scaleY", 0.0d));
        }
        rhiVar.suf(jSONObject.optString("interactType", ""));
        rhiVar.csi(jSONObject.optInt("interactSlideDirection", -1));
        rhiVar.sns(jSONObject.optString("justifyHorizontal", "space-around"));
        rhiVar.wcx(jSONObject.optString("justifyVertical", "flex-start"));
        rhiVar.oq(jSONObject.optDouble("timingStart"));
        rhiVar.bob(jSONObject.optDouble("timingEnd"));
        rhiVar.fou((float) jSONObject.optDouble("width", 0.0d));
        rhiVar.bob((float) jSONObject.optDouble("height", 0.0d));
        rhiVar.kq((float) jSONObject.optDouble("borderRadius", 0.0d));
        rhiVar.oq((float) jSONObject.optDouble("borderSize", 0.0d));
        rhiVar.oq(jSONObject.optBoolean("interactValidate", false));
        rhiVar.dgq((float) jSONObject.optDouble("fontSize", 0.0d));
        rhiVar.csi((float) jSONObject.optDouble("paddingBottom", 0.0d));
        rhiVar.rhi((float) jSONObject.optDouble("paddingLeft", 0.0d));
        rhiVar.rjo((float) jSONObject.optDouble("paddingRight", 0.0d));
        rhiVar.syt((float) jSONObject.optDouble("paddingTop", 0.0d));
        rhiVar.fou(jSONObject.optBoolean("lineFeed", false));
        rhiVar.dgq(jSONObject.optInt("lineCount", 0));
        rhiVar.rhi(jSONObject.optDouble("lineHeight", 1.2d));
        rhiVar.suf(jSONObject.optInt("letterSpacing", 0));
        rhiVar.csi(jSONObject.optBoolean("isDataFixed", false));
        rhiVar.nze(jSONObject.optInt("fontWeight"));
        rhiVar.rhi(jSONObject.optBoolean("lineLimit"));
        rhiVar.mxq(jSONObject.optInt("position"));
        rhiVar.gm(jSONObject.optString("align"));
        rhiVar.rjo(jSONObject.optBoolean("useLeft"));
        rhiVar.syt(jSONObject.optBoolean("useRight"));
        rhiVar.dgq(jSONObject.optBoolean("useTop"));
        rhiVar.nn(jSONObject.optBoolean("useBottom"));
        rhiVar.fax(jSONObject.optString(JsonStorageKeyNames.DATA_KEY));
        rhiVar.oq(jSONObject.optJSONObject("i18n"));
        rhiVar.vvw(jSONObject.optInt("marginLeft"));
        rhiVar.wki(jSONObject.optInt("marginRight"));
        rhiVar.nn(jSONObject.optInt("marginTop"));
        rhiVar.ubx(jSONObject.optInt("marginBottom"));
        rhiVar.sns(jSONObject.optInt("tagMaxCount"));
        rhiVar.ubx(jSONObject.optBoolean("allowTextFlow"));
        rhiVar.wcx(jSONObject.optInt("textFlowType"));
        rhiVar.gm(jSONObject.optInt("textFlowDuration"));
        rhiVar.fax(jSONObject.optInt("left"));
        rhiVar.mq(jSONObject.optInt("right"));
        rhiVar.jhe(jSONObject.optInt("top"));
        rhiVar.uml(jSONObject.optInt("bottom"));
        rhiVar.mq(jSONObject.optString("alignItems", "flex-start"));
        rhiVar.jhe(jSONObject.optString("direction", ""));
        rhiVar.kq(jSONObject.optBoolean("loop", false));
        rhiVar.nb(jSONObject.optInt("zIndex"));
        rhiVar.ha(jSONObject.optInt("interactVisibleTime"));
        rhiVar.ou(jSONObject.optInt("interactHiddenTime"));
        rhiVar.wki(jSONObject.optBoolean("interactEnableMask"));
        rhiVar.suf(jSONObject.optBoolean("interactWontHide"));
        rhiVar.kq(jSONObject.optString("bgGradient"));
        rhiVar.zfx(jSONObject.optInt("areaType"));
        rhiVar.ktb(jSONObject.optInt("interactSlideThreshold", 0));
        rhiVar.nz(jSONObject.optInt("interactBottomDistance", com.bytedance.sdk.component.adexpress.fou.oq() ? 0 : 120));
        rhiVar.wcx(jSONObject.optBoolean("openPlayableLandingPage", false));
        rhiVar.bob(jSONObject.optJSONObject(MimeTypes.BASE_TYPE_VIDEO));
        rhiVar.fou(jSONObject.optJSONObject("image"));
        rhiVar.wf(jSONObject.optInt("borderShadowExtent"));
        rhiVar.nze(jSONObject.optBoolean("bgGauseBlur"));
        rhiVar.xn(jSONObject.optInt("bgGauseBlurRadius"));
        rhiVar.mxq(jSONObject.optBoolean("showTimeProgress", false));
        rhiVar.sns(jSONObject.optBoolean("showPlayButton", false));
        rhiVar.kq(jSONObject.optDouble("bgColorCg", 0.0d));
        rhiVar.rhi(jSONObject.optInt("bgMaterialCenterCalcColor", 0));
        rhiVar.oq(jSONObject.optInt("borderTopLeftRadius", 0));
        rhiVar.kq(jSONObject.optInt("borderTopRightRadius", 0));
        rhiVar.fou(jSONObject.optInt("borderBottomLeftRadius", 0));
        rhiVar.bob(jSONObject.optInt("borderBottomRightRadius", 0));
        rhiVar.csi(jSONObject.optJSONObject("interactI18n"));
        rhiVar.nb(jSONObject.optString("imageObjectFit"));
        rhiVar.ou(jSONObject.optString("interactTitle"));
        rhiVar.fgm(jSONObject.optInt("interactTextPositionTop"));
        rhiVar.uml(jSONObject.optString("imageLottieTosPath"));
        rhiVar.vvw(jSONObject.optBoolean("animationsLoop"));
        rhiVar.ebt(jSONObject.optInt("lottieAppNameMaxLength"));
        rhiVar.rs(jSONObject.optInt("lottieAdDescMaxLength"));
        rhiVar.ibd(jSONObject.optInt("lottieAdTitleMaxLength"));
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("animations");
            if (jSONArrayOptJSONArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i10);
                    kq kqVar = new kq();
                    kqVar.bob(jSONObject2.optString("animationType"));
                    kqVar.kq(jSONObject2.optDouble("animationDuration"));
                    kqVar.oq(jSONObject2.optDouble("animationScaleX"));
                    kqVar.bob(jSONObject2.optDouble("animationScaleY"));
                    kqVar.fou(jSONObject2.optString("animationTimeFunction"));
                    kqVar.fou(jSONObject2.optDouble("animationDelay"));
                    kqVar.rhi(jSONObject2.optInt("animationIterationCount"));
                    kqVar.csi(jSONObject2.optString("animationDirection"));
                    kqVar.csi(jSONObject2.optDouble("animationInterval"));
                    kqVar.kq(jSONObject2.optInt("animationBorderWidth"));
                    kqVar.kq(jSONObject2.optLong("key"));
                    kqVar.oq(jSONObject2.optInt("animationEffectWidth"));
                    kqVar.bob(jSONObject2.optInt("animationSwing", 1));
                    kqVar.fou(jSONObject2.optInt("animationTranslateX"));
                    kqVar.csi(jSONObject2.optInt("animationTranslateY"));
                    kqVar.oq(jSONObject2.optString("animationRippleBackgroundColor"));
                    kqVar.kq(jSONObject2.optString("animationScaleDirection"));
                    kqVar.rjo(jSONObject2.optInt("animationFadeStart"));
                    kqVar.syt(jSONObject2.optInt("animationFadeEnd"));
                    kqVar.rhi(jSONObject2.optString("animationFillMode"));
                    kqVar.dgq(jSONObject2.optInt("animationBounceHeight"));
                    if (rhiVar.gm() > 0.0d) {
                        kqVar.fou(kqVar.suf() + rhiVar.gm());
                    }
                    arrayList.add(kqVar);
                }
                rhiVar.kq(arrayList);
            }
            if (jSONObject.has("triggerSlideMinDistance")) {
                rhiVar.ebt(jSONObject.optString("triggerSlideDirection", "0"));
                rhiVar.kq(jSONObject.optLong("triggerSlideMinDistance", 0L));
            }
        } catch (Exception unused) {
        }
        return rhiVar;
    }

    public boolean aed() {
        return this.evn;
    }

    public boolean aq() {
        return this.ui;
    }

    public int aqe() {
        return this.ayo;
    }

    public void ayo() {
        kq(this, this.jwr);
    }

    public int bob() {
        return this.vt;
    }

    public String bss() {
        return this.ktb;
    }

    public int clh() {
        return this.xb;
    }

    public int csi() {
        return this.aed;
    }

    public int dgq() {
        return this.ymy;
    }

    public boolean ea() {
        return this.pfu;
    }

    public String ebt() {
        return this.gm;
    }

    public boolean et() {
        return this.oz;
    }

    public int evn() {
        return this.vi;
    }

    public double fax() {
        return this.vvw;
    }

    public String fgm() {
        return this.nb;
    }

    public int fm() {
        return this.uaj;
    }

    public int fou() {
        return this.yo;
    }

    public String fsp() {
        return this.iaf;
    }

    public double gm() {
        return this.ubx;
    }

    public String ha() {
        return this.uml;
    }

    public boolean hlh() {
        return this.ea;
    }

    public int hn() {
        return this.xk;
    }

    public List<kq> iaf() {
        return this.mz;
    }

    public String jhe() {
        return this.mxq;
    }

    public String jhy() {
        return this.rhg;
    }

    public int job() {
        return this.aqe;
    }

    public int jq() {
        return this.syw;
    }

    public boolean ju() {
        return this.clh;
    }

    public String jwr() {
        return this.ju;
    }

    public int kfr() {
        return this.vho;
    }

    public int ktb() {
        return this.ebt;
    }

    public int ldy() {
        return this.rrl;
    }

    public int ls() {
        return this.wol;
    }

    public String mq() {
        return this.nze;
    }

    public float mxq() {
        return this.syt;
    }

    public String mz() {
        return this.fm;
    }

    public String nb() {
        return this.wcx;
    }

    public String nn() {
        return this.ze;
    }

    public int noa() {
        return this.qdf;
    }

    public double nz() {
        return this.ha;
    }

    public float nze() {
        return this.rjo;
    }

    public int oq() {
        return this.kfr;
    }

    public String ou() {
        return this.vdk;
    }

    public int oxe() {
        return this.tvh;
    }

    public boolean oyl() {
        return this.ul;
    }

    public int oz() {
        List<kq> list = this.mz;
        if (list == null) {
            return 0;
        }
        for (kq kqVar : list) {
            if ("translate".equals(kqVar.dgq()) && kqVar.rjo() < 0) {
                return -kqVar.rjo();
            }
        }
        return 0;
    }

    public int pfu() {
        return this.wee;
    }

    public boolean pms() {
        return this.ls;
    }

    public String pw() {
        return this.oyl;
    }

    public String qdf() {
        return this.qip;
    }

    public int qip() {
        return this.oxe;
    }

    public int rao() {
        return this.wj;
    }

    public int rhg() {
        return this.hlh;
    }

    public JSONObject rhi() {
        return this.zp;
    }

    public int rjo() {
        return this.rxz;
    }

    public int rrl() {
        return this.aq;
    }

    public String rs() {
        return this.jhe;
    }

    public int rul() {
        return this.rao;
    }

    public int rxz() {
        return this.job;
    }

    public int rz() {
        return this.bss;
    }

    public float sns() {
        return this.dgq;
    }

    public float suf() {
        return this.rhi;
    }

    public double syt() {
        return this.ldy;
    }

    public int syw() {
        return this.yyl;
    }

    public String tk() {
        return this.xgx;
    }

    public String tvh() {
        return this.xn;
    }

    public boolean uaj() {
        return this.xp;
    }

    public float ubx() {
        return this.kq;
    }

    public boolean ui() {
        return this.pms;
    }

    public boolean ul() {
        return this.fsp;
    }

    public String uml() {
        return this.sns;
    }

    public boolean vd() {
        return this.wqw;
    }

    public int vho() {
        return this.wxb;
    }

    public String vi() {
        return this.tk;
    }

    public boolean vt() {
        return this.vd;
    }

    public float vvw() {
        return this.oq;
    }

    public boolean wbn() {
        return this.nz;
    }

    public float wcx() {
        return this.nn;
    }

    public String wee() {
        return this.wf;
    }

    public int wf() {
        return this.ibd;
    }

    public JSONObject wj() {
        return this.ysx;
    }

    public boolean wki() {
        return this.csi;
    }

    public String wol() {
        return this.zfx;
    }

    public JSONObject wqw() {
        return this.jwr;
    }

    public int wxb() {
        return this.hn;
    }

    public void xb() {
        kq(this, this.et);
    }

    public long xgx() {
        return this.qvq;
    }

    public boolean xk() {
        return this.jq;
    }

    public double xn() {
        return this.rs;
    }

    public int xp() {
        return this.rz;
    }

    public double ye() {
        return this.wbn;
    }

    public int ymy() {
        return this.rul;
    }

    public int yo() {
        return this.pw;
    }

    public String ysx() {
        return this.ye;
    }

    public String yyl() {
        return this.fgm;
    }

    public boolean zfx() {
        return this.ou;
    }

    public int zp() {
        return this.jhy;
    }

    public void bob(int i10) {
        this.yo = i10;
    }

    public void csi(int i10) {
        this.rxz = i10;
    }

    public void dgq(float f10) {
        this.nn = f10;
    }

    public void ebt(int i10) {
        this.vi = i10;
    }

    public void fax(String str) {
        this.qip = str;
    }

    public void fgm(int i10) {
        this.job = i10;
    }

    public void fou(int i10) {
        this.aed = i10;
    }

    public void gm(String str) {
        this.ye = str;
    }

    public void ha(int i10) {
        this.rrl = i10;
    }

    public String ibd() {
        return this.mq;
    }

    public void jhe(int i10) {
        this.hn = i10;
    }

    public void ktb(int i10) {
        this.rul = i10;
    }

    public void mq(int i10) {
        this.wj = i10;
    }

    public void mxq(String str) {
        this.ktb = str;
    }

    public void nb(int i10) {
        this.rao = i10;
    }

    public void nn(String str) {
        this.mq = str;
    }

    public void nz(int i10) {
        this.aqe = i10;
    }

    public void nze(String str) {
        this.zfx = str;
    }

    public void oq(int i10) {
        this.vt = i10;
    }

    public void ou(int i10) {
        this.wxb = i10;
    }

    public void rhi(int i10) {
        this.ymy = i10;
    }

    public void rjo(float f10) {
        this.syt = f10;
    }

    public void rs(int i10) {
        this.ayo = i10;
    }

    public void sns(String str) {
        this.wf = str;
    }

    public void suf(String str) {
        this.fgm = str;
    }

    public void syt(float f10) {
        this.dgq = f10;
    }

    public void ubx(String str) {
        this.jhe = str;
    }

    public void uml(int i10) {
        this.aq = i10;
    }

    public void vvw(String str) {
        this.uml = str;
    }

    public void wcx(String str) {
        this.xn = str;
    }

    public void wf(int i10) {
        this.vho = i10;
    }

    public void wki(String str) {
        this.nb = str;
    }

    public void xn(int i10) {
        this.pw = i10;
    }

    public void zfx(int i10) {
        this.jhy = i10;
    }

    public void bob(float f10) {
        this.bob = f10;
    }

    public void csi(float f10) {
        this.rhi = f10;
    }

    public void dgq(String str) {
        this.fax = str;
    }

    public void ebt(String str) {
        this.xgx = str;
    }

    public void fax(int i10) {
        this.qdf = i10;
    }

    public void fou(float f10) {
        this.fou = f10;
    }

    public void gm(int i10) {
        this.hlh = i10;
    }

    public void ibd(int i10) {
        this.xb = i10;
    }

    public void jhe(String str) {
        this.rhg = str;
    }

    public void mq(String str) {
        this.fm = str;
    }

    public void mxq(int i10) {
        this.oxe = i10;
    }

    public void nb(String str) {
        this.ju = str;
    }

    public void nn(int i10) {
        this.wol = i10;
    }

    public void nze(int i10) {
        this.rz = i10;
    }

    public void oq(float f10) {
        this.oq = f10;
    }

    public void ou(String str) {
        this.tk = str;
    }

    public void rhi(float f10) {
        this.rjo = f10;
    }

    public void rjo(String str) {
        this.wcx = str;
    }

    public void sns(int i10) {
        this.xk = i10;
    }

    public void suf(int i10) {
        this.syw = i10;
    }

    public void syt(String str) {
        this.gm = str;
    }

    public void ubx(int i10) {
        this.bss = i10;
    }

    public void uml(String str) {
        this.oyl = str;
    }

    public void vvw(int i10) {
        this.wee = i10;
    }

    public void wcx(int i10) {
        this.uaj = i10;
    }

    public void wki(int i10) {
        this.tvh = i10;
    }

    public void bob(double d10) {
        this.vvw = d10;
    }

    public void csi(String str) {
        this.mxq = str;
    }

    public void dgq(int i10) {
        this.yyl = i10;
    }

    public void fou(String str) {
        this.nze = str;
    }

    public void mxq(boolean z9) {
        this.evn = z9;
    }

    public void nn(boolean z9) {
        this.ea = z9;
    }

    public void nze(boolean z9) {
        this.vd = z9;
    }

    public void oq(boolean z9) {
        this.csi = z9;
    }

    public void rhi(String str) {
        this.sns = str;
    }

    public void rjo(int i10) {
        this.ebt = i10;
    }

    public void sns(boolean z9) {
        this.clh = z9;
    }

    public void suf(boolean z9) {
        this.oz = z9;
    }

    public void syt(int i10) {
        this.ibd = i10;
    }

    public void ubx(boolean z9) {
        this.ui = z9;
    }

    public void vvw(boolean z9) {
        this.wqw = z9;
    }

    public void wcx(boolean z9) {
        this.ul = z9;
    }

    public void wki(boolean z9) {
        this.fsp = z9;
    }

    public void bob(String str) {
        this.suf = str;
    }

    public void csi(double d10) {
        this.ha = d10;
    }

    public void dgq(boolean z9) {
        this.xp = z9;
    }

    public void fou(double d10) {
        this.rs = d10;
    }

    public void oq(double d10) {
        this.ubx = d10;
    }

    public void rhi(double d10) {
        this.wbn = d10;
    }

    public void rjo(boolean z9) {
        this.jq = z9;
    }

    public void syt(boolean z9) {
        this.pms = z9;
    }

    public void bob(boolean z9) {
        this.ou = z9;
    }

    public void csi(boolean z9) {
        this.ls = z9;
    }

    public void fou(boolean z9) {
        this.nz = z9;
    }

    public void oq(String str) {
        this.wki = str;
    }

    public void rhi(boolean z9) {
        this.pfu = z9;
    }

    public void bob(JSONObject jSONObject) {
        this.et = jSONObject;
    }

    public void csi(JSONObject jSONObject) {
        this.zp = jSONObject;
    }

    public void fou(JSONObject jSONObject) {
        this.jwr = jSONObject;
    }

    public void oq(JSONObject jSONObject) {
        this.ysx = jSONObject;
    }

    public boolean kq() {
        return this.noa;
    }

    public void kq(boolean z9) {
        this.noa = z9;
    }

    public void kq(int i10) {
        this.kfr = i10;
    }

    public void kq(double d10) {
        this.ldy = d10;
    }

    public void kq(String str) {
        this.ze = str;
    }

    public void kq(float f10) {
        this.kq = f10;
    }

    public void kq(List<kq> list) {
        this.mz = list;
    }

    public void kq(long j10) {
        this.qvq = j10;
    }

    private void kq(rhi rhiVar, JSONObject jSONObject) {
        if (rhiVar == null || jSONObject == null) {
            return;
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            next.getClass();
            switch (next) {
                case "isShowBgControl":
                    rhiVar.bob(jSONObject.optBoolean(next, false));
                    break;
                case "clickArea":
                    rhiVar.nze(jSONObject.optString(next));
                    break;
                case "triggerSlideDirection":
                    rhiVar.ebt(jSONObject.optString(next));
                    break;
                case "bgImgUrl":
                    rhiVar.rjo(jSONObject.optString(next));
                    break;
                case "lineCount":
                    rhiVar.dgq(jSONObject.optInt(next));
                    break;
                case "openPlayableLandingPage":
                    rhiVar.wcx(jSONObject.optBoolean(next));
                    break;
                case "lineLimit":
                    rhiVar.rhi(jSONObject.optBoolean(next));
                    break;
                case "interactBgColor":
                    rhiVar.wki(jSONObject.optString(next));
                    break;
                case "paddingLeft":
                    rhiVar.rhi((float) jSONObject.optDouble(next));
                    break;
                case "adType":
                    rhiVar.oq(jSONObject.optString(next));
                    break;
                case "bottom":
                    rhiVar.uml(jSONObject.optInt(next));
                    break;
                case "fontFamily":
                    rhiVar.bob(jSONObject.optString(next));
                    break;
                case "height":
                    rhiVar.bob((float) jSONObject.optDouble(next));
                    break;
                case "textAlign":
                    rhiVar.fou(jSONObject.optString(next));
                    break;
                case "alignItems":
                    rhiVar.mq(jSONObject.optString(next));
                    break;
                case "interactValidate":
                    rhiVar.oq(jSONObject.optBoolean(next));
                    break;
                case "marginTop":
                    rhiVar.nn(jSONObject.optInt(next));
                    break;
                case "useBottom":
                    rhiVar.nn(jSONObject.optBoolean(next));
                    break;
                case "triggerSlideMinDistance":
                    rhiVar.kq(jSONObject.optLong(next));
                    break;
                case "direction":
                    rhiVar.jhe(jSONObject.optString(next));
                    break;
                case "tagMaxCount":
                    rhiVar.sns(jSONObject.optInt(next));
                    break;
                case "interactHiddenTime":
                    rhiVar.ou(jSONObject.optInt(next));
                    break;
                case "useTop":
                    rhiVar.dgq(jSONObject.optBoolean(next));
                    break;
                case "fontWeight":
                    rhiVar.nze(jSONObject.optInt(next));
                    break;
                case "zIndex":
                    rhiVar.nb(jSONObject.optInt(next));
                    break;
                case "timingStart":
                    rhiVar.oq(jSONObject.optDouble(next));
                    break;
                case "lineHeight":
                    rhiVar.rhi(jSONObject.optDouble(next));
                    break;
                case "textFlowDuration":
                    rhiVar.gm(jSONObject.optInt(next));
                    break;
                case "useRight":
                    rhiVar.syt(jSONObject.optBoolean(next));
                    break;
                case "marginBottom":
                    rhiVar.ubx(jSONObject.optInt(next));
                    break;
                case "bgColor":
                    rhiVar.rhi(jSONObject.optString(next));
                    break;
                case "useLeft":
                    rhiVar.rjo(jSONObject.optBoolean(next));
                    break;
                case "widthMode":
                    rhiVar.ubx(jSONObject.optString(next));
                    break;
                case "top":
                    rhiVar.jhe(jSONObject.optInt(next));
                    break;
                case "data":
                    rhiVar.fax(jSONObject.optString(next));
                    break;
                case "left":
                    rhiVar.fax(jSONObject.optInt(next));
                    break;
                case "loop":
                    rhiVar.kq(jSONObject.optBoolean(next));
                    break;
                case "paddingTop":
                    rhiVar.syt((float) jSONObject.optDouble(next));
                    break;
                case "align":
                    rhiVar.gm(jSONObject.optString(next));
                    break;
                case "color":
                    rhiVar.csi(jSONObject.optString(next));
                    break;
                case "right":
                    rhiVar.mq(jSONObject.optInt(next));
                    break;
                case "width":
                    rhiVar.fou((float) jSONObject.optDouble(next));
                    break;
                case "timingEnd":
                    rhiVar.bob(jSONObject.optDouble(next));
                    break;
                case "paddingBottom":
                    rhiVar.csi((float) jSONObject.optDouble(next));
                    break;
                case "allowTextFlow":
                    rhiVar.ubx(jSONObject.optBoolean(next));
                    break;
                case "interactWontHide":
                    rhiVar.suf(jSONObject.optBoolean(next));
                    break;
                case "fontSize":
                    rhiVar.dgq((float) jSONObject.optDouble(next));
                    break;
                case "justifyVertical":
                    rhiVar.wcx(jSONObject.optString(next));
                    break;
                case "interactVisibleTime":
                    rhiVar.ha(jSONObject.optInt(next));
                    break;
                case "paddingRight":
                    rhiVar.rjo((float) jSONObject.optDouble(next));
                    break;
                case "borderColor":
                    rhiVar.syt(jSONObject.optString(next));
                    break;
                case "borderStyle":
                    rhiVar.dgq(jSONObject.optString(next));
                    break;
                case "position":
                    rhiVar.mxq(jSONObject.optInt(next));
                    break;
                case "isDataFixed":
                    rhiVar.csi(jSONObject.optBoolean(next));
                    break;
                case "marginRight":
                    rhiVar.wki(jSONObject.optInt(next));
                    break;
                case "justifyHorizontal":
                    rhiVar.sns(jSONObject.optString(next));
                    break;
                case "interactPosition":
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
                    if (jSONObjectOptJSONObject == null) {
                        break;
                    } else {
                        rhiVar.rjo(jSONObjectOptJSONObject.optInt("translateY", 0));
                        rhiVar.syt(jSONObjectOptJSONObject.optInt("translateX", 0));
                        rhiVar.fou(jSONObjectOptJSONObject.optDouble("scaleX", 0.0d));
                        rhiVar.csi(jSONObjectOptJSONObject.optDouble("scaleY", 0.0d));
                        break;
                    }
                    break;
                case "lineFeed":
                    rhiVar.fou(jSONObject.optBoolean(next));
                    break;
                case "interactText":
                    rhiVar.vvw(jSONObject.optString(next));
                    break;
                case "interactType":
                    rhiVar.suf(jSONObject.optString(next));
                    break;
                case "borderRadius":
                    rhiVar.kq((float) jSONObject.optDouble(next));
                    break;
                case "clickTigger":
                    rhiVar.mxq(jSONObject.optString(next));
                    break;
                case "heightMode":
                    rhiVar.nn(jSONObject.optString(next));
                    break;
                case "textFlowType":
                    rhiVar.wcx(jSONObject.optInt(next));
                    break;
                case "borderSize":
                    rhiVar.oq((float) jSONObject.optDouble(next));
                    break;
                case "marginLeft":
                    rhiVar.vvw(jSONObject.optInt(next));
                    break;
                case "letterSpacing":
                    rhiVar.suf(jSONObject.optInt(next));
                    break;
            }
        }
    }
}
