package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C6559j implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String strCreateString = null;
        String strCreateString2 = null;
        v6 v6Var = null;
        String strCreateString3 = null;
        G g10 = null;
        G g11 = null;
        G g12 = null;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        boolean z9 = false;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 2:
                    strCreateString = SafeParcelReader.createString(parcel, header);
                    break;
                case 3:
                    strCreateString2 = SafeParcelReader.createString(parcel, header);
                    break;
                case 4:
                    v6Var = (v6) SafeParcelReader.createParcelable(parcel, header, v6.CREATOR);
                    break;
                case 5:
                    j10 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 6:
                    z9 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 7:
                    strCreateString3 = SafeParcelReader.createString(parcel, header);
                    break;
                case 8:
                    g10 = (G) SafeParcelReader.createParcelable(parcel, header, G.CREATOR);
                    break;
                case 9:
                    j11 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 10:
                    g11 = (G) SafeParcelReader.createParcelable(parcel, header, G.CREATOR);
                    break;
                case 11:
                    j12 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 12:
                    g12 = (G) SafeParcelReader.createParcelable(parcel, header, G.CREATOR);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new C6551i(strCreateString, strCreateString2, v6Var, j10, z9, strCreateString3, g10, j11, g11, j12, g12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C6551i[i10];
    }
}
