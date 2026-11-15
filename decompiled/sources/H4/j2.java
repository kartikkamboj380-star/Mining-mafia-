package H4;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.protobuf.DescriptorProtos;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class j2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        int i10 = 0;
        int i11 = 0;
        boolean z9 = false;
        int i12 = 0;
        boolean z10 = false;
        boolean z11 = false;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        Bundle bundleCreateBundle = null;
        ArrayList<String> arrayListCreateStringList = null;
        String strCreateString = null;
        W1 w10 = null;
        Location location = null;
        String strCreateString2 = null;
        Bundle bundleCreateBundle2 = null;
        Bundle bundleCreateBundle3 = null;
        ArrayList<String> arrayListCreateStringList2 = null;
        String strCreateString3 = null;
        String strCreateString4 = null;
        Z z12 = null;
        String strCreateString5 = null;
        ArrayList<String> arrayListCreateStringList3 = null;
        String strCreateString6 = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 1:
                    i10 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 2:
                    j10 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 3:
                    bundleCreateBundle = SafeParcelReader.createBundle(parcel, header);
                    break;
                case 4:
                    i11 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 5:
                    arrayListCreateStringList = SafeParcelReader.createStringList(parcel, header);
                    break;
                case 6:
                    z9 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 7:
                    i12 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 8:
                    z10 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 9:
                    strCreateString = SafeParcelReader.createString(parcel, header);
                    break;
                case 10:
                    w10 = (W1) SafeParcelReader.createParcelable(parcel, header, W1.CREATOR);
                    break;
                case 11:
                    location = (Location) SafeParcelReader.createParcelable(parcel, header, Location.CREATOR);
                    break;
                case 12:
                    strCreateString2 = SafeParcelReader.createString(parcel, header);
                    break;
                case 13:
                    bundleCreateBundle2 = SafeParcelReader.createBundle(parcel, header);
                    break;
                case 14:
                    bundleCreateBundle3 = SafeParcelReader.createBundle(parcel, header);
                    break;
                case 15:
                    arrayListCreateStringList2 = SafeParcelReader.createStringList(parcel, header);
                    break;
                case 16:
                    strCreateString3 = SafeParcelReader.createString(parcel, header);
                    break;
                case 17:
                    strCreateString4 = SafeParcelReader.createString(parcel, header);
                    break;
                case 18:
                    z11 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 19:
                    z12 = (Z) SafeParcelReader.createParcelable(parcel, header, Z.CREATOR);
                    break;
                case 20:
                    i13 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 21:
                    strCreateString5 = SafeParcelReader.createString(parcel, header);
                    break;
                case 22:
                    arrayListCreateStringList3 = SafeParcelReader.createStringList(parcel, header);
                    break;
                case 23:
                    i14 = SafeParcelReader.readInt(parcel, header);
                    break;
                case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                    strCreateString6 = SafeParcelReader.createString(parcel, header);
                    break;
                case 25:
                    i15 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 26:
                    j11 = SafeParcelReader.readLong(parcel, header);
                    break;
                case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                    j12 = SafeParcelReader.readLong(parcel, header);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new h2(i10, j10, bundleCreateBundle, i11, arrayListCreateStringList, z9, i12, z10, strCreateString, w10, location, strCreateString2, bundleCreateBundle2, bundleCreateBundle3, arrayListCreateStringList2, strCreateString3, strCreateString4, z11, z12, i13, strCreateString5, arrayListCreateStringList3, i14, strCreateString6, i15, j11, j12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new h2[i10];
    }
}
