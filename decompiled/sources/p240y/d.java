package p240y;

import java.util.HashSet;
import java.util.Iterator;
import p230x.c;
import p230x.i;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f50584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f50585c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d f50586d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    i f50589g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HashSet f50583a = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f50587e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f50588f = -1;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f50590a;

        static {
            int[] iArr = new int[b.values().length];
            f50590a = iArr;
            try {
                iArr[b.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f50590a[b.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f50590a[b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f50590a[b.TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f50590a[b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f50590a[b.BASELINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f50590a[b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f50590a[b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f50590a[b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public enum b {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public d(e eVar, b bVar) {
        this.f50584b = eVar;
        this.f50585c = bVar;
    }

    public boolean a(d dVar, int i10) {
        return b(dVar, i10, -1, false);
    }

    public boolean b(d dVar, int i10, int i11, boolean z9) {
        if (dVar == null) {
            l();
            return true;
        }
        if (!z9 && !k(dVar)) {
            return false;
        }
        this.f50586d = dVar;
        if (dVar.f50583a == null) {
            dVar.f50583a = new HashSet();
        }
        this.f50586d.f50583a.add(this);
        if (i10 > 0) {
            this.f50587e = i10;
        } else {
            this.f50587e = 0;
        }
        this.f50588f = i11;
        return true;
    }

    public int c() {
        d dVar;
        if (this.f50584b.O() == 8) {
            return 0;
        }
        return (this.f50588f <= -1 || (dVar = this.f50586d) == null || dVar.f50584b.O() != 8) ? this.f50587e : this.f50588f;
    }

    public final d d() {
        switch (a.f50590a[this.f50585c.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.f50584b.f50605D;
            case 3:
                return this.f50584b.f50603B;
            case 4:
                return this.f50584b.f50606E;
            case 5:
                return this.f50584b.f50604C;
            default:
                throw new AssertionError(this.f50585c.name());
        }
    }

    public e e() {
        return this.f50584b;
    }

    public i f() {
        return this.f50589g;
    }

    public d g() {
        return this.f50586d;
    }

    public b h() {
        return this.f50585c;
    }

    public boolean i() {
        HashSet hashSet = this.f50583a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((d) it.next()).d().j()) {
                return true;
            }
        }
        return false;
    }

    public boolean j() {
        return this.f50586d != null;
    }

    public boolean k(d dVar) {
        if (dVar == null) {
            return false;
        }
        b bVarH = dVar.h();
        b bVar = this.f50585c;
        if (bVarH == bVar) {
            return bVar != b.BASELINE || (dVar.e().S() && e().S());
        }
        switch (a.f50590a[bVar.ordinal()]) {
            case 1:
                return (bVarH == b.BASELINE || bVarH == b.CENTER_X || bVarH == b.CENTER_Y) ? false : true;
            case 2:
            case 3:
                boolean z9 = bVarH == b.LEFT || bVarH == b.RIGHT;
                if (dVar.e() instanceof h) {
                    return z9 || bVarH == b.CENTER_X;
                }
                return z9;
            case 4:
            case 5:
                boolean z10 = bVarH == b.TOP || bVarH == b.BOTTOM;
                if (dVar.e() instanceof h) {
                    return z10 || bVarH == b.CENTER_Y;
                }
                return z10;
            case 6:
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new AssertionError(this.f50585c.name());
        }
    }

    public void l() {
        HashSet hashSet;
        d dVar = this.f50586d;
        if (dVar != null && (hashSet = dVar.f50583a) != null) {
            hashSet.remove(this);
        }
        this.f50586d = null;
        this.f50587e = 0;
        this.f50588f = -1;
    }

    public void m(c cVar) {
        i iVar = this.f50589g;
        if (iVar == null) {
            this.f50589g = new i(i.a.UNRESTRICTED, null);
        } else {
            iVar.d();
        }
    }

    public void n(int i10) {
        if (j()) {
            this.f50588f = i10;
        }
    }

    public String toString() {
        return this.f50584b.r() + ":" + this.f50585c.toString();
    }
}
