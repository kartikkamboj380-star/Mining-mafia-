package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.g9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3571g9 implements InterfaceC3697h9 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Logger f28584b = Logger.getLogger(AbstractC3571g9.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final ThreadLocal f28585a = new C3445f9(this);

    @Override // com.google.android.gms.internal.ads.InterfaceC3697h9
    public final InterfaceC4073k9 a(SP0 sp0, InterfaceC4199l9 interfaceC4199l9) throws EOFException {
        int iD1;
        long jZzb;
        long jZzc = sp0.zzc();
        ThreadLocal threadLocal = this.f28585a;
        ((ByteBuffer) threadLocal.get()).rewind().limit(8);
        do {
            iD1 = sp0.d1((ByteBuffer) threadLocal.get());
            if (iD1 == 8) {
                ((ByteBuffer) threadLocal.get()).rewind();
                long jA = AbstractC3947j9.a((ByteBuffer) threadLocal.get());
                byte[] bArr = null;
                if (jA < 8 && jA > 1) {
                    Logger logger = f28584b;
                    Level level = Level.SEVERE;
                    StringBuilder sb = new StringBuilder(80);
                    sb.append("Plausibility check failed: size < 8 (size = ");
                    sb.append(jA);
                    sb.append("). Stop parsing!");
                    logger.logp(level, "com.coremedia.iso.AbstractBoxParser", "parseBox", sb.toString());
                    return null;
                }
                byte[] bArr2 = new byte[4];
                ((ByteBuffer) threadLocal.get()).get(bArr2);
                try {
                    String str = new String(bArr2, "ISO-8859-1");
                    if (jA == 1) {
                        ThreadLocal threadLocal2 = this.f28585a;
                        ((ByteBuffer) threadLocal2.get()).limit(16);
                        sp0.d1((ByteBuffer) threadLocal2.get());
                        ((ByteBuffer) threadLocal2.get()).position(8);
                        jZzb = AbstractC3947j9.d((ByteBuffer) threadLocal2.get()) - 16;
                    } else {
                        jZzb = jA == 0 ? sp0.zzb() - sp0.zzc() : jA - 8;
                    }
                    if ("uuid".equals(str)) {
                        ThreadLocal threadLocal3 = this.f28585a;
                        ((ByteBuffer) threadLocal3.get()).limit(((ByteBuffer) threadLocal3.get()).limit() + 16);
                        sp0.d1((ByteBuffer) threadLocal3.get());
                        bArr = new byte[16];
                        for (int iPosition = ((ByteBuffer) threadLocal3.get()).position() - 16; iPosition < ((ByteBuffer) threadLocal3.get()).position(); iPosition++) {
                            bArr[iPosition - (((ByteBuffer) threadLocal3.get()).position() - 16)] = ((ByteBuffer) threadLocal3.get()).get(iPosition);
                        }
                        jZzb -= 16;
                    }
                    long j10 = jZzb;
                    InterfaceC4073k9 interfaceC4073k9B = b(str, bArr, interfaceC4199l9 instanceof InterfaceC4073k9 ? ((InterfaceC4073k9) interfaceC4199l9).zza() : "");
                    ThreadLocal threadLocal4 = this.f28585a;
                    ((ByteBuffer) threadLocal4.get()).rewind();
                    interfaceC4073k9B.a(sp0, (ByteBuffer) threadLocal4.get(), j10, this);
                    return interfaceC4073k9B;
                } catch (UnsupportedEncodingException e10) {
                    throw new RuntimeException(e10);
                }
            }
        } while (iD1 >= 0);
        sp0.f(jZzc);
        throw new EOFException();
    }

    public abstract InterfaceC4073k9 b(String str, byte[] bArr, String str2);
}
