package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.c4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6177c4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile X5.g f36644a;

    /* JADX WARN: Code duplicated, block: B:20:0x0036 A[Catch: all -> 0x0022, TryCatch #3 {all -> 0x0022, blocks: (B:6:0x0007, B:8:0x000b, B:10:0x0019, B:20:0x0036, B:76:0x017f, B:15:0x0025, B:17:0x002d, B:21:0x003c, B:23:0x0042, B:25:0x0048, B:27:0x0050, B:75:0x017c, B:77:0x0182, B:78:0x0185, B:79:0x0186, B:28:0x0054, B:30:0x0058, B:31:0x0065, B:33:0x006b, B:39:0x0084, B:41:0x008a, B:42:0x0096, B:62:0x015f, B:63:0x0162, B:71:0x0171, B:70:0x016e, B:72:0x0172, B:73:0x0177, B:74:0x0178, B:36:0x0073, B:38:0x0079), top: B:88:0x0007, inners: #0 }] */
    public static X5.g a(Context context) {
        X5.g gVarA;
        X5.g gVarA2;
        X5.g gVar = f36644a;
        if (gVar != null) {
            return gVar;
        }
        synchronized (AbstractC6177c4.class) {
            try {
                gVarA = f36644a;
                if (gVarA == null) {
                    String str = Build.TYPE;
                    String str2 = Build.TAGS;
                    int i10 = AbstractC6204f4.f36681b;
                    if (!str.equals("eng") && !str.equals("userdebug")) {
                        gVarA = X5.g.a();
                    } else if (str2.contains("dev-keys") || str2.contains("test-keys")) {
                        Context contextCreateDeviceProtectedStorageContext = (!Q3.a() || context.isDeviceProtectedStorage()) ? context : context.createDeviceProtectedStorageContext();
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            StrictMode.allowThreadDiskWrites();
                            char c10 = 0;
                            try {
                                File file = new File(contextCreateDeviceProtectedStorageContext.getDir("phenotype_hermetic", 0), "overrides.txt");
                                gVarA2 = file.exists() ? X5.g.d(file) : X5.g.a();
                            } catch (RuntimeException e10) {
                                Log.e("HermeticFileOverrides", "no data dir", e10);
                                gVarA2 = X5.g.a();
                            }
                            if (gVarA2.c()) {
                                File file2 = (File) gVarA2.b();
                                try {
                                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2)));
                                    try {
                                        p190t.k kVar = new p190t.k();
                                        HashMap map = new HashMap();
                                        while (true) {
                                            String line = bufferedReader.readLine();
                                            if (line == null) {
                                                break;
                                            }
                                            String[] strArrSplit = line.split(" ", 3);
                                            if (strArrSplit.length != 3) {
                                                StringBuilder sb = new StringBuilder(line.length() + 9);
                                                sb.append("Invalid: ");
                                                sb.append(line);
                                                Log.e("HermeticFileOverrides", sb.toString());
                                            } else {
                                                String str3 = new String(strArrSplit[c10]);
                                                String strDecode = Uri.decode(new String(strArrSplit[1]));
                                                String strDecode2 = (String) map.get(strArrSplit[2]);
                                                if (strDecode2 == null) {
                                                    String str4 = new String(strArrSplit[2]);
                                                    strDecode2 = Uri.decode(str4);
                                                    if (strDecode2.length() < 1024 || strDecode2 == str4) {
                                                        map.put(str4, strDecode2);
                                                    }
                                                }
                                                p190t.k kVar2 = (p190t.k) kVar.get(str3);
                                                if (kVar2 == null) {
                                                    kVar2 = new p190t.k();
                                                    kVar.put(str3, kVar2);
                                                }
                                                kVar2.put(strDecode, strDecode2);
                                                c10 = 0;
                                            }
                                        }
                                        String string = file2.toString();
                                        String packageName = contextCreateDeviceProtectedStorageContext.getPackageName();
                                        StringBuilder sb2 = new StringBuilder(string.length() + 28 + String.valueOf(packageName).length());
                                        sb2.append("Parsed ");
                                        sb2.append(string);
                                        sb2.append(" for Android package ");
                                        sb2.append(packageName);
                                        Log.w("HermeticFileOverrides", sb2.toString());
                                        W3 w10 = new W3(kVar);
                                        bufferedReader.close();
                                        gVarA = X5.g.d(w10);
                                    } catch (Throwable th) {
                                        try {
                                            bufferedReader.close();
                                            throw th;
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                            throw th;
                                        }
                                    }
                                } catch (IOException e11) {
                                    throw new RuntimeException(e11);
                                }
                            } else {
                                gVarA = X5.g.a();
                            }
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        } catch (Throwable th3) {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            throw th3;
                        }
                    } else {
                        gVarA = X5.g.a();
                    }
                    f36644a = gVarA;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return gVarA;
    }
}
