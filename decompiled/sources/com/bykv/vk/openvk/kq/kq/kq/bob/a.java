package com.bykv.vk.openvk.kq.kq.kq.bob;

import android.os.Build;
import android.text.TextUtils;
import com.unity3d.services.UnityAdsConstants;
import java.io.Serializable;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements Serializable {
    public int bob;
    private boolean dgq;
    private boolean fax;
    private boolean gm;
    private int ibd;
    private int jhe;
    private int mq;
    private int mxq;
    private boolean nn;
    private int nze;
    public String oq;
    private c rhi;
    private c rjo;
    private String sns;
    private String suf;
    private String syt;
    private long wcx;
    private int ubx = 204800;
    private int vvw = 0;
    private int wki = 0;
    protected float kq = -1.0f;
    public final HashMap<String, Object> fou = new HashMap<>();
    private int uml = UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS;
    private int nb = UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS;
    private int ou = UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS;
    private int ebt = 0;
    public int csi = 1;
    private JSONObject rs = new JSONObject();

    public a(String str, c cVar, c cVar2, int i10, int i11) {
        this.mq = 0;
        this.jhe = 0;
        this.syt = str;
        this.rhi = cVar;
        this.rjo = cVar2;
        this.mq = i10;
        this.jhe = i11;
    }

    public JSONObject bob() {
        return this.rs;
    }

    public String csi() {
        return this.syt;
    }

    public int dgq() {
        return this.mxq;
    }

    public boolean ebt() {
        return this.nn;
    }

    public int fax() {
        return this.nb;
    }

    public int fou() {
        return this.rs.optInt("pitaya_cache_size", 0);
    }

    public int gm() {
        return this.uml;
    }

    public int jhe() {
        return this.ebt;
    }

    public void kq(int i10) {
        this.ibd = i10;
    }

    public int mq() {
        return this.ou;
    }

    public String mxq() {
        if (suf()) {
            return this.rjo.K();
        }
        c cVar = this.rhi;
        if (cVar != null) {
            return cVar.K();
        }
        return null;
    }

    public c nb() {
        return this.rjo;
    }

    public long nn() {
        return this.wcx;
    }

    public float nze() {
        float f10 = this.kq;
        if (f10 != -1.0f) {
            return f10;
        }
        if (suf()) {
            return this.rjo.I();
        }
        c cVar = this.rhi;
        if (cVar != null) {
            return cVar.I();
        }
        return -1.0f;
    }

    public boolean oq() {
        return this.ibd == 2;
    }

    public boolean ou() {
        return this.dgq;
    }

    public int rhi() {
        if (suf()) {
            return this.rjo.x();
        }
        c cVar = this.rhi;
        if (cVar != null) {
            return cVar.x();
        }
        return 0;
    }

    public boolean rjo() {
        return this.fax;
    }

    public String sns() {
        if (suf()) {
            return this.rjo.H();
        }
        c cVar = this.rhi;
        if (cVar != null) {
            return cVar.H();
        }
        return null;
    }

    public boolean suf() {
        c cVar;
        if (this.jhe != 1 || (cVar = this.rjo) == null || TextUtils.isEmpty(cVar.K())) {
            return false;
        }
        if (A1.a.j() == 2) {
            return Build.VERSION.SDK_INT >= 26;
        }
        return this.mq == 1;
    }

    public int syt() {
        return this.nze;
    }

    public boolean ubx() {
        return this.gm;
    }

    public c uml() {
        return this.rhi;
    }

    public long vvw() {
        if (suf()) {
            return this.rjo.d();
        }
        c cVar = this.rhi;
        if (cVar != null) {
            return cVar.d();
        }
        return 0L;
    }

    public int wcx() {
        return this.mq;
    }

    public boolean wki() {
        if (suf()) {
            return this.rjo.t();
        }
        c cVar = this.rhi;
        if (cVar != null) {
            return cVar.t();
        }
        return true;
    }

    public void bob(int i10) {
        this.mxq = i10;
    }

    public synchronized Object csi(String str) {
        return this.fou.get(str);
    }

    public void fou(String str) {
        this.oq = str;
    }

    public boolean kq() {
        int i10 = this.ibd;
        return i10 == 1 || i10 == 2;
    }

    public void oq(String str) {
        this.suf = str;
    }

    public void rjo(int i10) {
        this.ou = i10;
    }

    public void syt(int i10) {
        this.ebt = i10;
    }

    public void bob(String str) {
        this.sns = str;
    }

    public void csi(int i10) {
        this.uml = i10;
    }

    public void fou(int i10) {
        this.bob = i10;
    }

    public void kq(String str) {
        this.syt = str;
    }

    public void oq(int i10) {
        this.nze = i10;
    }

    public void bob(boolean z9) {
        this.nn = z9;
    }

    public void kq(long j10) {
        this.wcx = j10;
    }

    public void oq(boolean z9) {
        this.dgq = z9;
    }

    public void kq(boolean z9) {
        this.gm = z9;
    }

    public void rhi(int i10) {
        this.nb = i10;
    }

    public synchronized void kq(String str, Object obj) {
        this.fou.put(str, obj);
    }
}
