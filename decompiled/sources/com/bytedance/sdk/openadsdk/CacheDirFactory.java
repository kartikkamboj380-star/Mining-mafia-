package com.bytedance.sdk.openadsdk;

import D1.b;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.rjo;
import com.bytedance.sdk.openadsdk.core.sns;
import com.bytedance.sdk.openadsdk.multipro.oq;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class CacheDirFactory {
    public static volatile b MEDIA_CACHE_DIR = null;
    public static String ROOT_DIR = null;
    public static final int SPLASH_USE_INTERNAL_STORAGE = 1;
    private static String kq;

    public static int getCacheType() {
        return 1;
    }

    public static String getDiskCacheDirPath(String str) {
        return getRootDir() + File.separator + str;
    }

    public static b getICacheDir(int i10) {
        return kq();
    }

    public static String getImageCacheDir(String str) {
        if (kq == null) {
            kq = getDiskCacheDirPath(str);
        }
        return kq;
    }

    public static String getRootDir() {
        if (!TextUtils.isEmpty(ROOT_DIR)) {
            return ROOT_DIR;
        }
        File fileKq = rjo.kq(sns.kq(), oq.bob(), "tt_ad");
        if (fileKq.isFile()) {
            fileKq.delete();
        }
        if (!fileKq.exists()) {
            fileKq.mkdirs();
        }
        String absolutePath = fileKq.getAbsolutePath();
        ROOT_DIR = absolutePath;
        return absolutePath;
    }

    private static b kq() {
        if (MEDIA_CACHE_DIR == null) {
            synchronized (CacheDirFactory.class) {
                try {
                    if (MEDIA_CACHE_DIR == null) {
                        K1.b bVar = new K1.b();
                        MEDIA_CACHE_DIR = bVar;
                        bVar.kq(getRootDir());
                        MEDIA_CACHE_DIR.fou();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return MEDIA_CACHE_DIR;
    }
}
