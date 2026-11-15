package com.bytedance.sdk.openadsdk.sns;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.fax;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class kq implements Comparable<kq> {
    private int bob;
    private int csi;
    private final String oq;
    private int rjo;
    private long suf;
    private final ArrayList<Long> kq = new ArrayList<>();
    private final ArrayList<Long> fou = new ArrayList<>();
    private final ArrayList<Long> rhi = new ArrayList<>();
    private final ArrayList<Long> syt = new ArrayList<>();
    private final HashMap<String, oq> dgq = new HashMap<>();
    private int nn = 0;
    private int ubx = 0;
    private final HashMap<String, oq> vvw = new HashMap<>();
    private int wki = 0;
    private final ArrayList<String> nze = new ArrayList<>();

    public kq(String str) {
        this.oq = str;
    }

    private void oq(@NonNull JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        int i10;
        int i11;
        int i12;
        int[] iArr;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        int[] iArrVvw = com.bytedance.sdk.openadsdk.rhi.kq.kq().vvw();
        if (iArrVvw != null) {
            int i13 = 0;
            while (i13 < iArrVvw.length) {
                int i14 = iArrVvw[i13];
                long j10 = 60000;
                long j11 = jElapsedRealtime - (((long) i14) * 60000);
                Iterator<String> it = this.vvw.keySet().iterator();
                long j12 = 0;
                while (it.hasNext()) {
                    long j13 = j10;
                    String next = it.next();
                    Iterator<String> it2 = it;
                    oq oqVar = this.vvw.get(next);
                    if (oqVar != null) {
                        long jKq = oqVar.kq(j11, jElapsedRealtime);
                        j12 += jKq;
                        if (jKq <= 0 && i13 == iArrVvw.length - 1) {
                            hashSet.add(next);
                        }
                    }
                    it = it2;
                    j10 = j13;
                }
                if (j12 != 0) {
                    jSONObject.put("lp_stay_t_".concat(String.valueOf(i14)), j12);
                    iArr = iArrVvw;
                    long jOptInt = ((long) jSONObject2.optInt("lp_stay_t_".concat(String.valueOf(i14)))) + j12;
                    if (jOptInt != 0) {
                        jSONObject2.put("lp_stay_t_".concat(String.valueOf(i14)), jOptInt);
                    }
                } else {
                    iArr = iArrVvw;
                }
                i13++;
                iArrVvw = iArr;
            }
        }
        int[] iArrWki = com.bytedance.sdk.openadsdk.rhi.kq.kq().wki();
        if (iArrWki != null) {
            int i15 = 0;
            while (i15 < iArrWki.length) {
                int i16 = iArrWki[i15];
                long j14 = jElapsedRealtime - (((long) i16) * 60000);
                long j15 = 0;
                int i17 = 0;
                for (String str : this.dgq.keySet()) {
                    HashSet hashSet3 = hashSet;
                    int i18 = i16;
                    oq oqVar2 = this.dgq.get(str);
                    if (oqVar2 != null) {
                        long jKq2 = oqVar2.kq(j14, jElapsedRealtime);
                        j15 += jKq2;
                        if (jKq2 > 20000) {
                            i17++;
                        }
                        if (jKq2 <= 0 && i15 == iArrWki.length - 1) {
                            hashSet2.add(str);
                        }
                    }
                    i16 = i18;
                    hashSet = hashSet3;
                }
                HashSet hashSet4 = hashSet;
                int i19 = i16;
                if (j15 != 0) {
                    jSONObject.put("v_stay_t_".concat(String.valueOf(i19)), j15);
                    long jOptInt2 = ((long) jSONObject2.optInt("v_stay_t_".concat(String.valueOf(i19)))) + j15;
                    if (jOptInt2 != 0) {
                        jSONObject2.put("v_stay_t_".concat(String.valueOf(i19)), jOptInt2);
                    }
                }
                if (i17 != 0) {
                    jSONObject.put("v_20s_play_c_".concat(String.valueOf(i19)), i17);
                    int iOptInt = jSONObject2.optInt("v_20s_play_c_".concat(String.valueOf(i19))) + i17;
                    if (iOptInt != 0) {
                        jSONObject2.put("v_20s_play_c_".concat(String.valueOf(i19)), iOptInt);
                    }
                }
                i15++;
                hashSet = hashSet4;
            }
        }
        HashSet hashSet5 = hashSet;
        if (!hashSet5.isEmpty()) {
            Iterator it3 = hashSet5.iterator();
            while (it3.hasNext()) {
                this.vvw.remove((String) it3.next());
            }
        }
        if (!hashSet2.isEmpty()) {
            Iterator it4 = hashSet2.iterator();
            while (it4.hasNext()) {
                this.dgq.remove((String) it4.next());
            }
        }
        if (com.bytedance.sdk.openadsdk.rhi.kq.kq().nze() && (i12 = this.nn) != 0) {
            jSONObject.put("v_stay_t_s", i12);
            int iOptInt2 = jSONObject2.optInt("v_stay_t_s") + this.nn;
            if (iOptInt2 != 0) {
                jSONObject2.put("v_stay_t_s", iOptInt2);
            }
        }
        if (com.bytedance.sdk.openadsdk.rhi.kq.kq().suf() && (i11 = this.wki) != 0) {
            jSONObject.put("lp_stay_t_s", i11);
            int iOptInt3 = jSONObject2.optInt("lp_stay_t_s") + this.wki;
            if (iOptInt3 != 0) {
                jSONObject2.put("lp_stay_t_s", iOptInt3);
            }
        }
        if (!com.bytedance.sdk.openadsdk.rhi.kq.kq().sns() || (i10 = this.ubx) == 0) {
            return;
        }
        jSONObject.put("v_30p_play_c_s", i10);
        int iOptInt4 = jSONObject2.optInt("v_30p_play_c_s") + this.ubx;
        if (iOptInt4 != 0) {
            jSONObject2.put("v_30p_play_c_s", iOptInt4);
        }
    }

    public void kq(@NonNull String str, String str2) {
        oq oqVar;
        oq oqVar2;
        oq oqVar3;
        oq oqVar4;
        oq oqVar5;
        oq oqVar6;
        str.getClass();
        switch (str) {
            case "landingContinue":
                if (!TextUtils.isEmpty(str2) && (oqVar = this.vvw.get(str2)) != null) {
                    oqVar.fou(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case "landingPause":
                if (!TextUtils.isEmpty(str2) && (oqVar2 = this.vvw.get(str2)) != null) {
                    oqVar2.bob(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case "landingStart":
                if (!TextUtils.isEmpty(str2) && this.vvw.get(str2) == null) {
                    oq oqVar7 = new oq();
                    this.vvw.put(str2, oqVar7);
                    oqVar7.kq(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case "feed_over":
            case "feed_break":
            case "videoForceBreak":
            case "play_error":
                if (!TextUtils.isEmpty(str2) && (oqVar3 = this.dgq.get(str2)) != null && oqVar3.kq() != oq.csi) {
                    oqVar3.oq(SystemClock.elapsedRealtime());
                    if (com.bytedance.sdk.openadsdk.rhi.kq.kq().nze()) {
                        this.nn = (int) (((long) this.nn) + oqVar3.kq(this.suf, SystemClock.elapsedRealtime()));
                    }
                    break;
                }
                break;
            case "feed_play":
                this.rhi.add(Long.valueOf(SystemClock.elapsedRealtime()));
                if (com.bytedance.sdk.openadsdk.rhi.kq.kq().syt()) {
                    this.rjo++;
                }
                if (!TextUtils.isEmpty(str2) && this.dgq.get(str2) == null) {
                    oq oqVar8 = new oq();
                    this.dgq.put(str2, oqVar8);
                    oqVar8.kq(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case "show":
                this.kq.add(Long.valueOf(SystemClock.elapsedRealtime()));
                if (com.bytedance.sdk.openadsdk.rhi.kq.kq().rhi()) {
                    this.bob++;
                    break;
                }
                break;
            case "click":
                if (!this.nze.contains(str2)) {
                    if (this.nze.size() > 50) {
                        this.nze.subList(0, 25).clear();
                    }
                    this.nze.add(str2);
                    this.fou.add(Long.valueOf(SystemClock.elapsedRealtime()));
                    if (com.bytedance.sdk.openadsdk.rhi.kq.kq().rjo()) {
                        this.csi++;
                    }
                    break;
                }
                break;
            case "feed_continue":
                if (!TextUtils.isEmpty(str2) && (oqVar4 = this.dgq.get(str2)) != null) {
                    oqVar4.fou(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case "feed_pause":
                if (!TextUtils.isEmpty(str2) && (oqVar5 = this.dgq.get(str2)) != null) {
                    oqVar5.bob(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case "landingFinish":
                if (!TextUtils.isEmpty(str2) && (oqVar6 = this.vvw.get(str2)) != null && oqVar6.kq() != oq.csi) {
                    oqVar6.oq(SystemClock.elapsedRealtime());
                    if (com.bytedance.sdk.openadsdk.rhi.kq.kq().suf()) {
                        this.wki = (int) (((long) this.wki) + oqVar6.kq(this.suf, SystemClock.elapsedRealtime()));
                    }
                    break;
                }
                break;
            case "videoPercent30":
                if (com.bytedance.sdk.openadsdk.rhi.kq.kq().sns()) {
                    this.ubx++;
                    break;
                }
                break;
            case "dislike":
                this.syt.add(Long.valueOf(SystemClock.elapsedRealtime()));
                break;
        }
    }

    public JSONObject kq(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            kq(jSONObject2, jSONObject);
            oq(jSONObject2, jSONObject);
            return jSONObject2;
        } catch (Throwable th) {
            fax.bob(th.getMessage(), new Object[0]);
            return jSONObject2;
        }
    }

    public String oq() {
        return this.oq;
    }

    private void kq(String str, JSONObject jSONObject, ArrayList<Long> arrayList, int[] iArr, long j10, JSONObject jSONObject2) throws JSONException {
        int size = arrayList.size() - 1;
        int i10 = 0;
        for (int i11 : iArr) {
            long j11 = j10 - (((long) i11) * 60000);
            while (size >= 0 && arrayList.get(size).longValue() >= j11) {
                i10++;
                size--;
            }
            if (i10 != 0) {
                jSONObject.put(str + i11, i10);
                int iOptInt = jSONObject2.optInt(str + i11) + i10;
                if (iOptInt != 0) {
                    jSONObject2.put(str + i11, iOptInt);
                }
            }
        }
        while (size >= 0) {
            arrayList.remove(0);
            size--;
        }
    }

    private void kq(@NonNull JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        int i10;
        int i11;
        int i12;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        kq("show_c_", jSONObject, this.kq, com.bytedance.sdk.openadsdk.rhi.kq.kq().dgq(), jElapsedRealtime, jSONObject2);
        kq("click_c_", jSONObject, this.fou, com.bytedance.sdk.openadsdk.rhi.kq.kq().nn(), jElapsedRealtime, jSONObject2);
        kq("v_play_c_", jSONObject, this.rhi, com.bytedance.sdk.openadsdk.rhi.kq.kq().ubx(), jElapsedRealtime, jSONObject2);
        kq("dislike_c_", jSONObject, this.syt, com.bytedance.sdk.openadsdk.rhi.kq.kq().mxq(), jElapsedRealtime, jSONObject2);
        if (com.bytedance.sdk.openadsdk.rhi.kq.kq().rhi() && (i12 = this.bob) != 0) {
            jSONObject.put("show_c_s", i12);
            int iOptInt = jSONObject2.optInt("show_c_s") + this.bob;
            if (iOptInt != 0) {
                jSONObject2.put("show_c_s", iOptInt);
            }
        }
        if (com.bytedance.sdk.openadsdk.rhi.kq.kq().rjo() && (i11 = this.csi) != 0) {
            jSONObject.put("click_c_s", i11);
            int iOptInt2 = jSONObject2.optInt("click_c_s") + this.csi;
            if (iOptInt2 != 0) {
                jSONObject2.put("click_c_s", iOptInt2);
            }
        }
        if (!com.bytedance.sdk.openadsdk.rhi.kq.kq().syt() || (i10 = this.rjo) == 0) {
            return;
        }
        jSONObject.put("v_play_c_s", i10);
        int iOptInt3 = jSONObject2.optInt("v_play_c_s") + this.rjo;
        if (iOptInt3 != 0) {
            jSONObject2.put("v_play_c_s", iOptInt3);
        }
    }

    public void kq() {
        this.suf = SystemClock.elapsedRealtime();
        this.ubx = 0;
        this.csi = 0;
        this.bob = 0;
        this.wki = 0;
        this.nn = 0;
        this.rjo = 0;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: kq, reason: merged with bridge method [inline-methods] */
    public int compareTo(kq kqVar) {
        return kqVar.bob - this.bob;
    }
}
