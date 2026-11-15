package com.bykv.vk.openvk.preload.geckox.e;

import com.bykv.vk.openvk.preload.geckox.e.a.c;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.utils.g;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f13545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f13546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile File f13547c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile Long f13548d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile com.bykv.vk.openvk.preload.geckox.e.a.a f13549e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private AtomicBoolean f13550f = new AtomicBoolean(false);

    a(String str, String str2) {
        this.f13545a = str;
        this.f13546b = str2;
    }

    private synchronized com.bykv.vk.openvk.preload.geckox.e.a.a d(String str) {
        if (this.f13549e != null) {
            return this.f13549e;
        }
        File fileE = e(str);
        if (fileE == null) {
            throw new FileNotFoundException("channel no exist，channel:".concat(String.valueOf(str)));
        }
        File file = new File(fileE, "res.macv");
        File file2 = new File(fileE, "res");
        if (file2.exists() && file2.isDirectory()) {
            this.f13549e = new c(fileE);
        } else {
            if (!file.exists() || !file.isFile()) {
                throw new RuntimeException("can not find res, dir:" + fileE.getAbsolutePath());
            }
            this.f13549e = new com.bykv.vk.openvk.preload.geckox.e.a.b(fileE);
        }
        return this.f13549e;
    }

    private synchronized File e(String str) {
        if (this.f13547c != null) {
            return this.f13547c;
        }
        if (this.f13548d != null && this.f13548d.longValue() == -1) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f13545a);
        String str2 = File.separator;
        sb.append(str2);
        sb.append(str);
        sb.append(str2);
        sb.append("select.lock");
        com.bykv.vk.openvk.preload.geckox.f.b bVarA = com.bykv.vk.openvk.preload.geckox.f.b.a(sb.toString());
        try {
            if (this.f13548d == null) {
                this.f13548d = g.a(new File(this.f13545a, str));
            }
            if (this.f13548d == null) {
                this.f13548d = -1L;
                bVarA.a();
                return null;
            }
            File file = new File(this.f13545a, str2 + str + str2 + this.f13548d + str2 + "using.lock");
            this.f13547c = file.getParentFile();
            com.bykv.vk.openvk.preload.geckox.f.c.a(file.getAbsolutePath());
            File file2 = this.f13547c;
            bVarA.a();
            return file2;
        } catch (Throwable th) {
            bVarA.a();
            throw th;
        }
    }

    final InputStream a(String str) {
        return d(this.f13546b).a(a(this.f13546b, str));
    }

    final boolean b(String str) {
        return d(this.f13546b).b(a(this.f13546b, str));
    }

    public final int c(String str) {
        int length;
        try {
            File file = new File(e(str), "res");
            if (file.exists() && file.isDirectory() && (length = file.listFiles().length) > 0) {
                return length - 1;
            }
            return 0;
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    private static String a(String str, String str2) {
        return str2.substring(str.length() + 1);
    }

    final String b() {
        return this.f13546b;
    }

    final Long a() {
        return this.f13548d;
    }

    final void c() throws Exception {
        if (this.f13550f.getAndSet(true)) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f13545a);
        String str = File.separator;
        sb.append(str);
        sb.append(this.f13546b);
        sb.append(str);
        sb.append("select.lock");
        com.bykv.vk.openvk.preload.geckox.f.b bVarA = com.bykv.vk.openvk.preload.geckox.f.b.a(sb.toString());
        GeckoLogger.d("gecko-file-lock", "channel version loader clean");
        try {
            if (this.f13547c == null) {
                bVarA.a();
                return;
            }
            com.bykv.vk.openvk.preload.geckox.f.c.b(this.f13547c.getAbsolutePath() + str + "using.lock");
            bVarA.a();
            com.bykv.vk.openvk.preload.geckox.a.c.a(this.f13545a + str + this.f13546b);
        } catch (Throwable th) {
            bVarA.a();
            throw th;
        }
    }
}
