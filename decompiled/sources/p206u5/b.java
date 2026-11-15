package p206u5;

import H5.d;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.google.android.material.internal.m;
import java.util.Locale;
import p186s5.c;
import p186s5.h;
import p186s5.i;
import p186s5.j;
import p186s5.k;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f49944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f49945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final float f49946c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final float f49947d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final float f49948e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final float f49949f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final float f49950g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final float f49951h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final int f49952i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final int f49953j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    int f49954k;

    b(Context context, int i10, int i11, int i12, a aVar) {
        a aVar2 = new a();
        this.f49945b = aVar2;
        aVar = aVar == null ? new a() : aVar;
        if (i10 != 0) {
            aVar.f49970a = i10;
        }
        TypedArray typedArrayC = c(context, aVar.f49970a, i11, i12);
        Resources resources = context.getResources();
        this.f49946c = typedArrayC.getDimensionPixelSize(k.f48945K, -1);
        this.f49952i = context.getResources().getDimensionPixelSize(c.f48669R);
        this.f49953j = context.getResources().getDimensionPixelSize(c.f48671T);
        this.f49947d = typedArrayC.getDimensionPixelSize(k.f49035U, -1);
        this.f49948e = typedArrayC.getDimension(k.f49017S, resources.getDimension(c.f48712s));
        this.f49950g = typedArrayC.getDimension(k.f49062X, resources.getDimension(c.f48713t));
        this.f49949f = typedArrayC.getDimension(k.f48936J, resources.getDimension(c.f48712s));
        this.f49951h = typedArrayC.getDimension(k.f49026T, resources.getDimension(c.f48713t));
        boolean z9 = true;
        this.f49954k = typedArrayC.getInt(k.f49130e0, 1);
        aVar2.f49978i = aVar.f49978i == -2 ? 255 : aVar.f49978i;
        if (aVar.f49980k != -2) {
            aVar2.f49980k = aVar.f49980k;
        } else if (typedArrayC.hasValue(k.f49120d0)) {
            aVar2.f49980k = typedArrayC.getInt(k.f49120d0, 0);
        } else {
            aVar2.f49980k = -1;
        }
        if (aVar.f49979j != null) {
            aVar2.f49979j = aVar.f49979j;
        } else if (typedArrayC.hasValue(k.f48972N)) {
            aVar2.f49979j = typedArrayC.getString(k.f48972N);
        }
        aVar2.f49984w = aVar.f49984w;
        aVar2.f49955G = aVar.f49955G == null ? context.getString(i.f48814j) : aVar.f49955G;
        aVar2.f49956H = aVar.f49956H == 0 ? h.f48802a : aVar.f49956H;
        aVar2.f49957I = aVar.f49957I == 0 ? i.f48819o : aVar.f49957I;
        if (aVar.f49959K != null && !aVar.f49959K.booleanValue()) {
            z9 = false;
        }
        aVar2.f49959K = Boolean.valueOf(z9);
        aVar2.f49981l = aVar.f49981l == -2 ? typedArrayC.getInt(k.f49100b0, -2) : aVar.f49981l;
        aVar2.f49982m = aVar.f49982m == -2 ? typedArrayC.getInt(k.f49110c0, -2) : aVar.f49982m;
        aVar2.f49974e = Integer.valueOf(aVar.f49974e == null ? typedArrayC.getResourceId(k.f48954L, j.f48831a) : aVar.f49974e.intValue());
        aVar2.f49975f = Integer.valueOf(aVar.f49975f == null ? typedArrayC.getResourceId(k.f48963M, 0) : aVar.f49975f.intValue());
        aVar2.f49976g = Integer.valueOf(aVar.f49976g == null ? typedArrayC.getResourceId(k.f49044V, j.f48831a) : aVar.f49976g.intValue());
        aVar2.f49977h = Integer.valueOf(aVar.f49977h == null ? typedArrayC.getResourceId(k.f49053W, 0) : aVar.f49977h.intValue());
        aVar2.f49971b = Integer.valueOf(aVar.f49971b == null ? J(context, typedArrayC, k.f48918H) : aVar.f49971b.intValue());
        aVar2.f49973d = Integer.valueOf(aVar.f49973d == null ? typedArrayC.getResourceId(k.f48981O, j.f48833c) : aVar.f49973d.intValue());
        if (aVar.f49972c != null) {
            aVar2.f49972c = aVar.f49972c;
        } else if (typedArrayC.hasValue(k.f48990P)) {
            aVar2.f49972c = Integer.valueOf(J(context, typedArrayC, k.f48990P));
        } else {
            aVar2.f49972c = Integer.valueOf(new d(context, aVar2.f49973d.intValue()).i().getDefaultColor());
        }
        aVar2.f49958J = Integer.valueOf(aVar.f49958J == null ? typedArrayC.getInt(k.f48927I, 8388661) : aVar.f49958J.intValue());
        aVar2.f49960L = Integer.valueOf(aVar.f49960L == null ? typedArrayC.getDimensionPixelSize(k.f49008R, resources.getDimensionPixelSize(c.f48670S)) : aVar.f49960L.intValue());
        aVar2.f49961M = Integer.valueOf(aVar.f49961M == null ? typedArrayC.getDimensionPixelSize(k.f48999Q, resources.getDimensionPixelSize(c.f48714u)) : aVar.f49961M.intValue());
        aVar2.f49962N = Integer.valueOf(aVar.f49962N == null ? typedArrayC.getDimensionPixelOffset(k.f49071Y, 0) : aVar.f49962N.intValue());
        aVar2.f49963O = Integer.valueOf(aVar.f49963O == null ? typedArrayC.getDimensionPixelOffset(k.f49140f0, 0) : aVar.f49963O.intValue());
        aVar2.f49964P = Integer.valueOf(aVar.f49964P == null ? typedArrayC.getDimensionPixelOffset(k.f49080Z, aVar2.f49962N.intValue()) : aVar.f49964P.intValue());
        aVar2.f49965Q = Integer.valueOf(aVar.f49965Q == null ? typedArrayC.getDimensionPixelOffset(k.f49149g0, aVar2.f49963O.intValue()) : aVar.f49965Q.intValue());
        aVar2.f49968T = Integer.valueOf(aVar.f49968T == null ? typedArrayC.getDimensionPixelOffset(k.f49090a0, 0) : aVar.f49968T.intValue());
        aVar2.f49966R = Integer.valueOf(aVar.f49966R == null ? 0 : aVar.f49966R.intValue());
        aVar2.f49967S = Integer.valueOf(aVar.f49967S == null ? 0 : aVar.f49967S.intValue());
        aVar2.f49969U = Boolean.valueOf(aVar.f49969U == null ? typedArrayC.getBoolean(k.f48909G, false) : aVar.f49969U.booleanValue());
        typedArrayC.recycle();
        if (aVar.f49983v == null) {
            aVar2.f49983v = Locale.getDefault(Locale.Category.FORMAT);
        } else {
            aVar2.f49983v = aVar.f49983v;
        }
        this.f49944a = aVar;
    }

    private static int J(Context context, TypedArray typedArray, int i10) {
        return H5.c.a(context, typedArray, i10).getDefaultColor();
    }

    private TypedArray c(Context context, int i10, int i11, int i12) {
        AttributeSet attributeSetI;
        int styleAttribute;
        if (i10 != 0) {
            attributeSetI = B5.d.i(context, i10, "badge");
            styleAttribute = attributeSetI.getStyleAttribute();
        } else {
            attributeSetI = null;
            styleAttribute = 0;
        }
        return m.i(context, attributeSetI, k.f48900F, i11, styleAttribute == 0 ? i12 : styleAttribute, new int[0]);
    }

    a A() {
        return this.f49944a;
    }

    String B() {
        return this.f49945b.f49979j;
    }

    int C() {
        return this.f49945b.f49973d.intValue();
    }

    int D() {
        return this.f49945b.f49965Q.intValue();
    }

    int E() {
        return this.f49945b.f49963O.intValue();
    }

    boolean F() {
        return this.f49945b.f49980k != -1;
    }

    boolean G() {
        return this.f49945b.f49979j != null;
    }

    boolean H() {
        return this.f49945b.f49969U.booleanValue();
    }

    boolean I() {
        return this.f49945b.f49959K.booleanValue();
    }

    void K(int i10) {
        this.f49944a.f49978i = i10;
        this.f49945b.f49978i = i10;
    }

    void L(int i10) {
        this.f49944a.f49971b = Integer.valueOf(i10);
        this.f49945b.f49971b = Integer.valueOf(i10);
    }

    void M(int i10) {
        this.f49944a.f49972c = Integer.valueOf(i10);
        this.f49945b.f49972c = Integer.valueOf(i10);
    }

    void N(int i10) {
        this.f49944a.f49980k = i10;
        this.f49945b.f49980k = i10;
    }

    void O(String str) {
        this.f49944a.f49979j = str;
        this.f49945b.f49979j = str;
    }

    void P(boolean z9) {
        this.f49944a.f49959K = Boolean.valueOf(z9);
        this.f49945b.f49959K = Boolean.valueOf(z9);
    }

    void a() {
        N(-1);
    }

    void b() {
        O(null);
    }

    int d() {
        return this.f49945b.f49966R.intValue();
    }

    int e() {
        return this.f49945b.f49967S.intValue();
    }

    int f() {
        return this.f49945b.f49978i;
    }

    int g() {
        return this.f49945b.f49971b.intValue();
    }

    int h() {
        return this.f49945b.f49958J.intValue();
    }

    int i() {
        return this.f49945b.f49960L.intValue();
    }

    int j() {
        return this.f49945b.f49975f.intValue();
    }

    int k() {
        return this.f49945b.f49974e.intValue();
    }

    int l() {
        return this.f49945b.f49972c.intValue();
    }

    int m() {
        return this.f49945b.f49961M.intValue();
    }

    int n() {
        return this.f49945b.f49977h.intValue();
    }

    int o() {
        return this.f49945b.f49976g.intValue();
    }

    int p() {
        return this.f49945b.f49957I;
    }

    CharSequence q() {
        return this.f49945b.f49984w;
    }

    CharSequence r() {
        return this.f49945b.f49955G;
    }

    int s() {
        return this.f49945b.f49956H;
    }

    int t() {
        return this.f49945b.f49964P.intValue();
    }

    int u() {
        return this.f49945b.f49962N.intValue();
    }

    int v() {
        return this.f49945b.f49968T.intValue();
    }

    int w() {
        return this.f49945b.f49981l;
    }

    int x() {
        return this.f49945b.f49982m;
    }

    int y() {
        return this.f49945b.f49980k;
    }

    Locale z() {
        return this.f49945b.f49983v;
    }

    public static final class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C0545a();

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        private CharSequence f49955G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private int f49956H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        private int f49957I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        private Integer f49958J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        private Boolean f49959K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        private Integer f49960L;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        private Integer f49961M;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        private Integer f49962N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private Integer f49963O;

        /* JADX INFO: renamed from: P, reason: collision with root package name */
        private Integer f49964P;

        /* JADX INFO: renamed from: Q, reason: collision with root package name */
        private Integer f49965Q;

        /* JADX INFO: renamed from: R, reason: collision with root package name */
        private Integer f49966R;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        private Integer f49967S;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        private Integer f49968T;

        /* JADX INFO: renamed from: U, reason: collision with root package name */
        private Boolean f49969U;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f49970a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f49971b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Integer f49972c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Integer f49973d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Integer f49974e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Integer f49975f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Integer f49976g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Integer f49977h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f49978i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private String f49979j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f49980k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f49981l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f49982m;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private Locale f49983v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private CharSequence f49984w;

        /* JADX INFO: renamed from: u5.b$a$a, reason: collision with other inner class name */
        class C0545a implements Parcelable.Creator {
            C0545a() {
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

        public a() {
            this.f49978i = 255;
            this.f49980k = -2;
            this.f49981l = -2;
            this.f49982m = -2;
            this.f49959K = Boolean.TRUE;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f49970a);
            parcel.writeSerializable(this.f49971b);
            parcel.writeSerializable(this.f49972c);
            parcel.writeSerializable(this.f49973d);
            parcel.writeSerializable(this.f49974e);
            parcel.writeSerializable(this.f49975f);
            parcel.writeSerializable(this.f49976g);
            parcel.writeSerializable(this.f49977h);
            parcel.writeInt(this.f49978i);
            parcel.writeString(this.f49979j);
            parcel.writeInt(this.f49980k);
            parcel.writeInt(this.f49981l);
            parcel.writeInt(this.f49982m);
            CharSequence charSequence = this.f49984w;
            parcel.writeString(charSequence != null ? charSequence.toString() : null);
            CharSequence charSequence2 = this.f49955G;
            parcel.writeString(charSequence2 != null ? charSequence2.toString() : null);
            parcel.writeInt(this.f49956H);
            parcel.writeSerializable(this.f49958J);
            parcel.writeSerializable(this.f49960L);
            parcel.writeSerializable(this.f49961M);
            parcel.writeSerializable(this.f49962N);
            parcel.writeSerializable(this.f49963O);
            parcel.writeSerializable(this.f49964P);
            parcel.writeSerializable(this.f49965Q);
            parcel.writeSerializable(this.f49968T);
            parcel.writeSerializable(this.f49966R);
            parcel.writeSerializable(this.f49967S);
            parcel.writeSerializable(this.f49959K);
            parcel.writeSerializable(this.f49983v);
            parcel.writeSerializable(this.f49969U);
        }

        a(Parcel parcel) {
            this.f49978i = 255;
            this.f49980k = -2;
            this.f49981l = -2;
            this.f49982m = -2;
            this.f49959K = Boolean.TRUE;
            this.f49970a = parcel.readInt();
            this.f49971b = (Integer) parcel.readSerializable();
            this.f49972c = (Integer) parcel.readSerializable();
            this.f49973d = (Integer) parcel.readSerializable();
            this.f49974e = (Integer) parcel.readSerializable();
            this.f49975f = (Integer) parcel.readSerializable();
            this.f49976g = (Integer) parcel.readSerializable();
            this.f49977h = (Integer) parcel.readSerializable();
            this.f49978i = parcel.readInt();
            this.f49979j = parcel.readString();
            this.f49980k = parcel.readInt();
            this.f49981l = parcel.readInt();
            this.f49982m = parcel.readInt();
            this.f49984w = parcel.readString();
            this.f49955G = parcel.readString();
            this.f49956H = parcel.readInt();
            this.f49958J = (Integer) parcel.readSerializable();
            this.f49960L = (Integer) parcel.readSerializable();
            this.f49961M = (Integer) parcel.readSerializable();
            this.f49962N = (Integer) parcel.readSerializable();
            this.f49963O = (Integer) parcel.readSerializable();
            this.f49964P = (Integer) parcel.readSerializable();
            this.f49965Q = (Integer) parcel.readSerializable();
            this.f49968T = (Integer) parcel.readSerializable();
            this.f49966R = (Integer) parcel.readSerializable();
            this.f49967S = (Integer) parcel.readSerializable();
            this.f49959K = (Boolean) parcel.readSerializable();
            this.f49983v = (Locale) parcel.readSerializable();
            this.f49969U = (Boolean) parcel.readSerializable();
        }
    }
}
