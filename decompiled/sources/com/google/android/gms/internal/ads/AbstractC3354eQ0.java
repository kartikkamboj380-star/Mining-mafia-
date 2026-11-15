package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.eQ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3354eQ0 {
    public static List a(int i10) {
        return i10 == 0 ? Collections.EMPTY_LIST : new ArrayList(i10);
    }

    static HashSet b(int i10) {
        return new HashSet(d(i10));
    }

    public static LinkedHashMap c(int i10) {
        return new LinkedHashMap(d(i10));
    }

    private static int d(int i10) {
        if (i10 < 3) {
            return i10 + 1;
        }
        return i10 < 1073741824 ? (int) ((i10 / 0.75f) + 1.0f) : Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }
}
