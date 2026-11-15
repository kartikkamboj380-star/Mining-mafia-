package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map f40677c = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f40678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f40679b;

    private u(Context context, String str) {
        this.f40678a = context;
        this.f40679b = str;
    }

    public static synchronized u c(Context context, String str) {
        Map map;
        try {
            map = f40677c;
            if (!map.containsKey(str)) {
                map.put(str, new u(context, str));
            }
        } catch (Throwable th) {
            throw th;
        }
        return (u) map.get(str);
    }

    public synchronized Void a() {
        this.f40678a.deleteFile(this.f40679b);
        return null;
    }

    String b() {
        return this.f40679b;
    }

    public synchronized g d() {
        FileInputStream fileInputStreamOpenFileInput;
        Throwable th;
        try {
            try {
                fileInputStreamOpenFileInput = this.f40678a.openFileInput(this.f40679b);
                try {
                    int iAvailable = fileInputStreamOpenFileInput.available();
                    byte[] bArr = new byte[iAvailable];
                    fileInputStreamOpenFileInput.read(bArr, 0, iAvailable);
                    g gVarB = g.b(new JSONObject(new String(bArr, "UTF-8")));
                    fileInputStreamOpenFileInput.close();
                    return gVarB;
                } catch (FileNotFoundException | JSONException unused) {
                    if (fileInputStreamOpenFileInput != null) {
                        fileInputStreamOpenFileInput.close();
                    }
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    if (fileInputStreamOpenFileInput != null) {
                        fileInputStreamOpenFileInput.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        } catch (FileNotFoundException | JSONException unused2) {
            fileInputStreamOpenFileInput = null;
        } catch (Throwable th4) {
            fileInputStreamOpenFileInput = null;
            th = th4;
        }
    }

    public synchronized Void e(g gVar) {
        FileOutputStream fileOutputStreamOpenFileOutput = this.f40678a.openFileOutput(this.f40679b, 0);
        try {
            fileOutputStreamOpenFileOutput.write(gVar.toString().getBytes("UTF-8"));
            fileOutputStreamOpenFileOutput.close();
        } catch (Throwable th) {
            fileOutputStreamOpenFileOutput.close();
            throw th;
        }
        return null;
    }
}
