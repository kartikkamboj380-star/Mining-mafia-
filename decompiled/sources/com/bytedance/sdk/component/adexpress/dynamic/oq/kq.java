package com.bytedance.sdk.component.adexpress.dynamic.oq;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.dynamic.fou.rjo;

/* JADX INFO: loaded from: classes.dex */
public class kq {
    public static int kq(rjo rjoVar) {
        if (rjoVar == null) {
            return 0;
        }
        String strYyl = rjoVar.yyl();
        String strNb = rjoVar.nb();
        if (TextUtils.isEmpty(strNb) || TextUtils.isEmpty(strYyl) || !strNb.equals("creative")) {
            return 0;
        }
        if (strYyl.equals("shake")) {
            return 2;
        }
        if (strYyl.equals("twist")) {
            return 3;
        }
        return strYyl.equals("slide") ? 1 : 0;
    }
}
