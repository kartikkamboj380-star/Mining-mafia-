package p152p1;

import I8.AbstractC0705y0;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p012b1.n;
import p012b1.r;
import p012b1.u;
import p022c1.C1205k;
import p022c1.C1206l;
import p022c1.InterfaceC1207m;
import p022c1.w;
import p132n1.o;
import p142o1.g;
import p162q1.b;
import p162q1.f;
import p192t1.p;
import r9.InterfaceC7107j;

/* JADX INFO: loaded from: classes.dex */
public final class d implements InterfaceC1207m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w f47742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o f47743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f47744c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f47745d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f47746e;

    public d(w wVar, o oVar, boolean z9, boolean z10, boolean z11) {
        this.f47742a = wVar;
        this.f47743b = oVar;
        this.f47744c = z9;
        this.f47745d = z10;
        this.f47746e = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C1205k c(d dVar) throws Throwable {
        Throwable th;
        b bVarA;
        float width;
        float height;
        InterfaceC7107j interfaceC7107jE1 = dVar.f47742a.e1();
        try {
            bVarA = p162q1.d.a(interfaceC7107jE1);
            if (interfaceC7107jE1 != null) {
                try {
                    interfaceC7107jE1.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            th = null;
        } catch (Throwable th3) {
            if (interfaceC7107jE1 != null) {
                try {
                    interfaceC7107jE1.close();
                } catch (Throwable th4) {
                    p129m8.a.a(th3, th4);
                }
            }
            th = th3;
            bVarA = null;
        }
        if (th != null) {
            throw th;
        }
        float[] fArrD = bVarA.d();
        if (!dVar.f47744c || fArrD == null) {
            width = bVarA.getWidth();
            height = bVarA.getHeight();
        } else {
            width = fArrD[2] - fArrD[0];
            height = fArrD[3] - fArrD[1];
        }
        if (dVar.f47746e && g.b(dVar.f47743b.k())) {
            float fA = f.a(dVar.f47743b.c());
            if (width > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                width *= fA;
            }
            if (height > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                height *= fA;
            }
        }
        int iC = IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
        int iC2 = width > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? B8.a.c(width) : 512;
        if (height > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            iC = B8.a.c(height);
        }
        long jB = C1206l.b(iC2, iC, dVar.f47743b.k(), dVar.f47743b.j(), p132n1.g.c(dVar.f47743b));
        int iC3 = p.c(jB);
        int iD = p.d(jB);
        if (width > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && height > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            float fE = C1206l.e(width, height, iC3, iD, dVar.f47743b.j());
            int i10 = (int) (fE * width);
            iD = (int) (fE * height);
            if (fArrD == null) {
                bVarA.c(new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, width, height});
            }
            iC3 = i10;
        }
        bVarA.a("100%");
        bVarA.b("100%");
        bVarA.e(dVar.f47743b);
        n nVarF = bVarA.f(iC3, iD);
        if (dVar.f47745d) {
            nVarF = u.d(u.g(nVarF, 0, 0, 3, null), false, 1, null);
        }
        return new C1205k(nVarF, dVar.f47745d);
    }

    @Override // p022c1.InterfaceC1207m
    public Object a(p169q8.b bVar) {
        return AbstractC0705y0.b(e.f45956a, new Function0() { // from class: p1.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return d.c(this.f47741a);
            }
        }, bVar);
    }

    public static final class a implements InterfaceC1207m.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f47747a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f47748b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f47749c;

        public a(boolean z9, boolean z10, boolean z11) {
            this.f47747a = z9;
            this.f47748b = z10;
            this.f47749c = z11;
        }

        private final boolean b(p042e1.o oVar) {
            return Intrinsics.b(oVar.b(), "image/svg+xml") || p152p1.a.a(C1206l.f11775a, oVar.c().e1());
        }

        @Override // p022c1.InterfaceC1207m.a
        public InterfaceC1207m a(p042e1.o oVar, o oVar2, r rVar) {
            if (b(oVar)) {
                return new d(oVar.c(), oVar2, this.f47747a, this.f47748b, this.f47749c);
            }
            return null;
        }

        public /* synthetic */ a(boolean z9, boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? true : z9, (i10 & 2) != 0 ? true : z10, (i10 & 4) != 0 ? false : z11);
        }
    }
}
