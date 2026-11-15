package p117l6;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;
import p147o6.F;

/* JADX INFO: renamed from: l6.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
class C7046g implements N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f46161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f46162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f46163c;

    C7046g(String str, String str2, byte[] bArr) {
        this.f46162b = str;
        this.f46163c = str2;
        this.f46161a = bArr;
    }

    private byte[] d() {
        if (e()) {
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                try {
                    gZIPOutputStream.write(this.f46161a);
                    gZIPOutputStream.finish();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    gZIPOutputStream.close();
                    byteArrayOutputStream.close();
                    return byteArray;
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
        } catch (IOException unused) {
            return null;
        }
    }

    private boolean e() {
        byte[] bArr = this.f46161a;
        return bArr == null || bArr.length == 0;
    }

    @Override // p117l6.N
    public F.d.b a() {
        byte[] bArrD = d();
        if (bArrD == null) {
            return null;
        }
        return F.d.b.a().b(bArrD).c(this.f46162b).a();
    }

    @Override // p117l6.N
    public String b() {
        return this.f46163c;
    }

    @Override // p117l6.N
    public InputStream c() {
        if (e()) {
            return null;
        }
        return new ByteArrayInputStream(this.f46161a);
    }
}
