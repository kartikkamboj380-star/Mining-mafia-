package p203u2;

import Y1.k;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;
import java.util.List;
import p193t2.q;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final q f49797t = q.f49655h;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final q f49798u = q.f49656i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Resources f49799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f49800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f49801c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Drawable f49802d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private q f49803e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Drawable f49804f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private q f49805g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Drawable f49806h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private q f49807i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Drawable f49808j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private q f49809k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private q f49810l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Matrix f49811m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private PointF f49812n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private ColorFilter f49813o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Drawable f49814p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private List f49815q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Drawable f49816r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private d f49817s;

    public b(Resources resources) {
        this.f49799a = resources;
        s();
    }

    private void s() {
        this.f49800b = 300;
        this.f49801c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f49802d = null;
        q qVar = f49797t;
        this.f49803e = qVar;
        this.f49804f = null;
        this.f49805g = qVar;
        this.f49806h = null;
        this.f49807i = qVar;
        this.f49808j = null;
        this.f49809k = qVar;
        this.f49810l = f49798u;
        this.f49811m = null;
        this.f49812n = null;
        this.f49813o = null;
        this.f49814p = null;
        this.f49815q = null;
        this.f49816r = null;
        this.f49817s = null;
    }

    public static b t(Resources resources) {
        return new b(resources);
    }

    private void v() {
        List list = this.f49815q;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                k.g((Drawable) it.next());
            }
        }
    }

    public a a() {
        v();
        return new a(this);
    }

    public ColorFilter b() {
        return this.f49813o;
    }

    public PointF c() {
        return this.f49812n;
    }

    public q d() {
        return this.f49810l;
    }

    public Drawable e() {
        return this.f49814p;
    }

    public int f() {
        return this.f49800b;
    }

    public Drawable g() {
        return this.f49806h;
    }

    public q h() {
        return this.f49807i;
    }

    public List i() {
        return this.f49815q;
    }

    public Drawable j() {
        return this.f49802d;
    }

    public q k() {
        return this.f49803e;
    }

    public Drawable l() {
        return this.f49816r;
    }

    public Drawable m() {
        return this.f49808j;
    }

    public q n() {
        return this.f49809k;
    }

    public Resources o() {
        return this.f49799a;
    }

    public Drawable p() {
        return this.f49804f;
    }

    public q q() {
        return this.f49805g;
    }

    public d r() {
        return this.f49817s;
    }

    public b u(d dVar) {
        this.f49817s = dVar;
        return this;
    }
}
