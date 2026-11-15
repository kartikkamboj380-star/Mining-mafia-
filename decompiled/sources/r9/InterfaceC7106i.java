package r9;

import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;

/* JADX INFO: renamed from: r9.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC7106i extends a0, WritableByteChannel {
    InterfaceC7106i F(C7108k c7108k);

    InterfaceC7106i I(String str);

    InterfaceC7106i N0(long j10);

    @Override // r9.a0, java.io.Flushable
    void flush();

    C7105h g();

    OutputStream h1();

    InterfaceC7106i k0(long j10);

    InterfaceC7106i q();

    long w0(c0 c0Var);

    InterfaceC7106i write(byte[] bArr);

    InterfaceC7106i write(byte[] bArr, int i10, int i11);

    InterfaceC7106i writeByte(int i10);

    InterfaceC7106i writeInt(int i10);

    InterfaceC7106i writeShort(int i10);

    InterfaceC7106i z();
}
