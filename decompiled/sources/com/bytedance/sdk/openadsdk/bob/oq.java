package com.bytedance.sdk.openadsdk.bob;

import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.jhe;
import com.bytedance.sdk.openadsdk.core.sns;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class oq {
    private static volatile oq kq;
    private final jhe<com.bytedance.sdk.openadsdk.fou.kq> oq = sns.bob();

    private oq() {
    }

    public static oq kq() {
        if (kq == null) {
            synchronized (oq.class) {
                try {
                    if (kq == null) {
                        kq = new oq();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return kq;
    }

    public void kq(@NonNull String str, List<FilterWord> list, String str2) {
        kq(str, list, null, null, str2);
    }

    public void kq(@NonNull String str, List<FilterWord> list, JSONObject jSONObject, String str2, String str3) {
        this.oq.kq(str, list, jSONObject, str2, str3);
    }
}
