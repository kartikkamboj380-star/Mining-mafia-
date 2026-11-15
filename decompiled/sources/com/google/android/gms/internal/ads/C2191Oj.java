package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Oj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2191Oj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C2191Oj> CREATOR = new C2243Pj();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f21645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f21646c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f21647d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f21648e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final H4.a2 f21649f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f21650g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f21651h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f21652i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f21653j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f21654k;

    public C2191Oj(int i10, boolean z9, int i11, boolean z10, int i12, H4.a2 a2Var, boolean z11, int i13, int i14, boolean z12, int i15) {
        this.f21644a = i10;
        this.f21645b = z9;
        this.f21646c = i11;
        this.f21647d = z10;
        this.f21648e = i12;
        this.f21649f = a2Var;
        this.f21650g = z11;
        this.f21651h = i13;
        this.f21653j = z12;
        this.f21652i = i14;
        this.f21654k = i15;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002e  */
    public static com.google.android.gms.ads.nativead.c a(C2191Oj c2191Oj) {
        com.google.android.gms.ads.nativead.c.a aVar = new com.google.android.gms.ads.nativead.c.a();
        if (c2191Oj == null) {
            return aVar.a();
        }
        int i10 = c2191Oj.f21644a;
        int i11 = 2;
        if (i10 == 2) {
            aVar.c(c2191Oj.f21648e);
        } else {
            if (i10 != 3) {
                if (i10 == 4) {
                    aVar.e(c2191Oj.f21650g);
                    aVar.d(c2191Oj.f21651h);
                    aVar.b(c2191Oj.f21652i, c2191Oj.f21653j);
                    int i12 = c2191Oj.f21654k;
                    if (i12 == 0) {
                        i11 = 1;
                    } else if (i12 == 2) {
                        i11 = 3;
                    } else if (i12 != 1) {
                        i11 = 1;
                    }
                    aVar.q(i11);
                }
            }
            H4.a2 a2Var = c2191Oj.f21649f;
            if (a2Var != null) {
                aVar.h(new B4.x(a2Var));
            }
            aVar.c(c2191Oj.f21648e);
        }
        aVar.g(c2191Oj.f21645b);
        aVar.f(c2191Oj.f21647d);
        return aVar.a();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f21644a;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i11);
        SafeParcelWriter.writeBoolean(parcel, 2, this.f21645b);
        SafeParcelWriter.writeInt(parcel, 3, this.f21646c);
        SafeParcelWriter.writeBoolean(parcel, 4, this.f21647d);
        SafeParcelWriter.writeInt(parcel, 5, this.f21648e);
        SafeParcelWriter.writeParcelable(parcel, 6, this.f21649f, i10, false);
        SafeParcelWriter.writeBoolean(parcel, 7, this.f21650g);
        SafeParcelWriter.writeInt(parcel, 8, this.f21651h);
        SafeParcelWriter.writeInt(parcel, 9, this.f21652i);
        SafeParcelWriter.writeBoolean(parcel, 10, this.f21653j);
        SafeParcelWriter.writeInt(parcel, 11, this.f21654k);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public C2191Oj(E4.e eVar) {
        this(4, eVar.f(), eVar.b(), eVar.e(), eVar.a(), eVar.d() != null ? new H4.a2(eVar.d()) : null, eVar.g(), eVar.c(), 0, false, 0);
    }
}
