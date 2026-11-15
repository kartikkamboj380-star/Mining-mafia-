package com.bytedance.sdk.openadsdk.core.settings;

import W4.a;
import W4.c;
import android.text.TextUtils;
import androidx.annotation.Keep;
import com.bytedance.sdk.openadsdk.core.sns;
import com.bytedance.sdk.openadsdk.utils.wol;
import p176r5.InterfaceC7090g;

/* JADX INFO: loaded from: classes.dex */
public class fou {
    private static String bob = null;
    private static volatile int fou = 0;
    private static volatile String kq = "";
    private static volatile String oq = "";

    public static String bob() {
        if (fou != 0) {
            return oq;
        }
        kq();
        return oq;
    }

    public static String fou() {
        if (TextUtils.isEmpty(bob)) {
            bob = sns.kq().getPackageManager().getInstallerPackageName(wol.rhi());
        }
        if (bob == null) {
            bob = "";
        }
        return bob;
    }

    public static String oq() {
        if (fou != 0) {
            return kq;
        }
        kq();
        return kq;
    }

    public static void kq() {
        try {
            a.a(sns.kq()).b().g(new InterfaceC7090g() { // from class: com.bytedance.sdk.openadsdk.core.settings.AppSetIdAndScope$1
                @Override // p176r5.InterfaceC7090g
                @Keep
                public void onSuccess(c cVar) {
                    String unused = fou.kq = Integer.toString(cVar.b());
                    String unused2 = fou.oq = cVar.a();
                    int unused3 = fou.fou = 1;
                }
            });
        } catch (Throwable unused) {
            fou = 2;
        }
    }
}
