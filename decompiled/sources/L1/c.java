package L1;

import android.content.Context;
import com.bytedance.sdk.component.oq.kq.bob;
import com.bytedance.sdk.component.oq.kq.nze;
import com.bytedance.sdk.component.oq.kq.oq;
import com.bytedance.sdk.component.oq.kq.suf;
import com.bytedance.sdk.component.oq.kq.ubx;
import com.bytedance.sdk.component.oq.kq.vvw;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f3053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.bykv.vk.openvk.kq.kq.kq.bob.a f3054b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private File f3056d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private File f3057e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile boolean f3055c = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f3058f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile boolean f3059g = false;

    public c(Context context, com.bykv.vk.openvk.kq.kq.kq.bob.a aVar) {
        this.f3056d = null;
        this.f3057e = null;
        this.f3053a = context;
        this.f3054b = aVar;
        this.f3056d = I1.b.d(aVar.csi(), aVar.sns());
        this.f3057e = I1.b.a(aVar.csi(), aVar.sns());
    }

    private void a() {
        ubx.kq kqVarOq = A1.a.c() != null ? A1.a.c().oq() : new ubx.kq("v_preload");
        long jGm = this.f3054b.gm();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        kqVarOq.kq(jGm, timeUnit).oq(this.f3054b.fax(), timeUnit).bob(this.f3054b.mq(), timeUnit);
        ubx ubxVarKq = kqVarOq.kq();
        vvw.kq kqVar = new vvw.kq();
        long length = this.f3056d.length();
        int iRhi = this.f3054b.rhi();
        boolean zWki = this.f3054b.wki();
        int iFou = this.f3054b.fou();
        if (iFou > 0) {
            if (iFou >= this.f3054b.vvw()) {
                zWki = true;
            } else {
                iRhi = iFou;
            }
        }
        kqVar.kq("videoPreload").kq(6);
        if (zWki) {
            kqVar.kq("RANGE", "bytes=" + length + "-").oq(this.f3054b.mxq()).kq().oq();
        } else {
            kqVar.kq("RANGE", "bytes=" + length + "-" + iRhi).oq(this.f3054b.mxq()).kq().oq();
        }
        ubxVarKq.kq(kqVar.oq()).kq(new a(length));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        try {
            if (this.f3056d.renameTo(this.f3057e)) {
                return;
            }
            throw new IOException("Error renaming file " + this.f3056d + " to " + this.f3057e + " for completion!");
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        try {
            this.f3057e.delete();
            this.f3056d.delete();
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(com.bykv.vk.openvk.kq.kq.kq.bob.a aVar, int i10) {
        synchronized (B1.a.InterfaceC0008a.class) {
            try {
                for (B1.a.InterfaceC0008a interfaceC0008a : this.f3058f) {
                    if (interfaceC0008a != null) {
                        interfaceC0008a.kq(aVar, i10);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(com.bykv.vk.openvk.kq.kq.kq.bob.a aVar, int i10, String str) {
        synchronized (B1.a.InterfaceC0008a.class) {
            try {
                for (B1.a.InterfaceC0008a interfaceC0008a : this.f3058f) {
                    if (interfaceC0008a != null) {
                        interfaceC0008a.kq(aVar, i10, str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s(com.bykv.vk.openvk.kq.kq.kq.bob.a aVar, int i10) {
        synchronized (B1.a.InterfaceC0008a.class) {
            try {
                for (B1.a.InterfaceC0008a interfaceC0008a : this.f3058f) {
                    if (interfaceC0008a != null) {
                        interfaceC0008a.oq(aVar, i10);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private boolean t() {
        if (this.f3057e.exists()) {
            return true;
        }
        if (!this.f3054b.wki()) {
            if (this.f3056d.length() >= this.f3054b.rhi()) {
                return true;
            }
            if (this.f3054b.fou() > 0 && this.f3056d.length() >= this.f3054b.fou()) {
                return true;
            }
        }
        return false;
    }

    public com.bykv.vk.openvk.kq.kq.kq.bob.a g() {
        return this.f3054b;
    }

    public void i(B1.a.InterfaceC0008a interfaceC0008a) {
        if (this.f3059g) {
            synchronized (B1.a.InterfaceC0008a.class) {
                this.f3058f.add(interfaceC0008a);
            }
            return;
        }
        this.f3058f.add(interfaceC0008a);
        if (t()) {
            this.f3054b.syt(1);
            m(this.f3054b, TTAdConstant.MATE_VALID);
            L1.a.b(this.f3054b);
        } else {
            this.f3059g = true;
            this.f3054b.syt(0);
            a();
        }
    }

    public void p(boolean z9) {
        this.f3055c = z9;
    }

    class a implements bob {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f3060a;

        a(long j10) {
            this.f3060a = j10;
        }

        @Override // com.bytedance.sdk.component.oq.kq.bob
        public void kq(oq oqVar, IOException iOException) {
            c cVar = c.this;
            cVar.n(cVar.f3054b, 601, iOException.getMessage());
            L1.a.b(c.this.f3054b);
        }

        @Override // com.bytedance.sdk.component.oq.kq.bob
        public void kq(oq oqVar, suf sufVar) {
            InputStream inputStreamBob;
            RandomAccessFile randomAccessFile;
            nze nzeVarRhi;
            long jKq;
            long j10 = this.f3060a;
            nze nzeVar = null;
            nzeVar = null;
            randomAccessFile = null;
            randomAccessFile = null;
            RandomAccessFile randomAccessFile2 = null;
            try {
                if (sufVar != null) {
                    boolean zFou = sufVar.fou();
                    if (!zFou) {
                        c cVar = c.this;
                        cVar.n(cVar.f3054b, sufVar.bob(), sufVar.csi());
                        c.this.o(null);
                        c.this.o(null);
                        c.this.o(nzeVar);
                    }
                    nzeVarRhi = sufVar.rhi();
                    try {
                        nzeVarRhi = sufVar.rhi();
                        if (!zFou || nzeVarRhi == null) {
                            inputStreamBob = null;
                            jKq = 0;
                        } else {
                            jKq = this.f3060a + nzeVarRhi.kq();
                            inputStreamBob = nzeVarRhi.bob();
                        }
                        try {
                            if (inputStreamBob == null) {
                                c cVar2 = c.this;
                                cVar2.n(cVar2.f3054b, sufVar.bob(), sufVar.csi());
                            } else {
                                randomAccessFile = new RandomAccessFile(c.this.f3056d, "rw");
                                try {
                                    int iK = H1.a.k();
                                    byte[] bArr = new byte[iK];
                                    int i10 = 0;
                                    long j11 = 0;
                                    while (true) {
                                        int i11 = inputStreamBob.read(bArr, i10, iK - i10);
                                        if (i11 != -1) {
                                            if (c.this.f3055c) {
                                                c cVar3 = c.this;
                                                cVar3.s(cVar3.f3054b, sufVar.bob());
                                                c.this.o(randomAccessFile);
                                            } else {
                                                i10 += i11;
                                                j11 += (long) i11;
                                                if (j11 % ((long) iK) == 0 || j11 == jKq - this.f3060a) {
                                                    I1.b.c(randomAccessFile, bArr, Long.valueOf(j10).intValue(), i10, c.this.f3054b.sns());
                                                    j10 += (long) i10;
                                                    i10 = 0;
                                                }
                                            }
                                        } else {
                                            if (c.this.f3054b.wki() && jKq == c.this.f3056d.length()) {
                                                c.this.c();
                                            }
                                            c cVar4 = c.this;
                                            cVar4.m(cVar4.f3054b, sufVar.bob());
                                            randomAccessFile2 = randomAccessFile;
                                        }
                                        c.this.o(inputStreamBob);
                                        c.this.o(nzeVarRhi);
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    nzeVar = nzeVarRhi;
                                    try {
                                        c.this.e();
                                        c cVar5 = c.this;
                                        cVar5.n(cVar5.f3054b, sufVar != null ? sufVar.bob() : 601, th.getMessage());
                                        c.this.o(randomAccessFile);
                                        c.this.o(inputStreamBob);
                                        c.this.o(nzeVar);
                                    } finally {
                                        c.this.o(randomAccessFile);
                                        c.this.o(inputStreamBob);
                                        c.this.o(nzeVar);
                                        c.this.o(sufVar);
                                        c.this.f3054b.mxq();
                                        c.this.f3054b.rhi();
                                        L1.a.b(c.this.f3054b);
                                    }
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            randomAccessFile = randomAccessFile2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        inputStreamBob = null;
                        randomAccessFile = null;
                    }
                } else {
                    c cVar6 = c.this;
                    cVar6.n(cVar6.f3054b, 601, "Network link failed.");
                    nzeVarRhi = null;
                    inputStreamBob = null;
                }
                c.this.o(randomAccessFile2);
                c.this.o(inputStreamBob);
                c.this.o(nzeVarRhi);
            } catch (Throwable th4) {
                th = th4;
                inputStreamBob = null;
                randomAccessFile = null;
            }
        }
    }
}
