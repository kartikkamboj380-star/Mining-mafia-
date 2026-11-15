package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.gms.common.api.Api;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.p implements RecyclerView.z.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    f[] f10541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    i f10542c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    i f10543d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f10544e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f10545f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final androidx.recyclerview.widget.f f10546g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private BitSet f10549j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f10554o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f10555p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private e f10556q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f10557r;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int[] f10562w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f10540a = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    boolean f10547h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    boolean f10548i = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    int f10550k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f10551l = LinearLayoutManager.INVALID_OFFSET;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    d f10552m = new d();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f10553n = 2;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Rect f10558s = new Rect();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final b f10559t = new b();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f10560u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f10561v = true;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final Runnable f10563x = new a();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.q();
        }
    }

    class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f10565a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f10566b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f10567c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f10568d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f10569e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int[] f10570f;

        b() {
            c();
        }

        void a() {
            this.f10566b = this.f10567c ? StaggeredGridLayoutManager.this.f10542c.i() : StaggeredGridLayoutManager.this.f10542c.n();
        }

        void b(int i10) {
            if (this.f10567c) {
                this.f10566b = StaggeredGridLayoutManager.this.f10542c.i() - i10;
            } else {
                this.f10566b = StaggeredGridLayoutManager.this.f10542c.n() + i10;
            }
        }

        void c() {
            this.f10565a = -1;
            this.f10566b = LinearLayoutManager.INVALID_OFFSET;
            this.f10567c = false;
            this.f10568d = false;
            this.f10569e = false;
            int[] iArr = this.f10570f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        void d(f[] fVarArr) {
            int length = fVarArr.length;
            int[] iArr = this.f10570f;
            if (iArr == null || iArr.length < length) {
                this.f10570f = new int[StaggeredGridLayoutManager.this.f10541b.length];
            }
            for (int i10 = 0; i10 < length; i10++) {
                this.f10570f[i10] = fVarArr[i10].p(LinearLayoutManager.INVALID_OFFSET);
            }
        }
    }

    public static class c extends RecyclerView.q {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        f f10572e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f10573f;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public boolean e() {
            return this.f10573f;
        }

        public c(int i10, int i11) {
            super(i10, i11);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public static class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f10580a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f10581b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f10582c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int[] f10583d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f10584e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int[] f10585f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        List f10586g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f10587h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        boolean f10588i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        boolean f10589j;

        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public e createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public e[] newArray(int i10) {
                return new e[i10];
            }
        }

        public e() {
        }

        void a() {
            this.f10583d = null;
            this.f10582c = 0;
            this.f10580a = -1;
            this.f10581b = -1;
        }

        void b() {
            this.f10583d = null;
            this.f10582c = 0;
            this.f10584e = 0;
            this.f10585f = null;
            this.f10586g = null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f10580a);
            parcel.writeInt(this.f10581b);
            parcel.writeInt(this.f10582c);
            if (this.f10582c > 0) {
                parcel.writeIntArray(this.f10583d);
            }
            parcel.writeInt(this.f10584e);
            if (this.f10584e > 0) {
                parcel.writeIntArray(this.f10585f);
            }
            parcel.writeInt(this.f10587h ? 1 : 0);
            parcel.writeInt(this.f10588i ? 1 : 0);
            parcel.writeInt(this.f10589j ? 1 : 0);
            parcel.writeList(this.f10586g);
        }

        e(Parcel parcel) {
            this.f10580a = parcel.readInt();
            this.f10581b = parcel.readInt();
            int i10 = parcel.readInt();
            this.f10582c = i10;
            if (i10 > 0) {
                int[] iArr = new int[i10];
                this.f10583d = iArr;
                parcel.readIntArray(iArr);
            }
            int i11 = parcel.readInt();
            this.f10584e = i11;
            if (i11 > 0) {
                int[] iArr2 = new int[i11];
                this.f10585f = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.f10587h = parcel.readInt() == 1;
            this.f10588i = parcel.readInt() == 1;
            this.f10589j = parcel.readInt() == 1;
            this.f10586g = parcel.readArrayList(d.a.class.getClassLoader());
        }

        public e(e eVar) {
            this.f10582c = eVar.f10582c;
            this.f10580a = eVar.f10580a;
            this.f10581b = eVar.f10581b;
            this.f10583d = eVar.f10583d;
            this.f10584e = eVar.f10584e;
            this.f10585f = eVar.f10585f;
            this.f10587h = eVar.f10587h;
            this.f10588i = eVar.f10588i;
            this.f10589j = eVar.f10589j;
            this.f10586g = eVar.f10586g;
        }
    }

    class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ArrayList f10590a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f10591b = LinearLayoutManager.INVALID_OFFSET;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f10592c = LinearLayoutManager.INVALID_OFFSET;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f10593d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final int f10594e;

        f(int i10) {
            this.f10594e = i10;
        }

        void a(View view) {
            c cVarN = n(view);
            cVarN.f10572e = this;
            this.f10590a.add(view);
            this.f10592c = LinearLayoutManager.INVALID_OFFSET;
            if (this.f10590a.size() == 1) {
                this.f10591b = LinearLayoutManager.INVALID_OFFSET;
            }
            if (cVarN.c() || cVarN.b()) {
                this.f10593d += StaggeredGridLayoutManager.this.f10542c.e(view);
            }
        }

        void b(boolean z9, int i10) {
            int iL = z9 ? l(LinearLayoutManager.INVALID_OFFSET) : p(LinearLayoutManager.INVALID_OFFSET);
            e();
            if (iL == Integer.MIN_VALUE) {
                return;
            }
            if (!z9 || iL >= StaggeredGridLayoutManager.this.f10542c.i()) {
                if (z9 || iL <= StaggeredGridLayoutManager.this.f10542c.n()) {
                    if (i10 != Integer.MIN_VALUE) {
                        iL += i10;
                    }
                    this.f10592c = iL;
                    this.f10591b = iL;
                }
            }
        }

        void c() {
            d.a aVarF;
            ArrayList arrayList = this.f10590a;
            View view = (View) arrayList.get(arrayList.size() - 1);
            c cVarN = n(view);
            this.f10592c = StaggeredGridLayoutManager.this.f10542c.d(view);
            if (cVarN.f10573f && (aVarF = StaggeredGridLayoutManager.this.f10552m.f(cVarN.a())) != null && aVarF.f10577b == 1) {
                this.f10592c += aVarF.a(this.f10594e);
            }
        }

        void d() {
            d.a aVarF;
            View view = (View) this.f10590a.get(0);
            c cVarN = n(view);
            this.f10591b = StaggeredGridLayoutManager.this.f10542c.g(view);
            if (cVarN.f10573f && (aVarF = StaggeredGridLayoutManager.this.f10552m.f(cVarN.a())) != null && aVarF.f10577b == -1) {
                this.f10591b -= aVarF.a(this.f10594e);
            }
        }

        void e() {
            this.f10590a.clear();
            q();
            this.f10593d = 0;
        }

        public int f() {
            return StaggeredGridLayoutManager.this.f10547h ? i(this.f10590a.size() - 1, -1, true) : i(0, this.f10590a.size(), true);
        }

        public int g() {
            return StaggeredGridLayoutManager.this.f10547h ? i(0, this.f10590a.size(), true) : i(this.f10590a.size() - 1, -1, true);
        }

        int h(int i10, int i11, boolean z9, boolean z10, boolean z11) {
            int iN = StaggeredGridLayoutManager.this.f10542c.n();
            int i12 = StaggeredGridLayoutManager.this.f10542c.i();
            int i13 = i11 > i10 ? 1 : -1;
            while (i10 != i11) {
                View view = (View) this.f10590a.get(i10);
                int iG = StaggeredGridLayoutManager.this.f10542c.g(view);
                int iD = StaggeredGridLayoutManager.this.f10542c.d(view);
                boolean z12 = false;
                boolean z13 = !z11 ? iG >= i12 : iG > i12;
                if (!z11 ? iD > iN : iD >= iN) {
                    z12 = true;
                }
                if (z13 && z12) {
                    if (z9 && z10) {
                        if (iG >= iN && iD <= i12) {
                            return StaggeredGridLayoutManager.this.getPosition(view);
                        }
                    } else {
                        if (z10) {
                            return StaggeredGridLayoutManager.this.getPosition(view);
                        }
                        if (iG < iN || iD > i12) {
                            return StaggeredGridLayoutManager.this.getPosition(view);
                        }
                    }
                }
                i10 += i13;
            }
            return -1;
        }

        int i(int i10, int i11, boolean z9) {
            return h(i10, i11, false, false, z9);
        }

        public int j() {
            return this.f10593d;
        }

        int k() {
            int i10 = this.f10592c;
            if (i10 != Integer.MIN_VALUE) {
                return i10;
            }
            c();
            return this.f10592c;
        }

        int l(int i10) {
            int i11 = this.f10592c;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            if (this.f10590a.size() == 0) {
                return i10;
            }
            c();
            return this.f10592c;
        }

        public View m(int i10, int i11) {
            View view = null;
            if (i11 != -1) {
                int size = this.f10590a.size() - 1;
                while (size >= 0) {
                    View view2 = (View) this.f10590a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f10547h && staggeredGridLayoutManager.getPosition(view2) >= i10) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f10547h && staggeredGridLayoutManager2.getPosition(view2) <= i10) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
                return view;
            }
            int size2 = this.f10590a.size();
            int i12 = 0;
            while (i12 < size2) {
                View view3 = (View) this.f10590a.get(i12);
                StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                if (staggeredGridLayoutManager3.f10547h && staggeredGridLayoutManager3.getPosition(view3) <= i10) {
                    break;
                }
                StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                if ((!staggeredGridLayoutManager4.f10547h && staggeredGridLayoutManager4.getPosition(view3) >= i10) || !view3.hasFocusable()) {
                    break;
                }
                i12++;
                view = view3;
            }
            return view;
        }

        c n(View view) {
            return (c) view.getLayoutParams();
        }

        int o() {
            int i10 = this.f10591b;
            if (i10 != Integer.MIN_VALUE) {
                return i10;
            }
            d();
            return this.f10591b;
        }

        int p(int i10) {
            int i11 = this.f10591b;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            if (this.f10590a.size() == 0) {
                return i10;
            }
            d();
            return this.f10591b;
        }

        void q() {
            this.f10591b = LinearLayoutManager.INVALID_OFFSET;
            this.f10592c = LinearLayoutManager.INVALID_OFFSET;
        }

        void r(int i10) {
            int i11 = this.f10591b;
            if (i11 != Integer.MIN_VALUE) {
                this.f10591b = i11 + i10;
            }
            int i12 = this.f10592c;
            if (i12 != Integer.MIN_VALUE) {
                this.f10592c = i12 + i10;
            }
        }

        void s() {
            int size = this.f10590a.size();
            View view = (View) this.f10590a.remove(size - 1);
            c cVarN = n(view);
            cVarN.f10572e = null;
            if (cVarN.c() || cVarN.b()) {
                this.f10593d -= StaggeredGridLayoutManager.this.f10542c.e(view);
            }
            if (size == 1) {
                this.f10591b = LinearLayoutManager.INVALID_OFFSET;
            }
            this.f10592c = LinearLayoutManager.INVALID_OFFSET;
        }

        void t() {
            View view = (View) this.f10590a.remove(0);
            c cVarN = n(view);
            cVarN.f10572e = null;
            if (this.f10590a.size() == 0) {
                this.f10592c = LinearLayoutManager.INVALID_OFFSET;
            }
            if (cVarN.c() || cVarN.b()) {
                this.f10593d -= StaggeredGridLayoutManager.this.f10542c.e(view);
            }
            this.f10591b = LinearLayoutManager.INVALID_OFFSET;
        }

        void u(View view) {
            c cVarN = n(view);
            cVarN.f10572e = this;
            this.f10590a.add(0, view);
            this.f10591b = LinearLayoutManager.INVALID_OFFSET;
            if (this.f10590a.size() == 1) {
                this.f10592c = LinearLayoutManager.INVALID_OFFSET;
            }
            if (cVarN.c() || cVarN.b()) {
                this.f10593d += StaggeredGridLayoutManager.this.f10542c.e(view);
            }
        }

        void v(int i10) {
            this.f10591b = i10;
            this.f10592c = i10;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        RecyclerView.p.d properties = RecyclerView.p.getProperties(context, attributeSet, i10, i11);
        setOrientation(properties.f10509a);
        c0(properties.f10510b);
        setReverseLayout(properties.f10511c);
        this.f10546g = new androidx.recyclerview.widget.f();
        x();
    }

    private int D(int i10) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            int position = getPosition(getChildAt(childCount));
            if (position >= 0 && position < i10) {
                return position;
            }
        }
        return 0;
    }

    private void E(RecyclerView.v vVar, RecyclerView.A a10, boolean z9) {
        int i10;
        int I9 = I(LinearLayoutManager.INVALID_OFFSET);
        if (I9 != Integer.MIN_VALUE && (i10 = this.f10542c.i() - I9) > 0) {
            int i11 = i10 - (-scrollBy(-i10, vVar, a10));
            if (!z9 || i11 <= 0) {
                return;
            }
            this.f10542c.s(i11);
        }
    }

    private void F(RecyclerView.v vVar, RecyclerView.A a10, boolean z9) {
        int iN;
        int iL = L(Api.BaseClientBuilder.API_PRIORITY_OTHER);
        if (iL != Integer.MAX_VALUE && (iN = iL - this.f10542c.n()) > 0) {
            int iScrollBy = iN - scrollBy(iN, vVar, a10);
            if (!z9 || iScrollBy <= 0) {
                return;
            }
            this.f10542c.s(-iScrollBy);
        }
    }

    private int I(int i10) {
        int iL = this.f10541b[0].l(i10);
        for (int i11 = 1; i11 < this.f10540a; i11++) {
            int iL2 = this.f10541b[i11].l(i10);
            if (iL2 > iL) {
                iL = iL2;
            }
        }
        return iL;
    }

    private int J(int i10) {
        int iP = this.f10541b[0].p(i10);
        for (int i11 = 1; i11 < this.f10540a; i11++) {
            int iP2 = this.f10541b[i11].p(i10);
            if (iP2 > iP) {
                iP = iP2;
            }
        }
        return iP;
    }

    private int K(int i10) {
        int iL = this.f10541b[0].l(i10);
        for (int i11 = 1; i11 < this.f10540a; i11++) {
            int iL2 = this.f10541b[i11].l(i10);
            if (iL2 < iL) {
                iL = iL2;
            }
        }
        return iL;
    }

    private int L(int i10) {
        int iP = this.f10541b[0].p(i10);
        for (int i11 = 1; i11 < this.f10540a; i11++) {
            int iP2 = this.f10541b[i11].p(i10);
            if (iP2 < iP) {
                iP = iP2;
            }
        }
        return iP;
    }

    private f M(androidx.recyclerview.widget.f fVar) {
        int i10;
        int i11;
        int i12;
        if (T(fVar.f10719e)) {
            i11 = this.f10540a - 1;
            i10 = -1;
            i12 = -1;
        } else {
            i10 = this.f10540a;
            i11 = 0;
            i12 = 1;
        }
        f fVar2 = null;
        if (fVar.f10719e == 1) {
            int iN = this.f10542c.n();
            int i13 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            while (i11 != i10) {
                f fVar3 = this.f10541b[i11];
                int iL = fVar3.l(iN);
                if (iL < i13) {
                    fVar2 = fVar3;
                    i13 = iL;
                }
                i11 += i12;
            }
            return fVar2;
        }
        int i14 = this.f10542c.i();
        int i15 = LinearLayoutManager.INVALID_OFFSET;
        while (i11 != i10) {
            f fVar4 = this.f10541b[i11];
            int iP = fVar4.p(i14);
            if (iP > i15) {
                fVar2 = fVar4;
                i15 = iP;
            }
            i11 += i12;
        }
        return fVar2;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0026  */
    /* JADX WARN: Code duplicated, block: B:17:0x0029 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x002c  */
    /* JADX WARN: Code duplicated, block: B:20:0x0037  */
    /* JADX WARN: Code duplicated, block: B:21:0x003d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0045  */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x004e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    private void N(int i10, int i11, int i12) {
        int i13;
        int i14;
        int iH;
        int iH2 = this.f10548i ? H() : G();
        if (i12 == 8) {
            if (i10 < i11) {
                i13 = i11 + 1;
            } else {
                i13 = i10 + 1;
                i14 = i11;
            }
            this.f10552m.h(i14);
            if (i12 != 1) {
                this.f10552m.j(i10, i11);
            } else if (i12 != 2) {
                this.f10552m.k(i10, i11);
            } else if (i12 == 8) {
                this.f10552m.k(i10, 1);
                this.f10552m.j(i11, 1);
            }
            if (i13 <= iH2) {
                return;
            }
            if (this.f10548i) {
                iH = G();
            } else {
                iH = H();
            }
            if (i14 <= iH) {
                requestLayout();
            }
        }
        i13 = i10 + i11;
        i14 = i10;
        this.f10552m.h(i14);
        if (i12 != 1) {
            this.f10552m.j(i10, i11);
        } else if (i12 != 2) {
            this.f10552m.k(i10, i11);
        } else if (i12 == 8) {
            this.f10552m.k(i10, 1);
            this.f10552m.j(i11, 1);
        }
        if (i13 <= iH2) {
            return;
        }
        if (this.f10548i) {
            iH = G();
        } else {
            iH = H();
        }
        if (i14 <= iH) {
            requestLayout();
        }
    }

    private void Q(View view, int i10, int i11, boolean z9) {
        calculateItemDecorationsForChild(view, this.f10558s);
        c cVar = (c) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
        Rect rect = this.f10558s;
        int iK0 = k0(i10, i12 + rect.left, ((ViewGroup.MarginLayoutParams) cVar).rightMargin + rect.right);
        int i13 = ((ViewGroup.MarginLayoutParams) cVar).topMargin;
        Rect rect2 = this.f10558s;
        int iK1 = k0(i11, i13 + rect2.top, ((ViewGroup.MarginLayoutParams) cVar).bottomMargin + rect2.bottom);
        if (z9 ? shouldReMeasureChild(view, iK0, iK1, cVar) : shouldMeasureChild(view, iK0, iK1, cVar)) {
            view.measure(iK0, iK1);
        }
    }

    private void R(View view, c cVar, boolean z9) {
        if (cVar.f10573f) {
            if (this.f10544e == 1) {
                Q(view, this.f10557r, RecyclerView.p.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom(), ((ViewGroup.MarginLayoutParams) cVar).height, true), z9);
                return;
            } else {
                Q(view, RecyclerView.p.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight(), ((ViewGroup.MarginLayoutParams) cVar).width, true), this.f10557r, z9);
                return;
            }
        }
        if (this.f10544e == 1) {
            Q(view, RecyclerView.p.getChildMeasureSpec(this.f10545f, getWidthMode(), 0, ((ViewGroup.MarginLayoutParams) cVar).width, false), RecyclerView.p.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom(), ((ViewGroup.MarginLayoutParams) cVar).height, true), z9);
        } else {
            Q(view, RecyclerView.p.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight(), ((ViewGroup.MarginLayoutParams) cVar).width, true), RecyclerView.p.getChildMeasureSpec(this.f10545f, getHeightMode(), 0, ((ViewGroup.MarginLayoutParams) cVar).height, false), z9);
        }
    }

    /* JADX WARN: Code duplicated, block: B:86:0x0155  */
    private void S(RecyclerView.v vVar, RecyclerView.A a10, boolean z9) {
        boolean z10;
        e eVar;
        b bVar = this.f10559t;
        if (!(this.f10556q == null && this.f10550k == -1) && a10.b() == 0) {
            removeAndRecycleAllViews(vVar);
            bVar.c();
            return;
        }
        boolean z11 = (bVar.f10569e && this.f10550k == -1 && this.f10556q == null) ? false : true;
        if (z11) {
            bVar.c();
            if (this.f10556q != null) {
                l(bVar);
            } else {
                a0();
                bVar.f10567c = this.f10548i;
            }
            g0(a10, bVar);
            bVar.f10569e = true;
        }
        if (this.f10556q == null && this.f10550k == -1 && (bVar.f10567c != this.f10554o || isLayoutRTL() != this.f10555p)) {
            this.f10552m.b();
            bVar.f10568d = true;
        }
        if (getChildCount() > 0 && ((eVar = this.f10556q) == null || eVar.f10582c < 1)) {
            if (bVar.f10568d) {
                for (int i10 = 0; i10 < this.f10540a; i10++) {
                    this.f10541b[i10].e();
                    int i11 = bVar.f10566b;
                    if (i11 != Integer.MIN_VALUE) {
                        this.f10541b[i10].v(i11);
                    }
                }
            } else if (z11 || this.f10559t.f10570f == null) {
                for (int i12 = 0; i12 < this.f10540a; i12++) {
                    this.f10541b[i12].b(this.f10548i, bVar.f10566b);
                }
                this.f10559t.d(this.f10541b);
            } else {
                for (int i13 = 0; i13 < this.f10540a; i13++) {
                    f fVar = this.f10541b[i13];
                    fVar.e();
                    fVar.v(this.f10559t.f10570f[i13]);
                }
            }
        }
        detachAndScrapAttachedViews(vVar);
        this.f10546g.f10715a = false;
        this.f10560u = false;
        i0(this.f10543d.o());
        h0(bVar.f10565a, a10);
        if (bVar.f10567c) {
            b0(-1);
            y(vVar, this.f10546g, a10);
            b0(1);
            androidx.recyclerview.widget.f fVar2 = this.f10546g;
            fVar2.f10717c = bVar.f10565a + fVar2.f10718d;
            y(vVar, fVar2, a10);
        } else {
            b0(1);
            y(vVar, this.f10546g, a10);
            b0(-1);
            androidx.recyclerview.widget.f fVar3 = this.f10546g;
            fVar3.f10717c = bVar.f10565a + fVar3.f10718d;
            y(vVar, fVar3, a10);
        }
        Z();
        if (getChildCount() > 0) {
            if (this.f10548i) {
                E(vVar, a10, true);
                F(vVar, a10, false);
            } else {
                F(vVar, a10, true);
                E(vVar, a10, false);
            }
        }
        if (z9 && !a10.e() && this.f10553n != 0 && getChildCount() > 0 && (this.f10560u || O() != null)) {
            removeCallbacks(this.f10563x);
            z10 = q();
        }
        if (a10.e()) {
            this.f10559t.c();
        }
        this.f10554o = bVar.f10567c;
        this.f10555p = isLayoutRTL();
        if (z10) {
            this.f10559t.c();
            S(vVar, a10, false);
        }
    }

    private boolean T(int i10) {
        if (this.f10544e == 0) {
            return (i10 == -1) != this.f10548i;
        }
        return ((i10 == -1) == this.f10548i) == isLayoutRTL();
    }

    private void V(View view) {
        for (int i10 = this.f10540a - 1; i10 >= 0; i10--) {
            this.f10541b[i10].u(view);
        }
    }

    private void W(RecyclerView.v vVar, androidx.recyclerview.widget.f fVar) {
        int iMin;
        if (!fVar.f10715a || fVar.f10723i) {
            return;
        }
        if (fVar.f10716b == 0) {
            if (fVar.f10719e == -1) {
                X(vVar, fVar.f10721g);
                return;
            } else {
                Y(vVar, fVar.f10720f);
                return;
            }
        }
        if (fVar.f10719e == -1) {
            int i10 = fVar.f10720f;
            int iJ = i10 - J(i10);
            X(vVar, iJ < 0 ? fVar.f10721g : fVar.f10721g - Math.min(iJ, fVar.f10716b));
        } else {
            int iK = K(fVar.f10721g) - fVar.f10721g;
            if (iK < 0) {
                iMin = fVar.f10720f;
            } else {
                iMin = Math.min(iK, fVar.f10716b) + fVar.f10720f;
            }
            Y(vVar, iMin);
        }
    }

    private void X(RecyclerView.v vVar, int i10) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (this.f10542c.g(childAt) < i10 || this.f10542c.r(childAt) < i10) {
                return;
            }
            c cVar = (c) childAt.getLayoutParams();
            if (cVar.f10573f) {
                for (int i11 = 0; i11 < this.f10540a; i11++) {
                    if (this.f10541b[i11].f10590a.size() == 1) {
                        return;
                    }
                }
                for (int i12 = 0; i12 < this.f10540a; i12++) {
                    this.f10541b[i12].s();
                }
            } else if (cVar.f10572e.f10590a.size() == 1) {
                return;
            } else {
                cVar.f10572e.s();
            }
            removeAndRecycleView(childAt, vVar);
        }
    }

    private void Y(RecyclerView.v vVar, int i10) {
        while (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (this.f10542c.d(childAt) > i10 || this.f10542c.q(childAt) > i10) {
                return;
            }
            c cVar = (c) childAt.getLayoutParams();
            if (cVar.f10573f) {
                for (int i11 = 0; i11 < this.f10540a; i11++) {
                    if (this.f10541b[i11].f10590a.size() == 1) {
                        return;
                    }
                }
                for (int i12 = 0; i12 < this.f10540a; i12++) {
                    this.f10541b[i12].t();
                }
            } else if (cVar.f10572e.f10590a.size() == 1) {
                return;
            } else {
                cVar.f10572e.t();
            }
            removeAndRecycleView(childAt, vVar);
        }
    }

    private void Z() {
        if (this.f10543d.l() == 1073741824) {
            return;
        }
        int childCount = getChildCount();
        float fMax = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            float fE = this.f10543d.e(childAt);
            if (fE >= fMax) {
                if (((c) childAt.getLayoutParams()).e()) {
                    fE = (fE * 1.0f) / this.f10540a;
                }
                fMax = Math.max(fMax, fE);
            }
        }
        int i11 = this.f10545f;
        int iRound = Math.round(fMax * this.f10540a);
        if (this.f10543d.l() == Integer.MIN_VALUE) {
            iRound = Math.min(iRound, this.f10543d.o());
        }
        i0(iRound);
        if (this.f10545f == i11) {
            return;
        }
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt2 = getChildAt(i12);
            c cVar = (c) childAt2.getLayoutParams();
            if (!cVar.f10573f) {
                if (isLayoutRTL() && this.f10544e == 1) {
                    int i13 = this.f10540a;
                    int i14 = cVar.f10572e.f10594e;
                    childAt2.offsetLeftAndRight(((-((i13 - 1) - i14)) * this.f10545f) - ((-((i13 - 1) - i14)) * i11));
                } else {
                    int i15 = cVar.f10572e.f10594e;
                    int i16 = this.f10545f * i15;
                    int i17 = i15 * i11;
                    if (this.f10544e == 1) {
                        childAt2.offsetLeftAndRight(i16 - i17);
                    } else {
                        childAt2.offsetTopAndBottom(i16 - i17);
                    }
                }
            }
        }
    }

    private void a0() {
        if (this.f10544e == 1 || !isLayoutRTL()) {
            this.f10548i = this.f10547h;
        } else {
            this.f10548i = !this.f10547h;
        }
    }

    private void b0(int i10) {
        androidx.recyclerview.widget.f fVar = this.f10546g;
        fVar.f10719e = i10;
        fVar.f10718d = this.f10548i != (i10 == -1) ? -1 : 1;
    }

    private int convertFocusDirectionToLayoutDirection(int i10) {
        if (i10 == 1) {
            return (this.f10544e != 1 && isLayoutRTL()) ? 1 : -1;
        }
        if (i10 == 2) {
            return (this.f10544e != 1 && isLayoutRTL()) ? -1 : 1;
        }
        if (i10 == 17) {
            if (this.f10544e == 0) {
                return -1;
            }
            return LinearLayoutManager.INVALID_OFFSET;
        }
        if (i10 == 33) {
            if (this.f10544e == 1) {
                return -1;
            }
            return LinearLayoutManager.INVALID_OFFSET;
        }
        if (i10 == 66) {
            if (this.f10544e == 0) {
                return 1;
            }
            return LinearLayoutManager.INVALID_OFFSET;
        }
        if (i10 == 130 && this.f10544e == 1) {
            return 1;
        }
        return LinearLayoutManager.INVALID_OFFSET;
    }

    private void d0(int i10, int i11) {
        for (int i12 = 0; i12 < this.f10540a; i12++) {
            if (!this.f10541b[i12].f10590a.isEmpty()) {
                j0(this.f10541b[i12], i10, i11);
            }
        }
    }

    private boolean e0(RecyclerView.A a10, b bVar) {
        bVar.f10565a = this.f10554o ? D(a10.b()) : z(a10.b());
        bVar.f10566b = LinearLayoutManager.INVALID_OFFSET;
        return true;
    }

    private void h0(int i10, RecyclerView.A a10) {
        int iO;
        int iO2;
        int iC;
        androidx.recyclerview.widget.f fVar = this.f10546g;
        boolean z9 = false;
        fVar.f10716b = 0;
        fVar.f10717c = i10;
        if (!isSmoothScrolling() || (iC = a10.c()) == -1) {
            iO = 0;
            iO2 = 0;
        } else {
            if (this.f10548i == (iC < i10)) {
                iO = this.f10542c.o();
                iO2 = 0;
            } else {
                iO2 = this.f10542c.o();
                iO = 0;
            }
        }
        if (getClipToPadding()) {
            this.f10546g.f10720f = this.f10542c.n() - iO2;
            this.f10546g.f10721g = this.f10542c.i() + iO;
        } else {
            this.f10546g.f10721g = this.f10542c.h() + iO;
            this.f10546g.f10720f = -iO2;
        }
        androidx.recyclerview.widget.f fVar2 = this.f10546g;
        fVar2.f10722h = false;
        fVar2.f10715a = true;
        if (this.f10542c.l() == 0 && this.f10542c.h() == 0) {
            z9 = true;
        }
        fVar2.f10723i = z9;
    }

    private void j0(f fVar, int i10, int i11) {
        int iJ = fVar.j();
        if (i10 == -1) {
            if (fVar.o() + iJ <= i11) {
                this.f10549j.set(fVar.f10594e, false);
            }
        } else if (fVar.k() - iJ >= i11) {
            this.f10549j.set(fVar.f10594e, false);
        }
    }

    private void k(View view) {
        for (int i10 = this.f10540a - 1; i10 >= 0; i10--) {
            this.f10541b[i10].a(view);
        }
    }

    private int k0(int i10, int i11, int i12) {
        int mode;
        return (!(i11 == 0 && i12 == 0) && ((mode = View.MeasureSpec.getMode(i10)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i10) - i11) - i12), mode) : i10;
    }

    private void l(b bVar) {
        e eVar = this.f10556q;
        int i10 = eVar.f10582c;
        if (i10 > 0) {
            if (i10 == this.f10540a) {
                for (int i11 = 0; i11 < this.f10540a; i11++) {
                    this.f10541b[i11].e();
                    e eVar2 = this.f10556q;
                    int i12 = eVar2.f10583d[i11];
                    if (i12 != Integer.MIN_VALUE) {
                        i12 += eVar2.f10588i ? this.f10542c.i() : this.f10542c.n();
                    }
                    this.f10541b[i11].v(i12);
                }
            } else {
                eVar.b();
                e eVar3 = this.f10556q;
                eVar3.f10580a = eVar3.f10581b;
            }
        }
        e eVar4 = this.f10556q;
        this.f10555p = eVar4.f10589j;
        setReverseLayout(eVar4.f10587h);
        a0();
        e eVar5 = this.f10556q;
        int i13 = eVar5.f10580a;
        if (i13 != -1) {
            this.f10550k = i13;
            bVar.f10567c = eVar5.f10588i;
        } else {
            bVar.f10567c = this.f10548i;
        }
        if (eVar5.f10584e > 1) {
            d dVar = this.f10552m;
            dVar.f10574a = eVar5.f10585f;
            dVar.f10575b = eVar5.f10586g;
        }
    }

    private void o(View view, c cVar, androidx.recyclerview.widget.f fVar) {
        if (fVar.f10719e == 1) {
            if (cVar.f10573f) {
                k(view);
                return;
            } else {
                cVar.f10572e.a(view);
                return;
            }
        }
        if (cVar.f10573f) {
            V(view);
        } else {
            cVar.f10572e.u(view);
        }
    }

    private int p(int i10) {
        if (getChildCount() == 0) {
            return this.f10548i ? 1 : -1;
        }
        return (i10 < G()) != this.f10548i ? -1 : 1;
    }

    private boolean r(f fVar) {
        boolean z9;
        if (!this.f10548i) {
            if (fVar.o() > this.f10542c.n()) {
                z9 = fVar.n((View) fVar.f10590a.get(0)).f10573f;
                return !z9;
            }
            return false;
        }
        if (fVar.k() < this.f10542c.i()) {
            ArrayList arrayList = fVar.f10590a;
            z9 = fVar.n((View) arrayList.get(arrayList.size() - 1)).f10573f;
            return !z9;
        }
        return false;
    }

    private int s(RecyclerView.A a10) {
        if (getChildCount() == 0) {
            return 0;
        }
        return l.a(a10, this.f10542c, B(!this.f10561v), A(!this.f10561v), this, this.f10561v);
    }

    private int t(RecyclerView.A a10) {
        if (getChildCount() == 0) {
            return 0;
        }
        return l.b(a10, this.f10542c, B(!this.f10561v), A(!this.f10561v), this, this.f10561v, this.f10548i);
    }

    private int u(RecyclerView.A a10) {
        if (getChildCount() == 0) {
            return 0;
        }
        return l.c(a10, this.f10542c, B(!this.f10561v), A(!this.f10561v), this, this.f10561v);
    }

    private d.a v(int i10) {
        d.a aVar = new d.a();
        aVar.f10578c = new int[this.f10540a];
        for (int i11 = 0; i11 < this.f10540a; i11++) {
            aVar.f10578c[i11] = i10 - this.f10541b[i11].l(i10);
        }
        return aVar;
    }

    private d.a w(int i10) {
        d.a aVar = new d.a();
        aVar.f10578c = new int[this.f10540a];
        for (int i11 = 0; i11 < this.f10540a; i11++) {
            aVar.f10578c[i11] = this.f10541b[i11].p(i10) - i10;
        }
        return aVar;
    }

    private void x() {
        this.f10542c = i.b(this, this.f10544e);
        this.f10543d = i.b(this, 1 - this.f10544e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.recyclerview.widget.RecyclerView$p, androidx.recyclerview.widget.StaggeredGridLayoutManager] */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.recyclerview.widget.StaggeredGridLayoutManager] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v5 */
    private int y(RecyclerView.v vVar, androidx.recyclerview.widget.f fVar, RecyclerView.A a10) {
        int i10;
        int I9;
        f fVarM;
        int iL;
        int iE;
        int iN;
        int iE2;
        ?? r10;
        StaggeredGridLayoutManager staggeredGridLayoutManager = this;
        ?? r11 = 0;
        staggeredGridLayoutManager.f10549j.set(0, staggeredGridLayoutManager.f10540a, true);
        if (staggeredGridLayoutManager.f10546g.f10723i) {
            i10 = fVar.f10719e == 1 ? Api.BaseClientBuilder.API_PRIORITY_OTHER : LinearLayoutManager.INVALID_OFFSET;
        } else {
            i10 = fVar.f10719e == 1 ? fVar.f10721g + fVar.f10716b : fVar.f10720f - fVar.f10716b;
        }
        int i11 = i10;
        staggeredGridLayoutManager.d0(fVar.f10719e, i11);
        int i12 = staggeredGridLayoutManager.f10548i ? staggeredGridLayoutManager.f10542c.i() : staggeredGridLayoutManager.f10542c.n();
        boolean z9 = false;
        ?? r12 = staggeredGridLayoutManager;
        while (fVar.a(a10) && (r12.f10546g.f10723i || !r12.f10549j.isEmpty())) {
            View viewB = fVar.b(vVar);
            c cVar = (c) viewB.getLayoutParams();
            int iA = cVar.a();
            int iG = r12.f10552m.g(iA);
            ?? r13 = iG == -1 ? 1 : r11;
            if (r13 != 0) {
                fVarM = cVar.f10573f ? r12.f10541b[r11] : r12.M(fVar);
                r12.f10552m.n(iA, fVarM);
            } else {
                fVarM = r12.f10541b[iG];
            }
            f fVar2 = fVarM;
            cVar.f10572e = fVar2;
            if (fVar.f10719e == 1) {
                r12.addView(viewB);
            } else {
                r12.addView(viewB, r11);
            }
            r12.R(viewB, cVar, r11);
            if (fVar.f10719e == 1) {
                iE = cVar.f10573f ? r12.I(i12) : fVar2.l(i12);
                iL = r12.f10542c.e(viewB) + iE;
                if (r13 != 0 && cVar.f10573f) {
                    d.a aVarV = r12.v(iE);
                    aVarV.f10577b = -1;
                    aVarV.f10576a = iA;
                    r12.f10552m.a(aVarV);
                }
            } else {
                iL = cVar.f10573f ? r12.L(i12) : fVar2.p(i12);
                iE = iL - r12.f10542c.e(viewB);
                if (r13 != 0 && cVar.f10573f) {
                    d.a aVarW = r12.w(iL);
                    aVarW.f10577b = 1;
                    aVarW.f10576a = iA;
                    r12.f10552m.a(aVarW);
                }
            }
            if (cVar.f10573f && fVar.f10718d == -1) {
                if (r13 != 0) {
                    r12.f10560u = true;
                } else {
                    if (!(fVar.f10719e == 1 ? r12.m() : r12.n())) {
                        d.a aVarF = r12.f10552m.f(iA);
                        if (aVarF != null) {
                            aVarF.f10579d = true;
                        }
                        r12.f10560u = true;
                    }
                }
            }
            r12.o(viewB, cVar, fVar);
            if (r12.isLayoutRTL() && r12.f10544e == 1) {
                iE2 = cVar.f10573f ? r12.f10543d.i() : r12.f10543d.i() - (((r12.f10540a - 1) - fVar2.f10594e) * r12.f10545f);
                iN = iE2 - r12.f10543d.e(viewB);
            } else {
                iN = cVar.f10573f ? r12.f10543d.n() : (fVar2.f10594e * r12.f10545f) + r12.f10543d.n();
                iE2 = r12.f10543d.e(viewB) + iN;
            }
            int i13 = iE2;
            int i14 = iN;
            if (r12.f10544e == 1) {
                r12.layoutDecoratedWithMargins(viewB, i14, iE, i13, iL);
                r10 = this;
            } else {
                r12.layoutDecoratedWithMargins(viewB, iE, i14, iL, i13);
                r10 = r12;
            }
            if (cVar.f10573f) {
                r10.d0(r10.f10546g.f10719e, i11);
            } else {
                r10.j0(fVar2, r10.f10546g.f10719e, i11);
            }
            r10.W(vVar, r10.f10546g);
            if (r10.f10546g.f10722h && viewB.hasFocusable()) {
                if (cVar.f10573f) {
                    r10.f10549j.clear();
                } else {
                    r10.f10549j.set(fVar2.f10594e, false);
                }
            }
            z9 = true;
            r11 = 0;
            r12 = r10;
        }
        if (!z9) {
            r12.W(vVar, r12.f10546g);
        }
        if (r12.f10546g.f10719e == -1) {
            I9 = r12.f10542c.n() - r12.L(r12.f10542c.n());
        } else {
            I9 = r12.I(r12.f10542c.i()) - r12.f10542c.i();
        }
        if (I9 > 0) {
            return Math.min(fVar.f10716b, I9);
        }
        return 0;
    }

    private int z(int i10) {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            int position = getPosition(getChildAt(i11));
            if (position >= 0 && position < i10) {
                return position;
            }
        }
        return 0;
    }

    View A(boolean z9) {
        int iN = this.f10542c.n();
        int i10 = this.f10542c.i();
        View view = null;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            int iG = this.f10542c.g(childAt);
            int iD = this.f10542c.d(childAt);
            if (iD > iN && iG < i10) {
                if (iD <= i10 || !z9) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    View B(boolean z9) {
        int iN = this.f10542c.n();
        int i10 = this.f10542c.i();
        int childCount = getChildCount();
        View view = null;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            int iG = this.f10542c.g(childAt);
            if (this.f10542c.d(childAt) > iN && iG < i10) {
                if (iG >= iN || !z9) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    int C() {
        View viewA = this.f10548i ? A(true) : B(true);
        if (viewA == null) {
            return -1;
        }
        return getPosition(viewA);
    }

    int G() {
        if (getChildCount() == 0) {
            return 0;
        }
        return getPosition(getChildAt(0));
    }

    int H() {
        int childCount = getChildCount();
        if (childCount == 0) {
            return 0;
        }
        return getPosition(getChildAt(childCount - 1));
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0063  */
    /* JADX WARN: Code duplicated, block: B:31:0x0072 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0075  */
    /* JADX WARN: Code duplicated, block: B:36:0x0084 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x0086  */
    /* JADX WARN: Code duplicated, block: B:39:0x0097  */
    /* JADX WARN: Code duplicated, block: B:40:0x0099  */
    /* JADX WARN: Code duplicated, block: B:42:0x009c  */
    /* JADX WARN: Code duplicated, block: B:43:0x009e  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x00a2 A[SYNTHETIC] */
    View O() {
        int i10;
        View childAt;
        int iG;
        int iG2;
        boolean z9;
        boolean z10;
        int iD;
        int iD2;
        int childCount = getChildCount();
        int i11 = childCount - 1;
        BitSet bitSet = new BitSet(this.f10540a);
        bitSet.set(0, this.f10540a, true);
        byte b10 = (this.f10544e == 1 && isLayoutRTL()) ? (byte) 1 : (byte) -1;
        if (this.f10548i) {
            childCount = -1;
        } else {
            i11 = 0;
        }
        int i12 = i11 < childCount ? 1 : -1;
        while (i11 != childCount) {
            View childAt2 = getChildAt(i11);
            c cVar = (c) childAt2.getLayoutParams();
            if (!bitSet.get(cVar.f10572e.f10594e)) {
                if (!cVar.f10573f && (i10 = i11 + i12) != childCount) {
                    childAt = getChildAt(i10);
                    if (this.f10548i) {
                        iD = this.f10542c.d(childAt2);
                        iD2 = this.f10542c.d(childAt);
                        if (iD >= iD2) {
                            if (iD == iD2) {
                                if (cVar.f10572e.f10594e - ((c) childAt.getLayoutParams()).f10572e.f10594e < 0) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                if (b10 < 0) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (z9 != z10) {
                                }
                            } else {
                                continue;
                            }
                        }
                    } else {
                        iG = this.f10542c.g(childAt2);
                        iG2 = this.f10542c.g(childAt);
                        if (iG <= iG2) {
                            if (iG == iG2) {
                                if (cVar.f10572e.f10594e - ((c) childAt.getLayoutParams()).f10572e.f10594e < 0) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                if (b10 < 0) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (z9 != z10) {
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
                i11 += i12;
            } else if (!r(cVar.f10572e)) {
                bitSet.clear(cVar.f10572e.f10594e);
                if (!cVar.f10573f) {
                    childAt = getChildAt(i10);
                    if (this.f10548i) {
                        iD = this.f10542c.d(childAt2);
                        iD2 = this.f10542c.d(childAt);
                        if (iD >= iD2) {
                            if (iD == iD2) {
                                if (cVar.f10572e.f10594e - ((c) childAt.getLayoutParams()).f10572e.f10594e < 0) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                if (b10 < 0) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (z9 != z10) {
                                }
                            } else {
                                continue;
                            }
                        }
                    } else {
                        iG = this.f10542c.g(childAt2);
                        iG2 = this.f10542c.g(childAt);
                        if (iG <= iG2) {
                            if (iG == iG2) {
                                if (cVar.f10572e.f10594e - ((c) childAt.getLayoutParams()).f10572e.f10594e < 0) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                if (b10 < 0) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (z9 != z10) {
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
                i11 += i12;
            }
            return childAt2;
        }
        return null;
    }

    public void P() {
        this.f10552m.b();
        requestLayout();
    }

    void U(int i10, RecyclerView.A a10) {
        int iG;
        int i11;
        if (i10 > 0) {
            iG = H();
            i11 = 1;
        } else {
            iG = G();
            i11 = -1;
        }
        this.f10546g.f10715a = true;
        h0(iG, a10);
        b0(i11);
        androidx.recyclerview.widget.f fVar = this.f10546g;
        fVar.f10717c = iG + fVar.f10718d;
        fVar.f10716b = Math.abs(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void assertNotInLayoutOrScroll(String str) {
        if (this.f10556q == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    public void c0(int i10) {
        assertNotInLayoutOrScroll(null);
        if (i10 != this.f10540a) {
            P();
            this.f10540a = i10;
            this.f10549j = new BitSet(this.f10540a);
            this.f10541b = new f[this.f10540a];
            for (int i11 = 0; i11 < this.f10540a; i11++) {
                this.f10541b[i11] = new f(i11);
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean canScrollHorizontally() {
        return this.f10544e == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean canScrollVertically() {
        return this.f10544e == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean checkLayoutParams(RecyclerView.q qVar) {
        return qVar instanceof c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void collectAdjacentPrefetchPositions(int i10, int i11, RecyclerView.A a10, RecyclerView.p.c cVar) {
        int iL;
        int iP;
        if (this.f10544e != 0) {
            i10 = i11;
        }
        if (getChildCount() == 0 || i10 == 0) {
            return;
        }
        U(i10, a10);
        int[] iArr = this.f10562w;
        if (iArr == null || iArr.length < this.f10540a) {
            this.f10562w = new int[this.f10540a];
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.f10540a; i13++) {
            androidx.recyclerview.widget.f fVar = this.f10546g;
            if (fVar.f10718d == -1) {
                iL = fVar.f10720f;
                iP = this.f10541b[i13].p(iL);
            } else {
                iL = this.f10541b[i13].l(fVar.f10721g);
                iP = this.f10546g.f10721g;
            }
            int i14 = iL - iP;
            if (i14 >= 0) {
                this.f10562w[i12] = i14;
                i12++;
            }
        }
        Arrays.sort(this.f10562w, 0, i12);
        for (int i15 = 0; i15 < i12 && this.f10546g.a(a10); i15++) {
            cVar.a(this.f10546g.f10717c, this.f10562w[i15]);
            androidx.recyclerview.widget.f fVar2 = this.f10546g;
            fVar2.f10717c += fVar2.f10718d;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int computeHorizontalScrollExtent(RecyclerView.A a10) {
        return s(a10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int computeHorizontalScrollOffset(RecyclerView.A a10) {
        return t(a10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int computeHorizontalScrollRange(RecyclerView.A a10) {
        return u(a10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z.b
    public PointF computeScrollVectorForPosition(int i10) {
        int iP = p(i10);
        PointF pointF = new PointF();
        if (iP == 0) {
            return null;
        }
        if (this.f10544e == 0) {
            pointF.x = iP;
            pointF.y = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            return pointF;
        }
        pointF.x = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        pointF.y = iP;
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int computeVerticalScrollExtent(RecyclerView.A a10) {
        return s(a10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int computeVerticalScrollOffset(RecyclerView.A a10) {
        return t(a10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int computeVerticalScrollRange(RecyclerView.A a10) {
        return u(a10);
    }

    boolean f0(RecyclerView.A a10, b bVar) {
        int i10;
        if (!a10.e() && (i10 = this.f10550k) != -1) {
            if (i10 >= 0 && i10 < a10.b()) {
                e eVar = this.f10556q;
                if (eVar == null || eVar.f10580a == -1 || eVar.f10582c < 1) {
                    View viewFindViewByPosition = findViewByPosition(this.f10550k);
                    if (viewFindViewByPosition != null) {
                        bVar.f10565a = this.f10548i ? H() : G();
                        if (this.f10551l != Integer.MIN_VALUE) {
                            if (bVar.f10567c) {
                                bVar.f10566b = (this.f10542c.i() - this.f10551l) - this.f10542c.d(viewFindViewByPosition);
                            } else {
                                bVar.f10566b = (this.f10542c.n() + this.f10551l) - this.f10542c.g(viewFindViewByPosition);
                            }
                            return true;
                        }
                        if (this.f10542c.e(viewFindViewByPosition) > this.f10542c.o()) {
                            bVar.f10566b = bVar.f10567c ? this.f10542c.i() : this.f10542c.n();
                            return true;
                        }
                        int iG = this.f10542c.g(viewFindViewByPosition) - this.f10542c.n();
                        if (iG < 0) {
                            bVar.f10566b = -iG;
                            return true;
                        }
                        int i11 = this.f10542c.i() - this.f10542c.d(viewFindViewByPosition);
                        if (i11 < 0) {
                            bVar.f10566b = i11;
                            return true;
                        }
                        bVar.f10566b = LinearLayoutManager.INVALID_OFFSET;
                    } else {
                        int i12 = this.f10550k;
                        bVar.f10565a = i12;
                        int i13 = this.f10551l;
                        if (i13 == Integer.MIN_VALUE) {
                            bVar.f10567c = p(i12) == 1;
                            bVar.a();
                        } else {
                            bVar.b(i13);
                        }
                        bVar.f10568d = true;
                    }
                } else {
                    bVar.f10566b = LinearLayoutManager.INVALID_OFFSET;
                    bVar.f10565a = this.f10550k;
                }
                return true;
            }
            this.f10550k = -1;
            this.f10551l = LinearLayoutManager.INVALID_OFFSET;
        }
        return false;
    }

    void g0(RecyclerView.A a10, b bVar) {
        if (f0(a10, bVar) || e0(a10, bVar)) {
            return;
        }
        bVar.a();
        bVar.f10565a = 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q generateDefaultLayoutParams() {
        return this.f10544e == 0 ? new c(-2, -1) : new c(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    void i0(int i10) {
        this.f10545f = i10 / this.f10540a;
        this.f10557r = View.MeasureSpec.makeMeasureSpec(i10, this.f10543d.l());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean isAutoMeasureEnabled() {
        return this.f10553n != 0;
    }

    boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    boolean m() {
        int iL = this.f10541b[0].l(LinearLayoutManager.INVALID_OFFSET);
        for (int i10 = 1; i10 < this.f10540a; i10++) {
            if (this.f10541b[i10].l(LinearLayoutManager.INVALID_OFFSET) != iL) {
                return false;
            }
        }
        return true;
    }

    boolean n() {
        int iP = this.f10541b[0].p(LinearLayoutManager.INVALID_OFFSET);
        for (int i10 = 1; i10 < this.f10540a; i10++) {
            if (this.f10541b[i10].p(LinearLayoutManager.INVALID_OFFSET) != iP) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void offsetChildrenHorizontal(int i10) {
        super.offsetChildrenHorizontal(i10);
        for (int i11 = 0; i11 < this.f10540a; i11++) {
            this.f10541b[i11].r(i10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void offsetChildrenVertical(int i10) {
        super.offsetChildrenVertical(i10);
        for (int i11 = 0; i11 < this.f10540a; i11++) {
            this.f10541b[i11].r(i10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onAdapterChanged(RecyclerView.h hVar, RecyclerView.h hVar2) {
        this.f10552m.b();
        for (int i10 = 0; i10 < this.f10540a; i10++) {
            this.f10541b[i10].e();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.v vVar) {
        super.onDetachedFromWindow(recyclerView, vVar);
        removeCallbacks(this.f10563x);
        for (int i10 = 0; i10 < this.f10540a; i10++) {
            this.f10541b[i10].e();
        }
        recyclerView.requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public View onFocusSearchFailed(View view, int i10, RecyclerView.v vVar, RecyclerView.A a10) {
        View viewFindContainingItemView;
        View viewM;
        if (getChildCount() == 0 || (viewFindContainingItemView = findContainingItemView(view)) == null) {
            return null;
        }
        a0();
        int iConvertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i10);
        if (iConvertFocusDirectionToLayoutDirection == Integer.MIN_VALUE) {
            return null;
        }
        c cVar = (c) viewFindContainingItemView.getLayoutParams();
        boolean z9 = cVar.f10573f;
        f fVar = cVar.f10572e;
        int iH = iConvertFocusDirectionToLayoutDirection == 1 ? H() : G();
        h0(iH, a10);
        b0(iConvertFocusDirectionToLayoutDirection);
        androidx.recyclerview.widget.f fVar2 = this.f10546g;
        fVar2.f10717c = fVar2.f10718d + iH;
        fVar2.f10716b = (int) (this.f10542c.o() * 0.33333334f);
        androidx.recyclerview.widget.f fVar3 = this.f10546g;
        fVar3.f10722h = true;
        fVar3.f10715a = false;
        y(vVar, fVar3, a10);
        this.f10554o = this.f10548i;
        if (!z9 && (viewM = fVar.m(iH, iConvertFocusDirectionToLayoutDirection)) != null && viewM != viewFindContainingItemView) {
            return viewM;
        }
        if (T(iConvertFocusDirectionToLayoutDirection)) {
            for (int i11 = this.f10540a - 1; i11 >= 0; i11--) {
                View viewM2 = this.f10541b[i11].m(iH, iConvertFocusDirectionToLayoutDirection);
                if (viewM2 != null && viewM2 != viewFindContainingItemView) {
                    return viewM2;
                }
            }
        } else {
            for (int i12 = 0; i12 < this.f10540a; i12++) {
                View viewM3 = this.f10541b[i12].m(iH, iConvertFocusDirectionToLayoutDirection);
                if (viewM3 != null && viewM3 != viewFindContainingItemView) {
                    return viewM3;
                }
            }
        }
        boolean z10 = (this.f10547h ^ true) == (iConvertFocusDirectionToLayoutDirection == -1);
        if (!z9) {
            View viewFindViewByPosition = findViewByPosition(z10 ? fVar.f() : fVar.g());
            if (viewFindViewByPosition != null && viewFindViewByPosition != viewFindContainingItemView) {
                return viewFindViewByPosition;
            }
        }
        if (T(iConvertFocusDirectionToLayoutDirection)) {
            for (int i13 = this.f10540a - 1; i13 >= 0; i13--) {
                if (i13 != fVar.f10594e) {
                    View viewFindViewByPosition2 = findViewByPosition(z10 ? this.f10541b[i13].f() : this.f10541b[i13].g());
                    if (viewFindViewByPosition2 != null && viewFindViewByPosition2 != viewFindContainingItemView) {
                        return viewFindViewByPosition2;
                    }
                }
            }
        } else {
            for (int i14 = 0; i14 < this.f10540a; i14++) {
                View viewFindViewByPosition3 = findViewByPosition(z10 ? this.f10541b[i14].f() : this.f10541b[i14].g());
                if (viewFindViewByPosition3 != null && viewFindViewByPosition3 != viewFindContainingItemView) {
                    return viewFindViewByPosition3;
                }
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            View viewB = B(false);
            View viewA = A(false);
            if (viewB == null || viewA == null) {
                return;
            }
            int position = getPosition(viewB);
            int position2 = getPosition(viewA);
            if (position < position2) {
                accessibilityEvent.setFromIndex(position);
                accessibilityEvent.setToIndex(position2);
            } else {
                accessibilityEvent.setFromIndex(position2);
                accessibilityEvent.setToIndex(position);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onItemsAdded(RecyclerView recyclerView, int i10, int i11) {
        N(i10, i11, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onItemsChanged(RecyclerView recyclerView) {
        this.f10552m.b();
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onItemsMoved(RecyclerView recyclerView, int i10, int i11, int i12) {
        N(i10, i11, 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onItemsRemoved(RecyclerView recyclerView, int i10, int i11) {
        N(i10, i11, 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onItemsUpdated(RecyclerView recyclerView, int i10, int i11, Object obj) {
        N(i10, i11, 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onLayoutChildren(RecyclerView.v vVar, RecyclerView.A a10) {
        S(vVar, a10, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onLayoutCompleted(RecyclerView.A a10) {
        super.onLayoutCompleted(a10);
        this.f10550k = -1;
        this.f10551l = LinearLayoutManager.INVALID_OFFSET;
        this.f10556q = null;
        this.f10559t.c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof e) {
            e eVar = (e) parcelable;
            this.f10556q = eVar;
            if (this.f10550k != -1) {
                eVar.a();
                this.f10556q.b();
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public Parcelable onSaveInstanceState() {
        int iP;
        int iN;
        int[] iArr;
        if (this.f10556q != null) {
            return new e(this.f10556q);
        }
        e eVar = new e();
        eVar.f10587h = this.f10547h;
        eVar.f10588i = this.f10554o;
        eVar.f10589j = this.f10555p;
        d dVar = this.f10552m;
        if (dVar == null || (iArr = dVar.f10574a) == null) {
            eVar.f10584e = 0;
        } else {
            eVar.f10585f = iArr;
            eVar.f10584e = iArr.length;
            eVar.f10586g = dVar.f10575b;
        }
        if (getChildCount() <= 0) {
            eVar.f10580a = -1;
            eVar.f10581b = -1;
            eVar.f10582c = 0;
            return eVar;
        }
        eVar.f10580a = this.f10554o ? H() : G();
        eVar.f10581b = C();
        int i10 = this.f10540a;
        eVar.f10582c = i10;
        eVar.f10583d = new int[i10];
        for (int i11 = 0; i11 < this.f10540a; i11++) {
            if (this.f10554o) {
                iP = this.f10541b[i11].l(LinearLayoutManager.INVALID_OFFSET);
                if (iP != Integer.MIN_VALUE) {
                    iN = this.f10542c.i();
                    iP -= iN;
                }
            } else {
                iP = this.f10541b[i11].p(LinearLayoutManager.INVALID_OFFSET);
                if (iP != Integer.MIN_VALUE) {
                    iN = this.f10542c.n();
                    iP -= iN;
                }
            }
            eVar.f10583d[i11] = iP;
        }
        return eVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onScrollStateChanged(int i10) {
        if (i10 == 0) {
            q();
        }
    }

    boolean q() {
        int iG;
        int iH;
        if (getChildCount() == 0 || this.f10553n == 0 || !isAttachedToWindow()) {
            return false;
        }
        if (this.f10548i) {
            iG = H();
            iH = G();
        } else {
            iG = G();
            iH = H();
        }
        if (iG == 0 && O() != null) {
            this.f10552m.b();
            requestSimpleAnimationsInNextLayout();
            requestLayout();
            return true;
        }
        if (!this.f10560u) {
            return false;
        }
        int i10 = this.f10548i ? -1 : 1;
        int i11 = iH + 1;
        d.a aVarE = this.f10552m.e(iG, i11, i10, true);
        if (aVarE == null) {
            this.f10560u = false;
            this.f10552m.d(i11);
            return false;
        }
        d.a aVarE2 = this.f10552m.e(iG, aVarE.f10576a, i10 * (-1), true);
        if (aVarE2 == null) {
            this.f10552m.d(aVarE.f10576a);
        } else {
            this.f10552m.d(aVarE2.f10576a + 1);
        }
        requestSimpleAnimationsInNextLayout();
        requestLayout();
        return true;
    }

    int scrollBy(int i10, RecyclerView.v vVar, RecyclerView.A a10) {
        if (getChildCount() == 0 || i10 == 0) {
            return 0;
        }
        U(i10, a10);
        int iY = y(vVar, this.f10546g, a10);
        if (this.f10546g.f10716b >= iY) {
            i10 = i10 < 0 ? -iY : iY;
        }
        this.f10542c.s(-i10);
        this.f10554o = this.f10548i;
        androidx.recyclerview.widget.f fVar = this.f10546g;
        fVar.f10716b = 0;
        W(vVar, fVar);
        return i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int scrollHorizontallyBy(int i10, RecyclerView.v vVar, RecyclerView.A a10) {
        return scrollBy(i10, vVar, a10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void scrollToPosition(int i10) {
        e eVar = this.f10556q;
        if (eVar != null && eVar.f10580a != i10) {
            eVar.a();
        }
        this.f10550k = i10;
        this.f10551l = LinearLayoutManager.INVALID_OFFSET;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int scrollVerticallyBy(int i10, RecyclerView.v vVar, RecyclerView.A a10) {
        return scrollBy(i10, vVar, a10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void setMeasuredDimension(Rect rect, int i10, int i11) {
        int iChooseSize;
        int iChooseSize2;
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.f10544e == 1) {
            iChooseSize2 = RecyclerView.p.chooseSize(i11, rect.height() + paddingTop, getMinimumHeight());
            iChooseSize = RecyclerView.p.chooseSize(i10, (this.f10545f * this.f10540a) + paddingLeft, getMinimumWidth());
        } else {
            iChooseSize = RecyclerView.p.chooseSize(i10, rect.width() + paddingLeft, getMinimumWidth());
            iChooseSize2 = RecyclerView.p.chooseSize(i11, (this.f10545f * this.f10540a) + paddingTop, getMinimumHeight());
        }
        setMeasuredDimension(iChooseSize, iChooseSize2);
    }

    public void setOrientation(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        assertNotInLayoutOrScroll(null);
        if (i10 == this.f10544e) {
            return;
        }
        this.f10544e = i10;
        i iVar = this.f10542c;
        this.f10542c = this.f10543d;
        this.f10543d = iVar;
        requestLayout();
    }

    public void setReverseLayout(boolean z9) {
        assertNotInLayoutOrScroll(null);
        e eVar = this.f10556q;
        if (eVar != null && eVar.f10587h != z9) {
            eVar.f10587h = z9;
        }
        this.f10547h = z9;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.A a10, int i10) {
        g gVar = new g(recyclerView.getContext());
        gVar.setTargetPosition(i10);
        startSmoothScroll(gVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean supportsPredictiveItemAnimations() {
        return this.f10556q == null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams);
    }

    static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int[] f10574a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        List f10575b;

        d() {
        }

        private int i(int i10) {
            if (this.f10575b == null) {
                return -1;
            }
            a aVarF = f(i10);
            if (aVarF != null) {
                this.f10575b.remove(aVarF);
            }
            int size = this.f10575b.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    i11 = -1;
                    break;
                }
                if (((a) this.f10575b.get(i11)).f10576a >= i10) {
                    break;
                }
                i11++;
            }
            if (i11 == -1) {
                return -1;
            }
            a aVar = (a) this.f10575b.get(i11);
            this.f10575b.remove(i11);
            return aVar.f10576a;
        }

        private void l(int i10, int i11) {
            List list = this.f10575b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = (a) this.f10575b.get(size);
                int i12 = aVar.f10576a;
                if (i12 >= i10) {
                    aVar.f10576a = i12 + i11;
                }
            }
        }

        private void m(int i10, int i11) {
            List list = this.f10575b;
            if (list == null) {
                return;
            }
            int i12 = i10 + i11;
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = (a) this.f10575b.get(size);
                int i13 = aVar.f10576a;
                if (i13 >= i10) {
                    if (i13 < i12) {
                        this.f10575b.remove(size);
                    } else {
                        aVar.f10576a = i13 - i11;
                    }
                }
            }
        }

        public void a(a aVar) {
            if (this.f10575b == null) {
                this.f10575b = new ArrayList();
            }
            int size = this.f10575b.size();
            for (int i10 = 0; i10 < size; i10++) {
                a aVar2 = (a) this.f10575b.get(i10);
                if (aVar2.f10576a == aVar.f10576a) {
                    this.f10575b.remove(i10);
                }
                if (aVar2.f10576a >= aVar.f10576a) {
                    this.f10575b.add(i10, aVar);
                    return;
                }
            }
            this.f10575b.add(aVar);
        }

        void b() {
            int[] iArr = this.f10574a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f10575b = null;
        }

        void c(int i10) {
            int[] iArr = this.f10574a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i10, 10) + 1];
                this.f10574a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i10 >= iArr.length) {
                int[] iArr3 = new int[o(i10)];
                this.f10574a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f10574a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        int d(int i10) {
            List list = this.f10575b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (((a) this.f10575b.get(size)).f10576a >= i10) {
                        this.f10575b.remove(size);
                    }
                }
            }
            return h(i10);
        }

        public a e(int i10, int i11, int i12, boolean z9) {
            List list = this.f10575b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                a aVar = (a) this.f10575b.get(i13);
                int i14 = aVar.f10576a;
                if (i14 >= i11) {
                    return null;
                }
                if (i14 >= i10 && (i12 == 0 || aVar.f10577b == i12 || (z9 && aVar.f10579d))) {
                    return aVar;
                }
            }
            return null;
        }

        public a f(int i10) {
            List list = this.f10575b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = (a) this.f10575b.get(size);
                if (aVar.f10576a == i10) {
                    return aVar;
                }
            }
            return null;
        }

        int g(int i10) {
            int[] iArr = this.f10574a;
            if (iArr == null || i10 >= iArr.length) {
                return -1;
            }
            return iArr[i10];
        }

        int h(int i10) {
            int[] iArr = this.f10574a;
            if (iArr == null || i10 >= iArr.length) {
                return -1;
            }
            int i11 = i(i10);
            if (i11 == -1) {
                int[] iArr2 = this.f10574a;
                Arrays.fill(iArr2, i10, iArr2.length, -1);
                return this.f10574a.length;
            }
            int iMin = Math.min(i11 + 1, this.f10574a.length);
            Arrays.fill(this.f10574a, i10, iMin, -1);
            return iMin;
        }

        void j(int i10, int i11) {
            int[] iArr = this.f10574a;
            if (iArr == null || i10 >= iArr.length) {
                return;
            }
            int i12 = i10 + i11;
            c(i12);
            int[] iArr2 = this.f10574a;
            System.arraycopy(iArr2, i10, iArr2, i12, (iArr2.length - i10) - i11);
            Arrays.fill(this.f10574a, i10, i12, -1);
            l(i10, i11);
        }

        void k(int i10, int i11) {
            int[] iArr = this.f10574a;
            if (iArr == null || i10 >= iArr.length) {
                return;
            }
            int i12 = i10 + i11;
            c(i12);
            int[] iArr2 = this.f10574a;
            System.arraycopy(iArr2, i12, iArr2, i10, (iArr2.length - i10) - i11);
            int[] iArr3 = this.f10574a;
            Arrays.fill(iArr3, iArr3.length - i11, iArr3.length, -1);
            m(i10, i11);
        }

        void n(int i10, f fVar) {
            c(i10);
            this.f10574a[i10] = fVar.f10594e;
        }

        int o(int i10) {
            int length = this.f10574a.length;
            while (length <= i10) {
                length *= 2;
            }
            return length;
        }

        static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C0165a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f10576a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f10577b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int[] f10578c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            boolean f10579d;

            /* JADX INFO: renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a, reason: collision with other inner class name */
            class C0165a implements Parcelable.Creator {
                C0165a() {
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public a createFromParcel(Parcel parcel) {
                    return new a(parcel);
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public a[] newArray(int i10) {
                    return new a[i10];
                }
            }

            a(Parcel parcel) {
                this.f10576a = parcel.readInt();
                this.f10577b = parcel.readInt();
                this.f10579d = parcel.readInt() == 1;
                int i10 = parcel.readInt();
                if (i10 > 0) {
                    int[] iArr = new int[i10];
                    this.f10578c = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            int a(int i10) {
                int[] iArr = this.f10578c;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i10];
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f10576a + ", mGapDir=" + this.f10577b + ", mHasUnwantedGapAfter=" + this.f10579d + ", mGapPerSpan=" + Arrays.toString(this.f10578c) + '}';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i10) {
                parcel.writeInt(this.f10576a);
                parcel.writeInt(this.f10577b);
                parcel.writeInt(this.f10579d ? 1 : 0);
                int[] iArr = this.f10578c;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.f10578c);
                }
            }

            a() {
            }
        }
    }
}
