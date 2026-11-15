package com.google.firebase.crashlytics.ndk;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;
import java.util.zip.GZIPOutputStream;
import p117l6.AbstractC7048i;
import p147o6.F;
import p147o6.G;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Charset f40055d = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f40056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f40057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p177r6.g f40058c;

    a(Context context, e eVar, p177r6.g gVar) {
        this.f40056a = context;
        this.f40057b = eVar;
        this.f40058c = gVar;
    }

    private static F.a a(ApplicationExitInfo applicationExitInfo) {
        return F.a.a().c(applicationExitInfo.getImportance()).e(applicationExitInfo.getProcessName()).g(applicationExitInfo.getReason()).i(applicationExitInfo.getTimestamp()).d(applicationExitInfo.getPid()).f(applicationExitInfo.getPss()).h(applicationExitInfo.getRss()).j(i(applicationExitInfo)).a();
    }

    public static String b(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 == -1) {
                return r(byteArrayOutputStream.toByteArray());
            }
            byteArrayOutputStream.write(bArr, 0, i10);
        }
    }

    private F.a c(String str) {
        if (Build.VERSION.SDK_INT >= 31) {
            return f(str);
        }
        return null;
    }

    private f.c e(String str, File file) {
        return new f.c(h(file, ".dmp"), c(str));
    }

    private F.a f(String str) {
        List historicalProcessExitReasons = ((ActivityManager) this.f40056a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
        File fileQ = this.f40058c.q(str, "start-time");
        return g(fileQ == null ? System.currentTimeMillis() : fileQ.lastModified(), historicalProcessExitReasons);
    }

    private F.a g(long j10, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ApplicationExitInfo applicationExitInfoA = T0.f.a(it.next());
            if (applicationExitInfoA.getReason() == 5 && applicationExitInfoA.getTimestamp() >= j10) {
                arrayList.add(applicationExitInfoA);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return a(T0.f.a(arrayList.get(0)));
    }

    private static File h(File file, String str) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return null;
        }
        for (File file2 : fileArrListFiles) {
            if (file2.getName().endsWith(str)) {
                return file2;
            }
        }
        return null;
    }

    private static String i(ApplicationExitInfo applicationExitInfo) {
        try {
            return b(applicationExitInfo.getTraceInputStream());
        } catch (IOException unused) {
            p087i6.g.f().k("Failed to get input stream from ApplicationExitInfo");
            return null;
        }
    }

    private static void o(p177r6.g gVar, String str, String str2, String str3) throws Throwable {
        q(new File(gVar.k(str), str3), str2);
    }

    private static void q(File file, String str) throws Throwable {
        BufferedWriter bufferedWriter = null;
        try {
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), f40055d));
            try {
                bufferedWriter2.write(str);
                AbstractC7048i.f(bufferedWriter2, "Failed to close " + file);
            } catch (IOException unused) {
                bufferedWriter = bufferedWriter2;
                AbstractC7048i.f(bufferedWriter, "Failed to close " + file);
            } catch (Throwable th) {
                th = th;
                bufferedWriter = bufferedWriter2;
                AbstractC7048i.f(bufferedWriter, "Failed to close " + file);
                throw th;
            }
        } catch (IOException unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static String r(byte[] bArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(bArr);
                gZIPOutputStream.finish();
                String strEncodeToString = Base64.getEncoder().encodeToString(byteArrayOutputStream.toByteArray());
                gZIPOutputStream.close();
                byteArrayOutputStream.close();
                return strEncodeToString;
            } catch (Throwable th) {
                try {
                    gZIPOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public f d(String str) {
        File fileK = this.f40058c.k(str);
        File file = new File(fileK, "pending");
        p087i6.g.f().i("Minidump directory: " + file.getAbsolutePath());
        File fileH = h(file, ".dmp");
        p087i6.g gVarF = p087i6.g.f();
        StringBuilder sb = new StringBuilder();
        sb.append("Minidump file ");
        sb.append((fileH == null || !fileH.exists()) ? "does not exist" : "exists");
        gVarF.i(sb.toString());
        f.b bVar = new f.b();
        if (fileK != null && fileK.exists() && file.exists()) {
            bVar.l(e(str, file)).k(h(fileK, ".device_info")).n(new File(fileK, "session.json")).h(new File(fileK, "app.json")).j(new File(fileK, "device.json")).m(new File(fileK, "os.json"));
        }
        return bVar.i();
    }

    public boolean j(String str) {
        f.c cVar = d(str).f40069a;
        return cVar != null && cVar.a();
    }

    public boolean k(String str, String str2, long j10, G g10) throws Throwable {
        File fileK = this.f40058c.k(str);
        if (fileK == null) {
            return false;
        }
        try {
            if (!this.f40057b.a(fileK.getCanonicalPath(), this.f40056a.getAssets())) {
                return false;
            }
            l(str, str2, j10);
            m(str, g10.a());
            p(str, g10.d());
            n(str, g10.c());
            return true;
        } catch (IOException e10) {
            p087i6.g.f().e("Error initializing Crashlytics NDK", e10);
            return false;
        }
    }

    public void l(String str, String str2, long j10) throws Throwable {
        o(this.f40058c, str, h.b(str, str2, j10), "session.json");
    }

    public void m(String str, G.a aVar) throws Throwable {
        o(this.f40058c, str, h.c(aVar.a(), aVar.f(), aVar.g(), aVar.e(), aVar.c(), aVar.d().d(), aVar.d().e()), "app.json");
    }

    public void n(String str, G.b bVar) throws Throwable {
        o(this.f40058c, str, h.d(bVar.a(), bVar.g(), bVar.b(), bVar.j(), bVar.d(), bVar.e(), bVar.i(), bVar.f(), bVar.h()), "device.json");
    }

    public void p(String str, G.c cVar) throws Throwable {
        o(this.f40058c, str, h.e(cVar.d(), cVar.c(), cVar.b()), "os.json");
    }
}
