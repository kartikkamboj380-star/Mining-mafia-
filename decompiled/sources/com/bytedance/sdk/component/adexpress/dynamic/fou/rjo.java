package com.bytedance.sdk.component.adexpress.dynamic.fou;

import android.graphics.Color;
import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.dynamic.csi.ubx;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.device.MimeTypes;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class rjo {
    public JSONObject bob;
    private csi csi;
    private rhi fou;
    public int kq;
    public String oq;
    private String rhi;

    public rjo(csi csiVar) {
        this.csi = csiVar;
        this.kq = csiVar.kq();
        this.oq = csiVar.bob();
        this.bob = csiVar.csi().wj();
        this.rhi = csiVar.fou();
        if (com.bytedance.sdk.component.adexpress.fou.bob() == 1) {
            this.fou = csiVar.rjo();
        } else {
            this.fou = csiVar.csi();
        }
        if (com.bytedance.sdk.component.adexpress.fou.oq()) {
            this.fou = csiVar.csi();
        }
    }

    private boolean mz() {
        if (com.bytedance.sdk.component.adexpress.fou.oq()) {
            return false;
        }
        return (!TextUtils.isEmpty(this.oq) && this.oq.contains("adx:")) || ubx.oq();
    }

    private boolean rrl() {
        return (com.bytedance.sdk.component.adexpress.fou.oq() && (this.csi.oq().contains("logo-union") || this.csi.oq().contains("logounion") || this.csi.oq().contains("logoad"))) || "logo-union".equals(this.csi.oq()) || "logounion".equals(this.csi.oq()) || "logoad".equals(this.csi.oq());
    }

    public boolean aq() {
        return this.fou.vd();
    }

    public int bob() {
        return (int) this.fou.nze();
    }

    public int bss() {
        return this.fou.rhg();
    }

    public float csi() {
        return this.fou.wcx();
    }

    public int dgq() {
        int iSyt = syt();
        if (iSyt == 4) {
            return 17;
        }
        return iSyt == 3 ? 8388613 : 8388611;
    }

    public boolean ea() {
        return this.fou.wki();
    }

    public long ebt() {
        return this.fou.xgx();
    }

    public boolean fax() {
        return this.fou.vt();
    }

    public int fgm() {
        return this.fou.bob();
    }

    public int fm() {
        return this.fou.aqe();
    }

    public int fou() {
        return (int) this.fou.mxq();
    }

    public int gm() {
        return this.fou.yo();
    }

    public double ha() {
        return this.fou.syt();
    }

    public double hlh() {
        return this.fou.nz();
    }

    public String hn() {
        return this.fou.pw();
    }

    public int ibd() {
        String strWol = this.fou.wol();
        if ("skip-with-time-skip-btn".equals(this.csi.oq()) || "skip".equals(this.csi.oq()) || TextUtils.equals("skip-with-countdowns-skip-btn", this.csi.oq())) {
            return 6;
        }
        if (!"skip-with-time-countdown".equals(this.csi.oq()) && !"skip-with-time".equals(this.csi.oq())) {
            if (this.kq == 10 && TextUtils.equals(this.fou.bss(), "click")) {
                return 5;
            }
            if (rrl() && mz()) {
                return 0;
            }
            if (rrl()) {
                return 7;
            }
            if ("feedback-dislike".equals(this.csi.oq())) {
                return 3;
            }
            if (!TextUtils.isEmpty(strWol) && !strWol.equals("none")) {
                if (strWol.equals(MimeTypes.BASE_TYPE_VIDEO) || (this.csi.kq() == 7 && TextUtils.equals(strWol, "normal"))) {
                    return (com.bytedance.sdk.component.adexpress.fou.oq() && this.csi.csi() != null && this.csi.csi().ju()) ? 11 : 4;
                }
                if (strWol.equals("normal")) {
                    return 1;
                }
                return (strWol.equals("creative") || "slide".equals(this.fou.bss())) ? 2 : 0;
            }
        }
        return 0;
    }

    public boolean jhe() {
        return this.fou.wbn();
    }

    public String jq() {
        return this.fou.ha();
    }

    public int kq() {
        return (int) this.fou.suf();
    }

    public int ktb() {
        return this.fou.csi();
    }

    public int ls() {
        return this.fou.ymy();
    }

    public String mq() {
        return this.fou.nb();
    }

    public int mxq() {
        return kq(this.fou.ebt());
    }

    public String nb() {
        return this.fou.wol();
    }

    public String nn() {
        int i10 = this.kq;
        return (i10 == 2 || i10 == 13) ? this.oq : "";
    }

    public int noa() {
        return this.fou.evn();
    }

    public String nz() {
        return this.fou.nn();
    }

    public float nze() {
        return this.fou.ubx();
    }

    public int oq() {
        return (int) this.fou.sns();
    }

    public String ou() {
        return this.fou.tk();
    }

    public int oxe() {
        return this.fou.vho();
    }

    public int pfu() {
        return this.fou.ldy();
    }

    public String pms() {
        return this.fou.jwr();
    }

    public int qdf() {
        return this.fou.rxz();
    }

    public boolean qip() {
        return this.fou.zfx();
    }

    public boolean rao() {
        return this.fou.et();
    }

    public int rhg() {
        return this.fou.clh();
    }

    public String rhi() {
        if (this.kq == 0) {
            return !TextUtils.isEmpty(this.oq) ? this.oq : this.bob.optString(com.bytedance.sdk.component.adexpress.fou.rjo.bob(com.bytedance.sdk.component.adexpress.fou.kq()));
        }
        return "";
    }

    public int rjo() {
        return kq(this.fou.jhe());
    }

    public int rs() {
        return kq(this.fou.uml());
    }

    public int rz() {
        return this.fou.job();
    }

    public float sns() {
        return this.fou.vvw();
    }

    public double suf() {
        return this.fou.gm();
    }

    public int syt() {
        String strMq = this.fou.mq();
        if ("left".equals(strMq)) {
            return 17;
        }
        if ("center".equals(strMq)) {
            return 4;
        }
        return "right".equals(strMq) ? 3 : 2;
    }

    public int syw() {
        return this.fou.rjo();
    }

    public String tvh() {
        return this.fou.yyl();
    }

    public double uaj() {
        return this.fou.xn();
    }

    public String ubx() {
        return this.kq == 1 ? this.oq : "";
    }

    public int ui() {
        return this.fou.wf();
    }

    public int uml() {
        return this.fou.syw();
    }

    public String vvw() {
        return this.rhi;
    }

    public boolean wbn() {
        return this.fou.ul();
    }

    public int wcx() {
        return this.fou.kfr();
    }

    public int wee() {
        return this.fou.fm();
    }

    public int wf() {
        return this.fou.fou();
    }

    public String wj() {
        return this.fou.vi();
    }

    public double wki() {
        if (this.kq == 11) {
            try {
                double d10 = Double.parseDouble(this.oq);
                return !com.bytedance.sdk.component.adexpress.fou.oq() ? (int) d10 : d10;
            } catch (NumberFormatException unused) {
            }
        }
        return -1.0d;
    }

    public boolean wol() {
        return this.fou.aq();
    }

    public String wxb() {
        return this.fou.ou();
    }

    public int xk() {
        return this.fou.ktb();
    }

    public int xn() {
        return this.fou.dgq();
    }

    public String xp() {
        return this.fou.fsp();
    }

    public boolean ye() {
        return this.fou.et();
    }

    public String ysx() {
        return this.fou.fgm();
    }

    public String yyl() {
        return this.fou.bss();
    }

    public int zfx() {
        return this.fou.oq();
    }

    public static float[] oq(String str) {
        String[] strArrSplit = str.substring(str.indexOf("(") + 1, str.indexOf(")")).split(",");
        return (strArrSplit == null || strArrSplit.length != 4) ? new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT} : new float[]{Float.parseFloat(strArrSplit[0]), Float.parseFloat(strArrSplit[1]), Float.parseFloat(strArrSplit[2]), Float.parseFloat(strArrSplit[3])};
    }

    public void kq(float f10) {
        this.fou.kq(f10);
    }

    public static int kq(String str) {
        String[] strArrSplit;
        if (TextUtils.isEmpty(str)) {
            return -16777216;
        }
        if (str.equals("transparent")) {
            return 0;
        }
        if (str.charAt(0) == '#' && str.length() == 7) {
            return Color.parseColor(str);
        }
        if (str.charAt(0) == '#' && str.length() == 9) {
            return Color.parseColor(str);
        }
        if (str.startsWith("rgba") && (strArrSplit = str.substring(str.indexOf("(") + 1, str.indexOf(")")).split(",")) != null) {
            try {
                if (strArrSplit.length == 4) {
                    return (((int) ((Float.parseFloat(strArrSplit[3]) * 255.0f) + 0.5f)) << 24) | (((int) Float.parseFloat(strArrSplit[0])) << 16) | (((int) Float.parseFloat(strArrSplit[1])) << 8) | ((int) Float.parseFloat(strArrSplit[2]));
                }
            } catch (NumberFormatException unused) {
                return 0;
            }
        }
        return -16777216;
    }

    public boolean kq(int i10) {
        csi csiVar = this.csi;
        if (csiVar == null) {
            return false;
        }
        if (i10 == 1) {
            this.fou = csiVar.rjo();
        } else {
            this.fou = csiVar.csi();
        }
        return this.fou != null;
    }
}
