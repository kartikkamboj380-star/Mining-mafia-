package com.bytedance.sdk.component.adexpress.kq.oq;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class syt {
    private static com.bytedance.sdk.component.adexpress.kq.bob.kq kq;

    public static void bob() {
        bob.kq(csi.syt(), oq(), "temp_pkg_info.json");
    }

    public static void fou() {
        bob.oq(csi.syt(), oq(), "temp_pkg_info.json");
        kq = null;
    }

    public static void kq() {
        FileInputStream fileInputStream = null;
        try {
            try {
                File file = new File(csi.syt(), "temp_pkg_info.json");
                long length = file.length();
                Long lValueOf = Long.valueOf(length);
                if (length > 0 && file.exists() && file.isFile()) {
                    byte[] bArr = new byte[lValueOf.intValue()];
                    FileInputStream fileInputStream2 = new FileInputStream(file);
                    try {
                        fileInputStream2.read(bArr);
                        com.bytedance.sdk.component.adexpress.kq.bob.kq kqVarKq = com.bytedance.sdk.component.adexpress.kq.bob.kq.kq(new JSONObject(new String(bArr, "utf-8")));
                        if (kqVarKq != null) {
                            kq = kqVarKq;
                            kq.bob();
                        }
                        fileInputStream = fileInputStream2;
                    } catch (Throwable unused) {
                        fileInputStream = fileInputStream2;
                        if (fileInputStream != null) {
                            fileInputStream.close();
                            return;
                        }
                        return;
                    }
                }
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (Throwable unused2) {
            }
        } catch (IOException unused3) {
        }
    }

    public static synchronized com.bytedance.sdk.component.adexpress.kq.bob.kq oq() {
        return kq;
    }

    public static boolean oq(com.bytedance.sdk.component.adexpress.kq.bob.kq kqVar) {
        return bob.bob(oq(), kqVar);
    }

    public static synchronized void kq(com.bytedance.sdk.component.adexpress.kq.bob.kq kqVar) {
        if (kqVar != null) {
            if (kqVar.syt()) {
                kq = kqVar;
            }
        }
    }

    public static boolean kq(String str) {
        return bob.kq(oq(), str);
    }
}
