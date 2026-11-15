package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public final class U8 implements InterfaceC3945j8 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final T8 f23935c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f23933a = new LinkedHashMap(16, 0.75f, true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f23934b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f23936d = 5242880;

    public U8(T8 t10, int i10) {
        this.f23935c = t10;
    }

    static byte[] e(S8 s10, long j10) throws IOException {
        long jA = s10.a();
        if (j10 >= 0 && j10 <= jA) {
            int i10 = (int) j10;
            if (i10 == j10) {
                byte[] bArr = new byte[i10];
                new DataInputStream(s10).readFully(bArr);
                return bArr;
            }
        }
        StringBuilder sb = new StringBuilder(String.valueOf(j10).length() + 33 + String.valueOf(jA).length());
        sb.append("streamToBytes length=");
        sb.append(j10);
        sb.append(", maxLength=");
        sb.append(jA);
        throw new IOException(sb.toString());
    }

    static void f(OutputStream outputStream, int i10) throws IOException {
        outputStream.write(i10 & 255);
        outputStream.write((i10 >> 8) & 255);
        outputStream.write((i10 >> 16) & 255);
        outputStream.write((i10 >> 24) & 255);
    }

    static int g(InputStream inputStream) {
        return (o(inputStream) << 24) | o(inputStream) | (o(inputStream) << 8) | (o(inputStream) << 16);
    }

    static void h(OutputStream outputStream, long j10) throws IOException {
        outputStream.write((byte) j10);
        outputStream.write((byte) (j10 >>> 8));
        outputStream.write((byte) (j10 >>> 16));
        outputStream.write((byte) (j10 >>> 24));
        outputStream.write((byte) (j10 >>> 32));
        outputStream.write((byte) (j10 >>> 40));
        outputStream.write((byte) (j10 >>> 48));
        outputStream.write((byte) (j10 >>> 56));
    }

    static long i(InputStream inputStream) {
        return (((long) o(inputStream)) & 255) | ((((long) o(inputStream)) & 255) << 8) | ((((long) o(inputStream)) & 255) << 16) | ((((long) o(inputStream)) & 255) << 24) | ((((long) o(inputStream)) & 255) << 32) | ((((long) o(inputStream)) & 255) << 40) | ((((long) o(inputStream)) & 255) << 48) | ((((long) o(inputStream)) & 255) << 56);
    }

    static void j(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        int length = bytes.length;
        h(outputStream, length);
        outputStream.write(bytes, 0, length);
    }

    static String l(S8 s10) {
        return new String(e(s10, i(s10)), "UTF-8");
    }

    private final void m(String str, R8 r10) {
        Map map = this.f23933a;
        if (map.containsKey(str)) {
            this.f23934b += r10.f22727a - ((R8) map.get(str)).f22727a;
        } else {
            this.f23934b += r10.f22727a;
        }
        map.put(str, r10);
    }

    private final void n(String str) {
        R8 r10 = (R8) this.f23933a.remove(str);
        if (r10 != null) {
            this.f23934b -= r10.f22727a;
        }
    }

    private static int o(InputStream inputStream) throws IOException {
        int i10 = inputStream.read();
        if (i10 != -1) {
            return i10;
        }
        throw new EOFException();
    }

    private static final String p(String str) {
        int length = str.length() >> 1;
        return String.valueOf(String.valueOf(str.substring(0, length).hashCode())).concat(String.valueOf(String.valueOf(str.substring(length).hashCode())));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3945j8
    public final synchronized void a(String str, boolean z9) {
        C3821i8 c3821i8K = k(str);
        if (c3821i8K != null) {
            c3821i8K.f29285f = 0L;
            c3821i8K.f29284e = 0L;
            b(str, c3821i8K);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3945j8
    public final synchronized void b(String str, C3821i8 c3821i8) {
        try {
            long j10 = this.f23934b;
            int length = c3821i8.f29280a.length;
            long j11 = j10 + ((long) length);
            int i10 = this.f23936d;
            float f10 = 0.9f;
            if (j11 <= i10 || length <= i10 * 0.9f) {
                File fileD = d(str);
                try {
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileD));
                    R8 r10 = new R8(str, c3821i8);
                    try {
                        f(bufferedOutputStream, 538247942);
                        j(bufferedOutputStream, r10.f22728b);
                        String str2 = r10.f22729c;
                        if (str2 == null) {
                            str2 = "";
                        }
                        j(bufferedOutputStream, str2);
                        h(bufferedOutputStream, r10.f22730d);
                        h(bufferedOutputStream, r10.f22731e);
                        h(bufferedOutputStream, r10.f22732f);
                        h(bufferedOutputStream, r10.f22733g);
                        List<C4952r8> list = r10.f22734h;
                        if (list != null) {
                            f(bufferedOutputStream, list.size());
                            for (C4952r8 c4952r8 : list) {
                                j(bufferedOutputStream, c4952r8.a());
                                j(bufferedOutputStream, c4952r8.b());
                            }
                        } else {
                            f(bufferedOutputStream, 0);
                        }
                        bufferedOutputStream.flush();
                        bufferedOutputStream.write(c3821i8.f29280a);
                        bufferedOutputStream.close();
                        r10.f22727a = fileD.length();
                        m(str, r10);
                        long j12 = this.f23934b;
                        int i11 = this.f23936d;
                        if (j12 >= i11) {
                            boolean z9 = K8.f20109b;
                            if (z9) {
                                K8.a("Pruning old cache entries.", new Object[0]);
                            }
                            long j13 = this.f23934b;
                            long jElapsedRealtime = SystemClock.elapsedRealtime();
                            Iterator it = this.f23933a.entrySet().iterator();
                            int i12 = 0;
                            while (it.hasNext()) {
                                R8 r11 = (R8) ((Map.Entry) it.next()).getValue();
                                String str3 = r11.f22728b;
                                if (d(str3).delete()) {
                                    this.f23934b -= r11.f22727a;
                                } else {
                                    K8.b("Could not delete cache entry for key=%s, filename=%s", str3, p(str3));
                                }
                                it.remove();
                                i12++;
                                if (this.f23934b < i11 * f10) {
                                    break;
                                } else {
                                    f10 = f10;
                                }
                            }
                            if (z9) {
                                K8.a("pruned %d files, %d bytes, %d ms", Integer.valueOf(i12), Long.valueOf(this.f23934b - j13), Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
                            }
                        }
                    } catch (IOException e10) {
                        K8.b("%s", e10.toString());
                        bufferedOutputStream.close();
                        K8.b("Failed to write header for %s", fileD.getAbsolutePath());
                        throw new IOException();
                    }
                } catch (IOException unused) {
                    if (!fileD.delete()) {
                        K8.b("Could not clean up file %s", fileD.getAbsolutePath());
                    }
                    if (!this.f23935c.zza().exists()) {
                        K8.b("Re-initializing cache after external clearing.", new Object[0]);
                        this.f23933a.clear();
                        this.f23934b = 0L;
                        zzc();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c(String str) {
        boolean zDelete = d(str).delete();
        n(str);
        if (zDelete) {
            return;
        }
        K8.b("Could not delete cache entry for key=%s, filename=%s", str, p(str));
    }

    public final File d(String str) {
        return new File(this.f23935c.zza(), p(str));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3945j8
    public final synchronized C3821i8 k(String str) {
        R8 r10 = (R8) this.f23933a.get(str);
        if (r10 == null) {
            return null;
        }
        File fileD = d(str);
        try {
            S8 s10 = new S8(new BufferedInputStream(new FileInputStream(fileD)), fileD.length());
            try {
                String str2 = R8.a(s10).f22728b;
                if (!TextUtils.equals(str, str2)) {
                    K8.b("%s: key=%s, found=%s", fileD.getAbsolutePath(), str, str2);
                    n(str);
                    s10.close();
                    return null;
                }
                byte[] bArrE = e(s10, s10.a());
                C3821i8 c3821i8 = new C3821i8();
                c3821i8.f29280a = bArrE;
                c3821i8.f29281b = r10.f22729c;
                c3821i8.f29282c = r10.f22730d;
                c3821i8.f29283d = r10.f22731e;
                c3821i8.f29284e = r10.f22732f;
                c3821i8.f29285f = r10.f22733g;
                List<C4952r8> list = r10.f22734h;
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                for (C4952r8 c4952r8 : list) {
                    treeMap.put(c4952r8.a(), c4952r8.b());
                }
                c3821i8.f29286g = treeMap;
                c3821i8.f29287h = Collections.unmodifiableList(list);
                s10.close();
                return c3821i8;
            } catch (Throwable th) {
                s10.close();
                throw th;
            }
        } catch (IOException e10) {
            K8.b("%s: %s", fileD.getAbsolutePath(), e10.toString());
            c(str);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3945j8
    public final synchronized void zzc() {
        File fileZza = this.f23935c.zza();
        if (fileZza.exists()) {
            File[] fileArrListFiles = fileZza.listFiles();
            if (fileArrListFiles != null) {
                for (File file : fileArrListFiles) {
                    try {
                        long length = file.length();
                        S8 s10 = new S8(new BufferedInputStream(new FileInputStream(file)), length);
                        try {
                            R8 r8A = R8.a(s10);
                            r8A.f22727a = length;
                            m(r8A.f22728b, r8A);
                            s10.close();
                        } catch (Throwable th) {
                            s10.close();
                            throw th;
                        }
                    } catch (IOException unused) {
                        file.delete();
                    }
                }
            }
        } else if (!fileZza.mkdirs()) {
            K8.c("Unable to create cache dir %s", fileZza.getAbsolutePath());
        }
    }

    public U8(File file, int i10) {
        this.f23935c = new Q8(this, file);
    }
}
