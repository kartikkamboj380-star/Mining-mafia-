package q9;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.io.Closeable;
import java.io.IOException;
import java.util.Random;
import kotlin.jvm.internal.Intrinsics;
import r9.C7105h;
import r9.C7108k;
import r9.InterfaceC7106i;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f48179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC7106i f48180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Random f48181c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f48182d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f48183e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f48184f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C7105h f48185g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final C7105h f48186h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f48187i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private a f48188j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final byte[] f48189k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final C7105h.a f48190l;

    public h(boolean z9, InterfaceC7106i sink, Random random, boolean z10, boolean z11, long j10) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(random, "random");
        this.f48179a = z9;
        this.f48180b = sink;
        this.f48181c = random;
        this.f48182d = z10;
        this.f48183e = z11;
        this.f48184f = j10;
        this.f48185g = new C7105h();
        this.f48186h = sink.g();
        this.f48189k = z9 ? new byte[4] : null;
        this.f48190l = z9 ? new C7105h.a() : null;
    }

    private final void c(int i10, C7108k c7108k) throws IOException {
        if (this.f48187i) {
            throw new IOException("closed");
        }
        int iE = c7108k.E();
        if (iE > 125) {
            throw new IllegalArgumentException("Payload size must be less than or equal to 125");
        }
        this.f48186h.writeByte(i10 | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        if (this.f48179a) {
            this.f48186h.writeByte(iE | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
            Random random = this.f48181c;
            byte[] bArr = this.f48189k;
            Intrinsics.c(bArr);
            random.nextBytes(bArr);
            this.f48186h.write(this.f48189k);
            if (iE > 0) {
                long size = this.f48186h.size();
                this.f48186h.F(c7108k);
                C7105h c7105h = this.f48186h;
                C7105h.a aVar = this.f48190l;
                Intrinsics.c(aVar);
                c7105h.V0(aVar);
                this.f48190l.j(size);
                f.f48162a.b(this.f48190l, this.f48189k);
                this.f48190l.close();
            }
        } else {
            this.f48186h.writeByte(iE);
            this.f48186h.F(c7108k);
        }
        this.f48180b.flush();
    }

    public final void a(int i10, C7108k c7108k) {
        C7108k c7108kL1 = C7108k.f48468e;
        if (i10 != 0 || c7108k != null) {
            if (i10 != 0) {
                f.f48162a.c(i10);
            }
            C7105h c7105h = new C7105h();
            c7105h.writeShort(i10);
            if (c7108k != null) {
                c7105h.F(c7108k);
            }
            c7108kL1 = c7105h.l1();
        }
        try {
            c(8, c7108kL1);
        } finally {
            this.f48187i = true;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        a aVar = this.f48188j;
        if (aVar != null) {
            aVar.close();
        }
    }

    public final void h(int i10, C7108k data) throws IOException {
        Intrinsics.checkNotNullParameter(data, "data");
        if (this.f48187i) {
            throw new IOException("closed");
        }
        this.f48185g.F(data);
        int i11 = i10 | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        if (this.f48182d && data.E() >= this.f48184f) {
            a aVar = this.f48188j;
            if (aVar == null) {
                aVar = new a(this.f48183e);
                this.f48188j = aVar;
            }
            aVar.a(this.f48185g);
            i11 = i10 | 192;
        }
        long size = this.f48185g.size();
        this.f48186h.writeByte(i11);
        int i12 = this.f48179a ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT : 0;
        if (size <= 125) {
            this.f48186h.writeByte(i12 | ((int) size));
        } else if (size <= 65535) {
            this.f48186h.writeByte(i12 | 126);
            this.f48186h.writeShort((int) size);
        } else {
            this.f48186h.writeByte(i12 | 127);
            this.f48186h.y1(size);
        }
        if (this.f48179a) {
            Random random = this.f48181c;
            byte[] bArr = this.f48189k;
            Intrinsics.c(bArr);
            random.nextBytes(bArr);
            this.f48186h.write(this.f48189k);
            if (size > 0) {
                C7105h c7105h = this.f48185g;
                C7105h.a aVar2 = this.f48190l;
                Intrinsics.c(aVar2);
                c7105h.V0(aVar2);
                this.f48190l.j(0L);
                f.f48162a.b(this.f48190l, this.f48189k);
                this.f48190l.close();
            }
        }
        this.f48186h.W0(this.f48185g, size);
        this.f48180b.q();
    }

    public final void j(C7108k payload) throws IOException {
        Intrinsics.checkNotNullParameter(payload, "payload");
        c(9, payload);
    }

    public final void n(C7108k payload) throws IOException {
        Intrinsics.checkNotNullParameter(payload, "payload");
        c(10, payload);
    }
}
