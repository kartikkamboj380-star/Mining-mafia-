package com.bykv.vk.openvk.kq.kq.oq.bob;

import android.graphics.SurfaceTexture;
import android.media.PlaybackParams;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bytedance.sdk.component.syt.kq.kq;
import com.bytedance.sdk.component.utils.fax;
import com.bytedance.sdk.component.utils.rs;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.android.gms.common.api.Api;
import com.unity3d.services.UnityAdsConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements A1.b, com.bykv.vk.openvk.kq.kq.oq.bob.a.InterfaceC0216a, com.bykv.vk.openvk.kq.kq.oq.bob.a.b, com.bykv.vk.openvk.kq.kq.oq.bob.a.c, com.bykv.vk.openvk.kq.kq.oq.bob.a.d, com.bykv.vk.openvk.kq.kq.oq.bob.a.e, com.bykv.vk.openvk.kq.kq.oq.bob.a.f, com.bykv.vk.openvk.kq.kq.oq.bob.a.g, rs.kq {
    private static final SparseIntArray kq = new SparseIntArray();
    private SurfaceTexture csi;
    private boolean ibd;
    private rs mxq;
    private ArrayList<Runnable> nb;
    private SurfaceHolder rhi;
    private volatile boolean tvh;
    private boolean uml;
    private boolean vvw;
    private boolean wee;
    private boolean wki;
    private volatile boolean xn;
    private final boolean oq = false;
    private final List<WeakReference<A1.b.a>> bob = new CopyOnWriteArrayList();
    private final o fou = new o();
    private int rjo = 0;
    private int syt = 3;
    private boolean dgq = false;
    private volatile com.bykv.vk.openvk.kq.kq.oq.bob.a nn = null;
    private boolean ubx = false;
    private volatile int suf = 201;
    private long nze = -1;
    private boolean sns = false;
    private long wcx = 0;
    private long gm = Long.MIN_VALUE;
    private long fax = 0;
    private long mq = 0;
    private long jhe = 0;
    private int ou = 0;
    private String ebt = "0";
    private com.bykv.vk.openvk.kq.kq.kq.bob.a rs = null;
    private boolean ha = false;
    private CountDownLatch fgm = new CountDownLatch(1);
    private volatile int zfx = TTAdConstant.MATE_VALID;
    private AtomicBoolean ktb = new AtomicBoolean(false);
    private Surface wf = null;
    private long nz = 0;
    private long yyl = 0;
    private boolean wol = false;
    private final Runnable bss = new f();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.nn == null) {
                try {
                    b.this.nn = new com.bykv.vk.openvk.kq.kq.oq.bob.e();
                } catch (Throwable th) {
                    th.getMessage();
                }
                if (b.this.nn == null) {
                    return;
                }
                com.bykv.vk.openvk.kq.kq.oq.bob.a unused = b.this.nn;
                b.this.ebt = "0";
                b.this.nn.b(b.this);
                b.this.nn.j(b.this);
                b.this.nn.d(b.this);
                b.this.nn.a(b.this);
                b.this.nn.h(b.this);
                b.this.nn.g(b.this);
                b.this.nn.f(b.this);
                try {
                    b.this.nn.c(false);
                } catch (Throwable unused2) {
                }
                b.this.ubx = false;
            }
        }
    }

    /* JADX INFO: renamed from: com.bykv.vk.openvk.kq.kq.oq.bob.b$b, reason: collision with other inner class name */
    class RunnableC0217b implements Runnable {
        RunnableC0217b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!b.this.rjo() || b.this.nn == null) {
                return;
            }
            try {
                b.this.nn.rhi();
                for (WeakReference weakReference : b.this.bob) {
                    if (weakReference != null && weakReference.get() != null) {
                        ((A1.b.a) weakReference.get()).csi(b.this);
                    }
                }
                b.this.suf = 206;
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.mxq != null) {
                b.this.mxq.sendEmptyMessage(101);
            }
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.mxq != null) {
                b.this.mxq.sendEmptyMessage(101);
            }
        }
    }

    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.mxq != null) {
                b.this.mxq.sendEmptyMessage(104);
            }
        }
    }

    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.nn == null) {
                return;
            }
            long jWcx = b.this.wcx();
            if (jWcx > 0 && b.this.rhi() && b.this.gm != Long.MIN_VALUE) {
                try {
                    if (b.this.gm == jWcx) {
                        if (!b.this.sns && b.this.fax >= 400) {
                            b.this.o(701, 800);
                            b.this.sns = true;
                        }
                        b.this.fax += (long) b.this.zfx;
                    } else {
                        if (b.this.sns) {
                            b.this.wcx += b.this.fax;
                            b.this.o(702, 800);
                            long unused = b.this.wcx;
                            int unused2 = b.this.rjo;
                        }
                        b.this.fax = 0L;
                        b.this.sns = false;
                    }
                } catch (Throwable th) {
                    th.getMessage();
                }
            }
            if (b.this.sns() > 0) {
                if (b.this.gm != jWcx) {
                    if (A1.a.b()) {
                        long unused3 = b.this.gm;
                    }
                    b bVar = b.this;
                    bVar.g(jWcx, bVar.sns());
                }
                b.this.gm = jWcx;
            }
            if (b.this.oq()) {
                b bVar2 = b.this;
                bVar2.g(bVar2.sns(), b.this.sns());
            } else if (b.this.mxq != null) {
                b.this.mxq.postDelayed(this, b.this.zfx);
            }
        }
    }

    class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f13363a;

        g(long j10) {
            this.f13363a = j10;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.mxq != null) {
                b.this.mxq.obtainMessage(106, Long.valueOf(this.f13363a)).sendToTarget();
            }
        }
    }

    class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ SurfaceTexture f13365a;

        h(SurfaceTexture surfaceTexture) {
            this.f13365a = surfaceTexture;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.f();
            if (b.this.mxq != null) {
                b.this.mxq.obtainMessage(111, this.f13365a).sendToTarget();
            }
        }
    }

    class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ SurfaceHolder f13367a;

        i(SurfaceHolder surfaceHolder) {
            this.f13367a = surfaceHolder;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.f();
            if (b.this.mxq != null) {
                b.this.mxq.obtainMessage(110, this.f13367a).sendToTarget();
            }
        }
    }

    class j implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.bykv.vk.openvk.kq.kq.kq.bob.a f13369a;

        j(com.bykv.vk.openvk.kq.kq.kq.bob.a aVar) {
            this.f13369a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.f();
            if (b.this.mxq != null) {
                b.this.mxq.obtainMessage(107, this.f13369a).sendToTarget();
            }
        }
    }

    class k implements Runnable {
        k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.mxq == null || b.this.mxq.getLooper() == null) {
                return;
            }
            try {
                kq.kq().kq(b.this.mxq);
                b.this.mxq = null;
            } catch (Throwable unused) {
            }
        }
    }

    class l implements Runnable {
        l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                b.this.nn.syt();
                b.this.suf = 207;
                b.this.xn = false;
            } catch (Throwable unused) {
            }
        }
    }

    class m implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f13373a;

        m(boolean z9) {
            this.f13373a = z9;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.syt() || b.this.nn == null) {
                return;
            }
            try {
                b.this.ha = this.f13373a;
                b.this.nn.fou(this.f13373a);
            } catch (Throwable unused) {
            }
        }
    }

    class n implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f13375a;

        n(boolean z9) {
            this.f13375a = z9;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.nn != null) {
                b.this.nn.kq(this.f13375a);
            }
        }
    }

    class o implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f13377a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f13378b;

        o() {
        }

        public void a(long j10) {
            this.f13377a = j10;
        }

        public void b(boolean z9) {
            this.f13378b = z9;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.nn != null) {
                try {
                    if (!this.f13378b) {
                        long jNn = b.this.nn.nn();
                        b.this.nze = Math.max(this.f13377a, jNn);
                    }
                    long unused = b.this.nze;
                } catch (Throwable th) {
                    th.toString();
                }
            }
            if (b.this.mxq != null) {
                b.this.mxq.sendEmptyMessageDelayed(100, 0L);
            }
        }
    }

    public b() {
        k("SSMediaPlayerWrapper");
    }

    private void a(com.bykv.vk.openvk.kq.kq.kq.bob.a aVar) {
        aVar.mxq();
        this.nn.kq(aVar);
        aVar.mxq();
    }

    private void b() {
        SparseIntArray sparseIntArray = kq;
        sparseIntArray.put(this.ou, sparseIntArray.get(this.ou) + 1);
    }

    private void c() {
        ArrayList<Runnable> arrayList = this.nb;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        d();
    }

    private void d() {
        if (this.vvw) {
            return;
        }
        this.vvw = true;
        ArrayList arrayList = new ArrayList(this.nb);
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((Runnable) obj).run();
        }
        this.nb.clear();
        this.vvw = false;
    }

    private void e() {
        this.tvh = true;
        this.dgq = true;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.jhe;
        for (WeakReference<A1.b.a> weakReference : this.bob) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().kq(this, jElapsedRealtime);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        rs rsVar = this.mxq;
        if (rsVar != null) {
            rsVar.post(new a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(long j10, long j11) {
        long j12;
        long j13;
        if (!this.tvh) {
            e();
        }
        for (WeakReference<A1.b.a> weakReference : this.bob) {
            if (weakReference == null || weakReference.get() == null) {
                j12 = j10;
                j13 = j11;
            } else {
                j12 = j10;
                j13 = j11;
                weakReference.get().kq(this, j12, j13);
            }
            j10 = j12;
            j11 = j13;
        }
    }

    private void h(com.bykv.vk.openvk.kq.kq.kq.bob.a aVar, File file) {
        if (aVar.kq()) {
            q(aVar, file);
        } else {
            i(file);
        }
    }

    private void i(File file) {
        file.getAbsolutePath();
        try {
            if (A1.a.a()) {
                s(file.getAbsolutePath());
            } else {
                this.nn.kq(file.getAbsolutePath());
            }
        } catch (Throwable unused) {
        }
    }

    private void j(Runnable runnable) {
        try {
            if (this.nb == null) {
                this.nb = new ArrayList<>();
            }
            this.nb.add(runnable);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    private void k(String str) {
        this.ou = 0;
        this.mxq = kq.kq().kq(this, "csj_".concat(String.valueOf(str)));
        this.wol = true;
        f();
    }

    private boolean l(int i10, int i11) {
        boolean z9 = i10 == -1010 || i10 == -1007 || i10 == -1004 || i10 == -110 || i10 == 100 || i10 == 200;
        if (i11 == 1 || i11 == 700 || i11 == 800) {
            return true;
        }
        return z9;
    }

    private void m() {
        this.wcx = 0L;
        this.rjo = 0;
        this.fax = 0L;
        this.sns = false;
        this.gm = Long.MIN_VALUE;
    }

    private void n() {
        if (this.nn == null) {
            return;
        }
        try {
            this.nn.wki();
        } catch (Throwable unused) {
        }
        this.nn.j(null);
        this.nn.f(null);
        this.nn.a(null);
        this.nn.g(null);
        this.nn.d(null);
        this.nn.b(null);
        this.nn.h(null);
        try {
            this.nn.vvw();
        } catch (Throwable unused2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(int i10, int i11) {
        if (i10 == 701) {
            this.nz = SystemClock.elapsedRealtime();
            this.rjo++;
            for (WeakReference<A1.b.a> weakReference : this.bob) {
                if (weakReference != null && weakReference.get() != null) {
                    weakReference.get().kq(this, Api.BaseClientBuilder.API_PRIORITY_OTHER, 0, 0);
                }
            }
            return;
        }
        if (i10 == 702) {
            if (this.nz > 0) {
                this.yyl += SystemClock.elapsedRealtime() - this.nz;
                this.nz = 0L;
            }
            for (WeakReference<A1.b.a> weakReference2 : this.bob) {
                if (weakReference2 != null && weakReference2.get() != null) {
                    weakReference2.get().kq((A1.b) this, Api.BaseClientBuilder.API_PRIORITY_OTHER);
                }
            }
            return;
        }
        if (this.wol && i10 == 3) {
            c();
            e();
            oq(this.ha);
        } else if (i10 == 805) {
            this.wee = true;
        }
    }

    private void p(long j10) {
        this.fou.a(j10);
        if (this.ibd) {
            r(this.fou);
        } else if (t(this.rs)) {
            r(this.fou);
        } else {
            j(this.fou);
        }
    }

    private void q(com.bykv.vk.openvk.kq.kq.kq.bob.a aVar, File file) {
        try {
            String strA = G1.d.a(file);
            if (aVar.sns().equals(strA)) {
                i(file);
                return;
            }
            JSONObject jSONObjectBob = aVar.bob();
            boolean zOq = aVar.oq();
            if (jSONObjectBob != null) {
                jSONObjectBob.put("file_hash", aVar.sns());
                jSONObjectBob.put("file_real_hash", strA);
                jSONObjectBob.put("is_change_play_type", zOq ? 1 : 0);
                jSONObjectBob.put("error_real_code", 309);
                jSONObjectBob.put("error_real_msg", "md5_not_match");
            }
            if (zOq) {
                boolean zDelete = file.delete();
                if (jSONObjectBob != null) {
                    jSONObjectBob.put("delete_cache_file", zDelete ? 1 : 0);
                }
                if (zDelete) {
                    a(aVar);
                    return;
                }
            }
            i(file);
        } catch (Throwable unused) {
        }
    }

    private void r(Runnable runnable) {
        if (runnable == null || syt()) {
            return;
        }
        if (this.wki) {
            j(runnable);
        } else {
            runnable.run();
        }
    }

    private void s(String str) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(str);
        this.nn.e(fileInputStream.getFD());
        fileInputStream.close();
    }

    private boolean t(com.bykv.vk.openvk.kq.kq.kq.bob.a aVar) {
        return aVar != null && aVar.rjo();
    }

    private void u() {
        rs rsVar = this.mxq;
        if (rsVar == null || rsVar.getLooper() == null) {
            return;
        }
        try {
            this.mxq.post(new k());
        } catch (Throwable unused) {
        }
    }

    private void v() {
        rs rsVar = this.mxq;
        if (rsVar != null) {
            rsVar.post(new l());
        }
    }

    private void w() {
        r(new e());
    }

    private void x() {
        ArrayList<Runnable> arrayList = this.nb;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        this.nb.clear();
    }

    public SurfaceTexture fax() {
        return this.csi;
    }

    public SurfaceHolder gm() {
        return this.rhi;
    }

    public int mxq() {
        return this.rjo;
    }

    public long nze() {
        if (this.sns) {
            long j10 = this.fax;
            if (j10 > 0) {
                return this.wcx + j10;
            }
        }
        return this.wcx;
    }

    public long sns() {
        long j10 = this.mq;
        if (j10 != 0) {
            return j10;
        }
        if (this.suf == 206 || this.suf == 207) {
            try {
                this.mq = this.nn.ubx();
            } catch (Throwable unused) {
            }
        }
        return this.mq;
    }

    public boolean suf() {
        return this.wee;
    }

    public void vvw() {
        if (syt()) {
            return;
        }
        this.wki = true;
        x();
        rs rsVar = this.mxq;
        if (rsVar != null) {
            try {
                rsVar.removeCallbacksAndMessages(null);
                if (this.nn != null) {
                    this.mxq.sendEmptyMessage(103);
                }
                u();
            } catch (Throwable unused) {
                u();
            }
        }
    }

    public long wcx() {
        if (syt()) {
            return 0L;
        }
        if (this.suf == 206 || this.suf == 207) {
            try {
                return this.nn.nn();
            } catch (Throwable unused) {
            }
        }
        return 0L;
    }

    public boolean wki() {
        return this.suf == 205;
    }

    @Override // A1.b
    public int csi() {
        if (this.nn == null || syt()) {
            return 0;
        }
        return this.nn.nze();
    }

    public void dgq() {
        if (syt() || this.nn == null) {
            return;
        }
        this.ktb.set(true);
        if (this.suf != 206) {
            m();
            this.xn = false;
            this.fou.b(true);
            p(0L);
            rs rsVar = this.mxq;
            if (rsVar != null) {
                rsVar.removeCallbacks(this.bss);
                this.mxq.postDelayed(this.bss, this.zfx);
            }
        }
        this.fgm.countDown();
    }

    public void nn() {
        if (syt() || this.mxq == null) {
            return;
        }
        this.ktb.set(true);
        this.mxq.post(new RunnableC0217b());
    }

    @Override // A1.b
    public boolean rhi() {
        rs rsVar;
        return (this.suf == 206 || ((rsVar = this.mxq) != null && rsVar.hasMessages(100))) && !this.xn;
    }

    @Override // A1.b
    public boolean rjo() {
        rs rsVar;
        return ((this.suf != 207 && !this.xn) || (rsVar = this.mxq) == null || rsVar.hasMessages(100)) ? false : true;
    }

    @Override // A1.b
    public boolean syt() {
        return this.wki;
    }

    public void ubx() {
        rs rsVar;
        if (syt() || (rsVar = this.mxq) == null) {
            return;
        }
        rsVar.removeMessages(100);
        this.xn = true;
        if (this.wol) {
            if (!this.dgq && !t(this.rs)) {
                j(new d());
                return;
            }
            rs rsVar2 = this.mxq;
            if (rsVar2 != null) {
                rsVar2.sendEmptyMessage(101);
                return;
            }
            return;
        }
        if (!this.uml && !t(this.rs)) {
            j(new c());
            return;
        }
        rs rsVar3 = this.mxq;
        if (rsVar3 != null) {
            rsVar3.sendEmptyMessage(101);
        }
    }

    @Override // A1.b
    public boolean bob() {
        return wki() || rhi() || rjo();
    }

    @Override // A1.b
    public int fou() {
        if (this.nn == null || syt()) {
            return 0;
        }
        return this.nn.suf();
    }

    @Override // A1.b
    public boolean oq() {
        return this.suf == 209;
    }

    @Override // com.bykv.vk.openvk.kq.kq.oq.bob.a.f
    public void bob(com.bykv.vk.openvk.kq.kq.oq.bob.a aVar) {
        for (WeakReference<A1.b.a> weakReference : this.bob) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().kq((A1.b) this, true);
            }
        }
    }

    @Override // com.bykv.vk.openvk.kq.kq.oq.bob.a.c
    public boolean oq(com.bykv.vk.openvk.kq.kq.oq.bob.a aVar, int i10, int i11) {
        if (this.nn != aVar) {
            return false;
        }
        if (i11 == -1004) {
            com.bykv.vk.openvk.kq.kq.kq.bob.b bVar = new com.bykv.vk.openvk.kq.kq.kq.bob.b(i10, i11);
            for (WeakReference<A1.b.a> weakReference : this.bob) {
                if (weakReference != null && weakReference.get() != null) {
                    weakReference.get().kq(this, bVar);
                }
            }
        }
        o(i10, i11);
        return false;
    }

    public void kq(boolean z9) {
        if (syt()) {
            return;
        }
        this.ibd = z9;
        if (this.nn != null) {
            this.nn.kq(z9);
            return;
        }
        rs rsVar = this.mxq;
        if (rsVar != null) {
            rsVar.post(new n(z9));
        }
    }

    @Override // com.bykv.vk.openvk.kq.kq.oq.bob.a.b
    public void oq(com.bykv.vk.openvk.kq.kq.oq.bob.a aVar) {
        if (syt()) {
            return;
        }
        this.suf = 205;
        try {
            com.bykv.vk.openvk.kq.kq.kq.bob.a aVar2 = this.rs;
            if (aVar2 != null) {
                float fNze = aVar2.nze();
                if (fNze > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    A1.c cVar = new A1.c();
                    cVar.b(fNze);
                    this.nn.i(cVar);
                }
            }
        } catch (Throwable unused) {
        }
        if (this.mxq != null) {
            if (this.xn) {
                v();
            } else {
                rs rsVar = this.mxq;
                rsVar.sendMessage(rsVar.obtainMessage(100, -1, -1));
            }
        }
        kq.delete(this.ou);
        boolean z9 = this.wol;
        boolean z10 = this.uml;
        if (!z9 && !z10) {
            e();
            this.uml = true;
        }
        for (WeakReference<A1.b.a> weakReference : this.bob) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().oq(this);
            }
        }
    }

    public void kq(boolean z9, long j10, boolean z10) {
        if (syt()) {
            return;
        }
        f();
        this.ha = z10;
        this.ktb.set(true);
        this.xn = false;
        oq(z10);
        if (z9) {
            this.nze = j10;
            w();
        } else {
            p(j10);
        }
        rs rsVar = this.mxq;
        if (rsVar != null) {
            rsVar.removeCallbacks(this.bss);
            this.mxq.postDelayed(this.bss, this.zfx);
        }
        this.fgm.countDown();
    }

    public void kq(long j10) {
        if (syt()) {
            return;
        }
        if (this.suf == 207 || this.suf == 206 || this.suf == 209) {
            r(new g(j10));
        }
    }

    public void oq(boolean z9) {
        rs rsVar;
        if (syt() || (rsVar = this.mxq) == null) {
            return;
        }
        rsVar.post(new m(z9));
    }

    @Override // A1.b
    public boolean kq() {
        return this.dgq;
    }

    public void oq(int i10) {
        this.syt = i10;
    }

    public void kq(SurfaceTexture surfaceTexture) {
        if (syt()) {
            return;
        }
        this.csi = surfaceTexture;
        kq(true);
        r(new h(surfaceTexture));
    }

    public void kq(SurfaceHolder surfaceHolder) {
        if (syt()) {
            return;
        }
        this.rhi = surfaceHolder;
        kq(true);
        r(new i(surfaceHolder));
    }

    public void kq(com.bykv.vk.openvk.kq.kq.kq.bob.a aVar) {
        if (syt()) {
            return;
        }
        this.rs = aVar;
        if (aVar != null) {
            this.wol = this.wol && !aVar.rjo();
        }
        r(new j(aVar));
    }

    @Override // com.bytedance.sdk.component.utils.rs.kq
    public void kq(Message message) {
        int i10 = this.suf;
        int i11 = message.what;
        if (this.nn != null) {
            try {
                switch (message.what) {
                    case 100:
                        if (this.suf == 205 || this.suf == 207 || this.suf == 209) {
                            this.nn.rhi();
                            this.jhe = SystemClock.elapsedRealtime();
                            this.suf = 206;
                            if (this.nze > 0) {
                                this.nn.kq(this.nze, this.syt);
                                this.nze = -1L;
                            }
                            if (this.rs != null) {
                                oq(this.ha);
                                return;
                            }
                            return;
                        }
                        break;
                    case 101:
                        if (this.sns) {
                            this.wcx += this.fax;
                        }
                        this.sns = false;
                        this.fax = 0L;
                        this.gm = Long.MIN_VALUE;
                        if (this.suf == 206 || this.suf == 207 || this.suf == 209) {
                            this.nn.syt();
                            this.suf = 207;
                            this.xn = false;
                            for (WeakReference<A1.b.a> weakReference : this.bob) {
                                if (weakReference != null && weakReference.get() != null) {
                                    weakReference.get().fou(this);
                                }
                            }
                            return;
                        }
                        break;
                    case 102:
                        this.nn.wki();
                        this.suf = 201;
                        return;
                    case 103:
                        try {
                            n();
                            break;
                        } catch (Throwable unused) {
                        }
                        for (WeakReference<A1.b.a> weakReference2 : this.bob) {
                            if (weakReference2 != null && weakReference2.get() != null) {
                                weakReference2.get().bob(this);
                            }
                        }
                        this.suf = 203;
                        return;
                    case 104:
                        if (this.suf == 202 || this.suf == 208) {
                            this.nn.dgq();
                            return;
                        }
                        break;
                    case 105:
                        if (this.suf == 205 || this.suf == 206 || this.suf == 208 || this.suf == 207 || this.suf == 209) {
                            this.nn.rjo();
                            this.suf = 208;
                            return;
                        }
                        break;
                    case 106:
                        if (this.suf == 206 || this.suf == 207 || this.suf == 209) {
                            this.nn.kq(((Long) message.obj).longValue(), this.syt);
                            return;
                        }
                        break;
                    case 107:
                        m();
                        if (this.suf == 201 || this.suf == 203) {
                            com.bykv.vk.openvk.kq.kq.kq.bob.a aVar = (com.bykv.vk.openvk.kq.kq.kq.bob.a) message.obj;
                            if (TextUtils.isEmpty(aVar.csi())) {
                                aVar.kq(A1.a.i());
                            }
                            if (aVar.ou()) {
                                this.nn.kq(aVar.mxq());
                                aVar.mxq();
                            } else {
                                File file = new File(aVar.csi(), aVar.sns());
                                if (file.exists()) {
                                    h(aVar, file);
                                } else {
                                    a(aVar);
                                }
                            }
                            this.suf = 202;
                            return;
                        }
                        break;
                    case 108:
                    case 109:
                    default:
                        return;
                    case 110:
                        this.nn.kq((SurfaceHolder) message.obj);
                        this.nn.oq(true);
                        this.fgm.await(1L, TimeUnit.SECONDS);
                        c();
                        return;
                    case 111:
                        this.wf = new Surface((SurfaceTexture) message.obj);
                        this.nn.k(this.wf);
                        this.nn.oq(true);
                        this.fgm.await(1L, TimeUnit.SECONDS);
                        c();
                        return;
                }
                this.suf = TTAdConstant.MATE_VALID;
                if (this.ubx) {
                    return;
                }
                com.bykv.vk.openvk.kq.kq.kq.bob.b bVar = new com.bykv.vk.openvk.kq.kq.kq.bob.b(308, i11);
                bVar.c(i10 + "," + i11);
                for (WeakReference<A1.b.a> weakReference3 : this.bob) {
                    if (weakReference3 != null && weakReference3.get() != null) {
                        weakReference3.get().kq(this, bVar);
                    }
                }
                this.ubx = true;
            } catch (Throwable unused2) {
            }
        }
    }

    @Override // com.bykv.vk.openvk.kq.kq.oq.bob.a.d
    public void kq(com.bykv.vk.openvk.kq.kq.oq.bob.a aVar, int i10) {
        if (this.nn != aVar) {
            return;
        }
        for (WeakReference<A1.b.a> weakReference : this.bob) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().oq(this, i10);
            }
        }
    }

    @Override // com.bykv.vk.openvk.kq.kq.oq.bob.a.e
    public void kq(com.bykv.vk.openvk.kq.kq.oq.bob.a aVar) {
        this.suf = 209;
        kq.delete(this.ou);
        rs rsVar = this.mxq;
        if (rsVar != null) {
            rsVar.removeCallbacks(this.bss);
        }
        for (WeakReference<A1.b.a> weakReference : this.bob) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().kq(this);
            }
        }
    }

    @Override // com.bykv.vk.openvk.kq.kq.oq.bob.a.InterfaceC0216a
    public boolean kq(com.bykv.vk.openvk.kq.kq.oq.bob.a aVar, int i10, int i11) {
        b();
        this.suf = TTAdConstant.MATE_VALID;
        rs rsVar = this.mxq;
        if (rsVar != null) {
            rsVar.removeCallbacks(this.bss);
        }
        if (l(i10, i11)) {
            u();
        }
        if (!this.ktb.get()) {
            return true;
        }
        this.ktb.set(false);
        com.bykv.vk.openvk.kq.kq.kq.bob.b bVar = new com.bykv.vk.openvk.kq.kq.kq.bob.b(i10, i11);
        for (WeakReference<A1.b.a> weakReference : this.bob) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().kq(this, bVar);
            }
        }
        return true;
    }

    @Override // com.bykv.vk.openvk.kq.kq.oq.bob.a.g
    public void kq(com.bykv.vk.openvk.kq.kq.oq.bob.a aVar, int i10, int i11, int i12, int i13) {
        for (WeakReference<A1.b.a> weakReference : this.bob) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().kq((A1.b) this, i10, i11);
            }
        }
    }

    public void kq(A1.b.a aVar) {
        if (aVar == null) {
            return;
        }
        for (WeakReference<A1.b.a> weakReference : this.bob) {
            if (weakReference != null && weakReference.get() == aVar) {
                return;
            }
        }
        this.bob.add(new WeakReference<>(aVar));
    }

    public void kq(int i10) {
        if (syt()) {
            return;
        }
        this.zfx = i10;
    }

    public boolean kq(float f10) {
        PlaybackParams playbackParamsCsi;
        float speed = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (f10 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return false;
        }
        try {
            if (this.nn == null || !bob()) {
                return false;
            }
            try {
                playbackParamsCsi = this.nn.csi();
            } catch (Throwable th) {
                fax.bob("CSJ_VIDEO_MEDIA", "getPlaybackParams error:" + th.getMessage());
                playbackParamsCsi = null;
            }
            if (playbackParamsCsi != null) {
                speed = playbackParamsCsi.getSpeed();
            }
            if (speed == f10) {
                return true;
            }
            A1.c cVar = new A1.c();
            cVar.b(f10);
            this.nn.i(cVar);
            return true;
        } catch (Throwable th2) {
            fax.kq("CSJ_VIDEO_MEDIA", "setPlaySpeedRatio error: ", th2);
            return false;
        }
    }
}
