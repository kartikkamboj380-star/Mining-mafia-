package p117l6;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;
import p147o6.F;

/* JADX INFO: loaded from: classes3.dex */
class I implements N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f46112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f46113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f46114c;

    I(String str, String str2, File file) {
        this.f46113b = str;
        this.f46114c = str2;
        this.f46112a = file;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0057 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private byte[] d() {
        byte[] bArr = new byte[8192];
        try {
            InputStream inputStreamC = c();
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                    if (inputStreamC == null) {
                        gZIPOutputStream.close();
                        byteArrayOutputStream.close();
                        if (inputStreamC != null) {
                            inputStreamC.close();
                        }
                        return null;
                    }
                    while (true) {
                        try {
                            int i10 = inputStreamC.read(bArr);
                            if (i10 <= 0) {
                                gZIPOutputStream.finish();
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                gZIPOutputStream.close();
                                byteArrayOutputStream.close();
                                inputStreamC.close();
                                return byteArray;
                            }
                            gZIPOutputStream.write(bArr, 0, i10);
                        } catch (Throwable th) {
                            try {
                                gZIPOutputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                        try {
                            byteArrayOutputStream.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                        throw th;
                    }
                } catch (Throwable th4) {
                    byteArrayOutputStream.close();
                    throw th4;
                }
            } catch (Throwable th5) {
                if (inputStreamC != null) {
                    try {
                        inputStreamC.close();
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                    }
                }
                throw th5;
            }
            if (inputStreamC != null) {
                inputStreamC.close();
            }
            throw th5;
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // p117l6.N
    public F.d.b a() {
        byte[] bArrD = d();
        if (bArrD != null) {
            return F.d.b.a().b(bArrD).c(this.f46113b).a();
        }
        return null;
    }

    @Override // p117l6.N
    public String b() {
        return this.f46114c;
    }

    @Override // p117l6.N
    public InputStream c() {
        if (this.f46112a.exists() && this.f46112a.isFile()) {
            try {
                return new FileInputStream(this.f46112a);
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }
}
