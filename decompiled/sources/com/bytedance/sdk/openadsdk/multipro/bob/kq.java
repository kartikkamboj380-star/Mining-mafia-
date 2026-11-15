package com.bytedance.sdk.openadsdk.multipro.bob;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.rhi.kq.rhi;
import com.bytedance.sdk.openadsdk.core.sns;
import com.bytedance.sdk.openadsdk.multipro.fou;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class kq implements com.bytedance.sdk.openadsdk.multipro.kq {
    public static String bob() {
        if (sns.kq() == null) {
            return null;
        }
        try {
            rhi rhiVarFou = fou();
            if (rhiVarFou != null) {
                return rhiVarFou.kq(Uri.parse(csi() + "maxRit"));
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    private static String csi() {
        return fou.oq + "/t_frequent/";
    }

    private static rhi fou() {
        try {
            if (sns.kq() != null) {
                return com.bytedance.sdk.openadsdk.multipro.kq.kq.kq(sns.kq());
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean oq() {
        if (sns.kq() == null) {
            return false;
        }
        try {
            rhi rhiVarFou = fou();
            if (rhiVarFou != null) {
                return "true".equals(rhiVarFou.kq(Uri.parse(csi() + "isSilent")));
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.kq
    public int kq(@NonNull Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.kq
    public int kq(@NonNull Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.kq
    public Cursor kq(@NonNull Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.kq
    public Uri kq(@NonNull Uri uri, ContentValues contentValues) {
        return null;
    }

    public static boolean kq(String str) {
        if (sns.kq() == null) {
            return false;
        }
        try {
            rhi rhiVarFou = fou();
            if (rhiVarFou != null) {
                return "true".equals(rhiVarFou.kq(Uri.parse(csi() + "checkFrequency?rit=" + str)));
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.kq
    @NonNull
    public String kq() {
        return "t_frequent";
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.kq
    public String kq(@NonNull Uri uri) {
        Objects.toString(uri);
        String str = uri.getPath().split("/")[2];
        if ("checkFrequency".equals(str)) {
            return com.bytedance.sdk.openadsdk.core.syt.kq.kq().kq(uri.getQueryParameter("rit")) ? "true" : "false";
        }
        if ("isSilent".equals(str)) {
            return com.bytedance.sdk.openadsdk.core.syt.kq.kq().oq() ? "true" : "false";
        }
        if ("maxRit".equals(str)) {
            return com.bytedance.sdk.openadsdk.core.syt.kq.kq().bob();
        }
        return null;
    }
}
