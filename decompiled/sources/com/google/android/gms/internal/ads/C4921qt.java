package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.qt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4921qt implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String strCreateString = null;
        String strCreateString2 = null;
        H4.m2 m2Var = null;
        H4.h2 h2Var = null;
        String strCreateString3 = null;
        int i10 = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 1:
                    strCreateString = SafeParcelReader.createString(parcel, header);
                    break;
                case 2:
                    strCreateString2 = SafeParcelReader.createString(parcel, header);
                    break;
                case 3:
                    m2Var = (H4.m2) SafeParcelReader.createParcelable(parcel, header, H4.m2.CREATOR);
                    break;
                case 4:
                    h2Var = (H4.h2) SafeParcelReader.createParcelable(parcel, header, H4.h2.CREATOR);
                    break;
                case 5:
                    i10 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 6:
                    strCreateString3 = SafeParcelReader.createString(parcel, header);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new C4795pt(strCreateString, strCreateString2, m2Var, h2Var, i10, strCreateString3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C4795pt[i10];
    }
}
