package A4;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p115l4.b;
import p115l4.c;

/* JADX INFO: loaded from: classes2.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: A4.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0003a extends b implements a {

        /* JADX INFO: renamed from: A4.a$a$a, reason: collision with other inner class name */
        public static class C0004a extends p115l4.a implements a {
            C0004a(IBinder iBinder) {
                super(iBinder);
            }

            @Override // A4.a
            public final Bundle n0(Bundle bundle) {
                Parcel parcelJ = J();
                c.b(parcelJ, bundle);
                Parcel parcelH0 = h0(parcelJ);
                Bundle bundle2 = (Bundle) c.a(parcelH0, Bundle.CREATOR);
                parcelH0.recycle();
                return bundle2;
            }
        }

        public static a J(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            return iInterfaceQueryLocalInterface instanceof a ? (a) iInterfaceQueryLocalInterface : new C0004a(iBinder);
        }
    }

    Bundle n0(Bundle bundle);
}
