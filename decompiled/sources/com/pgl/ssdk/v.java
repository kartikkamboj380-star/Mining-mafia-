package com.pgl.ssdk;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.pgl.ssdk.ces.out.DungeonFlag;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Locale;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile String f42031a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile String f42032b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile boolean f42033c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static String f42034d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static String f42035e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static String f42036f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f42037g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static long f42038h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static long f42039i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static volatile long f42040j = -1;

    public static void a(File file, boolean z9) throws Throwable {
        e eVarA;
        RandomAccessFile randomAccessFile = null;
        try {
            try {
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ);
                try {
                    if (TextUtils.isEmpty(f42031a) && (eVarA = a(file)) != null) {
                        f42031a = a(eVarA.a());
                        f42034d = eVarA.b();
                        if (z9) {
                            a();
                            try {
                                randomAccessFile2.close();
                                return;
                            } catch (IOException unused) {
                                return;
                            }
                        }
                    }
                    if (TextUtils.isEmpty(f42035e)) {
                        f42035e = a(randomAccessFile2);
                    }
                    if (f42038h == 0) {
                        f42038h = randomAccessFile2.length() / 1024;
                    }
                    if (f42039i == 0) {
                        f42039i = b(file);
                    }
                    randomAccessFile2.close();
                } catch (FileNotFoundException unused2) {
                    randomAccessFile = randomAccessFile2;
                    if (randomAccessFile != null) {
                        randomAccessFile.close();
                    }
                } catch (IOException unused3) {
                    randomAccessFile = randomAccessFile2;
                    if (randomAccessFile != null) {
                        randomAccessFile.close();
                    }
                } catch (Throwable th) {
                    th = th;
                    randomAccessFile = randomAccessFile2;
                    if (randomAccessFile != null) {
                        try {
                            randomAccessFile.close();
                        } catch (IOException unused4) {
                        }
                    }
                    throw th;
                }
            } catch (IOException unused5) {
            }
        } catch (FileNotFoundException unused6) {
        } catch (IOException unused7) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static String b() throws Throwable {
        long j10;
        boolean z9;
        String string;
        String string2;
        String string3;
        String string4;
        long j11;
        long j12;
        int i10;
        String str;
        if (TextUtils.isEmpty(f42031a) || TextUtils.isEmpty(f42035e) || f42037g == -1) {
            SharedPreferences sharedPreferencesA = ax.a(z.a());
            long j13 = -1;
            if (sharedPreferencesA != null) {
                j13 = sharedPreferencesA.getLong("mt", -1L);
                string2 = sharedPreferencesA.getString("sa", null);
                string3 = sharedPreferencesA.getString("sj", null);
                string4 = sharedPreferencesA.getString("md5", null);
                j11 = sharedPreferencesA.getLong("as", 0L);
                j12 = sharedPreferencesA.getLong("ds", 0L);
                z9 = true;
                i10 = sharedPreferencesA.getInt("cpc", -1);
                j10 = 0;
                string = sharedPreferencesA.getString("ap", null);
            } else {
                j10 = 0;
                z9 = true;
                string = null;
                string2 = null;
                string3 = null;
                string4 = null;
                j11 = 0;
                j12 = 0;
                i10 = 0;
            }
            String strC = c();
            if (strC == null) {
                return null;
            }
            File file = new File(strC);
            str = null;
            Object[] objArr = (Object[]) com.pgl.ssdk.ces.a.meta(158, z.a(), strC);
            Integer num = (Integer) objArr[0];
            String str2 = (String) objArr[z9 ? 1 : 0];
            long jLastModified = file.lastModified();
            if (jLastModified != j13 || string2 == null || i10 == -1) {
                f42040j = jLastModified;
                if (str2 != null) {
                    f42036f = str2;
                }
                if (num != null) {
                    f42037g = num.intValue();
                }
                a(file, false);
                a();
            } else {
                f42031a = string2;
                f42034d = string3;
                f42038h = j11;
                f42039i = j12;
                f42035e = string4;
                f42037g = i10;
                f42036f = string;
            }
        } else {
            j10 = 0;
            str = null;
            z9 = true;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(f42031a)) {
                jSONObject.put("sign", f42031a);
            }
            if (!TextUtils.isEmpty(f42034d)) {
                jSONObject.put("subject", f42034d);
            }
            if (!TextUtils.isEmpty(f42035e)) {
                jSONObject.put("md5", f42035e);
            }
            if (!TextUtils.isEmpty(f42036f)) {
                jSONObject.put("path", f42036f);
            }
            long j14 = f42038h;
            if (j14 != j10) {
                jSONObject.put("apkSize", j14);
            }
            long j15 = f42039i;
            if (j15 != j10) {
                jSONObject.put("dexSize", j15);
            }
            int i11 = f42037g;
            if (i11 != -1) {
                jSONObject.put("code", i11);
            }
            e();
            jSONObject.put("signpm", f42032b);
            if (!TextUtils.isEmpty(f42032b) && !TextUtils.isEmpty(f42031a)) {
                if (!f42032b.equals(f42031a)) {
                    f42033c = z9;
                }
                jSONObject.put("rebud", f42033c);
            }
            return jSONObject.toString();
        } catch (JSONException unused) {
            return str;
        }
    }

    public static String c() {
        if (z.a() == null) {
            return null;
        }
        String packageCodePath = z.a().getPackageCodePath();
        if (TextUtils.isEmpty(packageCodePath)) {
            return null;
        }
        File file = new File(packageCodePath);
        if (file.exists() && file.canRead()) {
            return packageCodePath;
        }
        return null;
    }

    public static void d() throws Throwable {
        if (TextUtils.isEmpty(f42031a)) {
            SharedPreferences sharedPreferencesA = ax.a(z.a());
            String string = null;
            long j10 = -1;
            if (sharedPreferencesA != null) {
                j10 = sharedPreferencesA.getLong("mt", -1L);
                string = sharedPreferencesA.getString("sa", null);
            }
            String strC = c();
            if (TextUtils.isEmpty(strC)) {
                return;
            }
            File file = new File(strC);
            long jLastModified = file.lastModified();
            if (jLastModified != j10 || string == null) {
                f42040j = jLastModified;
                a(file, true);
                a();
            } else {
                f42031a = string;
            }
        }
        e();
        if (TextUtils.isEmpty(f42032b) || TextUtils.isEmpty(f42031a) || f42032b.equals(f42031a)) {
            return;
        }
        f42033c = true;
    }

    public static String e() {
        if (!TextUtils.isEmpty(f42032b)) {
            return f42032b;
        }
        try {
            String strA = a(z.a().getPackageManager().getPackageInfo(z.a().getPackageName(), 64).signatures[0].toByteArray());
            f42032b = strA;
            return strA;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean f() throws Throwable {
        d();
        return f42033c;
    }

    public static void a() {
        SharedPreferences sharedPreferencesA = ax.a(z.a());
        if (sharedPreferencesA != null) {
            if (!TextUtils.isEmpty(f42031a)) {
                sharedPreferencesA.edit().putString("sa", f42031a).apply();
            }
            if (!TextUtils.isEmpty(f42035e)) {
                sharedPreferencesA.edit().putString("md5", f42035e).apply();
            }
            if (!TextUtils.isEmpty(f42034d)) {
                sharedPreferencesA.edit().putString("sj", f42034d).apply();
            }
            if (f42038h != 0) {
                sharedPreferencesA.edit().putLong("as", f42038h).apply();
            }
            if (f42039i != 0) {
                sharedPreferencesA.edit().putLong("ds", f42039i).apply();
            }
            if (f42040j != -1) {
                sharedPreferencesA.edit().putLong("mt", f42040j).apply();
            }
            if (f42037g != -1) {
                sharedPreferencesA.edit().putInt("cpc", f42037g).apply();
            }
            if (TextUtils.isEmpty(f42036f)) {
                return;
            }
            sharedPreferencesA.edit().putString("ap", f42036f).apply();
        }
    }

    public static String a(byte[] bArr) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(bArr);
            StringBuilder sb = new StringBuilder();
            for (byte b10 : bArrDigest) {
                sb.append(Integer.toHexString((b10 & 255) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER).substring(1, 3).toUpperCase());
                sb.append(":");
            }
            return sb.substring(0, sb.length() - 1);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    @DungeonFlag
    private static e a(File file) throws Throwable {
        RandomAccessFile randomAccessFile;
        List<e> listA;
        try {
            try {
                randomAccessFile = new RandomAccessFile(file, AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ);
                try {
                    q qVarA = r.a(randomAccessFile, 0L, randomAccessFile.length());
                    listA = l.a(qVarA, c.a(qVarA));
                    try {
                        randomAccessFile.close();
                    } catch (IOException unused) {
                    }
                } catch (g.a unused2) {
                    if (randomAccessFile != null) {
                        randomAccessFile.close();
                    }
                    listA = null;
                } catch (Throwable unused3) {
                    if (randomAccessFile != null) {
                        randomAccessFile.close();
                    }
                    listA = null;
                }
            } catch (IOException unused4) {
                listA = null;
            }
        } catch (g.a unused5) {
            randomAccessFile = null;
        } catch (Throwable unused6) {
            randomAccessFile = null;
        }
        if (listA == null || listA.isEmpty()) {
            listA = k.a(file);
        }
        if (listA == null || listA.isEmpty()) {
            return null;
        }
        return listA.get(0);
    }

    public static long b(File file) throws Throwable {
        String str;
        ZipFile zipFile = null;
        try {
            try {
                ZipFile zipFile2 = new ZipFile(file);
                int i10 = 0;
                int size = 0;
                while (true) {
                    if (i10 == 0) {
                        str = "classes.dex";
                    } else {
                        str = String.format(Locale.getDefault(), "classes%d.dex", Integer.valueOf(i10));
                    }
                    try {
                        ZipEntry entry = zipFile2.getEntry(str);
                        if (entry == null) {
                            break;
                        }
                        size = (int) (((long) size) + entry.getSize());
                        i10++;
                    } catch (ZipException unused) {
                        zipFile = zipFile2;
                        if (zipFile == null) {
                            return 0L;
                        }
                        zipFile.close();
                        return 0L;
                    } catch (IOException unused2) {
                        zipFile = zipFile2;
                        if (zipFile == null) {
                            return 0L;
                        }
                        zipFile.close();
                        return 0L;
                    } catch (Throwable th) {
                        th = th;
                        zipFile = zipFile2;
                        if (zipFile != null) {
                            try {
                                zipFile.close();
                            } catch (IOException unused3) {
                            }
                        }
                        throw th;
                    }
                }
                long j10 = size / 1000;
                try {
                    zipFile2.close();
                } catch (IOException unused4) {
                }
                return j10;
            } catch (IOException unused5) {
                return 0L;
            }
        } catch (ZipException unused6) {
        } catch (IOException unused7) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static String a(RandomAccessFile randomAccessFile) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] bArr = new byte[1048576];
            while (true) {
                int i10 = randomAccessFile.read(bArr);
                if (i10 == -1) {
                    break;
                }
                messageDigest.update(bArr, 0, i10);
            }
            String string = new BigInteger(1, messageDigest.digest()).toString(16);
            while (string.length() < 32) {
                string = "0".concat(string);
            }
            return string;
        } catch (FileNotFoundException | IOException | NoSuchAlgorithmException unused) {
            return "";
        }
    }
}
