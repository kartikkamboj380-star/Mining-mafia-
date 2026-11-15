package com.bytedance.sdk.openadsdk.core.settings;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import com.bytedance.sdk.component.utils.fax;
import com.bytedance.sdk.component.utils.mq;
import com.bytedance.sdk.openadsdk.core.sns;
import com.bytedance.sdk.openadsdk.utils.nz;
import com.bytedance.sdk.openadsdk.utils.wki;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class nn implements csi {
    private final kq nn;
    private final String rjo;
    private boolean ubx;
    private final ConcurrentHashMap<String, Object> bob = new ConcurrentHashMap<>();
    private final Object fou = new Object();
    private final Object csi = new Object();
    private final CountDownLatch rhi = new CountDownLatch(1);
    private Properties syt = new Properties();
    private volatile boolean dgq = false;

    public interface kq {
        void kq();

        void oq();
    }

    public nn(String str, kq kqVar) {
        this.rjo = str;
        this.nn = kqVar;
        nz.kq(new com.bytedance.sdk.component.syt.syt("SetL_".concat(String.valueOf(str))) { // from class: com.bytedance.sdk.openadsdk.core.settings.nn.1
            @Override // java.lang.Runnable
            public void run() {
                nn.this.kq(false);
            }
        });
    }

    private void csi() {
        if (this.ubx && sns.kq() != null) {
            kq(true);
        }
        if (this.dgq) {
            return;
        }
        try {
            SystemClock.elapsedRealtime();
            this.rhi.await(nz.rhi() ? 4 : 8, TimeUnit.SECONDS);
        } catch (InterruptedException e10) {
            fax.kq("SdkSettings.Prop", "awaitLoadedLocked: ", e10);
        }
    }

    private File rhi() {
        Context contextKq = sns.kq();
        if (contextKq != null) {
            return new File(contextKq.getFilesDir(), this.rjo);
        }
        return null;
    }

    public void bob() {
        File fileRhi = rhi();
        if (fileRhi == null || !fileRhi.exists()) {
            return;
        }
        fileRhi.delete();
    }

    protected void fou() {
        kq kqVar = this.nn;
        if (kqVar != null) {
            kqVar.oq();
        }
    }

    public boolean oq() {
        return this.dgq;
    }

    public String kq(String str, String str2) {
        if (str == null || str.isEmpty()) {
            return str2;
        }
        csi();
        return this.syt.getProperty(str, str2);
    }

    public int kq(String str, int i10) {
        if (str != null && !str.isEmpty()) {
            csi();
            try {
                return Integer.parseInt(this.syt.getProperty(str, String.valueOf(i10)));
            } catch (NumberFormatException e10) {
                fax.kq("SdkSettings.Prop", "", e10);
            }
        }
        return i10;
    }

    public long kq(String str, long j10) {
        if (str != null && !str.isEmpty()) {
            csi();
            try {
                return Long.parseLong(this.syt.getProperty(str, String.valueOf(j10)));
            } catch (NumberFormatException e10) {
                fax.kq("SdkSettings.Prop", "", e10);
            }
        }
        return j10;
    }

    public float kq(String str, float f10) {
        if (str != null && !str.isEmpty()) {
            csi();
            try {
                return Float.parseFloat(this.syt.getProperty(str, String.valueOf(f10)));
            } catch (NumberFormatException e10) {
                fax.kq("SdkSettings.Prop", "", e10);
            }
        }
        return f10;
    }

    public class oq implements csi.kq {
        private final Map<String, Object> oq = new HashMap();
        private final Object bob = new Object();

        public oq() {
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.csi.kq
        public void kq() {
            Object obj;
            Properties properties = new Properties();
            synchronized (this.bob) {
                try {
                    properties.putAll(nn.this.syt);
                    boolean z9 = false;
                    for (Map.Entry<String, Object> entry : this.oq.entrySet()) {
                        String key = entry.getKey();
                        Object value = entry.getValue();
                        if (value == this || value == null) {
                            if (properties.containsKey(key)) {
                                properties.remove(key);
                                z9 = true;
                            }
                        } else if (!properties.containsKey(key) || (obj = properties.get(key)) == null || !obj.equals(value)) {
                            properties.put(key, String.valueOf(value));
                            z9 = true;
                        }
                    }
                    this.oq.clear();
                    if (z9) {
                        nn.this.kq(properties);
                        nn.this.syt = properties;
                        nn.this.bob.clear();
                        nn.this.ubx = false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.csi.kq
        public csi.kq kq(String str, String str2) {
            synchronized (this.bob) {
                this.oq.put(str, str2);
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.csi.kq
        public csi.kq kq(String str, int i10) {
            synchronized (this.bob) {
                this.oq.put(str, Integer.valueOf(i10));
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.csi.kq
        public csi.kq kq(String str, long j10) {
            synchronized (this.bob) {
                this.oq.put(str, Long.valueOf(j10));
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.csi.kq
        public csi.kq kq(String str) {
            synchronized (this.bob) {
                this.oq.put(str, this);
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.csi.kq
        public csi.kq kq(String str, float f10) {
            synchronized (this.bob) {
                this.oq.put(str, Float.valueOf(f10));
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.csi.kq
        public csi.kq kq(String str, boolean z9) {
            synchronized (this.bob) {
                this.oq.put(str, Boolean.valueOf(z9));
            }
            return this;
        }
    }

    public boolean kq(String str, boolean z9) {
        if (str != null && !str.isEmpty()) {
            csi();
            try {
                return Boolean.parseBoolean(this.syt.getProperty(str, String.valueOf(z9)));
            } catch (Exception e10) {
                fax.kq("SdkSettings.Prop", "", e10);
            }
        }
        return z9;
    }

    public void kq(boolean z9) {
        kq kqVar;
        Object obj;
        synchronized (this.fou) {
            try {
                if (!this.dgq || z9) {
                    if (sns.kq() != null) {
                        boolean z10 = false;
                        this.ubx = false;
                        File fileRhi = rhi();
                        if (fileRhi != null && fileRhi.exists()) {
                            Properties properties = new Properties();
                            FileInputStream fileInputStream = null;
                            try {
                                try {
                                    FileInputStream fileInputStream2 = new FileInputStream(fileRhi);
                                    try {
                                        properties.load(fileInputStream2);
                                        properties.size();
                                        new StringBuilder("items from ").append(fileRhi.getAbsolutePath());
                                        if (!properties.isEmpty()) {
                                            this.syt = properties;
                                            this.bob.clear();
                                        }
                                        wki.kq(fileInputStream2);
                                        obj = this.fou;
                                    } catch (OutOfMemoryError unused) {
                                        fileInputStream = fileInputStream2;
                                        try {
                                            com.bytedance.sdk.component.utils.rjo.bob(fileRhi);
                                        } catch (Throwable th) {
                                            fax.kq("SdkSettings.Prop", "delete: ", th);
                                        }
                                        if (fileInputStream != null) {
                                            wki.kq(fileInputStream);
                                        }
                                        obj = this.fou;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        fileInputStream = fileInputStream2;
                                        fax.kq("SdkSettings.Prop", "reload: ", th);
                                        if (fileInputStream != null) {
                                            wki.kq(fileInputStream);
                                        }
                                        obj = this.fou;
                                    }
                                } catch (Throwable th3) {
                                    if (fileInputStream != null) {
                                        wki.kq(fileInputStream);
                                    }
                                    this.fou.notifyAll();
                                    throw th3;
                                }
                            } catch (OutOfMemoryError unused2) {
                            } catch (Throwable th4) {
                                th = th4;
                            }
                            obj.notifyAll();
                        } else if (mq.kq(sns.kq()) && "tt_sdk_settings.prop".equals(this.rjo)) {
                            try {
                                SharedPreferences sharedPreferences = sns.kq().getSharedPreferences("tt_sdk_settings", 0);
                                if (!sharedPreferences.getAll().isEmpty()) {
                                    csi.kq kqVarKq = kq();
                                    for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
                                        String key = entry.getKey();
                                        Object value = entry.getValue();
                                        if (key != null && !key.isEmpty() && value != null) {
                                            kqVarKq.kq(key, value.toString());
                                            z10 = true;
                                        }
                                    }
                                    if (z10) {
                                        kqVarKq.kq();
                                    }
                                    sharedPreferences.edit().clear().commit();
                                }
                            } catch (Exception unused3) {
                            }
                        }
                    } else {
                        this.ubx = true;
                    }
                    boolean z11 = this.dgq;
                    this.rhi.countDown();
                    this.dgq = true;
                    if (!z11 && (kqVar = this.nn) != null) {
                        kqVar.kq();
                    }
                }
            } catch (Throwable th5) {
                throw th5;
            }
        }
    }

    public csi.kq kq() {
        return new oq();
    }

    public <T> T kq(String str, T t10, csi.oq<T> oqVar) {
        T tOq;
        if (str != null && !str.isEmpty()) {
            T t11 = (T) this.bob.get(str);
            if (t11 != null) {
                return t11;
            }
            csi();
            String property = this.syt.getProperty(str, null);
            if (property != null && oqVar != null && (tOq = oqVar.oq(property)) != null) {
                this.bob.put(str, tOq);
                return tOq;
            }
        }
        return t10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kq(Properties properties) {
        synchronized (this.csi) {
            FileOutputStream fileOutputStream = null;
            try {
                try {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(rhi());
                    try {
                        properties.store(fileOutputStream2, (String) null);
                        wki.kq(fileOutputStream2);
                    } catch (Exception e10) {
                        e = e10;
                        fileOutputStream = fileOutputStream2;
                        fax.kq("SdkSettings.Prop", "saveToLocal: ", e);
                        if (fileOutputStream != null) {
                            wki.kq(fileOutputStream);
                        }
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            wki.kq(fileOutputStream);
                        }
                        throw th;
                    }
                } catch (Exception e11) {
                    e = e11;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        ubx.oq();
    }
}
