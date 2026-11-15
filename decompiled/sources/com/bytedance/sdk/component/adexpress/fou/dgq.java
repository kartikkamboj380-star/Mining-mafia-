package com.bytedance.sdk.component.adexpress.fou;

import android.net.Uri;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public class dgq {

    public enum kq {
        HTML("text/html"),
        CSS("text/css"),
        JS("application/x-javascript"),
        IMAGE("image/*");

        private String csi;

        kq(String str) {
            this.csi = str;
        }

        public String kq() {
            return this.csi;
        }
    }

    public static kq kq(String str) {
        kq kqVar = kq.IMAGE;
        if (!TextUtils.isEmpty(str)) {
            try {
                String path = Uri.parse(str).getPath();
                if (path != null) {
                    if (path.endsWith(".css")) {
                        return kq.CSS;
                    }
                    if (path.endsWith(".js")) {
                        return kq.JS;
                    }
                    if (!path.endsWith(".jpg") && !path.endsWith(".gif") && !path.endsWith(".png") && !path.endsWith(".jpeg") && !path.endsWith(".webp") && !path.endsWith(".bmp") && !path.endsWith(".ico") && path.endsWith(".html")) {
                        return kq.HTML;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return kqVar;
    }

    public static boolean oq(String str) {
        Uri uri;
        if (TextUtils.isEmpty(str) || (uri = Uri.parse(str)) == null) {
            return false;
        }
        String path = uri.getPath();
        if (TextUtils.isEmpty(path)) {
            return false;
        }
        return path.endsWith(".gif");
    }
}
