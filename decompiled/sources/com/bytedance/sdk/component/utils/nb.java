package com.bytedance.sdk.component.utils;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class nb {
    private static oq kq;

    public static abstract class kq {
        abstract JSONObject kq();

        public final String oq() {
            try {
                return kq().toString();
            } catch (Exception unused) {
                return "";
            }
        }
    }

    public interface oq {
        void kq(String str, boolean z9, kq kqVar);
    }

    public static void kq(oq oqVar) {
        kq = oqVar;
    }

    public static void kq(String str, kq kqVar) {
        oq oqVar = kq;
        if (oqVar == null) {
            return;
        }
        oqVar.kq(str, false, kqVar);
    }
}
