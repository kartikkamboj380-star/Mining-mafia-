package com.bytedance.sdk.component;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public class kq {
    protected static InterfaceC0248kq kq = null;
    private static boolean oq = false;
    private static ArrayMap<String, File> vvw;
    private static ArrayMap<File, kq> wki;
    private final Object bob;
    private Properties csi;
    private long dgq;
    private final Object fou;
    private final File nn;
    private volatile boolean rhi;
    private int rjo;
    private long syt;
    private final File ubx;

    /* JADX INFO: renamed from: com.bytedance.sdk.component.kq$kq, reason: collision with other inner class name */
    public interface InterfaceC0248kq {
        HandlerThread kq(String str, int i10);

        ExecutorService kq();
    }

    private static class oq {
        final CountDownLatch bob;
        boolean csi;
        volatile boolean fou;
        final long kq;
        final Properties oq;

        void kq(boolean z9, boolean z10) {
            this.csi = z9;
            this.fou = z10;
            this.bob.countDown();
        }

        private oq(long j10, Properties properties) {
            this.bob = new CountDownLatch(1);
            this.fou = false;
            this.csi = false;
            this.kq = j10;
            this.oq = properties;
        }
    }

    private kq(File file) {
        Object obj = new Object();
        this.bob = obj;
        this.fou = new Object();
        this.csi = new Properties();
        this.rhi = false;
        this.rjo = 0;
        this.nn = file;
        this.ubx = kq(file);
        synchronized (obj) {
            this.rhi = false;
        }
        InterfaceC0248kq interfaceC0248kq = kq;
        if (interfaceC0248kq == null || interfaceC0248kq.kq() == null) {
            new Thread("TTPropHelper") { // from class: com.bytedance.sdk.component.kq.1
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    kq.this.kq();
                }
            }.start();
        } else {
            kq.kq().execute(new Runnable() { // from class: com.bytedance.sdk.component.kq.2
                @Override // java.lang.Runnable
                public void run() {
                    kq.this.kq();
                }
            });
        }
    }

    static /* synthetic */ int csi(kq kqVar) {
        int i10 = kqVar.rjo;
        kqVar.rjo = i10 + 1;
        return i10;
    }

    static /* synthetic */ int dgq(kq kqVar) {
        int i10 = kqVar.rjo;
        kqVar.rjo = i10 - 1;
        return i10;
    }

    static /* synthetic */ long rhi(kq kqVar) {
        long j10 = kqVar.syt;
        kqVar.syt = 1 + j10;
        return j10;
    }

    private void fou() {
        while (!this.rhi) {
            try {
                this.bob.wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    public bob oq() {
        return new bob();
    }

    public class bob implements SharedPreferences.Editor {
        private final Object oq = new Object();
        private final Map<String, Object> bob = new HashMap();
        private boolean fou = false;

        public bob() {
        }

        private oq oq() {
            Properties properties;
            long j10;
            Object obj;
            boolean z9;
            synchronized (kq.this.bob) {
                try {
                    if (kq.this.rjo > 0) {
                        Properties properties2 = new Properties();
                        properties2.putAll(kq.this.csi);
                        kq.this.csi = properties2;
                    }
                    properties = kq.this.csi;
                    kq.csi(kq.this);
                    synchronized (this.oq) {
                        try {
                            boolean z10 = false;
                            if (this.fou) {
                                if (properties.isEmpty()) {
                                    z9 = false;
                                } else {
                                    properties.clear();
                                    z9 = true;
                                }
                                this.fou = false;
                                z10 = z9;
                            }
                            for (Map.Entry<String, Object> entry : this.bob.entrySet()) {
                                String key = entry.getKey();
                                Object value = entry.getValue();
                                if (value == this || value == null) {
                                    if (properties.containsKey(key)) {
                                        properties.remove(key);
                                        z10 = true;
                                    }
                                } else if (!properties.containsKey(key) || (obj = properties.get(key)) == null || !obj.equals(String.valueOf(value))) {
                                    properties.put(key, String.valueOf(value));
                                    z10 = true;
                                }
                            }
                            this.bob.clear();
                            if (z10) {
                                kq.rhi(kq.this);
                            }
                            j10 = kq.this.syt;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return new oq(j10, properties);
        }

        @Override // android.content.SharedPreferences.Editor
        public void apply() {
            kq.this.kq(oq(), false);
        }

        @Override // android.content.SharedPreferences.Editor
        public boolean commit() {
            long jCurrentTimeMillis = kq.oq ? System.currentTimeMillis() : 0L;
            oq oqVarOq = oq();
            kq.this.kq(oqVarOq, true);
            try {
                oqVarOq.bob.await();
                return oqVarOq.fou;
            } catch (InterruptedException unused) {
            } finally {
                if (kq.oq) {
                    Log.d("TTPropHelper", kq.this.nn.getName() + ":" + oqVarOq.kq + " committed after " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
                }
            }
        }

        public bob kq(String str, Set<String> set) {
            synchronized (this.oq) {
                this.bob.put(str, set == null ? null : new HashSet(set));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public /* synthetic */ SharedPreferences.Editor putStringSet(String str, Set set) {
            return kq(str, (Set<String>) set);
        }

        @Override // android.content.SharedPreferences.Editor
        /* JADX INFO: renamed from: kq, reason: merged with bridge method [inline-methods] */
        public bob putInt(String str, int i10) {
            synchronized (this.oq) {
                this.bob.put(str, Integer.valueOf(i10));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* JADX INFO: renamed from: kq, reason: merged with bridge method [inline-methods] */
        public bob putLong(String str, long j10) {
            synchronized (this.oq) {
                this.bob.put(str, Long.valueOf(j10));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* JADX INFO: renamed from: kq, reason: merged with bridge method [inline-methods] */
        public bob putFloat(String str, float f10) {
            synchronized (this.oq) {
                this.bob.put(str, Float.valueOf(f10));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* JADX INFO: renamed from: kq, reason: merged with bridge method [inline-methods] */
        public bob putString(String str, String str2) {
            synchronized (this.oq) {
                this.bob.put(str, str2);
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* JADX INFO: renamed from: kq, reason: merged with bridge method [inline-methods] */
        public bob putBoolean(String str, boolean z9) {
            synchronized (this.oq) {
                this.bob.put(str, Boolean.valueOf(z9));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* JADX INFO: renamed from: kq, reason: merged with bridge method [inline-methods] */
        public bob remove(String str) {
            synchronized (this.oq) {
                this.bob.put(str, this);
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* JADX INFO: renamed from: kq, reason: merged with bridge method [inline-methods] */
        public bob clear() {
            synchronized (this.oq) {
                this.fou = true;
            }
            return this;
        }
    }

    public static void kq(@NotNull InterfaceC0248kq interfaceC0248kq) {
        kq = interfaceC0248kq;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:118:0x0115 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x0126 A[Catch: all -> 0x012b, TryCatch #8 {all -> 0x012b, blocks: (B:39:0x0090, B:40:0x0092, B:78:0x0122, B:80:0x0126, B:84:0x012f, B:86:0x0138, B:88:0x0140, B:90:0x014c, B:98:0x0197, B:99:0x0198, B:59:0x00f0, B:77:0x0121, B:62:0x00f5, B:63:0x00fb, B:76:0x011a, B:97:0x0196, B:96:0x018d), top: B:121:0x0090, inners: #3, #10 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x012d  */
    /* JADX WARN: Code duplicated, block: B:86:0x0138 A[Catch: all -> 0x012b, TryCatch #8 {all -> 0x012b, blocks: (B:39:0x0090, B:40:0x0092, B:78:0x0122, B:80:0x0126, B:84:0x012f, B:86:0x0138, B:88:0x0140, B:90:0x014c, B:98:0x0197, B:99:0x0198, B:59:0x00f0, B:77:0x0121, B:62:0x00f5, B:63:0x00fb, B:76:0x011a, B:97:0x0196, B:96:0x018d), top: B:121:0x0090, inners: #3, #10 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x013e  */
    /* JADX WARN: Code duplicated, block: B:90:0x014c A[Catch: all -> 0x012b, TRY_LEAVE, TryCatch #8 {all -> 0x012b, blocks: (B:39:0x0090, B:40:0x0092, B:78:0x0122, B:80:0x0126, B:84:0x012f, B:86:0x0138, B:88:0x0140, B:90:0x014c, B:98:0x0197, B:99:0x0198, B:59:0x00f0, B:77:0x0121, B:62:0x00f5, B:63:0x00fb, B:76:0x011a, B:97:0x0196, B:96:0x018d), top: B:121:0x0090, inners: #3, #10 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:90:0x014c, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.io.FileOutputStream] */
    public void oq(oq oqVar, boolean z9) {
        long jCurrentTimeMillis;
        long jCurrentTimeMillis2;
        Throwable th;
        long jCurrentTimeMillis3;
        ?? r11;
        FileOutputStream fileOutputStream;
        String str;
        String message;
        long jCurrentTimeMillis4;
        long jCurrentTimeMillis5;
        boolean z10;
        long jCurrentTimeMillis6 = oq ? System.currentTimeMillis() : 0L;
        boolean zExists = this.nn.exists();
        if (oq) {
            jCurrentTimeMillis = System.currentTimeMillis();
            jCurrentTimeMillis2 = jCurrentTimeMillis;
        } else {
            jCurrentTimeMillis = 0;
            jCurrentTimeMillis2 = 0;
        }
        if (zExists) {
            if (this.dgq >= oqVar.kq) {
                z10 = false;
            } else if (z9) {
                z10 = true;
            } else {
                synchronized (this.bob) {
                    z10 = this.syt == oqVar.kq;
                }
            }
            if (!z10) {
                oqVar.kq(false, true);
                return;
            }
            boolean zExists2 = this.ubx.exists();
            if (oq) {
                jCurrentTimeMillis2 = System.currentTimeMillis();
            }
            if (!zExists2) {
                if (!this.nn.renameTo(this.ubx)) {
                    Log.e("TTPropHelper", "Couldn't rename file " + this.nn + " to backup file " + this.ubx);
                    oqVar.kq(false, false);
                    return;
                }
            } else {
                this.nn.delete();
            }
        }
        try {
            synchronized (this.fou) {
                Object obj = null;
                String str2 = null;
                FileOutputStream fileOutputStream2 = null;
                try {
                    try {
                        FileOutputStream fileOutputStream3 = new FileOutputStream(this.nn);
                        try {
                            try {
                                jCurrentTimeMillis3 = oq ? System.currentTimeMillis() : 0L;
                                try {
                                    oqVar.oq.store(fileOutputStream3, (String) null);
                                    if (oq) {
                                        Log.d("TTPropHelper", "save: " + oqVar.oq);
                                        Log.d("TTPropHelper", "saveToLocal: save to" + this.nn.getAbsolutePath() + "success");
                                        str2 = "success";
                                    }
                                    try {
                                        fileOutputStream3.close();
                                        obj = str2;
                                    } catch (Throwable th2) {
                                        str = "TTPropHelper";
                                        message = th2.getMessage();
                                        Log.w(str, message);
                                    }
                                } catch (Exception e10) {
                                    e = e10;
                                    fileOutputStream = fileOutputStream3;
                                    Log.e("TTPropHelper", "saveToLocal: ", e);
                                    oqVar.kq(false, false);
                                    obj = fileOutputStream;
                                    if (fileOutputStream != null) {
                                        try {
                                            fileOutputStream.close();
                                            obj = fileOutputStream;
                                        } catch (Throwable th3) {
                                            str = "TTPropHelper";
                                            message = th3.getMessage();
                                            Log.w(str, message);
                                        }
                                    }
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                r11 = fileOutputStream3;
                                if (r11 != 0) {
                                    try {
                                        r11.close();
                                        throw th;
                                    } catch (Throwable th5) {
                                        Log.w("TTPropHelper", th5.getMessage());
                                        throw th;
                                    }
                                }
                                throw th;
                            }
                        } catch (Exception e11) {
                            e = e11;
                            fileOutputStream2 = fileOutputStream3;
                            jCurrentTimeMillis3 = 0;
                            fileOutputStream = fileOutputStream2;
                            Log.e("TTPropHelper", "saveToLocal: ", e);
                            oqVar.kq(false, false);
                            obj = fileOutputStream;
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                                obj = fileOutputStream;
                            }
                            if (oq) {
                                jCurrentTimeMillis4 = System.currentTimeMillis();
                            } else {
                                jCurrentTimeMillis4 = 0;
                            }
                            this.ubx.delete();
                            if (oq) {
                                jCurrentTimeMillis5 = System.currentTimeMillis();
                            } else {
                                jCurrentTimeMillis5 = 0;
                            }
                            this.dgq = oqVar.kq;
                            oqVar.kq(true, true);
                            if (oq) {
                                Log.d("TTPropHelper", "write: " + (jCurrentTimeMillis - jCurrentTimeMillis6) + "/" + (jCurrentTimeMillis2 - jCurrentTimeMillis6) + "/" + (jCurrentTimeMillis3 - jCurrentTimeMillis6) + "/" + (jCurrentTimeMillis4 - jCurrentTimeMillis6) + "/" + (jCurrentTimeMillis5 - jCurrentTimeMillis6));
                            }
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        r11 = obj;
                    }
                } catch (Exception e12) {
                    e = e12;
                }
            }
            if (oq) {
                jCurrentTimeMillis4 = System.currentTimeMillis();
            } else {
                jCurrentTimeMillis4 = 0;
            }
            this.ubx.delete();
            if (oq) {
                jCurrentTimeMillis5 = System.currentTimeMillis();
            } else {
                jCurrentTimeMillis5 = 0;
            }
            this.dgq = oqVar.kq;
            oqVar.kq(true, true);
            if (oq) {
                Log.d("TTPropHelper", "write: " + (jCurrentTimeMillis - jCurrentTimeMillis6) + "/" + (jCurrentTimeMillis2 - jCurrentTimeMillis6) + "/" + (jCurrentTimeMillis3 - jCurrentTimeMillis6) + "/" + (jCurrentTimeMillis4 - jCurrentTimeMillis6) + "/" + (jCurrentTimeMillis5 - jCurrentTimeMillis6));
            }
        } catch (Throwable th7) {
            Log.w("TTPropHelper", "writeToFile: Got exception:", th7);
            if (this.nn.exists() && !this.nn.delete()) {
                Log.e("TTPropHelper", "Couldn't clean up partially-written file " + this.nn);
            }
            oqVar.kq(false, false);
        }
    }

    public static kq kq(@NotNull Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            str = "tt_prop";
        }
        synchronized (kq.class) {
            try {
                if (vvw == null) {
                    vvw = new ArrayMap<>();
                }
                File file = vvw.get(str);
                if (file == null) {
                    file = new File(context.getFilesDir(), str);
                    vvw.put(str, file);
                }
                if (wki == null) {
                    wki = new ArrayMap<>();
                }
                kq kqVar = wki.get(file);
                if (kqVar != null) {
                    return kqVar;
                }
                kq kqVar2 = new kq(file);
                wki.put(file, kqVar2);
                return kqVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static File kq(File file) {
        return new File(file.getPath() + ".bak");
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00d0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x00d8 A[Catch: all -> 0x00db, TryCatch #4 {all -> 0x00db, blocks: (B:50:0x00d2, B:52:0x00d8, B:55:0x00dd, B:56:0x00e5), top: B:69:0x00d2 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x00d2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public void kq() {
        FileInputStream fileInputStream;
        Throwable th;
        synchronized (this.bob) {
            try {
                if (this.rhi) {
                    if (oq) {
                        Log.d("TTPropHelper", "reload: already loaded, ignore");
                    }
                    return;
                }
                if (this.ubx.exists()) {
                    this.nn.delete();
                    this.ubx.renameTo(this.nn);
                }
                if (oq) {
                    Log.d("TTPropHelper", "reload: " + this.nn.getAbsolutePath() + ", exist? " + this.nn.exists());
                }
                Properties properties = null;
                if (this.nn.exists()) {
                    Properties properties2 = new Properties();
                    try {
                        fileInputStream = new FileInputStream(this.nn);
                        try {
                            properties2.load(fileInputStream);
                            if (oq) {
                                Log.d("TTPropHelper", "reload: find " + properties2.size() + " ,items from " + this.nn.getAbsolutePath());
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                Log.e("TTPropHelper", "reload: ", th);
                                if (fileInputStream != null) {
                                }
                                properties = properties2;
                                synchronized (this.bob) {
                                    if (properties != null) {
                                        try {
                                            if (!properties.isEmpty()) {
                                                this.csi = properties;
                                            }
                                        } catch (Throwable th3) {
                                            throw th3;
                                        }
                                    }
                                    this.rhi = true;
                                    this.bob.notifyAll();
                                }
                            } catch (Throwable th4) {
                                if (fileInputStream != null) {
                                    try {
                                        fileInputStream.close();
                                    } catch (Throwable th5) {
                                        Log.w("TTPropHelper", th5.getMessage());
                                    }
                                }
                                throw th4;
                            }
                        }
                    } catch (Throwable th6) {
                        fileInputStream = null;
                        th = th6;
                    }
                    try {
                        fileInputStream.close();
                    } catch (Throwable th7) {
                        Log.w("TTPropHelper", th7.getMessage());
                    }
                    properties = properties2;
                }
                synchronized (this.bob) {
                    if (properties != null) {
                        if (!properties.isEmpty()) {
                            this.csi = properties;
                        }
                    }
                    this.rhi = true;
                    this.bob.notifyAll();
                }
            } catch (Throwable th8) {
                throw th8;
            }
        }
    }

    public String kq(String str, String str2) {
        String property;
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        synchronized (this.bob) {
            fou();
            property = this.csi.getProperty(str, str2);
        }
        return property;
    }

    public int kq(String str, int i10) {
        int i11;
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.bob) {
                try {
                    try {
                        fou();
                        i11 = Integer.parseInt(this.csi.getProperty(str, String.valueOf(i10)));
                    } catch (NumberFormatException e10) {
                        Log.e("TTPropHelper", e10.getMessage());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return i11;
        }
        return i10;
    }

    public long kq(String str, long j10) {
        long j11;
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.bob) {
                try {
                    try {
                        fou();
                        j11 = Long.parseLong(this.csi.getProperty(str, String.valueOf(j10)));
                    } catch (NumberFormatException e10) {
                        Log.e("TTPropHelper", e10.getMessage());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return j11;
        }
        return j10;
    }

    public float kq(String str, float f10) {
        float f11;
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.bob) {
                try {
                    try {
                        fou();
                        f11 = Float.parseFloat(this.csi.getProperty(str, String.valueOf(f10)));
                    } catch (NumberFormatException e10) {
                        Log.e("TTPropHelper", e10.getMessage());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return f11;
        }
        return f10;
    }

    public boolean kq(String str, boolean z9) {
        boolean z10;
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.bob) {
                try {
                    try {
                        fou();
                        z10 = Boolean.parseBoolean(this.csi.getProperty(str, String.valueOf(z9)));
                    } catch (NumberFormatException e10) {
                        Log.e("TTPropHelper", e10.getMessage());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return z10;
        }
        return z9;
    }

    public boolean kq(String str) {
        boolean zContainsKey;
        synchronized (this.bob) {
            try {
                try {
                    fou();
                    zContainsKey = this.csi.containsKey(str);
                } catch (NumberFormatException e10) {
                    Log.e("TTPropHelper", e10.getMessage());
                    return false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zContainsKey;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kq(final oq oqVar, final boolean z9) {
        boolean z10;
        Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.component.kq.3
            @Override // java.lang.Runnable
            public void run() {
                synchronized (kq.this.fou) {
                    try {
                        kq.this.oq(oqVar, z9);
                    } catch (OutOfMemoryError unused) {
                    }
                }
                synchronized (kq.this.bob) {
                    kq.dgq(kq.this);
                }
            }
        };
        if (z9) {
            synchronized (this.bob) {
                z10 = this.rjo == 1;
            }
            if (z10) {
                runnable.run();
                return;
            }
        }
        com.bytedance.sdk.component.oq.kq(runnable, true ^ z9);
    }
}
