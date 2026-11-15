package com.bytedance.sdk.openadsdk.core.settings;

import com.bytedance.sdk.component.utils.fax;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public interface csi {
    public static final oq<JSONObject> kq = new oq<JSONObject>() { // from class: com.bytedance.sdk.openadsdk.core.settings.csi.1
        @Override // com.bytedance.sdk.openadsdk.core.settings.csi.oq
        /* JADX INFO: renamed from: kq, reason: merged with bridge method [inline-methods] */
        public JSONObject oq(String str) {
            try {
                return new JSONObject(str);
            } catch (Exception e10) {
                fax.kq("ISettingsDataRepository", "", e10);
                return null;
            }
        }
    };
    public static final oq<Set<String>> oq = new oq<Set<String>>() { // from class: com.bytedance.sdk.openadsdk.core.settings.csi.2
        @Override // com.bytedance.sdk.openadsdk.core.settings.csi.oq
        /* JADX INFO: renamed from: kq, reason: merged with bridge method [inline-methods] */
        public Set<String> oq(String str) {
            HashSet hashSet = new HashSet();
            try {
                JSONArray jSONArray = new JSONArray(str);
                int length = jSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    hashSet.add(jSONArray.getString(i10));
                }
                return hashSet;
            } catch (Exception e10) {
                fax.kq("ISettingsDataRepository", "", e10);
                return hashSet;
            }
        }
    };

    public interface kq {
        kq kq(String str);

        kq kq(String str, float f10);

        kq kq(String str, int i10);

        kq kq(String str, long j10);

        kq kq(String str, String str2);

        kq kq(String str, boolean z9);

        void kq();
    }

    public interface oq<T> {
        T oq(String str);
    }

    void kq(JSONObject jSONObject);
}
