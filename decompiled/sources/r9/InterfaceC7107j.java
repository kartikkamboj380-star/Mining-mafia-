package r9;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: r9.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC7107j extends c0, ReadableByteChannel {
    String A(long j10);

    String L0(Charset charset);

    void O(C7105h c7105h, long j10);

    boolean P(long j10);

    String U();

    int U0();

    String Y0();

    byte[] Z(long j10);

    short b0();

    int c0(P p10);

    long d0();

    C7105h g();

    void i0(long j10);

    long j1();

    InputStream k1();

    boolean m0(long j10, C7108k c7108k);

    String o0(long j10);

    InterfaceC7107j peek();

    C7108k q0(long j10);

    byte readByte();

    void readFully(byte[] bArr);

    int readInt();

    long readLong();

    short readShort();

    long s0(a0 a0Var);

    void skip(long j10);

    byte[] u0();

    boolean x0();

    long y(byte b10, long j10, long j11);

    long z0();
}
