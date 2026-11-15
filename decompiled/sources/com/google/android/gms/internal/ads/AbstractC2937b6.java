package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.b6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC2937b6 {
    public static C3062c6 a(C3062c6 c3062c6, String[] strArr, Map map) {
        int length;
        int i10 = 0;
        if (c3062c6 == null) {
            if (strArr == null) {
                return null;
            }
            int length2 = strArr.length;
            if (length2 == 1) {
                return (C3062c6) map.get(strArr[0]);
            }
            if (length2 > 1) {
                C3062c6 c3062c7 = new C3062c6();
                while (i10 < length2) {
                    c3062c7.F((C3062c6) map.get(strArr[i10]));
                    i10++;
                }
                return c3062c7;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                c3062c6.F((C3062c6) map.get(strArr[0]));
                return c3062c6;
            }
            if (strArr != null && (length = strArr.length) > 1) {
                while (i10 < length) {
                    c3062c6.F((C3062c6) map.get(strArr[i10]));
                    i10++;
                }
            }
        }
        return c3062c6;
    }
}
