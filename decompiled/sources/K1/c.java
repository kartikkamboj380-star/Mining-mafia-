package K1;

import com.bytedance.sdk.component.oq.kq.bob;
import com.bytedance.sdk.component.oq.kq.nze;
import com.bytedance.sdk.component.oq.kq.oq;
import com.bytedance.sdk.component.oq.kq.suf;
import com.bytedance.sdk.component.oq.kq.ubx;
import com.bytedance.sdk.component.oq.kq.vvw;
import com.bytedance.sdk.component.utils.fax;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.SocketTimeoutException;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class c implements K1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f2533a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private File f2536d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private File f2537e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f2538f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private RandomAccessFile f2543k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final com.bykv.vk.openvk.kq.kq.kq.bob.a f2544l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private volatile long f2545m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile long f2534b = -2147483648L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f2535c = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile long f2539g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile int f2540h = -100;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile boolean f2541i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private volatile boolean f2542j = false;

    class a implements bob {
        a() {
        }

        @Override // com.bytedance.sdk.component.oq.kq.bob
        public void kq(oq oqVar, IOException iOException) {
            c.this.j(30000, iOException.getMessage());
        }

        /* JADX WARN: Code duplicated, block: B:85:0x01cc A[Catch: all -> 0x01f3, TryCatch #0 {all -> 0x01f3, blocks: (B:83:0x01c7, B:85:0x01cc, B:86:0x01cf, B:88:0x01da, B:90:0x01ee), top: B:96:0x01c7 }] */
        @Override // com.bytedance.sdk.component.oq.kq.bob
        public void kq(oq oqVar, suf sufVar) {
            nze nzeVarRhi;
            if (sufVar == null) {
                c.this.j(30002, "response is empty");
                return;
            }
            InputStream inputStreamBob = null;
            try {
                try {
                    c.this.f2542j = sufVar.fou();
                    if (c.this.f2542j) {
                        nzeVarRhi = sufVar.rhi();
                        try {
                            if (c.this.f2542j && nzeVarRhi != null) {
                                c.this.f2534b = nzeVarRhi.kq() + c.this.f2538f;
                                inputStreamBob = nzeVarRhi.bob();
                            }
                            if (inputStreamBob == null) {
                                c.this.j(30003, "input_stream is empty");
                                if (inputStreamBob != null) {
                                    inputStreamBob.close();
                                }
                                if (nzeVarRhi != null) {
                                    nzeVarRhi.close();
                                }
                                sufVar.close();
                                if (!c.this.f2542j || c.this.f2536d.length() != c.this.f2534b) {
                                    return;
                                }
                            } else {
                                int iK = H1.a.k();
                                byte[] bArr = new byte[iK];
                                long j10 = c.this.f2538f;
                                long unused = c.this.f2534b;
                                long unused2 = c.this.f2538f;
                                c.this.f2544l.mxq();
                                long j11 = 0;
                                long j12 = 0;
                                int i10 = 0;
                                while (true) {
                                    int i11 = inputStreamBob.read(bArr, i10, iK - i10);
                                    if (i11 == -1) {
                                        break;
                                    }
                                    i10 += i11;
                                    j12 += (long) i11;
                                    boolean z9 = j12 % ((long) iK) == j11 || j12 == c.this.f2534b - c.this.f2538f;
                                    long unused3 = c.this.f2534b;
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(j12);
                                    sb.append(", waitingAtPost=");
                                    long unused4 = c.this.f2545m;
                                    if (z9) {
                                        synchronized (c.this.f2535c) {
                                            try {
                                                I1.b.c(c.this.f2543k, bArr, Long.valueOf(j10).intValue(), i10, c.this.f2544l.sns());
                                                if (c.this.f2533a && c.this.f2545m > -1 && c.this.f2538f + j12 >= c.this.f2545m) {
                                                    c.this.f2535c.notify();
                                                }
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                        }
                                        j10 += (long) i10;
                                        i10 = 0;
                                    }
                                    j11 = 0;
                                }
                                long unused5 = c.this.f2538f;
                                long unused6 = c.this.f2534b;
                                long unused7 = c.this.f2534b;
                                long unused8 = c.this.f2538f;
                            }
                            c.this.q();
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                c.this.j(30001, th.getMessage());
                                if (inputStreamBob != null) {
                                    inputStreamBob.close();
                                }
                                if (nzeVarRhi != null) {
                                    nzeVarRhi.close();
                                }
                                sufVar.close();
                                if (c.this.f2542j && c.this.f2536d.length() == c.this.f2534b) {
                                    c.this.q();
                                    return;
                                }
                                return;
                            } catch (Throwable th3) {
                                if (inputStreamBob != null) {
                                    try {
                                        inputStreamBob.close();
                                        if (nzeVarRhi != null) {
                                            nzeVarRhi.close();
                                        }
                                        sufVar.close();
                                        if (c.this.f2542j && c.this.f2536d.length() == c.this.f2534b) {
                                            c.this.q();
                                        }
                                    } catch (Throwable unused9) {
                                        throw th3;
                                    }
                                } else {
                                    if (nzeVarRhi != null) {
                                        nzeVarRhi.close();
                                    }
                                    sufVar.close();
                                    if (c.this.f2542j) {
                                        c.this.q();
                                    }
                                }
                                throw th3;
                            }
                        }
                    }
                    c.this.j(sufVar.bob(), sufVar.csi());
                    nzeVarRhi = null;
                    if (inputStreamBob != null) {
                        inputStreamBob.close();
                    }
                    if (nzeVarRhi != null) {
                        nzeVarRhi.close();
                    }
                    sufVar.close();
                    if (!c.this.f2542j || c.this.f2536d.length() != c.this.f2534b) {
                        return;
                    }
                    c.this.q();
                } catch (Throwable unused10) {
                }
            } catch (Throwable th4) {
                th = th4;
                nzeVarRhi = null;
            }
        }
    }

    public c(com.bykv.vk.openvk.kq.kq.kq.bob.a aVar) {
        this.f2538f = 0L;
        this.f2543k = null;
        this.f2544l = aVar;
        try {
            String strCsi = aVar.csi();
            String strSns = aVar.sns();
            this.f2536d = I1.b.d(strCsi, strSns);
            this.f2537e = I1.b.a(strCsi, strSns);
            if (g()) {
                this.f2543k = new RandomAccessFile(this.f2537e, AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ);
            } else {
                this.f2543k = new RandomAccessFile(this.f2536d, "rw");
            }
            if (!g()) {
                this.f2538f = this.f2536d.length();
                i();
            }
            this.f2533a = H1.a.j() == 2;
        } catch (Throwable unused) {
            aVar.mxq();
        }
    }

    private long c() {
        return g() ? this.f2537e.length() : this.f2536d.length();
    }

    private boolean g() {
        return this.f2537e.exists();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(int i10, String str) {
        JSONObject jSONObjectBob;
        this.f2542j = false;
        this.f2540h = i10;
        this.f2534b = this.f2539g;
        fax.oq("CSJ_MediaDLPlay", "handleFailResponse: ", Integer.valueOf(i10), " ", str);
        com.bykv.vk.openvk.kq.kq.kq.bob.a aVar = this.f2544l;
        if (aVar == null || !aVar.kq() || (jSONObjectBob = this.f2544l.bob()) == null) {
            return;
        }
        try {
            jSONObjectBob.put("error_real_code", i10);
            jSONObjectBob.put("error_real_msg", str);
        } catch (Throwable th) {
            fax.kq("CSJ_MediaDLPlay", "handleFailResponse: ", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        synchronized (this.f2535c) {
            if (g()) {
                this.f2544l.mxq();
                this.f2544l.sns();
                return;
            }
            try {
                if (!this.f2536d.renameTo(this.f2537e)) {
                    throw new IOException("Error renaming file " + this.f2536d + " to " + this.f2537e + " for completion!");
                }
                RandomAccessFile randomAccessFile = this.f2543k;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.f2543k = new RandomAccessFile(this.f2537e, "rw");
                this.f2544l.sns();
                this.f2544l.mxq();
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }

    @Override // K1.a
    public int a(long j10, byte[] bArr, int i10, int i11) throws IOException {
        try {
            if (j10 == this.f2534b) {
                return -1;
            }
            int i12 = 0;
            int i13 = 0;
            while (!this.f2541i) {
                synchronized (this.f2535c) {
                    try {
                        if (j10 < c()) {
                            this.f2543k.seek(j10);
                            i13 = this.f2543k.read(bArr, i10, i11);
                        } else {
                            i12 += 33;
                            this.f2545m = j10;
                            this.f2535c.wait(33L);
                            this.f2545m = -1L;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i13 > 0) {
                    return i13;
                }
                com.bykv.vk.openvk.kq.kq.kq.bob.a aVar = this.f2544l;
                if (aVar != null && aVar.kq() && this.f2540h != -100 && (!this.f2542j || this.f2534b == this.f2539g)) {
                    throw new IOException();
                }
                if (i12 >= 20000) {
                    throw new SocketTimeoutException();
                }
            }
            return -1;
        } catch (Throwable th2) {
            if (th2 instanceof IOException) {
                throw th2;
            }
            throw new IOException();
        }
    }

    @Override // K1.a
    public long bob() {
        if (g()) {
            this.f2534b = this.f2537e.length();
        } else {
            synchronized (this.f2535c) {
                int i10 = 0;
                while (this.f2534b == -2147483648L && !this.f2541i) {
                    try {
                        i10 += 15;
                        try {
                            this.f2535c.wait(5L);
                            if (i10 > 20000) {
                                return -1L;
                            }
                        } catch (InterruptedException unused) {
                            throw new IOException("total length InterruptException");
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        return this.f2534b;
    }

    public void i() {
        ubx.kq kqVarOq = A1.a.c() != null ? A1.a.c().oq() : new ubx.kq("v_cache");
        long jGm = this.f2544l.gm();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        kqVarOq.kq(jGm, timeUnit).oq(this.f2544l.fax(), timeUnit).bob(this.f2544l.mq(), timeUnit);
        ubx ubxVarKq = kqVarOq.kq();
        this.f2544l.sns();
        ubxVarKq.kq(new vvw.kq().kq("RANGE", "bytes=" + this.f2538f + "-").oq(this.f2544l.mxq()).kq().kq("videoLoadWhenPlaying").kq(9).oq()).kq(new a());
    }

    @Override // K1.a
    public void oq() {
        try {
            if (!this.f2541i) {
                this.f2543k.close();
            }
            File file = this.f2536d;
            if (file != null) {
                file.setLastModified(System.currentTimeMillis());
            }
            File file2 = this.f2537e;
            if (file2 != null) {
                file2.setLastModified(System.currentTimeMillis());
            }
        } catch (Throwable unused) {
        }
        this.f2541i = true;
    }
}
