package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.li0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4270li0 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C4270li0> CREATOR = new C4396mi0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f31340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C4255lb f31341b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f31342c;

    C4270li0(int i10, byte[] bArr) {
        this.f31340a = i10;
        this.f31342c = bArr;
        zzb();
    }

    private final void zzb() {
        C4255lb c4255lb = this.f31341b;
        if (c4255lb != null || this.f31342c == null) {
            if (c4255lb == null || this.f31342c != null) {
                if (c4255lb != null && this.f31342c != null) {
                    throw new IllegalStateException("Invalid internal representation - full");
                }
                if (c4255lb != null || this.f31342c != null) {
                    throw new IllegalStateException("Impossible");
                }
                throw new IllegalStateException("Invalid internal representation - empty");
            }
        }
    }

    public final C4255lb a() {
        if (this.f31341b == null) {
            try {
                this.f31341b = C4255lb.f1(this.f31342c, HL0.a());
                this.f31342c = null;
            } catch (C3598gM0 | NullPointerException e10) {
                throw new IllegalStateException(e10);
            }
        }
        zzb();
        return this.f31341b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f31340a;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i11);
        byte[] bArrI = this.f31342c;
        if (bArrI == null) {
            bArrI = this.f31341b.i();
        }
        SafeParcelWriter.writeByteArray(parcel, 2, bArrI, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
