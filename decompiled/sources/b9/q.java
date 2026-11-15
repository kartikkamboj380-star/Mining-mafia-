package b9;

import android.os.Bundle;
import android.os.Parcel;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public abstract class q {

    public interface a {
        void a(Object obj);
    }

    public static int a(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj instanceof Double ? (int) ((Double) obj).doubleValue() : ((Integer) obj).intValue();
    }

    public static Bundle b(byte[] bArr) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArr, 0, bArr.length);
        parcelObtain.setDataPosition(0);
        Bundle bundle = parcelObtain.readBundle(q.class.getClassLoader());
        parcelObtain.recycle();
        Objects.requireNonNull(bundle);
        return bundle;
    }

    public static byte[] c(Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }

    public static long d(Object obj) {
        return obj instanceof Double ? (long) ((Double) obj).doubleValue() : ((Long) obj).longValue();
    }
}
