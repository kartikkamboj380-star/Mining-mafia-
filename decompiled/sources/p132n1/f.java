package p132n1;

import android.content.Context;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.protobuf.CodedOutputStream;
import java.util.Map;
import kotlin.Pair;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.I;
import kotlin.jvm.internal.Intrinsics;
import p012b1.l;
import p012b1.n;
import p022c1.InterfaceC1207m;
import p142o1.e;
import p142o1.h;
import p192t1.AbstractC7125c;
import p192t1.AbstractC7127e;
import p192t1.E;
import r9.AbstractC7112o;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f46554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f46555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p172r1.a f46556c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d f46557d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f46558e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f46559f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f46560g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AbstractC7112o f46561h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Pair f46562i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final InterfaceC1207m.a f46563j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final CoroutineContext f46564k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final CoroutineContext f46565l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final CoroutineContext f46566m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final p132n1.c f46567n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final p132n1.c f46568o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final p132n1.c f46569p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final i1.d.b f46570q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Function1 f46571r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Function1 f46572s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Function1 f46573t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final h f46574u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final e f46575v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final p142o1.c f46576w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final l f46577x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final c f46578y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final b f46579z;

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AbstractC7112o f46622a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final CoroutineContext f46623b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final CoroutineContext f46624c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final CoroutineContext f46625d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final p132n1.c f46626e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final p132n1.c f46627f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final p132n1.c f46628g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final Function1 f46629h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final Function1 f46630i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final Function1 f46631j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final h f46632k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final e f46633l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final p142o1.c f46634m;

        public c(AbstractC7112o abstractC7112o, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, CoroutineContext coroutineContext3, p132n1.c cVar, p132n1.c cVar2, p132n1.c cVar3, Function1 function1, Function1 function2, Function1 function3, h hVar, e eVar, p142o1.c cVar4) {
            this.f46622a = abstractC7112o;
            this.f46623b = coroutineContext;
            this.f46624c = coroutineContext2;
            this.f46625d = coroutineContext3;
            this.f46626e = cVar;
            this.f46627f = cVar2;
            this.f46628g = cVar3;
            this.f46629h = function1;
            this.f46630i = function2;
            this.f46631j = function3;
            this.f46632k = hVar;
            this.f46633l = eVar;
            this.f46634m = cVar4;
        }

        public final CoroutineContext a() {
            return this.f46625d;
        }

        public final p132n1.c b() {
            return this.f46627f;
        }

        public final Function1 c() {
            return this.f46630i;
        }

        public final Function1 d() {
            return this.f46631j;
        }

        public final CoroutineContext e() {
            return this.f46624c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.b(this.f46622a, cVar.f46622a) && Intrinsics.b(this.f46623b, cVar.f46623b) && Intrinsics.b(this.f46624c, cVar.f46624c) && Intrinsics.b(this.f46625d, cVar.f46625d) && this.f46626e == cVar.f46626e && this.f46627f == cVar.f46627f && this.f46628g == cVar.f46628g && Intrinsics.b(this.f46629h, cVar.f46629h) && Intrinsics.b(this.f46630i, cVar.f46630i) && Intrinsics.b(this.f46631j, cVar.f46631j) && Intrinsics.b(this.f46632k, cVar.f46632k) && this.f46633l == cVar.f46633l && this.f46634m == cVar.f46634m;
        }

        public final AbstractC7112o f() {
            return this.f46622a;
        }

        public final CoroutineContext g() {
            return this.f46623b;
        }

        public final p132n1.c h() {
            return this.f46626e;
        }

        public int hashCode() {
            AbstractC7112o abstractC7112o = this.f46622a;
            int iHashCode = (abstractC7112o == null ? 0 : abstractC7112o.hashCode()) * 31;
            CoroutineContext coroutineContext = this.f46623b;
            int iHashCode2 = (iHashCode + (coroutineContext == null ? 0 : coroutineContext.hashCode())) * 31;
            CoroutineContext coroutineContext2 = this.f46624c;
            int iHashCode3 = (iHashCode2 + (coroutineContext2 == null ? 0 : coroutineContext2.hashCode())) * 31;
            CoroutineContext coroutineContext3 = this.f46625d;
            int iHashCode4 = (iHashCode3 + (coroutineContext3 == null ? 0 : coroutineContext3.hashCode())) * 31;
            p132n1.c cVar = this.f46626e;
            int iHashCode5 = (iHashCode4 + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p132n1.c cVar2 = this.f46627f;
            int iHashCode6 = (iHashCode5 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p132n1.c cVar3 = this.f46628g;
            int iHashCode7 = (iHashCode6 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            Function1 function1 = this.f46629h;
            int iHashCode8 = (iHashCode7 + (function1 == null ? 0 : function1.hashCode())) * 31;
            Function1 function2 = this.f46630i;
            int iHashCode9 = (iHashCode8 + (function2 == null ? 0 : function2.hashCode())) * 31;
            Function1 function3 = this.f46631j;
            int iHashCode10 = (iHashCode9 + (function3 == null ? 0 : function3.hashCode())) * 31;
            h hVar = this.f46632k;
            int iHashCode11 = (iHashCode10 + (hVar == null ? 0 : hVar.hashCode())) * 31;
            e eVar = this.f46633l;
            int iHashCode12 = (iHashCode11 + (eVar == null ? 0 : eVar.hashCode())) * 31;
            p142o1.c cVar4 = this.f46634m;
            return iHashCode12 + (cVar4 != null ? cVar4.hashCode() : 0);
        }

        public final p132n1.c i() {
            return this.f46628g;
        }

        public final Function1 j() {
            return this.f46629h;
        }

        public final p142o1.c k() {
            return this.f46634m;
        }

        public final e l() {
            return this.f46633l;
        }

        public final h m() {
            return this.f46632k;
        }

        public String toString() {
            return "Defined(fileSystem=" + this.f46622a + ", interceptorCoroutineContext=" + this.f46623b + ", fetcherCoroutineContext=" + this.f46624c + ", decoderCoroutineContext=" + this.f46625d + ", memoryCachePolicy=" + this.f46626e + ", diskCachePolicy=" + this.f46627f + ", networkCachePolicy=" + this.f46628g + ", placeholderFactory=" + this.f46629h + ", errorFactory=" + this.f46630i + ", fallbackFactory=" + this.f46631j + ", sizeResolver=" + this.f46632k + ", scale=" + this.f46633l + ", precision=" + this.f46634m + ')';
        }
    }

    public interface d {
        void a(f fVar, s sVar);

        void b(f fVar);

        void c(f fVar, e eVar);

        void d(f fVar);
    }

    public /* synthetic */ f(Context context, Object obj, p172r1.a aVar, d dVar, String str, Map map, String str2, AbstractC7112o abstractC7112o, Pair pair, InterfaceC1207m.a aVar2, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, CoroutineContext coroutineContext3, p132n1.c cVar, p132n1.c cVar2, p132n1.c cVar3, i1.d.b bVar, Function1 function1, Function1 function2, Function1 function3, h hVar, e eVar, p142o1.c cVar4, l lVar, c cVar5, b bVar2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, obj, aVar, dVar, str, map, str2, abstractC7112o, pair, aVar2, coroutineContext, coroutineContext2, coroutineContext3, cVar, cVar2, cVar3, bVar, function1, function2, function3, hVar, eVar, cVar4, lVar, cVar5, bVar2);
    }

    public static /* synthetic */ a A(f fVar, Context context, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            context = fVar.f46554a;
        }
        return fVar.z(context);
    }

    public final n B() {
        n nVar = (n) this.f46571r.invoke(this);
        return nVar == null ? (n) this.f46579z.m().invoke(this) : nVar;
    }

    public final n a() {
        n nVar = (n) this.f46572s.invoke(this);
        return nVar == null ? (n) this.f46579z.e().invoke(this) : nVar;
    }

    public final n b() {
        n nVar = (n) this.f46573t.invoke(this);
        return nVar == null ? (n) this.f46579z.g().invoke(this) : nVar;
    }

    public final Context c() {
        return this.f46554a;
    }

    public final Object d() {
        return this.f46555b;
    }

    public final CoroutineContext e() {
        return this.f46566m;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.b(this.f46554a, fVar.f46554a) && Intrinsics.b(this.f46555b, fVar.f46555b) && Intrinsics.b(this.f46556c, fVar.f46556c) && Intrinsics.b(this.f46557d, fVar.f46557d) && Intrinsics.b(this.f46558e, fVar.f46558e) && Intrinsics.b(this.f46559f, fVar.f46559f) && Intrinsics.b(this.f46560g, fVar.f46560g) && Intrinsics.b(this.f46561h, fVar.f46561h) && Intrinsics.b(this.f46562i, fVar.f46562i) && Intrinsics.b(this.f46563j, fVar.f46563j) && Intrinsics.b(this.f46564k, fVar.f46564k) && Intrinsics.b(this.f46565l, fVar.f46565l) && Intrinsics.b(this.f46566m, fVar.f46566m) && this.f46567n == fVar.f46567n && this.f46568o == fVar.f46568o && this.f46569p == fVar.f46569p && Intrinsics.b(this.f46570q, fVar.f46570q) && Intrinsics.b(this.f46571r, fVar.f46571r) && Intrinsics.b(this.f46572s, fVar.f46572s) && Intrinsics.b(this.f46573t, fVar.f46573t) && Intrinsics.b(this.f46574u, fVar.f46574u) && this.f46575v == fVar.f46575v && this.f46576w == fVar.f46576w && Intrinsics.b(this.f46577x, fVar.f46577x) && Intrinsics.b(this.f46578y, fVar.f46578y) && Intrinsics.b(this.f46579z, fVar.f46579z);
    }

    public final InterfaceC1207m.a f() {
        return this.f46563j;
    }

    public final b g() {
        return this.f46579z;
    }

    public final c h() {
        return this.f46578y;
    }

    public int hashCode() {
        int iHashCode = ((this.f46554a.hashCode() * 31) + this.f46555b.hashCode()) * 31;
        p172r1.a aVar = this.f46556c;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        d dVar = this.f46557d;
        int iHashCode3 = (iHashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        String str = this.f46558e;
        int iHashCode4 = (((iHashCode3 + (str == null ? 0 : str.hashCode())) * 31) + this.f46559f.hashCode()) * 31;
        String str2 = this.f46560g;
        int iHashCode5 = (((iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f46561h.hashCode()) * 31;
        Pair pair = this.f46562i;
        int iHashCode6 = (iHashCode5 + (pair == null ? 0 : pair.hashCode())) * 31;
        InterfaceC1207m.a aVar2 = this.f46563j;
        int iHashCode7 = (((((((((((((iHashCode6 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31) + this.f46564k.hashCode()) * 31) + this.f46565l.hashCode()) * 31) + this.f46566m.hashCode()) * 31) + this.f46567n.hashCode()) * 31) + this.f46568o.hashCode()) * 31) + this.f46569p.hashCode()) * 31;
        i1.d.b bVar = this.f46570q;
        return ((((((((((((((((((iHashCode7 + (bVar != null ? bVar.hashCode() : 0)) * 31) + this.f46571r.hashCode()) * 31) + this.f46572s.hashCode()) * 31) + this.f46573t.hashCode()) * 31) + this.f46574u.hashCode()) * 31) + this.f46575v.hashCode()) * 31) + this.f46576w.hashCode()) * 31) + this.f46577x.hashCode()) * 31) + this.f46578y.hashCode()) * 31) + this.f46579z.hashCode();
    }

    public final String i() {
        return this.f46560g;
    }

    public final p132n1.c j() {
        return this.f46568o;
    }

    public final l k() {
        return this.f46577x;
    }

    public final CoroutineContext l() {
        return this.f46565l;
    }

    public final Pair m() {
        return this.f46562i;
    }

    public final AbstractC7112o n() {
        return this.f46561h;
    }

    public final CoroutineContext o() {
        return this.f46564k;
    }

    public final d p() {
        return this.f46557d;
    }

    public final String q() {
        return this.f46558e;
    }

    public final Map r() {
        return this.f46559f;
    }

    public final p132n1.c s() {
        return this.f46567n;
    }

    public final p132n1.c t() {
        return this.f46569p;
    }

    public String toString() {
        return "ImageRequest(context=" + this.f46554a + ", data=" + this.f46555b + ", target=" + this.f46556c + ", listener=" + this.f46557d + ", memoryCacheKey=" + this.f46558e + ", memoryCacheKeyExtras=" + this.f46559f + ", diskCacheKey=" + this.f46560g + ", fileSystem=" + this.f46561h + ", fetcherFactory=" + this.f46562i + ", decoderFactory=" + this.f46563j + ", interceptorCoroutineContext=" + this.f46564k + ", fetcherCoroutineContext=" + this.f46565l + ", decoderCoroutineContext=" + this.f46566m + ", memoryCachePolicy=" + this.f46567n + ", diskCachePolicy=" + this.f46568o + ", networkCachePolicy=" + this.f46569p + ", placeholderMemoryCacheKey=" + this.f46570q + ", placeholderFactory=" + this.f46571r + ", errorFactory=" + this.f46572s + ", fallbackFactory=" + this.f46573t + ", sizeResolver=" + this.f46574u + ", scale=" + this.f46575v + ", precision=" + this.f46576w + ", extras=" + this.f46577x + ", defined=" + this.f46578y + ", defaults=" + this.f46579z + ')';
    }

    public final i1.d.b u() {
        return this.f46570q;
    }

    public final p142o1.c v() {
        return this.f46576w;
    }

    public final e w() {
        return this.f46575v;
    }

    public final h x() {
        return this.f46574u;
    }

    public final p172r1.a y() {
        return this.f46556c;
    }

    public final a z(Context context) {
        return new a(this, context);
    }

    private f(Context context, Object obj, p172r1.a aVar, d dVar, String str, Map map, String str2, AbstractC7112o abstractC7112o, Pair pair, InterfaceC1207m.a aVar2, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, CoroutineContext coroutineContext3, p132n1.c cVar, p132n1.c cVar2, p132n1.c cVar3, i1.d.b bVar, Function1 function1, Function1 function2, Function1 function3, h hVar, e eVar, p142o1.c cVar4, l lVar, c cVar5, b bVar2) {
        this.f46554a = context;
        this.f46555b = obj;
        this.f46556c = aVar;
        this.f46557d = dVar;
        this.f46558e = str;
        this.f46559f = map;
        this.f46560g = str2;
        this.f46561h = abstractC7112o;
        this.f46562i = pair;
        this.f46563j = aVar2;
        this.f46564k = coroutineContext;
        this.f46565l = coroutineContext2;
        this.f46566m = coroutineContext3;
        this.f46567n = cVar;
        this.f46568o = cVar2;
        this.f46569p = cVar3;
        this.f46570q = bVar;
        this.f46571r = function1;
        this.f46572s = function2;
        this.f46573t = function3;
        this.f46574u = hVar;
        this.f46575v = eVar;
        this.f46576w = cVar4;
        this.f46577x = lVar;
        this.f46578y = cVar5;
        this.f46579z = bVar2;
    }

    public static final class b {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final a f46606o = new a(null);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final b f46607p = new b(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AbstractC7112o f46608a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final CoroutineContext f46609b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final CoroutineContext f46610c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final CoroutineContext f46611d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final p132n1.c f46612e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final p132n1.c f46613f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final p132n1.c f46614g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final Function1 f46615h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final Function1 f46616i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final Function1 f46617j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final h f46618k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final e f46619l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final p142o1.c f46620m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final l f46621n;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        public b(AbstractC7112o abstractC7112o, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, CoroutineContext coroutineContext3, p132n1.c cVar, p132n1.c cVar2, p132n1.c cVar3, Function1 function1, Function1 function2, Function1 function3, h hVar, e eVar, p142o1.c cVar4, l lVar) {
            this.f46608a = abstractC7112o;
            this.f46609b = coroutineContext;
            this.f46610c = coroutineContext2;
            this.f46611d = coroutineContext3;
            this.f46612e = cVar;
            this.f46613f = cVar2;
            this.f46614g = cVar3;
            this.f46615h = function1;
            this.f46616i = function2;
            this.f46617j = function3;
            this.f46618k = hVar;
            this.f46619l = eVar;
            this.f46620m = cVar4;
            this.f46621n = lVar;
        }

        public final b a(AbstractC7112o abstractC7112o, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, CoroutineContext coroutineContext3, p132n1.c cVar, p132n1.c cVar2, p132n1.c cVar3, Function1 function1, Function1 function2, Function1 function3, h hVar, e eVar, p142o1.c cVar4, l lVar) {
            return new b(abstractC7112o, coroutineContext, coroutineContext2, coroutineContext3, cVar, cVar2, cVar3, function1, function2, function3, hVar, eVar, cVar4, lVar);
        }

        public final CoroutineContext c() {
            return this.f46611d;
        }

        public final p132n1.c d() {
            return this.f46613f;
        }

        public final Function1 e() {
            return this.f46616i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.b(this.f46608a, bVar.f46608a) && Intrinsics.b(this.f46609b, bVar.f46609b) && Intrinsics.b(this.f46610c, bVar.f46610c) && Intrinsics.b(this.f46611d, bVar.f46611d) && this.f46612e == bVar.f46612e && this.f46613f == bVar.f46613f && this.f46614g == bVar.f46614g && Intrinsics.b(this.f46615h, bVar.f46615h) && Intrinsics.b(this.f46616i, bVar.f46616i) && Intrinsics.b(this.f46617j, bVar.f46617j) && Intrinsics.b(this.f46618k, bVar.f46618k) && this.f46619l == bVar.f46619l && this.f46620m == bVar.f46620m && Intrinsics.b(this.f46621n, bVar.f46621n);
        }

        public final l f() {
            return this.f46621n;
        }

        public final Function1 g() {
            return this.f46617j;
        }

        public final CoroutineContext h() {
            return this.f46610c;
        }

        public int hashCode() {
            return (((((((((((((((((((((((((this.f46608a.hashCode() * 31) + this.f46609b.hashCode()) * 31) + this.f46610c.hashCode()) * 31) + this.f46611d.hashCode()) * 31) + this.f46612e.hashCode()) * 31) + this.f46613f.hashCode()) * 31) + this.f46614g.hashCode()) * 31) + this.f46615h.hashCode()) * 31) + this.f46616i.hashCode()) * 31) + this.f46617j.hashCode()) * 31) + this.f46618k.hashCode()) * 31) + this.f46619l.hashCode()) * 31) + this.f46620m.hashCode()) * 31) + this.f46621n.hashCode();
        }

        public final AbstractC7112o i() {
            return this.f46608a;
        }

        public final CoroutineContext j() {
            return this.f46609b;
        }

        public final p132n1.c k() {
            return this.f46612e;
        }

        public final p132n1.c l() {
            return this.f46614g;
        }

        public final Function1 m() {
            return this.f46615h;
        }

        public final p142o1.c n() {
            return this.f46620m;
        }

        public final e o() {
            return this.f46619l;
        }

        public final h p() {
            return this.f46618k;
        }

        public String toString() {
            return "Defaults(fileSystem=" + this.f46608a + ", interceptorCoroutineContext=" + this.f46609b + ", fetcherCoroutineContext=" + this.f46610c + ", decoderCoroutineContext=" + this.f46611d + ", memoryCachePolicy=" + this.f46612e + ", diskCachePolicy=" + this.f46613f + ", networkCachePolicy=" + this.f46614g + ", placeholderFactory=" + this.f46615h + ", errorFactory=" + this.f46616i + ", fallbackFactory=" + this.f46617j + ", sizeResolver=" + this.f46618k + ", scale=" + this.f46619l + ", precision=" + this.f46620m + ", extras=" + this.f46621n + ')';
        }

        public /* synthetic */ b(AbstractC7112o abstractC7112o, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, CoroutineContext coroutineContext3, p132n1.c cVar, p132n1.c cVar2, p132n1.c cVar3, Function1 function1, Function1 function2, Function1 function3, h hVar, e eVar, p142o1.c cVar4, l lVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? p192t1.l.a() : abstractC7112o, (i10 & 2) != 0 ? kotlin.coroutines.e.f45956a : coroutineContext, (i10 & 4) != 0 ? AbstractC7127e.a() : coroutineContext2, (i10 & 8) != 0 ? AbstractC7127e.a() : coroutineContext3, (i10 & 16) != 0 ? p132n1.c.ENABLED : cVar, (i10 & 32) != 0 ? p132n1.c.ENABLED : cVar2, (i10 & 64) != 0 ? p132n1.c.ENABLED : cVar3, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? E.j() : function1, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? E.j() : function2, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? E.j() : function3, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? h.f47170b : hVar, (i10 & 2048) != 0 ? e.FIT : eVar, (i10 & CodedOutputStream.DEFAULT_BUFFER_SIZE) != 0 ? p142o1.c.EXACT : cVar4, (i10 & 8192) != 0 ? l.f11530c : lVar);
        }
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f46580a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private b f46581b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Object f46582c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private p172r1.a f46583d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private d f46584e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f46585f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f46586g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Object f46587h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private String f46588i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private AbstractC7112o f46589j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private Pair f46590k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private InterfaceC1207m.a f46591l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private CoroutineContext f46592m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private CoroutineContext f46593n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private CoroutineContext f46594o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private p132n1.c f46595p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private p132n1.c f46596q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private p132n1.c f46597r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private i1.d.b f46598s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private Function1 f46599t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private Function1 f46600u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private Function1 f46601v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private h f46602w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private e f46603x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private p142o1.c f46604y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private Object f46605z;

        public a(Context context) {
            this.f46580a = context;
            this.f46581b = b.f46607p;
            this.f46582c = null;
            this.f46583d = null;
            this.f46584e = null;
            this.f46585f = null;
            this.f46587h = kotlin.collections.E.g();
            this.f46588i = null;
            this.f46589j = null;
            this.f46590k = null;
            this.f46591l = null;
            this.f46592m = null;
            this.f46593n = null;
            this.f46594o = null;
            this.f46595p = null;
            this.f46596q = null;
            this.f46597r = null;
            this.f46598s = null;
            this.f46599t = E.j();
            this.f46600u = E.j();
            this.f46601v = E.j();
            this.f46602w = null;
            this.f46603x = null;
            this.f46604y = null;
            this.f46605z = l.f11530c;
        }

        public final f a() {
            Map mapD;
            l lVarA;
            Context context = this.f46580a;
            Object obj = this.f46582c;
            if (obj == null) {
                obj = l.f46648a;
            }
            Object obj2 = obj;
            p172r1.a aVar = this.f46583d;
            d dVar = this.f46584e;
            String str = this.f46585f;
            Object obj3 = this.f46587h;
            if (Intrinsics.b(obj3, Boolean.valueOf(this.f46586g))) {
                Intrinsics.d(obj3, "null cannot be cast to non-null type kotlin.collections.MutableMap<*, *>");
                mapD = AbstractC7125c.d(I.b(obj3));
            } else {
                if (!(obj3 instanceof Map)) {
                    throw new AssertionError();
                }
                mapD = (Map) obj3;
            }
            Map map = mapD;
            Intrinsics.d(map, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
            String str2 = this.f46588i;
            AbstractC7112o abstractC7112oI = this.f46589j;
            if (abstractC7112oI == null) {
                abstractC7112oI = this.f46581b.i();
            }
            AbstractC7112o abstractC7112o = abstractC7112oI;
            Pair pair = this.f46590k;
            InterfaceC1207m.a aVar2 = this.f46591l;
            p132n1.c cVarK = this.f46595p;
            if (cVarK == null) {
                cVarK = this.f46581b.k();
            }
            p132n1.c cVar = cVarK;
            p132n1.c cVarD = this.f46596q;
            if (cVarD == null) {
                cVarD = this.f46581b.d();
            }
            p132n1.c cVar2 = cVarD;
            p132n1.c cVarL = this.f46597r;
            if (cVarL == null) {
                cVarL = this.f46581b.l();
            }
            p132n1.c cVar3 = cVarL;
            CoroutineContext coroutineContextJ = this.f46592m;
            if (coroutineContextJ == null) {
                coroutineContextJ = this.f46581b.j();
            }
            CoroutineContext coroutineContext = coroutineContextJ;
            CoroutineContext coroutineContextH = this.f46593n;
            if (coroutineContextH == null) {
                coroutineContextH = this.f46581b.h();
            }
            CoroutineContext coroutineContext2 = coroutineContextH;
            CoroutineContext coroutineContextC = this.f46594o;
            if (coroutineContextC == null) {
                coroutineContextC = this.f46581b.c();
            }
            CoroutineContext coroutineContext3 = coroutineContextC;
            i1.d.b bVar = this.f46598s;
            Function1 function1M = this.f46599t;
            if (function1M == null) {
                function1M = this.f46581b.m();
            }
            Function1 function1 = function1M;
            Function1 function1E = this.f46600u;
            if (function1E == null) {
                function1E = this.f46581b.e();
            }
            Function1 function2 = function1E;
            Function1 function1G = this.f46601v;
            if (function1G == null) {
                function1G = this.f46581b.g();
            }
            Function1 function3 = function1G;
            h hVarP = this.f46602w;
            if (hVarP == null) {
                hVarP = this.f46581b.p();
            }
            h hVar = hVarP;
            e eVarO = this.f46603x;
            if (eVarO == null) {
                eVarO = this.f46581b.o();
            }
            e eVar = eVarO;
            p142o1.c cVarN = this.f46604y;
            if (cVarN == null) {
                cVarN = this.f46581b.n();
            }
            p142o1.c cVar4 = cVarN;
            Object obj4 = this.f46605z;
            if (obj4 instanceof l.a) {
                lVarA = ((l.a) obj4).a();
            } else {
                if (!(obj4 instanceof l)) {
                    throw new AssertionError();
                }
                lVarA = (l) obj4;
            }
            return new f(context, obj2, aVar, dVar, str, map, str2, abstractC7112o, pair, aVar2, coroutineContext, coroutineContext2, coroutineContext3, cVar, cVar2, cVar3, bVar, function1, function2, function3, hVar, eVar, cVar4, lVarA, new c(this.f46589j, this.f46592m, this.f46593n, this.f46594o, this.f46595p, this.f46596q, this.f46597r, this.f46599t, this.f46600u, this.f46601v, this.f46602w, this.f46603x, this.f46604y), this.f46581b, null);
        }

        public final a b(Object obj) {
            this.f46582c = obj;
            return this;
        }

        public final a c(b bVar) {
            this.f46581b = bVar;
            return this;
        }

        public final a d(d dVar) {
            this.f46584e = dVar;
            return this;
        }

        public final a e(p142o1.c cVar) {
            this.f46604y = cVar;
            return this;
        }

        public final a f(e eVar) {
            this.f46603x = eVar;
            return this;
        }

        public final a g(h hVar) {
            this.f46602w = hVar;
            return this;
        }

        public final a h(p172r1.a aVar) {
            this.f46583d = aVar;
            return this;
        }

        public a(f fVar, Context context) {
            this.f46580a = context;
            this.f46581b = fVar.g();
            this.f46582c = fVar.d();
            this.f46583d = fVar.y();
            this.f46584e = fVar.p();
            this.f46585f = fVar.q();
            this.f46587h = fVar.r();
            this.f46588i = fVar.i();
            this.f46589j = fVar.h().f();
            this.f46590k = fVar.m();
            this.f46591l = fVar.f();
            this.f46592m = fVar.h().g();
            this.f46593n = fVar.h().e();
            this.f46594o = fVar.h().a();
            this.f46595p = fVar.h().h();
            this.f46596q = fVar.h().b();
            this.f46597r = fVar.h().i();
            this.f46598s = fVar.u();
            this.f46599t = fVar.h().j();
            this.f46600u = fVar.h().c();
            this.f46601v = fVar.h().d();
            this.f46602w = fVar.h().m();
            this.f46603x = fVar.h().l();
            this.f46604y = fVar.h().k();
            this.f46605z = fVar.k();
        }
    }
}
