package com.bytedance.adsdk.kq;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public class mxq {
    public static Object kq(com.bytedance.adsdk.kq.oq.kq.kq kqVar) {
        dgq dgqVarKq;
        if (kqVar == null || (dgqVarKq = kq(kqVar.kq())) == null) {
            return null;
        }
        return dgqVarKq.kq(null, kqVar.oq());
    }

    public static dgq kq(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        str.getClass();
        switch (str) {
            case "toNumber":
                return new wki();
            case "toString":
                return new suf();
            case "formatDecimal":
                return new rjo();
            case "modArray":
                return new nn();
            case "find":
                return new rhi();
            case "size":
                return new ubx();
            case "chunk":
                return new kq();
            case "exist":
                return new csi();
            case "split":
                return new vvw();
            case "decodeUrl":
                return new oq();
            case "translate":
                return new nze();
            case "encodeUrl":
                return new fou();
            case "isDigit":
                return new syt();
            default:
                return null;
        }
    }
}
