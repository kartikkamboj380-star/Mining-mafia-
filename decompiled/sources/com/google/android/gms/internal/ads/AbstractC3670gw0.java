package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.gw0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3670gw0 {
    public static void a(byte[] bArr, File file) throws IOException {
        C2580Vv0 c2580Vv0 = new C2580Vv0();
        file.getClass();
        AbstractC1903Iu0 abstractC1903Iu0T = AbstractC1903Iu0.t(new EnumC3292dw0[0]);
        bArr.getClass();
        FileOutputStream fileOutputStreamA = AbstractC3418ew0.a(file, abstractC1903Iu0T, c2580Vv0);
        try {
            fileOutputStreamA.write(bArr);
            fileOutputStreamA.close();
        } catch (Throwable th) {
            try {
                fileOutputStreamA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static void b(File file) throws IOException {
        file.getClass();
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (!parentFile.isDirectory()) {
            throw new IOException("Unable to create parent directories of ".concat(file.toString()));
        }
    }

    public static void c(File file, File file2) throws Throwable {
        file.getClass();
        file2.getClass();
        AbstractC2418Ss0.h(!file.equals(file2), "Source %s and destination %s must be different", file, file2);
        if (file.renameTo(file2)) {
            return;
        }
        AbstractC2418Ss0.h(!file.equals(file2), "Source %s and destination %s must be different", file, file2);
        C3544fw0 c3544fw0 = new C3544fw0(file, null);
        C2580Vv0 c2580Vv0 = new C2580Vv0();
        AbstractC1903Iu0 abstractC1903Iu0T = AbstractC1903Iu0.t(new EnumC3292dw0[0]);
        C3167cw0 c3167cw0A = C3167cw0.a();
        try {
            InputStream inputStreamA = c3544fw0.a();
            c3167cw0A.c(inputStreamA);
            FileOutputStream fileOutputStreamA = AbstractC3418ew0.a(file2, abstractC1903Iu0T, c2580Vv0);
            c3167cw0A.c(fileOutputStreamA);
            int i10 = AbstractC2788Zv0.f26351a;
            byte[] bArr = new byte[8192];
            while (true) {
                int i11 = inputStreamA.read(bArr);
                if (i11 == -1) {
                    break;
                } else {
                    fileOutputStreamA.write(bArr, 0, i11);
                }
            }
            c3167cw0A.close();
            if (file.delete()) {
                return;
            }
            if (!file2.delete()) {
                throw new IOException("Unable to delete ".concat(file2.toString()));
            }
            throw new IOException("Unable to delete ".concat(file.toString()));
        } catch (Throwable th) {
            try {
                throw c3167cw0A.h(th);
            } catch (Throwable th2) {
                c3167cw0A.close();
                throw th2;
            }
        }
    }
}
