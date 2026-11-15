package com.bytedance.sdk.component.rhi.kq.oq.oq;

import android.content.ContentResolver;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.rhi.kq.kq.kq.rhi;
import com.bytedance.sdk.component.rhi.kq.kq.kq.rjo;
import com.bytedance.sdk.component.rhi.kq.syt;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class kq {
    private static ContentResolver bob() {
        try {
            if (syt.rjo().rhi() != null) {
                return syt.rjo().rhi().getContentResolver();
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static String fou() {
        return rjo.oq + "/ad_log_event/";
    }

    public static void kq() {
        if (syt.rjo().rhi() == null) {
            return;
        }
        try {
            ContentResolver contentResolverBob = bob();
            if (contentResolverBob != null) {
                contentResolverBob.getType(Uri.parse(fou() + "adLogStart"));
            }
        } catch (Throwable unused) {
        }
    }

    public static void oq() {
        if (syt.rjo().rhi() == null) {
            return;
        }
        try {
            ContentResolver contentResolverBob = bob();
            if (contentResolverBob != null) {
                contentResolverBob.getType(Uri.parse(fou() + "adLogStop"));
            }
        } catch (Throwable unused) {
        }
    }

    public static void kq(com.bytedance.sdk.component.rhi.kq.fou.kq kqVar) {
        if (kqVar == null) {
            return;
        }
        try {
            ContentResolver contentResolverBob = bob();
            if (contentResolverBob != null) {
                contentResolverBob.getType(Uri.parse(fou() + "adLogDispatch?event=" + rhi.kq(kqVar.rhi())));
            }
        } catch (Throwable th) {
            th.toString();
        }
    }

    public static void kq(String str, List<String> list, boolean z9) {
        if (TextUtils.isEmpty(str) || list == null || list.isEmpty()) {
            return;
        }
        try {
            StringBuilder sb = new StringBuilder();
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                sb.append(rhi.kq(it.next()));
                sb.append(",");
            }
            String str2 = "?did=" + String.valueOf(str) + "&track=" + String.valueOf(rhi.kq(sb.toString())) + "&replace=" + String.valueOf(z9);
            ContentResolver contentResolverBob = bob();
            if (contentResolverBob != null) {
                contentResolverBob.getType(Uri.parse(fou() + "trackAdUrl" + str2));
            }
        } catch (Throwable unused) {
        }
    }

    public static void kq(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            ContentResolver contentResolverBob = bob();
            if (contentResolverBob != null) {
                contentResolverBob.getType(Uri.parse(fou() + "trackAdFailed?did=" + String.valueOf(str)));
            }
        } catch (Throwable unused) {
        }
    }
}
