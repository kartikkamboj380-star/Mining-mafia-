package H4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes2.dex */
public final class n2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i10 = 0;
        int i11 = 0;
        boolean z9 = false;
        int i12 = 0;
        int i13 = 0;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = false;
        String strCreateString = null;
        m2[] m2VarArr = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 2:
                    strCreateString = SafeParcelReader.createString(parcel, header);
                    break;
                case 3:
                    i10 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 4:
                    i11 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 5:
                    z9 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 6:
                    i12 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 7:
                    i13 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 8:
                    m2VarArr = (m2[]) SafeParcelReader.createTypedArray(parcel, header, m2.CREATOR);
                    break;
                case 9:
                    z10 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 10:
                    z11 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 11:
                    z12 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 12:
                    z13 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 13:
                    z14 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 14:
                    z15 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 15:
                    z16 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 16:
                    z17 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new m2(strCreateString, i10, i11, z9, i12, i13, m2VarArr, z10, z11, z12, z13, z14, z15, z16, z17);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new m2[i10];
    }
}
