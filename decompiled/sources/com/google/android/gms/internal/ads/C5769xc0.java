package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.xc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5769xc0 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C5769xc0> CREATOR = new C5895yc0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EnumC5391uc0[] f34947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f34948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f34949c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final EnumC5391uc0 f34950d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f34951e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f34952f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f34953g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f34954h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f34955i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f34956j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int[] f34957k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int[] f34958l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f34959m;

    public C5769xc0(int i10, int i11, int i12, int i13, String str, int i14, int i15) {
        EnumC5391uc0[] enumC5391uc0ArrValues = EnumC5391uc0.values();
        this.f34947a = enumC5391uc0ArrValues;
        int[] iArrA = AbstractC5517vc0.a();
        this.f34957k = iArrA;
        int[] iArrA2 = AbstractC5643wc0.a();
        this.f34958l = iArrA2;
        this.f34948b = null;
        this.f34949c = i10;
        this.f34950d = enumC5391uc0ArrValues[i10];
        this.f34951e = i11;
        this.f34952f = i12;
        this.f34953g = i13;
        this.f34954h = str;
        this.f34955i = i14;
        this.f34959m = iArrA[i14];
        this.f34956j = i15;
        int i16 = iArrA2[i15];
    }

    public static C5769xc0 a(EnumC5391uc0 enumC5391uc0, Context context) {
        if (enumC5391uc0 == EnumC5391uc0.Rewarded) {
            return new C5769xc0(context, enumC5391uc0, ((Integer) H4.B.c().d(AbstractC3892ii.f29899m7)).intValue(), ((Integer) H4.B.c().d(AbstractC3892ii.f29965s7)).intValue(), ((Integer) H4.B.c().d(AbstractC3892ii.f29987u7)).intValue(), (String) H4.B.c().d(AbstractC3892ii.f30009w7), (String) H4.B.c().d(AbstractC3892ii.f29921o7), (String) H4.B.c().d(AbstractC3892ii.f29943q7));
        }
        if (enumC5391uc0 == EnumC5391uc0.Interstitial) {
            return new C5769xc0(context, enumC5391uc0, ((Integer) H4.B.c().d(AbstractC3892ii.f29910n7)).intValue(), ((Integer) H4.B.c().d(AbstractC3892ii.f29976t7)).intValue(), ((Integer) H4.B.c().d(AbstractC3892ii.f29998v7)).intValue(), (String) H4.B.c().d(AbstractC3892ii.f30020x7), (String) H4.B.c().d(AbstractC3892ii.f29932p7), (String) H4.B.c().d(AbstractC3892ii.f29954r7));
        }
        if (enumC5391uc0 != EnumC5391uc0.AppOpen) {
            return null;
        }
        return new C5769xc0(context, enumC5391uc0, ((Integer) H4.B.c().d(AbstractC3892ii.f29507A7)).intValue(), ((Integer) H4.B.c().d(AbstractC3892ii.f29527C7)).intValue(), ((Integer) H4.B.c().d(AbstractC3892ii.f29537D7)).intValue(), (String) H4.B.c().d(AbstractC3892ii.f30031y7), (String) H4.B.c().d(AbstractC3892ii.f30041z7), (String) H4.B.c().d(AbstractC3892ii.f29517B7));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f34949c;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i11);
        SafeParcelWriter.writeInt(parcel, 2, this.f34951e);
        SafeParcelWriter.writeInt(parcel, 3, this.f34952f);
        SafeParcelWriter.writeInt(parcel, 4, this.f34953g);
        SafeParcelWriter.writeString(parcel, 5, this.f34954h, false);
        SafeParcelWriter.writeInt(parcel, 6, this.f34955i);
        SafeParcelWriter.writeInt(parcel, 7, this.f34956j);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    private C5769xc0(Context context, EnumC5391uc0 enumC5391uc0, int i10, int i11, int i12, String str, String str2, String str3) {
        this.f34947a = EnumC5391uc0.values();
        this.f34957k = AbstractC5517vc0.a();
        this.f34958l = AbstractC5643wc0.a();
        this.f34948b = context;
        this.f34949c = enumC5391uc0.ordinal();
        this.f34950d = enumC5391uc0;
        this.f34951e = i10;
        this.f34952f = i11;
        this.f34953g = i12;
        this.f34954h = str;
        int i13 = "oldest".equals(str2) ? 1 : (!"lru".equals(str2) && "lfu".equals(str2)) ? 3 : 2;
        this.f34959m = i13;
        this.f34955i = i13 - 1;
        this.f34956j = 0;
    }
}
