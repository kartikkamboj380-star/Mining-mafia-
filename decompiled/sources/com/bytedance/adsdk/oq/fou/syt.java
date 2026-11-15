package com.bytedance.adsdk.oq.fou;

import android.content.Context;
import android.util.Pair;
import com.bytedance.adsdk.oq.vvw;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes.dex */
public class syt {
    private final rjo kq;
    private final rhi oq;

    public syt(rjo rjoVar, rhi rhiVar) {
        this.kq = rjoVar;
        this.oq = rhiVar;
    }

    private vvw<com.bytedance.adsdk.oq.rjo> bob(Context context, String str, String str2) {
        Closeable closeable = null;
        try {
            try {
                fou fouVarKq = this.oq.kq(str);
                if (!fouVarKq.kq()) {
                    vvw<com.bytedance.adsdk.oq.rjo> vvwVar = new vvw<>(new IllegalArgumentException(fouVarKq.fou()));
                    try {
                        fouVarKq.close();
                    } catch (IOException unused) {
                    }
                    return vvwVar;
                }
                vvw<com.bytedance.adsdk.oq.rjo> vvwVarKq = kq(context, str, fouVarKq.oq(), fouVarKq.bob(), str2);
                vvwVarKq.kq();
                try {
                    fouVarKq.close();
                } catch (IOException unused2) {
                }
                return vvwVarKq;
            } catch (Throwable th) {
                if (0 == 0) {
                    throw th;
                }
                try {
                    closeable.close();
                    throw th;
                } catch (IOException unused3) {
                    throw th;
                }
            }
        } catch (Exception e10) {
            vvw<com.bytedance.adsdk.oq.rjo> vvwVar2 = new vvw<>(e10);
            if (0 != 0) {
                try {
                    closeable.close();
                } catch (IOException unused4) {
                }
            }
            return vvwVar2;
        }
    }

    private com.bytedance.adsdk.oq.rjo oq(Context context, String str, String str2) {
        rjo rjoVar;
        Pair<bob, InputStream> pairKq;
        if (str2 == null || (rjoVar = this.kq) == null || (pairKq = rjoVar.kq(str)) == null) {
            return null;
        }
        bob bobVar = (bob) pairKq.first;
        InputStream inputStream = (InputStream) pairKq.second;
        vvw<com.bytedance.adsdk.oq.rjo> vvwVarKq = bobVar == bob.ZIP ? com.bytedance.adsdk.oq.syt.kq(context, new ZipInputStream(inputStream), str2) : com.bytedance.adsdk.oq.syt.oq(inputStream, str2);
        if (vvwVarKq.kq() != null) {
            return vvwVarKq.kq();
        }
        return null;
    }

    public vvw<com.bytedance.adsdk.oq.rjo> kq(Context context, String str, String str2) {
        com.bytedance.adsdk.oq.rjo rjoVarOq = oq(context, str, str2);
        return rjoVarOq != null ? new vvw<>(rjoVarOq) : bob(context, str, str2);
    }

    private vvw<com.bytedance.adsdk.oq.rjo> kq(Context context, String str, InputStream inputStream, String str2, String str3) {
        vvw<com.bytedance.adsdk.oq.rjo> vvwVarKq;
        bob bobVar;
        rjo rjoVar;
        if (str2 == null) {
            str2 = "application/json";
        }
        if (!str2.contains("application/zip") && !str2.contains("application/x-zip") && !str2.contains("application/x-zip-compressed") && !str.split("\\?")[0].endsWith(".lottie")) {
            bobVar = bob.JSON;
            vvwVarKq = kq(str, inputStream, str3);
        } else {
            bob bobVar2 = bob.ZIP;
            vvwVarKq = kq(context, str, inputStream, str3);
            bobVar = bobVar2;
        }
        if (str3 != null && vvwVarKq.kq() != null && (rjoVar = this.kq) != null) {
            rjoVar.kq(str, bobVar);
        }
        return vvwVarKq;
    }

    private vvw<com.bytedance.adsdk.oq.rjo> kq(Context context, String str, InputStream inputStream, String str2) {
        rjo rjoVar;
        if (str2 != null && (rjoVar = this.kq) != null) {
            return com.bytedance.adsdk.oq.syt.kq(context, new ZipInputStream(new FileInputStream(rjoVar.kq(str, inputStream, bob.ZIP))), str);
        }
        return com.bytedance.adsdk.oq.syt.kq(context, new ZipInputStream(inputStream), (String) null);
    }

    private vvw<com.bytedance.adsdk.oq.rjo> kq(String str, InputStream inputStream, String str2) {
        rjo rjoVar;
        if (str2 != null && (rjoVar = this.kq) != null) {
            return com.bytedance.adsdk.oq.syt.oq(new FileInputStream(rjoVar.kq(str, inputStream, bob.JSON).getAbsolutePath()), str);
        }
        return com.bytedance.adsdk.oq.syt.oq(inputStream, (String) null);
    }
}
