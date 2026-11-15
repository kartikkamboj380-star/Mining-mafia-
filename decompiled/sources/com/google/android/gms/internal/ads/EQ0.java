package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import com.unity3d.services.core.di.ServiceProvider;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class EQ0 implements InterfaceC2982bS0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final AbstractC5931yu0 f18479p = AbstractC5931yu0.r("file", HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT, JsonStorageKeyNames.DATA_KEY, "android.resource", "rawresource", "asset");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2337Re f18480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C4891qe f18481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C5438v f18482c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f18483d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f18484e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f18485f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f18486g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f18487h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f18488i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final long f18489j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f18490k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f18491l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final AbstractC1539Bu0 f18492m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ConcurrentHashMap f18493n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f18494o;

    public EQ0() {
        C5438v c5438v = new C5438v(true, 65536);
        AbstractC1539Bu0 abstractC1539Bu0A = AbstractC1539Bu0.a();
        q(1000, 0, "bufferForPlaybackMs", "0");
        q(1000, 0, "bufferForPlaybackForLocalPlaybackMs", "0");
        q(2000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        q(1000, 0, "bufferForPlaybackAfterRebufferForLocalPlaybackMs", "0");
        q(50000, 1000, "minBufferMs", "bufferForPlaybackMs");
        q(1000, 1000, "minBufferForLocalPlaybackMs", "bufferForPlaybackForLocalPlaybackMs");
        q(50000, 2000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        q(1000, 1000, "minBufferForLocalPlaybackMs", "bufferForPlaybackAfterRebufferForLocalPlaybackMs");
        q(50000, 50000, "maxBufferMs", "minBufferMs");
        q(50000, 1000, "maxBufferForLocalPlaybackMs", "minBufferForLocalPlaybackMs");
        q(0, 0, "backBufferDurationMs", "0");
        this.f18480a = new C2337Re();
        this.f18481b = new C4891qe();
        this.f18482c = c5438v;
        this.f18483d = AbstractC4634ob0.M(ServiceProvider.SCAR_SIGNALS_FETCH_TIMEOUT);
        this.f18484e = AbstractC4634ob0.M(1000L);
        this.f18485f = AbstractC4634ob0.M(ServiceProvider.SCAR_SIGNALS_FETCH_TIMEOUT);
        this.f18486g = AbstractC4634ob0.M(ServiceProvider.SCAR_SIGNALS_FETCH_TIMEOUT);
        this.f18487h = AbstractC4634ob0.M(1000L);
        this.f18488i = AbstractC4634ob0.M(1000L);
        this.f18489j = AbstractC4634ob0.M(2000L);
        this.f18490k = AbstractC4634ob0.M(1000L);
        this.f18491l = AbstractC4634ob0.M(0L);
        this.f18493n = new ConcurrentHashMap();
        this.f18492m = AbstractC1539Bu0.c(abstractC1539Bu0A);
        this.f18494o = -1L;
    }

    private final int m(C4748pV0 c4748pV0) {
        Integer num = (Integer) this.f18492m.get(c4748pV0.f32407a);
        if (num == null || num.intValue() == -1) {
            return -1;
        }
        return num.intValue();
    }

    private final void n(C4748pV0 c4748pV0) {
        ConcurrentHashMap concurrentHashMap = this.f18493n;
        DQ0 dq0 = (DQ0) concurrentHashMap.get(c4748pV0);
        if (dq0 != null) {
            int i10 = dq0.f18168a - 1;
            dq0.f18168a = i10;
            if (i10 == 0) {
                concurrentHashMap.remove(c4748pV0);
                o();
            }
        }
    }

    private final void o() {
        ConcurrentHashMap concurrentHashMap = this.f18493n;
        if (concurrentHashMap.isEmpty()) {
            this.f18482c.c();
            return;
        }
        C5438v c5438v = this.f18482c;
        Iterator it = concurrentHashMap.values().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += ((DQ0) it.next()).f18170c;
        }
        c5438v.d(i10);
    }

    private final boolean p(C2856aS0 c2856aS0) {
        AbstractC5270tf abstractC5270tf = c2856aS0.f26513b;
        C4563o2 c4563o2 = abstractC5270tf.b(abstractC5270tf.o(c2856aS0.f26514c.f34594a, this.f18481b).f32697c, this.f18480a, 0L).f22869c.f32557b;
        if (c4563o2 == null) {
            return false;
        }
        String scheme = c4563o2.f31932a.getScheme();
        return TextUtils.isEmpty(scheme) || f18479p.contains(scheme);
    }

    private static void q(int i10, int i11, String str, String str2) {
        AbstractC2418Ss0.h(i10 >= i11, "%s cannot be less than %s", str, str2);
    }

    private final int r(C4748pV0 c4748pV0) {
        DQ0 dq0 = (DQ0) this.f18493n.get(c4748pV0);
        dq0.getClass();
        return dq0.c() * 65536;
    }

    private final int s(C4748pV0 c4748pV0) {
        DQ0 dq0 = (DQ0) this.f18493n.get(c4748pV0);
        dq0.getClass();
        return dq0.f18170c;
    }

    private static final boolean t(boolean z9) {
        return z9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2982bS0
    public final void a(C4748pV0 c4748pV0) {
        long id = Thread.currentThread().getId();
        long j10 = this.f18494o;
        AbstractC2418Ss0.j(j10 == -1 || j10 == id, "Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).");
        this.f18494o = id;
        ConcurrentHashMap concurrentHashMap = this.f18493n;
        DQ0 dq0 = (DQ0) concurrentHashMap.get(c4748pV0);
        if (dq0 == null) {
            concurrentHashMap.put(c4748pV0, new DQ0());
        } else {
            dq0.f18168a++;
        }
        DQ0 dq1 = (DQ0) concurrentHashMap.get(c4748pV0);
        dq1.getClass();
        int iM = m(c4748pV0);
        if (iM == -1) {
            iM = 13107200;
        }
        dq1.f18170c = iM;
        dq1.f18169b = false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2982bS0
    public final void b(C2856aS0 c2856aS0, A01 a01, InterfaceC3299e[] interfaceC3299eArr) {
        ConcurrentHashMap concurrentHashMap = this.f18493n;
        C4748pV0 c4748pV0 = c2856aS0.f26512a;
        int iM = m(c4748pV0);
        DQ0 dq0 = (DQ0) concurrentHashMap.get(c4748pV0);
        dq0.getClass();
        if (iM == -1) {
            boolean zP = p(c2856aS0);
            int length = interfaceC3299eArr.length;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                int i12 = 13107200;
                if (i10 < length) {
                    InterfaceC3299e interfaceC3299e = interfaceC3299eArr[i10];
                    if (interfaceC3299e != null) {
                        switch (interfaceC3299e.zza().f24072c) {
                            case -1:
                            case 1:
                                break;
                            case 0:
                                i12 = 144310272;
                                break;
                            case 2:
                                i12 = !zP ? 131072000 : 19660800;
                                break;
                            case 3:
                            case 5:
                            default:
                                i12 = 131072;
                                break;
                            case 4:
                                i12 = 26214400;
                                break;
                        }
                        i11 += i12;
                    }
                    i10++;
                } else {
                    iM = Math.max(13107200, i11);
                }
            }
        }
        dq0.f18170c = iM;
        o();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2982bS0
    public final boolean c(C4748pV0 c4748pV0, AbstractC5270tf abstractC5270tf, C5637wZ0 c5637wZ0, long j10) {
        Iterator it = this.f18493n.values().iterator();
        while (it.hasNext()) {
            if (((DQ0) it.next()).f18169b) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2982bS0
    public final boolean d(C2856aS0 c2856aS0) {
        long jMin;
        boolean z9;
        boolean z10 = c2856aS0.f26518g;
        long j10 = c2856aS0.f26516e;
        float f10 = c2856aS0.f26517f;
        boolean zP = p(c2856aS0);
        long jS = AbstractC4634ob0.S(j10, f10);
        if (z10) {
            if (zP) {
                jMin = this.f18490k;
                z9 = true;
            } else {
                jMin = this.f18489j;
                z9 = false;
            }
        } else if (zP) {
            jMin = this.f18488i;
            z9 = true;
        } else {
            jMin = this.f18487h;
            z9 = false;
        }
        long j11 = c2856aS0.f26519h;
        if (j11 != -9223372036854775807L) {
            jMin = Math.min(j11 / 2, jMin);
        }
        if (jMin <= 0 || jS >= jMin) {
            return true;
        }
        if (!t(z9)) {
            C4748pV0 c4748pV0 = c2856aS0.f26512a;
            if (r(c4748pV0) >= s(c4748pV0)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2982bS0
    public final boolean e(C2856aS0 c2856aS0) {
        ConcurrentHashMap concurrentHashMap = this.f18493n;
        C4748pV0 c4748pV0 = c2856aS0.f26512a;
        DQ0 dq0 = (DQ0) concurrentHashMap.get(c4748pV0);
        dq0.getClass();
        int iR = r(c4748pV0);
        int iS = s(c4748pV0);
        if (c4748pV0.equals(C4748pV0.f32406c)) {
            return iR < iS;
        }
        boolean zP = p(c2856aS0);
        long jMin = zP ? this.f18484e : this.f18483d;
        long j10 = zP ? this.f18486g : this.f18485f;
        float f10 = c2856aS0.f26517f;
        if (f10 > 1.0f) {
            jMin = Math.min(AbstractC4634ob0.R(jMin, f10), j10);
        }
        long j11 = c2856aS0.f26516e;
        if (j11 < Math.max(jMin, 500000L)) {
            boolean z9 = t(zP) || iR < iS;
            dq0.f18169b = z9;
            if (!z9 && j11 < 500000) {
                YU.c("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j11 >= j10 || iR >= iS) {
            dq0.f18169b = false;
        }
        return dq0.f18169b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2982bS0
    public final void f(C4748pV0 c4748pV0) {
        n(c4748pV0);
        if (this.f18493n.isEmpty()) {
            this.f18494o = -1L;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2982bS0
    public final void g(C4748pV0 c4748pV0) {
        n(c4748pV0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2982bS0
    public final boolean h(C4748pV0 c4748pV0) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2982bS0
    public final InterfaceC4683p i(C4748pV0 c4748pV0) {
        return new CQ0(this, c4748pV0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2982bS0
    public final long j(C4748pV0 c4748pV0) {
        return this.f18491l;
    }

    final /* synthetic */ C5438v k() {
        return this.f18482c;
    }

    final /* synthetic */ ConcurrentHashMap l() {
        return this.f18493n;
    }
}
